package com.campeonato.torneio.controls;

import com.campeonato.torneio.models.Time;
import com.campeonato.torneio.models.Partida;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author 20211114010023
 */
@Controller
public class TorneioControls {
    
    @GetMapping("/")
    public String index(Model model){
        List<Time> times = Time.listar(jdbc);
        model.addAttribute("times", times);
        return "index";
    }
    
    @Autowired JdbcTemplate jdbc;
    
    @PostMapping("/salvarTime")
    public String time(String nome, String estado){
        Time t = new Time(nome, estado);
        t.salvar(jdbc);
        return"redirect:/";
    }
}
