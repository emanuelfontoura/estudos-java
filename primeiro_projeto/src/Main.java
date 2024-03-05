
public class Main {

	public static void main(String[] args) {
		int idade = 25;
		double altura = 1.77;
		char sexo = 'M';
		
		System.out.println("Meu nome é Emanuel, tenho " + idade + " anos, " + altura + " metros de altura e sou do sexo " + sexo + " (masculino).");
		
		System.out.printf("%.2f%n", altura);

		System.out.printf("Meu nome é Emanuel, tenho %d anos, %.2f metro (s) e sou do sexo %c (masculino)", idade, altura, sexo);
		
		int a, b;
		double res;
		a = 5;
		b = 2;
		res = (double) a / b;
		System.out.println(res);
	}

}
