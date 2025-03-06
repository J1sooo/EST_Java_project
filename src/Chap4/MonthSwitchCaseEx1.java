package Chap4;

// switch case

public class MonthSwitchCaseEx1 {
    public static void main(String[] args) {
        int month = 3;
        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";   // 유효하지 않은 범위의 값을 입력받았을 때 예외처리
        };
        System.out.println(monthString);
    }
}
