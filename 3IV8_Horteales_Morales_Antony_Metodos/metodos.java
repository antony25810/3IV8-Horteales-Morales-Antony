import java.util.Scanner;

public class metodos{

    public static void main(String[] args){

        int opcion;

        Scanner leer = new Scanner(System.in);
        Ejercicios obj = new Ejercicios();

        System.out.println("Elija la opción deseada");
        System.out.println("1.Edad");

        opcion = leer.nextInt();

        switch(opcion){
            case 1:
            obj.datos();
            obj.operacion();
            break;
        }
        

    }
}