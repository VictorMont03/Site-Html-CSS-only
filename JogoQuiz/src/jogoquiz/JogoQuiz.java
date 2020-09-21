
package jogoquiz;

import javax.swing.*;

public class JogoQuiz {


    public static void main(String[] args) {
        int pontos = 0;
        String usuario;
        usuario = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "seja bem vindo(a)!"+usuario);
        String pergunta;
        
        pergunta = JOptionPane.showInputDialog("\n Usuário: "+usuario+" Pontos: "+pontos+"\n"
        +"1-Qual jogador foi eleito o melhor do mundo em 2018?\n"
        +"A) CR7\n"  
        +"B) Messi\n"
        +"C) Modric\n");
        if("C".equals(pergunta) || "c".equals(pergunta) ){
            JOptionPane.showMessageDialog(null, "Resposta Correta");
            pontos++;
        }else{
            JOptionPane.showMessageDialog(null, "Resposta Incorreta!");
            JOptionPane.showMessageDialog(null,"sua pontuação foi: "+pontos);
            System.exit(0);
        }
        
        pergunta = JOptionPane.showInputDialog("\n Usuário: "+usuario+" Pontos: "+pontos+"\n"
        +"2-Qual jogador foi eleito o MVP da temporada 17-18 da NBA?\n"
        +"A) Curry\n"
        +"B) Lebron\n"
        +"C) Harden\n");
        if("C".equals(pergunta) || "c".equals(pergunta) ){
            JOptionPane.showMessageDialog(null, "Resposta Correta");
            pontos++;
        }else{
            JOptionPane.showMessageDialog(null, "Resposta Incorreta!");
            JOptionPane.showMessageDialog(null,"sua pontuação foi: "+pontos);
            System.exit(0);
        }
    }
    
}
