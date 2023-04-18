package com.example.calc;

import jakarta.persistence.*;

@Entity

public class Calculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Integer x;

    private Integer y;

    private Integer result;

    public Calculation(String type, Integer x, Integer y, Integer result) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.result = result;
    }

    public Calculation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
