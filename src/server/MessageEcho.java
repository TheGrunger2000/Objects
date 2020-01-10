package server;

class MessageEcho {
    String run(String message) {
        switch (message) {
            case "Hello":
                message = "Dummy message";
                return message;
            case "How are you?":
                message = "How DARE you!";
                return message;
            case "Let's kill Python?":
                message = "SURE!";
                return message;
        }
        message = "Nah, you're boring. Try again!";
        return message;
    }
}
