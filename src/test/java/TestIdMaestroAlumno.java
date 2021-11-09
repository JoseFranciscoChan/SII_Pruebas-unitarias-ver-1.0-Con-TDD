/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author J-CHAN
 */
public class TestIdMaestroAlumno {
    
    idMaestroAlumno idMAEjemplo = new idMaestroAlumno();
    
    //Test que deberian de dar un resultado correcto
    @Test
    public void idMaestroMayor1000(){
        int i = 0;
    assertEquals(1000, idMAEjemplo.valorMaestro());
    }
    
    @Test
    public void idMaestroMenor9999(){
    assertEquals(9999, idMAEjemplo.valorMaestro());
    }
    
    public void idAlumnoMayor01000(){
    assertEquals(010000, idMAEjemplo.valorAlumno());
    }
    
    @Test
    public void idMaestroMenor099999(){
    assertEquals(99999, idMAEjemplo.valorAlumno());
    }
    
    //test que marcan error
    @Test
    public void id2MaestroMayor1000(){
    assertEquals(10000, idMAEjemplo.valorMaestro());
    }
    
    @Test
    public void id3MaestroMenor9999(){
    assertEquals(999, idMAEjemplo.valorMaestro());
    }
    
    public void id4AlumnoMayor01000(){
    assertEquals(990000, idMAEjemplo.valorAlumno());
    }
    
    @Test
    public void id5MaestroMenor099999(){
    assertEquals(99, idMAEjemplo.valorAlumno());
    }
    public TestIdMaestroAlumno() {
    }
    
}
