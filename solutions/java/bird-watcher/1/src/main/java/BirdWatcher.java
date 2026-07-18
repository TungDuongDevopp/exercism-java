
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int lastIndex;
    private static final int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        lastIndex = birdsPerDay.length-1;
    }

    public static int[] getLastWeek() {
      return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[lastIndex];
    }

    public void incrementTodaysCount() {
       birdsPerDay[lastIndex]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int bird : birdsPerDay){
            if(bird == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
       int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
       int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
