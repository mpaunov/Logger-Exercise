package appenders;

import layouts.Layout;
import loggers.MessageLogger;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/*
    This is not a valid XML file it is demo file to demonstrate file writing
 */

public class XmlAppender extends BaseAppender {
    public XmlAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String timeStamp, MessageLogger.LogLevel logLevel, String message) {
        try {

            File file = new File("logs.xml");

            if (!file.exists()) {
                file.createNewFile();
            }

            Files.writeString(Path.of("logs.xml"),
                    getLayout().format(timeStamp, logLevel, message), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
