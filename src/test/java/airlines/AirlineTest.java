package airlines;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AirlineTest {
	
	@Test
	public void createAirline(){
		
	Response response=	RestAssured.given()
		.baseUri("https://api.instantwebtools.net/v1/airlines")
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"    \"_id\": \"64ca38f8eda11664b70d55f6\",\r\n" + 
				"    \"id\": 858586,\r\n" + 
				"    \"name\": \"Sri Lankan Airways\",\r\n" + 
				"    \"country\": \"Sri Lanka\",\r\n" + 
				"    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\r\n" + 
				"    \"slogan\": \"From Sri Lanka\",\r\n" + 
				"    \"head_quaters\": \"Katunayake, Sri Lanka\",\r\n" + 
				"    \"website\": \"www.srilankaairways.com\",\r\n" + 
				"    \"established\": \"1990\",\r\n" + 
				"    \"__v\": 0\r\n" + 
				"}")
		.post();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
