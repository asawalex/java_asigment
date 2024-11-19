public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        validateTime(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void validateHour(int hour){
        boolean isValidHour = hour < 0 || hour >= 23;
        if(isValidHour) throw new IllegalArgumentException("Hour should be between 0 and 24");

    }
    public void validateMinute(int minute){
        boolean isValidMinute = minute < 0 || minute >= 59;
        if(isValidMinute) throw new IllegalArgumentException("Minute should be between 0 and 59");
    }
    public void validateSecond(int second){
        boolean isValidSecond = second < 0 || second >= 59;
        if(isValidSecond) throw new IllegalArgumentException("Second should be between 0 and 59");
    }
    public void validateTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

}
