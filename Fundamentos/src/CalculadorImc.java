
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadorImc {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double peso, altura, imc;
		System.out.println("==================");
		System.out.println("Calculo do IMC");
		System.out.println("==================");
		System.out.println("Digite o seu peso ");
		peso = leia.nextDouble();
		System.out.print("Digite a sua altura: ");
		altura = leia.nextDouble();
		imc = peso / (altura * altura);
		System.out.print("IMC: " + formatador.format (imc));
		//Para criar um intervalo usamos o operador AND (&&)
		if (imc <18.5 ) {
			System.out.print("Abaixo do peso");
		}else if (imc >=18.5 && imc < 25) {
			System.out.println("Peso Normal");
			} else if (imc >= 25 && imc <30) {
				System.out.println(" Acima do peso ");
			}else {
		
			System.out.println(" obeso ");
		}
		leia.close();
		
				
	}

}
