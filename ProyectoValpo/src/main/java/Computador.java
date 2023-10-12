/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julian
 */
public class Computador extends Producto {
    
    private String procesador,tipo;

    public Computador() {
    }

    public Computador(String procesador, String tipo, String nombre, String categoria, int precio) {
        super(nombre, categoria, precio);
        this.procesador = procesador;
        this.tipo = tipo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Computador{" + "procesador=" + procesador + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
