package br.unesp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class VectorTest {
    private int v1[];
    private int v2[];

    public VectorTest(){
    }

    @BeforeEach
    public void setup(){
        System.out.println("Inicialização de Vetores");

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
    void testEqual() {
        assertEquals(true, Vector.equal(this.v1, this.v2));
    }

    @Order(1)
    @Test
    void testSize() {
        assertEquals(true, Vector.size(this.v1.length, this.v2.length));
    }
}
