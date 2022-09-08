package company;

import company.Enums.Gender;
import company.dao.UserDao;
import company.model.User;
import company.service.Impl.UserServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <User> userArrayList = new ArrayList<>();

        userArrayList.add(new User(1,19,"Nurkyz", Gender.FEMALE));
        userArrayList.add(new User(2,20,"Burulai", Gender.FEMALE));
        userArrayList.add(new User(3,22,"Nurmat", Gender.MALE));

        UserDao userDao = new UserDao(userArrayList);
        UserServiceImpl userServiceImpl = new UserServiceImpl(userDao);

         userServiceImpl.addUser(userArrayList);
         userServiceImpl.searchById(1);
         userServiceImpl.removeById(2);
         userServiceImpl.outputUsers();

    }
}