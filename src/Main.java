public class Main {

    public static void main(String[] args) {

        Blog blog = new Blog();
        blog.addUser(new User("Michalos"));
        blog.addUser(new User("Vit667"));
        blog.addUser(new User("Bartek"));
        blog.addUser(new User("Lurry"));
        blog.addUser(new User("Alicja"));

//Posts

        try {
            blog.publishPost(5, "Hello World");
        } catch (UserNotFoundException e) {
            System.out.println("*** [ERROR] User doesn't exist");
        }


        try {
            blog.publishPost(3, "My 2 Post");
        } catch (UserNotFoundException e) {
            System.out.println("*** [ERROR] User doesn't exist");
        }


        try {
            blog.publishPost(4, "My 3 Post");
        } catch (UserNotFoundException e) {
            System.out.println("*** [ERROR] User doesn't exist");
        }

        System.out.println();
//Comments

        try {
            blog.commentPost(0, 5, "My Comment 1");
        } catch (UserNotFoundException | NullPointerException e) {
            System.out.println("*** [ERROR] User doesn't exist");
        } catch (PostNotFoundException e) {
            System.out.println("*** [ERROR] Post doesn't exist");
        }


        try {
            blog.commentPost(3, 2, "My Comment 2");
        } catch (UserNotFoundException | NullPointerException e) {
            System.out.println("*** [ERROR] User doesn't exist");
        } catch (PostNotFoundException e) {
            System.out.println("*** [ERROR] Post doesn't exist");
        }


        try {
            blog.commentPost(4, 6, "My Comment 3");
        } catch (UserNotFoundException | NullPointerException e) {
            System.out.println("*** [ERROR] User doesn't exist");
        } catch (PostNotFoundException e) {
            System.out.println("*** [ERROR] Post doesn't exist");
        }


        try {
            blog.commentPost(5, 1, "My Comment 4");
        } catch (UserNotFoundException | NullPointerException e) {
            System.out.println("*** [ERROR] User doesn't exist");
        } catch (PostNotFoundException e) {
            System.out.println("*** [ERROR] Post doesn't exist");
        }


        try {
            blog.commentPost(3, 1, "My Comment 5");
        } catch (UserNotFoundException | NullPointerException e) {
            System.out.println("*** [ERROR] User doesn't exist");
        } catch (PostNotFoundException e) {
            System.out.println("*** [ERROR] Post doesn't exist");
        }

        System.out.println();

        blog.displayUserEntries(3);

        System.out.println();

        blog.displayUserEntries(4);

    }
}
