import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PetStoreTests {
    @Test
    public void getSoldPets() {
        String BaseURI = "https://petstore.swagger.io/v2/pet";

        Response res = given().contentType(ContentType.JSON)
                .when().get(BaseURI + "/findByStatus?status=sold");

        String resBody = res.getBody().asPrettyString();
        System.out.println("Response Body is =>  " + resBody);

        res.then().statusCode(200);
        res.then().body("[0].status", equalTo("sold"));

     }

}

