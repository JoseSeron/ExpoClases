
package expoclase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * EXPO CLASE INSTRUCCIONES:
 * 1) Crear una clase
 * 2) Exponerla 
 * 3) Ir por baleadukissss :D
 * 
 * */
public class ExpoClase {

 
    public static void main(String[] args) {

        mensajeBienvenida();

        ArrayList<Carro> carros = new ArrayList();

        boolean bandera = true;

        while (bandera) {
            int op = menuPrincipal();
            switch (op) {
                case 1: //agregar    DONE
                    carros = agregarCarro(carros);
                    break;
                case 2:// modificar
                    carros = modificarCarro(carros);
                    break;
                case 3://eliminar  DONE
                    eliminarCarro(carros);
                    break;
                case 4://mostrar     DONE
                    mostrarLista(carros);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    bandera = false;
                    break;

                default:
                    System.out.println("Por favor, ingrese el numero correspondiente a una opcion valida");
            } //switch
        } //while

    } //main
    
    public static ArrayList<Carro> modificarCarro(ArrayList<Carro> carros){
    Scanner entrada = new Scanner(System.in);
    Scanner entrada1 = new Scanner(System.in);
    mostrarLista(carros);
        System.out.println("Ingrese la pocision del vehiculo que desea alterar:");
        int pos = entrada.nextInt();
        System.out.println("Ingrese la marca del vehículo: ");
        String marca = entrada1.nextLine();
        System.out.println("Ingrese el modelo del vehículo: ");
        String modelo = entrada1.nextLine();
        System.out.println("Ingrese el año del vehículo: ");
        int año = entrada.nextInt();
        System.out.println("Ingrese la cantidad de puertas del vehículo: ");
        int cantidadPuertas = entrada.nextInt();
        System.out.println("Ingrese el color del vehículo:");
        String color = entrada1.nextLine();
        System.out.println("Ingrese una referencia al motor del vehículo:");
        String motor = entrada1.nextLine();
        carros.get(pos).setAño(año);
        carros.get(pos).setCantidadPuertas(cantidadPuertas);
        carros.get(pos).setColor(color);
        carros.get(pos).setMarca(marca);
        carros.get(pos).setModelo(modelo);
        carros.get(pos).setMotor(motor);
        System.out.println("<-----------VEHICULO ACTUALIZADO----------->");
        System.out.println("");
        
    
        return carros;
    }

    public static ArrayList<Carro> eliminarCarro(ArrayList<Carro> carros) {
        Scanner entrada = new Scanner(System.in);
        mostrarLista(carros);
        System.out.println("Ingrese el numero de lista del vehículo que salio de la colección");
        int pos = entrada.nextInt();
        carros.remove(pos);
        System.out.println("<-----------VEHICULO ELIMINADO----------->");
        System.out.println("");
        return carros;
    }

    public static void mostrarLista(ArrayList<Carro> carros) {
        System.out.println("<-----------IMPRIMIENDO LISTA----------->");
        int cont = 0;
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(i + "->" + carros.get(i));
        }
        System.out.println("<---------------FIN LISTA--------------->");
        System.out.println("");
    }

    public static ArrayList<Carro> agregarCarro(ArrayList<Carro> carros) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);

        //public Carro(String marca, String modelo, int año, String cantidadPuertas, String color, String motor)
        
        System.out.println("Ingrese la marca del vehículo: ");
        String marca = entrada1.nextLine();
        System.out.println("Ingrese el modelo del vehículo: ");
        String modelo = entrada1.nextLine();
        System.out.println("Ingrese el año del vehículo: ");
        int año = entrada.nextInt();
        System.out.println("Ingrese la cantidad de puertas del vehículo: ");
        int cantidadPuertas = entrada.nextInt();
        System.out.println("Ingrese el color del vehículo:");
        String color = entrada1.nextLine();
        System.out.println("Ingrese una referencia al motor del vehículo:");
        String motor = entrada1.nextLine();

        Carro nuevoCarro = new Carro(marca, modelo, año, cantidadPuertas, color, motor);
        carros.add(nuevoCarro);
        System.out.println("<-----------VEHICULO AGREGADO----------->");
        System.out.println("");
        return carros;
    }

    public static int menuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que accion desea realizar?");
        System.out.println("1--> Agregar vehículo a la colección");
        System.out.println("2--> Modificar los datos de un vehculo");
        System.out.println("3--> Eliminar un vehículo de la colección");
        System.out.println("4--> Mostrar coleccion Actual");
        System.out.println("5--> Salir del programa");
        int opcion = entrada.nextInt();
        return opcion;
    }
    
public static void mensajeBienvenida(){
        System.out.println("BIENVENIDO AL GESTOR DE SU COLECCIÓN DE VEHICULOS");
        System.out.println("<------------------------------------------------->");
        System.out.println("");
}
  
}//FIN CLASE
