import java.util.Scanner;

public class DesafioFatorial {
    public static void main(String[] args) {
        int calc;
        int valor = 0;
        int escolha;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um valor: ");
        escolha = sc.nextInt();

        while (escolha >= 1) {
            for (int loop = escolha; loop >= 1; loop--) {
                if (valor == 0) {
                    calc = loop * (loop - 1);
                    valor = calc;
                    loop--;

                } else {
                    valor = valor * loop;

                }
            }

            if (escolha == 1) {
                System.out.println(escolha + "! = " + 1);

            } else {
                System.out.println(escolha + "! = " + valor);
            }

            escolha--;
            valor = 0;
        }
    }
}
