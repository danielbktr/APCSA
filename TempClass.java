public class TempClass {
    private final int minutesInHour = 60;

    public double convertToHours(double minutes){
        return (minutes/minutesInHour);}

    public double calcTip(double percent, double mealCost){
        // Note that this assumes the parameter percent is passed in the format ".17" for 17%, etc
        return (percent*mealCost);
    }

    public double calcTip(double mealCost){
        return (mealCost*.175);
    }
    }
