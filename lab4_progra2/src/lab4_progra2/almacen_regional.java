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
public class almacen_regional extends Almacen {
    private String nombre;

    public almacen_regional() {
        super();
    }

    public almacen_regional(String nombre, int tamaño_metros, int altura) {
        super(tamaño_metros, altura);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+ "almacen_regional{" + "nombre=" + nombre + '}';
    }
    
}
