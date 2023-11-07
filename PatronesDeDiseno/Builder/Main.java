package Java.PatronesDeDiseno.Builder;

/*Sirve para cuando el constructor de un objeto es demasiado grande, especificar los parametor a mandar */
public class Main {
    public static void main(String args[]){
        Persona persona= new Persona.Builder("Diego")
                        .edad(30)
                        .direccion("Av. colonias")
                        .numeroTelefonico("55555555")
                        .build();
        System.out.println(persona.toString());
    }
}
