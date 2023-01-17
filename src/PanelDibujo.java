import java.awt.Graphics;
import javax.swing.JPanel;
public class PanelDibujo extends JPanel {

    public void paintComponent(Graphics g){

     super.paintComponent(g);

        //CREADO CON EL METODO DE DRAWLINE

        /*g.drawLine(20,20,40,120);
        g.drawLine(40,120,60,120);
        g.drawLine(60,120,80,80);
        g.drawLine(80,80,100,120);
        g.drawLine(100,120,120,120);
        g.drawLine(120,120,140,20);
        g.drawLine(140,20,120,20);
        g.drawLine(120,20,104,87);
        g.drawLine(104,87,92,51);
        g.drawLine(92,51,67,51);
        g.drawLine(67,51,55,86);
        g.drawLine(55,86,40,20);
        g.drawLine(40,20,20,20);*/


        // CREACION DEL ARREGLO PARA LAS POSICIONES DE X
        int [] puntosX = {20,40,60,80,100,120,140,120,104,92,
        67,55,40};

        // CREACION DEL ARREGLO PARA LAS POSICIONES DE Y
        int [] puntoY = {20,120,120,80,120,120,20,20,87,51,
        51,85,20};

        // CREACION DE LA LETRA W CON EL METODO DRAWOLYGON
        g.drawPolygon(puntosX,puntoY,13);

    }
}
