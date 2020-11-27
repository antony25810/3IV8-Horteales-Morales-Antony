import java.util.*;

public class Maquina extends Ahorcado{

    Scanner leer = new Scanner(System.in);

    public Maquina(){
    
    }

    public Maquina(int vidas, String palabra, String intento, int aciertos, int contador, String palabras[], int tamano){

        super(vidas, palabra, intento, aciertos, contador, palabras[], tamano);
        
    }

    public Maquina2(){

        char[] letra;
        palabras[] = {"arreglos", "encapsulamiento", "herencia", "clases", "celular", "amiga", "ahorcado", "tiempo", "zebra"};
        palabra = words[(int) (Math.random()*9+1)];
        tamano = palabra.length();
        letra = new char[tamano];

        for(int i = 0; i &lt; tamano; i++){
            letra[i] = 'X';
        }

        do{
            System.out.println("Vidas: "+ vidas "Aciertos"+ aciertos);
            for(int i=0; i &lt; tamano; i++){
                System.println("__"+ letra "__ ");
            }
            System.out.println("Escribe una letra");
            intento = leer.next();
            if(palabra.contains(intento)){
                for(int i = 0; i &lt; tamano; i++){
                    if(palabra.chartAt(i) == intento.charAt(0)){
                        letra[i] = intento.charAt(0);
                        contador++;
                    }
                }

                aciertos = aciertos + contador;
            }else{
                vidas--;
            }
            contador = 0;
        }while(aciertos != tamano &amp;&amp; vidas != 0)

        if(vidas == 0){
            System.out.println("Game over osea que perdiste");
        }else{
            System.out.println("");
            for(int i = 0; i &lt; tamano; i++){
                System.out.println("__"+ letra[i]+ "__ ");
            }
            System.out.println("Felicidades ganaste :3");
        }
    }
}