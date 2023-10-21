package myapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExecuteCommandsCheck {
	private int executeCommand(String command) throws Exception {
		// String sanitizeComm = sanitizeCommand(command);
		// String[] processedCommand = processCommand(sanitizeComm);
		// Process pr1 = new ProcessBuilder(processedCommand).start();
		// return pr1.exitValue();
		String cleanedString = cleanString(command);
		System.out.println("CLEANED STRING : " + cleanedString);
		List<String> processedString = processCommand(cleanedString);
		System.out.println("PROCESSED STRING : " + processedString.toString());
		Process pr = new ProcessBuilder(processedString).start();
		return pr.exitValue();

	}

	private List<String> processCommand(String sanitizeComm) {
		String cmd[] = sanitizeComm.split(" ");
		List<String> strList = new ArrayList<>();
		for (String st : cmd) {
			if (st == "" || st.contentEquals("")) {
				continue;
			}
			strList.add(st);
		}
		return strList;
	}

	/**
	 * Execute command
	 * 
	 * @param command, The command string to sanitize
	 * @return sanitized string after performing validation of whitelisted
	 *         characters : '/','=','-','.','
	 *         ','\\','[',']','(',')','{','}','"','\'','~',',',':'
	 */

	@SuppressWarnings("unused")
	private String sanitizeCommand(String command) {
		String sanitizedCmd;
		StringBuilder sb = new StringBuilder(command.length());

		char[] whitelistArray = { '/', '=', '-', '.', ' ', '\\', '[', ']', '(', ')', '{', '}', '"', '\'', '~', ',',
				':' };

		Stream<Character> whitelistStream = IntStream
				.range(0, whitelistArray.length)
				.mapToObj(i -> whitelistArray[i]);

		List<Character> whiteList = whitelistStream.collect(Collectors.toList());

		for (int i = 0; i < command.length(); ++i) {
			char ch = command.charAt(i);
			if (Character.isLetterOrDigit(ch) || whiteList.contains(ch)) {
				sb.append(ch);
			}
		}

		sanitizedCmd = sb.toString();
		return sanitizedCmd;
	}

	private String cleanString(String string) {
		if (string == null) {
			return null;
		}
		StringBuilder clean = new StringBuilder();
		for (int i = 0; i < string.length(); ++i) {
			clean.append(cleanChar(string.charAt(i)));
		}
		System.out.println("CLEAN : " + clean);
		return clean.toString();
	}

	private char cleanChar(char character) {
		// 0 - 9
		for (int i = 48; i < 58; ++i) {
			if (character == i)
				return (char) i;
		}
		// 'A' - 'Z'
		for (int i = 65; i < 91; ++i) {
			if (character == i)
				return (char) i;
		}
		// 'a' - 'z'
		for (int i = 97; i < 123; ++i) {
			if (character == i)
				return (char) i;
		}
		// other valid characters
		switch (character) {
			case '/':
				return '/';
			case '\\':
				return '\\';
			case '@':
				return '@';
			case '=':
				return '=';
			case ':':
				return ':';
			case '.':
				return '.';
			case ',':
				return ',';
			case '-':
				return '-';
			case '_':
				return '_';
			case ' ':
				return ' ';
			case '\'':
				return '\'';
			case '\"':
				return '\"';
			case '\n':
				return '\n';
			case '{':
				return '{';
			case '}':
				return '}';
			case '[':
				return '[';
			case ']':
				return ']';
			case '(':
				return '(';
			case ')':
				return ')';
			case '~':
				return '~';
		}

		return '%';
	}

	public void exec() {
		String cmd = "helm repo add";
		try {
			System.out.println(executeCommand(cmd));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
