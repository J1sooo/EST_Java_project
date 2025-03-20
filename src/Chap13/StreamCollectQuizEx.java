package Chap13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCollectQuizEx {
    public static void main(String[] args) {
        // 1 제곱한 값 리스트로 변환
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> resultNum = numbers.stream()
                .map(x -> x * x)
                .toList();
        System.out.println(resultNum);

        // 2 문장들을 구분자로 리스트 변환
        List<String> sentences = Arrays.asList("Hello:world", "Java:stream:flatMap", "Functional:programming");
        List<String> resultStr = sentences.stream()
                .flatMap(x -> Arrays.stream(x.split(":")))
                .toList();
        System.out.println(resultStr);

        // 3 이차원 컬렉션 하나의 컬렉션으로 변환
        List<List<Integer>> numbers1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));
        List<Integer> resultNum1 = numbers1.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(resultNum1);

        // 4 Person 클래스 리스트에서 이름만 추출
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 28)
        );
        List<String> resultName = people.stream()
                .map(x -> x.name)
                .toList();
        System.out.println(resultName);

        // 5 Person 클래스에서 나이가 28 이상인 사람만 리스트
        resultName = people.stream()
                .filter(x -> x.age >= 28)
                .map(x -> x.name)
                .toList();
        System.out.println(resultName);

        // 6 문자열의 길이가 5 이하인 요소만
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> word5D = words.stream()
                .filter(x -> x.length() <= 5)
                .toList();
        System.out.println(word5D);

        // 7 내림차순 정렬후 대문자로 변환
        List<String> words1 = Arrays.asList("hello", "world", "java");
        List<String> wordSU = words1.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .toList();
        System.out.println(wordSU);

        // 8 문자열의 길이가 5 이상인 것만
        List<String> words2 = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        List<String> word5U = words2.stream()
                .filter(x -> x.length() >= 5)
                .toList();
        System.out.println(word5U);

        // 9 리스트에서 10보다 크고 50보다 작은 숫자만
        List<Integer> numbers2 = Arrays.asList(5, 12, 25, 37, 48, 50, 63);
        List<Integer> between1050 = numbers2.stream()
                .filter(x -> x > 10 && x < 50)
                .toList();
        System.out.println(between1050);

        // 10 특정단어가 포함된 문자열만 필터링
        List<String> sentences1 = Arrays.asList("I like apples", "Bananas are tasty", "apple pie is delicious", "I have an apple");
        List<String> likeApple = sentences1.stream()
                .filter(x -> x.contains("apple"))
                .toList();
        System.out.println(likeApple);
    }
}
