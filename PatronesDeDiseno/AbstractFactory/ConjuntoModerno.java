package Java.PatronesDeDiseno.AbstractFactory;

public class ConjuntoModerno implements Conjunto{
    @Override
    public Silla crearSilla(){
        return new SillaModerna();       
    }

    @Override
    public Mesa crearMesa(){
        return new MesaModerna();
    }
    
    @Override
    public Sala crearSala(){
        return new SalaModerna();
    }
}
