import java.util.*;

public class Ahorcado{

    Scanner leer = new Scanner(System.in);

    private int vidas = 5;
    private String palabra, intento;
    private int aciertos = 0;
    private int contador = 0;
    private String palabras[] = new String[10];
    private int tamano;

    public Ahorcado(){

    }
    public Ahorcado(int vidas, String palabra, String intento, int aciertos, int contador, String palabras[], int tamano){

        this.vidas = vidas;
        this.palabra = palabra;
        this.intento = intento;
        this.aciertos = aciertos;
        this.contador = contador;
        this.palabra[] = palabra[];
        this.tamano = tamano;
    }

    public int getVidas(){
        return vidas;
    }
    public void setVidas(int vidas){
        this.vidas = vidas;
    }

    public String getPalabra(){
        return palabra;
    }
    public void setPalabra(String palabra){
        this.palabra = palabra;
    }
    
    public String getIntento(){
        return intento;
    }
    public void setIntento(String intento){
        this.intento = intento;
    }
    public int getAciertos(){
        return aciertos;
    }
    public void setAciertos(int aciertos){
        this.aciertos = aciertos;
    }
    public int getContador(){
        return contador;
    }
    public void setContador(int contador){
        this.contador = contador;
    }
    public String[] getpalabras(){
        return palabras;
    }
    public void setpalabras(String palabras[]){
        this.palabras[] = palabras[];
    }
    
    public int getTamano(){
        return tamano;
    }
    public void setTamano(int tamano){
        this.tamano = tamano;
    }
}