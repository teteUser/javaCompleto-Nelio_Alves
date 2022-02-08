package general.date.calendarpractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        //cal.add(Calendar.HOUR_OF_DAY, 4); // Somando 4 horas na variável cal
        //d = cal.getTime(); // Retornando a hora da variável cal para a variável d
        //System.out.println(sdf.format(d)); // Imprimindo a variável d com a formatação no padrão sdf (previamente declarado e definido)

        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);

    }
}
