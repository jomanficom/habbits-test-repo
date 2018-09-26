package habbits.controllers;

import habbits.model.HelloUser;
import habbits.services.HelloUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/hello_users")
public class HelloUserController {

    @Autowired
    private HelloUserService helloUserService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public @ResponseBody List<HelloUser> getUseres(){
    return helloUserService.getUseres();
    }
}
