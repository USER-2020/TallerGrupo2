/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author unalman
 */
public class TestHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ProfesorInterino profI = new ProfesorInterino();
       profI.setNombre("Juan");
       profI.setApellido("Zuluaga");
       profI.nombreUniversidad();
       System.out.println("El profesor "+profI.getNombre()+ "gana un sueldo de "+profI.calcularSueldo(100000, 380));
       System.out.println("Trabja en "+profI.nombreUniversidad());
       
       
        Diputado dpt = new Diputado();
        dpt.setNombre("Juan Pablo");
        dpt.setApellido("Rubiales");
        System.out.println("El diputado "+dpt.getNombre()+" trabaja en "+dpt.CamaraEnQueTrabaja());
        Senador snd = new Senador();
        snd.setNombre("Nicolas");
        snd.setApellido("Alvarez");
        System.out.println("El senador "+snd.getNombre()+" trabaja en "+snd.CamaraEnQueTrabaja());
      
      
    }
   
}
