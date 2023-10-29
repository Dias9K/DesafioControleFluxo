import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro (menor)");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro (maior)");
		int parametroDois = terminal.nextInt();
		terminal.close();
		
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		 }catch (ParametrosInvalidosException e) {
		 	System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		 }
        
        
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for(int i =1; i<=contagem; i++){
			System.out.println(i);
		}

	}
}