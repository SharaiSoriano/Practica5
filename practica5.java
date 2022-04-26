package practica5;
import java.util.Scanner;

class main {
    public static void main(String[] args)
    {
    byte opcion, posicion;
    banco cuenta = new banco();
    Scanner ingreso = new Scanner(System.in);
    do
    {
    System.out.println("\n OPERACIONES BANCARIAS\n");
    System.out.println("\n1. Crear cuenta.");
    System.out.println("\n2. Acceder a cuenta.");
    System.out.println("\n3. Salir.");
    System.out.print("\nIngrese una opcion: ");

    opcion = ingreso.nextByte();
    switch(opcion)
    {
    case 1: cuenta.setCuenta(ingreso);
    break;
    case 2: posicion = cuenta.iniciarSesion(ingreso);

    if(posicion != -1)
        cuenta.menu(posicion, ingreso);

    break;

    case 3: System.out.println("\nGracias por su preferencia");
    }
    }while(opcion != 3);
    ingreso.close();
    }
}