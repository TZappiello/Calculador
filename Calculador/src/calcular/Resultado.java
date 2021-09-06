
package calcular;

import java.util.Scanner;

public class Resultado {

	public static void main(String[] args) {
		Calculadora a = new Calculadora();
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("> Digite o primeiro numero:");
		a.setNum1(sc.nextLine());
		double num1 = Double.parseDouble(a.num1);
		
		System.out.println("> Digite a operação: A = adição, S = subtração, M = multiplicação, D = divisão");
		a.setOpera(sc.nextLine());
		String opera = a.getOpera();
		//double opera = Double.parseDouble(a.getOpera());
		
				
		
		System.out.println("> Digite o segundo numero:");
		a.setNum2(sc.nextLine());
		double num2 = Double.parseDouble(a.num2);
		

		if(opera.equals("a") || opera.equals("A")) {
			a.result = num1 + num2;
		}else if(opera.equals("s") || opera.equals("S")) {
			a.result = num1 - num2;
		} else if(opera.equals("m") || opera.equals("M")) {
			a.result = num1 * num2;
		} else if(opera.equals("d") || opera.equals("D")) {
			a.result = num1 / num2;
		}
		
		
		System.out.println("> Resultado: " + a.result);
		
		System.out.println("> Deseja continuar? S = Sim ou N = Não");
		String continua = sc.nextLine();
		
		while(continua.equals("s") || continua.equals("S")) {
			System.out.println("> Digite a operação: A = adição, S = subtração, M = multiplicação, D = divisão");
			a.setOpera(sc.nextLine());
			String opera2 = a.getOpera();
			
			System.out.println("> Digite outro numero: ");
			a.setNum3(sc.nextLine());
			double num3 = Double.parseDouble(a.num3);
			
			if(opera2.equals("a") || opera2.equals("A")) {
				a.result =  a.result + num3;
			}else if(opera2.equals("s") || opera2.equals("S")) {
				a.result =  a.result - num3;
			} else if(opera2.equals("m") || opera2.equals("M")) {
				a.result =  a.result * num3;
			} else if(opera2.equals("d") || opera2.equals("D")) {
				a.result = a.result / num3;
			}
			
			System.out.println("> Resultado: " + a.result);
			
			System.out.println("Deseja continuar? S = Sim ou N = Não");
			continua = sc.nextLine();
			
		}
		
		if(continua.equals("n") || continua.equals("N")) {
			System.out.println(">> Coloque '=' para terminar a operação: ");
			String result = sc.nextLine();

			if (result.equals("=")) {
				System.exit(0);
			}
		}
	}

}
