package Aula_02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class mostrarTela extends JFrame {
    
    private FlowLayout lay = null ;

    public mostrarTela(){
        super("Teste flowlayout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(400,200));
        lay = new FlowLayout();
        setLayout(lay);
        lay.setAlignment(FlowLayout.CENTER);

        add(new JButton("Button- 01"));
        add(new JButton("Button- 02"));
        add(new JButton("Button- 03"));
        add(new JButton("Button- 04"));

        pack();
    }

  

}
