package com.hubu.work.H2_MyBatis.pojo;

public class Comment {
    private Integer id;
    private String author;
    private String content;

    public String getCommentAim() {
        return commentAim;
    }

    public void setCommentAim(String commentAim) {
        this.commentAim = commentAim;
    }

    private String commentAim;
    private Integer praisePoints;
    private String publicationTime;

    public String getReplayId() {
        return replayId;
    }

    public void setReplayId(String replayId) {
        this.replayId = replayId;
    }

    private String replayId;

    public String getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
    }

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

    public Integer getPraisePoints() {
        return praisePoints;
    }

    public void setPraisePoints(Integer praisePoints) {
        this.praisePoints = praisePoints;
    }
}
