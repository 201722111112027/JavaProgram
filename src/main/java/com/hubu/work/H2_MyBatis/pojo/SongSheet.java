package com.hubu.work.H2_MyBatis.pojo;

import org.springframework.stereotype.Component;

@Component

public class SongSheet {
    private Integer id;
    private String name;
    private String author;
    private String time;

    public Integer getClick_throughput() {
        return click_throughput;
    }

    public void setClick_throughput(Integer click_throughput) {
        this.click_throughput = click_throughput;
    }

    private Integer click_throughput;
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "SongSheet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", time='" + time + '\'' +
                ", click_throughput=" + click_throughput +
                ", state='" + state + '\'' +
                '}';
    }

}
