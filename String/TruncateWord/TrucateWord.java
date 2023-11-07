package String.TruncateWord;

public class TrucateWord {
    public static String shortWord(String input){
        /*El método  offsetByCodePoints  en Java se utiliza para obtener el índice(distancia)
        de un punto de código Unicode dentro de una cadena, dado un índice inicial y un
        desplazamiento en términos de puntos de código. 
        
        Es importante tener en cuenta que los puntos de código Unicode pueden ocupar más de un  
        char  en una cadena, especialmente en casos de caracteres especiales o de caracteres que 
        requieren más de 16 bits para su representación
        */
        System.out.println(input.offsetByCodePoints(0, 5));
        return input.length() < 5 ? input:input.substring(0, input.offsetByCodePoints(0, 5));
    }  
}
