package annotations;

@interface Informacoes{

    String autor();

    int aulaNumero();

    String blog() default "http://glenelly.com";

    String site() default "http://glenelly.training";
}
