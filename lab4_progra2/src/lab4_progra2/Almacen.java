/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.objetos.pkg1;

import java.util.ArrayList;

/**
 *
 * @author Franklin Garcia
 */
public class Almacen {
    private ArrayList<Cargador>lista_cargador=new ArrayList();
    private ArrayList<Empleado>lista_empleado=new ArrayList();
    private ArrayList<Producto>lista_producot=new ArrayList();
    private int tamaño_metros;
    private int altura;
    private ArrayList<Cliente>lista_clientes=new ArrayList();

    public Almacen() {
    }

    public Almacen(int tamaño_metros, int altura) {
        this.tamaño_metros = tamaño_metros;
        this.altura = altura;
    }

    public ArrayList<Cargador> getLista_cargador() {
        return lista_cargador;
    }

    public void setLista_cargador(ArrayList<Cargador> lista_cargador) {
        this.lista_cargador = lista_cargador;
    }

    public ArrayList<Empleado> getLista_empleado() {
        return lista_empleado;
    }

    public void setLista_empleado(ArrayList<Empleado> lista_empleado) {
        this.lista_empleado = lista_empleado;
    }

    public ArrayList<Producto> getLista_producot() {
        return lista_producot;
    }

    public void setLista_producot(ArrayList<Producto> lista_producot) {
        this.lista_producot = lista_producot;
    }

    public int getTamaño_metros() {
        return tamaño_metros;
    }

    public void setTamaño_metros(int tamaño_metros) {
        this.tamaño_metros = tamaño_metros;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public ArrayList<Cliente> getLista_clientes() {
        return lista_clientes;
    }

    public void setLista_clientes(ArrayList<Cliente> lista_clientes) {
        this.lista_clientes = lista_clientes;
    }

    @Override
    public String toString() {
        return "Almacen{" + "lista_cargador=" + lista_cargador + ", lista_empleado=" + lista_empleado + ", lista_producot=" + lista_producot + ", tama\u00f1o_metros=" + tamaño_metros + ", altura=" + altura + ", lista_clientes=" + lista_clientes + '}';
    }
    
}