package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {

	public String removeAllOccurrences(String str, char ch) {
	
		String result = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result = result + str.charAt(i);
			}
		}
		return result;
	}

	public void run() {
		while (true) {
			String str = readLine("Enter string: ");
			String getChar = readLine("Remove character: ");
			char ch = getChar.charAt(0);
			int indexOfString = str.indexOf(ch);
			println(removeAllOccurrences (str, ch));
		}
	}
}
