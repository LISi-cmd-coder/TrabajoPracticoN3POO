
/**
 * Write a description of class Escuela here.
 * 
 * @author ( Lisandro Valenzuela ) 
 * @version (11032002);
 */
public class Escuela {
    private String nombre, domicilio,director;
    private Docente maestro;
    
    public Escuela (String p_nombre,String p_domicilio,String p_director)
    {
        this.setNombre(p_nombre);
        this.setDomi(p_domicilio);
        this.setDirec(p_director);
    }
    //setters
    private void setNombre(String p_nombre)
    {
        this.nombre=p_nombre;
    }
    private void setDomi(String p_domi)
    {
        this.domicilio=p_domi;
    }
    private void setDirec( String p_dire)
    {
        this.director=p_dire;
    }
    //getters
    public String getEscuela()
    {
        return this.nombre;
    }
    public String getDom()
    {
        return this.domicilio;
    }
    public String getDirec()
    {
        return this.director;
    }
  
    public void imprimirRecibo( Docente p_docente)
    {
        System.out.println("Escuela: " + this.getEscuela()+ "Domicilio: " + this.getDom() + "Director " + getDirec()+"\n");
        System.out.println("--------------------------------------------------------------------\n");
        System.out.println("Docente: "+ p_docente.getNombre());
        System.out.println("Sueldo:......................... $ "+ p_docente.getSueldo());
        System.out.println("Sueldo basico:................. $ 1.600");
        System.out.println("Asignacion familiar:.............. $" + p_docente.getAsig());
    }

    public static void main(String[] args)
    {
        Docente docente = new Docente("JULIAN DOMINGUEZ", " INGENIERO", 150000, 50000);
        Escuela secretaria = new Escuela(" Bruno Rossi de la Rosa ledesma", "p sherman calle wallaby 42 sidney", "Juan domingo Peron");
        secretaria.imprimirRecibo(docente); 
    }
}
