package com.encpsulation;

/*
 * Le principe d'encapsulation dit qu'un objet ne doit pas exposer sa représentation interne au monde extérieur.
 * Les données stockées par l'objet doivent être cachées de l'utilisateur de l'objet,
 *  et toute interaction avec l'objet doit se faire via des méthodes
 */
public class HourWE {
	
public int hour, minute;
	
	public HourWE (int h, int m)
	{
		hour = h;
		minute = m;
	}

}
