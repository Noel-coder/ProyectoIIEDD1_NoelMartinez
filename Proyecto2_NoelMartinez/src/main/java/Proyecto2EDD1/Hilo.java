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
    static private Random ran = new Random();
    static int cont=0 ;
    public void run(int cajeros) {
        do {
            try {
                cola.agregarCola(cajeros);
                int random = 0;
                random = ran.nextInt(3) + 1;
                /*while (random < 1 || random > 3) {
                    random = ran.nextInt(3) + 1;
                }*/
                cont++;   
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        } while (cont <= 100);
    }
    
    public ArrayList run2(int cajeros){
        do {
                try {
                    listaTemporal = cola.agregarColas1(cajeros);
                    int random = 0;
                    random = ran.nextInt(3) + 1;
                    while (random < 1 || random > 3) {
                        random = ran.nextInt(3) + 1;
                    }
                    switch (random) {
                        case 1: {
                            valor = 10;
                            cont=cont + valor;
                            this.valores.add(valor);
                        }break;
                        case 2: {
                            valor = 20;
                            cont=cont + valor;
                            this.valores.add(valor);
                        }break;
                        case 3: {
                            valor = 30;
                            cont=cont + valor;
                            this.valores.add(valor);
                        }break;
                    }
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                }
        } while (cont <= 1200);
        return listaTemporal;
    }
}
