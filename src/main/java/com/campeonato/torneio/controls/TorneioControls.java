package com.campeonato.torneio.controls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author 20211114010023
 */
@Controller
public class TorneioControls {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
