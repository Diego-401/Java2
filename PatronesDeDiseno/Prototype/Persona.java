package Java.PatronesDeDiseno.Prototype;

import java.util.Objects;
/*Se implementa cloneable */
public class Persona implements Cloneable{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;

    private Persona(Builder builder){
        this.nombre=builder.nombre;
        this.apellido=builder.apellido;
        this.edad=builder.edad;
        this.estadoCivil=builder.estadoCivil;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /*Identificador unico del objeto, se pueden implementar de cualquier manera */
    @Override
    public int hashCode(){
        int resultado= nombre !=null ? nombre.hashCode() : 0;
        resultado=31*resultado+(apellido!=null ? apellido.hashCode() : 0);
        resultado=31*resultado+(edad>0 ? edad : 0);
        resultado=31*resultado+(estadoCivil!=null ? estadoCivil.hashCode() : 0);
        return resultado;
    }
    
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Persona that= (Persona) o;
        return Objects.equals(nombre,that.nombre) && Objects.equals(apellido, that.apellido) && edad==that.edad && Objects.equals(estadoCivil, that.estadoCivil);
    }

    @Override
    public String toString(){
        return "nombre: "+this.nombre+" Apellido: "+this.apellido+" edad: "+this.edad+" estado civil: "+this.estadoCivil;
    }

    @Override
    protected Persona clone() throws CloneNotSupportedException{
        Persona clonePerson = new Persona();
        clonePerson.setNombre(this.nombre);
        clonePerson.setApellido(this.apellido);
        clonePerson.setEdad(this.edad);
        clonePerson.setEstadoCivil(this.estadoCivil);
        return clonePerson;
    }

    public Persona(){}

    /*Aplicando patron builder*/
    public static class Builder{
        private String nombre;
        private String apellido;
        private int edad;
        private String estadoCivil;

        public Builder(String nombre){
            this.nombre=nombre;
        }

        public Builder apellido(String apellido){
            this.apellido=apellido;
            return this;
        }

        public Builder edad(int edad){
            this.edad=edad;
            return this;
        }

        public Builder estadoCivil(String estadoCivil){
            this.estadoCivil=estadoCivil;
            return this;
        }

        public Persona build(){
            return new Persona(this);
        }
    }
}
