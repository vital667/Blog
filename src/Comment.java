import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comment extends Entry {

    private static int currentId=1;

    public Comment (User user, String content){
        setUser(user);
        setContent(content);
        this.id=currentId++;
        setPostedDate(LocalDateTime.now());
    }



    public void showPost(){
        System.out.println( "(COMMENT) User \"" + getUser() + "\" posted this on [" + getPostedDate() + "] with content: \"" + getContent()+"\"");
    }

    @Override
    public String toString() {
        return getId()+") "+getUser()+" ["+getPostedDate()+"] \""+getContent()+"\"\n";
    }
}
