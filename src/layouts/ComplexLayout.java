package layouts;

import layouts.Layout;
import loggers.MessageLogger;

public class ComplexLayout implements Layout {
    @Override
    public String format(String timestamp, MessageLogger.LogLevel logLevel, String message) {
        return String.format("%s <=> %s <=> %s", timestamp, logLevel, message);
    }
}
