package eecs2311simulator;


/**
 * The class Braille contains the method that provides the mapping of any English alphabet letter to its corresponding Braille representation.
 * <br> <br>
 * The implementation of this class is used in the setCharToBraille method of the Simulator class, but is also provided publicly for any additional implementation. <br>
 * Please note, the method of this class was meant to display the correct 6-pin or 8-pin Braille representation of any letter, in the form of a boolean array. <br>
 * Where the index of the array corresponds to the pin number of the Braille cell, and that the state of true represents that the pin is raised and the state of false represents a lowered pin.
 * 
 * @author Team 3 of EECS 2311 Winter 2017
 *
 */
public final class Braille 
{

	private Braille() 
	{
	}
	
	/**
	 * Returns an array of Booleans, which is the Braille representation of the specified character for either a 6-pin or 8-pin Braille cell.
	 * @param sixOrEight True for an 8-pin Braille representation or false for a 6-pin Braille representation
	 * @param character The English alphabet letter to be represented in Braille
	 * @return An array of Booleans
	 * @throws IllegalArgumentException If the character is not a valid English alphabet letter, either entered as a capital or lower-case letter
	 */
	public static boolean [] charToBraille (boolean sixOrEight, char character) throws IllegalArgumentException
	{
		int characterToInt = 0;
		try
		{
			
			if ((character >= 97 && character <= 122) || (character >= 65 && character <= 90))
			{
				if (character >= 97 && character <= 122)
				{
					characterToInt = character - 96;
				}
				else
				{
					characterToInt = character - 64;
				}
			}
			else
			{
				throw new IllegalArgumentException ("Error! The character entered must be an English alphabet letter, "
						+ "either represented in upper or lower case!");
			}
		}
		catch (IllegalArgumentException e)
		{
			
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
