/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import java.util.Scanner;

public class ComponentesMenu {

    //menu principal
    public static int mostrar_menu_add(Scanner entrada) {
        int opcion_seleccionada;
        do {

            System.out.println("**************************************************");
            System.out.println("                        MENU                    ");
            System.out.println("**************************************************");
            System.out.println("¿Que deseas realizar?");
            System.out.println("1. Registrar Productos");
            System.out.println("2. Salir de este menu");

            opcion_seleccionada = entrada.nextInt();
            if (opcion_seleccionada < 1 || opcion_seleccionada > 2) {
                System.out.println("Opcion Incorrecta");
            }
        } while (opcion_seleccionada < 1 || opcion_seleccionada > 2);
        return opcion_seleccionada;
    }

    public static int mostrar_menu_view(Scanner entrada) {
        int opcion_seleccionada;
        do {

            System.out.println("**************************************************");
            System.out.println("                        MENU                    ");
            System.out.println("**************************************************");
            System.out.println("¿Que deseas realizar?");
            System.out.println("1. Ver productos");
            System.out.println("2. Salir de este menu");

            opcion_seleccionada = entrada.nextInt();
            if (opcion_seleccionada < 1 || opcion_seleccionada > 2) {
                System.out.println("Opcion Incorrecta");

            }
        } while (opcion_seleccionada < 1 || opcion_seleccionada > 2);
        return opcion_seleccionada;
    }

    public int tipos_producto(Scanner entrada) {
        int producto_seleccionado;
        do {

            System.out.println("Selecciona tu tipo: ");
            System.out.println("1. Productos Frescos");
            System.out.println("2. Productos Regrigerados");
            System.out.println("3. Productos Congelados");
            System.out.println("4. Productos Envasados");
            producto_seleccionado = entrada.nextInt();
        } while (producto_seleccionado < 1 || producto_seleccionado > 4);

        return producto_seleccionado;
    }

    public int tipos_visualizaciones_categorias(Scanner entrada) {
        int seleccion;
        do {
            System.out.println("*********************************************************************");
            System.out.println("                SELECCIONA LA CATEGORIA A VISUALIZAR                  ");
            System.out.println("*********************************************************************");
            System.out.println("1. Productos Frescos");
            System.out.println("2. Productos Refrigerados");
            System.out.println("3. Productos Congelados");
            System.out.println("4. Productos Envasados");
            seleccion = entrada.nextInt();
        } while (seleccion < 1 || seleccion > 4);
        return seleccion;
    }

    private void encabezado_mensaje() {
        System.out.println("**************************************************");
        System.out.println("        SELECCIONA TU CATEGORIA");
        System.out.println("**************************************************");
    }

    public String tipos_productos_frescos(Scanner entrada) {
        encabezado_mensaje();
        System.out.println("Fruta");
        System.out.println("Verdura");

        boolean bandera = true;
        String seleccion;

        do {
            seleccion = entrada.nextLine();

            if (!seleccion.equals("Fruta") && !seleccion.equals("Verdura")) {
                System.out.println("Opción incorrecta, por favor selecciona Fruta o Verdura.");
            } else {
                bandera = false;
            }

        } while (bandera);

        return seleccion;
    }

    public String tipos_productos_refrigerados(Scanner entrada) {
        encabezado_mensaje();
        System.out.println("Refresco");
        System.out.println("Pizza");
        System.out.println("Hamburguesa");

        boolean bandera = true;
        String seleccion;

        do {
            seleccion = entrada.nextLine();

            if (!seleccion.equals("Refresco") && !seleccion.equals("Pizza") && !seleccion.equals("Hamburguesa")) {
                System.out.println("Opción incorrecta, por favor selecciona Refresco, Pizza o Hamburguesa.");
            } else {
                bandera = false;
            }

        } while (bandera);

        return seleccion;
    }

    public String tipos_productos_congelados(Scanner entrada) {
        encabezado_mensaje();
        System.out.println("Helados");
        System.out.println("Paletas");
        System.out.println("Hielo");

        boolean bandera = true;
        String seleccion;

        do {
            seleccion = entrada.nextLine();

            if (!seleccion.equals("Helados") && !seleccion.equals("Paletas") && !seleccion.equals("Hielo")) {
                System.out.println("Opción incorrecta, por favor selecciona Helados, Paletas o Hielo.");
            } else {
                bandera = false;
            }

        } while (bandera);

        return seleccion;
    }

    public String tipos_productos_envasados(Scanner entrada) {
        encabezado_mensaje();
        System.out.println("Sopa");
        System.out.println("Frijoles");
        System.out.println("Salsa");

        boolean bandera = true;
        String seleccion;

        do {
            seleccion = entrada.nextLine();

            if (!seleccion.equals("Sopa") && !seleccion.equals("Frijoles") && !seleccion.equals("Salsa")) {
                System.out.println("Opción incorrecta, por favor selecciona Sopa, Frijoles o Salsa.");
            } else {
                bandera = false;
            }

        } while (bandera);

        return seleccion;
    }

    public int tipo_de_congelacion_producto(Scanner entrada) {
        int seleccion;

        do {
            System.out.println("*******************************************");
            System.out.println("Selecciona el tipo de congelado:");
            System.out.println("*******************************************");
            System.out.println("1. Congelado por Aire");
            System.out.println("2. Congelado por Agua");
            System.out.println("3. Congelado por Nitrógeno");
            seleccion = entrada.nextInt();
            if (seleccion < 1 || seleccion > 3) {
                System.out.println("Opcion Incorrecta");

            }

        } while (seleccion < 1 || seleccion > 3);

        return seleccion;
    }

}
