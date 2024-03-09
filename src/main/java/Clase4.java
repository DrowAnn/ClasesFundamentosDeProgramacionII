//Colas

import java.util.Queue;
import java.util.LinkedList;

public class Clase4 {

    public void colas() {

        Queue<String> cola = new LinkedList<String>();

        cola.add("Hola,");
        cola.add("como");
        cola.add("estas?");

        System.out.println(cola.poll());

    }

}