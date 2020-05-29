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
		String nome, nomeAlto;
		nomeAlto = " ";
		char sexo, respAtleta;
		double altura, peso, pesoMedio, alturaMedia, percentual, contadorPessoas, contadorF, contadorM, guardar;
		alturaMedia = 0;
		pesoMedio = 0;
		contadorPessoas = 0;
		contadorF = 0;
		contadorM = 0;
		guardar = 0;
		
		while(boleanAtleta) {
			 
			 // Entrada do nome //
			 System.out.println("Nome: ");
			 nome = sc.nextLine();
			 
			// Entrada do sexo //
			 System.out.println("Sexo: ");
			 sexo = sc.next().charAt(0);
			 sexo = Character.toLowerCase(sexo);
			 if(sexo == 'f') {
				 contadorF = contadorF + 1;
				 boleanSexo = false;
			 }else if(sexo == 'm') {
				 contadorM = contadorM + 1;
				 boleanSexo = false;
			 }else {
				 boleanSexo = true;
			 }
			 while(boleanSexo) {
				 System.out.println("Sexo precisa ser F ou M. Tente novamente: ");
				 sexo = sc.next().charAt(0);
				 sexo = Character.toLowerCase(sexo);
				 if(sexo == 'f') {
					 contadorF = contadorF + 1;
					 boleanSexo = false;
				 }else if(sexo == 'm') {
					 contadorM = contadorM + 1;
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
			 
			 contadorPessoas =  contadorPessoas + 1;
			 // Contadores do relatório //
			 pesoMedio = pesoMedio + peso;
			 
			 if(sexo == 'f') {
				 alturaMedia = alturaMedia + altura;
			 }
			 if(guardar < altura) {
				 guardar = altura;
				 nomeAlto = nome;
			 }
			 
			 sc.nextLine();
		 }

		System.out.println(" ");
		System.out.println("RELATÓRIO");
		pesoMedio = pesoMedio / contadorPessoas;
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
		System.out.println("Atleta mais alto: " + nomeAlto);
		percentual = contadorM / contadorPessoas;
		percentual = percentual * 100;
		System.out.printf("Porcentagem de homens: %.1f %% %n", percentual);
		alturaMedia = alturaMedia / contadorF;
		System.out.println("Altura média das mulheres: " + alturaMedia);
		
		sc.close();
	}

}
