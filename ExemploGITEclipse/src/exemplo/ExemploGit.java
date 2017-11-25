package exemplo;

import java.util.Scanner;

public class ExemploGit {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int escolha = 0;
		
		do {
			
			System.out.println("Vamos fazer alguns calculos, você prefere soma ou subtração?\n 1 - Soma | 2 - Subtração | 0 - Sair");
			escolha = teclado.nextInt();
			
			System.out.println("Digite o primeiro número: ");
			int n1 = teclado.nextInt();

			System.out.println("Digite o segundo número: ");
			int n2 = teclado.nextInt();
			
			if(escolha==1) {
				somatoria(n1, n2);
			}else if(escolha==2) {
				subtracao(n1, n2);
			}
			
		}while(escolha!=0);
		
		System.out.println("--FIM DO PROGRAMA--");

	}

	public static int somatoria (int n1, int n2) {

		int resultado = n1+n2;

		return resultado;
	}

	public static int subtracao (int n1, int n2) {

		int resultado = n1-n2;

		return resultado;
	}

}
