import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List of words for the game
        String[] words = {"programming", "hangman", "java", "computer", "developer"};

        // Pick a random word from the list
        String wordToGuess = words[(int) (Math.random() * words.length)];
        char[] guessedWord = new char[wordToGuess.length()];

        // Initialize guessedWord with underscores
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attempts = 6; // Number of incorrect attempts allowed

        while (attempts > 0) {
            System.out.println("\n" + new String(guessedWord));
            System.out.println("Attempts left: " + attempts);

            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            boolean found = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                attempts--;
                System.out.println("Incorrect guess. Try again.");
            }

            if (wordToGuess.equals(new String(guessedWord))) {
                System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
                break;
            }
        }

        if (attempts == 0) {
            System.out.println("\nSorry, you're out of attempts. The word was: " + wordToGuess);
        }

        scanner.close();
    }
}
