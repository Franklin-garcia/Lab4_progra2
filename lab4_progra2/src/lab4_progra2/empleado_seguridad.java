/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

/**
 *
 * @author Franklin Garcia
 */
public class empleado_seguridad extends Empleado{

  
    
    public empleado_seguridad() {
        super();
    }

    public empleado_seguridad(String nombre, String id, int Edad, int altura, int peso, String residencia) {
        super(nombre, id, Edad, altura, peso, residencia);
    }

    @Override
    public String toString() {
        return "empleado_seguridad{" + '}';
    }
    
}
