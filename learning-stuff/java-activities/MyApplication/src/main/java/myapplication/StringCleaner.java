package myapplication;

public class StringCleaner {

	private static char clean(char ch) {
		// 0-9
		for (int ascii = 48; ascii < 58; ++ascii) {
			if (ch == ascii)
				return (char) ascii;
		}
		// 'A'-'Z'
		for (int ascii = 65; ascii < 97; ++ascii) {
			if (ch == ascii)
				return (char) ascii;
		}
		// 'a'-'z'
		for (int ascii = 97; ascii < 123; ++ascii) {
			if (ch == ascii)
				return (char) ascii;
		}
		// other special characters
		char[] validCharacters = { '/', '\\', '@', '=', ':', '.', ',', '-', '_', ' ', '\'', '\"', '{', '}', '[', ']',
				'(', ')', '~' };
		for (int counter = 0; counter < validCharacters.length; counter++) {
			if (ch == validCharacters[counter]) {
				return validCharacters[counter];
			}
		}
		return '%';
	}

	private static String cleanCommand(String command) {
		if (command == null) {
			return null;
		}
		StringBuilder cleanStr = new StringBuilder();
		for (int i = 0; i < command.length(); ++i) {
			cleanStr.append(clean(command.charAt(i)));
		}
		// log.log(Level.INFO, "CLEAN : " + clean);
		return cleanStr.toString();
	}

	public static void exec() {

		String command = "@/==:??";
		System.out.println("clean command : " + cleanCommand(command));

	}

}
