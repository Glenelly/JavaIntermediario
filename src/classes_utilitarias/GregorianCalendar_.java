package classes_utilitarias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendar_ {
    public static void main(String[] args) {

        Calendar hoje1 = Calendar.getInstance();

        GregorianCalendar hoje = new GregorianCalendar();
        System.out.println(hoje);

        imprimirData(hoje);

        hoje.isLeapYear(2023);
        System.out.println(hoje.isLeapYear(2020));

        GregorianCalendar hoje2 = new GregorianCalendar(2017, Calendar.MARCH, 1);
        System.out.println(hoje2);

        GregorianCalendar hoje3 = new GregorianCalendar(2017, 0, 1, 14, 30);
        imprimirData(hoje3);

    }

    private static void imprimirData(Calendar hoje){

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY );
        int minuto = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf( "%02d/%02d/%d" , dia, (mes + 1), ano);
        System.out.println();
        System.out.printf( "%02d:%02d:%d" , hora, minuto, segundos);
        System.out.println();


    }
}
