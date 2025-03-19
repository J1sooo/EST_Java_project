package Chap13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        // 컬렉션 객체를 이용해서 스트림 생성
        List<String> list = Arrays.asList("a", "b", "c", "d");

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println); // 결과 확인용
        System.out.println("============");

        // 배열 객체를 이용해서 스트림 생성
        String[] arr = {"a2", "b2", "c2", "d2"};

        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);
        System.out.println("============");

        // 숫자 범위를 이용해서 스트림 생성
        IntStream intStream = IntStream.range(1, 6);
        intStream.forEach(System.out::println);
        System.out.println("============");
        DoubleStream doubleStream = new Random().doubles(5);
        doubleStream.forEach(System.out::println);

        // 파일을 이용해서 스트림 생성
        try {
            Stream<String> stream3 = Files.lines(Path.of("hi.txt"), Charset.forName("UTF-8"));
            stream3.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("파일 입출력 관련 오류! - " + e.getMessage());
            e.printStackTrace();
        }

        // 스트림 연결해서 새로운 스트림 생성
        Stream<Integer> integerStream1 = Stream.of(1,2,3,5);
        Stream<Integer> integerStream2 = Stream.of(13,13,32,43,54);
        Stream<Integer> newStream = Stream.concat(integerStream1, integerStream2);
        newStream.forEach(System.out::println);
    }
}

