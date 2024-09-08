
/**
 * La clase Persona representa una abstracción de una persona, 
 * permitiendo almacenar y gestionar su información básica 
 * como DNI, nombre, apellido, y año de nacimiento.
 * 
 * Funcionalidad: Esta clase permite crear instancias de personas con sus datos
 * y proporciona métodos para modificar y obtener dicha información.
 * 
 * 
 * 
 * @author Valenzuela Lisandro 
 * @version 25/08/2024
 */
import java.util.*;

public class Persona
{
  //atributos de la clase Persona.
  private int nroDni;
  private String nombre;
  private String apellido;
  private int anioNacimiento;

  //parte del punto 9 donde pide que modifiquemos  desea mandar una tarjeta de felicitaciones el día del cumpleaños de sus clientes 

  private Calendar fechaNacimiento;


   /**
     * Constructor que inicializa una instancia de Persona con los datos proporcionados.
     * 
     * Funcionalidad: Inicializa los atributos de la persona.
     * @param p_dni El DNI de la persona.
     * @param p_nombre El nombre de la persona.
     * @param p_apellido El apellido de la persona.
     * @param p_anio El año de nacimiento de la persona.
     */
  Persona(int p_dni, String p_nombre,String p_apell,int p_anio)
  {
    this.setDni(p_dni);
    this.setName(p_nombre);
    this.setApellido(p_apell);
    this.setAnio(p_anio);
  }

  Persona(int p_dni,String p_nombre, String p_apell,Calendar p_anio)
  {
    this.setDni(p_dni);
    this.setName(p_nombre);
    this.setApellido(p_apell);
    this.setFecha(p_anio);
  }
  /**
  *Setter: modifican los atributos de la clase de manera individual.
  *setDni: Permitir modificar el DNI de la persona si fuera necesario.
  *@param p_dni
  */
  private void setDni(int p_dni)
  {
     this.nroDni=p_dni;
  }
  private void setFecha(Calendar p_calendar)
  {
    this.fechaNacimiento=p_calendar;
  }
  
   /**
     * Asigna un nuevo valor al nombre de la persona.
     * 
     * Setname: Permitir modificar el nombre de la persona.
     * 
     * @param p_nombre seria el nuevo nombre de la persona
     */
  private void setName( String p_name)
  {
    this.nombre=p_name;
  }
 
 /**
     * Asigna un nuevo valor al apellido de la persona. 
     * @param p_apellido El nuevo apellido de la persona.
     */
  private void setApellido(String p_ape)
  {
    this.apellido=p_ape;
  }
 
  /**
     * Asigna un nuevo valor al año de nacimiento de la persona.
     * 
     * @param p_anio El nuevo año de nacimiento de la persona.
     */
  private void setAnio(int p_anio)
  {
    this.anioNacimiento=p_anio;
  }
  
  //getter = retornan los valores que contienen los atributos de la clase  de forma indivual.
  public int getDni()
  {
    return this.nroDni;
  }
  public String getNombre()
  {
    return this.nombre;
  }
  public String getApellido()
  {
    return this.apellido;
  }
  public int getBirth() //birth = nacimiento
  {
     return this.anioNacimiento;
  }
  //metodos 


  /**
     * Calcula y retorna la edad actual de la persona.
     * 
     * Funcionalidad: Calcula la cantidad de años cumplidos por la persona.
     * 
     * Comportamiento: La edad se calcula tomando la diferencia entre 
     * el año actual y el año de nacimiento. 
     * 
     * @return La edad de la persona actual. */
  public int edad()
  {
    Calendar fechaHoy= new GregorianCalendar();
    int aniohoy = fechaHoy.get(Calendar.YEAR);
    return (aniohoy - getBirth());
  }
  /**
   * 
     * Retorna el nombre y apellido de la persona concatenados en un solo String.
     * 
     * Funcionalidad: Proporciona el nombre completo en el formato "Nombre Apellido".
     * 
     * 
     * @return Un String que contiene el nombre y apellido de la persona.
     */
  public Calendar getFechadeNacimiento()
  {
    return this.fechaNacimiento;
  }
  public String nomYApe()
  {
    return (getNombre() + getApellido());
  }
  /**
   * Retorna  el apellido y el nombre de la persona concatenados en un solo String
   * Funcionalidad: Similar a la funcion anterior pero en el formato "Apellido Nombre"
   * 
   * @return Un String que contiene el apellido y el nombre de la persona.
   */
  public String apeYnom()
  {
    return ( getApellido() + getNombre());
  }
  
  public boolean esCumpleaños()
  {
    Calendar fechaHoy = Calendar.getInstance();
    if (this.getFechadeNacimiento()== fechaHoy) {
      return true;
    }else{
      return false;
    }
  }
  /**
   * Muestra en la consola los datos de la persona.
   * 
   * Funcionalidad: Imprime los datos básicos de la persona en la consola.
   */
  public void mostrar()
  {
    System.out.println("DNI:" + getDni());
    System.out.println("Nombre y apellido:"+ nomYApe());
    System.out.println("Año de nacimiento:"+ edad());
  }
}
