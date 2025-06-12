package resolucaotela;

import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();       
        
        System.out.println("Sua tela tem resolução "+t.getScreenSize().width+" x "+t.getScreenSize().height);
    }
    
}
