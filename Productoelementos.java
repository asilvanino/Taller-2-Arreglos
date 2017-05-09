/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author SIL
 */
public class Productoelementos {

    public void ProductoElementos() {
        int A[] = {10, 4, 1, 6, 2};
        int B[] = {0, 0, 0, 0, 0};

        for (int x = 0; x < A.length; x++) {

            System.out.print(A[x] + ",");
        }

        System.out.println("");

        int aux = - 1;
        int x = -1;

        for (int i = 0; i < A.length; i++) {
            int prod = 1;
            aux++;
            for (int j = 0; j < A.length; j++) {

                if (j != aux) {

                    prod = A[j] * prod;
                } else {

                }

            }

            x++;
            B[x] = prod;

        }

        for (int k = 0; k < B.length; k++) {

            System.out.print(B[k] + ",");

        }
        
        System.out.println("");

    }
    
   

}
