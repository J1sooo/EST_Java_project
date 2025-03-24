package WeeklyQuiz2;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (run) {
            System.out.print(
                    "1. 비즈니스 연락처 추가\n" +
                    "2. 개인 연락처 추가\n" +
                    "3. 연락처 출력\n" +
                    "4. 연락처 검색\n" +
                    "5. 종료\n" +
                    "메뉴를 선택해주세요: "
            );
            int num = sc.nextInt();
            sc.nextLine();

            String name = "";
            String phoneNum = "";
            String anotherThing = "";

            switch (num) {
                case 1:
                    System.out.print("이름을 입력하세요: ");
                    name = sc.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    phoneNum = sc.nextLine();
                    System.out.print("회사명을 입력하세요: ");
                    anotherThing = sc.nextLine();
                    addressBook.add(new BusinessContact(name, phoneNum, anotherThing));
                    break;
                case 2:
                    System.out.print("이름을 입력하세요: ");
                    name = sc.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    phoneNum = sc.nextLine();
                    System.out.print("관계를 입력하세요: ");
                    anotherThing = sc.nextLine();
                    addressBook.add(new PersonalContact(name, phoneNum, anotherThing));
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.print("검색할 이름을 입력하세요: ");
                    name = sc.nextLine();
                    addressBook.searchContact(name);
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
                    break;
            }
        }
    }
}
