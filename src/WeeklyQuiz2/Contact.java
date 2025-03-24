package WeeklyQuiz2;

public class Contact {
    private final String name;
    private final String phoneNumber;

    public String getName() {
        return name;
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void Print() {
        System.out.print("이름: " + name + ", 전화번호: " + phoneNumber);
    }
}
