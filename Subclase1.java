public class Subclase1 extends Base{
    
    private int unidades;
    private double precio;
    private boolean aprobado;
    
    /*
     * CONSTUCTOR
     */
    public Subclase1(int unidades,double precio,boolean aprobado){
    	this.unidades=unidades;
	    this.precio=precio;
	    this.aprobado=aprobado;
    }
    
    /*
     * GETTER AND SETTER
     */
    public int getUnidades(){
        return this.unidades;
    }
    public double getPrecio(){
        return this.precio;
    }
    public boolean getAprobado(){
        return this.aprobado;
    }
    
    public void setUnidades (int unidades){
        this.unidades=unidades;
    }
    public void setPrecio (double precio){
        this.precio=precio;
    }
    public void setAprobado (boolean aprobado){
        this.aprobado=aprobado;
    }
    
    /*
     * METODOS
     */
    public void total(){
        System.out.println("El total es " +unidades*precio);
    }
    
    // public String informar(String mensaje){
    //     return "Informacion pero personalizado para subclase1 "+mensaje;
    // }
    
    
    
}
