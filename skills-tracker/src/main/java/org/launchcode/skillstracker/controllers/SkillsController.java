package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String getPossibleSkillsContent(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here's the list!</h2>"+
                "<ol>" +
                "<li>Java</li>"+
                "<li>JavaScript</li>" +
                "<li>Python</li>"+ "</ol>";
    }

    @PostMapping("user")
    @ResponseBody
    public String postCompletedUserFormInformation(@RequestParam String name, @RequestParam String languageOne, @RequestParam String languageTwo, @RequestParam String languageThree){
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + languageOne + "</li>" +
                "<li>" + languageTwo + "</li>" +
                "<li>" + languageThree + "</li>" +
                "</ol>";

    }

    @GetMapping("form")
    @ResponseBody
    public String displayUserForm(){
        return "<html>" +
                "<body>" +
                "<form action='/user' method='POST'>"+
                "<p>Name:</p>" +
                "<input type='text' name='name'>"+
                "<p>My Favorite Language:</p>" +
                "<select name='languageOne'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>"+
                "<p>My Second Favorite Language:</p>" +
                "<select name='languageTwo'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>"+
                "<p>My Third Favorite Language:</p>" +
                "<select name='languageThree'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>"+
                "<p><input type='submit' value='Submit'></p>"+
                "</form>" +
                "</body>" +
                "</html>";
    }
}
