import model.ConjuntoPoligono;
import model.Poligono;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean menu = true;
        ConjuntoPoligono conjuntoPoligono = new ConjuntoPoligono();

        do {

            System.out.print("------------------------------------------------------------------\nBem vindo!! Escolha uma das opções abaixo\n\n1 - Adicionar Poligono (Triângulos e Quadrados)" +
                    "\n2 - Calcular Áreas dos Poligonos\n3 - Sair\n------------------------------------------------------------------");
            System.out.print("\nDigite a opção desejada: ");
            int opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o número de lados");
                    int lados = in.nextInt();

                    String nome = "";
                    if (lados == 3) {
                        nome = "Triângulo";
                    } else if (lados == 4) {
                        nome = "Quadrado";
                    } else {
                        System.out.println("\nNumeros de lados invalido só é identificado Triângulos e Quadrados");
                        System.out.println("Deseja retornar? (S para sim/N para não)");
                        char escolha = in.next().charAt(0);
                        if (escolha == 'N' || escolha == 'n'){
                            System.out.println("Muito Obrigado!! Volte Sempre...");
                        }
                        break;
                    }
                    System.out.println("\nDigite o tamanho dos lados em cm");
                    double tamanho = in.nextDouble();

                    Poligono poligono = new Poligono(nome, lados, tamanho);
                    conjuntoPoligono.adicionarPoligono(poligono);



                    break;
                case 2:
                    conjuntoPoligono.calcularArea();
                    System.out.println("\nDeseja retornar? (S para sim/N para não)");
                    char escolha = in.next().charAt(0);
                    if (escolha == 'N' || escolha == 'n'){
                        System.out.println("Muito Obrigado!! Volte Sempre...");
                    }
                    break;
                case 3:
                    menu = false;
                    break;
            }


        } while (menu == true);

    }
}