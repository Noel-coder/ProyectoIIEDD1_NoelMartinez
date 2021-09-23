package Proyecto2EDD1;

import java.util.ArrayList;

/**
 *
 * @author Noel
 */
public class Pila extends Lista {

    public void meterPila() {
        Transaccion transaccion = new Transaccion();
        ArrayList listaTemporal = new ArrayList();
        listaTemporal = transaccion.getListaTransaccion();
        listaPila = listaTemporal;
    }

    @Override
    public void imprimirPila() {
        for (int i = 0; i < listaPila.size(); i++) {
            System.out.println("[" + listaPila.get(i) + "]");
        }
        System.out.println("");
    }
    
    public char TopePila(){
        System.out.println(listaPila);
        int tam = listaPila.size();
        char cad;
        cad = (char) listaPila.get(tam);
        return cad;
    }
}
