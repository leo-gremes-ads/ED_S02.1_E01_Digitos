package controller;

import java.util.Scanner;

public class ValidaEntrada
{
	public ValidaEntrada()
	{
		super();
	}

	public int inteiroValido(String msg)
	{
		int n;
		Scanner s = new Scanner(System.in);

		while (true)
		{
			System.out.print(msg);
			try {
				n = s.nextInt();
			} catch (Exception e) {
				System.out.println("Não é um número inteiro! Tente novamente.");
				s.next();
				continue;
			}
			break;
		}
		s.close();
		return n;
	}
}