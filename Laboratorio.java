
/**
 * La clase Laboratorio representa a un proveedor de medicamentos.
 * Permite gestionar la información básica del laboratorio, como nombre, domicilio,
 * teléfono, y políticas de compra mínima y día de entrega.
 * 
 * Funcionalidad: Esta clase permite crear instancias de laboratorios con sus datos,
 * modificar las políticas de compra mínima y día de entrega, y obtener la información del laboratorio.
 * 
 * Comportamiento: Los atributos se encapsulan y se proporcionan métodos públicos para
 * acceder y modificar las políticas comerciales.
 */
public class Laboratorio
{  //atributos privados
    private String nombre;
    private String domicilio;
    private String telefono;
    //atributos publicos
    public int compraMinima;
    public int diaEntrega;

     /**
     * Constructor que inicializa una instancia de Laboratorio con todos los datos proporcionados.
     * 
     * Funcionalidad: Inicializa los atributos del laboratorio con los valores proporcionados.
     * 
     * Comportamiento: Asigna los valores proporcionados a los atributos correspondientes.
     * 
     * @param p_nombre El nombre del laboratorio.
     * @param p_domicilio El domicilio del laboratorio.
     * @param p_telefono El teléfono del laboratorio.
     * @param p_compraMin La compra mínima requerida por el laboratorio.
     * @param p_diaEnt El día de entrega establecido por el laboratorio.
     */
    Laboratorio(String p_nombre,String p_domicilio,String p_telefono,int p_compraMinima,int p_diaEntrega)
    {
      this.setNombre(p_nombre);
      this.setDomicilio(p_domicilio);
      this.setTelefono(p_telefono);
      this.nuevaCompraMinima(p_compraMinima);
      this.nuevoDiaEntrega(p_diaEntrega);
    }

 /**
     * Constructor que inicializa una instancia de Laboratorio con los datos básicos,
     * dejando la compra mínima y el día de entrega sin establecer.
     * 
     * Funcionalidad: Permite crear un laboratorio con solo los datos básicos, dejando
     * las políticas comerciales por defecto para ser establecidas posteriormente.
     * 
     * Comportamiento: Inicializa los atributos obligatorios, dejando los valores de 
     * compra mínima y día de entrega con valores predeterminados o no establecidos.
     * 
     * @param p_nombre El nombre del laboratorio.
     * @param p_domicilio El domicilio del laboratorio.
     * @param p_telefono El teléfono del laboratorio.
     */

    Laboratorio(String p_nombre,String p_domicilio,String p_tel)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_tel);
        this.nuevaCompraMinima(0);
        this.nuevoDiaEntrega(0);
    }
      
    /**
     * Modifica la compra mínima requerida por el laboratorio.
     * 
     * Propósito: Permitir ajustar la política de compra mínima según las necesidades comerciales.
     * 
     * @param p_compraMin El nuevo valor de compra mínima.
     */

    public void nuevaCompraMinima(int p_compraMinima)
    {
      this.compraMinima = p_compraMinima;
    } 

    /**
     * Modifica el día de entrega establecido por el laboratorio.
     * 
     * Propósito: Permitir ajustar el día de entrega de los productos según las políticas del laboratorio.
     * 
     * @param p_diaEnt El nuevo día de entrega.
     */
    
     public void nuevoDiaEntrega( int p_diaEnt)
    {
        this.diaEntrega = p_diaEnt; 
    }
 
   //set y get para atributos privados
   /*
   *Si bien la tabla UMl no especificaba crear cada set y get para modificar o ver los valores
   *decidi implimentarlos para encapsular mas.
  */
   public String getNombre()
   {
    return this.nombre;
   }
   public void setNombre(String p_nombre)
   {
    this.nombre=p_nombre;
   }

   public String getDomicilio()
   {
    return this.domicilio;
   }

   public void setDomicilio(String p_domi)
   {
    this.domicilio=p_domi;
   }
   public String getTelefono()
   {
    return this.telefono;
   }
   public void setTelefono(String p_telefono)
   {
    this.telefono = p_telefono;
   }
    
   
   /**
     * Retorna una cadena de texto que contiene la información completa del laboratorio.
     * 
     * Funcionalidad: Proporciona una descripción detallada del laboratorio, incluyendo
     * nombre, domicilio, teléfono, compra mínima y día de entrega.
     * 
     * Comportamiento: Los atributos se concatenan en una cadena.
     * 
     * @return Un String que contiene la información del laboratorio.
     */

   public String Mostrar()
   {
    String mostrar;
    mostrar= ("Laboratorio:"+this.getNombre()+ "\n" +"Domicilio:"+this.getDomicilio() + "\n" +"Telefono:"+this.getTelefono());
    return mostrar;
   }


}
