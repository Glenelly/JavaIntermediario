package enum_metodos_value_valueOf;

public class Teste2 {
    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "SEGUNDA"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "SEGUNDA");

        System.out.println(dia);
    }
}
