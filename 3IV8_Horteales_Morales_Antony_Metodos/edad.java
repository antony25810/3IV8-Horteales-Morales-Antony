import java.util.Scanner;

public class edad{

    Scanner leer = new Scanner(System.in);

    public int datos(){

        int principio, fin, edad;

        System.out.println("Escriba su año de nacimiento");
        principio = leer.nextInt();
        System.out.println("Escriba el año actual");
        fin = leer.nextInt();
        
        edad = fin - principio;
        return edad;
    }

    public void operacion(){

        int edad, principio, fin;

        principio = leer.nextInt();
        fin = leer.nextInt();

        edad = fin-principio;
        if(edad>0){
            System.out.println("Su edad es: " + edad);
        }else{
            System.out.println("Sus fechas son erroneas");
        }
    }


    
}