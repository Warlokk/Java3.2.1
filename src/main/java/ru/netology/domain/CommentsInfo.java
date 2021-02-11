package ru.netology.domain;

public class CommentsInfo {
    private int id;
    private int count;
    private boolean canPost;
    private String text;
    private int userId;
    private int dateOfComment;
    private int replyUser;
    private int reply;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(int dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    public int getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(int replyUser) {
        this.replyUser = replyUser;
    }

    public int getReply() {
        return reply;
    }

    public void setReply(int reply) {
        this.reply = reply;
    }
}
