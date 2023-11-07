package Java.PatronesDeDiseno.Factory;

public class Avion implements Transporte {
    @Override
    public String medioDeTransporte(){
        return "Soy un avion y me traslado por el aire";
    }

    public String otroMetodo(){
        return "Se puede tener varios metodos";
    }
}
