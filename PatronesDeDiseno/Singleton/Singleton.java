package Java.PatronesDeDiseno.Singleton;

public class Singleton {
    private static Singleton instancia;
    //Constructor privado
    private Singleton(){}

    public static Singleton getInstance(){
        if(instancia==null){
            instancia= new Singleton();
        }
        return instancia;
    }
}
