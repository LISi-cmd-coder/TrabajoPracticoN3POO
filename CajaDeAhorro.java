
/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author lisandro valenzuela 
 * @version 11032002
 */
public class CajaDeAhorro
{
    private int nroCuenta;
    private double saldo;
    private int extracionesPosibles;
    private Persona titular;

    public CajaDeAhorro(int p_nroCuenta,Persona p_titular,double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtracciones(10);
    }
    public CajaDeAhorro(int p_nroCuenta,Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
    }
    
    //setters
    private void setNroCuenta(int p_nroCuenta )
    {
        this.nroCuenta=p_nroCuenta;
    }
    private void setSaldo(double p_saldo)
    {
        this.saldo=p_saldo;
    }
    private void setExtracciones(int p_extracionPosible)
    {
        this.extracionesPosibles=p_extracionPosible;
    }
    private void setTitular( Persona p_titular)
    {
        this.titular=p_titular;
    }

    //getters
    public int getNroCuenta()
    {
        return this.nroCuenta;
    }
    public double getSaldo()
    {
        return  this.saldo;
    }
    public Persona getTitular()
    {
        return this.titular;
    }

    public int getExtra()
    {
        return this.extracionesPosibles;
    }
 
    public boolean puedeExtrar(double p_importe)
    {
        if(p_importe <= this.getSaldo() && getExtra() >= 1 )
        {
            return true;
        }else{
            return false ;
        }
        
    }

    public void extraccion(double p_importe)
    {
        this.saldo-=p_importe;
    }
    
    public void extraer(double p_importe)
    {
        if (puedeExtrar(p_importe)==true) {
            extraccion(p_importe);
        }else if(this.getSaldo() < p_importe){
            System.out.println("No puede extraer mas que el saldo!");
        }else
        {
            System.out.println("No tiene habilitadas mas extracciones!");
        }
    }


    public void depositar(double p_importe)
    {
        this.saldo+=p_importe;
    }

    public void mostrar()
    {
        System.out.println("Caja ahorro -\n");
        System.out.println("Nro de cuenta: " + this.getNroCuenta() +"-" + " Saldo: " + getSaldo());
        System.out.println("Titular: "+ this.titular.nomYApe()) ;
        System.out.println("Extraciones disponibles: " + this.getExtra());
    }

    

}
