package gui1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JComboBox;
//indicaremos que Gui2 es un JFrame e implementaremos las caracteristicas de ActionListener
//para los eventos
public class Gui2 extends JFrame implements ActionListener{
	
//se inicializan los componentes
	JPanel pnlTitulo;
	JPanel pnlFormulario;
	JPanel pnlBotones;
	JLabel lblNombre;
	JTextField txtNombre;
	JLabel lblApellido;
	JTextField txtApellido;
	JLabel lblEmail;
	JTextField txtEmail;
	JLabel lblMatricula;
	JTextField txtMatricula;

	JButton	btnOk;
	JButton btnCancelar;
	

public Gui2(){
        super(" ");
	//se agrega un layout a cada panel
	setLayout(new BorderLayout());
	pnlTitulo = new JPanel();
	pnlTitulo.setLayout(new FlowLayout());
	pnlFormulario = new JPanel();
	pnlFormulario.setLayout(new GridLayout(5,5));
	pnlBotones = new JPanel();
	pnlBotones.setLayout(new FlowLayout());
        //se agregan los paneles al JFrame
	add(pnlTitulo, BorderLayout.NORTH);
	add(pnlFormulario, BorderLayout.CENTER);
	add(pnlBotones, BorderLayout.SOUTH);
//titulo :
            //con este objeto aplicamos la herencia mandando llamar al dato del usuario
            //para crear el saludo
            Gui1 olm = new Gui1();
            setTitle("bienvenid@   "+olm.name);
//componentes al formulario
	lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField();
        lblApellido = new JLabel("Apellido");
        txtApellido = new JTextField();
        lblEmail = new JLabel("Email");
        txtEmail = new JTextField();
        lblMatricula = new JLabel("Matricula");
        txtMatricula = new JTextField();
        
        pnlFormulario.add(lblNombre);
        pnlFormulario.add(txtNombre);
	pnlFormulario.add(lblApellido);
	pnlFormulario.add(txtApellido);
	pnlFormulario.add(lblEmail);
	pnlFormulario.add(txtEmail);
	pnlFormulario.add(lblMatricula);
	pnlFormulario.add(txtMatricula);
        
        
       
//agregar botones	

	btnOk = new JButton("OK");
        btnOk.addActionListener(this);
	btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);
        //se agregan los botones
	pnlBotones.add(btnOk);
	pnlBotones.add(btnCancelar);
        //haremos visible el JFrame
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(900,500);
	setVisible(true);
        }
        //se agregan los eventos a cada boton
        public void actionPerformed(ActionEvent l){
            if(l.getSource() == btnCancelar){
                System.exit(0);
            }
            //con el boton ok guardaremos los datos de las cajas de textos 
            if(l.getSource()== btnOk){
            String name = txtNombre.getText();
            String ape = txtApellido.getText();
            String mail = txtEmail.getText();
            String control = txtMatricula.getText();
            //se imprimen los datos usando las variables de las cajas de texto
           System.out.println("Su nombre es: "+name);
            System.out.println("Su apellido es: "+ape);
            System.out.println("Su Email es es: "+mail);
            System.out.println("Su Numero de control es: "+control);
            /*para la lectura y escritura de archivos se debe de escribir el codigo 
            dentro de un try catch, ya que se utilizan clases del paquete io 
            las cuales nos mandan excepciones controladas o forzadas a manejar*/
            //lo que haremos sera enviar los datos dentro de nuestra interfaz 
             try {
                //crearemos un objeto de la clase PrintWriter 
                //que nos ayudara a escribir el archivo 
                //ademas parametrizaremos la ruta del archivo
                PrintWriter pw = new PrintWriter("datos.txt");
                /*y con este objeto comenzaremos a iniciar el flujo de la escritura
                 mandando llamar cada variable en la que se almacenan los datos 
                 para ser escrito*/
                pw.println("Su nombre es: "+name);
                pw.println("Su apellido es: "+ape);
                pw.println("Su Email es es: "+mail);
                pw.println("Su Numero de control es: "+control);
                pw.close();//asi mismo dandole fin al flujo
            /*lo que sigue es parametrizar dentro del catch la expecion y el objeto 
                en el que se manejara esta misma*/
            }catch(FileNotFoundException er){
                //y agregaremos el manseje de error
                System.out.println("no se ha encontrado el archivo");
        }
            //con este objeto implementaremos el JComboBox de la clase combo usando la herencia
            combo obj5 = new combo(); 
            System.out.println("Su carrera es: "+ obj5.selec);
        }
        }
}
