
package Models;

import java.sql.Date;

public class Tip {
    int tipid;
    String tipName;
    String tipImage;
    String tipContent;
    String cate;
    int cateID;
    Date dateCreated;
    String author;

    public Tip(int tipid, String tipName, String tipImage, String tipContent, String cate, Date dateCreated, int cateID, String author) {
        this.tipid = tipid;
        this.tipName = tipName;
        this.tipImage = tipImage;
        this.tipContent = tipContent;
        this.cate = cate;
        this.cateID = cateID;
        this.dateCreated = dateCreated;
        this.author = author;
    }

    public Tip(String tipName, String tipImage, String tipContent, String cate, int cateID, Date dateCreated, String author) {
        this.tipName = tipName;
        this.tipImage = tipImage;
        this.tipContent = tipContent;
        this.cate = cate;
        this.cateID = cateID;
        this.dateCreated = dateCreated;
        this.author = author;
    }
    

//    
//    public Tip(int tipid, String tipName, String tipContent, String tipImage) {
//        this.tipid = tipid;
//        this.tipName = tipName;
//        this.tipContent = tipContent;
//        this.tipImage = tipImage;
//    }
//    
//
//    public Tip(int tipid, String tipName, String tipContent) {
//        this.tipid = tipid;
//        this.tipName = tipName;
//        this.tipContent = tipContent;
//    }

    public int getTipid() {
        return tipid;
    }

    public void setTipid(int tipid) {
        this.tipid = tipid;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    
    public String getTipName() {
        return tipName;
    }

    public void setTipName(String tipName) {
        this.tipName = tipName;
    }

    public String getTipContent() {
        return tipContent;
    }

    public void setTipContent(String tipContent) {
        this.tipContent = tipContent;
    }

    public String getTipImage() {
        return tipImage;
    }

    public void setTipImage(String tipImage) {
        this.tipImage = tipImage;
    }
    
    
}
