package heisenberg.ssm.service;

import heisenberg.ssm.mapper.PersonMapper;
import heisenberg.ssm.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LaiDaShen on 2017/1/8.
 */
@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public void addPerson(Person person){
        personMapper.addPerson(person);
    }
}
