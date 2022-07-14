
package Models;

import java.sql.Date;

public class Comment {

    int commentID;
//    int userID;
    String content;
    int blogID;
    String blogTitle;
    String username;

    public Comment(int commentId, String content, int blogID, String blogTitle, String username) {
        this.commentID = commentId;
        this.content = content;
        this.blogID = blogID;
        this.blogTitle = blogTitle;
        this.username = username;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }
//
//    public int getUserID() {
//        return userID;
//    }
//
//    public void setUserID(int userID) {
//        this.userID = userID;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getBlogID() {
        return blogID;
    }

    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

}
