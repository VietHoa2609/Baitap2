package murach.data;

import java.util.ArrayList;
import java.util.List;

import murach.business.User;

public class UserDB {
	private static List<User> users = new ArrayList<>();
	public static void insert(User user) {
        users.add(user);
        System.out.println("Đã chèn: " + user.getFirstName() + ", " + user.getLastName() + ", " + user.getEmail());
	}

}

