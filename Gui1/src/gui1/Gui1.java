package gui1;
//se importan los paquetes que se utilizaran en esta clase
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
//con el extends heredaremos las caracteristicas del JFrame a esta clase
//y con ActionListener implementaremos los metodos para los eventos
public class Gui1 extends JFrame implements ActionListener{
	//se inicializan los componentes que llevara esta interfaz
	JPanel pnlTitulo;
	JPanel pnlFormulario;
	JPanel pnlBotones;
	
	JLabel lblTitulo;
	JLabel lblNombre;
	JTextField txtNombre;
	JLabel lblContrasenia;
	JTextField txtContrasenia;
		
	JButton btnSiguiente;
	JButton btnSalir;
        public static String contra;
        public static String name;
public Gui1(){
        //aqui les daremos su caracteristica de layout a cada panel
	super(" ");
	setLayout(new BorderLayout());
	
	pnlTitulo = new JPanel();
	pnlTitulo.setLayout(new FlowLayout());
	pnlFormulario = new JPanel();
	pnlFormulario.setLayout(new GridLayout(5,2));
	pnlBotones = new JPanel();
	pnlBotones.setLayout(new FlowLayout());
	
//agregar paneles
	//agregaremos los paneles al JFrame de esta clase
	add(pnlTitulo, BorderLayout.NORTH);
	add(pnlFormulario, BorderLayout.CENTER);
	add(pnlBotones, BorderLayout.SOUTH);

//COMPONENTES PANEL TITULO
	
	
	lblTitulo = new JLabel("Inicio de sesion");
	lblTitulo.setFont(new java.awt.Font("inicio de sesion", 0, 36));
	
	
//AGREGAR COMPONENTES AL PNLTITULO
	
	pnlTitulo.add(lblTitulo);
	
//crear componentes Formulario
	lblNombre = new JLabel("Usuario");
	txtNombre = new JTextField(5);
	
	lblContrasenia = new JLabel("Clave");
	txtContrasenia = new JTextField(5);

	
//Agregar componentes al Formulario
	
	pnlFormulario.add(lblNombre);
	pnlFormulario.add(txtNombre);
	pnlFormulario.add(lblContrasenia);
	pnlFormulario.add(txtContrasenia);
	
//botones
	btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
	btnSiguiente = new JButton("siguiente");
	btnSiguiente.addActionListener(this);

///agregar Botones
	pnlBotones.add(btnSalir);
	pnlBotones.add(btnSiguiente);
	
        //estas lineas de codigo nos ayudaran a que se muestre nuestra interfaz
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(900,500);
	setVisible(true);
    }
    //en esta parte le daremos los eventos a cada titulo 
    //y las decisiones de como funcionara
    public void actionPerformed(ActionEvent l){
        //para el boton salir
        if(l.getSource() == btnSalir){
            System.exit(0);
        }
        //para el boton siguiente 
        //hara que solo de acceso a respectivos usuarios 
        if(l.getSource() == btnSiguiente){
            name =txtNombre.getText();
            contra = txtContrasenia.getText();
            //por ejemplo usare mi usuario
            if(name.equals("Luis") && contra.equals("1234")){
                this.setVisible(false);
                new combo();
            }else{
                System.exit(0);
            }    
        }
        
    }
}


