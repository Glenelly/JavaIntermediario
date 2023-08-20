package classes;

public class ExternaInterna {
    private  String texto = "texto externo";

    public class Interna{

        private  String texto = "texto interno";

        public void imprimeTexto(){
            System.out.println(texto);

            //consegue ver membros da classe externa
            System.out.println(ExternaInterna.this.texto);
        }
    }

    public static void main(String[] args) {

        ExternaInterna externa = new ExternaInterna();
        Interna interna = externa.new Interna();

        interna.imprimeTexto();

    }


}
