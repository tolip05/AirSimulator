package app;

import app.core.Engine;
import app.core.ManagementSystem;
import app.core.ManagementSystemImpl;
import app.interpriters.CommandInterpriter;
import app.interpriters.Interpreter;
import app.io.ConsoleReader;
import app.io.ConsoleWriter;
import app.io.Reader;
import app.io.Writer;
import app.logger.CombatLogger;
import app.logger.ErrorLogger;
import app.logger.EventLogger;
import app.logger.Handler;

public class Main {
    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        ManagementSystem managementSystem = new ManagementSystemImpl();
        Interpreter interpreter = new CommandInterpriter(managementSystem);
        Runnable runnable = new Engine(writer,reader,interpreter);
        runnable.run();
    }
}
