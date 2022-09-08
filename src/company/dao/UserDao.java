package company.dao;

import company.model.User;

import java.util.ArrayList;
import java.util.Arrays;

public class UserDao {
    ArrayList <User> userArrayList = new ArrayList<>();

    public UserDao(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public ArrayList<User> getUsers() {
        return userArrayList;
    }

    public void setUsers(ArrayList<User> users) {
        this.userArrayList = users;
    }

}
