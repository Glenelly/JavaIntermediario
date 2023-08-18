package varargs;

public class Teste {
    public static void main(String[] args) {
        System.out.println(soma(1,2,3,4,5,6,7,8,9));
    }

    static int soma(Integer... vetor){

        int total = 0;

        for (Integer integer : vetor) {
            total += integer;
        }
        return total;
    }
}
