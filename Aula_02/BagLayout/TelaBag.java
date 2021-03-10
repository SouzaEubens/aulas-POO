package Aula_02.BagLayout;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javafx.scene.control.Button;

public class TelaBag extends JFrame {
    
    private GridBagLayout layer = null;
    private final int noLinhas = 3;

    public TelaBag(){

        super("testando tela");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,200));

        layer = new GridBagLayout();
        getContentPane().setLayout(layer);

        List lEsq = new List(noLinhas,true);
        
        lEsq.add("uma");
        lEsq.add("dois");
        lEsq.add("três");
        lEsq.add("quatro");
        lEsq.add("cinco");
        lEsq.add("seis");
        lEsq.add("sete");

        Button add = new Button(">>");
        



    }

}
