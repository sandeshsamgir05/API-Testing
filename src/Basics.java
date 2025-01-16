import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Files.payload;

public class Basics {

    public static void main(String[] args) {
        // Base URI setup
        RestAssured.baseURI = "https://rahulshettyacademy.com/";

        // Given-When-Then structure for API request
        String response = given()
            .queryParam("key", "qaclick123") // Note: 'key' is case-sensitive
            .header("Content-Type", "application/json")
            .body(payload.AddPlace())
        .when().post("maps/api/place/add/json").then().log().all()
            .assertThat().statusCode(200).body("scope", equalTo("APP")).header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();

        System.out.println(response);
        
    //add place > UpdatePlace with new address> Get Place to validate if the new address is updated.
        
        JsonPath js = new JsonPath(response); //for parsing JSON
        String placeID = js.getString("place_id");
        
        System.out.println(placeID);
        
        
    
    }
}
