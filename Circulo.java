
/**
 * Write a description of class Circulo here.
 * 
 * @author lisandro) 
 * @version 11032002
 */
import java.util.Random;

public class Circulo
{
    private double radio;
    private Punto centro;
   
    public Circulo()
    {
        this.setRadio(0);
        centro.desplazar(0, 0);
    }
    public Circulo(double p_radio,Punto p_Punto)
    {
        this.setRadio(p_radio);
        this.setPunto(p_Punto);
    }
    private void setRadio(double p_radio)
    {
        this.radio=p_radio;
    }
    private void setPunto(Punto p_punto)
    {
       this.centro=p_punto;
    }

    public double getRadio()
    {
        return this.radio;
    }
    public Punto getCentro()
    {
        return this.centro;
    }
    public void desplazar1(double p_x, double p_y)
    {
          this.centro.desplazar(p_x, p_y);
    }
    public double perimetro()
    {
        return (2 * Math.PI * this.radio);
    }
    public double superficie(double p_radio)
    {
        return (Math.PI * Math.pow(p_radio, 2));
    }
    public void caracteristica()
    {
        System.out.println("\t******Circulo******\n" );
        this.centro.mostrar();
        System.out.println("Radio:" + this.getRadio());
        System.out.println("Superficie  " + this.superficie(this.radio) + "\t" + "-" +" Perimetro:" + this.perimetro());
    }

    public Circulo eLmayorCirculo(Circulo p_Circulo,Circulo p_Circulo2)
    {
        if (p_Circulo.superficie(p_Circulo.getRadio()) > p_Circulo2.superficie(p_Circulo2.getRadio())) {
            return p_Circulo;
        }else{
            return p_Circulo2;
        }
    }

    public double distanciaA(Circulo pCirculo)
    {
      return pCirculo.centro.distanciaA(centro);
    }
    




}

