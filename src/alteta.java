import java.util.Locale;
import java.util.Scanner;

public class alteta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		boolean boleanAtleta, boleanSexo;
		boleanAtleta = true;
		boleanSexo = true;
		String nome;
		char sexo, respAtleta;
		double altura, peso;
		
		while(boleanAtleta) {
			 
			 // Entrada do nome //
			 System.out.println("Nome: ");
			 nome = sc.nextLine();
			 
			// Entrada do sexo //
			 while(boleanSexo) {
				 System.out.println("Sexo: ");
				 sexo = sc.next().charAt(0);
				 sexo = Character.toLowerCase(sexo);
				 if(sexo == 'f') {
					 boleanSexo = false;
				 }else if(sexo == 'm') {
					 boleanSexo = false;
				 }else {
					 boleanSexo = true;
				 }
			 }
			 boleanSexo = true;
			 
			 // Entrada da altura //
			 System.out.println("Altura: ");
			 altura = sc.nextDouble();
			 while(altura < 0.0) {
				 System.out.println("Altura precisa ser POSITIVO. Tente novamente: ");
				 altura = sc.nextDouble();
			 }
			 
			 // Entrada do peso //
			 System.out.println("Peso: ");
			 peso = sc.nextDouble();
			 while(peso < 0.0) {
				 System.out.println("Peso precisa ser POSITIVO. Tente novamente: ");
				 peso = sc.nextDouble();
			 }
			 
			 // Entrada pra saber se repete  //
			 System.out.println("Digitar outro atleta (S/N)?");
			 respAtleta = sc.next().charAt(0);
			 respAtleta = Character.toLowerCase(respAtleta);
			 if(respAtleta == 'n') {
				 boleanAtleta = false;
			 }
			 
			 sc.nextLine();
		 }
		sc.close();
	}

}
