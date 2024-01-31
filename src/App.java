import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int a = sc.nextInt();
            int[] arr = new int[a];
            double total = (a * 2.0) / 3.0;
            int votos = 0;

            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < a; i++) {
                if (arr[i] == 1) {
                    votos++;
                }
            }

            if (votos >= total) {
                System.out.println("impeachment");
            } else {
                System.out.println("acusacao arquivada");
            }
        }
    }
}
