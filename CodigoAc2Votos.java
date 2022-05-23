package application;

import java.util.Scanner;

public class Ac2Votação {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int voto, eleitores = 50, x, votoPT = 0, votoPDT = 0, votoPL = 0, votoPSDB = 0, votoNulo = 0, votoBranco = 0;

		for (x = 0; x < eleitores; x++) { // laço de repetição, o x equivale as vezes que ira repetir, eleitores é o
											// tanto de eleitores que terá nessa votação, e x++ por fim é pra contar de
											// 1 em 1
			System.out.println(
					"Para votar no PT   (13)  tecle 1\nPara votar no PDT  (12)  tecle 2\nPara votar no PL   (22)  tecle 3\nPara votar no PSDB (45)  tecle 4\nPara votar nulo      tecle 5\nPara votar em branco tecle 6");
			voto = ler.nextInt(); // receber qual tecla o eleitor teclou.

			if (voto == 1) { // se o eleitor digitar 1 no voto, irá acumular voto para o partido PT, assim // como 2 para o PDT, 3 para o PL e por ai vai.
				votoPT++;
			} else if (voto == 2) {          // se votar == 2 adiciona +1 voto ao PDT, e por ai vai com os outros
				votoPDT++;
			} else if (voto == 3) {
				votoPL++;
			} else if (voto == 4) {
				votoPSDB++;
			} else if (voto == 5) {
				votoNulo++;
			} else if (voto == 6) {
				votoBranco++;
			}
			// queria poder colocar o votoBranco como else porém se o eleitor digitasse um
			// numero maior que 6 somaria como voto em branco.
			// eu consigo dizer que é um numero invalido, porém ainda soma como voto e eu n
			// sei tratar isso ainda.
		}
		// Mostrar por fim o total de votos que cada partido recebeu.
		System.out.println("O Total de votos que o partido PT recebeu foi de: " + votoPT);

		System.out.println("O Total de votos que o partido PDT teve é de: " + votoPDT);

		System.out.println("O Total de votos que o partido PL teve é de: " + votoPL);

		System.out.println("O Total de votos que o partido PSDB teve é de: " + votoPSDB);

		System.out.println("O Total de votos nulo foi de:  " + votoNulo);

		System.out.println("O Total de votos em branco foi de: " + votoBranco);

	}

}
