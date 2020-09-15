package APITest;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestClass {
	
	
	@Test
	
	public void Test_01()
	{
		
		
			when()
			.get("https://api.spacexdata.com/v4/launches/latest")
			.then()
			.statusCode(200)
			.log().all();
			
			
	}
	
	@Test
	
	public void Test_02()
	{
		
	   when()
			.get("https://api.spacexdata.com/v4/launches/latest").then()
			.assertThat().body("id",equalTo("5ef6a1e90059c33cee4a828a"));
			
		
	}
	
	@Test
	public void Test_03()
	{
	given()
	.when()
		.get("https://api.spacexdata.com/v4/launches/latest")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.header("Content-Type","application/json; charset=utf-8");


}


}
