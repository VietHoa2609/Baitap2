package murach.data;

import murach.business.User;

public class UserDB {

    // Hàm insert giả lập (sau này có thể đổi sang JDBC để lưu DB thật)
    public static void insert(User user) {
        // Tạm thời chỉ in ra console cho test
        System.out.println("User saved: " + user.getEmail()
                           + " - " + user.getFirstName()
                           + " " + user.getLastName());
    }
}
