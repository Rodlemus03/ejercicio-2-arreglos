public class Familia {
    private String apellido;
    private int cantidadMiembros;
    private int cantidadKids;
    private int cantidadKidsMenores;
    private int grupo;
    /*
     * CONSTRUCTOR
     */
    public Familia(String apellido,int cantidadMiembros,int cantidadKids,int cantidadKidsMenores){
        this.apellido=apellido;
        this.cantidadMiembros=cantidadMiembros;
        this.cantidadKids=cantidadKids;
        this.cantidadKidsMenores=cantidadKidsMenores;
        // niños < 10--grupo 1
        // niños > 10--grupo 2
        // sin niños --grupo 3
        if(cantidadKidsMenores>0){
            this.grupo=1;
        }else if(cantidadKidsMenores<=0 && cantidadKids>0){
            this.grupo=2;
        }else{
            this.grupo=3;
        }
    }
    /*
     * Gets
     */
    public String getApellido(){return this.apellido;}
    public int getCantidadMiembros(){return this.cantidadMiembros;}
    public int getCantidadKids(){return this.cantidadKids;}
    public int getCantidadKidsMenores(){return this.cantidadKidsMenores;}
    public int getGrupo(){return this.grupo;}
     /*
      * Sets
      */
      public void setApellido(String apellido){this.apellido=apellido;}
      public void setCantidadMiembros(int cantidad){this.cantidadMiembros=cantidad;}
      public void setCantidadKids(int cantidad){this.cantidadKids=cantidad;}
      public void setCantidadKidssMenores(int cantidad){this.cantidadKidsMenores=cantidad;}
      public void setGrupo(int grupo){this.grupo=grupo;}

      /*
       * toString 
       */
      public String toString(){
        String cadena="";
        cadena+="\nApellido: "+this.apellido;
        cadena+="\nCantidad de miembros: "+this.cantidadMiembros;
        cadena+="\nCantidad niños: "+this.cantidadKids;
        cadena+="\nCantidad niños menores a 10 años: "+this.cantidadKidsMenores;
        cadena+="\nGrupo: "+grupo;
        return cadena;
      }
}
