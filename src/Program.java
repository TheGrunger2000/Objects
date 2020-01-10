import java.util.Scanner;

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

                if (answer.equals("Y") | answer.equals("y")) break;

                if (answer.equals("N") | answer.equals("n")) {
                    a = false;
                    break;
                }

                System.out.println("Error! Type \"Y\" or \"y\" or \"N\" or \"n\"");
            }
        }
    }
}