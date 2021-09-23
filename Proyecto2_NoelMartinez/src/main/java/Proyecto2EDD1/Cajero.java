package Proyecto2EDD1;

import java.util.ArrayList;

/**
 *
 * @author Noel
 */
public class Cajero {
    ArrayList cajero = new ArrayList();
    
    public Cajero(){
        Persona persona = new Persona();
        cajero.add(persona.agregarPersona().toString());
    }
}
