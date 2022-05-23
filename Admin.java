package asix1.pkg1.m03;

import java.io.Serializable;

/**
 *
 * @author Ricardo Ramón y Joel Gutierrez
 */
public class Admin implements Serializable{
     // ATRIBUTOS
    private String rango;
    private String nombreU; // Nombre de usuario. Ejemplo: Juan123 (Servirá como id)
    private String contraseña; // Contraseña del usuario. Ejemplo: 123A
    private String nombre; // Nombre de la persona.
    private String apellidos; // Apellidos de la persona.
    
    //CONSTRUCTORES
    
    public Admin() {
        this.rango = "admin";
        this.nombreU = new String();
        this.contraseña = new String();
        this.nombre = new String();
        this.apellidos = new String();
    }
    
    
    public Admin(String nombreU, String contraseña) {
        this.rango = "admin";
        this.nombreU= nombreU;
        this.contraseña = contraseña;
        this.nombre = new String();
        this.apellidos = new String();
    }

    public Admin(String nombreU, String contraseña, String nombre, String apellidos) {
        this.rango = "admin";
        this.nombreU = nombreU;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    @Override
    public String toString() {
        return "Admin{" + "nombreU=" + nombreU + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
}
