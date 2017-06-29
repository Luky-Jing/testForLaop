package servlet;

import utils.DBHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Pno = request.getParameter("Pno");   //获取住院号
        String Diagnosis = request.getParameter("Diagnosis");

//        System.out.println(Pno);

        Connection conn = null;
        PreparedStatement ps = null;    //批量修改数据preparedstatement
        ResultSet rs = null;

        try {
            conn = DBHelper.getConnection();
            String sql = "update patient set Diagnosis=? where pno=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, Diagnosis);
            ps.setString(2, Pno);
            ps.executeLargeUpdate();

            System.out.println("UpdateServlet Done");
        } catch (Exception e) {

        }

        response.sendRedirect("FindServletForUpdate");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
