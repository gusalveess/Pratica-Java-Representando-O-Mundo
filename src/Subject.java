import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;
    private List<Question> questions = new ArrayList<>();

    void create(String name) {
        if (this.name != null) {
            return;
        }

        this.name = name;
    }

    void edit(String name) {
        if (this.name == null) {
            return;
        }
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    List<Question> getQuestions() {
        return this.questions;
    }

    Question getQuestion(int questionId) {
        return this.questions.get(questionId);
    }

    void createQuestion(String statement, String[] alternatives, int correctAnswer) {
        Question question = new Question();
        question.create(statement, alternatives, correctAnswer);
        this.questions.add(question.get());
    }

    void editQuestion(int questionId, String statement, String[] alternatives, int correctAnswer) {
        Question question = this.questions.get(questionId);

        if (question == null) {
            return;
        }

        question.edit(statement, alternatives, correctAnswer);
    }

    void deleteQuestion(int questionId) {
        this.questions.remove(questionId);
    }
}