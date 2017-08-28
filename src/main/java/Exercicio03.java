public class Exercicio03 {


    public static void main(String[] args) {

        Robo robo = new Robo(16,0,0,'L');

        System.out.println(robo.exploracao("MMMEMMMMM"));

        System.out.println(robo.exploracao("EMMMMMMMMMM"));
    }
}
