package app.core;

import app.commands.Executable;
import app.interpriters.Interpreter;
import app.io.Reader;
import app.io.Writer;
import app.logger.CombatLogger;
import app.logger.ErrorLogger;
import app.logger.EventLogger;
import app.logger.Handler;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

    private Writer writer;
    private Reader reader;
    private Interpreter interpreter;
    private Handler handler;

    public Engine(Writer writer, Reader reader, Interpreter interpreter) {
        this.writer = writer;
        this.reader = reader;
        this.interpreter = interpreter;

    }

    @Override
    public void run() {
        try {

            String line = this.reader.read();
            while (true) {
                if ("EmergencyBreak".equals(line)) break;
                Executable executable = this.interpreter.interpretCommand(line);
                String result = executable.execute();
                this.writer.write(result);
                line = this.reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
