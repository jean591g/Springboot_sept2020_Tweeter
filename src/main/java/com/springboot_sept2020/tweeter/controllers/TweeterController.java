package com.springboot_sept2020.tweeter.controllers;


import com.springboot_sept2020.tweeter.models.TweeterFact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TweeterController {

    // List<CatFact> listOfCatFacts = new ArrayList<CatFact>();
    List<TweeterFact> listOfTweets = new ArrayList<>();
    // TweeterFact tweetObj = new TweeterFact("Hello World!");

    @GetMapping("/")
    public String index(Model tweeterFactModel){
        // String example = "Test!!!";
        // tweeterFactModel.addAttribute("tweetFactToDisplay", example);
        // tilføjer data til min view:
        tweeterFactModel.addAttribute("tweetTextToDisplay", listOfTweets);
        return "index";
    }
    @PostMapping("/postTweeterFact")
    public String postTweetFact(WebRequest dataFromForm){
        TweeterFact tweetFactFromForm = new TweeterFact(dataFromForm.getParameter("tweetfact"), "Jean");
        // tweetObj = tweetFactFromForm;
        // System.out.println(dataFromForm.getParameter(s:"catfact"));
        listOfTweets.add(tweetFactFromForm);
        return "redirect:/";
    }
}
