//Ordenamiento por Selección

import java.util.*;

public class Clase6 {

    public void ordenamientoSeleccion() {

        Integer arreglo[] = { 8, 9, 3, 6, 5, 1, 10, 11, 13, 15, 3, 2, 4, 25, 0 };
        Integer min, aux;

        for (int i = 0; i < (arreglo.length - 1); i++) {
            min = i;
            for (int j = (i + 1); j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }

        System.out.println(Arrays.toString(arreglo));

    }

}