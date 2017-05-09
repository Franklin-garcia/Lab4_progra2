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
public class almacen_plataforma extends Almacen {
    private int clientes;

    public almacen_plataforma() {
        super();
    }

    public almacen_plataforma(int clientes, int tamaño_metros, int altura) {
        super(tamaño_metros, altura);
        this.clientes = clientes;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return super.toString()+ "almacen_plataforma{" + "clientes=" + clientes + '}';
    }
    
}
