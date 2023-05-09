package Train;

import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class Panel extends JPanel {
    

    public void paint (Graphics g)
     {
    Graphics2D g2=(Graphics2D) g;
    Rectangle2D base = new Rectangle2D.Double(74,250,221,25);
    g2.setColor(new Color(171, 171, 171));
    g2.fill(base);

    Stroke pincel=new BasicStroke (1.0f);
    g2.setStroke(pincel);

    RoundRectangle2D cal1 = new RoundRectangle2D.Double(170,140,25,103,20,20);
    g2.setColor(new Color(145, 0, 0));
    g2.fill(cal1);
    RoundRectangle2D cal2 = new RoundRectangle2D.Double(199,140,25,103,20,20);
    g2.fill(cal2);
    RoundRectangle2D cal3 = new RoundRectangle2D.Double(228,140,25,103,20,20);
    g2.fill(cal3);
    RoundRectangle2D cal4 = new RoundRectangle2D.Double(257,140,25,103,20,20);
    g2.fill(cal4);
    RoundRectangle2D cal5 = new RoundRectangle2D.Double(286,140,25,103,20,20);
    g2.fill(cal5);

    //Chimenea
    Rectangle2D ch = new Rectangle2D.Double(289,105,19,43);
    g2.setColor(new Color(0, 0, 0));
    g2.fill(ch);
    int puntoX1[] = {311,322,311,286,275,286};
    int puntoY1[] = {65,85,105,105,85,65};
    Polygon polyl = new Polygon(puntoX1, puntoY1, 6);
    g2.drawPolygon(polyl);
    g2.setColor(new Color(0, 102, 204));
    g2.fill(polyl);

    //Frente
    Rectangle2D fr = new Rectangle2D.Double(314, 170, 10, 40);
    g2.setColor(new Color(145, 0, 0));
    g2.fill(fr);
    
    //Defensa
    int puntosX2[] = {314,350,297,297};
    int puntosY2[] = {235,287,287,235};
    Polygon poly2 = new Polygon(puntosX2, puntosY2, 4);
    g2.drawPolygon(poly2);
    g2.setColor(new Color(0, 0, 0));
    g2.fillPolygon(poly2);

    //Cabina
    Rectangle2D cab = new Rectangle2D.Double(90, 174, 77, 35);
    g2.setColor(new Color(145, 0, 0));
    g2.fill(cab);
    Rectangle2D at = new Rectangle2D.Double(76, 170, 10, 40);
    g2.setColor(new Color(145, 0, 0));
    g2.fill(at);
    Rectangle2D tec = new Rectangle2D.Double(87, 70, 80, 30);
    g2.setColor(new Color(255, 255, 0));
    g2.fill(tec);
    Line2D l1 = new Line2D.Double(95,100,120,174);
    Line2D l2 = new Line2D.Double(160,100,160,174);
    Line2D l3 = new Line2D.Double(90,210,107,240);
    Line2D l4 = new Line2D.Double(107,240,167,240);
    Line2D l5 = new Line2D.Double(167,210,167,240);

    //Ruedas
    Ellipse2D r1 = new Ellipse2D.Double(90,223,80,80);
    g2.setColor(new Color(0, 102, 204));
    g2.fill(r1);
    Ellipse2D r2 = new Ellipse2D.Double(120,253,20,20);
    g2.setColor(new Color(255, 255, 0));
    g2.fill(r2);
    Ellipse2D r3 = new Ellipse2D.Double(212,223,80,80);
    g2.setColor(new Color(0, 102, 204));
    g2.fill(r3);
    Ellipse2D r4 = new Ellipse2D.Double(242,253,20,20);
    g2.setColor(new Color(255, 255, 0));
    g2.fill(r4);

    g2.setColor(new Color(0, 0, 0));
    
    

    //Dibujo figuras
    g2.draw(base);
    g2.draw(cal1);
    g2.draw(cal2);
    g2.draw(cal3);
    g2.draw(cal4);
    g2.draw(cal5);
    g2.draw(ch);
    g2.draw(fr);
    g2.draw(cab);
    g2.draw(at);
    g2.draw(tec);
    g2.draw(l1);
    g2.draw(l2);
    g2.draw(l3);
    g2.draw(l4);
    g2.draw(l5);
    g2.draw(r1);
    g2.draw(r2);
    g2.draw(r3);
    g2.draw(r4);

    }
}
