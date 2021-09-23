package Proyecto2EDD1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Noel
 */
public class Transaccion {

    static Random ran = new Random();
    static ArrayList listaTransaccion = new ArrayList<>();

    public String Transaccion() {
        String transaccionString = "";
        int random = ran.nextInt(4);
        while(random < 1 || random > 3){
            random = ran.nextInt(4);
        }
        switch(random){
            case 1:{
                transaccionString = "Retiro";
            }
            break;
            case 2:{
                transaccionString = "Deposito";
            }
            break;
            case 3:{
                transaccionString = "Pago";
            }
            break;
        }
        listaTransaccion.add(transaccionString);
        return transaccionString;
    }
    
    public ArrayList getListaTransaccion(){
        return this.listaTransaccion;
    }
}
