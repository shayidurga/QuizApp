public class QuizApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Java basics questions
        quiz.addQuestion(new Question(
                "Which of the following is not a Java keyword?",
                new String[]{"if", "then", "else", "while"},
                1
        ));
        quiz.addQuestion(new Question(
                "What is the size of int variable in Java?",
                new String[]{"8 bits", "16 bits", "32 bits", "64 bits"},
                2
        ));
        quiz.addQuestion(new Question(
                "Which method is the entry point for a Java program?",
                new String[]{"start()", "main()", "init()", "run()"},
                1
        ));
        quiz.addQuestion(new Question(
                "Which of these is not a valid variable name in Java?",
                new String[]{"_myVar", "myVar123", "123myVar", "my_Var"},
                2
        ));
        quiz.addQuestion(new Question(
                "Which of the following is used to find and fix bugs in Java programs?",
                new String[]{"JVM", "JRE", "JDK", "JDB"},
                3
        ));
        quiz.addQuestion(new Question(
                "Which keyword is used to create a subclass in Java?",
                new String[]{"super", "sub", "extends", "implements"},
                2
        ));
        quiz.addQuestion(new Question(
                "Which of these data types is used to create a variable that can hold a decimal value?",
                new String[]{"int", "float", "char", "boolean"},
                1
        ));
        quiz.addQuestion(new Question(
                "Which method can be used to find the length of a string in Java?",
                new String[]{"getSize()", "length()", "getLength()", "size()"},
                1
        ));
        quiz.addQuestion(new Question(
                "Which of the following is not an access modifier in Java?",
                new String[]{"public", "private", "protected", "internal"},
                3
        ));
        quiz.addQuestion(new Question(
                "What is the default value of a boolean variable in Java?",
                new String[]{"true", "false", "null", "0"},
                1
        ));

        // Start the quiz
        quiz.start();
    }
}
