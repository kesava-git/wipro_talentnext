package OOPS_Inheritance.miniProject;
public class Video {
    private String videoName;
    private boolean checkout;
    private int rating;
    public Video(String name) {
        videoName = name;
        checkout = false;
        rating = -1; 
    }
    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        checkout = true; // Mark as checked out
    }

    public void doReturn() {
        checkout = false; // Mark as returned
    }

    public void receiveRating(int rating) {
        this.rating = rating; // Set the rating
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}