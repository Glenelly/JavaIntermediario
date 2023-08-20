package printf;

public class Teste {

    public static void main(String[] args) {

        System.out.printf("%s", "Olá, Mundo!");
        System.out.printf("%n");
        System.out.printf("%S", "Olá, Mundo!");
        System.out.printf("%n");

        System.out.printf("%c", 'c');
        System.out.printf("%n");
        System.out.printf("%C", 'c');
        System.out.printf("%n");

        int valor = 123456789;
        System.out.printf("%d", valor);
        System.out.printf("%n");

        double pontoFlutuante = 3.5667897;
        System.out.printf("%f", pontoFlutuante);
        System.out.printf("%n");

        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s", olaMundo);
        System.out.printf("%n");

        System.out.printf("%-20s", olaMundo);
        System.out.printf("%n");

        System.out.printf("%+d", valor);
        System.out.printf("%n");

        System.out.printf("%015d", valor);
        System.out.printf("%n");

        System.out.printf("%,d", valor);
        System.out.printf("%n");

        int valor2 = -123456789;
        System.out.printf("% d", valor2);
        System.out.printf("%n");

        System.out.printf("%.3f", pontoFlutuante);
        System.out.printf("%n");

        System.out.printf("R$%10.2f", pontoFlutuante);
        System.out.printf("%n");

        testeMaisCompleto();

    }

    private static void testeMaisCompleto(){

        double[] precos = {1000, 123.4, 7894.5, 1, 4.7532};

        for (int i = 0; i < precos.length; i++){
            System.out.printf("%s %02d : total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }
    }
}
