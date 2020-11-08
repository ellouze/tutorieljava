package com.encpsulation;

/*
 * WE signiife without encapsulation
 */
public class MeetingWE {
	
	public String object;
	public HourWE start, end;
	
	public MeetingWE (String str, HourWE s, HourWE e)
	{
		object = str;
		start = s;
		end = e;
	}
	
	/*
	 * 
	 * On a ainsi cr�� une forte coh�sion entre les classes Meeting et Hour; elles sont fortement li�es.
	 * On ne peut plus changer l'impl�mentation de la classe Hour ind�pendamment de la classe Meeting
	 */

	public int getDuration()
	{
		return (end.hour * 60 + end.minute) - (start.hour * 60 + start.minute);
	}

}
