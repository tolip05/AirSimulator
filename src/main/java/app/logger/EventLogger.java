package app.logger;

import app.io.ConsoleWriter;
import app.io.Writer;

public class EventLogger extends Logger {
    private Writer writer;

    public EventLogger() {
        this.writer = new ConsoleWriter();
    }

    @Override
    public void handle(LogType type, String message) {
        if ( LogType.EVEN == type){
            this.writer.write(type.name() + ": " + message);
        }else {
            super.passToSuccessor(type,message);
        }
    }
}
