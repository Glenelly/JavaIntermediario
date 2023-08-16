package enum_como_classe;

public class Formulario {

    enum Genero{
        FEMININO('F'), MASCULINO('M');
        private final char valor;
        Genero(char valor){
            this.valor = valor;
        }
        public char getValor() {
            return valor;
        }
    }
    private String nome;
    private Genero genero;
}
