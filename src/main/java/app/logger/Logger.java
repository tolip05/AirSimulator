package app.logger;

public abstract class Logger implements Handler{
    private Handler successor;

    public abstract void handle(LogType type, String message);


    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    protected void passToSuccessor(LogType type, String message){
        if (this.successor != null){
            this.successor.handle(type,message);
        }
    }
}
