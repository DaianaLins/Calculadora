
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;



/**
 *
 * @author Daiana Lins 
 * 
 * Teste da calculadora
 */
public class TestaCalculadora {

    public static void main(String args[]) {
     /**
 *
 * Para receber valores e novos valores
 */
        Calculadora testa = new Calculadora();
 /**
 *
 *Definindo os botões de fechar, minimizar e maxinizar do Frame 
 */
        testa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         /**
 *
 * Dimensões da tela, botões, tamanho do cursor, localização do painel e tornando-a visível 
 */
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        testa.setSize(new Dimension(300, 400));
        testa.setBounds(100, 100, 300, 300);
      
        testa.setLocation((tamanhoTela.width - 400) / 2, (tamanhoTela.height - 300) / 2);
        testa.setVisible(true);
    }

}
