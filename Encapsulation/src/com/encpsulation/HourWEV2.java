package com.encpsulation;
/*
 * }
Si on fait ce changement, la méthode getDuration de la classe Meeting ne fonctionnera plus.
 Ce qu'il faut faire pour rendre la classe Hour plus indépendante,
 c'est déclarer toutes les variables d'instance privées. Ensuite,
  il faut ajouter des méthodes qui permettent d'interagir avec l'objet
 */

public class HourWEV2 {
	
	public int minutes;

	public HourWEV2 (int h, int m)
	{
		minutes = h * 60 + m;
	}
	
	public int getHour()
	{
		return minutes / 60;
	}
	
	public int getMinutes()
	{
		return minutes % 60;
	}

}
