package classes_utilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDateFormat_ {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y HH:mm:ss");
        Calendar data = new GregorianCalendar(2010, 2, 23, 14, 45,23);

        System.out.println(sdf.format(data.getTime()));

        Date hoje = new Date();
        System.out.println(sdf.format(hoje));

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/y");
        String minhaData = "20/02/2000";

        try {
            Date minhaDataEmDate = sdf1.parse(minhaData);
            System.out.println(minhaDataEmDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
