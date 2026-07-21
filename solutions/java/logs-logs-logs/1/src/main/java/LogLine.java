public class LogLine {
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        int lastIndex = logLine.indexOf("]");
        String logLevel = logLine.trim().substring(1,lastIndex);
        return switch(logLevel){
                case "INF" -> LogLevel.INFO;
                case "DBG" -> LogLevel.DEBUG;
                case "TRC" -> LogLevel.TRACE;
                case "ERR" -> LogLevel.ERROR;
                case "FTL" -> LogLevel.FATAL;
                case "WRN" -> LogLevel.WARNING;
                default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        int firstIndex = logLine.indexOf(":");
        String message = logLine.substring(firstIndex+1).trim();
        LogLevel log  =  getLogLevel();
        return String.format("%d:%s",log.getNumber(),message);
        
    }
}
