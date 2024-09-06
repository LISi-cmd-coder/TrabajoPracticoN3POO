
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
   private int nroCuenta;
   private  double saldo;
   private Persona gente;
   
   public CuentaBancaria(int p_nrocuenta,Persona  p_Persona)
   { 
        this.setNrocuenta(p_nrocuenta);
        this.setSaldo(0.0);
        this.setPersona(p_Persona);
   }
   public CuentaBancaria(int p_nroCuenta , Persona p_titular , double p_saldo )
   {
    this.setNrocuenta(p_nroCuenta);
    this.setPersona(p_titular);
    this.setSaldo(p_saldo);
   }

   //setters
   private void setNrocuenta(int p_nro)
   {
    this.nroCuenta=p_nro;
   }
   private void setSaldo(double p_saldo)
   {
        this.saldo=p_saldo;
   }
   private void setPersona(Persona p_persona)
   {
    this.gente=p_persona;
   }

   //Getters
   public int getNroCuenta()
   {
    return this.nroCuenta;
   }
   public double getSaldo()
   {
    return this.saldo;
   }
   //metodos  solicitados
   public double depositar(double p_importe)
   {
    return getSaldo() + p_importe;
   }
   public double extraer(double p_importe)
   {
    return getSaldo() - p_importe;
   }

   public void mostrar()
   {
    System.out.println("\t- Cuenta bancaria -\n");
    System.out.println("Titular: "+this.gente.nomYApe() + " " + this.gente.edad()+"\n");
    System.out.println("SALDO: " + this.getSaldo());
   }

   public String toString()
   {
    return " "+this.getNroCuenta() +" " +this.gente.nomYApe()+" "+ this.getSaldo();
   }
}
