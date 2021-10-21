/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculatricejenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexywehrey
 */
public class CalculatriceJenkinsIT {
    
    public CalculatriceJenkinsIT() {
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
     * Test of somme method, of class CalculatriceJenkins.
     */
    @Test
    public void testSomme() {
        System.out.println("somme");
        int a = 3;
        int b = 3;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 6;
        int result = instance.somme(a, b);
        System.out.println(instance.somme(a, b));

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of soustraction method, of class CalculatriceJenkins.
     */
    @Test
    public void testSoustraction() {
        System.out.println("soustraction");
        int a = 5;
        int b = 2;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 3;
        int result = instance.soustraction(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class CalculatriceJenkins.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 4;
        int b = 2;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 2;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of mutiplication method, of class CalculatriceJenkins.
     */
    @Test
    public void testMutiplication() {
        System.out.println("mutiplication");
        int a = 5;
        int b = 5;
        CalculatriceJenkins instance = new CalculatriceJenkins();
        int expResult = 25;
        int result = instance.mutiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
