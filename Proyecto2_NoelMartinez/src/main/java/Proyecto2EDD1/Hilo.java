package Proyecto2EDD1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Noel
 */
public class Hilo extends Thread {

    private boolean vivo;
    static ArrayList listaTemporal = new ArrayList();
    static private int valor;
    static private ArrayList valores = new ArrayList();
    static private Cola cola = new Cola();
    static int cont=0 ;
    public void run(int cajeros) {
        do {
            try {
                cola.agregarCola(cajeros);
                cont++;   
                Thread.sleep(1200);
            } catch (InterruptedException ex) {
            }
        } while (cont <= 100);
    }
    
    public ArrayList run2(int cajeros){
        do {
                try {
                    listaTemporal = cola.agregarColas1(cajeros);
                    cont++;
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                }
        } while (cont <= 100);
        return listaTemporal;
    }
}
