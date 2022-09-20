package ru.otus.spring.dao;

import ru.otus.spring.domain.Answer;
import ru.otus.spring.domain.Quiz;
import ru.otus.spring.domain.TypeResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class QuizSimpleDaoImpl implements QuizDao {
    final int INDEX_QUESTION = 0;
    final int INDEX_ANSWER_FIRST = 2;
    final int INDEX_ANSWER_SECOND = 6;
    final int INDEX_ANSWER_THIRD = 9;
    private int id_quiz_dao;
    private int id_answer_dao;
    Answer answerFirst;
    Answer answerSecond;
    Answer answerThird;
    Quiz quiz;
    ArrayList<Quiz> quizzes = new ArrayList<>();


    @Override
    public Quiz findById(int id) {
        quizzes = parseFile();
        return quizzes.get(id);
    }

    private ArrayList<Quiz> parseFile() {
        List<String> lines = null;
        String[] columns;
        String url = "C:\\Users\\ASUS\\Desktop\\quiz_dz\\src\\main\\resources\\quiz.csv";
        try {
            lines = Files.readAllLines(Paths.get(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < lines.size(); i++) {
            columns = lines.get(i).split(",", 10);
            answerFirst = new Answer(i,columns[INDEX_ANSWER_FIRST], TypeResponse.WRONG);
            answerSecond = new Answer(i,columns[INDEX_ANSWER_SECOND], TypeResponse.RIGHT);
            answerThird = new Answer(i,columns[INDEX_ANSWER_THIRD],TypeResponse.WRONG);
            quizzes.add(new Quiz(i,columns[INDEX_QUESTION],answerFirst, answerSecond,answerThird));
        }
        return quizzes;
    }
}
