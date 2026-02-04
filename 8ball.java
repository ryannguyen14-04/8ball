import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] responses = {
            "It is certain.",
            "Without a doubt.",
            "Yes — definitely.",
            "Most likely.",
            "Outlook good.",
            "Ask again later.",
            "Cannot predict now.",
            "Don’t count on it.",
            "My reply is no.",
            "Very doubtful."
        };

        System.out.println("🎱 Magic 8 Ball 🎱");
        System.out.print("Ask a yes/no question: ");

        String question = input.nextLine();

        int index = rand.nextInt(responses.length);
        String answer = responses[index];

        System.out.println();
        System.out.println("You asked: " + question);
        System.out.println("8 Ball says: " + answer);

        input.close();
    }
}
