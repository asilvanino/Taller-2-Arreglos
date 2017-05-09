/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author SIL
 */
public class DiferenciaMayor {

    public void DiferenciaMayor() {

        int Array[] = {16, 3, 10, 9, 8};

        int d;
        int j = 0;

        for (int i = 0; i < Array.length; i++) {
            System.out.println(" ");
            j++;
            int k = j;

            while (k < Array.length) {

                if (Array[k] > Array[j]) {
                    d = Array[i] - Array[k];
                    System.out.print(d + ",");
                }

                k++;

            }

        }
        
        System.out.println("");
    }

}
