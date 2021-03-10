package Aula_02.GridLayot;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class grid extends JFrame {
    
    private GridLayout layer =  null;

    public grid(){
        
        super("Teste de gridLayout");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800,400));

        layer = new GridLayout(3,3);
        getContentPane().setLayout(layer);

        for(int i = 0 ;i< 9;i++){

            add(new JButton("botão "+ i));
        }

        pack();


    }
    


}
