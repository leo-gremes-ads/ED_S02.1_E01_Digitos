package controller;

public class Digitos
{
	public Digitos()
	{
		super();
	}

	/*
	CONDIÇÃO DE PARADA -> é sabido que números entre -9 e 9 tem apenas um 
		dígito, então o ponto de parada será quando o número estiver nesse intervalo.

	ESCREVENDO EM FUNÇÃO DO TERMO ANTERIOR -> cada vez que dividimos o número por
		10 ele "perde" o último dígito (Ex.: 123 / 10 = 12), sendo assim podemos
		dividir o número por 10 até ele atingir o intervalo do ponto de parada,
		sempre contando o dígito que ele está "perdendo";
	*/

	public int contarDigitos(int n)
	{
		if (n >= -9 && n <= 9)
			return 1;
		return 1 + contarDigitos(n / 10);
	}
}