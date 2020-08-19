import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post extends Entry {

    private List<Comment> comments = new ArrayList<>();

    private static int currentId = 1;

    public Post(User user, String content) {
        setUser(user);
        setContent(content);
        this.id = currentId++;
        setPostedDate(LocalDateTime.now());
    }

    public void addComment (Comment comment){
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void showPost(){
        System.out.println(getUser()+" entries:");
        System.out.println( "(POST) User " + getUser() + " posted this on [" + getPostedDate() + "] with content: \"" + getContent()+"\"");
    }

    @Override
    public String toString() {
        return getId() + ") " + getUser() + " [" + getPostedDate() + "] \"" + getContent() + "\"; \nComments:\n" + comments+"\n";
    }
}
