import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<User> users = new ArrayList<>();
    List<Post> posts = new ArrayList<>();


    public void addUser(User user) {
        users.add(user);
    }


    void publishPost(int userId, String c) throws UserNotFoundException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm");
        User user = findUser(userId);
        if (user == null)
            throw new UserNotFoundException("*** [ERROR] User not found");
        else {
            System.out.println("*** User \"" + user.getNickName() + "\" posted at [" + formatter.format(LocalDateTime.now()) + "] \"" + c + "\"");
            posts.add(new Post(user, c));
        }
    }


    private User findUser(int userId) {
        for (User user : users)
            if (user.getId() == userId)
                return user;
        return null;
    }


    private Post findPost(int postId) {
        for (Post post : posts)
            if (post.getId() == postId)
                return post;
        throw new PostNotFoundException("*** [ERROR] Post not found.");
    }


    void commentPost(int userId, int postId, String c) throws PostNotFoundException, UserNotFoundException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm");
        User user = findUser(userId);
        if (user==null) throw new UserNotFoundException("*** [ERROR] User not found");
        else {
            Post post = findPost(postId);
            Comment comment = new Comment(user, c);
            post.addComment(comment);
            System.out.println("*** User \"" + user.getNickName() + "\" commented on post of "+post.getUser()+": \"" +
                    post.getContent() + "\" at ["+formatter.format(LocalDateTime.now())+"] with content \"" +
                    comment.getContent() + "\"");
        }
    }


    void displayUserEntries(int userId) {
        User user = findUser(userId);
        for (Post post : posts)
            if (post.getUser().equals(user))
                post.showPost();
        for (Post post : posts)
            for (Comment comment : post.getComments())
                if (comment.getUser().equals(user))
                    comment.showPost();
    }


    @Override
    public String toString() {
        return users + "\n" + posts;
    }
}
