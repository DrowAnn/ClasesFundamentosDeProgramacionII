//Colas

import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Clase4 {

    public void colas1() {

        Queue<String> cola = new LinkedList<String>();

        cola.add("Hola,");
        cola.add("como");
        cola.add("estas?");

        while (true) {
            try {
                System.out.println(cola.remove());
            } catch (NoSuchElementException e) {
                System.out.println("No hay mas elementos en la cola");
                break;
            }
        }

    }

    public void colas2() {

        Queue<String> cola = new LinkedList<String>();
        String arreglo[] = { "Me", "llamo", "Robert" };

        for (int posicion = 0; posicion < arreglo.length; posicion++) {
            cola.add(arreglo[posicion]);
        }

        while (true) {
            try {
                System.out.println(cola.remove());
            } catch (NoSuchElementException e) {
                System.out.println("No hay mas elementos en la cola");
                break;
            }
        }

    }

}