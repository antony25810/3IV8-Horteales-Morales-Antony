import java.util.Scanner;

public class areas{

    Scanner leer = new Scanner(System.in);

    public void menu(){

        int opcion;
        double radio, lado, lado2, lado3, baset, alturat, base, altura, pi=3.1416;
        char letra;

        do{
            System.out.println("Elija la operacion deseada");
            System.out.println("1. Area y perimtro de un circulo");
            System.out.println("2. Area y perimetro de un triangulo");
            System.out.println("3. Area y perimetro de un rectangulo");
            System.out.println("4. Area y perimetro de un cuadrado");
            System.out.println("5. Salir");

            opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Numero del radio");
                    radio = leer.nextInt();
                    Area();
                    Perimetro();
                    break;

                case 2:
                    System.out.println("Numero de base");
                    baset = leer.nextDouble();
                    System.out.println("Numero de altura");
                    alturat = leer.nextDouble();
                    System.out.println("Numero de lado");
                    lado2 = leer.nextDouble();
                    System.out.println("Numero del tercer lado");
                    lado3 = leer.nextDouble();
                    Area();
                    Perimetro();
                    break;
                case 3:
                    System.out.println("numero de base");
                    base = leer.nextDouble();
                    System.out.println("Numero de altura");
                    altura = leer.nextDouble();
                    Area();
                    Perimetro();
                    break;
                case 4:
                    System.out.println("Numero de un lado");
                    lado = leer.nextDouble();
                    Area();
                    Perimetro();
                    break;
                default:
                    System.out.println("Gracias por usar metodos");
            }
            System.out.println("¿Desea repetir el programa?, si es asi escriba s");
            letra = leer.next().charAt(0);

        }while(letra == 's');
    
    }
        
    public void Area(){

        double radio, lado, baset, alturat, base, altura, area1, area2, area3, area4, pi=3.1416;
        int opcion;
            
        opcion = leer.nextInt();

        switch(opcion){
            case 1:
                radio = leer.nextDouble();
                area1 = pi*radio*radio;
                break;
            case 2:
                baset = leer.nextDouble();
                alturat = leer.nextDouble();
                area2 = (baset*alturat)/2;
                break;
            case 3:
                base = leer.nextDouble();
                altura = leer.nextDouble();
                area3 = base*altura;
                break;
            case 4:
                lado = leer.nextDouble();
                area4 = lado*lado;
                break;
        }
    }

    public void Perimetro(){

        double radio, lado, lado2, lado3, baset, alturat, base, altura, perimetro1, perimetro2, perimetro3, perimetro4, pi=3.1416;
        int opcion;

        opcion = leer.nextInt();

        switch(opcion){
            case 1:
                radio = leer.nextDouble();
                perimetro1 = pi*radio*2;
                break;
            case 2:
                baset = leer.nextDouble();
                alturat = leer.nextDouble();
                lado2 = leer.nextDouble();
                lado3 = leer.nextDouble();
                perimetro2 = baset+lado2+lado3;
                break;
            case 3:
                base = leer.nextDouble();
                altura = leer.nextDouble();
                perimetro3 = (base*2)+(altura*2);
                break;
            case 4:
                lado = leer.nextDouble();
                perimetro4 = lado*4;
                break;
        }
    }
}