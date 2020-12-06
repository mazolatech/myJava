package com.br.view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Progam {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
	
	list.add("Maria");
	list.add("Geraldo");
	list.add("Janinho");
	list.add("Ivete");
	list.add("alex");
	list.add("bob");
	list.add(1,"Faleceu");
	System.out.println(list.size());
	
	for(String x: list) {		
		System.out.println(x);
	}
	System.out.println("_________________________________________________");
	list.remove(1);
	list.removeIf(x -> x.charAt(0)=='M');//Busca e remover que encontrar letra M
	for(String x: list) {		
		System.out.println(x);
	}
	
	System.out.println("_________________________________________________");
	System.out.println("Index of Bob: " +list.indexOf("bob"));//busca na lista nome Bob
	System.out.println("Index of Marco: " +list.indexOf("Marco"));
	System.out.println("_________________________________________________");
	List<String> result=list.stream().filter(x-> x.charAt(0)=='a').collect(Collectors.toList());
	
	for(String a: result) {		
		System.out.println(a);
	}
	System.out.println("_________________________________________________");
	//                               //faz busca                      se nao encontar retorna nulo
	String nome=list.stream().filter(x-> x.charAt(0)=='J').findFirst().orElse(null);
	System.out.println(nome);
	
	
}
}
