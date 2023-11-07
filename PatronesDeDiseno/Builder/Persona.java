package Java.PatronesDeDiseno.Builder;

public class Persona {
    private final String nombre;
    private final int edad;
    private final String direccion;
    private final String numeroTelefonico;
    
    /*Constructor persona */
    private Persona(Builder builder){
        this.nombre=builder.nombre;
        this.edad=builder.edad;
        this.direccion=builder.direccion;
        this.numeroTelefonico=builder.numeroTelefonico;
    }

    public String toString(){
        return "nombre: "+this.nombre+" edad: "+this.edad+" direccion: "+this.direccion+" numero telefonico: "+this.numeroTelefonico;
    }


    /*Clase anidada para seteo, requiere ser static para acceder a ella */
    public static class Builder{
        private String nombre;
        private int edad;
        private String direccion;
        private String numeroTelefonico;
    
        /*Constructor builder*/
        public Builder(String nombre){
            this.nombre=nombre;
        }

        /*Retorna en los seters el mismo objeto */
        public Builder edad(int edad){
            this.edad=edad;
            return this;
        }

        public Builder direccion(String direccion){
            this.direccion=direccion;
            return this;
        }

        public Builder numeroTelefonico(String numeroTelefonico){
            this.numeroTelefonico=numeroTelefonico;
            return this;
        }
        /*Retorna el objeto persona */
        public Persona build(){
            return new Persona(this);
        }

    }


}
