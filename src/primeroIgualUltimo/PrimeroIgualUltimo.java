package primeroIgualUltimo;

import java.util.Scanner;

public class PrimeroIgualUltimo
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int numero1 = 0;
		int numero2 = 0;
		System.out.print("Introduce n�mero (total 9), teniendo que ser el primero y el ulimo iguales para calcular la media: ");
		numero1 = sc.nextInt();
		for(int i =	0 ; i <= 7 ; i++)
		{
			System.out.print("Introduce n�mero (total 9), teniendo que ser el primero y el ulimo iguales para calcular la media: ");
			numero2 = sc.nextInt();
			suma = suma + numero2;
		}
		sc.close();
		if(numero2 == numero1)
		{
			System.out.println("La media aritm�tica de los 9 n�meros es " + ((suma + numero1) / 9) + ".");
		}
		else
		{
			System.out.println("Fin del programa.");
		}
	}
}
