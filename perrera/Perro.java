public class Perro {
    private String nombre;
    private String raza="mestizo";
    private boolean peligroso;
    private String size;
    private int edad;
    private int estado;
    private String color;

    /*
     * Constructor
     */
    public Perro(String nombre, String raza,String size, int edad,int estado, String color){
        this.nombre=nombre;
        this.raza=raza;
        this.size=size;
        this.edad=edad;
        this.estado=estado;
        this.color=color;
    }
    /*
     * Gets
     */
    public String getNombre(){return this.nombre;}
    public String getRaza(){return this.raza;}
    public boolean getPeligroso(){return this.peligroso;}
    public String getSize(){return this.size;}
    public int getEdad(){return this.edad;}
    public int getEstado(){return this.estado;}
    public String getColor(){return this.color;}


     /*
      * Sets
      */
      public void setNombre(String nombre){this.nombre=nombre;}
      public void setRaza(String raza){this.raza=raza;}
      public void setPeligroso(boolean peligroso){this.peligroso=peligroso;}
      public void setSize(String size){this.size=size;}
      public void setEdad(int edad){this.edad=edad;}
      public void setEstado(int estado){this.estado=estado;}
      public void setColor(String color){this.color=color;}
    /*
     * Metodo para verificar si el perro es peligroso
     */

    public boolean verificarPeligroso(){
        boolean bandera=false;
        Razas razaVer=new Razas(nombre);
        bandera=razaVer.verificarPeligroso();
        return bandera;
    }

    /* 
    * ToString()
    */    
    public String toString(){
        String cadena="";
        cadena+="\n Nombre: "+this.nombre;
        cadena+="\n Raza: "+this.raza;
        cadena+="\n Peligroso: "+this.peligroso;
        cadena+="\n Size: "+this.size;
        cadena+="\n Edad: "+this.edad;
        cadena+="\n Estado de salud: "+this.estado;
        cadena+="\n Color: "+this.color;
        return cadena;
    }
}
