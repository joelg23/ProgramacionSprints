/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asix1.pkg1.m03;

import java.util.Scanner;

/**
 *
 * @author Ricardo Ramón y Joel Gutierrez
 */
public class Mesa {
    // Atributos
    private String nombre; // Nombre de la mesa. Ejemplo: M_24 (Servirá como id)
    private String descripcion; // Descripción de la mesa. Ejemplo: Mesa jardín M_24
    private int tamanyo; // Capacidad máxima de personas por mesa
    private int sillas_adulto; // // Número de sillas de adultos que existen
    private boolean sillas_ninyo; // Si existen o no sillas de niños
    private boolean ventilador; // Si existe o no ventilador
    private boolean jardin; // Si la mesa está en el jardín o no
    
    // Constructores
    public Mesa() {
        this.nombre = new String();
        this.descripcion = new String();
        this.tamanyo = 0;
        this.sillas_adulto = 0;
        this.sillas_ninyo = false;
        this.ventilador = false;
        this.jardin = false;
    }
    
    public Mesa(String nombre, String descripcion, int tamaño, int sillas_adulto, boolean sillas_niño,
            boolean ventilador, boolean jardin) {
        this.nombre = new String();
        this.descripcion = new String();
        this.tamanyo = 0;
        this.sillas_adulto = 0;
        this.sillas_ninyo = false;
        this.ventilador = false;
        this.jardin = false;
    }
    
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getTamanyo() {
        return tamanyo;
    }
    public void setTamanyo(int tamaño) {
        this.tamanyo = tamaño;
    }
    public int getSillas_adulto() {
        return sillas_adulto;
    }
    public void setSillas_adulto(int sillas_adulto) {
        this.sillas_adulto = sillas_adulto;
    }
    public boolean isSillas_ninyo() {
        return sillas_ninyo;
    }
    public void setSillas_ninyo(boolean sillas_niño) {
        this.sillas_ninyo = sillas_niño;
    }
    public boolean isVentilador() {
        return ventilador;
    }
    public void setVentilador(boolean ventilador) {
        this.ventilador = ventilador;
    }
    public boolean isJardin() {
        return jardin;
    }
    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }
    
    //Métodos
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID Mesa: ");
        setNombre(sc.next());
        System.out.print("Descripción: ");
        setDescripcion(sc.next());
        System.out.print("Capacidad personas: ");
        setTamanyo(sc.nextInt());
        System.out.print("Nº Sillas: ");
        setSillas_adulto(sc.nextInt());
        System.out.print("¿Existe sillas para niños? S/N ");
        if (sc.next().toUpperCase().equals("S")) {
        setSillas_ninyo(true);    
        }
        else {
        setSillas_ninyo(false);        
        }
        System.out.print("¿Tiene ventilador? S/N ");
        if (sc.next().toUpperCase().equals("S")) {
        setVentilador(true);    
        }
        else {
        setVentilador(false);        
        }
        System.out.print("¿Está la mesa en el jardín? S/N ");
        if (sc.next().toUpperCase().equals("S")) {
        setJardin(true);    
        }
        else {
        setJardin(false);        
        }   

    }
    
    // To String (Actualizado)
    @Override
    public String toString() {
        String x = new String();
		x += "Nombre: " + getNombre();
		x += ", Descripción: " + getDescripcion();
		x += ", Tamaño: " + getTamanyo();
		x += ", Nº Sillas Adulto: " + getSillas_adulto();
		x += ", ¿Tiene sillas para niños? " + isSillas_ninyo();
		x += ", ¿Tiene ventilador? " + isVentilador();
                x += ", ¿Está en el jardín? " + isJardin();
		return x;
    }
}
