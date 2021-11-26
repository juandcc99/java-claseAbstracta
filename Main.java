public class Main{
    
    public static void main(String[] args){
        /* CODE */
        // Jugador jugador = new Jugador();
        // jugador.jugar();
        
        Subclase1 subclase1 = new Subclase1(20,7.95,true);
        
        System.out.println(subclase1.getUnidades());
        System.out.println(subclase1.getPrecio());
        System.out.println(subclase1.getAprobado());
        
        subclase1.setPrecio(8.95);
        
        System.out.println(subclase1.getPrecio());
        
        subclase1.total();
        String informacion = subclase1.informar("HOLA");
        System.out.println(informacion);
        
    }
    
}//cierra la clase
