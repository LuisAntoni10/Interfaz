//se importan los paquetes a usar
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

//se declara la clase Mario
public class Mario {
    //se declaran las variables a usar
    //unas seran para obtener las cordenadas
    //y la otra variable para introducir en el panel
    int x,y;
    JPanel MiJP;
    String Dir;
    //se inicializan las variables
    Mario( JPanel MiJ){
        this.x=0;
        this.y=0;
        this.MiJP=MiJ;
        
    }
    //este metodo nos ayudara a obtener las posiciones e insertar las imagenes
    public void Dibujar_Mario(Graphics g,int xi, int yi, String Direccion){
        this.x=xi;
        this.y=yi;
        this.Dir=Direccion;
        //esta linea de codigo nos ayuda a borrar las sombras de la imagen
        this.MiJP.update(g);
        //este objeto insertarar la imagen en el panel
        ImageIcon MiImagen = new ImageIcon(Direccion);
        g.drawImage(MiImagen.getImage(), xi, yi, MiJP);
    }
    public int coordX(){
        return this.x;
    }
    public int coordY(){
        return this.y;
    }
    
    public String Direction(){
        return this.Dir;
    }
}
