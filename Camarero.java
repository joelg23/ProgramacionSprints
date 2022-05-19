<<<<<<< Updated upstream:Camarero

package asix1.pkg1.m03;

public class Camarero {
    
    // ATRIBUTOS
    private String nombreU; // Nombre de usuario. Ejemplo: Antonio123 (Servirá como id)
    private String contraseña; // Contraseña del usuario. Ejemplo: 123A
    private String nombre; // Nombre de la persona.
    private String apellidos; // Apellidos de la persona.
    private int salario; // Salario del camarero
    //CONSTRUCTORES
    
    public Camarero() {
        this.nombreU = new String();
        this.contraseña = new String();
        this.nombre = new String();
        this.apellidos = new String();
    }
    
    
    public Camarero(String nombreU, String contraseña) {
        this.nombreU= nombreU;
        this.contraseña = contraseña;
        this.nombre = new String();
        this.apellidos = new String();
    }

    public Camarero(String nombreU, String contraseña, String nombre, String apellidos, int salario) {
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

    
    
    @Override
    public String toString() {
        return "Camarero{" + "nombreU=" + nombreU + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asix11m03;

/**
 *
 * @author Ricardo Ramón y Joel Gutierrez
 */
public class Camarero {
    
    // ATRIBUTOS
    private String nombreU; // Nombre de usuario. Ejemplo: Antonio123 (Servirá como id)
    private String contraseña; // Contraseña del usuario. Ejemplo: 123A
    private String nombre; // Nombre de la persona.
    private String apellidos; // Apellidos de la persona.
    private int salario; // Salario del camarero
    //CONSTRUCTORES
    
    public Camarero() {
        this.nombreU = new String();
        this.contraseña = new String();
        this.nombre = new String();
        this.apellidos = new String();
    }
    
    
    public Camarero(String nombreU, String contraseña) {
        this.nombreU= nombreU;
        this.contraseña = contraseña;
        this.nombre = new String();
        this.apellidos = new String();
    }

    public Camarero(String nombreU, String contraseña, String nombre, String apellidos, int salario) {
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

    
    
    @Override
    public String toString() {
        return "Camarero{" + "nombreU=" + nombreU + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
}
>>>>>>> Stashed changes:Camarero.java
