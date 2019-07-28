package com.liyan.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
    private Integer id;
    private String name;
    private Integer age;
    private Set<String> sets;
    private List<String> list;
    private String[] strings;
    private Map<String,String> map;
    private Desk desk;

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sets=" + sets +
                ", list=" + list +
                ", strings=" + Arrays.toString(strings) +
                ", map=" + map +
                ", desk=" + desk +
                '}';
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public People(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("有参数的构造方法");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("执行set方法");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
