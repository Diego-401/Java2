package Java.PatronesDeDiseno.Prototype;

public class Main {
    public static void main(String [] args){
        Persona persona=new Persona.Builder("Diego")
        .apellido("Garcia")
        .edad(30)
        .estadoCivil("Casado con Leslie")
        .build();

        Persona persona2=new Persona.Builder("Leslie")
        .apellido("Romero")
        .edad(20)
        .estadoCivil("Casado con Diego")
        .build();

        //Crea un clon
        Persona persona3=null;
        try {
            persona3=persona.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //Apunta misma direccion de memoria
        Persona persona4= persona;

        persona3.setNombre("Nose");
        System.out.println(persona.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        System.out.println(persona.hashCode());
        System.out.println(persona3.hashCode());
        System.out.println(persona4.toString());
        System.out.println(persona4.hashCode());
    }
}
