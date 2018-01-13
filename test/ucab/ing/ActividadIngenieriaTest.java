/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucab.ing;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Corp Sarens2
 */
public class ActividadIngenieriaTest {
    ClienteDATOimplement d;
    
    
    public ActividadIngenieriaTest() {
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

    @Test
    public void testSomeMethod() {
        
      ClienteDATOimplement m = new ClienteDATOimplement();  
       m.leerArchivo("C:/prueba.txt");                      ///ruta del archivo a leer
       Cliente cliente1=new Cliente(5,"Juan","Perez","10/18","84441134");  ///creacion de cliente
       m.registrarCliente(cliente1);   //registro de cliente
        System.out.println(m.obtenerCliente(1).getApellido());    ///consulta de algun dato del cliente segun su cedula , por ejemplo apellido,si no se encuentra el cliente retorna null
        System.out.println(m.Existe("2934523"));                    ///ver si el cliente si existe segun la cedula
       m.AñadirclientesTXT("C:/prueba3.txt");                  //creacion del archivo con el cliente nuevo a una ruta especificada
        
      
    }
    
}
