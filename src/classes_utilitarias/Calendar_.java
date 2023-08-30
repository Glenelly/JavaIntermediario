package classes_utilitarias;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance(); //singleton

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY );
        int minuto = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.println(hoje);
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);
        System.out.printf( "%02d/%02d/%d" , dia, (mes + 1), ano);
        System.out.println();
        System.out.printf( "%02d:%02d:%d" , hora, minuto, segundos);

        /*
        hoje.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println();
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
         */

        hoje.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println();
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));

    }
}
