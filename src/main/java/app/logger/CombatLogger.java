package app.logger;

import app.io.ConsoleWriter;
import app.io.Writer;

public class CombatLogger extends Logger {
    public Writer writer;

    public CombatLogger() {
        this.writer = new ConsoleWriter();
    }

    @Override
    public void handle(LogType type, String message) {
        if (type == LogType.ATTACK || type == LogType.TARGET){
            System.out.println(type.name() + ": " + message);
        }else{
            super.passToSuccessor(type,message);
        }
    }
}
