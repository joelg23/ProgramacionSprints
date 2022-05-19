/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asix1.pkg1.m03;

/**
 *
 * @author Ricardo Ramón y Joel Gutierrez
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class MesasDAO {
    public static File fichero = new File("\\Mesas.txt"); // Ruta relativa
    
    public static ArrayList<Mesa> arrMesas = new ArrayList<Mesa>();

    
    public void insertarMesaNueva(Mesa mesa) {
        if (!existeMesa(mesa.getNombre())) {
            arrMesas.add(mesa);

            try {
                // El true al final indica que escribiremos al final del fichero añadiendo texto, si se omite sobreescribe todo el fichero
                FileWriter writer = new FileWriter(fichero, true);

                writer.write(mesa.getNombre() + ";" + mesa.getDescripcion() + ";" + mesa.getTamanyo() + ";" + mesa.getSillas_adulto() + ";" + mesa.isSillas_ninyo() + ";" + mesa.isVentilador() + ";" + mesa.isJardin() + ";" + "\n");

                writer.close();

            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al crear/escribir en el fichero");
            }
            System.out.println("Se ha insertado una mesa.");
        }
        else{
            System.out.println("Ya existe una mesa con esa ID. Pruebe a introducir otra ID");
        }

    }
    
public void eliminarMesa(String nombre) {
        ArrayList<String> lineas = new ArrayList<>();
        try {
            Scanner lectorFichero = new Scanner(fichero);
            int i = 0;
            while (lectorFichero.hasNext()) {
                lineas.add(lectorFichero.nextLine());
            }
            lectorFichero.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/leer el fichero");
        }

        try {
            FileWriter writer = new FileWriter(fichero);
            String[] split = new String[7];

            for (String linea : lineas) {
                split = linea.split(";");
                if (!nombre.equals(split[0])) {
                    writer.write(linea + "\n");
                }
            }
            writer.close();

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/sobreescribir el fichero");
        }

    }
    
     public void listarMesas() {
        // Mesa mesa;
        
         try {
            FileReader entrada = new FileReader(fichero); // Ruta relativa
            
            
            // Sin buffer, lee caracter a caracter
            // int c = entrada.read(); // lee el primer caracter y luego en el while ya empieza por el siguiente caracter
            int c=0; // Se arregla con una equivalencia a 0 
            
            while (c != -1) {
                c = entrada.read();
                
                char letra = (char)c;
                System.out.print(letra);
            }

            entrada.close();
            
        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo.");
        }
        
     
    }
    public void modificarMesa(String nombre) {
        
               ArrayList<String> lineas = new ArrayList<>();
        
        try {
            Scanner lectorFichero = new Scanner(fichero);

            int i = 0;

            while (lectorFichero.hasNext()) {
                lineas.add(lectorFichero.nextLine());
            }

            lectorFichero.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/leer el fichero");
        }
        
        
        try {
            FileWriter writer = new FileWriter(fichero);
            String[] split = new String[7];
            Mesa mesa = new Mesa();
            mesa.pedirDatos();
            
            for (String linea : lineas) {
                split = linea.split(";");
                if (nombre.equals(split[0])) {
                    writer.write(mesa.getNombre()+";"+mesa.getDescripcion()+";"+mesa.getTamanyo()+";"+mesa.getSillas_adulto()+";"+mesa.isSillas_ninyo()+";"+mesa.isVentilador()+";"+mesa.isJardin()+";"+"\n");
                }
                else{
                    writer.write(linea + "\n");
                }
            }

            writer.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/sobreescribir el fichero");
        }
    }
    
    
}
