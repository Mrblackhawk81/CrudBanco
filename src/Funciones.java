import java.util.Scanner;

public class Funciones {

    private static String[] nombres = new String[0];
    private static Double[] dinero = new Double[0];

    public static void  ingresarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de clientes a ingresar");
        int n = sc.nextInt();
        String[] temp = new String[nombres.length +n];
        Double[] tempDinero = new Double[dinero.length +n];
        System.arraycopy(nombres,0,temp,0,nombres.length);
        System.arraycopy(dinero,0,tempDinero,0,dinero.length);

        for (int i = nombres.length; i < temp.length ; i++) {
            System.out.println("Ingrese el nombre del cliente");
            temp[i] = sc.next();
            tempDinero[i] = 0.0;
        }
        nombres = temp;
        dinero = tempDinero;
    }
    public static void mostrarClientes(){
        if (nombres.length == 0){
            System.out.println("No hay clientes registrados");
            return;
        }
        System.out.println("Lista de clientes");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Cliente "+nombres[i]+ ", Saldo: "+dinero[i]);
        }
    }
    public static void modificarDatos(){
        Scanner sc = new Scanner(System.in);
        if (nombres.length == 0){
            System.out.println("No hay clientes registrados");
            return;
        }
        System.out.println("Ingrese el nombre del cliente a modificar");
        String rename = sc.next();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(rename)) {
                System.out.println("Ingrese el nuevo nombre");
                String newName = sc.next();
                nombres[i] = newName;
            }
        }
    }
    public static void ingresarDinero(){
        Scanner sc = new Scanner(System.in);
        if (nombres.length == 0){
            System.out.println("No hay clientes registrados");
            return;
        }
        System.out.println("Ingrese el nombre del cliente a depositar");
        String name = sc.next();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(name)){
                System.out.println("Ingrese la cantida de dinero a depositar");
                double money = sc.nextDouble();
                dinero[i]+=money;
                System.out.println("Deposito exitoso. El saldo antual de "+name+" es de: "+dinero[i]);
                return;
            }
        }
        System.out.println("Cliente no encontrado");
    }
    public static void retirarDinero(){
        Scanner sc = new Scanner(System.in);
        if (nombres.length == 0){
            System.out.println("No hay clientes registrados");
            return;
        }
        System.out.println("Ingrese el nombre del cliente");
        String name = sc.next();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(name)){
                System.out.println("Ingrese el monto a retirar");
                double retiro = sc.nextDouble();
                if (retiro > dinero[i]){
                    System.out.println("Dinero insuficiente");
                } else {
                    dinero[i] -= retiro;
                    System.out.println("Se retiro exitosamente. El saldo actual de " + name + " es de: " + dinero[i]);
                    return;
                }
            }
        }
        System.out.println("Cliente no encontrado");
    }
}










