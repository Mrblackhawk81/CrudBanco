import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("***BANCO***\n" +
                    "1.-Ingresar Cliente\n" +
                    "2.-Mostrar Clientes y monto de la cuenta\n" +
                    "3.-Ingresar Dinero\n" +
                    "4.-Modificar Datos\n" +
                    "5.-Retirar Dinero\n" +
                    "6.-Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    Funciones.ingresarCliente();
                    break;
                case 2:
                    Funciones.mostrarClientes();
                    break;
                case 3:
                    Funciones.ingresarDinero();
                    break;
                case 4:
                    Funciones.modificarDatos();
                    break;
                case 5:
                    Funciones.retirarDinero();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (opcion!=6);
    }


}