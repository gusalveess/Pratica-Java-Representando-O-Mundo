public class Question {
    private String statement;
    private String[] alternatives = new String[5];
    private int correctAnswer;

    Question get() {
        return this;
    }

    String getStatement() {
        return this.statement;
    }

    void create(String statement, String[] alternatives, int correctAnswer) {
        if (this.statement != null || alternatives.length != 5) {
            return;
        }

        this.statement = statement;
        this.alternatives = alternatives;
        this.correctAnswer = correctAnswer;
    }

    void edit(String statement, String[] alternatives, int correctAnswer) {
        if (this.statement == null) {
            return;
        }

        this.statement = statement;
        this.alternatives = alternatives;
        this.correctAnswer = correctAnswer;
    }
}