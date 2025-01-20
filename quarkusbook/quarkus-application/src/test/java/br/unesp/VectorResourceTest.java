package br.unesp;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

// import java.util.Arrays;

@QuarkusTest
public class VectorResourceTest {
    @Test
    void testVectorEndpoint(){
        given()
            .when().get("/vector")
            .then()
                .statusCode(200)
                .body(is("Vector Resource"));
    }

    @Test
    public void testVectorSize() {
        int vecA[] = {1, 5, 6};
        int vecB[] = {1, 5, 6};
        given()
          .pathParam("a", String.valueOf(vecA.length))
          .pathParam("b", String.valueOf(vecB.length))
          .when().get("/vector/size/{a}/{b}")
          .then()
            .statusCode(200)
            .body(is("true"));
    }

    // @Test
    // public void testVectorEquals() {
    //     int vecA[] = {1, 5, 6};
    //     int vecB[] = {1, 5, 6};
    //     System.out.println("TEST----------------------------------------------" + Arrays.toString(vecA));
    //     given()
    //       .pathParam("a", Arrays.toString(vecA).replaceAll("\\s+",""))
    //       .pathParam("b", Arrays.toString(vecB).replaceAll("\\s+",""))
    //       .when().get("/vector/equals/{a}/{b}")
    //       .then()
    //         .statusCode(200)
    //         .body(is("true"));
    // }

}
