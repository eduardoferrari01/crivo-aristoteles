package br.com.crivo;

import java.util.ArrayList;

public class Main {

	private static ArrayList<Integer> lista = new ArrayList<Integer>();
	private static Integer limite = 120;
	public static void main(String[] args) {
		
		preenchimentoDaLista(limite);
		crivo(quadradoDoLimite(limite));
		exibirNumerosPrimos();

	}
	private static void preenchimentoDaLista(Integer limiteDaLista)
	{
		for(int i = 2 ; i <= limiteDaLista; i++)
		{
			lista.add(i);
		}
	}
	private static Integer quadradoDoLimite(Integer limite)
	{
		return (int) Math.sqrt(limite);
	}
	private static void crivo(Integer quadradoLimite)
	{
		for(int i = 0 ; i <= quadradoLimite ; i++)
		{
			for(int x = i+1 ; x <= lista.size() - 1 ; x++)
			{
				if(lista.get(x) % lista.get(i) == 0)
				{
					lista.remove(lista.get(x));
				}
			}
			
		}
	}
	private static void exibirNumerosPrimos()
	{
		lista.forEach(numero->{
			System.out.println(numero);
		});
		System.out.println("Quantidade de números primos:" + lista.size());
	}

}
