/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author nereu
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v); // O método .sort() da classe Arrays irá organizar o vetor
        for(double valor: v) {
            System.out.print(valor + " ");
        }
    }
    
}
