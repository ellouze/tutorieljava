package com.encpsulation;

/*
 * Le principe d'encapsulation dit qu'un objet ne doit pas exposer sa repr�sentation interne au monde ext�rieur.
 * Les donn�es stock�es par l'objet doivent �tre cach�es de l'utilisateur de l'objet,
 *  et toute interaction avec l'objet doit se faire via des m�thodes
 */
public class HourWE {
	
public int hour, minute;
	
	public HourWE (int h, int m)
	{
		hour = h;
		minute = m;
	}

}
