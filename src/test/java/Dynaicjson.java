import com.google.gson.Gson;
import io.cucumber.java.hu.Ha;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Dynaicjson {


    @Test(dataProvider = "addbooktestdata")
    public void addBook(String isbn , String aisle){

        RestAssured.baseURI = "http://216.10.245.166";
        String response =  given().log().all().header("Content-Type","Application/json").
                body("{\n" +
                        "\n" +
                        "\"name\":\"Learn Appium Automation with Java\",\n" +
                        "\"isbn\":\""+isbn+"\",\n" +
                        "\"aisle\":\""+aisle+"\",\n" +
                        "\"author\":\"John foe\"\n" +
                        "}").when().post("/Library/Addbook.php").then().
                assertThat().log().all().statusCode(200).extract().response().asString();
        JsonPath jsonPath = new JsonPath(response);
        String Id = jsonPath.get("ID");
        System.out.println(Id);

//        Example ex = given().log().all().header("Content-Type","Application/json").expect().defaultParser(Parser.JSON)
//                .when().post("/Library/Addbook.php").as(Example.class);
RestAssured.baseURI = "www.google.com";
        Map map = new HashMap<>();
String Response = given().log().all().headers(map).body(map).auth().preemptive().basic("","").when().post("/nikhil").then().assertThat().log().all()
        .statusCode(404).extract().response().asPrettyString();
JsonPath path = new JsonPath(Response);
String ID = jsonPath.get("ID");
    
//        Gson gson = new Gson();
//        Staff staff = gson.fromJson(Response,Staff.class);
//        String str1 = gson.toJson(staff);
    }


    @DataProvider(name = "addbooktestdata")
    public Object[][] getdata(){

        return new Object[][] {{"qwer","9876"},{"hfgh","456987"},{"oiudrg","09834"}};
    }




}