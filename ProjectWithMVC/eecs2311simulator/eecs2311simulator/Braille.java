package eecs2311simulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Braille {

	
	//Meant to be private
	private Braille() 
	{

	} 
	
	public static String [] getChoices ()
	{
		Random rand = new Random ();
		String [] choices = new String [4];
		List<Integer> randomOptions = new ArrayList <Integer> ();
		int answer = rand.nextInt(26) + 1;
		int correctOption = rand.nextInt(3);
		Integer answerWrap = new Integer (answer);
		Integer placement;
		choices [0] = getBraille (answer);
		while (randomOptions.size () < 3)
		{
			placement = new Integer (rand.nextInt(26) + 1);
			if (!randomOptions.contains (placement))
			{
				randomOptions.add (placement);
			}
		}
		if (!randomOptions.contains(answerWrap))
		{
			randomOptions.set(correctOption, answerWrap);
		}
		for (int i = 0; i < 3; i ++)
		{
			choices [i + 1] = getBraille (randomOptions.remove(i - i).intValue ());
		} 
		return choices; 
	}
	
	private static String getBraille (int alphaNum) 
	{
		switch (alphaNum) 
		{
			case 1: 	return "100000";
			case 2:		return "101000";
			case 3: 	return "110000";
			case 4:		return "110100";
			case 5: 	return "100100";
			case 6: 	return "111000";
			case 7: 	return "111100";
			case 8: 	return "101100";
			case 9:		return "011000";
			case 10:	return "011100"; 
			case 11: 	return "100010";
			case 12: 	return "101010";
			case 13: 	return "110010";
			case 14:	return "110110";
			case 15:	return "100110";
			case 16:	return "111010";
			case 17:	return "111110";
			case 18:	return "101110";
			case 19:	return "011010";
			case 20:	return "011110";
			case 21:	return "100011";
			case 22:	return "101011";
			case 23:	return "011101";
			case 24: 	return "110011"; 
			case 25: 	return "110111";
			default: 	return "100111";
		}
	}
}
