package Bee;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel {
    private static final long serialVersionUID = 1L;
    private double x1 = 0;
    private double x2 = 0;
    private double y1 = 0;
    private double y2 = 0;
    private Point2D px = new Point2D.Double(x1, y1);
    private Point2D py = new Point2D.Double(x2, y2);
    private Point2D pxtempo = new Point2D.Double(x2, y2);
    private Point2D pytempo = new Point2D.Double(x1, y1);
    private boolean inicio = true;
    static ArrayList<Polygon> poligonos = new ArrayList<Polygon>();
    static ArrayList<Ellipse2D> Elipse = new ArrayList<Ellipse2D>();
    static ArrayList<Arc2D> arco = new ArrayList<Arc2D>();
    static ArrayList<Color> colorBorde = new ArrayList<Color>();
    static ArrayList<Color> colorRelleno = new ArrayList<Color>();
    static ArrayList<Color> coloresElipse = new ArrayList<Color>();
    static ArrayList<Color> colores = new ArrayList<Color>();
    static ArrayList<double[]> propiedadarco = new ArrayList<double[]>();
    static ArrayList<double[]> propiedad = new ArrayList<double[]>();

    // El método paint recibe como parametro objeto de la clase Graphics

    public void paint(Graphics g)

    {
        limpiarco();
        limpiaovalo();
        limpiapoligono();
        limpiar();

    // Colores capturados
        Color borrador = new Color(240, 151, 203);
        Color metal = new Color(153, 153, 153);
        Color punta = new Color(102, 102, 102);
        Color madera = new Color(254, 232, 165);

        // coordenadas de poligonos

        int[] clapizx = { 128, 244, 271, 261, 244, 129 };
        int[] clapizy = { 171, 171, 193, 202, 215, 215 };
        int[] cpuntalapizx = { 244, 270, 244, 239 };
        int[] cpuntalapizy = { 171, 193, 215, 203 };
        creapoligono(clapizx, clapizy, g, Color.YELLOW);
        creapoligono(cpuntalapizx, cpuntalapizy, g, madera);

        pintapoligono(g);

        int[] alader = { 185, 18, 38, 61 };
        int[] alaizq = { 112, 50, 38, 61 };
        int[] cuerpo = { 112, 70, 143, 100 };

        creaobjovalo(g, alader, Color.white, 21.145, 6);
        creaobjovalo(g, alaizq, Color.white, -50.32, 6);
        creaobjovalo(g, cuerpo, Color.black, 0, 6);

        pintaovalo(g);
        limpiaovalo();

        double[] cuerpoabj = { 133, 70, 70, 100, 60, 230 };
        double[] cuerpo1 = { 154, 70, 70, 100, 73, 220 };
        double[] cuerpo2 = { 112, 70, 143, 100, 286, 150 };
        double[] cuerpo3 = { 175, 70, 70, 100, 105, 155 };
        double[] boca = { 208, 133, 24, 13, 0, -180 };
        double[] ptalapiz = { 260, 185, 20, 20, 130, 80 };
        double[] borralapiz = { 110, 170, 45, 45, 90, 180 };
        double[] laminaborra1 = { 122, 170, 28.5, 45, 90, 180 };
        double[] laminaborra2 = { 133, 170, 26.5, 45, 90, 185 };

        creaarco(g, cuerpoabj, Arc2D.PIE, Color.BLACK, 1, Color.YELLOW, 1, 6);
        creaarco(g, cuerpo1, Arc2D.PIE, Color.BLACK, 1, Color.BLACK, 1, 2);
        creaarco(g, cuerpo2, Arc2D.CHORD, Color.BLACK, 1, Color.YELLOW, 1, 2);
        creaarco(g, cuerpo3, Arc2D.CHORD, Color.BLACK, 0, Color.YELLOW, 1, 2);
        creaarco(g, boca, Arc2D.OPEN, Color.BLACK, 1, Color.BLACK, 0, 2);
        creaarco(g, ptalapiz, Arc2D.PIE, Color.BLACK, 1,punta, 1, 2);
        creaarco(g, borralapiz, Arc2D.OPEN, Color.BLACK, 1,borrador, 1, 4);
        creaarco(g, laminaborra1, Arc2D.OPEN, Color.BLACK, 1,metal, 1, 4);
        creaarco(g, laminaborra2, Arc2D.OPEN, Color.BLACK, 1,metal, 0, 3);
        pintaarco(g);
        limpiarco();

        int[] ojoizq = { 221, 52, 63, 69 };
        int[] pupilaizq = { 243, 74, 19, 22 };
        int[] ojoder = { 177, 48, 69, 80 };
        int[] pupilader = { 200, 74, 23, 25 };
        creaobjovalo(g, ojoizq, Color.white, 0, 6);
        creaobjovalo(g, pupilaizq, Color.black, 0, 2);
        creaobjovalo(g, ojoder, Color.white, 0, 6);
        creaobjovalo(g, pupilader, Color.black, 0, 2);
        pintaovalo(g);
        limpiaovalo();





        //Lapiz
        double[][] lapiz = new double[][] {
            {129,171},{244,171},{271,193},{261,202},{244,215},{129,215}
        };
        double[][] lapiz1 = new double[][] {
            {244,215},{239,193},{244,171}
        };

        //Genero la gráfica
        pintalinea(lapiz,g,false,2,Color.BLACK);
        pintalinea(lapiz1,g,false,2,Color.BLACK);

        //Nombre que va dentro del lápiz
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        String nombre="Matthew";
        g.drawString(nombre,getWidth() / 2 - g.getFontMetrics().stringWidth(nombre) / 2,205);
        }

        //Método limpiar variables del polígono
        private void limpiapoligono()
        {
            poligonos.clear();
            colores.clear();
        }

        //Método limpiar variables del ovalo
        private void limpiaovalo()
        {
            Elipse.clear();
            coloresElipse.clear();
            propiedad.clear();
        }

        //Método limpiar variables del arco
        private void limpiarco()
        {
            arco.clear();
            colorBorde.clear();
            colorRelleno.clear();
            propiedadarco.clear();
        }

        //Método limpiar variables usadas en los trazos de linea
        private void limpiar() {
            x1=0;
            x2=0;
            y1=0;
            y2=0;
            px = new Point2D.Double(x1, y1);
            py = new Point2D.Double(x2, y2);
            pxtempo = new Point2D.Double(x2, y2);
            pytempo = new Point2D.Double(x1, y1);
            inicio = true;
        }
        //Método el que crea el arco
        private void creaarco(Graphics g,double[] coordenada, int tipoarco, Color borde, double conborde, Color relleno, double conrelleno, float pluma) 
        {
            double x=coordenada[0];
            double y=coordenada[1];
            double w=coordenada[2];
            double h=coordenada[3];
            double start=coordenada[4];
            double extend=coordenada[5];
            double propiedadesArco[]= {conborde,conrelleno,pluma};

            Arc2D Arco= new Arc2D.Double(x, y, w, h, start, extend, tipoarco);
            arco.add(Arco);
            colorBorde.add(borde);
            colorRelleno.add(relleno);
            propiedadarco.add(propiedadesArco);
        }

        //Método en el que pinta el arco
        private void pintaarco(Graphics g)
        {
            Graphics2D g2 = (Graphics2D)g;
            int tamanio=arco.size();
            double conborde;
            double conrelleno;
            double lapiz;
            double recuperapropiedad[];

            for(int i=0; i<tamanio;i++)
            {
                recuperapropiedad= propiedadarco.get(i);
                conborde=recuperapropiedad[0];
                conrelleno=recuperapropiedad[1];
                lapiz=recuperapropiedad[2];

                Stroke pluma = new BasicStroke((float) lapiz);
                g2.setStroke(pluma);

                Arc2D objArco=arco.get(i);
                if (conborde==1)
                {
                    g2.setColor(colorBorde.get(i));
                    g2.draw(objArco);
                }
                if (conrelleno==1) {
                    g2.setColor(colorRelleno.get(i));
                    g2.fill(objArco);
                }

            }
        }

        //Método que crear el ovalo 
        private void creaobjovalo(Graphics g, int[] coordenada, Color color, double angulo, int pincel) {
            int x =coordenada[0];
            int y =coordenada[1];

            double propiedades[]= {x,y,angulo,pincel};
            Ellipse2D elipse= new Ellipse2D.Double(0,0,coordenada[2],coordenada[3]);
            Elipse.add(elipse);
            coloresElipse.add(color);
            propiedad.add(propiedades);
        }



        //Método que pinta el ovalo
        private void pintaovalo(Graphics g)
        {
            Graphics2D g2 = (Graphics2D)g;
            int tamanio=Elipse.size();
            double x;
            double y;
            double angulo;
            double pincel;
            double [] recuperapropiedad;

        //Capturo las propiedades
        for(int i=0; i<tamanio; i++)
        {
            AffineTransform old = g2.getTransform();
            recuperapropiedad = propiedad.get(i);

            x=recuperapropiedad[0];
            y=recuperapropiedad[1];
            angulo=recuperapropiedad[2];
            pincel=recuperapropiedad[3];


            Stroke pluma = new BasicStroke((float) pincel);
            g2.setStroke(pluma);

            g2.translate(x, y);
            g2.rotate(angulo* Math.PI/180);
            g2.setColor(Color.black);
            g2.draw(Elipse.get(i));
            g2.setColor(coloresElipse.get(i));
            g2.fill(Elipse.get(i));
            g2.setTransform(old);
        }
    }

        //Método para creación de un poligono
        private void creapoligono(int[] coordenadax, int[] coordenaday, Graphics g, Color color)
        {
            super.paint(g);
            Polygon polygon = new Polygon(coordenadax,coordenaday, coordenadax.length);
            poligonos.add(polygon);
            colores.add(color);
        }

        //Método que pinta el poligono
        private void pintapoligono(Graphics g)
        {
            super.paint(g);
            for(int i = 0; i<colores.size(); i++)
            {
              g.setColor(colores.get(i));
              g.fillPolygon(poligonos.get(i));  
            }
        }


        //Método de pintar líneas
        private void pintalinea(double[][] coordenada, Graphics g, boolean fin, float punta, Color trazo)
        {
            // Creamos una variable local (objeto g2) realizando un upcasting
            Graphics2D g2 = (Graphics2D)g;

            // se define el grosor de la linea del grafico
            Stroke pincel = new BasicStroke(punta);
            g2.setStroke(pincel);
            //se define el color del trazo
            g2.setColor(trazo);
            limpiar();
            for (int i = 0; i < coordenada.length; i++)
            {
                boolean bandera = false;
            


            if(Math.pow(-1,(i+1))>0)
                bandera=true;

            Line2D lluna=pintacoordenada(coordenada[i][0],coordenada[i][1],bandera);
            inicio=false;

            if(inicio==false && i>0)
                g2.draw(lluna);

            if(i==coordenada.length-1 && fin==true)
            {
                lluna=new Line2D.Double(pytempo,pxtempo);
                g2.draw(lluna);
            }
        }
    }
            //Método de captura de coordernadas de puntos para líneas
            private Line2D pintacoordenada(double plinean,double plineam, boolean bandera)
            {
                //Método que transforma los puntos de coordenadas en puntos para líneas
                if (bandera==false && inicio ==true)
                {
                    x1 = plinean;
                    y1 = plineam;
                    px= new Point2D.Double(x1,y1);
                    pxtempo=px;
                    pytempo=px;

                }
                if (inicio == false)
                {
                   px=pxtempo;
                   x2 = plinean;
                   y2 = plineam;
                   py = new Point2D.Double(x2, y2);
                   pxtempo=py;
                }

                Line2D lactual = new Line2D.Double(px, py);
                return lactual;
            }

        }

    
        