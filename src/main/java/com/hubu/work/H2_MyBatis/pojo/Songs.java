package com.hubu.work.H2_MyBatis.pojo;

import org.springframework.stereotype.Component;

@Component

public class Songs {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;
    private String name;
    private String author;
    private String url;
    private String url_words;
    private Integer click_throughput;
    private String ascription;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl_words() {
        return url_words;
    }

    public void setUrl_words(String url_words) {
        this.url_words = url_words;
    }

    public Integer getClick_throughput() {
        return click_throughput;
    }

    public void setClick_throughput(Integer click_throughput) {
        this.click_throughput = click_throughput;
    }

    public String getAscription() {
        return ascription;
    }

    public void setAscription(String ascription) {
        this.ascription = ascription;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    @Override
    public String toString() {
        return "Songs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                ", url_words='" + url_words + '\'' +
                ", click_throughput=" + click_throughput +
                ", ascription='" + ascription + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

}
