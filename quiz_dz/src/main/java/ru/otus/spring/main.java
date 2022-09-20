package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.domain.Quiz;
import ru.otus.spring.service.QuizService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        QuizService service = context.getBean(QuizService.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя и фамилию в формате 'Иван Иванов':");
        String name = String.valueOf(sc.nextLine());
        Quiz quiz = service.getById(0);
        System.out.println(quiz.getAnswerFirst());
    }
}
