package WeeklyQuiz2;

public class BusinessContact extends Contact {
    private final String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println(", 회사명: " + company);
    }
}
