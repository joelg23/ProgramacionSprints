package asix1.pkg1.m03;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Ricardo Ramón y Joel Gutierrez
 */
public class Admin implements Serializable{
     // ATRIBUTOS
    String rango;
    String nombreU; // Nombre de usuario. Ejemplo: Juan123 (Servirá como id)
    String contraseña; // Contraseña del usuario. Ejemplo: 123A
    String nombre; // Nombre de la persona.
    String apellidos; // Apellidos de la persona.
    int salario;
    private String contrseña;
    
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

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getContrseña() {
        return contrseña;
    }

    public void setContrseña(String contrseña) {
        this.contrseña = contrseña;
    }
    

    public void pedirDatosA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Usuario: ");
        setNombreU(sc.next());
        System.out.print("Contraseña: ");
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
        return "Admin{" + "nombreU=" + nombreU + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
}
