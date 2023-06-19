package Witch;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
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
    static ArrayList<Color> colores = new ArrayList<Color>();

    public void paint(Graphics g)
    {
        

        double[][] pluna= new double[][]{
            {293,11}, {304,17}, {308,26},
            {308,43}, {304,53}, {293,59},
            {309,59}, {319,54}, {323,43},
            {323,26}, {318,16}, {309,11}
        };
        double[][] pgorro= new double[][]{
            {225,10}, {246,26}, {234,26},
            {246,48}, {252,59}, {257,69},
            {192,69}, {198,59}, {204,48},
        };
        double[][] c1gorro= new double[][]{
            {219,48}, {230,48}, {230,59},
            {219,59}
        };
        double[][] c2gorro= new double[][]{
            {214,43}, {235,43}, {235,64},
            {214,64}
        };
        double[][] a1gorro= new double[][]{
            {204,48}, {214,48}, {214,59},
            {198,59}
        };
        double[][] a2gorro= new double[][]{
            {246,48}, {235,48}, {235,59},
            {252,59}
        };
        double[][] alagorro= new double[][]{
            {165,69}, {284,69}, {284,75},
            {165,75}
        };
        double[][] cabello1= new double[][]{
            {191,75}, {160,101}, {166,107},
            {187,86}, {171,107}, {177,112},
            {190,96}, {182,117}, {188,122},
            {204,75}
        };
        double[][] cabello2= new double[][]{
            {257,75}, {277,107}, {282,107},
            {261,86}, {277,107}, {271,112},
            {258,96}, {266,117}, {260,122},
            {244,75}
        };
        double[][] ojoizq= new double[][]{
            {203,80}, {203,96}, {220,96},
            {220,80}
        };
        double[][] ojoder= new double[][]{
            {228,80}, {228,96}, {245,96},
            {245,80}
        };
        double[][] pupilaizq= new double[][]{
            {209,85}, {209,96}, {220,96},
            {220,85}
        };
        double[][] pupilader= new double[][]{
            {228,85}, {228,96}, {239,96},
            {239,85}
        };
        double[][] cara= new double[][]{
            {204,75}, {193,107}, {193,117},
            {208,132}, {241,132}, {256,117},
            {256,110}, {244,75},
        };
        double[][] nariz= new double[][]{
            {245,96}, {198,96}, {198,106},
            {231,106}, 
        };
        double[][] boca= new double[][]{
            {209,112}, {209,118}, {214,122},
            {236,122}, {241,118}, {241,112},
        };
        double[][] cuerpo= new double[][]{
            {208,132}, {192,175}, {192,181},
            {256,181}, {256,175}, {241,132},
        };
        double[][] brazoder= new double[][]{
            {208,132}, {176,165}, {181,170},
            {201,151},
        };
        double[][] brazoizq= new double[][]{
            {241,132}, {272,128}, {278,133},
            {247,149},
        };
        double[][] manoder= new double[][]{
            {176,165}, {171,170}, {171,175},
            {181,175}, {181,170},
        };
        double[][] manoizq= new double[][]{
            {272,128}, {272,117}, {272,117},
            {277,122}, {283,117}, {288,127}, {278,133},
        };
        double[][] escoba= new double[][]{
            {256,175}, {283,175}, {283,181},
            {256,181},
        };
        double[][] escoba1= new double[][]{
            {166,175}, {192,175}, {192,181},
            {166,181},
        };
        double[][] escoba2= new double[][]{
            {283,175}, {287,160}, {336,160},
            {336,196}, {287,196}, {283,181},
        };
        double[][] adesc1= new double[][]{
            {192,175}, {192,181},
        };
        double[][] adesc2= new double[][]{
            {256,175}, {256,181},
        };
        double[][] adesc3= new double[][]{
            {283,175}, {283,181},
        };
        double[][] piernader= new double[][]{
            {207,181}, {219,205}, {240,205}, {246,215},
            {246,198}, {225,198}, {218,181},
        };
        double[][] piernaizq= new double[][]{
            {230,181}, {239,197}, {260,197}, {266,207},
            {266,190}, {245,190}, {241,181}
        };
        double[][] mediader= new double[][]{
            {230,198}, {230,205}, {235,205}, {235,198},
        };
        double[][] mediaizq= new double[][]{
            {250,190}, {250,197}, {255,197}, {255,190},
        };


        //Coodernadas de poligonos
        int [] clunax= {293,309,318,323,323,319,309,293,304,308, 308,304};
        int [] clunay={11,11,16,26,43,54,59,59,53,43,26,17};
        int [] cgorro1x={214,235,235,214};
        int [] cgorro1y={43,43,64,64};
        int [] cgorro2x={219,230,230,219};
        int [] cgorro2y={48,48,59,59};
        int [] cgorroador1x= {204, 214, 214,198};
        int [] cgorroador1y={48,48,59,59};
        int [] cgorroador2x={235,246,252,235};
        int [] cgorroador2y={48,48,59,59};
        int [] ccabelloderx={191,160,166,187,171,177,190,182,188,204};
        int [] ccabellodery={75,101,107,86,107,112,96,117,122,75};
        int [] ccabelloizqx={244,260,266,258,271,277, 261, 282,277,257};
        int [] ccabelloizqy = {75, 122, 117, 96, 112, 107, 86, 107, 107, 75 };
        int [] ccarax={204,193,193,208,241,256,256,244};
        int [] ccaray={75,107,117,132,132,117,110,75};
        int [] cojoderx={203,220,220,203};
        int [] cojodery={80,80,96,96};
        int [] cojoizqx={228,245,245,228};
        int [] cojoizqy= {80,80, 96,96};
        int [] cpupiladerx={209,220,220,209};
        int [] cpupiladery={85,85,96,96};
        int [] cpupilaizqx={228,239,239,228};
        int [] cpupilaizqy={85,85,96,96};
        int [] cgorrosupx={204,225,246,234,246,235,235,214,214};
        int [] cgorrosupy={48,10,26,26,48,48,43,43,48};
        int [] cgorroinfx={198,192,257,252,235,235,214,214};
        int [] cgorroinfy={59,69,69,59,59, 64,64,59};
        int [] cgorroalax={165,165,284,284};
        int [] cgorroalay={69,75,75,69};
        int [] cbrazoderx={208,201,181,176};
        int [] cbrazodery={132,151,170,165};
        int [] cbrazoizqx={241,247,278,272};
        int [] cbrazoizqy={132,149,133,128};
        int [] ccuerpox={208,241,256,256,192,192};
        int [] ccuerpoy={132,132,175,181,183,175};
        int [] cmanoderx={171,171,176,181,181};
        int [] cmanodery={175,170,165,170,175};
        int [] cmanoizqx={272,272,277,277,283,288,278};
        int [] cmanoizqy={128,117,117, 122,117,127,133};
        int [] cpiernaderx={207,218,225,230,230, 219};
        int [] cpiernadery={181,181,198, 198,205,205};
        int [] cpiernaizqx={230,241,245,250, 250,239};
        int [] cpiernaizqy={181,181,190,190,197,197};
        int [] cmediaderx={230, 235,235,230};
        int [] cmediadery={205,205,198, 198};
        int [] cmediaizqx={250,255,255,250};
        int [] cmediaizqy={197,197,190,190};
        int [] czapatoderx={235,240,246,246,235};
        int [] czapatodery={205,205,215, 198, 198};
        int [] czapatoizqx={255,260,266,266,255};
        int [] czapatoizqy={197,197,207,190, 190};
        int [] cescobax={283, 287, 336,336, 287,283};
        int [] cescobay={175, 160, 160,196,196,181};
        int [] cpaloescobadx={166,192,192,166};
        int [] cpaloescobady={175,175,181,181};
        int [] cpaloescobaix={256,283,283, 256};
        int [] cpaloescobaiy={175,175,181,181};

        //Limpisza de pohigonos y colores,
        poligonos.clear();
        colores.clear();

        //Vesnero los, poligonos
        Color amarilloluna = new Color(239,237,48);
        Color amarillomedia = new Color(253, 247,51);
        Color amarilloescoba = new Color(251,208,51);
        Color paloescoba = new Color(182,140,95);
        Color morado = new Color(146, 71, 204);
        Color verdepiel = new Color (133,220,78);


        creapoligono(clunax,clunay,g,amarilloluna);
        creapoligono(cgorro1x,cgorro1y,g,amarillomedia);
        creapoligono(cgorro2x,cgorro2y,g,Color.black);
        creapoligono(cgorroador1x,cgorroador1y,g,Color.black);
        creapoligono(cgorroador2x,cgorroador2y,g,Color.black);
        creapoligono(ccabelloderx,ccabellodery,g,Color.black);
        creapoligono(ccabelloizqx,ccabelloizqy,g,Color.black);
        creapoligono(ccarax,ccaray,g,verdepiel);
        creapoligono(cojoderx,cojodery,g,Color.white);
        creapoligono(cojoizqx, cojoizqy,g,Color.white);
        creapoligono(cpupiladerx,cpupiladery,g,Color.black);
        creapoligono(cpupilaizqx,cpupilaizqy,g,Color.black);
        creapoligono(cgorrosupx,cgorrosupy,g,morado);
        creapoligono(cgorroinfx,cgorroinfy,g,morado);
        creapoligono(cgorroalax,cgorroalay,g,morado);
        creapoligono(cbrazoderx,cbrazodery,g,morado);
        creapoligono(cbrazoizqx,cbrazoizqy,g,morado);
        creapoligono(ccuerpox,ccuerpoy,g,morado);
        creapoligono(cmanoderx,cmanodery,g,verdepiel);
        creapoligono(cmanoizqx,cmanoizqy,g,verdepiel);
        creapoligono(cpiernaderx,cpiernadery,g,verdepiel);
        creapoligono(cpiernaizqx,cpiernaizqy,g,verdepiel);
        creapoligono(cmediaderx,cmediadery,g,amarillomedia);
        creapoligono(cmediaizqx,cmediaizqy,g,amarillomedia);
        creapoligono(czapatoderx,czapatodery,g,Color.black);
        creapoligono(czapatoizqx,czapatoizqy,g,Color.black);
        creapoligono(cescobax,cescobay,g,amarilloescoba);
        creapoligono(cpaloescobadx,cpaloescobady,g,paloescoba);
        creapoligono(cpaloescobaix,cpaloescobaiy,g,paloescoba);



        
        
        pintapoligono(g);

        //Genero la gráfica
        pintalinea(pluna,g,true,3,Color.BLACK);
        pintalinea(pgorro,g,true,2,Color.BLACK);
        pintalinea(c1gorro,g,true,3,Color.BLACK);
        pintalinea(c2gorro,g,true,3,Color.BLACK);
        pintalinea(a1gorro,g, false, 3,Color.BLACK);
        pintalinea(a2gorro,g, true,2,Color.BLACK);
        pintalinea(alagorro,g, true, 2,Color.BLACK);
        pintalinea(cabello1,g,true,2,Color.BLACK);
        pintalinea(cabello2,g, true,2,Color.BLACK);
        pintalinea(ojoizq,g,true,2,Color.BLACK) ;
        pintalinea(ojoder,g,true,2,Color.BLACK);
        pintalinea(pupilaizq,g,true,2,Color.BLACK) ;
        pintalinea(pupilader,g,true,2,Color.BLACK) ;
        pintalinea(nariz,g,false,2,Color. BLACK);
        pintalinea(boca,g,false,2,Color.BLACK);
        pintalinea(cara,g,true,2,Color.BLACK) ;
        pintalinea(cuerpo,g,false,2,Color.BLACK) ;
        pintalinea(brazoder,g,false,2,Color.BLACK);
        pintalinea(brazoizq,g, false,2,Color.BLACK);
        pintalinea(manoder,g, false, 2,Color. BLACK);
        pintalinea(manoizq,g,false,2,Color.BLACK);
        pintalinea(escoba,g,true, 3,Color.BLACK);
        pintalinea(escoba1,g,true,3,Color.BLACK);
        pintalinea(escoba2,g,true,3,Color.BLACK);
        pintalinea(adesc1,g, false,3,Color.BLACK);
        pintalinea(adesc2,g,false,3,Color.BLACK);
        pintalinea(adesc3,g,false,3,Color.BLACK);
        pintalinea(piernader,g,false,2,Color.BLACK);
        pintalinea(piernaizq, g,false,2,Color.BLACK);
        pintalinea(mediader,g,false,2,Color.BLACK);
        pintalinea(mediaizq,g,false,2,Color.BLACK);
    }


    // Método limpiar variables usadas en los trazos de linea
    private void limpiar() {
        x1=0;
        x1=0;
        y1=0;
        y2=0;
        px = new Point2D.Double(x1, y1);
        py = new Point2D.Double(x2, y2);
        pytempo = new Point2D.Double(x2, y2);
        pxtempo = new Point2D.Double(x1, y1);
        inicio = true;
    }

    // Método que pinta el poligono
    private void pintapoligono(Graphics g)
     {
        super.paint(g);
        for(int i = 0; i<colores.size();i++)
        {
            g.setColor(colores.get(i));
            g.fillPolygon(poligonos.get(i));
        }
    }

        //Método de pintar lineas
    private void pintalinea(double[][] coordenada, Graphics g, boolean fin, float punta, Color trazo)
{
        // Creamos una variable local (objeto g2) realizando un upcasting
        Graphics2D g2 = (Graphics2D)g;
        //se define el grosor de la linea del grafico
        Stroke pincel = new BasicStroke(punta );
        g2.setStroke(pincel);
        // se define el color del trazo
        g2.setColor(trazo);
        limpiar();
        for (int i = 0; i < coordenada.length; i++)
    {
        boolean bandera = false;


        if(Math.pow(-1,(i+1))>0)
            bandera=true;

        Line2D lluna=pintacoordenada(coordenada[i][0],coordenada[i][1],bandera);
        inicio=false;

        if (inicio==false && i>0)
            g2.draw(lluna);


        if (i==coordenada.length-1 && fin==true)
        {
            lluna=new Line2D.Double(pytempo,pxtempo);
            g2.draw(lluna);
        }
    }

}
        //Método para creación de un poligono
    private void creapoligono(int[] coordenadax, int [] coordenaday, Graphics g, Color color) {
        super.paint(g);
        Polygon polygon = new Polygon(coordenadax,coordenaday, coordenadax.length);
        poligonos.add(polygon);
        colores.add(color);
    }

        //Método de captura de coordenadas de puntos para líneas
    private Line2D pintacoordenada(double pluna1, double pluna2, boolean bandera)
    {
        //Metodo que transforma losp utos de coordeadas e ptos para lieas
        if (bandera == false && inicio == true)
        {
            x1 = pluna1;
            y1 = pluna2;
            px = new Point2D.Double(x1,y1);
            pxtempo=px;
            pytempo=px;
        }
        if (inicio == false)
        {
            px=pxtempo;
            x2 = pluna1;
            y2 = pluna2;
            py = new Point2D.Double(x2, y2);
            pxtempo=py;
        }


        Line2D lactual = new Line2D.Double(px, py);
        return lactual;
    }
        
        }
