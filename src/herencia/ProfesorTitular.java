/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author unalman
 */
public class ProfesorTitular extends Profesor{

    @Override
    protected float calcularSueldo(float sueldoBase, int puntaje) {
        return 1000000 + sueldoBase * puntaje;
    }
    
}
