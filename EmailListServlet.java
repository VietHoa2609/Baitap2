package murach.email;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import murach.business.User;
import murach.data.UserDB;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy dữ liệu từ form
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }

        String url = "/index.html";   // mặc định quay lại form

        if (action.equals("add")) {
            // Lấy thông tin từ form
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");

            // Tạo đối tượng User
            User user = new User(firstName, lastName, email);

            // Lưu user vào "database"
            UserDB.insert(user);

            // Gửi user sang JSP
            request.setAttribute("user", user);

            // Điều hướng sang thanks.jsp
            url = "/thanks.jsp";
        }

        // Forward request
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
