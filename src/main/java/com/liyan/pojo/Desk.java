package com.liyan.pojo;

public class Desk {
    private Integer id;
    private Double money;

    @Override
    public String toString() {
        return "Desk{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
