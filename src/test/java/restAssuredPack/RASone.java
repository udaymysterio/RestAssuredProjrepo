package restAssuredPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RASone {
	
	@Test
	public void restReq() {
	Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
	
	System.out.println(resp.getStatusCode());
	System.out.println(resp.getTime());
	System.out.println(resp.getBody().asString());
	System.out.println(resp.getStatusLine());
	System.out.println(resp.getHeader("content-type"));
	
	int status = resp.getStatusCode();
	Assert.assertEquals(status, 200);

}
}