package Controller;

import Model.Cliente;
import Model.Filme;
import miscellaneous.Database;
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
public class LocacaoControllerTest {
    
    public LocacaoControllerTest() {
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
     * Test of alugar method, of class LocacaoController.
     */
    @Test
    public void testAlugar() {
        System.out.println("alugar");
        String cliente = "Higor";
        int indexCliente = 0;
        String flime = "filmezao";
        LocacaoController instance = new LocacaoController();
        Cliente cli = new Cliente();
        Filme fi = new Filme();
        cli.setId(indexCliente);
        cli.setNome(cliente);
        cli.setIdade(20);
        fi.setNome(flime);
        fi.setFaixaEtaria(18);
        fi.setAlugado("false");
        boolean expResult = false;
        boolean result = instance.alugar(cliente, indexCliente, flime);
        assertEquals(expResult, result);
    }

    /**
     * Test of removerRow method, of class LocacaoController.
     */
    @Test
    public void testRemoverRow() {
        System.out.println("removerRow");
        String filme = "FilmeBom";
        int index = 0;
        
        LocacaoController instance = new LocacaoController();
        
        Filme fi = new Filme();
        fi.setNome(filme);
        fi.setId(index);
        fi.setAlugado("falso");
        
        Cliente cliente = new Cliente();
        cliente.setId(index);
        cliente.setIdade(18);
        cliente.setNome("Higor");
        
        Database.getInstancia().getFilmes().add(fi);
        Database.getInstancia().getClientes().add(cliente);
        boolean expResult = true;
        instance.alugar("Higor", 0, filme);
        boolean result = instance.removerRow(filme, index);
        assertEquals(expResult, result);
    }

    /**
     * Test of salvarArq method, of class LocacaoController.
     */
    @Test
    public void testSalvarArq() {
        System.out.println("salvarArq");
        String path = "salvarlocacao.csv";
        LocacaoController instance = new LocacaoController();
        instance.salvarArq(path);
    }

    /**
     * Test of abrirArq method, of class LocacaoController.
     */
    @Test
    public void testAbrirArq() {
        System.out.println("abrirArq");
        String path = "salvarlocacao.csv";
        LocacaoController instance = new LocacaoController();
        instance.abrirArq(path);
    }
    
}
