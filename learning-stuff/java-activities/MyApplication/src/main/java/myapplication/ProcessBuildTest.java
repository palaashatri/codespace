package myapplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProcessBuildTest {

	private static String sanitizeCommand(String command) {
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

	private static void executeRuntimeExec(String command) throws Exception {
		System.out.println("::::: Running command : " + command + " : from executeRuntimeExec() :::::");
		Runtime run = Runtime.getRuntime();
		// System.out.println("Runtime : ::::::::: "+run.toString());
		Process pr = run.exec(sanitizeCommand(command));
		pr.waitFor();
	}

	private static void executeProcessBuilder(String command) throws Exception {
		System.out.println("::::: Running command : " + command + " : from executeProcessBuilder() :::::");
		Process pr = new ProcessBuilder(sanitizeCommand(command)).start();
		pr.waitFor();
	}

	private static void executeProcessBuilderSplit(String command) throws Exception {
		System.out.println("::::: Running command : " + command + " : from executeProcessBuilderSplit() :::::");
		Process pr = new ProcessBuilder(sanitizeCommand(command).split(" ")).start();
		pr.waitFor();
	}

	public static void exec() {
		String command = "helm install";
		try {

			executeRuntimeExec(command); // original method - avoid
			executeProcessBuilder(command); // throws the same error as seen in logs - avoid
			executeProcessBuilderSplit(command); // does not throw any error - use
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
