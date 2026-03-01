public class SimpleWordGame {

public static void main(String[] args) {

String secretWord = "java";
int lives = 5;
String guessedWord = "";

Scanner scanner = new Scanner(System.in);

while (lives > 0) {

guessedWord = "";

System.out.print("Guess a letter: ");
String guess = scanner.nextLine().toLowerCase();

for (int i = 0; i < secretWord.length(); i++) {

char letter = secretWord.charAt(i);

if (guess.length() == 1 && guess.charAt(0) == letter) {
guessedWord += letter;
} else {
guessedWord += "_";
}
}

System.out.println("Word: " + guessedWord);

if (guessedWord.equals(secretWord)) {
System.out.println("🎉 You guessed the word!");
break;
} else {
lives--;
System.out.println("Wrong guess! Lives left: " + lives);
}
}

if (lives == 0) {
System.out.println("Game Over! The word was: " + secretWord);
}

scanner.close();
}
}
