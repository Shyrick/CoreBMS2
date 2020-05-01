package FinalOld;

public class UserController {

    User [] users;

    public  void createNewUser (String login, String pasword, String firstName, String lastName ){
        User user = new User(login, pasword, firstName, lastName);
        resizeUsersArray(user);
    }

    public void resizeUsersArray (User user){
        User [] newUsers = new User[users.length+1];
        for (int i = 0; i <users.length ; i++) {
            newUsers[i] = users[i];
        }
        newUsers[users.length] = user;
        users = newUsers;
    }

    public User[] getUsers() {
        return users;
    }
}
