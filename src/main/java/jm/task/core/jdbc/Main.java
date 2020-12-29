package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import javax.jws.soap.SOAPBinding;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // реализуйте алгоритм здесь
        List<User> list = new ArrayList<>();
        User user = new User();
        UserServiceImpl userService = new UserServiceImpl();

        /**если таблица существует , то просто вывод сообщение, экспешн не кидает*/
//        userDaoJDBC.createUsersTable();
//        System.out.println("успешно создали таблицу");

        /** вывод юзеров, работает*/
//        list = userDaoJDBC.getAllUsers();
//        for (User u : list) {
//            System.out.println(u);
//        }

//        user.setAge((byte) 15);
//        user.setName("Jon");
//        user.setLastName("Jones");

        /** добавление нового юзера, работает */
//        userDaoJDBC.saveUser(user.getName(), user.getLastName(), user.getAge());

        /** очищаем таблицу user, работает */
//        userDaoJDBC.cleanUsersTable();
//        System.out.println("очистка таблицы"); // все четко работает

        /** удаляем данные по id, работает */
//        userDaoJDBC.removeUserById(3);
//        System.out.println("удалили 3 юзера"); // работает

         /** дропаем таблицу, работает */
//        userDaoJDBC.dropUsersTable();
//        System.out.println("дропнули таблицу успешно"); // работает

        /**
         * тесты пока не проходят
         * */

    }
}
