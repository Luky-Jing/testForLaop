package servlet;

import item.Patient;
import utils.DBHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FindServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Patient> list = new ArrayList<Patient>();

        try {
            Connection conn = DBHelper.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from patient";
            ResultSet rs = stmt.executeQuery(sql);

//            System.out.println("hello!");
//            int count = 0;

            while (rs.next()) {
                Patient patient = new Patient();
                patient.setPno(rs.getString("Pno"));
                patient.setPname(rs.getString("pname"));
                patient.setPnum(rs.getString("pnum"));
                patient.setPsex(rs.getString("psex"));
                patient.setPbirth(rs.getDate("pbirth"));
                patient.setPaddress(rs.getString("paddress"));
                patient.setContact(rs.getString("contact"));
                patient.setPhone(rs.getString("phone"));
                patient.setSno(rs.getString("Sno"));
                patient.setDiagnosis(rs.getString("diagnosis"));
                patient.setPdate(rs.getDate("pdate"));
                patient.setEdate(rs.getDate("edate"));
                patient.setWno(rs.getString("wno"));
                patient.setBno(rs.getString("bno"));
                list.add(patient);
//                System.out.println(count++);
//                System.out.println(patient.getPname());
            }

            request.setAttribute("list", list);  //将list传入页面

            System.out.println("FindServlet Done");

        } catch (Exception e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("patient_list.jsp").forward(request, response);
    }
}
