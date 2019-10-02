package com.hubu.work.H2_MyBatis.pojo;


public class Replay {
    private Integer id;
    private String author;
    private String content;
    private String replyObject;
    private Integer praisePoints;
    private String publicationTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplyObject() {
        return replyObject;
    }

    public void setReplyObject(String replyObject) {
        this.replyObject = replyObject;
    }

    public Integer getPraisePoints() {
        return praisePoints;
    }

    public void setPraisePoints(Integer praisePoints) {
        this.praisePoints = praisePoints;
    }

    public String getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
    }
}
