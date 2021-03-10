package Aula_02.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class borderTela extends JFrame {

    private BorderLayout layer = null ;

    public borderTela(){

        super("testando border");
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,200));

        layer = new BorderLayout();

        getContentPane().setLayout(layer);

        layer.setHgap(5);
        layer.setVgap(5);

        add(new JButton("norte"), BorderLayout.NORTH);
        add(new JButton("sul"), BorderLayout.SOUTH);
        add(new JButton("leste"), BorderLayout.EAST);
        add(new JButton("OESTE"), BorderLayout.WEST);
        add(new JButton("CENTO"), BorderLayout.CENTER);

        pack();



    }
    
}
