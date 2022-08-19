import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//programacion de elementos de la ventana
public class Bienvenida extends JFrame implements ActionListener {
    private JTextField textfield1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;
    public String texto="";

    public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenidos a Guzman-Nacich");
        getContentPane().setBackground(new Color(16,76,12));
        
        
        //LOGO        
        ImageIcon imagen = new ImageIcon("images/logo.png");   
        label1 = new JLabel(imagen);
        label1.setBounds(45, 15, 350, 150);
        add(label1);

        //Sistema de control vacacional
        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(90,135,300,30);
        label2.setFont(new Font ("Montserrat",3,18));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        //Label Nombre
        label3 =new JLabel ("Ingrese su nombre:");
        label3.setBounds(90,212,200,30);
        label3.setFont(new Font ("Montserrat",3,12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        //copyright
        label4 =new JLabel ("©2022 - Carlos Alfredo Peña");
        label4.setBounds(130,375,300,30);
        label4.setFont(new Font ("Montserrat",1,12));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        //textfield Nombre
        textfield1 = new JTextField();
        textfield1.setBounds(90,240,255,25);
        textfield1.setBackground(new Color (224,224,224));
        textfield1.setFont (new Font("Montserrat",1,14));
        textfield1.setForeground(new Color(5,5,5));
        add(textfield1);

        //Boton INGRESAR
        boton1 = new JButton("Ingresar");
        boton1.setBounds(90,280,100,30);
        boton1.addActionListener(this);
        add(boton1);
    }

    //programacion de eventos
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == boton1){
            texto = textfield1.getText().trim();
            if (texto.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre.");                
            } else {
                Licencia ventanalicencia = new Licencia();
                ventanalicencia.setBounds (0,0,600,360);
                ventanalicencia.setVisible(true);
                ventanalicencia.setResizable (false);
                ventanalicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
            
        }
    }

    public static void main (String args[]){
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0,0,450,450);
        ventanaBienvenida.setVisible(true);;
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);

    }
}

