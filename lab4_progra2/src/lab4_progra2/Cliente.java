/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Franklin Garcia
 */
public class Cliente extends Persona{
    private int dinero;
    private Date compra;
    private ArrayList<Producto>compras=new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(int dinero, Date compra, String nombre, String id, int Edad, int altura, int peso, String residencia) {
        super(nombre, id, Edad, altura, peso, residencia);
        this.dinero = dinero;
        this.compra = compra;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Date getCompra() {
        return compra;
    }

    public void setCompra(Date compra) {
        this.compra = compra;
    }

    public ArrayList<Producto> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Producto> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "dinero=" + dinero + ", compra=" + compra + ", compras=" + compras + '}';
    }
    
}
