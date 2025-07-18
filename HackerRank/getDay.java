import java.util.Calendar;

public class getDay {
     public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year,month-1,day);
        int day_of_week = c.get(Calendar.DAY_OF_WEEK);
        String[] Days = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        
        return Days[day_of_week-1];
    }
    public static void main(String[] args) {
        String day = findDay(07, 18, 2025);
        System.out.println(day);
    }
}
