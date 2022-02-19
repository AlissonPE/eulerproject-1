import java.util.Arrays;
import java.util.Scanner;


public class multiploClass {

    Scanner sc = new Scanner(System.in);
    public int somaPar = 0;
    public int temp = 0;
    public int temp2 = 0;
    int[] numeros = new int[100];
    int[] pares = new int[100];
    int cArray = 0;
    int dArray = 0;

    public boolean parOuImpar(int numero) {
        if (numero % 2 == 0) return true;
        return false;
    }

    public void calculaMultiplo() {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                numeros[cArray] = i;
                if (parOuImpar(cArray)) {
                    somaPar += numeros[cArray];
                    System.out.println(somaPar);
                }
                cArray++;
            }

        }
        System.out.println(Arrays.toString(numeros));
    }

    public boolean taNaLista() {

        System.out.println("Digite o número desejado: ");
        int numeroPedido = sc.nextInt();

        for(int i = 0; i < numeros.length ; i++ ) {
            if (numeros[i] == numeroPedido) {
                System.out.println("Seu número foi encontrado! Ele está na posição: " + i);
                return true;
            }
        }
        System.out.println("Número não encontrado :(");
        return false;
    }
}