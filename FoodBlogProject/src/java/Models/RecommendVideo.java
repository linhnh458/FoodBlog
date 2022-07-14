
package Models;

public class RecommendVideo {
    int videoID;
    String youtubeLink;
    String description;
    int status;
    
    public RecommendVideo(int videoID, String youtubeLink, String description, int status) {
        this.videoID = videoID;
        this.youtubeLink = youtubeLink;
        this.description = description;
        this.status = status;
    }

    public int getVideoID() {
        return videoID;
    }

    public void setVideoID(int videoID) {
        this.videoID = videoID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
