import client.Client;

import java.util.Scanner;

import server.Server;

public class Program {
    public static void main(String[] args) {
        Client client = new Client();
        Server server = new Server();
        Scanner scanner = new Scanner(System.in);

        client.setServer(server);

        boolean a = true;
        while (a) {
            System.out.println("Enter Your Message\n>> ");
            String message = scanner.nextLine();

            client.setMessage(message);
            client.run();
            client.printMessage();

            while (true) {
                System.out.println("Wanna do it some more? (y/n)\n>> ");
                String answer = scanner.nextLine();

                if (answer.toLowerCase().equals("y")) break;

                if (answer.toLowerCase().equals("n")) {
                    a = false;
                    break;
                }

                System.out.println("Error! Type \"Y\" or \"y\" or \"N\" or \"n\"");
            }
        }
    }
}
