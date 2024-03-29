//se importan los paquetes a usar
import com.sun.glass.events.KeyEvent;
public class Mijuego extends javax.swing.JFrame {
    //llamamos a la clase mario para poder usarla
    Mario MiMario;
    
    public Mijuego() {
        initComponents();
        //y asi agregamos el objeto MiMario
        MiMario = new Mario(jPanel1);
        MiMario.Dir="build/classes/mario4.png";
        Hongo MiHongo = new Hongo(jPanel1,0,100,MiMario);
        MiHongo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*se crea un evento KeyPressend para que el escuchador nos 
    de las acciones que estamos realizando*/
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
      //para realizar la accion deseada necesitamos:
      //usar las cordenadas e inicalizarlas 
      int x,y;
      x=MiMario.coordX();
      y=MiMario.coordY();
      //asi como insertar la direccion de las imagenes a usar
      String Direc="";
      /*para realizar el evento con las felchas del 
        teclado usaremos el evento KeyCode*/
      switch(evt.getKeyCode()){
          /*y asi en cada caso elegiremos la tecla a usar que 
            el escuchador nos mandara*/
          case KeyEvent.VK_LEFT:
            /*se incrementara o se disminuira la posicion dependiendo la tecla pulsada*/
            x=x-10;
            /* asi como se agregara la direccion de la imagen a 
                insertar en cada caso especifico*/
            Direc="build/classes/mario4.png";
            //se inserta la pocicion y direccion de Mario
            MiMario.x=x;
            MiMario.Dir=Direc;
            //se utiliza break para darle pausa al evento de cada caso
            break;
            //y se repiten los casos con las demas teclas a usar
          case KeyEvent.VK_RIGHT:
            x=x+10;
            Direc="build/classes/mario5.png";
            MiMario.x=x;
            MiMario.Dir=Direc;
            break;
          case KeyEvent.VK_UP:
            y=y-10;
            Direc="build/classes/mario1.png";
            MiMario.x=x;
            MiMario.Dir=Direc;
            break;
          case KeyEvent.VK_DOWN:
            y=y+10;
            Direc="build/classes/mario2.png";
            MiMario.x=x;
            MiMario.Dir=Direc;
            break;  
          case KeyEvent.VK_S:
              Salto MiSalto = new Salto(jPanel1,x,y,MiMario);
              MiSalto.start();
              break;
      }
      
      //se insertan las imagenes dependiendo cada caso
      MiMario.Dibujar_Mario(jPanel1.getGraphics(), x, y, Direc);
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mijuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mijuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mijuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mijuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mijuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
