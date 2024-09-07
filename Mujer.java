
/**
 * Write a description of class Mujer here.
 * 
 * @author Valenzuela Lisandro
 * @version 11032002
 */
public class Mujer
{
    private String nombre, apellido, estadoCivil;
    private int edad;
    private Hombre vago;

    public  Mujer (String p_nombre, String p_apellido , int p_edad)
    {
        this.setNombre(p_apellido);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setHombre(null); //por defecto no posee hombre alguno. 
        this.setEstado("Soltera");//por lo tanto por defecto esta soltera.
    }

    public Mujer(String p_Nombre,String p_Apellido,int p_edad, Hombre p_hombre)
    {
        this.setNombre(p_Nombre);
        this.setApellido(p_Apellido);
        this.setEdad(p_edad);
        this.setHombre(p_hombre); // caso donde se encuentre efectivamente casada 
        this.setEstado("Casada"); // por lo tanto su estado civil es no soltera.
    }

    private void setNombre(String p_name)
    {
        this.nombre=p_name;
    }
    private void setApellido(String p_name)
    {
        this.apellido=p_name;
    }
    private void setEdad(int p_edad)
    {
        this.edad = p_edad;
    }
    private void setHombre( Hombre p_Hombre)
    {
        this.vago=p_Hombre;

    }
    private void setEstado(String p_estado)
    {
        this.estadoCivil=p_estado;
    }

    public String getNombre()
    {
        return this.nombre;
    }
    public String getApelle()
    {
        return this.apellido;
    }
    public String nomYape()
    {
        return this.getNombre()+","+this.getApelle();
    }

    public int getEdad()
    {
        return this.edad;
    }
    public String getEstado()
    {
        return this.estadoCivil;
    }
    public String datos()
    {
        return this.nomYape()+ "de " + this.getEdad() + "años";
    }

    /*En el caso de divorcio()  primero corroboramos que este casado ¿si no que sentido tiene divorciarse? 
     * 
     * Entonces preguntamos porque este casado y que realmente exista el objeto con el que esta casado (this.vago != null) si es comparable con null es porque porque no esta enlazada al otro objeto
     * 
     * realizamos el cambio de estado a "divorciada"
     * 
     * tambien divorciamos al otro objeto mediante su propio mensaje definido en su clase.
     * 
     */
    public void divorcio()
    { 
       if (this.getEstado().equals("casada") && this.vago != null) {
          this.setEstado("Divorciada"); //cambiamos el estado civil
          this.vago.divorcio(); //divorciamos a ambos.
          this.vago= null; //eliminamos la referencia.
       }else
       {
        System.out.println("No está casada");
       }
    }
    /*
    puedeCasarse(Hombre p_Hombre): metodo que agregue para poder determinar si la persona se encuentra en situacion disponible para casarse 
    1-compara si el estado tanto de la mujer como del hombre son desiguales de casado. puesto que varios estados de solteria, es mas facil preguntar si no estan casados.
    2-Si el estado es igual a casado entonces retorna false y no puede casarse con p_hombre.
    
    */
    public boolean puedeCasarse(Hombre p_Hombre)
    {
        if(!this.getEstado().equals("casada") && !p_Hombre.getEstado().equals("casado")) 
        {
            return true; 
        }else
        {
            return false;
        }
    }
    //En base a la funcion definida arriba ahora podremos realizar la union en legal matrimonio  de ambos.
    public void casarseCon(Hombre p_Hombre)
    {
        if (this.puedeCasarse(p_Hombre) == true) {
            this.vago = p_Hombre; //asignamos el casamiento.
            this.estadoCivil= "Casada"; //y cambiamos el estado civil de la persona!
            p_Hombre.casarseCon(this); //asignamos el casamiento desde la otra parte tambien.
        }else
        {
            System.out.println("ERROR: CHECK EL ESTADO CIVIL DE ALGUNO");
        }
    }


    public void mostrarEstadoCivil ()
    {
        System.out.println(this.getNombre() +"de " +this.getEdad()+"años"+this.getEstado());
    }
    public void casadaCon()
    {
        System.out.println(this.getNombre()+ " de "+ this.getEdad()+"años"+ "esta casada con" +this.vago.nomYape() + "de" + this.vago.getEdad()+"años");
    }


}
   
