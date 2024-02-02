package com.cunningham.CPRO2221Assignment1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private int id;
    private String name;
    private String teamName;
    private int jerseyNumber;
}
