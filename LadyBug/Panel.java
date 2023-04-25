package LadyBug;

import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class Panel extends JPanel {
    public void paint (Graphics g) {
        Graphics2D g2=(Graphics2D) g;


        Stroke pincel=new BasicStroke (1.5f);
        g2.setStroke(pincel);



        //Cuerpo
        Line2D lineaC = new Line2D.Double(200,172,200,265);
        Ellipse2D cuerpo = new Ellipse2D.Double(135,135,130,130);
        Ellipse2D centro = new Ellipse2D.Double(183,183,32,32);


        //Ojos
        Ellipse2D ojoI = new Ellipse2D.Double(178,115,22,22);
        Ellipse2D ojoD = new Ellipse2D.Double(199,115,22,22);
        Ellipse2D ojoIb = new Ellipse2D.Double(185,116,10,10);
        Ellipse2D ojoDb = new Ellipse2D.Double(203,116,10,10);
        
        
        //Antenas
        Ellipse2D atI = new Ellipse2D.Double(165,95,8,8);
        Ellipse2D atD = new Ellipse2D.Double(225,95,8,8);
        Arc2D atIi = new Arc2D.Double(157,100,30,30,0,90, Arc2D.OPEN);
        Arc2D atDd = new Arc2D.Double(210,100,30,30,90,90, Arc2D.OPEN);


        //Boca
        Line2D bocaI = new Line2D.Double(183,150,180,155);
        Line2D bocaD = new Line2D.Double(214,150,218,157);
        Arc2D abI = new Arc2D.Double(183,147,32,15,180,180, Arc2D.OPEN);
        Arc2D abD = new Arc2D.Double(187,147,25,20,200,150, Arc2D.OPEN);


        //Circulos amarillos
        Ellipse2D cAmarillo1 = new Ellipse2D.Double(160,165,17,17);
        Ellipse2D cAmarillo2 = new Ellipse2D.Double(150,195,17,17);
        Ellipse2D cAmarillo3 = new Ellipse2D.Double(160,225,17,17);
        Ellipse2D cAmarillo4 = new Ellipse2D.Double(222,165,17,17);
        Ellipse2D cAmarillo5 = new Ellipse2D.Double(232,195,17,17);
        Ellipse2D cAmarillo6 = new Ellipse2D.Double(222,225,17,17);


        //CIrculos patas
        Ellipse2D pata1 = new Ellipse2D.Double(105,135,12,12);
        Ellipse2D pata2 = new Ellipse2D.Double(260,105,12,12);
        Ellipse2D pata3 = new Ellipse2D.Double(90,190,12,12);
        Ellipse2D pata4 = new Ellipse2D.Double(300,190,12,12);
        Ellipse2D pata5 = new Ellipse2D.Double(110,270,12,12);
        Ellipse2D pata6 = new Ellipse2D.Double(290,260,12,12);
        
        //Lineas patas

        //Lineas circulos azul
        Line2D linea1 = new Line2D.Double(117,140,135,132);
        Line2D linea2 = new Line2D.Double(135,132,158,150);

        //Lineas circulos azul
        Line2D linea3 = new Line2D.Double(250,160,270,145);
        Line2D linea4 = new Line2D.Double(270,145,265,117);

        //Lineas circulos verde
        Line2D linea5 = new Line2D.Double(99,191,113,178);
        Line2D linea6 = new Line2D.Double(113,178,137,183);

        //Lineas circulos verde
        Line2D linea7 = new Line2D.Double(264,183,284,178);
        Line2D linea8 = new Line2D.Double(284,178,300,191);

        //Lineas circulos sola
        //Line2D linea9 = new Line2D.Double(250,200,275,195);
        //Line2D linea10 = new Line2D.Double(275,195,290,205);

        //Lineas circulos naranja
        Line2D linea11 = new Line2D.Double(116,255,116,270);
        Line2D linea12 = new Line2D.Double(116,255,142,230);

        //Lineas circulos naranja
        Line2D linea13 = new Line2D.Double(257,230,280,240);
        Line2D linea14 = new Line2D.Double(280,240,294,260);

        //Cuerpo
        g2.setColor(new Color(215, 71, 60));
        g2.fill(cuerpo);
        g2.setColor(Color.BLACK);
        g2.draw(cuerpo);

        //Centro del cuerpo
        g2.setColor(Color.BLACK);
        g2.fill(centro);

        //Linea central
        g2.draw(lineaC);

        //Ojos
        g2.setColor(Color.BLACK);
        g2.fill(ojoI);
        g2.setColor(Color.BLACK);
        g2.fill(ojoD);

        //Centro de ojos
        g2.setColor(Color.WHITE);
        g2.fill(ojoIb);
        g2.setColor(Color.WHITE);
        g2.fill(ojoDb);

        //Antenas
        g2.setColor(Color.BLACK);
        g2.fill(atI);
        g2.setColor(Color.BLACK);
        g2.fill(atD);
        g2.setColor(Color.BLACK);
        g2.draw(atIi);
        g2.setColor(Color.BLACK);
        g2.draw(atDd);

        //Boca
        g2.draw(bocaI);
        g2.draw(bocaD);
        g2.setColor(Color.BLACK);
        g2.draw(abI);
        g2.setColor(Color.BLACK);
        g2.draw(abD);

        //Circulos amarillos
        g2.setColor(new Color(255, 234, 52));
        g2.fill(cAmarillo1);
        g2.setColor(Color.BLACK);
        g2.draw(cAmarillo1);

        g2.setColor(new Color(255, 234, 52));
        g2.fill(cAmarillo2);
        g2.setColor(Color.BLACK);
        g2.draw(cAmarillo2);

        g2.setColor(new Color(255, 234, 52));
        g2.fill(cAmarillo3);
        g2.setColor(Color.BLACK);
        g2.draw(cAmarillo3);

        g2.setColor(new Color(255, 234, 52));
        g2.fill(cAmarillo4);
        g2.setColor(Color.BLACK);
        g2.draw(cAmarillo4);

        g2.setColor(new Color(255, 234, 52));
        g2.fill(cAmarillo5);
        g2.setColor(Color.BLACK);
        g2.draw(cAmarillo5);

        g2.setColor(new Color(255, 234, 52));
        g2.fill(cAmarillo6);
        g2.setColor(Color.BLACK);
        g2.draw(cAmarillo6);


        //Patas
        g2.setColor(new Color(56, 164, 231));
        g2.fill(pata1);
        g2.setColor(Color.BLACK);
        g2.draw(pata1);

        g2.setColor(new Color(56, 164, 231));
        g2.fill(pata2);
        g2.setColor(Color.BLACK);
        g2.draw(pata2);

        g2.setColor(new Color(67, 147, 76));
        g2.fill(pata3);
        g2.setColor(Color.BLACK);
        g2.draw(pata3);

        g2.setColor(new Color(67, 147, 76));
        g2.fill(pata4);
        g2.setColor(Color.BLACK);
        g2.draw(pata4);

        g2.setColor(new Color(235, 157, 50));
        g2.fill(pata5);
        g2.setColor(Color.BLACK);
        g2.draw(pata5);

        g2.setColor(new Color(235, 157, 50));
        g2.fill(pata6);
        g2.setColor(Color.BLACK);
        g2.draw(pata6);

        //Linea patas
        g2.draw(linea1);
        g2.draw(linea2);
        g2.draw(linea3);
        g2.draw(linea4);
        g2.draw(linea5);
        g2.draw(linea6);
        g2.draw(linea7);
        g2.draw(linea8);
        g2.draw(linea11);
        g2.draw(linea12);
        g2.draw(linea13);
        g2.draw(linea14);

        };
        }
