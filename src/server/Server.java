package server;

public class Server {
    private String message;
    private MessageEcho messageEcho;

    public Server() {
        this.messageEcho = new MessageEcho();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAnswer() {
        return message;
    }

    public void run() {
        this.message = messageEcho.run(message);
    }
}
