package ExerciciosZup;

import java.util.Scanner;

public class IdadeMesesDias {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int meses = 12;
		System.out.println("Informe sua idade atual ou quanto anos vai fazer");
		int idade = scan.nextInt();

		System.out.println("Informe o ano atual");
		double ano = scan.nextDouble();

		double anoNascido = idade - ano;
		int mesesVivido = idade * meses;
		double diasVividos = idade * 365;

		System.out.println(" Você nasceu em " + anoNascido + " meses vividos até hojê " 
				+ mesesVivido + " e o dias vivo são " + diasVividos);



	}
}
