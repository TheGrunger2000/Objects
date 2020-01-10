package client;

import server.Server;

public class Client {

    private Server server;
    private String message;


    public void setServer(Server server) {
        this.server = server;
    }

    public void printMessage() {
        System.out.println(this.message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void run() {
        server.setMessage(message);
        server.run();
        this.message = server.getAnswer();
    }
}
