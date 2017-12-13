/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.sun.net.httpserver.Authenticator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 *
 * @author Higor Alves
 */
public class ClienteControllerTest {
    
    public ClienteControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addRow method, of class ClienteController.
     */
    @Test
    public void testAddRow() {
        System.out.println("addRow");
        String nome = "Higor";
        int idade = 20;
        ClienteController instance = new ClienteController();
        boolean expResult = true;
        boolean result = instance.addRow("Higor", 20);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removerRow method, of class ClienteController.
     */
    @Test
    public void testRemoverRow() {
        System.out.println("removerRow");
        int id = 0;
        ClienteController instance = new ClienteController();
        boolean expResult = true;
        boolean result = instance.removerRow(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alterarRow method, of class ClienteController.
     */
    @Test
    public void testAlterarRow() {
        System.out.println("alterarRow");
        int id = 0;
        String nome = "";
        int idade = 0;
        String newNome = "";
        int newIdade = 0;
        ClienteController instance = new ClienteController();
        instance.addRow(nome, idade);
        boolean expResult = false;
        boolean result = instance.alterarRow(id, nome, idade, newNome, newIdade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of salvarArq method, of class ClienteController.
     */
    @Test
    public void testSalvarArq() {
        System.out.println("salvarArq");
        String path = "teste.csv";
        ClienteController instance = new ClienteController();
        instance.salvarArq(path);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of abrirArq method, of class ClienteController.
     */
    @Test
    public void testAbrirArq() {
        System.out.println("abrirArq");
        String path = "testeabrir.csv";
        ClienteController instance = new ClienteController();
        instance.abrirArq(path);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
