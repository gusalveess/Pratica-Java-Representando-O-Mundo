public class App {
    public static void main(String[] args) {
        System.out.println("====================\n");

        Subject mathSubject = new Subject();

        mathSubject.create("matemática");
        System.out.println("Questões após criar matéria: " + mathSubject.getQuestions());

        String[] mathQuestionAlternatives = new String[] { "1", "4", "8", "22", "0" };

        mathSubject.createQuestion("quanto é 2 + 2?", mathQuestionAlternatives, 1);
        System.out.println("Enunciado da questão após criação: " + mathSubject.getQuestion(0).getStatement());

        mathSubject.editQuestion(0, "quanto é 2 * 2?", mathQuestionAlternatives, 1);
        System.out.println("Enunciado da questão após edição: " + mathSubject.getQuestion(0).getStatement());

        mathSubject.deleteQuestion(0);

        System.out.println("Nome da matéria: " + mathSubject.getName());
        System.out.println("Questões após o delete: " + mathSubject.getQuestions());

        System.out.println("\n====================");
    }
}