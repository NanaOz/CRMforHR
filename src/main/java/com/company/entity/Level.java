package com.company.entity;

import javax.persistence.*;

@Embeddable
public class Level {

    @Column(name = "level")
    private Long level;

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }
}