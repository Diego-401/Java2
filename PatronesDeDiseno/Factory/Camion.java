package Java.PatronesDeDiseno.Factory;

public class Camion implements Transporte{
    @Override
    public String medioDeTransporte(){
        return "Soy un camion y me muevo por medio terrestre";
    }
}
