import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

class banco { }
class cuenta {

public class OpBank{
    public void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) 
        {
            System.out.println("1. Registrar cuenta ");
            System.out.println("2. Acceder al saldo");
            System.out.println("3. Salir");

            try 
            {
                System.out.println("Escoge una opcion: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        {
                            
                            
                            long RegistrarCuenta(String nombre; String direccion; float saldo; int nip){

                                cuenta c1 = new cuenta();

                                System.out.println("Ingrese el nombre del cliente: ");
                                c1.nombre = scanner.nextLine();

                                System.out.println("Ingrese la direccion del cliente: ");
                                c1.direccion = scanner.nextLine();

                                System.out.println("Ingrese el saldo del cliente: ");
                                c1.saldo = scanner.nextInt();

                                System.out.println("Ingrese el nip del cliente: ");
                                c1.nip = scanner.nextInt();
                                
                                c1.setNumcuenta = Math.random()*100000 + 1);

                                System.out.println("Su numero de cuenta es: "+c1.numcuenta);
                            
                            }
                           
                           
                            break; 
                        }
                    case 2:
                    {
                        public float AccederSaldo(int nip; long numcuenta){

                            
                            System.out.println("Ingrese su numero de cuenta: ");
                            int auxnumcuenta = scanner.nextInt();

                            System.out.println("Ingrese su nip: ");
                            int auxnip = scanner.nextInt();

                            
                            public void ComprobarDatos(int nip, long numcuenta){

                                if((auxnumcuenta == c1.numcuenta) && (auxnip == c1.nip))
                                {
                                    System.out.println("Su saldo actual es de: "+c1.saldo);
                                }
                                else
                                {
                                    System.out.println("El numero de cuenta o nip ingresado es incorrecto" );
                                }

                                }

                        }
                        break;
                    }
                    case 3:
                    {
                        salir = true;
                        break;
                    }
                        
                    default:
                        break;
                   
                } }
                    catch (InputMismatchException e) 
                    {
                    sn.next();
                    }
                
            }
        
    }}


}
