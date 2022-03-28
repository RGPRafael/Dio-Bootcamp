package Banco;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    public static void main(String[] args) {


        Cliente c = new Cliente();
        c.setNome("M");
        System.out.println(c.getNome());
        assertEquals("M", c.getNome());
    }

}