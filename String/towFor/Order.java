package String.towFor;
/*Instructions
Your task is to determine what you will say as you give away the extra cookie.

If your friend likes cookies, and is named Do-yun, then you will say:

One for Do-yun, one for me.
If your friend doesn't like cookies, you give the cookie to the next person in line at the bakery. Since you don't know their name, you will say you instead.

One for you, one for me.
Here are some examples:

Name	Dialogue
Alice	One for Alice, one for me.
Bohdan	One for Bohdan, one for me.
        One for you, one for me.
Zaphod	One for Zaphod, one for me. */
public class Order{
    public static void main(String args[]){
        TwoFer twoFer= new TwoFer();
        System.out.println(twoFer.twofer(null));
        System.out.println(twoFer.twofer("Diego"));
    }    
}
