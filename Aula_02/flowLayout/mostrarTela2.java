package Aula_02;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;

public class mostrarTela2 extends JFrame {

    public mostrarTela2(){

        super("Testando flow2");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,200));
        getContentPane().setLayout(new FlowLayout());

        for(int i = 0; i < 5; i++){

            add(new JButton("buttao "+ i));
        }



    }

    
}
