import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int j, i, r;
		
		for(j=1; j<=10; j++) {
		for(i=1; i<=10; i++) {
			r = j*i;
			System.out.println(i+"x"+j+" = "+r);
		}
		System.out.println(" ");
		ler.close();
		}
	}
}
