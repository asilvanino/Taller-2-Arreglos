/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;



/**
 *
 * @author SIL
 */
public class ParejaValorAbsoluto {

    public void imprimirParejasdenumeros() {
        int Array[] = {8, 9, 17, 13, 2, 14, 5, 11};
        int d = 4;
        int j = 0, k = 0, x = 0;

        for (int i = 0; i < Array.length; i++) {
            j++;
            k = j;

            while (k < Array.length) {

                int result = Array[i] - Array[k];
                int abs = Math.abs(result);
                if (abs == d) {
                    x++;
                    System.out.print(x + ".");
                    System.out.println("La pareja cullo resultado es" + d + "," + "son" + Array[i] + "-" + Array[k]);
                }
                k++;
            }

        }
 
        System.out.println("");
    }
}
