package Proyecto2EDD1;

import java.util.ArrayList;

/**
 *
 * @author Noel
 */
public class Persona {
    static private ArrayList listaPersona = new ArrayList();
    static private String transaccion;
    Transaccion transaccion_ = new Transaccion();
    
    public Persona(){
        listaPersona.add(transaccion);
    }
    
    public ArrayList agregarPersona(){
        Transaccion trans = new Transaccion();
        transaccion = transaccion_.Transaccion();
        listaPersona.add(transaccion);
        return listaPersona;
    }

    @Override
    public String toString() {
        return Persona.transaccion;
    }
    
}
