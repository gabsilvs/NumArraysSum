import java.util.Arrays;
import java.util.Scanner;

public class NumArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] numeros =  new int[10];
        int sum = 0;

        System.out.println("Insira 10 números inteiros: ");
        for (int i = 0; i < 10; i++){
            System.out.print("Número: "+ (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            sum += numeros[i];
        }
        System.out.println("\nNúmeros inseridos:");
        System.out.println(java.util.Arrays.toString(numeros));

        double media = (double) sum / numeros.length;
        System.out.println("Média dos números inseridos: " + media);

        int maior = Arrays.stream(numeros).max().getAsInt();
        int menor = Arrays.stream(numeros).min().getAsInt();

        System.out.printf("Maior número: %.2f\n", (double) maior);
        System.out.printf("Menor número: %.2f\n", (double) menor);
    }
}
