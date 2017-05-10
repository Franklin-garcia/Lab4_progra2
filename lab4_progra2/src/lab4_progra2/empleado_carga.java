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
public class empleado_carga extends Empleado{
    private int entrada;
    private int salida;
    private Date fecha_inico;
    public empleado_carga() {
        super();
    }
    

    public empleado_carga(int entrada, int salida, Date fecha_inico, String nombre, String id, int Edad, int altura, int peso, String residencia) {
        super(nombre, id, Edad, altura, peso, residencia);
        this.entrada = entrada;
        this.salida = salida;
        this.fecha_inico = fecha_inico;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public Date getFecha_inico() {
        return fecha_inico;
    }

    public void setFecha_inico(Date fecha_inico) {
        this.fecha_inico = fecha_inico;
    }

    @Override
    public String toString() {
        return super.toString()+"empleado_carga{" + "entrada=" + entrada + ", salida=" + salida + ", fecha_inico=" + fecha_inico + '}';
    }
    
}
