/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author nereu
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
            "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
        //Sugestão da aula: Verificar se o ano atual é bissexto e fazer com que o mês de Fev receba 29 dias
        int anoAtual = 2025;
        if ((anoAtual % 4 == 0 && anoAtual % 100 != 0) || (anoAtual % 4 == 0 && (anoAtual % 100 == 0 && anoAtual % 400 == 0))) {
            tot[1] = 29;
        }
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem "
                    + tot[c] + " dias ao todo.");
        }
    }

}
