package layouts;

import loggers.MessageLogger;

public interface Layout {

    String format(String timestamp, MessageLogger.LogLevel logLevel, String message);

}
