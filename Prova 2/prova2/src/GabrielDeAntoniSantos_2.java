import java.util.Scanner;

public class GabrielDeAntoniSantos_2 {

    private GabrielDeAntoniSantos_2() {
        Scanner tec = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int TamanhoVetor = tec.nextInt();
        int VetA[] = new int[TamanhoVetor];
        int VetB[] = new int[TamanhoVetor];
        int VetSoma[] = new int[TamanhoVetor];
        Ler(VetA, VetB, tec);
        Soma(VetA, VetB, VetSoma);
        Ordenar(VetSoma);
        Escrever(VetSoma);
        tec.close();
    }

    private void Ler(int[] VetA, int[] VetB, Scanner tec) {
        System.out.println("__ Lendo o VetA __");
        for (int i = 0; i < VetA.length; i++) {
            System.out.print("VetA[" + i + "]: ");
            VetA[i] = tec.nextInt();
        }
        System.out.println("__Lendo o VetB__");
        for (int i = 0; i < VetB.length; i++) {
            System.out.print("VetB[" + i + "]: ");
            VetB[i] = tec.nextInt();
        }
    }

    private void Soma(int VetA[], int VetB[], int VetSoma[]) {
        for (int i = 0; i < VetSoma.length; i++) {
            VetSoma[i] = VetA[i] + VetB[VetB.length - 1 - i];

        }
    }

    private void Ordenar(int VetSoma[]) {
        int bolha = 0;
        for (int j = 0; j < VetSoma.length; j++) {
            for (int i = 0; i < VetSoma.length - 1; i++) {
                if (VetSoma[i] > VetSoma[i + 1]) {
                    bolha = VetSoma[i];
                    VetSoma[i] = VetSoma[i + 1];
                    VetSoma[i + 1] = bolha;
                }
            }
        }
        System.out.println("__ Valores ordenadops. __");
    }

    private void Escrever(int VetSoma[]) {
        System.out.println("__ Resultados __");
        for (int i = 0; i < VetSoma.length; i++) {
            System.out.println("VetSoma[" + i + "]: " + VetSoma[i]);
        }
    }

    public static void main(String[] args) {
        new GabrielDeAntoniSantos_2();
    }
}
