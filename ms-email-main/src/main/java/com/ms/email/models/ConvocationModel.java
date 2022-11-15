package com.ms.email.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_FOOTBALL_TEAM")
public class ConvocationModel {

    @Id
    private String footballTeam;
    @Column(columnDefinition = "TEXT")
    private String team;

}
