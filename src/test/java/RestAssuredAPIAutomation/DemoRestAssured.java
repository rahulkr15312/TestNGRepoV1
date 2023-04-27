package RestAssuredAPIAutomation;

import org.json.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class DemoRestAssured {
	int id;
	
	//@Test(priority=1)
	
	void createUserUsingHashMap() 
	{
		
		Map<String,Object> myMap = new HashMap<String, Object>();
		
		myMap.put("first_name", "fyihyj");
		myMap.put("last_name","kjghkjbk");
		myMap.put("email", "cghgchch@census.gov");
		myMap.put("gender", "Female");
		myMap.put("ip_address", "26.58.194.2");
		
		Map<String, Object> myMap1 = new HashMap<String, Object>();
		
		Map<String,String> myMap2 = new HashMap<String, String>();
		
		myMap2.put("town", "Muz");
		
		myMap1.put("city", myMap2);
		myMap.put("Address", myMap1);
		
		
		given()
		 .contentType("application/json")
		 .body(myMap)
		
		.when()
		.post("http://localhost:3000/cust")
		
		
		
		.then()
		.statusCode(201)
		.log().all();
		
		
		
	}
	
	//@Test(priority=1)
	
		void createUserUsingJsonObject() 
		{
			
			JSONObject data= new JSONObject();
			
			data.put("first_name", "fyihyj");
			data.put("last_name","kjghkjbk");
			data.put("email", "cghgchch@census.gov");
			data.put("gender", "Female");
			data.put("ip_address", "26.58.194.2");
			
			JSONObject data1= new JSONObject();
			
			JSONObject data2= new JSONObject();
			
			data2.put("town", "Muz");
			
			data1.put("city", data2);
			data.put("Address", data1);
			
			
			given()
			 .contentType("application/json")
			 .body(data.toString())
			
			.when()
			.post("http://localhost:3000/cust")
			
			
			
			.then()
			.statusCode(201)
			.log().all();
			
			
			
		}
	
	//@Test(priority=2, dependsOnMethods= {"createUser"})
	void updateUser() {
   Map myMap = new HashMap();
		
		myMap.put("name", "Kumar");
		myMap.put("job", "SDE");
		id=given()
		 .contentType("application/json")
		 .body(myMap)
		
		.when()
		.post("https://reqres.in/api/users/"+id)
		.jsonPath().getInt("id");
		System.out.println("id in updateUser methode is "+id);
		
		
//		.then()
//		.statusCode(201)
//		.log().all();
	}
	
	//@Test(priority=3, dependsOnMethods= {"updateUser"})
	void deleteUser() {
		given()
		 
		
		.when()
		.delete("https://reqres.in/api/users/"+id)
		
		
		.then()
		.statusCode(204)
		.log().all();
	}
	
	//@Test(priority=3, dependsOnMethods= {"updateUser"})
	void updateMyUser() {
		given()
		 
		
		.when()
		.delete("https://reqres.in/api/users/"+id)
		
		
		.then()
		.statusCode(204)
		.log().all();
	}
	
	//@Test
	void getUser() {
		given()
		.pathParam("myPath", "users")
		.queryParam("page", 2)
		.queryParam("id", 2)
		 
		
		.when()
		.get("https://reqres.in/api/{myPath}")
		
		
		.then()
		.statusCode(200)
		.log().all();
	}
	
	//@Test
	void getCookies() {
	Response res =	given()
		
		 
		
		.when()
		.get("https://www.google.com");
	
	//Single cookie info
String cookiesValue=res.getCookie("AEC");
//all cookie info
     Map<String, String> map= res.getCookies();
     System.out.println(map);
     
    
		
		
		
	}
	
	//@Test
	void getHeaders() {
		Response res =	given() 
			
			 
			
			.when()
			.get("https://www.google.com");
		
	Headers headerValue=res.getHeaders();
	
	    
	     System.out.println("Header values: "+headerValue);
	     
	    
			
			
			
		}
	//@Test
	void getTravelInfo() {
		
		Response res= given()
				
				.when()
				.get("http://restapi.adequateshop.com/api/Traveler?page=6");
		
		XmlPath xmlObj=  new XmlPath(res.asString());
		
		List<String> list=xmlObj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		System.out.println(list);
		Assert.assertEquals(list.size(), 10);
	}
	
	//@Test
	void fileUpload() {
		given()
		
		 
		
		.when()
		.get("https://reqres.in/api/{myPath}")
		
		
		.then();
	}
	

}
