package heisenberg.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LaiDaShen on 2017/1/8.
 */
public class TestMybatis {

    private ApplicationContext ctx;
    private SqlSession sqlSession;


    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SqlSessionFactory sqlSessionFactory = ctx.getBean(SqlSessionFactory.class);
        sqlSession = sqlSessionFactory.openSession();

    }
    @After
    public void release(){
        sqlSession.close();
    }

    @Test
    public void testInsertPerson(){
        sqlSession.getMapper()
    }

}
