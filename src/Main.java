import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
        int x, nota,slar,idade;
		String sexo;

		x=0;
		while(x!=1) {
					
			do {
				System.out.println("Digite uma nota");
				nota=teclado.nextInt();
			}while(nota<0 || nota >10);
						
			
			do {
				System.out.println("Digite o salário");
				slar=teclado.nextInt();
			}while(slar>=0 == false);
		       
			do {
				System.out.println("digite o sexo");
				sexo=teclado.next();
			}while(sexo.equalsIgnoreCase("f") == false && sexo.equalsIgnoreCase("m") == false);

				
			do {
				System.out.println("Digite a idade");
				idade=teclado.nextInt();
			}while(idade<0||idade>150);
			
			
			System.out.println("Digite 0 para continuar e 1 para finalizar ");
			x=teclado.nextInt();
			
		}
		System.out.println("Fim");
		teclado.close();
	}

}