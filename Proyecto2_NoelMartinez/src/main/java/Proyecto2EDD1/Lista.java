package Proyecto2EDD1;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Noel
 */
public class Lista {

    static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();

    static ArrayList listaPila = new ArrayList<>();
    static ArrayList listaCola = new ArrayList<>();

    public void imprimirPila() {
        for (int i = 0; i < listaPila.size(); i++) {
            //se imprimen los strings acumulados
            System.out.println("[ " + listaPila.get(i) + " ]");
        }
        System.out.println("");
    }

    public void imprimirCola() {
        for (int i = 0; i < listaCola.size(); i++) {
            System.out.println("[ " + listaCola.get(i) + " ]");
        }
        System.out.println("");
    }

    public void anularPila() {
        listaPila.removeAll(listaPila);
    }

    public void anularCola() {
        listaCola.removeAll(listaCola);
    }

}
