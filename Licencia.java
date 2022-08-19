import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {
    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scroll1;
    private JTextArea textarea1;
    String nombre = "";

    public Licencia(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle ("Licencia de uso");
        getContentPane().setBackground(new Color(16,76,12));
        Bienvenida ventanaBienvenida = new Bienvenida();        
        nombre = ventanaBienvenida.texto;
        
        label1 = new JLabel ("TERMINOS Y CONDICIONES");
        label1.setBounds (215,5,200,30);
        label1.setFont ( new Font("Arial",1,14));
        label1.setForeground(new Color (255,255,255));
        add(label1);
        
        //Terminos y condiciones
        textarea1 = new JTextArea ();
        textarea1.setEditable (false);
        textarea1.setFont (new Font ("Montserrat", 0,9));
        textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE CARLOS ALFREDO PEÑA." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  CARLOS ALFREDO PEÑA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE," +
                    "\n          EL AUTOR NO SE RESPONSABILIZA DEL USO QUE USTED HAGA CON ESTE SOFTWARE Y SUS SERVICIOS." + 
                    "\n          PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE EL AUTOR VISITE, POR FAVOR VISITE" + 
                    "\n          http://carlospeniaproyec.wixsite.com/cpena");
        scroll1 = new JScrollPane (textarea1);
        scroll1.setBounds(10,40,575,200);
        add (scroll1);

        //check aceptar terminos        
        check1 = new JCheckBox("Yo "+ nombre + " Acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener (this);
        check1.setForeground(new Color (255,255,255));
        check1.setBackground(new Color (16,76,12));
        add (check1);

        //Boton ACEPTAR
        boton1 = new JButton ("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);        
        boton1.setEnabled (false);
        add(boton1);

        //Boton NO ACEPTO
        boton2 = new JButton ("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled (true);
        add(boton2);

        //LOGO
        ImageIcon imagen = new ImageIcon("images/ico.png");
        label2 = new JLabel (imagen);
        label2.setBounds (315,135,300,300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e){
        if (check1.isSelected() == true){
            //si acepta terminos y condiciones => habilitar boton "aceptar"
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else {
            //si NO acepta terminos y condiciones => No habilitar boton "aceptar"
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed (ActionEvent e){
        if (e.getSource() == boton1){
            //Boton Aceptar --> Pantalla Principal
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0, 0, 465, 535);
            ventanaPrincipal.setVisible(true);;
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource()==boton2){
            //Boton No Acepto --> Pantalla Bienvenida
            Bienvenida ventana = new Bienvenida();
            ventana.setBounds(0,0,450,450);
            ventana.setVisible(true);;
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main (String args[]){
        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds (0,0,600,360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable (false);
        ventanalicencia.setLocationRelativeTo(null);
    }
}