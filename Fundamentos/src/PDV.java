
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;


//PVD SIGNIFICA ponto de vendas


public class PDV {
	
	public static void main(String[] args) {
		//Date trabalhar com data 
		Date data = new Date();
        //Formatar a data
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		DecimalFormat resultado = new DecimalFormat("0.00");
		Scanner leia = new Scanner (System.in);
		double total, desconto,totalDesconto,pago,troco;
		System.out.println(formatador.format(data));
		System.out.println("==============");
		System.out.println("===== PDV ======");
		System.out.println("==============");
		System.out.println("");
		System.out.print("Valor total: ");
		
		total = leia.nextDouble();
		
		System.out.print("Desconto em %");
		
		desconto = leia.nextDouble(); 
		totalDesconto = total - (desconto * total)/100;
		
		System.out.println("Total com desconto " + resultado.format(totalDesconto));
		System.out.println("--------------------");
		System.out.println("");
		System.out.println("Valor pago");
		pago = leia.nextDouble();
		troco = pago - totalDesconto;
		System.out.println("troco:");
		
	}

}

