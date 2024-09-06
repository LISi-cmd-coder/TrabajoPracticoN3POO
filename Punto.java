
/**
 * La clase Punto representa un punto en un plano bidimensional con coordenadas X e Y.
 * 
 * Funcionalidad: Permite gestionar las coordenadas de un punto y realizar operaciones básicas 
 * como desplazar el punto y obtener sus coordenadas en diferentes formatos.
 * 
 * Comportamiento: Proporciona métodos para inicializar un punto, ajustar sus coordenadas, 
 * desplazarlo en el plano y mostrar sus coordenadas en diferentes formatos.
 */
public class Punto {
  private double x,y;
 

    /** 
     * Constructor por defecto que inicializa el punto en el origen (0, 0).
     * 
     * Funcionalidad: Crea un punto con coordenadas iniciales en el origen del plano.
     * 
     * Comportamiento: Asigna el valor 0 a las coordenadas X e Y.
     */
  public Punto ()
  {
    setX(0);
    setY(0);
  }
  
    /**
     * Constructor que inicializa el punto con las coordenadas especificadas.
     * 
     * Funcionalidad: Crea un punto con las coordenadas X e Y proporcionadas.
     * 
     * Comportamiento: Asigna los valores proporcionados a las coordenadas X e Y.
     * 
     * @param p_x La coordenada X del punto.
     * @param p_y La coordenada Y del punto.
     */
  public Punto (double p_x, double p_y)
  {
    this.setX(p_x);
    this.setY(p_y);
  }


 /**
     * Desplaza el punto por una distancia dada en las direcciones X e Y.
     * 
     * Funcionalidad: Modifica la posición del punto sumando las distancias proporcionadas
     * a las coordenadas actuales.
     * 
     * Comportamiento: Actualiza las coordenadas del punto sumando los valores proporcionados
     * a las coordenadas actuales.
     * 
     * @param p_dx La distancia a desplazar en la dirección X.
     * @param p_dy La distancia a desplazar en la dirección Y.
     */

 public void desplazar(double p_dx ,double p_dy )
 {
         this.x += p_dx;
         this.y += p_dy;      
 } 
    /**
     * Retorna una cadena con las coordenadas del punto en el formato: "(x, y)".
     * 
     * Funcionalidad: Proporciona una representación textual de las coordenadas del punto en un formato específico.
     * 
     * Comportamiento: Los valores de X e Y se concatenan con una coma y un espacio, rodeados por paréntesis.
     * 
     * @return Un String que representa las coordenadas del punto.
     */
 public String coordenadas() {
    return "(" + this.getX() + ", " + this.getY() + ")";
}

    /**
     * Muestra en la consola las coordenadas del punto en el formato: "Punto. X: [x], Y: [y]".
     * 
     * Funcionalidad: Imprime en la consola la representación textual de las coordenadas del punto.
     * 
     * Comportamiento: La salida se presenta en el formato especificado, mostrando las coordenadas actuales.
     */

public void mostrar() {
    System.out.println("Punto. X: " + this.getX()+ ", Y: " + this.getY() + "\t");
}
  //GETTERS
  public double getX()
  {
    return x;
  }
  public double getY()
  {
    return y;
  }
  //Setters.
  private void  setX( double p_x)
  {
    this.x=p_x;
  }
  private void setY(double p_y)
  {
    this.y=p_y;
  }
  public double distanciaA(Punto p_ptoDistante) {
    double dx = this.x - p_ptoDistante.getX(); // Diferencia en x
    double dy = this.y - p_ptoDistante.getY(); // Diferencia en y
    return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)); // Aplicación de Pitágoras usando Math.pow
} 

  
}
