package heisenberg.ssm.mapper;

import heisenberg.ssm.pojo.Person;
import org.springframework.stereotype.Repository;

/**
 * Created by LaiDaShen on 2017/1/8.
 */
@Repository
public interface PersonMapper {

    void addPerson(Person person);
}
