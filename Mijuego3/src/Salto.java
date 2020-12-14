
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
public class Salto extends Thread{
    int x,y;
    Mario MiMario;
    JPanel miJP;
    Graphics g;
    String direc;
    
    //se crean metodos
    public Salto(JPanel miJ, int xi, int yi, Mario MiM){
        this.g=miJ.getGraphics();
        this.miJP=miJ;
        this.x=xi;
        this.y=yi;
        this.MiMario=MiM;
        this.direc=MiM.Direction();
    }
    
    public void run(){
        int i=0;
        int z;
        z=this.y;
        while(true){
            while(i<=8){
                
                try {
                    this.y=z+3*i*i-24*i;
                    this.miJP.update(g);
                    MiMario.Dibujar_Mario(g, this.x, this.y, this.direc);
                    Salto.sleep(50);
                    i=i+1;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Salto.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
                
                
                
        }
        
    }
}
