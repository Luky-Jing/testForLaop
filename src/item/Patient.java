package item;

import java.util.Date;

public class Patient {

    private String Pno;
    private String Pname;
    private String Pnum;
    private String Psex;
    private Date Pbirth;
    private String Paddress;
    private String Contact; //联系人
    private String Phone;
    private String Wno;
    private String Diagnosis;   //诊断结果
    private Date Pdate;
    private Date Edate;
    private String Sno;
    private String Bno;

    public String getPnum() {
        return Pnum;
    }

    public void setPnum(String pnum) {
        Pnum = pnum;
    }


    public String getPno() {
        return Pno;
    }

    public void setPno(String pno) {
        Pno = pno;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getPsex() {
        return Psex;
    }

    public void setPsex(String psex) {
        Psex = psex;
    }

    public Date getPbirth() {
        return Pbirth;
    }

    public void setPbirth(Date pbirth) {
        Pbirth = pbirth;
    }

    public String getPaddress() {
        return Paddress;
    }

    public void setPaddress(String paddress) {
        Paddress = paddress;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getWno() {
        return Wno;
    }

    public void setWno(String wno) {
        Wno = wno;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public Date getPdate() {
        return Pdate;
    }

    public void setPdate(Date pdate) {
        Pdate = pdate;
    }

    public Date getEdate() {
        return Edate;
    }

    public void setEdate(Date edate) {
        Edate = edate;
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getBno() {
        return Bno;
    }

    public void setBno(String bno) {
        Bno = bno;
    }
}
