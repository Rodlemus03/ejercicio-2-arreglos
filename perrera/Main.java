import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //OBJETOS
        Familia[] familias=new Familia[3];
        Scanner teclado=new Scanner(System.in);
        Perro perro=new Perro("", "", "", 0, 0, "");
        String[] razasPeligrosas=new String[]{"Pit bull terrier","American Staffordshire terrier","Tosa Inu","Dogo argentino","Dogo guatemalteco","Fila Brasileño","Presa canario","Dóberman","Gran perro japonés","Mastín napolitano","Presa Mallorqui","Dogo de burdeos","Bullmastiff","Bull terrier inglés","Bulldog americano","Rhodesiano","Rottweiler"};
        Razas raza=new Razas("");
        //Declaracion de variables familia
        String apellido,banderaFamilia;
        int miembros,kids,kidsMenores;
        
        System.out.println("BIENVENIDO A HTC Hogares temporales para canes");
        for(int i=0;i<3;i++){
            System.out.println("Ingresa el apellido ");
            apellido=teclado.next();
            System.out.println("Ingresa la cantidad de miembros ");
            miembros=teclado.nextInt();
            System.out.println("Hay niños? ");
            banderaFamilia=teclado.next();
            if(banderaFamilia.equalsIgnoreCase("no")){
                kids=0;
                kidsMenores=0;
            }else{
                System.out.println("Cuantos niños hay? ");
                kids=teclado.nextInt();
                System.out.println("Cuantos son menores de 10 años?");
                kidsMenores=teclado.nextInt();
            }
            familias[i]=new Familia(apellido, miembros, kids, kidsMenores);

        }
        //System.out.println(familias[0].getGrupo());
        int respuesta=0;
        while(respuesta!=5){
            System.out.println("1. Recibir un perro ");
            System.out.println("2. Ver razas peligrosas ");
            System.out.println("3. Verificar familias");
            System.out.println("4. Asignar perro");
            System.out.println("5. Salir");
            respuesta=teclado.nextInt();
            if(respuesta==1){
                System.out.println("INGRESAR PERRO ");
                String nombre,raza,size,color;
                int edad,estado;
                System.out.println("Ingresa el nombre ");
                nombre=teclado.next();
                System.out.println("Ingresa la raza ");
                raza=teclado.next();
                System.out.println("Ingresa el tamaño ");
                size=teclado.next();
                System.out.println("Ingresa el color ");
                color=teclado.next();
                System.out.println("Ingresa su edad ");
                edad=teclado.nextInt();
                System.out.println("Ingresa el estado de salud ");
                estado=teclado.nextInt();
                perro.setNombre(nombre);
                perro.setRaza(raza);
                perro.setSize(size);
                perro.setColor(color);
                perro.setEdad(edad);
                perro.setEstado(estado);
                System.out.println("PERRO INGRESADO ");

            }else if(respuesta==2){
                System.out.println("RAZAS PELIGROSAS");
                    for(int i=0;i<razasPeligrosas.length;i++){
                        System.out.println(i+1+razasPeligrosas[i]);
                    }
            }else if(respuesta==3){
                System.out.println("VERIFICAR FAMILIAS ");
                for(int i=0;i<familias.length;i++){
                    if(familias[i].getGrupo()==1){
                        System.out.println("La familia "+familias[i].getApellido()+", no es apta para adoptar perros peligrosos ni grandes. ");
                    }else if(familias[i].getGrupo()==2){
                        System.out.println("La familia "+familias[i].getApellido()+", no es apta para adoptar, solo grandes y medianos. ");
                    }else if(familias[i].getGrupo()==3){
                        System.out.println("La familia "+familias[i].getApellido()+", es apta para adoptar cualquier tipo de perro ");
            }else if(respuesta==4){

            }else if(respuesta==5){
                System.out.println("Feliz dia ;) ");
            }else{
                System.out.println("Ingresa una opcion correcta");
            }

        }
    }
}