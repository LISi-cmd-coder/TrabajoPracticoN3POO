
/**
 * Write a description of class EmpleadoConJefe here.
 * 
 * @author Lisandro Valenzuela 
 * @version 11032002
 */
import java.util.*;
public class EmpleadoConJefe
{
   private long cuil;
   private  String apellido;
   private String nombre; 
   private double sueldoBasico; 
   private Calendar fechaIngreso; 
   private int anio;
   private EmpleadoConJefe jefe;
  
   public EmpleadoConJefe( long p_cuil,String p_apellido ,  String p_nombre,double  p_importe ,int p_anio )
   {
      this.setCuil(p_cuil);
      this.setNombre(p_nombre);
      this.setApellido(p_apellido);
      this.setSueldobasico(p_importe);
      this.setAnio(p_anio);
      this.setEmpleadoConJefe(null);
      
   }

   public EmpleadoConJefe(long p_cuil ,String p_apellido , String p_nombre ,double  p_importe ,Calendar  p_fecha )
   {
      this.setCuil(p_cuil);
      this.setNombre(p_nombre);
      this.setApellido(p_apellido);
      this.setSueldobasico(p_importe);
      this.setAnio(p_fecha.get(Calendar.YEAR)); // enviamos como parametro el año obtenido  al usar los gets del objeto Calendar de al set de anio...
      this.setEmpleadoConJefe(null);
   }

   public EmpleadoConJefe(long p_cuil ,String p_apellido , String p_nombre ,double  p_importe ,Calendar  p_fecha, EmpleadoConJefe p_jefe )
   {
      this.setCuil(p_cuil);
      this.setNombre(p_nombre);
      this.setApellido(p_apellido);
      this.setSueldobasico(p_importe);
      this.setAnio(p_fecha.get(Calendar.YEAR)); // enviamos como parametro el año obtenido  al usar los gets del objeto Calendar de al set de anio...
      this.setEmpleadoConJefe(p_jefe);
   }



   //setters
   private void setEmpleadoConJefe(EmpleadoConJefe p_jefe)
   {
      this.jefe=p_jefe;
   }
   private void setCuil(long p_Cuil)
   {
      this.cuil=p_Cuil;
   }
   private void setApellido(String p_apellido)
   {
      this.apellido=p_apellido;
   }
   private void setNombre(String p_nombre)
   {
      this.nombre=p_nombre;
   }
   private void setSueldobasico (double p_sueldobasico)
   {
         this.sueldoBasico=p_sueldobasico;
   }
   private void setFechaingreso(Calendar p_fechaingreso)
   {
      this.fechaIngreso=p_fechaingreso;
   }
   private void setAnio(int p_anio)
   {
      this.anio=p_anio;
   }

   public long getCuil()
   {
      return this.cuil;
   }

   public String getApellido()
   {
      return this.apellido;
   }
   public String getNombre()
   {
      return this.nombre;
   }
   public double getSueldobasico()
   {
      return this.sueldoBasico;
   }
   public Calendar getFechaingreso()
   {
      return this.fechaIngreso;
   }

   public int antiguedad()
   {
      Calendar aniHoy= new GregorianCalendar();

      return  aniHoy.get(Calendar.YEAR) - this.anio;
   }

   public double porcentaje (int x)
   {
      return this.getSueldobasico()*x / 100;
   }

   public double adicional(){
      int aniosdeServicios = this.antiguedad();
      if(aniosdeServicios < 2){
          return (this.porcentaje(2));
      }else if (aniosdeServicios >= 2 && aniosdeServicios <10 ) {
          return (this.porcentaje(4));
      }else if(aniosdeServicios >10 ){
          return (this.porcentaje(6));
      }
      return 0.0; //caso donde no se cumple ni uno ( tuve que poner esto para solucionar un error del codigo ya que si no ponia un return fuera de los if anidados no funcionaba.)
 }
   public double descuento()
 {
   double porcentaje = this.porcentaje(2);
   double sueldoDescontado = (this.getSueldobasico() - porcentaje - 1500); //1500 del seguro de vida
   return sueldoDescontado;
 }
   public  double sueldoNeto()
   {
      return this.getSueldobasico() + this.adicional() - this.descuento();
   }
   public String nomyApe()
   {
      return this.getNombre() +", " + this.getApellido();
   }
   public String apeYnom()
   {
      return this.getApellido() +", "+ this.getNombre();
   }

   public void mostrar()
   {
      if (this.jefe!=null) {
         System.out.println("Nombre y apellido: "+ this.nomyApe());
         System.out.println("CUIL: "+ this.getCuil() +"- "+"Años de servicio: " + this.antiguedad());
         System.out.println("Sueldo neto: $" +getSueldobasico());
         System.out.println("responde a:" +this.jefe.nomyApe());
      }else
      {
         System.out.println("Nombre y apellido: "+ this.nomyApe());
         System.out.println("CUIL: "+ this.getCuil() +" - "+"Años de servicio: " + this.antiguedad()+"\n");
         System.out.println("Sueldo neto: $" + getSueldobasico());
         System.out.println(" Gerente General");
      }
   }

   public boolean esAniversario()
   {
     Calendar rightNow= Calendar.getInstance();
     if (rightNow.get(Calendar.DAY_OF_MONTH) == this.fechaIngreso.get(Calendar.DAY_OF_MONTH) && rightNow.get(Calendar.MONTH) == this.fechaIngreso.get(Calendar.MONTH)) {
         return true;
     }else{
         return false;
     }
   }

   public static void main(String[] args)
   {
      
      Calendar fecha= new GregorianCalendar(2022, 3, 11, 12, 3, 2);
 
      EmpleadoConJefe empleado = new EmpleadoConJefe(205, "Valenzuela", "Lisandro", 500000,2022 );
      empleado.mostrar();
      EmpleadoConJefe empleado2 = new EmpleadoConJefe(206, "Sosa", "Camila",250000 ,fecha,empleado);
      empleado2.mostrar();
     
   }
   
}
   

