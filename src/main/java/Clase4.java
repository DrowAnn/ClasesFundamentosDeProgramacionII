//Colas

import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Clase4 {

    public void colas() {

        Queue<String> cola = new LinkedList<String>();

        cola.add("Hola,");
        cola.add("como");
        cola.add("estas?");

        while(true){

            try{
                
                System.out.println(cola.remove());
                
             }catch(NoSuchElementException e){
                
                System.out.println("No hay mas elementos en la cola");
                 break;
             
            }
            
        }

    }

}