import java.util.Scanner;

public class GabrielDeAntoniSantos_1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao = 0;
        int Ndiarias = 0;
        double total = 0;
        int nEncerradas = 0;
        String nome = "";

        do {
            System.out.println(
                    "--------- Controle de Hóspedes --------- \n(1) encerrar a conta de um hóspede \n(2) verificar número de contas encerradas \n(3) sair ");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("__Opção 1 \n_Hóspede_ \nnome: ");
                    nome = tec.next();
                    System.out.print("diárias: ");
                    Ndiarias = tec.nextInt();
                    if (Ndiarias < 7) {
                        total = (Ndiarias * 10) + 7.30;
                    } else if (Ndiarias == 7) {
                        total = (Ndiarias * 10) + 6.30;
                    } else if (Ndiarias > 7) {
                        total = (Ndiarias * 10) + 5.30;
                    }
                    System.out.println("---------\nNome: " + nome + "\nTotal: " + total);
                    nEncerradas++;
                    break;
                case 2:
                    System.out.println(nEncerradas + " contas encerradas");
                    break;
                default:
                    System.out.println("opção errada!");
                    break;
                case 3:
            }
        } while (opcao != 3);
        tec.close();
    }
}