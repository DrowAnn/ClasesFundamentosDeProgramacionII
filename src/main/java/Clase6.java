//Ordenamiento por Selección

import java.util.*;

public class Clase6 {

    public void ordenamientoSeleccion() {

        Integer arreglo[] = { 8, 9, 3, 6, 5, 1, 10, 11, 13, 15, 3, 2, 4, 25, 0 };
        Integer min, aux2;

        for (int i = 0; i < arreglo.length; i++) {
            min = arreglo[i];
            int aux1 = i;
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[j] < min) {
                    min = arreglo[j];
                    aux1 = j;
                }
            }
            aux2 = arreglo[i];
            arreglo[i] = min;
            arreglo[aux1] = aux2;
        }

        System.out.println(Arrays.toString(arreglo));

    }

}