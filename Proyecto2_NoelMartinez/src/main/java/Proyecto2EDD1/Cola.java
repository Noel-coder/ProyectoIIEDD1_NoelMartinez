package Proyecto2EDD1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Noel
 */
public class Cola extends Lista {
    Transaccion transaccion = new Transaccion();
    static Scanner sc = new Scanner(System.in);
    
    @Override
    public void imprimirCola(){
        for (int i = 0; i < listaCola.size(); i++) {
            System.out.println(listaCola.get(i));
        }
        System.out.println("");
    }
    
    public void agregarCola(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Cajero cajero = new Cajero();
            listaCola.add(cajero);
        }
    }
    
     public ArrayList agregarColas1(int cant) {
        for (int i = 0; i < cant; i++) {
            Cajero c = new Cajero();
            listaCola.add(c);
        }
        return listaCola;
    }
    
    public void anulaCola(){
        listaCola.removeAll(listaCola);
    }
    
}


