public class Razas {
    private String nombre;
    private boolean peligroso;

    String[] razasPeligrosas=new String[]{"Pit bull terrier","American Staffordshire terrier","Tosa Inu","Dogo argentino","Dogo guatemalteco","Fila Brasileño","Presa canario","Dóberman","Gran perro japonés","Mastín napolitano","Presa Mallorqui","Dogo de burdeos","Bullmastiff","Bull terrier inglés","Bulldog americano","Rhodesiano","Rottweiler"};
    /*
     * Constructor
     */
    public Razas(String nombre){
        this.nombre=nombre;
    }
    public boolean verificarPeligroso(){
        boolean bandera=false;
        for(int i=0;i<razasPeligrosas.length;i++){
            if(razasPeligrosas[i]==this.nombre){
                this.peligroso=true;
                bandera=true;
            }else{
                bandera=false;
            }
        }
        return bandera;
    }
    /*
     * Gets
     */
    public String getNombre(){return this.nombre;}
    public boolean getPeligroso(){return this.peligroso;}
     /*
      * Sets
      */
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setPeligroso(boolean peligroso){this.peligroso=peligroso;}
    /*
     * toString
     */
    public String toString(){
        String cadena="";
        cadena+="\nEl perro de raza: "+this.nombre+", ";
        if(this.peligroso){
            cadena+=" es peligroso";
        }else{
            cadena+=" no es peligroso";
        }
        return cadena;
    }


}
