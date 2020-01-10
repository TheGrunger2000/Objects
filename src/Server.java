class Server {
    private String message;

    void setMessage(String message) {
        this.message = message;
    }

    String getAnswer() {
        return message;
    }

    void run() {
        switch (message) {
            case "Hello":
                message = "Dummy message";
                return;
            case "How are you?":
                message = "How DARE you!";
                return;
            case "Let's kill Python?":
                message = "SURE!";
                return;
        }

        message = "Nah, you're boring. Try again!";
    }
}
