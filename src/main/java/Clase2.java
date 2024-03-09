//Matrices

public class Clase2 {

    public void matrix() {

        char matriz[][] = new char[6][4];

        matriz[0][0] = 'R';
        matriz[0][1] = 'R';
        matriz[0][2] = 'R';
        matriz[0][3] = 'R';
        matriz[1][0] = 'R';
        matriz[1][1] = ' ';
        matriz[1][2] = ' ';
        matriz[1][3] = 'R';
        matriz[2][0] = 'R';
        matriz[2][1] = 'R';
        matriz[2][2] = 'R';
        matriz[2][3] = 'R';
        matriz[3][0] = 'R';
        matriz[3][1] = 'R';
        matriz[3][2] = ' ';
        matriz[3][3] = ' ';
        matriz[4][0] = 'R';
        matriz[4][1] = ' ';
        matriz[4][2] = 'R';
        matriz[4][3] = ' ';
        matriz[5][0] = 'R';
        matriz[5][1] = ' ';
        matriz[5][2] = ' ';
        matriz[5][3] = 'R';

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print(matriz[fila][columna]);

            }

            System.out.println();

        }

    }

}