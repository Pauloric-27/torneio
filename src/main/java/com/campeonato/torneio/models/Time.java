/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campeonato.torneio.models;

import org.springframework.jdbc.core.JdbcTemplate;
/**
 *
 * @author 20211114010023
 */
public class Time {
    
    private int id;
    private String nome;
    private String estado;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void salvar (JdbcTemplate jdbc){
        jdbc.update("INSERT INTO times (nome, estado) " + "VALUES (?, ?)",  (ps) -> 
        {ps.setString(1, nome);
        ps.setString(2, estado);});
    }
    
    
    
}
