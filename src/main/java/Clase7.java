//Ordenamiento por Inserción

import java.util.*;

public class Clase7 {

    public void ordenamientoInsercion() {

        Integer arreglo[] = { 8, 9, 3, 6, 5, 1, 10, 11, 13, 15, 3, 2, 4, 25, 0 };
        Integer aux;
        
        for (int i = 1; i < arreglo.length; i++){
            for (int j = (i-1); j >= 0; j--){
                if (arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }else{
                    break;
                }
            }
        }
        
        System.out.println(Arrays.toString(arreglo));

    }

}