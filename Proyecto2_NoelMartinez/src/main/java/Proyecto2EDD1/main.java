package Proyecto2EDD1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Noel
 */
public class main {

    static Scanner sc = new Scanner(System.in);
    static Hilo hilo = new Hilo();

    public static void main(String[] args) {
        int opcion, cantCajeros;
        System.out.println("|---------------------------|");
        System.out.println("  Banco Central de Honduras  ");
        System.out.println("|---------------------------|");
        System.out.println("Estamos ingresando al banco");
        System.out.println("Porfavor espere 5 segundos mientras ingresamos!");
        entradaBanco(5);
        System.out.println("Bienvenido!");
        System.out.println("Porfavor Ingrese la cantidad de cajeros que necesita: ");
        cantCajeros = sc.nextInt();
        while (cantCajeros <= 0) {
            System.out.println("ERROR 0X0FD3! La cantidad de cajeros debe ser mayor a 0!");
        }

        opcion = menu();
        switch (opcion) {
            case 1: {
                try {
                    Cola cola = new Cola();
                    Pila pila = new Pila();
                    int respuesta = 0, temporal = 0;
                    cola.agregarCola(cantCajeros);
                    hilo.run(cantCajeros);
                    pila.meterPila();
                    pila.imprimirPila();
                    pila.anularPila();
                    cola.anulaCola();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            case 2: {
                try {
                    ArrayList lista = new ArrayList();
                    Pila pila2 = new Pila();
                    Cola cola2 = new Cola();
                    for (int i = 0; i < cantCajeros; i++) {
                        lista = hilo.run2(cantCajeros);
                    }
                    pila2.meterPila();
                    pila2.imprimirPila();
                    pila2.anularPila();
                    cola2.anularCola();
                    lista.removeAll(lista);
                } catch (Exception e) {

                }
            }
            case 3: {
                System.out.println("Gracias por utilizar el simulador de transacciones!");
            }
        }
    }

    public static void entradaBanco(long segundos) {
        try {
            Thread.currentThread().sleep(segundos * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int menu() {
        while (true) {
            System.out.println("1)Una cola para todo el banco");
            System.out.println("2)Una cola por cajero");
            System.out.println("3)Salir del banco");
            System.out.println("Elija una opcion");
            int valor;
            valor = sc.nextInt();
            if (valor > 0 && valor < 4) {
                return valor;
            }
        }
    }

}
