
/**
 * Write a description of class Docente here.
 * 
 * @author Valenzuela Lisandro
 * @version 11032002
 */
public class Docente
{
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    public Docente(String p_name,String p_grado,double p_sueldo,double p_asig)
    {
        this.setName(p_name);
        this.setGrado(p_grado);
        this.setSueldo(p_sueldo);
        this.setAsigFamiliar(p_asig);
    }
    //setters
    private void setName(String p_name){
        this.nombre=p_name;
    }
    private void setGrado(String p_grado)
    {
        this.grado=p_grado;
    }
    private void setSueldo(double p_plata)
    {
        this.sueldoBasico=p_plata;
    }
    private void setAsigFamiliar(double p_asig)
    {
        this.asignacionFamiliar=p_asig;
    }
    //getters
    public double getSueldo()
    {
        return this.sueldoBasico;
    }
    public double getAsig()
    {
        return this.asignacionFamiliar;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public  String getGrado()
    {
        return this.grado;
    }
    //metodos
    //El sueldo del docente se calcula mediante la suma de sueldo básico y la asignación familiar
    public double calcularSueldo()
    {
        return getSueldo() + getAsig();
    }
}
