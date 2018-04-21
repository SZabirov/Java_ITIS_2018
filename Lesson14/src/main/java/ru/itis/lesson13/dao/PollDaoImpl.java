package ru.itis.lesson13.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.itis.lesson13.model.Answer;
import ru.itis.lesson13.model.Poll;

import java.util.List;

@Component
public class PollDaoImpl implements PollDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    AnswerDao answerDao;

    @Override
    public Poll findById(Long id) {
        String sqlQuery = "SELECT title FROM poll WHERE id = ?";
        Object[] params = {id};
        String title = jdbcTemplate.queryForObject(sqlQuery, params, String.class);
        List<Answer> answers = answerDao.getAllByPollId(id);
        return new Poll(id, title, answers);
    }

    @Override
    public List<Poll> findAll() {
        return null;
    }
}
