/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asix1.pkg1.m03;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Ricardo Ramón y Joel Gutierrez
 */
public class Camarero implements Serializable{
    
    // ATRIBUTOS
    String rango;
    String nombreU; // Nombre de usuario. Ejemplo: Antonio123 (Servirá como id)
    private String contraseña; // Contraseña del usuario. Ejemplo: 123A
    String nombre; // Nombre de la persona.
    String apellidos; // Apellidos de la persona.
    int salario; // Salario del camarero
    
    //CONSTRUCTORES
    
    public Camarero() {
        this.rango = "camarero";
        this.nombreU = new String();
        this.contraseña = new String();
        this.nombre = new String();
        this.apellidos = new String();
    }
    
    
    public Camarero(String nombreU, String contraseña) {
        this.rango = "camarero";
        this.nombreU= nombreU;
        this.contraseña = contraseña;
        this.nombre = new String();
        this.apellidos = new String();
    }

    public Camarero(String nombreU, String contraseña, String nombre, String apellidos, int salario) {
        this.rango = "camarero";
        this.nombreU = nombreU;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }
    
    //GETTERS AND SETTERS

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
        //Métodos
public void pedirDatosC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Usuario: ");
        setNombreU(sc.next());
        System.out.println("Contraseña: ");
        setContraseña(sc.next());
        System.out.print("Nombre: ");
        setNombre(sc.next());
        System.out.print("Apellidos: ");
        setApellidos(sc.next());
        System.out.print("Salario: ");
        setSalario(sc.nextInt());
    }

    
        
    
    @Override
        public String toString() {
        String x = new String();
		x += "Usuario: " + getNombreU();
		x += ", Nombre: " + getNombre();
		x += ", Apellidos: " + getApellidos();
		x += ", Salario: " + getSalario();
		return x;
    }
    
}
