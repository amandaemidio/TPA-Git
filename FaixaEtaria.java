import java.util.Scanner;
public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade, c1=0,c2=0,c3=0, c4=0, c5=0, i=1, porcentagem;
		for(i=1; i<=15; i++) {
			System.out.println("Digite a idade");
			idade = in.nextInt();
			if (idade<=15) {
				c1 = c1+1;
				System.out.println("Primeira faixa etária::"+c1);
			} else if (idade<=30) {
				c2 = c2+1;
				System.out.println("Segunda faiza etária:"+c2);
			} else if (idade<=45) {
				c3 = c3+1;
				System.out.println("Terceira faixa etária:"+c3);
			} else if (idade<=60) {
				c4 = c4+1;
				System.out.println("Quarta faixa etária:"+c4);
			}else {
				c5 = c5+1;
				System.out.println("Quinta faixa etária:"+c5);
			}
		}
		porcentagem=(100*c1/15);
		System.out.println("Porcentagem da primeira faixa etária:" +porcentagem);
		porcentagem=(100*c2/15);
		System.out.println("Porcentagem da segunda faixa etária:" +porcentagem);
		porcentagem=(100*c3/15);
		System.out.println("Porcentagem da terceira faixa etária:" +porcentagem);
		porcentagem=(100*c4/15);
		System.out.println("Porcentagem da quarta faixa etária:" +porcentagem);
		porcentagem=(100*c5/15);
		System.out.println("Porcentagem da quinta faixa etária:" +porcentagem);
	}
}
