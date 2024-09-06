
/**
 * Write a description of class Hospital here.
 * 
 * @author Lisandro Valenzuela 
 * @version 11032002
 */
public class Hospital
{
    private String nombreHospital;
    private String nombreDirector;
    private Paciente paciente;

    public Hospital(String p_NombreHospi,String p_nombreDirec,Paciente p_Paciente)
    {
        setHospi(p_NombreHospi);
        setNombreDirector(p_nombreDirec);
        setPaciente(p_Paciente);
    }

    //setters
    private void setHospi(String p_nombrehospi)
    {
        this.nombreHospital=p_nombrehospi;
    }

    private void setNombreDirector(String p_direc)
    {
        this.nombreDirector=p_direc;
    }

    private void setPaciente(Paciente p_paciente)
    {
        this.paciente=p_paciente;
    }
    public  void consultaDatosFiliatorios(Paciente p_paciente )
    {
        System.out.println("Paciente: " + this.paciente.getName() + "Historia clinica: " + this.paciente.getNro() +"Domicilio: " +this.paciente.getDom() +"\n");
        System.out.println(this.paciente.getLugaryProv());
    }
}
