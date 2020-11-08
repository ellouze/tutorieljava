package com.encpsulation;



/*
 * 
 * Selon le principe d'encapsulation, une classe apparait donc comme une boite noire. Depuis l'ext�rieur,
 *  on ne doit rien voir sur les d�tails internes de la classe;
 *  on ne voit que les constructeurs et m�thodes publics.
 *   L'ensemble des m�thodes publiques d'une classe est appel� ! interface ! de la classe
 */
public class MeetingWEV2 {
	
	
	public String object;
	public HourWEV2 start, end;
	
	
	/*
	 * 
	 * La classe Meeting d�pend maintenant beaucoup moins de l'impl�mentation de la classe Hour,
	 * on peut changer sa repr�sentation interne, et donc �galement les deux m�thodes getHour et getMinutes,
	 * sans que cela n'ait un quelconque impact sur le bon fonctionnement de la classe Meeting.
	 */
	public MeetingWEV2 (String str, HourWEV2 s, HourWEV2 e)
	{
		object = str;
		start = s;
		end = e;
	}
	
	/*
	 * Le principe d'encapsulation vise donc � bien s�parer les fonctionnalit�s publiques offertes par un objet de leur impl�mentation
	 */
	public int getDuration()
	{
		return (end.getHour() * 60 + end.getMinutes())
							- (start.getHour() * 60 + start.getMinutes());
	}

}
