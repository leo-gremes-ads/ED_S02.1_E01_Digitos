package view;

import controller.ValidaEntrada;
import controller.Digitos;

public class Principal
{
	public static void main(String[] args)
	{
		int n, digitos;
		ValidaEntrada ve = new ValidaEntrada();
		Digitos d = new Digitos();

		n = ve.inteiroValido("Digite um número inteiro: ");
		digitos = d.contarDigitos(n);
		System.out.println("O número tem " + digitos + " digitos");
	}
}