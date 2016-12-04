package com.golosinaspitufos.security.web;

import com.golosinaspitufos.security.model.User;
import com.golosinaspitufos.security.service.SecurityService;
import com.golosinaspitufos.security.service.UserService;
import com.golosinaspitufos.security.validator.UserValidator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private static final Logger LOGGER = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public void registration(@RequestBody User user, BindingResult bindingResult) {
        userValidator.validate(user, bindingResult);
        userService.save(user);
        securityService.autologin(user.getUsername(), user.getPasswordConfirm());
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        return "login";
    }

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> errorHandler(Exception exc) {
        return new ResponseEntity<>(exc.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
