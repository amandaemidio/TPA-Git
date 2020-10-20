import java.util.Scanner;
public class ExercicioPeso {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, c50=0, c10=0, c40=0, idade;
		double altura, peso, h=0, media, porcentagem, maior, menor, pesoMaior, pesoMenor;
		System.out.println("Digite a idade da 1 pessoa:");
		idade = in.nextInt();
		System.out.println("Digite a altura da 1 pessoa:");
		altura = in.nextDouble();
		System.out.println("Digite o peso da 1 pessoa:");
		peso = in.nextDouble();
		maior = idade;
		menor = idade;
		pesoMaior = peso;
		pesoMenor = peso;
		if (idade>50) {
			c50 = c50+1;
			System.out.println("Quantidade de pessoas com mais de 50 anos:"+c50);
		}
		if (idade>10 && idade<20) {
			c10 = c10+1;
			System.out.println("Quantidade de pessoas entre 10 e 20 anos:"+c10);
			h = h+altura;
			media = h/c10;
			System.out.println("Essa é a média de altura de pessoas com idades entre 10 a 20 anos:"+media);
		}
		if (peso<40) {
			c40 = c40+1;
			System.out.println("Quantidade de pessoas com peso inferior a 40:"+c40);
			porcentagem = 100*c40/10;
			System.out.println("Porcentagem de pessoas com peso inferior a 40:"+porcentagem);
		}
		for (i=2; i<=10; i++) {
			System.out.println("Digite a idade da "+i+" pessoa:");
			idade = in.nextInt();
			System.out.println("Digite a altura da "+i+" pessoa:");
			altura = in.nextDouble();
			System.out.println("Digite o peso da "+i+"pessoa:");
			peso = in.nextDouble();
			if (idade>50) {
				c50 = c50+1;
				System.out.println("Quantidade de pessoas com mais de 50 anos:"+c50);
			}
			if (idade>10 && idade<20) {
				c10 = c10+1;
				System.out.println("Quantidade de pessoas entre 10 e 20 anos:"+c10);
				h = h+altura;
				media = h/c10;
				System.out.println("Essa é a média de altura de pessoas com idades entre 10 a 20 anos:"+media);
			}
			if (peso<40) {
				c40 = c40+1;
				System.out.println("Quantidade de pessoas com peso inferior a 40:"+c40);
				porcentagem = 100*c40/10;
				System.out.println("Porcentagem de pessoas com peso inferior a 40:"+porcentagem);
			}
			if (idade>maior) {
				maior = idade;
				pesoMaior = peso;
			} else 
			if (idade<menor) {
				menor = idade;
				pesoMenor = peso;
			}
		}
		System.out.println("Pessoa mais velha:"+maior);
		System.out.println("Pessoa mais nova:"+menor);
		System.out.println("Peso da pessoa mais velha:"+pesoMaior);
		System.out.println("Peso da pessoa mais nova:"+pesoMenor);
		
	}

}
