/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Higor Alves
 */
public class FilmeControllerTest {
    
    public FilmeControllerTest() {
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
     * Test of addRow method, of class FilmeController.
     */
    @Test
    public void testAddRow() {
        System.out.println("addRow");
        String titulo = "filmeBolado";
        int faixaEtaria = 10;
        FilmeController instance = new FilmeController();
        boolean expResult = true;
        boolean result = instance.addRow(titulo, faixaEtaria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removerRow method, of class FilmeController.
     */
    @Test
    public void testRemoverRow() {
        System.out.println("removerRow");
        int id = 0;
        FilmeController instance = new FilmeController();
        boolean expResult = true;
        boolean result = instance.removerRow(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alterarRow method, of class FilmeController.
     */
    @Test
    public void testAlterarRow() {
        System.out.println("alterarRow");
        int id = 0;
        String titulo = "titulo1";
        int faixaEtaria = 10;
        String alugado = "falso";
        String newTitulo = "titulo2";
        int newFaixaEtaria = 20;
        FilmeController instance = new FilmeController();
        boolean expResult = true;
        instance.addRow(titulo, faixaEtaria);
        boolean result = instance.alterarRow(id, titulo, faixaEtaria, alugado, newTitulo, newFaixaEtaria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of salvarArq method, of class FilmeController.
     */
    @Test
    public void testSalvarArq() {
        System.out.println("salvarArq");
        String path = "testefilme.csv";
        FilmeController instance = new FilmeController();
        instance.salvarArq(path);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of abrirArq method, of class FilmeController.
     */
    @Test
    public void testAbrirArq() {
        System.out.println("testefilme.csv");
        String path = "";
        FilmeController instance = new FilmeController();
        instance.abrirArq(path);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
