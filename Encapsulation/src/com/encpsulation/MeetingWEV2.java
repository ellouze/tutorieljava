package com.encpsulation;



/*
 * 
 * Selon le principe d'encapsulation, une classe apparait donc comme une boite noire. Depuis l'extérieur,
 *  on ne doit rien voir sur les détails internes de la classe;
 *  on ne voit que les constructeurs et méthodes publics.
 *   L'ensemble des méthodes publiques d'une classe est appelé ! interface ! de la classe
 */
public class MeetingWEV2 {
	
	
	public String object;
	public HourWEV2 start, end;
	
	
	/*
	 * 
	 * La classe Meeting dépend maintenant beaucoup moins de l'implémentation de la classe Hour,
	 * on peut changer sa représentation interne, et donc également les deux méthodes getHour et getMinutes,
	 * sans que cela n'ait un quelconque impact sur le bon fonctionnement de la classe Meeting.
	 */
	public MeetingWEV2 (String str, HourWEV2 s, HourWEV2 e)
	{
		object = str;
		start = s;
		end = e;
	}
	
	/*
	 * Le principe d'encapsulation vise donc à bien séparer les fonctionnalités publiques offertes par un objet de leur implémentation
	 */
	public int getDuration()
	{
		return (end.getHour() * 60 + end.getMinutes())
							- (start.getHour() * 60 + start.getMinutes());
	}

}
