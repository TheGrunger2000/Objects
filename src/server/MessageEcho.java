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
            case "Maybe 4:20?":
                message = "Why not?";
                return message;
            case "What?":
                message = "Nothing...";
                return message;
            case "?":
                message = "Well...";
                return message;
            case "Oh really?":
                message = "Yeah... Why not?";
                return message;
            case "You're Asshole":
                message = "F...k you!!!";
                return message;
            case "Hard Bass?":
                message = "You're slave!";
                return message;
            case "Wrong!!!":
                message = "Maybe... bvhjdsabvhkdabv";
                return message;
            default:
                message = "Nah, you're boring! Try again!";
                return message;
        }
    }
}
