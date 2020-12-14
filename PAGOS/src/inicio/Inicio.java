//esta clase se utilizara para ejecutar la interfaz
//se muestra el paquete en el que se ubica esta clase
package inicio;
//para ser visible la interfaz
//primero se debe de importar
import vista.PagosView;

public class Inicio {
    public static void main(String[] args) {
        //esta linea de codigo nos indica que se hara visible
        //la interfaz
        new PagosView().setVisible(true);
    }

}
