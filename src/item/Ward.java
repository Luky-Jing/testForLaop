package item;

public class Ward {

    private String Sno;
    private String Dename;  //所属科室
    private String Saddress;
    private int Stotal;
    private int Snum;

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getDename() {
        return Dename;
    }

    public void setDename(String dename) {
        Dename = dename;
    }

    public String getSaddress() {
        return Saddress;
    }

    public void setSaddress(String saddress) {
        Saddress = saddress;
    }

    public int getStotal() {
        return Stotal;
    }

    public void setStotal(int stotal) {
        Stotal = stotal;
    }

    public int getSnum() {
        return Snum;
    }

    public void setSnum(int snum) {
        Snum = snum;
    }
}
