package blog;

public class Starter {
    public static void main(String[] args) {
        User user = new User(1, "Oskar", "Polak", "oskix");
        Blog blog = new Blog();

        blog.addUser(user);

        blog.publishPost(user.getId(), "Swiat jest jak roze, czasem boli a czasem jest piekny");
        blog.commentPost(user.getId(), 1, "Alez piekne slowa!");
        blog.commentPost(user.getId(), 1, "Tys jet caly jak roze");


        blog.displayUserEntries(user.getId());


    }
}
