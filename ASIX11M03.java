
package asix1.pkg1.m03;

/**
 *
 * @author Ricardo Ramón y Joel Gutierrez
 */
import java.util.Scanner;

public class ASIX11M03 {

    //CONSTANTES
    public static final Scanner lector = new Scanner(System.in);

    /**
     * *
     * MENU LOGIN
     *
     * @return entero, la opción dada
     */
    public static int mLogin() {//Menu para elegir la opcion de como iniciar sesion.

        System.out.println("\n *** LOGIN ***");
        System.out.println("1. ADMIN");
        System.out.println("2. CAMARERO");
        System.out.println("3. Salir");
        System.out.print("Escoge una opción: ");
        int op = lector.nextInt();//Pide la opcion que quiere escoger el usuario.

        return op;

    }

    /**
     * *
     * MENU ADMIN
     *
     * @return entero, la opción escogida dada en número entero
     */
    public static int mAdmin() {//Menu para admin que devuelve la opcion que introduzca el usuario

        System.out.println("\n *** MENU ADMIN ***");
        System.out.println("1. Insertar camarero");
        System.out.println("2. Borrar camarero");
        System.out.println("3. Listar camareros");
        System.out.println("4. Modificar camarero");
        System.out.println("5. Insertar Admin");
        System.out.println("6. Borrar Admin");
        System.out.println("7. Listar Admin");
        System.out.println("8. Modificar Admin");
        System.out.println("9. Atrás");
        System.out.print("Escoge una opción: ");
        int op = lector.nextInt();//Pide la opcion que quiere escoger el usuario.

        return op;

    }

    /**
     * *
     * MENU CAMARERO
     *
     * @return entero, la opción escogida dada en número entero
     */
    public static int mCamarero() {//Menu para camarero que devuelve la opcion que introduzca el usuario

        System.out.println("\n *** MENU CAMARERO ***");
        System.out.println("1. Insertar mesa");
        System.out.println("2. Borrar mesa");
        System.out.println("3. Listar mesas");
        System.out.println("4. Modificar mesa");
        System.out.println("5. Atrás");
        System.out.print("Escoge una opción: ");
        int op = lector.nextInt();//Pide la opcion que quiere escoger el usuario.

        return op;

    }

    public static void main(String[] args) {
        
        boolean salir = false;
        while (!salir) {
            int op = mLogin();

            switch (op) {
                case 1://Opcion Login Admin
                    boolean salirAdmin = false;
                    while (!salirAdmin) {// Nuevo submenu para opciones de admin
                        int op1 = mAdmin();

                        switch (op1) {
                            case 1:// Insertar Camarero

                                break;
                            case 2:// Borrar Camarero

                                break;
                            case 3:// Listar Camareros

                                break;
                            case 4:// Modificar Camarero

                                break;
                            case 5:// Insertar Admin

                                break;
                            case 6:// Borrar Admin

                                break;
                            case 7:// Listar Admin

                                break;
                            case 8:// Modificar Admin

                                break;

                            case 9:// Atrás
                                salirAdmin = true;
                                break;
                                
                            default:
                                System.out.println("Opción incorrecta. Vuelva a introducir");
                        }
                    }

                    break;
                case 2://Opcion Login Camarero

                    MesaDAO MCRUD = new MesaDAO();
                    boolean salirCamarero = false;

                    while (!salirCamarero) {//Nuevo submenu para opciones de camarero
                        int op2 = mCamarero();

                        switch (op2) {
                            case 1://Insertar Mesa
                                //Pedir que rellene de datos a usuario
                                Mesa mesaNueva = new Mesa();
                                mesaNueva.pedirDatos();
                                MCRUD.insertarMesaNueva(mesaNueva);
                                break;
                            case 2://Borrar Mesa
                                System.out.print("Introduce nombre de la mesa que quieres borrar: ");
                                String nombre = lector.next();
                                MCRUD.eliminarMesa(nombre);
                                break;
                            case 3://Listar Mesa
                                MCRUD.listarMesas();
                                break;
                            case 4://Modificar Mesa
                                System.out.print("Introduce nombre de la mesa a actualizar: ");
                                String nombre1 = lector.next();
   
                                MCRUD.modificarMesa(nombre1);
                                break;

                            case 5://Salir Camarero (Atrás)
                                salirCamarero = true;
                                break;

                            default:
                                System.out.println("Opción incorrecta. Vuelva a introducir");
                        }
                    }
                    break;

                case 3: // Salir MENU LOGIN
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta. Vuelva a introducir");
            }
        }

    }
}
