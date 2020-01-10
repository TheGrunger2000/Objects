package server;

import java.security.KeyException;
import java.util.ArrayList;
import java.util.HashMap;

class MessageEcho {
    private HashMap<String, String> answers;

    MessageEcho() {
        answers = new HashMap<>();

        answers.put("Hello", "Dummy message");
        answers.put("How are you?", "How DARE you!");
        answers.put("Let's kill Python maybe?", "SURE!");
        answers.put("Maybe 4:20?", "Why not?");
        answers.put("What?", "Nothing...");
        answers.put("?", "Well...");
        answers.put("Oh really?", "Yeah... Why not?");
        answers.put("You're Asshole", "F...k you!!!");
        answers.put("Hard Bass?", "You're slave!");
        answers.put("Wrong!!!", "Maybe... bvhjdsabvhkdabv");
    }

    String run(String message) {
        String answer = answers.get(message);

        if (answer == null) {
            answer = "Nah, you're boring! Try again!";
        }

        return answer;
    }
}
