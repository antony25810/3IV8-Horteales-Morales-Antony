import java.util.Scanner;

public class llamadas{

    Scanner leer = new Scanner(System.in);

    public void menuu(){

        int opcion;
        char letra;

        do{
            System.out.println("Elija su consulta");
            System.out.println("1. llamadas telefonicas");
            System.out.println("2. credito");
            System.out.println("3. Salir");

            opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    Llamadas();
                    break;
                case 2:
                    Credito();
                    break;
                default:
                System.out.println("Gracias hasta la proxima");
            }
            System.out.println("¿Desea hacer otra consulta?, si es asi escriba s");
            letra = leer.next().charAt(0);
        }while(letra == 's');
    }

    public void Llamadas(){

        double total, nacional, internacional, celular;

        System.out.println("Numero de llamadas nacionales");
        nacional = leer.nextDouble();
        System.out.println("Numero de llamadas internacionales");
        internacional = leer.nextDouble();
        System.out.println("Numero de llamadas celulares");
        celular = leer.nextDouble();

        total = nacional*0.5+internacional*0.6+celular*0.2;

        System.out.println("Su total es de: "+ total);
    }

    public void Credito(){

        double total, credito;
        int numero, creditoi;

        System.out.println("Numero de telefono");
        numero = leer.nextInt();
        System.out.println("credito");
        creditoi = leer.nextInt();

        do{
            Llamadas();
            total = 0;
            credito = creditoi - total;
            System.out.println("Su credito es de: "+ credito);
        }while(credito == creditoi);
    }
}