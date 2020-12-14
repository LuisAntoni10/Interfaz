//se importan los paquetes a usar
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

//se inicia la clase y se le da la herencia de la clase Thread
public class Hongo extends Thread{
    //se declaran las variables
    int x,y;
    //se declara el lienso
    JPanel miJP;
    //y se llama el ambiente grafico como variable
    Graphics g;
    //se crea el objeto MiMario que se utilizara mas adelante
    Mario MiMarioG;
    
    //se cra el constructor
    public Hongo(JPanel miJ, int xi, int yi, Mario MiM ){
        //se declara como super clase
        super();
        //y dentro de esta se cargan las variables a usar y el lienzo
        this.miJP=miJ;
        this.x=xi;
        this.y=yi;
        this.g=miJ.getGraphics();
        this.MiMarioG=MiM;
    }
    //al ser un hilo se debe de crear una clase run para montar la animacion
    public void run(){
        //con esta variable se dara la pocicion del hongo
        int i=0;
        //se crea un ciclo para poder pintar la imagen en el panel
        while(true){
            //este ciclo lo que hara sera para limitar el movimiento y pocicion del hongo
            while(i<miJP.getWidth()-20){//esto nos dara las medidas del panel
                try {
                    //se pociciona el hongo
                    i=i+10;
                    //se insertan Mario con sus funciones
                    this.MiMarioG.Dibujar_Mario(g, this.MiMarioG.x, this.MiMarioG.y, this.MiMarioG.Dir);
                    //se inserta el hongo
                    ImageIcon MiImagen = new ImageIcon("build/classes/toad1.png");
                    this.g.drawImage(MiImagen.getImage(), i, this.y, this.miJP);
                    //se le da la espera para cada movimiento del hongo
                    Hongo.sleep(50);
                    //se borra la sombra que deja el hongo
                    this.miJP.update(g);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hongo.class.getName()).log(Level.SEVERE, null, ex);
                }  
            } 
            //se realiza el mismo ciclo para que rebote 
            while(i>0){
                try {
                    i=i-10;
                    this.MiMarioG.Dibujar_Mario(g, this.MiMarioG.x, this.MiMarioG.y, this.MiMarioG.Dir);
                    ImageIcon MiImagen = new ImageIcon("build/classes/toad1.png");
                    this.g.drawImage(MiImagen.getImage(), i, this.y, this.miJP);
                    Hongo.sleep(50);
                    this.miJP.update(g);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hongo.class.getName()).log(Level.SEVERE, null, ex);
                }  
            } 
         }
    }     
}
