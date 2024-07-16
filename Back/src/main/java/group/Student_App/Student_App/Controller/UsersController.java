package group.Student_App.Student_App.Controller;

import group.Student_App.Student_App.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UsersController {

    @Autowired
    UsersService usersService;

    public String index(Model model){
        model.addAttribute("users",usersService.getAllUsers());
        return "users/index";
    }
}
