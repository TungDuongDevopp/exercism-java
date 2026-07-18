public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int minute) {
        return expectedMinutesInOven() - minute;
    }
    public int preparationTimeInMinutes(int layer){
        return 2*layer;
    }
    public int totalTimeInMinutes(int layer,int minute){
        return preparationTimeInMinutes(layer) + minute;
    }
}
