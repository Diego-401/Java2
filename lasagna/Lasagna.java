package lasagna;

public class Lasagna {
    private int timeMinutesInOven=40;
    public int expectedMinutesInOven(){
        return timeMinutesInOven;
    }    

    public int remainingMinutesInOven(int minutesinOven){
        return timeMinutesInOven-minutesinOven;
    }

    public int preparationTimeInMinutes(int time){
        return time * 2;
    }

    public int totalTimeInMinutes(int preparationTime, int minutesinOven){
        return (preparationTime*2) + minutesinOven;
    }
}
