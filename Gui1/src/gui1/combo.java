package gui1;
//clase para el JComboBox
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

public class combo extends Gui2 implements ItemListener{
    
    public static String selec;
    JComboBox carrera;
    
    public combo(){
        carrera =new JComboBox();
        //se agrega el JComboBox al pnlFormulario de la clase Gui2
        pnlFormulario.add(carrera);
        //se agregan las caracteristicas que llevara nuestro JComboBox
        carrera.addItem("Selecciona una opcion");
        carrera.addItem("Ingenieria en Sistemas Computacionales");
        carrera.addItem("Ingenieria Quimica");
        carrera.addItem("Ingenieria Industrial ");
        carrera.addItem("Ingenieria en Informatica");
        carrera.addItem("Licenciatuta en Administracion de Empresas");
        carrera.addItem("Ingenieria en Mecatronica");
        carrera.addItem("Ingenieria Civil");
        carrera.addItem("Ingenieria en Tics");
        carrera.addItemListener(this);
    }
        //aqui haremos que la opcion seleccionada pase a ser una variable y asi poder imprimirla
        public void itemStateChanged(ItemEvent i){
        if(i.getSource() == carrera){
            selec = carrera.getSelectedItem().toString();
        }
    }
}
