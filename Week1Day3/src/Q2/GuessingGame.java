package Q2;

import java.util.Random;

public class GuessingGame {
    private int answer;
    private Random generator;
    private boolean gameOver;
    private int differential;
    private int max;
    private int maxGuessesAllowed;
    private int numGuessesTaken;

    public GuessingGame() {
        setMax(0);
        generator = new Random();
    }

    public GuessingGame(int max) {
        setMax(max);
        generator = new Random();
    }

    public void newGame(int maxGuessesAllowed) {
        setMaxGuessesAllowed(maxGuessesAllowed);
        setAnswer(generator.nextInt(max) + 1);
        setGameOver(false);
        setDifferential(getMax());
        setNumGuessesTaken(getNumGuessesTaken());
    }

    public String guess(int guess) {
        if (guess < 0 || guess > max) {
            return "Guess out of range. Please guess between 0 and " + max;
        }

        this.numGuessesTaken++;
        int currentDifferential = Math.abs(guess - getAnswer());

        if (getNumGuessesTaken() >= getMaxGuessesAllowed()) {
            gameOver = true;
            return "You've exceeded the maximum number of guesses.";
        }

        if (guess == getAnswer()) {
            gameOver = true;
            return "Congratulation";
        }

        String response = "";
        if (guess > getAnswer()) {
            response = "Too High";
        } else if (guess < getAnswer()) {
            response = "Too Low";
        }

        if (getNumGuessesTaken() > 1) {
            if (currentDifferential < getDifferential()) {
                response += ", Getting Warmer";
            } else {
                response += ", Getting Colder";
            }
        }

        setDifferential(currentDifferential);
        return response;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getDifferential() {
        return differential;
    }

    public void setDifferential(int differential) {
        this.differential = differential;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMaxGuessesAllowed() {
        return maxGuessesAllowed;
    }

    public void setMaxGuessesAllowed(int maxGuessesAllowed) {
        this.maxGuessesAllowed = maxGuessesAllowed;
    }

    public int getNumGuessesTaken() {
        return numGuessesTaken;
    }

    public void setNumGuessesTaken(int numGuessesTaken) {
        this.numGuessesTaken = numGuessesTaken;
    }
}
