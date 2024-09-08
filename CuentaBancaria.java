
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
   public static void  main(String[] args)
   {
           Scanner sc = new Scanner(System.in);
        ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<>();
        String continuar = "si";  // Para controlar el bucle

        while (continuar.equalsIgnoreCase("si")) {
            // Ingresar los datos de la persona
            System.out.println("Ingresando datos del cliente:");

            System.out.print("DNI: ");
            int dni = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.print("Año de nacimiento: ");
            int anioNacimiento = sc.nextInt();

            // Crear la instancia de Persona
            Persona persona = new Persona(dni, nombre, apellido, anioNacimiento);

            // Ingresar los datos de la cuenta bancaria
            System.out.print("Número de cuenta: ");
            int nroCuenta = sc.nextInt();

            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();

            // Crear la cuenta bancaria con los datos ingresados
            CuentaBancaria cuenta = new CuentaBancaria(nroCuenta, persona, saldo);

            // Almacenar la cuenta en la lista
            cuentasBancarias.add(cuenta);

            // Preguntar si se desea ingresar otro cliente
            System.out.println("¿Desea ingresar otro cliente? (si/no)");
            sc.nextLine();  // Limpiar el buffer
            continuar = sc.nextLine();
        }
   
        System.out.println("\nCuentas bancarias ingresadas:");
        for (CuentaBancaria cuenta : cuentasBancarias) {
            cuenta.mostrar();
        }
     }
