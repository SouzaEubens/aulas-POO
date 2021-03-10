package AULAS_POO.Aula_01.exemplo_001;

import javax.swing.JFrame ;
import javax.swing.JLabel ;

public class criar_JFrame {
    
    public static void main(String[] args){

        JFrame frame = new JFrame();

        frame.setSize(300,300);
        frame.setTitle("testando");
        frame.setLocation(10,10);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel teste = new JLabel("estou apenas bricando");

        frame.add(teste);








    }

}
