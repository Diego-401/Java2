package Java.PatronesDeDiseno.Factory;

public class Barco implements Transporte{
    @Override
    public String medioDeTransporte(){
        return "Soy un barco y me traslado por el mar";
    }
}
