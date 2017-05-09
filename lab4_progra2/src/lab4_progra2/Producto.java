/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_progra2;

import java.util.Date;

/**
 *
 * @author Franklin Garcia
 */
public class Producto {
    private Date emision;
    private int vida_util;
    private int precio;
    private int tamaño;
    private String descripcion;
    private String nombre;
    private int numero_productos;

    public Producto() {
    }

    public Producto(Date emision, int vida_util, int precio, int tamaño, String descripcion, String nombre, int numero_productos) {
        this.emision = emision;
        this.vida_util = vida_util;
        this.precio = precio;
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.numero_productos = numero_productos;
    }

    public Date getEmision() {
        return emision;
    }

    public void setEmision(Date emision) {
        this.emision = emision;
    }

    public int getVida_util() {
        return vida_util;
    }

    public void setVida_util(int vida_util) {
        this.vida_util = vida_util;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_productos() {
        return numero_productos;
    }

    public void setNumero_productos(int numero_productos) {
        this.numero_productos = numero_productos;
    }

    @Override
    public String toString() {
        return "Producto{" + "emision=" + emision + ", vida_util=" + vida_util + ", precio=" + precio + ", tama\u00f1o=" + tamaño + ", descripcion=" + descripcion + ", nombre=" + nombre + ", numero_productos=" + numero_productos + '}';
    }
    
}
