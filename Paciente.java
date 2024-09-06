
/**
 * Write a description of class Paciente here.
 * 
 * @author Lisandro Valenzuela
 * @version 11032002
 */
public class Paciente
{
    private int historiaClinica;
    private String nombre;
    private String domicilio;

    private Localidad localidadVive;
    private Localidad localidadDonEs;
    
    public Paciente(int p_historia,String p_nombre, String domicilio, Localidad p_localidadNacido,Localidad p_localidadVive)
    {
        setHistoriaClinica(p_historia);
        setNombre(p_nombre);
        setDomicilio(domicilio);
        setLocalidad(p_localidadVive);
        setLocalidadOrigen(p_localidadNacido);
    }

    //setters;
    private void setHistoriaClinica(int p_historial)
    {
        this.historiaClinica=p_historial;
    }
    private void setNombre(String p_name)
    {
        this.nombre=p_name;
    }
    private void setDomicilio(String p_domicilio)
    {
        this.domicilio=p_domicilio;
    }
    private void setLocalidad(Localidad p_Localidad)
    {
        this.localidadVive=p_Localidad;
    }
    private void setLocalidadOrigen(Localidad p_Localidad)
    {
        this.localidadDonEs=p_Localidad;
    }

    //getters;
    public Localidad getNacido()
    {   
        return this.localidadDonEs;
    }
    public Localidad getVive()
    {
        return this.localidadVive;
    }
    public String getName()
    {
        return this.nombre;
    }
    public int getNro()
    {
        return this.historiaClinica;
    }
    //get dom retorna el domicilio.
    public String getDom()
    {
        return this.domicilio;
    }

    public String getLugaryProv()
    {
        return this.localidadDonEs.mostrar();
    }
    public  String cadenaDeDatos()
    {
        return " " +getName() + "......"+ " "+getNro()+ "......." + " " +getDom()+"-"+" " + this.localidadDonEs.getNombre()+"-"+ " "+this.localidadDonEs.getProvincia() ;
    }

}
