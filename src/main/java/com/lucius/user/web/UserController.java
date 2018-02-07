package com.lucius.user.web;

import com.lucius.user.entity.User;
import com.lucius.user.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {
    private IUserService userService;


    @RequestMapping("/welcome")
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        String uname=request.getParameter("name");
        Integer uage=Integer.valueOf(request.getParameter("age"));

        User info=new User();


        userService.add(info);

        return new ModelAndView("/welcome.jsp");
    }


    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
