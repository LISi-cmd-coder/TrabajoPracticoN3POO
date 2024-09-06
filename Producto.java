
/**
 * Write a description of class Producto here.
 * 
 * @author lisandro Valenzuela
 * @version 25/08
 */


public class Producto
{
    // instance variables 
    private int  codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio lab; //SE CREA UNA VARIABLE INSTANCIA DEL TIPO OBJETO.
    public Producto( int p_codigo ,String p_rubro, String p_desc,double p_costo ,int p_stock, double p_porcPtoRepo,int p_existMinima, Laboratorio p_lab){
        this.setCod(p_codigo);
        this.setRubro(p_rubro);
        this.setDescrip(p_desc);
        this.setCosto(p_costo);
        this.setStock(p_stock);
        this.setptoRepo(p_porcPtoRepo);
        this.setexistMin(p_existMinima);
        this.setLab(p_lab);
    }
    public Producto (int p_codigo,String p_rubro,String p_desc ,double p_costo,Laboratorio p_lab)
    {
        this.setCod(p_codigo);
        this.setRubro(p_rubro);
        this.setDescrip(p_desc);
        this.setCosto(p_costo);
        this.setLab(p_lab);
    }
    //setters 
    private void setLab(Laboratorio p_lab){
        this.lab=p_lab;
    }
    private void setCod(int p_cod){
        this.codigo=p_cod;
    }
    private void setRubro(String p_rub){
        this.rubro=p_rub;
    }
    private void setDescrip(String p_des){
        this.descripcion=p_des;
    }
    private void setCosto(double p_costo){
        this.costo=p_costo;
    }
    private void setStock(int p_stock){
        this.stock=p_stock;
    }
    private void setptoRepo(double p_repo){
        this.porcPtoRepo=p_repo;
    }
    private void setexistMin (int p_min){
        this.existMinima=p_min;
    }
    
    //getters 
    public int getCod()
    {
        return this.codigo;
    }
    public String getRubro()
    {
        return this.rubro;
    }
    public String getDescripcion()
    {
        return this.descripcion;
    }
    public double getCosto()
    {
        return this.costo;
    }
    public int getStock()
    {
        return this.stock;
    }
    public double getRepo()
    {
        return this.porcPtoRepo;
    }
    public int getMin()
    {
        return this.existMinima;
    }
    public Laboratorio getLab()
    {
        return this.lab;
    }
  //metodos solicitados.
   public void ajuste(int p_cantidad)
   {
    this.stock+=p_cantidad; //en este caso si es positivo suma y si es negativo resta.
   } 

   public double stockValorizado()
   {
    return (this.getStock()* this.getCosto() * 1.12);//12 porciento en forma decimal 
   }

   public double precioLista()
   {
    return (this.getCosto() + (this.getCosto() * 12 / 100));
   }

   public double precioContado()
   {
    return this.getCosto() - (this.getCosto()* 0.05);
   }
   public void ajustarPtoRepo(double p_pto)
   {
     setptoRepo(p_pto);
   }
   public void ajustarExistMin(int p_min)
   {
    setexistMin(p_min);
   }
   
  public String  mostrarLinea()
  {
    //casteamos los valores numericos.
    String precio = String.format("%.2f",this.getCosto());
    String precioContado= String.format("%.2f",this.precioContado());
    return this.getDescripcion()+"\t"+precio+ "\t"+precioContado;
  }

   public void mostrar(){
    System.out.println("Laboratorio: "+ lab.getNombre());
    System.out.println("Domicilio: " + lab.getDomicilio() + "\t" + "telefono "+ lab.getTelefono()+"\n");
    System.out.println("Rubro: "+ this.getRubro());
    System.out.println("Descripcion: "+this.getDescripcion());
    System.out.println("Precio costo: "+this.getCosto());
    System.out.println("Stock "+this.getStock()+"\t-\t"+"Stock valorizado "+this.stockValorizado());
   }

   public static void main(String [] args)
   {
    Laboratorio lab = new Laboratorio("Drogueria S.A", "P. Sherman Calle Wallaby 42, Sidney", "3794547259");
    Producto GestionStock = new Producto(5, "Benzodiacepinas", "rivotril", 100.0, 500, 5, 0, lab);
    GestionStock.ajuste(-200);
    GestionStock.mostrar();
    System.out.println(" "+ GestionStock.mostrarLinea());;
   }
}

