package exercicioscannerr23;

import java.text.DecimalFormat;

public class ClasseD {
	public static void main(String[] args) {
		double numero = 0.1 + 0.2;
		//numero = 0.1 + 0.2;
		//double outroNumero = numero - 0.1;
		double outroNumero = numero;
		numero = outroNumero;
		outroNumero = numero;
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println(df.format(outroNumero));

	}

}
