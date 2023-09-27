import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int x = 1;
		
		do {
			int randomNumber = rand.nextInt(100) + 1;
			int betNumber;
			int betLetter;
			char randomLetter = 'L';
			int betOddEven;
			
			System.out.println("Digite um número de 1 a 100: ");
			betNumber = sc.nextInt();
			
			if(betNumber < 1 || betNumber > 100) {
				System.out.println("Aposta inválida! Digite um número entre 1 e 100.");
			}
			else if(betNumber == randomNumber) {
				System.out.println("Parabéns! Você ganhou R$1.000,00.");
			}
			else {
				System.out.println("Que pena! O número sorteado foi: " + randomNumber);
			}
			
			System.out.println();
			System.out.println("Digite uma letra de A a Z: ");
			
			betLetter = System.in.read();
			betLetter = Character.toUpperCase(betLetter);
			Character.isLetter(betLetter);
			
			if(betLetter == 'L') {
				System.out.println("Parabéns! Você ganhou R$500,00 reais.");
			}
			
			else {
				System.out.println("Que pena! A letra sorteada foi: " + randomLetter);
			}
			
			System.out.println("Digite um número: ");
			System.out.println();
			betOddEven = sc.nextInt();
			
			if(betOddEven %2 == 0) {
				System.out.println("O número é par. Você ganhou R$100,00!");
			}
			else {
				System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
			}
			
			
			System.out.println();
			System.out.println("Você deseja continuar? Se sim, tecle qualquer número. Se não, tecle zero (0).");
			System.out.println();
			x = sc.nextInt();

		} while (x != 0);
		
		System.out.println("Fim de jogo!");
		sc.close();
		
	}

}