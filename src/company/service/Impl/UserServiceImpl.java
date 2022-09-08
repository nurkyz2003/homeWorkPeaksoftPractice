package company.service.Impl;

import company.Exeption.MyExeption;
import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

import java.util.ArrayList;

public class UserServiceImpl  implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(ArrayList<User> userArrayList) {
        userDao.setUsers(userArrayList);
    }

    @Override
    public void searchById(int id) {
        try {
            for (int i = 0; i < userDao.getUsers().size(); i++) {
                System.out.println("User with " + id + " ID number: ");
                if (userDao.getUsers().get(i).getId() == id) {
                    System.out.println(userDao.getUsers().get(i));
                    System.out.println("-------------------------------------------------------------------------------------------------");
                    break;
                } else {
                    throw new MyExeption();
                }
            }
        }
        catch (MyExeption e) {
            System.out.println("We can't find user with " + id + " ID number");
        }
    }

    @Override
    public void removeById(int id) {
        System.out.println("Remove user by 2 ID: ");
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                i++;
            }
            System.out.println(userDao.getUsers().get(i));
            System.out.println("--------------------------------------------------------------------------------------------------");
        }
    }

    @Override
    public void outputUsers() {
        System.out.println("--------------------------------------------ALL USERS---------------------------------------------");
        for (User i : userDao.getUsers()) {
            System.out.println(i);
        }
    }
}
