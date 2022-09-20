package ru.otus.spring.service;

import ru.otus.spring.dao.QuizDao;
import ru.otus.spring.dao.QuizSimpleDaoImpl;
import ru.otus.spring.domain.Quiz;

public class QuizServiceImpl implements QuizDao{
    final private QuizDao dao;

    public QuizServiceImpl (QuizDao dao){
        this.dao = dao;
    }


    @Override
    public Quiz findById(int id) {
       return dao.findById(id);
    }
}
