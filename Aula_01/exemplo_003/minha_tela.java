package AULAS_POO.Aula_01.exemplo_003 ;

import javax.swing.*;
import java.awt.font.*;


public class minha_tela extends JFrame{

    private JLabel titulo = null;
    private JLabel nome   = null;
    private JLabel email  = null;
    private JLabel sexo   = null;
    private JLabel senha  = null;
    private JLabel estilo_leitura = null;
    private JLabel time_futebol = null;

    private JTextField txtnome = null;
    private JTextField txtemail = null ;

    private JPasswordField entry_senha = null;
    private JRadioButton masculino = null;
    private JRadioButton feminino = null;

    
    private JCheckBox esporte = null;
    private JCheckBox educacao = null;
    private JCheckBox culinaria = null;

    private JComboBox ComboBox1 = null;
    private JButton enviar = null;

    public minha_tela(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(410,489);
        setLocation(0,23);

        titulo = new JLabel("Cadastro de clientes");
        titulo.setLocation(118,6);
        titulo.setSize(154,23);
        
        nome = new JLabel("Nome:");
        nome.setLocation(95,50);
        nome.setSize(154,23);

        txtnome = new JTextField(10);
        txtnome.setLocation(150,46);
        txtnome.setSize(123,28);

        email = new JLabel("E-mail:");
        email.setLocation(95,87);
        email.setSize(123,28);


        txtemail = new JTextField(10);
        txtemail.setLocation(150,86);
        txtemail.setSize(123,28);

        senha = new JLabel("Senha:");
        senha.setBounds(96,120,123,28);

        entry_senha = new JPasswordField();
        entry_senha.setBounds(150,120,123,28);

        sexo = new JLabel("Sexo:");
        sexo.setBounds(150,160,96,23);

        feminino = new JRadioButton("Feminino");
        feminino.setBounds(150,195,90,23);

        masculino = new JRadioButton("Masculino");
        masculino.setBounds(150,180,98,23);

        estilo_leitura = new JLabel("Estilo de Leitura");
        estilo_leitura.setBounds(39,223,105,16);

        esporte = new JCheckBox("Esportes");
        esporte.setBounds(150,195,86,23);

        culinaria = new JCheckBox("Culinaria");
        esporte.setBounds(150,258,91,23);

        educacao = new JCheckBox("educação");
        educacao.setBounds(150,287,88,23);

        enviar = new JButton("Enviar");
        enviar.setBounds(283,352,77,29);

        ComboBox1 = new JComboBox();
        ComboBox1.setBounds(150,322,102,27);
        ComboBox1.addItem("Gama");
        ComboBox1.addItem("Brasiliense");
        ComboBox1.addItem("capital");


        add(titulo);
        add(nome);
        add(txtnome);

        add(email);
        add(txtemail);

        add(senha);
        add(entry_senha);

        add(sexo);
        add(feminino);
        add(masculino);

        add(estilo_leitura);
        add(culinaria);
        add(educacao);
        add(esporte);

        add(enviar);
        add(ComboBox1);



    }

     




}