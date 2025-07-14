package controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value ="/home")
    public ModelAndView greet(@RequestParam("name") String userName, HttpSession session){
        ModelAndView mv= new ModelAndView();
        //mv.addObject("name", userName);
        mv.setViewName("homePage");

        return mv;
    }

    @RequestMapping(value ="/contact")
    public ModelAndView contact(){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("contactPage");

        return mv;
    }
}

