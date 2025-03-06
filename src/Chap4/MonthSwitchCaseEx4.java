package Chap4;

// switch case

public class MonthSwitchCaseEx4 {
    public static void main(String[] args) {
        String arguments = "수요일";
//        String argumentsString = switch (arguments) {
//            case "월요일" -> "Start of the work week";
//            case "화요일", "수요일", "목요일", "토요일", "일요일" -> "Midweek";
//            case "금요일" -> "Almost weekend";
//            default -> "Invalid value";
//        };
        String argumentsString;
        switch (arguments) {
            case "월요일":
                argumentsString = "Start of the work week";
                break;
            case "화요일":
            case "수요일":
            case "목요일":
                argumentsString = "midweek";
                break;
            case "금요일":
                argumentsString = "End of the work week";
            default:
                argumentsString = "Invalid arguments";
        }
        System.out.println(argumentsString);
    }
}
