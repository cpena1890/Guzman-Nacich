import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Principal extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miVerdeGN, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelApellido, 
            labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
    private JTextField txtNombreTrabajador, txtApellido;
    private JComboBox<String> comboDepartamento, comboAntiguedad;
    private JScrollPane scroll1;
    private JTextArea txtArea1;
    String usuario="";


    public Principal(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(16,76,12));
        Bienvenida ventanaBienvenida = new Bienvenida();
        usuario = ventanaBienvenida.texto;

        //Barra de menues
        mb = new JMenuBar();
        mb.setBackground(new Color (240,240,240));
        setJMenuBar(mb);

        menuOpciones=new JMenu("Opciones");
        menuOpciones.setBackground(new Color(240,240,240));
        menuOpciones.setForeground(new Color(20,20,20));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color (240,240,24));
        menuCalcular.setForeground(new Color(20,20,20));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color (240,240,240));
        menuAcercaDe.setForeground(new Color(20,20,20));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setFont(new Font ("Montserrat",1,14));
        menuColorFondo.setForeground(new Color(20,20,20));
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font ("Montserrat",1,14));
        miCalculo.setForeground(new Color(20,20,20));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font ("Montserrat",1,14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font ("Montserrat",1,14));
        miNegro.setForeground(new Color(0,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miVerdeGN = new JMenuItem("Verde GN");
        miVerdeGN.setFont(new Font ("Montserrat",1,14));
        miVerdeGN.setForeground(new Color(16,76,12));
        menuColorFondo.add(miVerdeGN);
        miVerdeGN.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font ("Arial",1,14));
        miNuevo.setForeground(new Color(20,20,20));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El Creador");
        miElCreador.setFont(new Font ("Arial",1,14));
        miElCreador.setForeground(new Color(20,20,20));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

    
        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font ("Arial",1,14));
        miSalir.setForeground(new Color(20,20,20));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        //LOGO
        ImageIcon imagen = new ImageIcon("images/logo.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(60,20,335,69);
        add(labelLogo);

        //Bienvenido
        labelBienvenido = new JLabel("Bienvenido");
        labelBienvenido.setBounds(140,100,300,50);
        labelBienvenido.setFont(new Font ("Arial",1,32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);

        //Titulo
        labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
        labelTitle.setBounds(25,160,900,25);
        labelTitle.setFont(new Font ("Arial",0,16));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);

        //Nombre
        labelNombre = new JLabel("Nombre Completo");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font ("Arial",1,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25,213,150,25);
        txtNombreTrabajador.setBackground(new java.awt.Color (224,224,224));
        txtNombreTrabajador.setFont(new java.awt.Font("Arial",1,14));
        txtNombreTrabajador.setForeground(new java.awt.Color(20,20,20));
        add(txtNombreTrabajador);


        //Apellido
        labelApellido = new JLabel("Apellido/s:");
        labelApellido.setBounds(25,248,180,25);
        labelApellido.setFont(new Font ("Arial",1,12));
        labelApellido.setForeground(new Color(255,255,255));
        add(labelApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(25,273,150,25);
        txtApellido.setBackground(new java.awt.Color (224,224,224));
        txtApellido.setFont(new java.awt.Font("Arial",1,14));
        txtApellido.setForeground(new java.awt.Color(20,20,20));
        add(txtApellido);

        //Departamento
        labelDepartamento = new JLabel("Selecciona el Departamento:");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new Font ("Arial",1,12));
        labelDepartamento.setForeground(new Color(255,255,255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox<String>();
        comboDepartamento.setBounds(220,213,220,25);
        comboDepartamento.setBackground(new java.awt.Color (224,224,224));
        comboDepartamento.setFont(new java.awt.Font("Arial",1,14));
        comboDepartamento.setForeground(new java.awt.Color(20,20,20));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Obras");
        comboDepartamento.addItem("Compras");
        comboDepartamento.addItem("Ingenieria");

        //Antiguedad
        labelAntiguedad = new JLabel("Selecciona el Antiguedad:");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font ("Arial",1,12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);
        
        comboAntiguedad = new JComboBox<String>();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new java.awt.Color (224,224,224));
        comboAntiguedad.setFont(new java.awt.Font("Arial",1,14));
        comboAntiguedad.setForeground(new java.awt.Color(20,20,20));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("0 a 2 años de servicio");
        comboAntiguedad.addItem("2 a 6 años de servicio");
        comboAntiguedad.addItem("7 o mas años de servicio");

        //Resultado
        labelResultado = new JLabel("Resultado del Calculo:");
        labelResultado.setBounds(25,307,180,25);
        labelResultado.setFont(new Font ("Arial",1,12));
        labelResultado.setForeground(new Color(255,255,255));
        add(labelResultado);

        txtArea1 = new JTextArea();
        txtArea1.setEditable(false);
        txtArea1.setBackground(new Color (224,224,224));
        txtArea1.setFont(new Font("Arial",1,11));
        txtArea1.setForeground(new Color(20,20,20));
        txtArea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");
        scroll1 = new JScrollPane(txtArea1);
        scroll1.setBounds(25,330,415,90);
        add(scroll1);

        //Copyright
        labelfooter = new JLabel("©2022 - Carlos Alfredo Peña - GN");
        labelfooter.setBounds(135,445,500,30);
        labelfooter.setFont(new java.awt.Font ("Arial",1,12));
        labelfooter.setForeground(new java.awt.Color(25,255,255));
        add(labelfooter);    
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource()==miCalculo){
            String nombreTrabajador = txtNombreTrabajador.getText();
            String AP = txtApellido.getText();
            String Dpto = comboDepartamento.getSelectedItem().toString();
            String Antiguedad = comboAntiguedad.getSelectedItem().toString();

            if (nombreTrabajador.equals("") || AP.equals("") || Dpto.equals("") || Antiguedad.equals("")){
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");                
            } else {
                if(Dpto.equals("Obras")){

                    if(Antiguedad.equals("0 a 2 años de servicio")){
                        txtArea1.setText("\n   El empleado " + nombreTrabajador + " " + AP + " " +
                                        "\n   quien trabaja en " + Dpto + " con " + Antiguedad + 
                                        "\n   recibe 6 días de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                        txtArea1.setText("\n   El empleado " + nombreTrabajador + " " + AP + " " +
                                        "\n   quien trabaja en " + Dpto + " con " + Antiguedad + 
                                        "\n   recibe 14 días de vacaciones.");
                    }
                    if(Antiguedad.equals("7 o mas años de servicio")){
                        txtArea1.setText("\n   El empleado " + nombreTrabajador + " " + AP + " " + 
                                              "\n   quien trabaja en " + Dpto + " con " + Antiguedad + 
                                              "\n   recibe 20 días de vacaciones.");
                    }
         
                }
                if(Dpto.equals("Compras")){

                    if(Antiguedad.equals("0 a 2 años de servicio")){
                        txtArea1.setText("\n   El empleado " + nombreTrabajador + " " + AP +
                                              "\n   quien trabaja en " + Dpto + " con " + Antiguedad + 
                                              "\n   recibe 7 días de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                        txtArea1.setText("\n   El empleado " + nombreTrabajador + " " + AP + 
                                              "\n   quien trabaja en " + Dpto + " con " + Antiguedad + 
                                              "\n   recibe 15 días de vacaciones.");
                    }
                    if(Antiguedad.equals("7 o mas años de servicio")){
                        txtArea1.setText("\n   El empleado " + nombreTrabajador + " " + AP +
                                              "\n   quien trabaja en " + Dpto + " con " + Antiguedad + 
                                              "\n   recibe 22 días de vacaciones.");
                    }
                }
                if(Dpto.equals("Ingenieria")){
                    if(Antiguedad.equals("0 a 2 años de servicio")){
                        txtArea1.setText("\n   El empleado " + nombreTrabajador + " " + AP +
                                              "\n   quien trabaja en " + Dpto + " con " + Antiguedad + 
                                              "\n   recibe 10 días de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                        txtArea1.setText("\n   El empleado " + nombreTrabajador + " " + AP + 
                                              "\n   quien trabaja en " + Dpto + " con " + Antiguedad + 
                                              "\n   recibe 20 días de vacaciones.");
                    }
                    if(Antiguedad.equals("7 o mas años de servicio")){
                        txtArea1.setText("\n   El empleado " + nombreTrabajador + " " + AP + 
                                              "\n   quien labora en " + Dpto + " con " + Antiguedad + 
                                              "\n   recibe 30 días de vacaciones.");
                    }
                }

            }
        }
        if (e.getSource()==miRojo){
            getContentPane().setBackground(new Color (255,0,0));
        }
        if (e.getSource()==miNegro){
            getContentPane().setBackground(new Color (0,0,0));            
        }
        if (e.getSource()==miVerdeGN){
            getContentPane().setBackground(new Color (16,76,12));
        }
        if (e.getSource()==miNuevo){
            txtNombreTrabajador.setText("");
            txtApellido.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            txtArea1.setText("\n Aqui aparece el resultado del calculo de vacaciones");            
        }
        if (e.getSource()==miSalir){
            Bienvenida ventana = new Bienvenida();
            ventana.setBounds(0,0,450,450);
            ventana.setVisible(true);;
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource()==miElCreador){
            JOptionPane.showMessageDialog(null,"Desarollado por Carlos Alfredo Peña");

        }
    }

public static void main (String args[]){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 465, 535);
        ventanaPrincipal.setVisible(true);;
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
}
}
