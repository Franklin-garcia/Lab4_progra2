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
public class almacen_planta extends Almacen {
    private int numero_plantas;

    public almacen_planta() {
        super();
    }

    public almacen_planta(int numero_plantas, int tamaño_metros, int altura) {
        super(tamaño_metros, altura);
        this.numero_plantas = numero_plantas;
    }

    public int getNumero_plantas() {
        return numero_plantas;
    }

    public void setNumero_plantas(int numero_plantas) {
        this.numero_plantas = numero_plantas;
    }

    @Override
    public String toString() {
        return super.toString()+"almacen_planta{" + "numero_plantas=" + numero_plantas + '}';
    }
    
}
