package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		salarioLiquido(sc);

		sc.close();

	}

	public static void novoSalario(Scanner sc) {

		System.out.print("Salário: ");
		float oldSalary = sc.nextFloat();

		System.out.print("Abono: ");
		float abonation = sc.nextFloat();

		System.out.println("Novo Salário: " + String.format("%.2f", oldSalary + abonation));
	}

	public static void mediaParticipante(Scanner sc) {

		float[] notes = new float[4];
		float sum = 0;

		for (int i = 0; i < notes.length; i++) {

			System.out.print("Nota " + (i + 1) + ": ");
			notes[i] = sc.nextFloat();
			sum += notes[i];
		}

		System.out.println("Média Final: " + String.format("%.1f", sum / notes.length));
	}

	public static void salarioLiquido(Scanner sc) {

		float bruteSalary, additionalNocturne, hoursExt, descont, liquidSalary;

		System.out.print("Salário Bruto: ");
		bruteSalary = sc.nextFloat();

		System.out.print("Adicional Noturno: ");
		additionalNocturne = sc.nextFloat();

		System.out.print("Horas Extras: ");
		hoursExt = sc.nextFloat();

		System.out.print("Desconto: ");
		descont = sc.nextFloat();

		liquidSalary = bruteSalary + additionalNocturne + (hoursExt * 5) - descont;

		System.out.println("Salário Liquido: " + String.format("%.2f", liquidSalary));
	}

	public static void diferencaEntreValores(Scanner sc) {
		float[] n = new float[4];
		float diferenca;

		for (int i = 0; i < n.length; i++) {
			System.out.print("número" + (i + 1) + ": ");
			n[i] = sc.nextFloat();
		}

		diferenca = (n[0] * n[1]) - (n[2] * n[3]);

		System.out.println("Diferença: " + String.format("%.1f", diferenca));

	}

}
