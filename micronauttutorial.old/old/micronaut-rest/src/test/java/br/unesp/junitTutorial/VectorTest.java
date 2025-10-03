package br.unesp.junitTutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VectorTest {
    public VectorTest(){}

    private int[] v1;
    private int[] v2;

    // @BeforeAll
    // public static void setUpClass(){}

    // @AfterAll
    // public static void tearDownClass(){}

    @BeforeEach
    public void  setUp(){
        System.out.println("Inicializando vetores");
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        this.v1 = new int[3];
        this.v1 = a;
        this.v2 = new int[3];
        this.v2 = b;
    }

    @AfterEach
    public void finalize(){
        System.out.println("Anulando Vetores");
        this.v1 = null;
        this.v2 = null;
    }

    @Order(2)
    @Test
    public void testEqual(){
        boolean expResult = true;

        boolean result = Vector.equals(this.v1, this.v2);

        assertEquals(result, expResult);
    }

    @Order(1)
    @Test
    public void testSize(){
        boolean expResult = false;

        boolean result = Vector.size(this.v1, this.v2);

        assertEquals(result, expResult);
    }
}
