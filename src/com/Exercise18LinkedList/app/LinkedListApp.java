package com.Exercise18LinkedList.app;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Random;
import java.util.Iterator;

public class LinkedListApp 
{

	public static void main(String[] args) 
	{
		//declaracion de constantes
		final int ELEMENTS=100;
		LinkedList <Byte> miListita = new LinkedList<Byte>();
		ArrayList <Byte> miArraycitu = new ArrayList<Byte>();
		Stack <Integer> miPilita = new Stack<Integer>();
		PriorityQueue<Double> miColita =new PriorityQueue<Double>();
		HashMap <Integer,Integer> miDiccionaritu =new HashMap<Integer,Integer>();
		
		// creacion de objeto para generacion de numeros pseudoaleatorios
		Random numbers =new Random();
///////////////////////////////////////////////////////////////////////////////////////////
//////////////// LinkedList /////////////////////
		
		miListita.add((byte)5);
		miListita.add((byte)10);
		miListita.add((byte)30);
		miListita.add((byte)40);
		miListita.add((byte)50);
		miListita.set(0, (byte) 2); //se sustituye la posicion 0 por un 2
		System.out.println(miListita.get(1));//se obtiene la posicion 1 de la lista
		System.out.println(miListita); //se imprime toda la lista
		//System.out.println(miListita.remove());
		//System.out.println(miListita.remove());
		//System.out.println(miListita.remove());
		//System.out.println(miListita.remove());
		//System.out.println(miListita.remove());
		Byte number=2;
		System.out.println(miListita.size());
		System.out.println(miListita.isEmpty());
		System.out.println(miListita.contains(number));
		miListita.clear();//se eliminan todos los elementos de la lista
		System.out.println(miListita);
		
		//rellanado con numeros aleatorios
		for (int i=0;i<ELEMENTS;i++)
		{
			miListita.add((byte) numbers.nextInt(100));
		}
		
		System.out.println(miListita);
		
		Iterator miIteradorcitu = miListita.iterator();
		while(miIteradorcitu.hasNext())
		{
			System.out.println(miIteradorcitu.next());
		}
		
		for(Byte miNumber : miListita)
		{
			System.out.println(miNumber);
		}
		
///////////////////////////////////////////////////////////////////////////////////////////
////////////////ArrayList /////////////////////		
		
		miArraycitu.add((byte)5);
		miArraycitu.add((byte)10);
		miArraycitu.add((byte)20);
		miArraycitu.add((byte)30);
		miArraycitu.add((byte)40);
		miArraycitu.set(0, (byte) 2); //se sustituye la posicion 0 por un 2
		
		
		System.out.println(miArraycitu.get(1));//se obtiene la posicion 1 de la lista
		System.out.println(miArraycitu); //se imprime toda la lista
		System.out.println(miArraycitu.remove(1));//se obtiene la posicion 1 de la lista
		System.out.println(miArraycitu); //se imprime toda la lista
		
		miIteradorcitu = miArraycitu.iterator();
		
		while(miIteradorcitu.hasNext())
		{
			System.out.println(miIteradorcitu.next());
		}
		
		for(Byte miNumber2 : miArraycitu)
		{
			System.out.println(miNumber2);
		}
		
	}

}
