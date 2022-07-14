
package Models;

public class Review {
    private String userName;
    private String job;
    private String reviewContent;
    private boolean status;
    private int id;

    public Review(int id, String userName, String job, String reviewContent, boolean status) {
        this.userName = userName;
        this.job = job;
        this.reviewContent = reviewContent;
        this.status = status;
        this.id = id;
    }
    
    
    public Review(String userName, String job, String reviewContent, boolean status) {
        this.userName = userName;
        this.job = job;
        this.reviewContent = reviewContent;
        this.status = status;
    }
    
//    public Review(String userName, String job, String reviewContent) {
//        this.userName = userName;
//        this.job = job;
//        this.reviewContent = reviewContent;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }
    
    
}
