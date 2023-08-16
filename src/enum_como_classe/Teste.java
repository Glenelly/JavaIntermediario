package enum_como_classe;

public class Teste {
    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.SEGUNDA;
        System.out.println(dia + " - " + dia.getValor());

        Data data = new Data(10,8,2023, DiaSemana.QUINTA);

    }
}
