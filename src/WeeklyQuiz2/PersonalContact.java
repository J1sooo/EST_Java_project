package WeeklyQuiz2;

public class PersonalContact extends Contact {
    private final String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println(", 관계: " + relationship);
    }
}
