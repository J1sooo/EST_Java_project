package Chap11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx2 {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("sendKakaoTalk", "홍길동"));
        messageQueue.offer(new Message("sendMail", "제니"));
        messageQueue.offer(new Message("sendSms", "카리나"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.getCommand()) {
                case "sendKakaoTalk" -> System.out.println(message.getTo() + "에게 카카오톡을 보냅니다");
                case "sendMail" -> System.out.println(message.getTo() + "에게 메일을 보냅니다");
                case "sendSms" -> System.out.println(message.getTo() + "에게 문자를 보냅니다");
            }
        }
        System.out.println("모든 문자를 보냈습니다");
    }
}
