package myapplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringSanitization {

    private static String sanitizeCommand(String command) {
        String sanitizedCmd;
        StringBuilder sb = new StringBuilder(command.length());

        char[] whitelistArray = { '/', '=', '-', '.', ' ', '\\', '[', ']', '(', ')', '{', '}', '"', '\'', '~', ',', ':',
                '_', '\n', '\r' };

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

    private static String cleanString(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            clean.append(cleanChar(string.charAt(i)));
        }
        return clean.toString();
    }

    private static char cleanChar(char character) {
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
            // case ' ':
            // return '';
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
            // case '\r':
            // return '\r';
        }

        return '%';
    }

    public static void exec() {
        String arr[] = new String[] { "palaash.atri.io",
                "palaash.atri@example.com", "tri-nitro-toluene!123" };
        for (String str : arr) {
            System.out.println("Sanitized String :::: " + sanitizeCommand(str));
            System.out.println("Cleaned String :::: " + cleanString(str));
        }
    }

}
