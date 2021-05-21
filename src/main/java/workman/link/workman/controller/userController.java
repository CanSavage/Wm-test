package workman.link.workman.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import workman.link.workman.entity.*;
import workman.link.workman.mapper.userMapper;

import java.util.List;

@Controller
public class userController {

    @Autowired
    private userMapper userMapper;

    @GetMapping("/main")
    public ModelAndView in() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Main");
        return mv;
    }

    @GetMapping("showAll")
    @ResponseBody
    public List<user> showAll() {
        List<user> list = userMapper.selectList(null);
        return list;
    }

}
