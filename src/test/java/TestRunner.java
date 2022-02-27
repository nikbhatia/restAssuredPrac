import cucumber.api.CucumberOptions;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.Properties;

import static io.restassured.RestAssured.given;

@CucumberOptions(features = "src/test/features",glue = "src/test/StepDefination",monochrome = true,tags ="@apitest" )


public class TestRunner {

    public static void test() throws IOException {
        Properties pro = new Properties();
        File file;
        FileInputStream fis = new FileInputStream("D:\\restassuredcourse\\src\\test\\java\\basetest.properties");
        pro.load(fis);
        System.out.println(pro.getProperty("baseUrl"));
        PrintStream ps = new PrintStream(new FileOutputStream("log.txt"));
        RequestSpecification req = new RequestSpecBuilder().setBaseUri(pro.getProperty("baseUrl")).addQueryParam("key","qaclic123")
                .addFilter(RequestLoggingFilter.logRequestTo(ps)).addFilter(ResponseLoggingFilter.logResponseTo(ps)).setContentType(ContentType.JSON).build();

   // given().spec(req).get()

    }

    public static void main(String[] args) throws IOException {
        test();
    }
}
