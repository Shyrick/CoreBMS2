package FinalOld;

public class User extends UserController{

    private   int id;
    private String login;
    private String pasword;
    private String firstName;
    private String lastName;
    private boolean isAdmin;


    public boolean isAdmin() {
        return isAdmin;
    }


    public User(String login, String pasword, String firstName, String lastName) {
        this.id = users [users.length-1].getId() + 1;
        this.login = login;
        this.pasword = pasword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = false;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPasword() {
        return pasword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }


}
