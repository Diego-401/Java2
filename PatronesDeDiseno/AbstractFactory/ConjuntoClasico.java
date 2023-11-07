package Java.PatronesDeDiseno.AbstractFactory;

public class ConjuntoClasico implements Conjunto{
    
    @Override
    public Silla crearSilla(){
        return new SillaClasica();
    }

    @Override
    public Mesa crearMesa(){
        return new MesaClasica();
    }

    @Override
    public Sala crearSala(){
        return new SalaClasica();
    }
}
