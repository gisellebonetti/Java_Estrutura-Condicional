
package codegirls;

import javax.swing.JOptionPane;

public class CodeGirls {

    public static void main(String[] args) {
        
        String nome;
        int idade;
        
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        idade = Integer.parseInt (JOptionPane.showInputDialog("Digite a sua idade: "));
        
        if (idade <18) {
            JOptionPane.showMessageDialog(null, nome+"," + "\n" + "Você é menor de idade");
        }
        else
            if (idade >18) {
                JOptionPane.showMessageDialog(null, nome+"," + "\n" + "Você é maior de idade");
            }
    }
    
}
