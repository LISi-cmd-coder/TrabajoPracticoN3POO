
/**
 * La clase Empleado representa a un empleado de una empresa con información básica,
 * como CUIL, nombre, apellido, sueldo básico y año de ingreso.
 * 
 * Funcionalidad: Permite gestionar los datos del empleado, calcular la antigüedad,
 * los descuentos, el adicional según la antigüedad y el sueldo neto.
 * 
 * Comportamiento: Los atributos se mantienen privados para asegurar el encapsulamiento,
 * y se proporcionan métodos públicos para interactuar con la información del empleado.
 */
import java.util.*;
public class Empleado {
    private long  cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    private Calendar fechadeIngreso;
    
    /**
     * Constructor que inicializa una instancia de Empleado con los datos proporcionados.
     * 
     * Funcionalidad: Inicializa los atributos del empleado con los valores dados.
     * 
     * Comportamiento: Asigna los valores proporcionados a los atributos correspondientes.
     * 
     * @param p_cuil El CUIL del empleado.
     * @param p_apellido El apellido del empleado.
     * @param p_nombre El nombre del empleado.
     * @param p_importe El sueldo básico del empleado.
     * @param p_anio El año de ingreso del empleado a la empresa.
     */

    public Empleado(long p_cuil, String p_apellido,String p_nombre, double p_sueldo, int p_ingreso)
    {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldo(p_sueldo);
        this.setAnio(p_ingreso);
    }
    public Empleado(long p_cuil,String p_apellido,String p_nombre,double p_Sueldo, int p_Aingreso, Calendar p_fechaIngreso){
           this.setCuil(p_cuil);
           this.setApellido(p_apellido);
           this.setNombre(p_nombre);
           this.setSueldo(p_Sueldo);
           this.setAnio(p_Aingreso);
           this.setIngreso(p_fechaIngreso);
   }


    /**
     * Calcula y devuelve la antigüedad del empleado en la empresa en años.
     * 
     * Funcionalidad: Determina cuántos años ha trabajado el empleado desde su ingreso.
     * 
     * Comportamiento: Calcula la diferencia entre el año actual y el año de ingreso del empleado.
     * 
     * @return La antigüedad del empleado en años.
     */

    public void setIngreso(Calendar p_fecha)
    {
        this.fechadeIngreso=p_fecha;
    }

    public int antiguedad (){
        Calendar fechaHoy= new GregorianCalendar();
        int diaDehoy= fechaHoy.get(Calendar.YEAR);
        return ( diaDehoy  - this.anioIngreso );
   }
   /**
     * Calcula el descuento total aplicable al sueldo básico del empleado.
     * 
     * Funcionalidad: Calcula el descuento en concepto de obra social y seguro de vida.
     * 
     * Comportamiento: El descuento es el 2% del sueldo básico más $1500 de seguro de vida.
     * 
     * @return El monto total del descuento.
     */
    public double descuento(){
      double porcentaje = porcentaje(2);
      double sueldoDescontado = (this.getSueldo() - porcentaje - 1500); //1500 del seguro de vida
      return sueldoDescontado;
   }
   /**
    * Calcula el porcentaje sobre el sueldo básico del empleado.
    *
    *
    * @param x siendo x el porcentaje que se desea hallar.
    * @return el porcentaje calculado. 
   */
    public double porcentaje (int x){
        return this.getSueldo()*x / 100;
   }

     /**
     * Calcula el adicional que se asigna al sueldo básico del empleado basado en su antigüedad.
     * 
     * Funcionalidad: Determina el porcentaje de adicional en función de los años de antigüedad.
     * 
     * Comportamiento: Aplica un porcentaje al sueldo básico según la antigüedad:
     * - Menos de 2 años: 2%
     * - Entre 2 y 10 años: 4%
     * - Más de 10 años: 6%
     * 
     * 
     * @return El monto del adicional.
     */


    public double adicional(){
        int aniosdeServicios = this.antiguedad();
        if(aniosdeServicios < 2){
            return (this.sueldoBasico + this.porcentaje(2));
        }else if (aniosdeServicios >= 2 && aniosdeServicios <10 ) {
            return (this.sueldoBasico + this.porcentaje(4));
        }else if(aniosdeServicios >10 ){
            return (this.sueldoBasico + this.porcentaje(6));
        }
        return this.sueldoBasico; //caso donde no se cumple ni uno ( tuve que poner esto para solucionar un error del codigo ya que si no ponia un return fuera de los if anidados no funcionaba.)
   } 
    /**
     * Calcula y devuelve el sueldo neto del empleado.
     * 
     * Funcionalidad: Determina el sueldo neto después de aplicar el adicional y el descuento.
     * 
     * Comportamiento: Suma el sueldo básico y el adicional, y luego resta el descuento.
     * 
     * @return El sueldo neto del empleado.
     */
    public  double sueldoNeto(){
        return this.getSueldo() + this.adicional() - this.descuento();
   }
    public String nomYapell(){
        return ( this.getNom()+ ", " + this.getApellido());
   }
    public String apellynom(){
        return (this.getApellido() +", " + this.getApellido());
   }
   //getters
    public String getNom()
   {
    return this.nombre;
   }
    public String getApellido()
   {
    return this.apellido;
   }
    public long getCuil(){
        return this.cuil;
   }
    public double getSueldo (){
        return this.sueldoBasico;
    } 
   
    public Calendar getFecha()
    {
        return this.fechadeIngreso;
    }
    //setters 
    private void setCuil(long p_cuil){
        this.cuil=p_cuil;
    }
    private void setApellido(String p_Apellido)
    {
        this.apellido=p_Apellido;
    }
    private void setNombre(String p_nombre)
    {
        this.nombre=p_nombre;
    }
    private void setSueldo(double p_sueldo)
    {
      this.sueldoBasico=p_sueldo;
    }
    private void setAnio( int p_anio)
    {
        this.anioIngreso=p_anio;
    }
    
    /**
     * Retorna una cadena con los datos del empleado en un formato compacto para mostrar en una línea.
     * 
     * Funcionalidad: Proporciona una representación precisa  de los datos del empleado.
     * 
     * Comportamiento: Concatena la información básica del empleado en una sola línea.
     * 
     * @return Un String que contiene el CUIL, nombre, apellido, antigüedad y sueldo neto del empleado.
     */
    public String mostrarLinea(){
            String cuil = String.valueOf(getCuil()); //casteamos el valor original a un string
            String plata = String.valueOf(getSueldo());//casteamos el valor original a un string.
            return cuil +" "+ this.nomYapell() +"..........."+"$ "+ plata;
    }

     /**
     * Muestra en la consola los datos del empleado, incluyendo CUIL, nombre, apellido,
     * antigüedad, sueldo neto, y el adicional.
     * 
     * Funcionalidad: Imprime en la consola la información relevante del empleado.
     */

   public void mostrar(){
    System.out.println("Nombre y apellido:" + this.apellynom());
    System.out.println("CUIL:" + this.getCuil()+ "\t" + "Antiguedad: "+ this.antiguedad() + " Años de servicios");
    System.out.println("Sueldo neto: " + this.sueldoNeto()+ "\n");
  }
/*El método esAniversario() comprueba y retorna true o false según sea o no el día en que la persona cumple un año
más en la empresa.  
*
* Right now es la fecha actual del dia.
* hacemos uso de los metodos de la clase Calendar.
* hacemos la comparacion entre el dia del mes (DAY_OF_MONTH) de ingreso del empleado con la fecha actual
* Y tambien hacemos la comparacion entre el mes de la fecha actual con el mes de ingreso.
* Si coinciden retornamos true y si no false
*/



  public boolean esAniversario()
  {
    Calendar rightNow= Calendar.getInstance();
    if (rightNow.get(Calendar.DAY_OF_MONTH) == this.fechadeIngreso.get(Calendar.DAY_OF_MONTH) && rightNow.get(Calendar.MONTH) == this.fechadeIngreso.get(Calendar.MONTH)) {
        return true;
    }else{
        return false;
    }
  }

  public static void main(String[] args)
  {
    Empleado empleado = new Empleado(2312312, "Valenzuela", "Lisandro", 500000, 2019);
    empleado.mostrar();
    System.out.println(" " + empleado.mostrarLinea());
  }

}
