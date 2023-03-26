public class HolidayList {
    public static void main (Holiday[] holidayArray) {        
        for (int i = 0; i < holidayArray.length; i++) {
            Holiday holiday = holidayArray[i];

            System.out.println(holiday.name + " - " + holiday.date );
        }
    }
}
