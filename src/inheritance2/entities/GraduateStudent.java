package inheritance2.entities;

public class GraduateStudent extends Student{
    String researchTopic;

    public GraduateStudent() {
    }

    public GraduateStudent(String firstName, String lastName, int id, int studentId, String researchTopic) {
        super(firstName, lastName, id, studentId);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public void talk() {
        System.out.println("سلام");
    }

    @Override
    public String toString() {
        return "<" +
            firstName +
            ", " + lastName +
            ", researchTopic: " + researchTopic +
            ">";
    }
}
