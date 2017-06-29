package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import item.Users;
import utils.DBHelper;

import javax.servlet.annotation.WebServlet;

public class LoginServlet extends javax.servlet.http.HttpServlet {

    public LoginServlet() {
        super();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Users users = new Users();
        String username = request.getParameter("username"); //获取页面数据
        String password = request.getParameter("password");

        try {
            int flag = 0;
            Connection conn = DBHelper.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select password from staff where sno='" + username + "';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String pwd = rs.getString("password");  //读数据库数据
                if (pwd.indexOf(password) != -1) {
                    request.getRequestDispatcher("select.jsp").forward(request, response);  //页面跳转
                } else {
                    flag = 1;
                    request.setAttribute("resul", flag);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }

    public void destory() {
        super.destroy();
    }
}
