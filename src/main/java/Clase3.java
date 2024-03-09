//Pilas

import java.util.Stack;
import java.util.EmptyStackException;

public class Clase3 {

    public void pilas() {

        Stack<Integer> pila = new Stack<Integer>();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        while (true) {

            try {

                System.out.println(pila.pop());

            } catch (EmptyStackException e) {

                System.out.println("La pila esta vacia");
                break;

            }
        }

        System.out.println("El programa es capaz de continuar a pesar de la Excepción");

    }

}