package classes;

public class Locais {
    public void metodoQualquer(){
        class ClasseLocal{

            private String texto = "texto classe local";

            public void imprimeTexto(){
                System.out.println(texto);
            }
        }

        ClasseLocal local = new ClasseLocal();
        local.imprimeTexto();
    }

    public static void main(String[] args) {

        Locais local = new Locais();

        local.metodoQualquer();
    }
}
