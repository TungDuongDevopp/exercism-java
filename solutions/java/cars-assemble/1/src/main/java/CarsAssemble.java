public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        
        return switch (speed){
            case 1,2,3,4 -> 221*1.0*speed;
            case 5,6,7,8 -> 221*0.9*speed;
            case 9 -> 221*0.8*speed;
            case 10 -> 221*0.77*speed;    
            default -> 0;
        };
    }

    public int workingItemsPerMinute(int speed) {
       return (int)productionRatePerHour(speed) / 60;
    }
}
