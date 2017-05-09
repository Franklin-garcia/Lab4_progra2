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
public class Persona {

    private String nombre;
    private String id;
    private int Edad;
    private int altura;
    private int peso;
    private String residencia;

    public Persona() {
    }

    public Persona(String nombre, String id, int Edad, int altura, int peso, String residencia) {
        this.nombre = nombre;
        this.id = id;
        this.Edad = Edad;
        this.altura = altura;
        this.peso = peso;
        this.residencia = residencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", Edad=" + Edad + ", altura=" + altura + ", peso=" + peso + ", residencia=" + residencia + '}';
    }

}
