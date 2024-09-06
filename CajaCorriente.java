
/**
 * Write a description of class CajaCorriente here.
 * 
 * @author Valenzuela Lisandro
 * @version 11032002
 */
public class CajaCorriente
{
 private int nroCuenta;
 private double  saldo;
 private double limiteDescubierto;
 private Persona titular;
 
 public CajaCorriente(int p_nroCuenta, Persona p_titular)
 {
    setNroCuenta(p_nroCuenta);
    setTitular(p_titular);
    setLimite(500.0);
    setSaldo(0);
 }
 public CajaCorriente(int p_nroCuenta,Persona p_titular,double p_saldo)
 {
    setNroCuenta(p_nroCuenta);
    setTitular(p_titular);
    setSaldo(p_saldo);
    setLimite(500.0);
 }
 //setters
 private void setNroCuenta(int p_nro)
 {
    this.nroCuenta=p_nro;
 }
 private void setSaldo(double p_saldo)
 {
    this.saldo=p_saldo;
 }
 private void setLimite(double p_limite)
 {
    this.limiteDescubierto=p_limite;
 }
 private void setTitular(Persona p_titular)
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
    return this.saldo;
 }
 public double getLimite()
 {
    return this.limiteDescubierto;
 }
public Persona getTitular()
{
    return this.titular;
}

//metodos solicitados
public boolean puedeExtraer(double p_importe)
{
    double plata = this.getSaldo()+this.getLimite();
        if (p_importe < plata) {
            return true;
        }else{
            return false;
        }
}

public void extraer(double p_importe)
{
    if(this.puedeExtraer(p_importe)==true)
    {
        this.extracion(p_importe);
    }else
    {
        System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
    }
}

public void extracion (double p_importe)
{
    this.saldo-=p_importe;
}



public void depositar(double p_importe)
{
    this.saldo+=p_importe;
}

public void mostrar()
{
    System.out.println("Nro cuenta: "+ this.getNroCuenta() +"");
}
}
