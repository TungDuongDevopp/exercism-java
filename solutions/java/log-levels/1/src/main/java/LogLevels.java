public class LogLevels {
    public static String message(String logLine) {
        int firstIndex = logLine.indexOf(":");
        return logLine.substring(firstIndex+1).trim();
        
    }

    public static String logLevel(String logLine) {
        int lastIndex = logLine.indexOf("]");
        return logLine.substring(1,lastIndex).trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)",message(logLine),logLevel(logLine));
    }
}
