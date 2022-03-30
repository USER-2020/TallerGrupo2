/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import abstractas.Persona;

/**
 *
 * @author unalman
 */
public abstract class Legislador extends Persona{
    protected String provinciaqueRepresenta;
    protected abstract String CamaraEnQueTrabaja();
    
}