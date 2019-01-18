package app.logger;

import app.io.ConsoleWriter;
import app.io.Writer;

public class ErrorLogger extends Logger {
    private Writer writer;

    public ErrorLogger() {
        this.writer = new ConsoleWriter();
    }

    @Override
    public void handle(LogType type, String message) {
        if ( LogType.ERROR == type){
            writer.write(type.name() + ": " + message);
        }else {
            super.passToSuccessor(type,message);
        }
    }
}
