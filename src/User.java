import java.util.Objects;

public class User {
    private static int currentId = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String nickName;

    public User(String nickName) {
        this.nickName = nickName;
        this.id = currentId++;
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "\""+nickName+"\"";
    }
}
