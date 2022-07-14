
package Models;

import java.sql.Date;

public class Blog {
    int blogID;
    String blogTitle;
    String image;
    String content;
    String status;
    String category;
    Date createdDate;
    int categoryID;
    String author;

    public Blog(int blogID,String blogTitle, String image, String content, String category, Date createdDate, int categoryID, String author) {
        this.blogID = blogID;
        this.blogTitle = blogTitle;
        this.image = image;
        this.content = content;
        this.category = category;
        this.createdDate = createdDate;
        this.categoryID = categoryID;
        this.author = author;
    }
    
    public Blog(int blogID, String blogTitle, String image, String content, String category, Date createdDate, int categoryID) {
        this.blogID = blogID;
        this.blogTitle = blogTitle;
        this.image = image;
        this.content = content;
        this.category = category;
        this.createdDate = createdDate;
        this.categoryID = categoryID;
    }
    

    public Blog(int blogID, String blogTitle, String image, String content, String status, String category, Date createdDate) {
        this.blogID = blogID;
        this.blogTitle = blogTitle;
        this.image = image;
        this.content = content;
        this.status = status;
        this.category = category;
        this.createdDate = createdDate;
    }
    
        public Blog(int blogID, String blogTitle, String image, String content, String category, Date createdDate) {
        this.blogID = blogID;
        this.blogTitle = blogTitle;
        this.image = image;
        this.content = content;
        this.category = category;
        this.createdDate = createdDate;
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

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    public String getImage() {
        return image;
    }

    
    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    
}
