
/**
 * Write a description of class Hombre here.
 * 
 * @author Lisandro Valenzuela
 * @version 11032002
 * NOTA: CONSULTAR POR LOS METODOS EN LA CLASE MUJER.
 */
public class Hombre
{
    private String nombre, apellido, estadoCivil;
    private int edad;
    private Mujer mina;



    public  Hombre (String p_nombre, String p_apellido , int p_edad)
    {
        this.setNombre(p_apellido);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setMujer(null); //por defecto no posee mujer alguno. 
        this.setEstado("soltero");//por lo tanto por defecto esta soltero.
    }

    public Hombre(String p_Nombre,String p_Apellido,int p_edad, Mujer p_mujer)
    {
        this.setNombre(p_Nombre);
        this.setApellido(p_Apellido);
        this.setEdad(p_edad);
        this.setMujer(p_mujer); // caso donde se encuentre efectivamente casada 
        this.setEstado("casado"); // por lo tanto su estado civil es no soltera.
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
    private void setMujer( Mujer p_chica)
    {
        this.mina=p_chica;

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

    public void divorcio()
    { 
        if (this.getEstado().equals("casado") && this.mina != null) {
            this.setEstado("Divorciado"); //cambiamos el estado civil
            this.mina.divorcio(); //divorciamos a ambos.
            this.mina= null; //eliminamos la referencia.
         }else
         {
          System.out.println("No está casado");
         }
    }

    public boolean puedeCasarse(Mujer p_mujer)
    {
        if(!this.getEstado().equals("casado") && !p_mujer.getEstado().equals("casada")) 
        {
            return true; 
        }else
        {
            return false;
        }
    }


    public void casarseCon(Mujer p_mujer)
    {
        if (this.puedeCasarse(p_mujer) == true) {
            this.mina = p_mujer; //asignamos el casamiento.
            this.estadoCivil= "Casada"; //y cambiamos el estado civil de la persona!
            p_mujer.casarseCon(this); //asignamos el casamiento desde la otra parte tambien.
        }else
        {
            System.out.println("ERROR: CHECK EL ESTADO CIVIL DE ALGUNA DE LAS PARTES.");
        }
    }

    public void mostrarEstadoCivil ()
    {
        System.out.println(this.getNombre() +"de " +this.getEdad()+"años"+this.getEstado());
    }
    public void casadaCon()
    {
        System.out.println(this.getNombre()+ " de "+ this.getEdad()+"años"+ "esta casada con" +this.mina.nomYape() + "de" + this.mina.getEdad()+"años");
    }

}
