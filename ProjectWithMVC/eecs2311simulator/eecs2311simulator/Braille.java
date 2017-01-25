package eecs2311simulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Braille {

	//Meant to be private
	private Braille() 
	{

	} 
	
/*	public static String [] getChoices ()
	{
		Random rand = new Random();
		String [] choices = new String[4];
		List<Integer> randomOptions = new ArrayList <Integer>();
		int answer = rand.nextInt(26) + 1;
		int correctOption = rand.nextInt(3);
		Integer answerWrap = new Integer(answer);
		Integer placement;
		choices[0] = getBraille(answer);
		while (randomOptions.size() < 3)
		{
			placement = new Integer(rand.nextInt(26) + 1);
			if (!randomOptions.contains(placement))
			{
				randomOptions.add(placement);
			}
		}
		if (!randomOptions.contains(answerWrap))
		{
			randomOptions.set(correctOption, answerWrap);
		}
		for (int i = 0; i < 3; i ++)
		{
			choices[i + 1] = getBraille(randomOptions.remove(i - i).intValue ());
		} 
		return choices; 
	} */
	
	public static String [] getChoices (String answer)
	{
		Random rand = new Random();
		String [] choices = new String[4];
		List<Integer> randomOptions = new ArrayList <Integer>();
		int answerToInt = (int)(answer.toCharArray()[0]) - 64;
		int correctOption = rand.nextInt(3);
		Integer answerWrap = new Integer(answerToInt);
		Integer placement;
		choices [0] = answer;
		//choices[0] = getBraille(answer);
		while (randomOptions.size() < 3)
		{
			placement = new Integer(rand.nextInt(26) + 1);
			if (!randomOptions.contains(placement))
			{
				randomOptions.add(placement);
			}
		}
		if (!randomOptions.contains(answerWrap))
		{
			randomOptions.set(correctOption, answerWrap);
		}
		for (int i = 0; i < 3; i ++)
		{
			choices[i + 1] = getBraille(randomOptions.remove(i - i).intValue ());
		} 
		return choices; 
	}
	
	private static String getBraille (int alphaNum) 
	{
		switch(alphaNum) 
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
	
	public static String convert (String brailleSeq)
	{
		switch (brailleSeq) 
		{
			case "100000": 	return "A";
			case "101000":  return "B";
			case "110000":	return "C";
			case "110100":	return "D";
			case "100100":	return "E";
			case "111000":	return "F";
			case "111100":	return "G";
			case "101100":	return "H";
			case "011000": 	return "I";
			case "011100":	return "J";
			case "100010":	return "K";
			case "101010":	return "L";
			case "110010":	return "M";
			case "110110":	return "N";
			case "100110":	return "O";
			case "111010":	return "P";
			case "111110":	return "Q";
			case "101110":	return "R";
			case "011010":	return "S";
			case "011110":	return "T";
			case "100011":	return "U";
			case "101011":	return "V";
			case "011101":	return "W";
			case "110011":	return "X"; 
			case "110111":	return "Y";
			default: 		return "Z";
		}
		/*
		if (brailleSeq.equals("100000"))
			return "A";
		else if (brailleSeq.equals("101000"))
			return "B";
		else if (brailleSeq.equals("110000"))
			return "C";
		else if (brailleSeq.equals("110100"))
			return "D";
		else if (brailleSeq.equals("100100"))
			return "E";
		else if (brailleSeq.equals("111000"))
			return "F";
		else if (brailleSeq.equals("111100"))
			return "G";
		else if (brailleSeq.equals("101100"))
			return "H";
		else if (brailleSeq.equals("011000"))
			return "I";
		else if (brailleSeq.equals("011100"))
			return "J";
		else if (brailleSeq.equals("100010"))
			return "K";
		else if (brailleSeq.equals("101010"))
			return "L";
		else if (brailleSeq.equals("110010"))
			return "M";
		else if (brailleSeq.equals("110110"))
			return "N";
		else if (brailleSeq.equals("100110"))
			return "O";
		else if (brailleSeq.equals("111010"))
			return "P";
		else if (brailleSeq.equals("111110"))
			return "Q";
		else if (brailleSeq.equals("101110"))
			return "R";
		else if (brailleSeq.equals("011010"))
			return "S";
		else if (brailleSeq.equals("011110"))
			return "T";
		else if (brailleSeq.equals("100011"))
			return "U";
		else if (brailleSeq.equals("101011"))
			return "V";
		else if (brailleSeq.equals("011101"))
			return "W";
		else if (brailleSeq.equals("110011"))
			return "X";
		else if (brailleSeq.equals("110111"))
			return "Y";
		else
			return "Z"; */
	}
}
