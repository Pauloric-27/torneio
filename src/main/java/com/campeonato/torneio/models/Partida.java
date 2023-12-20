package com.campeonato.torneio.models;

/**
 *
 * @author 20211114010023
 */
public class Partida {
    private int id;
    private int time1_id;
    private int time1_gols;
    private int time2_id;
    private int time2_gols;

    public int getId() {
        return id;
    }

    public int getTime1_id() {
        return time1_id;
    }

    public int getTime1_gols() {
        return time1_gols;
    }

    public int getTime2_id() {
        return time2_id;
    }

    public int getTime2_gols() {
        return time2_gols;
    }

    public void setTime1_gols(int time1_gols) {
        this.time1_gols = time1_gols;
    }

    public void setTime2_gols(int time2_gols) {
        this.time2_gols = time2_gols;
    }
    
    
    
}
