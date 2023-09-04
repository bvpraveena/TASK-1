import java.util.Random;

public class GuessingTheNumberGame {
    private int unrevealedNumber;
    private int guesses;
    private Score score;

    public GuessingTheNumberGame() {
        this.unrevealedNumber = new Random().nextInt(100) + 1;
        this.guesses = 0;
        this.score = new Score();
    }

    public int getunrevealedNumber() {
        return this.unrevealedNumber;
    }

    public int getGuesses() {
        return this.guesses;
    }

    public Score getScore() {
        return this.score;
    }

    public void guess(int guess) {
        this.guesses++;

        if (guess == this.unrevealedNumber) {
            this.score.addPoint();
            System.out.println("PERFECT your guess is correct");
            System.out.println("CONGRAGULATIONS!  You guessed the correct number in " + this.guesses + " guesses.");
        } else if (guess < this.unrevealedNumber) {
            System.out.println("Your guess is too low.");
        } else if (guess > 100) {
            System.out.println("please guess the number between 1 to 100");
        } else {
            System.out.println("Your guess is too high");
        }
    }

    public void play() {
        System.out.println("HELLO! ");
        System.out.println("WELCOME!");
        System.out.println("guess the number between 1 and 100.");
        while (this.guesses < 10) {
            int guess = getGuess();
            guess(guess);
        }

        if (this.guesses == 10) {
            System.out.println(
                    "You lost the game of GUESSING THE NUMBER!  The correct number was " + this.unrevealedNumber + ".");
        }

        System.out.println("Your final score is 0 ");
    }

    private int getGuess() {
        System.out.print("Enter your guess: ");
        return Integer.parseInt(System.console().readLine());
    }
}
