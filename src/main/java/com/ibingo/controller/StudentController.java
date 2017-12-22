package com.ibingo.controller;

import com.ibingo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("student")
public class StudentController {

    @Resource(name = "studentService")
    private StudentService studentService;

    //@ResponseBody(之前我因为加了这个注解，导致页面访问一直是406错误，注释了就好啦，具体为啥我暂时还不知道)
    @RequestMapping(value = "/getStudentList", method = RequestMethod.GET)
    public ModelAndView getAllStudent() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("studentView");
        mav.addObject("students", studentService.getStudentList());
        return mav;
    }
}
