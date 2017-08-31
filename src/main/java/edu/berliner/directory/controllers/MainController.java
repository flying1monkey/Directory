package edu.berliner.directory.controllers;

import edu.berliner.directory.repositories.DepartmentRepository;
import edu.berliner.directory.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    DepartmentRepository deptRepo;
    @Autowired
    EmployeeRepository empRepo;

    @RequestMapping("/")
    public @ResponseBody String welcomePage()
    {
        System.out.println("Here!");
        return "This";
    }

}
