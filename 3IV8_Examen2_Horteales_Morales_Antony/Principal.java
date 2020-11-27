import java.util.*;

public class Principal{

    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);
        Int opcion;
        char letra;
        Maquina ia = new Maquina();


        do{
            System.out.println("Bienvenido al juego ahorcado");
            System.out.println("Elija el modo de juego");
            System.out.println("1. jugador vs IA");
            System.out.println("2. jugador vs jugador");
            System.out.println("3. Salir");
            
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ia.Maquina2();
                break;
        
                default:
                    System.out.println("Hasta luego");
            }
            System.out.println("¿Quieres jugar de nuevo?, escribe s");
            letra = leer.next().charAt(0);
        }while(letra == 's');
    }
}