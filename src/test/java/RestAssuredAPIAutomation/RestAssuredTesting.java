package RestAssuredAPIAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.XmlObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.github.javafaker.Faker;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredTesting {
	

	
	@Test
	void readmyjsondata() {
		
	Response res=	 given()
		 .baseUri("http://localhost:3000/data")
	.contentType(ContentType.JSON)
	
	
	
	.when()
	.get()
	;
	
	
	JSONObject j= new JSONObject(res.asString());
	
	JSONArray k=j.getJSONArray("subjects");
	System.out.println(k.length());
	System.out.println(k.getJSONObject(0).get("title"));
		
	}
	
	
	
	
	
	
	
	
	
	
	//@Test
void updatenewUsers() {
		
		//RestAssured.baseURI="";
		
		
		
		Map<String,Object> m1= new HashMap<String,Object>();
		Map<String,Object> m2= new HashMap<String,Object>();
		
		m1.put("college", "IITKGP");
		m1.put("id", 1);
		
		//m2.put("data", m1);
		
		
	 given()
			 .baseUri("http://localhost:3000/data")
		.contentType(ContentType.JSON)
		.body(m1)
		
		
		.when()
		.patch()
		.then()
		.log().body()
		;
	 
	 
	// id=res.jsonPath().getInt("id");
	 
	// System.out.println(id);
	 
	 System.out.println("--------------------------");
		
//		.then()
//		.log().body()
//		.statusCode(201)
//		.log().headers()
//		.log().cookies()
		
		;
		
		
	}
	
	
	
//@Test
//void restTest() {
//	
//	Integer x = new Integer(0);
//	int y=0;
//	System.out.println((x==y)+"----------------------------------------------");
//	Response res=(Response) given()
//	
//	.when()
//	.get("https://google.com")
//	
//	
//	.then()
//	.cookie("AEC","kjwhxlkhkjeckjhclk")
//	.log().all()
//	.statusCode(200)
//	
//	;
//	
//	String cookie = res.getCookie("AEC");
//	System.out.println(cookie);
//	
//	Map<String, String> map= res.cookies();
//	
//	for(Map.Entry<String, String> m: map.entrySet()) {
//		System.out.println(m.getKey()+"=>"+m.getValue());
//	}
//	System.out.println("-------------------------Headers-----------------------");
//         Headers headers=res.headers();
//         
//         System.out.println(headers);
//         for(Header hd: headers) {
//     		System.out.println();
//     	}
//
//}
//
	//@Test
void readXMLData() {
	
	RestAssured.baseURI="";
	
	
	Response res= given()
	
	
	.when()
	.get("http://restapi.adequateshop.com/api/Traveler?page=1")
	 ;

	
	XmlPath xmlObj = new XmlPath(res.asString());
	
List<String> list=	xmlObj.getList("TravelerinformationResponse.travelers.Travelerinformation");
	
	 System.out.println(xmlObj.getList("TravelerinformationResponse.travelers.Travelerinformation").size());
}

void readJSONData() {
	   given()
			
			
			.when()
			.get("http://localhost:3000/cust")
			.then()
			.body("TravelerinformationResponse.travelers.Travelerinformation.id",equalTo("11133"))
			;


	
	//JSONArray j= new JSONArray(res.asString());
	
	
        //System.out.println(j.getJSONObject(0).getJSONObject("address").getJSONObject("city").get("town"));
}
		

	
	
	
	@Test
	void getUsers() {
		
		RestAssured.baseURI="http://localhost:3000";
		
Response res=
		(Response) given()
//.pathParam("myPathParam", "users")

//.queryParam("id", 5)
.baseUri("http://localhost:3000/Students")

.when()
.get()
.then()
.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(""))
		
		;


		
          // res.jsonPath().get("[0].name");
		
		//System.out.println( res.jsonPath().get("[0].address.city").toString());
	
		//JSONArray ja = new JSONArray(res.asString());
		
		
		//System.out.println(ja.length());
		
		
		
		////System.out.println(ja.getJSONObject(0).getJSONArray("courses"));
		
		
		
		
		
		
		
		
//	Map<String,String> map=	res.getCookies();
//	 
//
//	for(Map.Entry<String,String> m: map.entrySet()) {
//		
//		System.out.println(m.getKey()+"="+m.getValue());
//		
//	}
//	
//	Iterator<Entry<String, String>> it= map.entrySet().iterator();
//	
//	while(it.hasNext()) {
//		
//		Map.Entry<String, String> m= it.next();
//		
//		System.out.println(m.getKey()+"="+m.getValue());
//	}
//	
//	
//	
//	System.out.println(res.getHeaders());
//	for(Header h:res.getHeaders()) {
//		System.out.println(h.getName()+"=>"+h.getValue());
//	}
		
	}
	
	//int id;

	//@Test
	
	void createUsers() {
		
		RestAssured.baseURI="https://reqres.in/api";
		
		
		
		Map<String,String> data= new HashMap<String,String>();
		
		data.put("name", "Rahul");
		data.put("job", "IT");
		
		
	 Response res=	given()
		.contentType("application/json")
		.body(data)
		
		
		.when()
		.post("/users")
		;
	 
	 
	// id=res.jsonPath().getInt("id");
	 
	// System.out.println(id);
	 
	 System.out.println("--------------------------");
		
//		.then()
//		.log().body()
//		.statusCode(201)
//		.log().headers()
//		.log().cookies()
		
		;
		
		
	}
	
//@Test(dependsOnMethods="createUsers")
	
	void updateUsers() {
		
		RestAssured.baseURI="https://reqres.in/api";
		
		
		
		Map<String,String> data= new HashMap<String,String>();
		
		data.put("name", "Rahul");
		data.put("job", "Software");
		
		
	     given()
		.contentType("application/json")
		.body(data)
		
		
		.when()
		.put("/users/")
		
		
		.then()
		.log().body()
		
		
		;
		
		
	}
	
	//@Test(dependsOnMethods="createUsers")
	
		void deleteUsers() {
			
			RestAssured.baseURI="https://reqres.in/api";
			
			
			
			
			
		     given()
			
			
			
			.when()
			//.delete("/users/"+id)
			
			
			.then()
			.log().all()
			//.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath())
			
			
			;
			
			
		}
		
	int num;
		@Test
		void ApiChaining() {
			
			Faker f= new Faker();
			
			JSONObject j= new JSONObject();
			
			j.put("name", f.name().fullName());
			j.put("gender", "Male");
			j.put("email", f.internet().emailAddress());
			j.put("status", "Inactive");
			
			String token="27d66bbc4070ca1cb4da35aadb5f1342d549543340e672c74bfba5feaedc7a8a";
			
			Response res=given()
			.headers("Authorization","Bearer "+token)
			.contentType("application/json")
			.body(j.toString())
			
			
			.when()
			.post("https://gorest.co.in/public/v2/users")
			
			;
			num=res.jsonPath().get("id");
			System.out.println(num);
			
		
	
		}

}