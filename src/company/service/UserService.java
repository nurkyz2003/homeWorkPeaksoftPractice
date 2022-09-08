package company.service;

import company.model.User;

import java.util.ArrayList;

public interface UserService {

        public void addUser(ArrayList<User> users);

        public void searchById(int id);

        public  void removeById(int id);

        public  void outputUsers();
}
