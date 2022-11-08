package com.safarandras.RockPaperScissors.controller;

import com.safarandras.RockPaperScissors.model.Rule;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GameController {
    @RequestMapping("/rules")
    public Map<Rule,String> getRules(){
        return Rule.getAllRules();
    }
}
