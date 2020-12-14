package Arch;
//se importan todos los paquetes io 
import java.io.*;
public class Escritura {
    public static void main(String[] args) {
        //se tiene que crear la variable o variables con los datos a escribir
        String texto = "hola mundo";
        /*para la lectura y escritura de archivos se debe de escribir el codigo 
           dentro de un try catch, ya que se utilizan clases del paquete io 
           las cuales nos mandan excepciones controladas o forzadas a manejar*/
        try {
           /*ahora se debe de crear un objeto dela clase PrintWeiter 
           -el cual nos ayudara a escribir el texto en el archivo 
           -ademas si este no existe lo creara 
           -y dentro de este objeto parametrizaremos la ruta del archivo*/ 
           PrintWriter pw = new PrintWriter("miarchivo.txt");
           //se abrira el flujo de escritura con el objeto 
           //y mandando llamar la variable del texto a escribir
           pw.println(texto);
           pw.close();
           //y asi igual cerraremos el flujo
           //dentro del catch parametrizaremos lo que es la excepcion 
           //y el objeto en el que se manejara
        }catch(Exception err){
            //e imprimiremos un mensaje de error
            System.out.println("no se ha encontrado el archivo");
        }
    }
    
}