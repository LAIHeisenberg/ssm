package heisenberg.ssm.handler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LaiDaShen on 2017/1/8.
 */
@Controller
@RequestMapping("/hello")
public class HelloHandler {

    public HelloHandler(){
        System.out.println("############### HelloHandler construction ##################");
    }

    @RequestMapping(value="/ssm", method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

}
