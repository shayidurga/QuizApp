import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Collections.shuffle(questions); // Shuffle the questions before starting the quiz
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }

            int userAnswer = getUserAnswer(scanner, options.length);

            if (question.isCorrect(userAnswer - 1)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong. The correct answer is: " + (question.getCorrectAnswerIndex() + 1));
            }

            System.out.println();
        }

        System.out.println("Quiz finished! Your score is: " + score + "/" + questions.size());
        scanner.close();
    }

    private int getUserAnswer(Scanner scanner, int numOptions) {
        int userAnswer = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Your answer (1-" + numOptions + "): ");
            if (scanner.hasNextInt()) {
                userAnswer = scanner.nextInt();
                if (userAnswer >= 1 && userAnswer <= numOptions) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a number between 1 and " + numOptions);
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }

        return userAnswer;
    }
}
