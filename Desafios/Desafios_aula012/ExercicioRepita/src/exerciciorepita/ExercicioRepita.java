/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author nereu
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tV = 0, p = 0, i = 0, aCem = 0, m = 0, n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            tV++;
            if(n % 2 == 0) {
                p++;
            } else {
                i++;
            }            
            if(n > 100) {
                aCem++;
            }
        } while(n != 0);
        m = s / tV;
        JOptionPane.showMessageDialog(null, "<html>Resultado<hr>" + 
                "<br>Total de Valores: " + tV + 
                "<br>Total de Pares: " + p + 
                "<br>Total de Ímpares: " + i +
                "<br>Acima de 100: " + aCem + 
                "<br>Média dos Valores: " + m + "</html>");
    }
    
}
