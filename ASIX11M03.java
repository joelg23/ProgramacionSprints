/*
Es demana implementar un aplicatiu de gestió de taulas d’un restaurant amb jardí.

Per poder accedir a l’aplicatiu es requerirà un usuari i un password. Cada usuari tindrà un rol assignat: admin o cambrer. L’aplicatiu només ens permetrà 3 intents de login i sortirà de l’aplicatiu en cas de no ser correcte.

La informació dels usuaris, passwords i rols es guardarà en un fitxer binari anomenat users.dat. Inicialment, es comprovarà l’existència del fitxer i si no existeix, es crearà el fitxer users.dat amb l’usuari admin, password root i rol admin.

La informació de les taulas del restaurant estaràn guardades en un fitxer de text anomenat taulas.txt. Aquest fitxer tindrà un format CSV (Comma Separated Values) i es guardarà tota la informació d’equipament de la taula:
Nom de la taula (actuarà com id_taula): P.ex. t_24
Descripció de la taula: P.ex. Taula Jardí t_24
Capacitat màxima de persones a la taula
Si existeixen o no cadires de nen a la taula
Número de cadires adults que disposa la taula
Si existeix o no ventilador
Si la taula està o no al jardí

Un cop accedit correctament a l’aplicatiu, es mostrarà un menú amb opcions diferents depenent del rol que tingui assignat l’usuari.

En el menú de l’usuari amb el rol admin es permetrà a aquestos usuaris les següents opcions:
Alta usuari: insertar nous usuaris amb el rol cambrer a la base de dades
Llistar tots els usuaris de la base de dades (implementada amb fitxers binaris)
Modificar la contrasenya i el rol d’un usuari amb el rol cambrer, donat el seu username.
Eliminar un usuari de rol cambrer, donat el seu userName
Sortir

En el menú de l’usuari amb el rol cambrer es permetrà a aquestos usuaris les següents opcions:
Llistar totes les taulas
Donar d’alta un taula
Modificar/Editar una taula
Esborrar una taula
Sortir

 */
package asix11m03;

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
        System.out.println("4. Buscar camarero");
        System.out.println("5. Insertar Admin");
        System.out.println("6. Borrar Admin");
        System.out.println("7. Listar Admin");
        System.out.println("8. Buscar Admin");
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
        System.out.println("4. Buscar mesa");
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
                            case 4:// Buscar Camarero

                                break;
                            case 5:// Insertar Admin

                                break;
                            case 6:// Borrar Admin

                                break;
                            case 7:// Listar Admin

                                break;
                            case 8:// Buscar Admin

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

                    MesaDAO CRUD = new MesaDAO();
                    boolean salirCamarero = false;

                    while (!salirCamarero) {//Nuevo submenu para opciones de camarero
                        int op2 = mCamarero();

                        switch (op2) {
                            case 1://Insertar Mesa
                                //Pedir que rellene de datos a usuario
                                Mesa mesaNueva = new Mesa();
                                mesaNueva.pedirDatos();
                                CRUD.insertarMesaNueva(mesaNueva);
                                break;
                            case 2://Borrar Mesa
                                System.out.print("Introduce nombre de la mesa: ");
                                String nombre = lector.next();
                                CRUD.eliminarMesa(nombre);
                                break;
                            case 3://Listar Mesa
                                CRUD.listarMesas();
                                break;
                            case 4://Buscar Mesa
                                System.out.print("Introduce nombre de la mesa a actualizar: ");
                                String nombre1 = lector.next();
                                CRUD.modificarMesa(nombre1);
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
