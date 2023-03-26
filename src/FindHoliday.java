import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FindHoliday {
    public static void main (Holiday [] holidayArray) {
        Scanner readDate = new Scanner(System.in);
        System.out.printf("Informe a data que você quer saber se é feriado no formato dd/mm/aaaa: ");
        String inputDate = readDate.next(); 

        boolean foundHoliday = false;

        for (int i = 0; i < holidayArray.length; i++) {
            Holiday holiday = holidayArray[i];

            if(Objects.equals(inputDate, holiday.date)) {
                foundHoliday = true;
                System.out.println("O feriado existe! " + holiday.name + " - " + holiday.date);
                break;
            }
        }

        if(!foundHoliday) {
            System.out.println("A data " + inputDate + " não é um feriado");
        }
    }
}
