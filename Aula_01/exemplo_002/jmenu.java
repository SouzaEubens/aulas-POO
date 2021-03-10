package AULAS_POO.Aula_01.exemplo_002;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class jmenu extends JFrame{
    
    private JLabel minha_label = null ;

    public jmenu(){

        minha_label = new JLabel("teste");

        setSize(200,200);
        setTitle("testando");
        setLocation(10,10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(minha_label);
    }

}
