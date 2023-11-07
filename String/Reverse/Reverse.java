package String.Reverse;

public class Reverse {
    public String reverseWord(String word){
        word.charAt(0);
        String newWord="";
        for(int i=word.length()-1;i>-1;i--){
            newWord=newWord+word.charAt(i);
        }

        StringBuilder reverseWordString = new StringBuilder();
        reverseWordString.append(word);
        return reverseWordString.reverse().toString();
    }    
}
