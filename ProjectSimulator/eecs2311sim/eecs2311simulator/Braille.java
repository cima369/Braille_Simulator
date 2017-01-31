package eecs2311simulator;

public class Braille {

	private Braille() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static boolean [] charToBraille (boolean sixOrEight, char character)
	{
		int characterToInt = 0;
		if (character >= 97 && character <= 122)
		{
			characterToInt = character - 96;
		}
		else
		{
			if (character >= 65 && character <= 90)
			{
				characterToInt = character - 64;
			}
		}
		if (sixOrEight)
		{
			switch (characterToInt)
			{
				case 1: return new boolean[]{true, false, false, false, false, false, false, false};
				case 2: return new boolean[]{true, false, false, true, false, false, false, false};
				case 3: return new boolean[]{true, false, false, false, false, true, false, false};
				case 4: return new boolean[]{true, false, false, false, false, false, false, true};
				case 5: return new boolean[]{false, false, true, false, false, false, false, false};
				case 6: return new boolean[]{false, false, true, true, false, false, false, false};
				case 7: return new boolean[]{false, false, true, false, false, true, false, false};
				case 8: return new boolean[]{false, false, true, false, false, false, false, true};
				case 9: return new boolean[]{false, false, false, false, true, false, false, false};
				case 10: return new boolean[]{false, false, false, true, true, true, false, false};
				case 11: return new boolean[]{false, false, false, false, true, true, false, true};
				case 12: return new boolean[]{false, false, false, true, true, false, false, false};
				case 13: return new boolean[]{false, false, false, false, true, true, false, false};
				case 14: return new boolean[]{false, false, false, false, true, false, false, true};
				case 15: return new boolean[]{false, false, false, false, false, false, true, false};
				case 16: return new boolean[]{false, false, false, true, false, true, true, false};
				case 17: return new boolean[]{false, false, false, false, false, true, true, true};
				case 18: return new boolean[]{false, false, false, true, false, false, true, false};
				case 19: return new boolean[]{false, false, false, false, false, true, true, false};
				case 20: return new boolean[]{false, false, false, false, false, false, true, true};
				case 21: return new boolean[]{false, false, true, false, true, false, false, false};
				case 22: return new boolean[]{false, false, true, true, true, false, false, false};
				case 23: return new boolean[]{false, false, true, false, true, true, false, false};
				case 24: return new boolean[]{false, false, true, false, true, false, false, true};
				case 25: return new boolean[]{true, false, false, false, false, false, true, false};
					default:	return new boolean[]{true, false, false, true, false, false, true, false};
			}
		}
		else
		{
			switch (characterToInt)
			{
				case 1: return new boolean[]{true, false, false, false, false, false};
				case 2: return new boolean[]{true, false, true, false, false, false};
				case 3: return new boolean[]{true, true, false, false, false, false};
				case 4: return new boolean[]{true, true, false, true, false, false};
				case 5: return new boolean[]{true, false, false, true, false, false};
				case 6: return new boolean[]{true, true, true, false, false, false};
				case 7: return new boolean[]{true, true, true, true, false, false};
				case 8: return new boolean[]{true, false, true, true, false, false};
				case 9: return new boolean[]{false, true, true, false, false, false};
				case 10: return new boolean[]{false, true, true, true, false, false};
				case 11: return new boolean[]{true, false, false, false, true, false};
				case 12: return new boolean[]{true, false, true, false, true, false};
				case 13: return new boolean[]{true, true, false, false, true, false};
				case 14: return new boolean[]{true, true, false, true, true, false};
				case 15: return new boolean[]{true, false, false, true, true, false};
				case 16: return new boolean[]{true, true, true, false, true, false};
				case 17: return new boolean[]{true, true, true, true, true, false};
				case 18: return new boolean[]{true, false, true, true, true, false};
				case 19: return new boolean[]{false, true, true, false, true, false};
				case 20: return new boolean[]{false, true, true, true, true, false};
				case 21: return new boolean[]{true, false, false, false, true, true};
				case 22: return new boolean[]{true, false, true, false, true, true};
				case 23: return new boolean[]{false, true, true, true, false, true};
				case 24: return new boolean[]{true, true, false, false, true, true};
				case 25: return new boolean[]{true, true, false, true, true, true};
				default: return new boolean[]{true, false, false, true, true, true};
			}
		}
	}
}
