class Client {

    private Server server;
    private String message;


    void setServer(Server server) {
        this.server = server;
    }

    void printMessage() {
        System.out.println(this.message);
    }

    void setMessage(String message) {
        this.message = message;
    }

    void run() {
        server.setMessage(message);
        server.run();
        this.message = server.getAnswer();
    }
}
