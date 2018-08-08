package com.example.mlph_jovel.myapplication.model;

import static com.example.mlph_jovel.myapplication.utilities.StringUtility.isNullOrEmpty;

public class Cell {
    public Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        return player == null || isNullOrEmpty(player.value);
    }
}
