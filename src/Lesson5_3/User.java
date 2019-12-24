package Lesson5_3;

public class User {

    private String userName;
    private int userAge;
    private String userFavoriteWord;
    private int[] array;

    public User(String userName, int userAge, String userFavoriteWord, int[] array) {
        this.userName = userName;
        this.userAge = userAge;
        this.userFavoriteWord = userFavoriteWord;
        this.array = array;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserFavoriteWord() {
        return userFavoriteWord;
    }

    public int[] getArray() {
        return array;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserFavoriteWord(String userFavoriteWord) {
        this.userFavoriteWord = userFavoriteWord;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
