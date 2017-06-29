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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 * Created by LiPeijing on 2017/6/11.
 */
public class ProgressServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ProgressServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String Cno = request.getParameter("Cno");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date Cdate = null;
        try {
            Cdate = sdf.parse(request.getParameter("Cdate"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String Csituat = request.getParameter("Csituat");
        String Csign = request.getParameter("Csign");
        String Cuse = request.getParameter("Cuse");
        String Cregimen = request.getParameter("Cregimen");
        String Cresult = request.getParameter("Cresult");

        System.out.println(Cno + " " + Cdate + " " + Csituat + " " + Cregimen);
        System.out.println("ProgressServlet");

        try {
            conn = DBHelper.getConnection();
            String sql = "insert into progress_note values(?, ? , ?, ?, ?, NULL, ?);";
            ps = conn.prepareStatement(sql);
            ps.setString(1, Cno);
            ps.setDate(2, (new Date(Cdate.getTime())));
            ps.setString(3, Csituat);
            ps.setString(4, Csign);
            ps.setString(5, Cuse);
            ps.setString(6, Cresult);
            ps.executeUpdate();
            ps.close();

            System.out.println("ProgressServlet Done");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
