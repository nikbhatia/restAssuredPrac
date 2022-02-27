import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.io.*;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Basics {

    public static void main(String[] args) throws IOException {

//        given().multiPart().body().header().pathParam().post().

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key","qaclick123").contentType("application/json").body(addPlace()).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
        .header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asPrettyString();

        System.out.println(response);

        JsonPath js = new JsonPath(response);
        String placeId = js.getString("place_id") ;
        System.out.println(placeId);
String address = "473, sector 15 sonepat";
        given().log().all().queryParam("key","qaclick123").contentType("application/json")
                .body("{ \"key\": \"qaclick123\", \"address\": \""+address+"\", \"place_id\": \""+placeId+"\" }").put("/maps/api/place/update/json").then().log().all();

       String getResponse =  given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeId).when().get("/maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().response().asString();
        JsonPath js1 = new JsonPath(getResponse);
        String actualAddress = js1.getString("address");
        Assert.assertEquals(actualAddress,address);

        Properties pro = new Properties();
        File file;
        FileInputStream fis = new FileInputStream("D:\\restassuredcourse\\src\\test\\java\\basetest.properties");
        pro.load(fis);
        System.out.println(pro.getProperty("baseUrl"));
        PrintStream ps = new PrintStream(new FileOutputStream("log.txt"));
        RequestSpecification req = new RequestSpecBuilder().setBaseUri(pro.getProperty("baseUrl")).addQueryParam("key","qaclic123")
                .addFilter(RequestLoggingFilter.logRequestTo(ps)).addFilter(ResponseLoggingFilter.logResponseTo(ps)).setContentType(ContentType.JSON).build();

        //given().spec(req).get()

    }

    public static String addPlace(){
        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";
    }
}
