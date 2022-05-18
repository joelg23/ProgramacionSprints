
package asix1.pkg1.m03;


public class Mesa {
    // Atributos
    private String nombre; // Nombre de la mesa. Ejemplo: M_24 (Servirá como id)
    private String descripcion; // Descripción de la mesa. Ejemplo: Mesa jardín M_24
    private int tamaño; // Capacidad máxima de personas por mesa
    private int sillas_adulto; // // Número de sillas de adultos que existen
    private boolean sillas_niño; // Si existen o no sillas de niños
    private boolean ventilador; // Si existe o no ventilador
    private boolean jardin; // Si la mesa está en el jardín o no
    
    // Constructores
    public Mesa() {
        this.nombre = new String();
        this.descripcion = new String();
        this.tamaño = 0;
        this.sillas_adulto = 0;
        this.sillas_niño = false;
        this.ventilador = false;
        this.jardin = false;
    }
    
    public Mesa(String nombre, String descripcion, int tamaño, int sillas_adulto, boolean sillas_niño,
            boolean ventilador, boolean jardin) {
        this.nombre = new String();
        this.descripcion = new String();
        this.tamaño = 0;
        this.sillas_adulto = 0;
        this.sillas_niño = false;
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
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public int getSillas_adulto() {
        return sillas_adulto;
    }
    public void setSillas_adulto(int sillas_adulto) {
        this.sillas_adulto = sillas_adulto;
    }
    public boolean getSillas_niño() {
        return sillas_niño;
    }
    public void setSillas_niño(boolean sillas_niño) {
        this.sillas_niño = sillas_niño;
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
    
    // To String (Actualizado)
    @Override
    public String toString() {
        return "Mesa{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", tama\u00f1o=" + tamaño + ", sillas_adulto=" + sillas_adulto + ", sillas_ni\u00f1o=" + sillas_niño + ", ventilador=" + ventilador + ", jardin=" + jardin + '}';
    }
}
