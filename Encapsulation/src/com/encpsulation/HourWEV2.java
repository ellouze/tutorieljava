package com.encpsulation;
/*
 * }
Si on fait ce changement, la m�thode getDuration de la classe Meeting ne fonctionnera plus.
 Ce qu'il faut faire pour rendre la classe Hour plus ind�pendante,
 c'est d�clarer toutes les variables d'instance priv�es. Ensuite,
  il faut ajouter des m�thodes qui permettent d'interagir avec l'objet
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
