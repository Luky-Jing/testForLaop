package servlet;

import item.Patient;
import item.ProgressNote;
import utils.DBHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiPeijing on 2017/6/10.
 */
public class FindServletForProgress extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProgressNote> list = new ArrayList<ProgressNote>();

        try {
            Connection conn = DBHelper.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from progress_node";
            ResultSet rs = stmt.executeQuery(sql);

//            System.out.println("hello!");
//            int count = 0;

            while (rs.next()) {
                ProgressNote progressNote = new ProgressNote();
                progressNote.setCno(rs.getString("Cno"));
                progressNote.setCdate(rs.getString("Cdate"));
                progressNote.setCsituat(rs.getString("Csituat"));
                progressNote.setCsign(rs.getString("Csign"));
                progressNote.setCuse(rs.getString("Cuse"));
                progressNote.setCregimen(rs.getString("Cregimen"));
                progressNote.setCresult(rs.getString("Cresult"));
                list.add(progressNote);
//                System.out.println(count++);
//                System.out.println(patient.getPname());
            }

            request.setAttribute("list", list);

            System.out.println("FindServlet Done");

        } catch (Exception e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("progress_list.jsp").forward(request, response);
    }
}
