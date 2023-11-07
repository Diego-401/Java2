package String.towFor;

//import java.util.Optional;

public class TwoFer {
    public String twofer(String name) {
        String result=null;
        if(name==null){
            result="One for you, one for me.";
        }else{
            result="One for "+name+", one for me.";
        }
        return result;
        //return String.format("One for %s, one for me.",Optional.ofNullable(name).orElse("you"));
    }   
}
