package ru.itis.lesson13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.lesson13.dao.AnswerDao;
import ru.itis.lesson13.dao.PollDao;
import ru.itis.lesson13.model.Answer;
import ru.itis.lesson13.model.Poll;

import java.util.List;

@RestController
public class PollController {
    @Autowired
    PollDao pollDao;
    @Autowired
    AnswerDao answerDao;

    @RequestMapping("/polls")
    List<Poll> getAllPolls() {
        return pollDao.findAll();
    }

    @RequestMapping("/polls/{id}")
    Poll getPollById(@PathVariable Long id) {
        return pollDao.findById(id);
    }

    @RequestMapping("/answers")
    List<Answer> getAnswersByPollId(@RequestParam Long pollId) {
        return answerDao.getAllByPollId(pollId);
    }
}
