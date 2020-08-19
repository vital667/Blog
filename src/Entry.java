import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class Entry {

    protected int id;
    private LocalDateTime postedDate;
    private User user;
    private String content;

    public int getId() {
        return id;
    }

    public String getPostedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        return formatter.format(postedDate);
    }

    public void setPostedDate(LocalDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
