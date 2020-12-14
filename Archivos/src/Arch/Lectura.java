package Arch;
//se debe mandar llamr todo el paquete io
import java.io.*;
public class Lectura {
    public static void main(String[] args) {
        /*para la lectura y escritura de archivos se debe de escribir el codigo 
           dentro de un try catch, ya que se utilizan clases del paquete io 
           las cuales nos mandan excepciones controladas o forzadas a manejar*/
        try {
            //crara un objeto de la clase FileReader
            //y se parametrizara la ruta del archivo a leer
            /*Nota:Esta clase es especifica para leer caracteres
              de una fuente de datos externa*/
            FileReader fr = new FileReader("archivo.txt");
            //y agregaremos otro objeto de la clase BufferedReader
            /*Nota:Esta clase es especifica para leer caracteres en un Buffer
            (almacenamiento temporal)*/
            BufferedReader br = new BufferedReader(fr);
            //estos objetos nos ayudaran a leer el archivo 
            /*y ahora con ayuda del objeto en BufferedReader
            imprimiremos en consola lo que a leido del archivo*/
            System.out.println(br.readLine());
        //en el catch se parametrizara la excepcion con el objeto en el que se majera    
        }catch(Exception err){
            //para finalizar imprimiremos el mensaje de error 
            System.out.println("no se ha encontrado el archivo");
        }
    }
}
