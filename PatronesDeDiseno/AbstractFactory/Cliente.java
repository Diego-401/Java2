package Java.PatronesDeDiseno.AbstractFactory;
/*es un patrón creacional que proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas. */
public class Cliente {
    public void crearConjunto(Conjunto conjunto){
        Sala sala=conjunto.crearSala();
        Mesa mesa=conjunto.crearMesa();
        Silla silla=conjunto.crearSilla();

        System.out.println(sala.crearSala());
        System.out.println(mesa.crearMesa());
        System.out.println(silla.crearSilla());
    }

    public static void main (String [] args){
        Cliente cliente = new Cliente();
        Conjunto conjuntoClasico=new ConjuntoClasico();
        Conjunto conjuntoModerno=new ConjuntoModerno();

        cliente.crearConjunto(conjuntoClasico);
        cliente.crearConjunto(conjuntoModerno);

    }
}
