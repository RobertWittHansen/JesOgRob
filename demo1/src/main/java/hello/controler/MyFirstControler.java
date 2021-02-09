package hello.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstControler
{
   @GetMapping("/")
   @ResponseBody
    public String index()
    {
        return "index";
    }


}
