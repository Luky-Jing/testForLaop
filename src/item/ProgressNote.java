package item;

public class ProgressNote {

    private String Cno;
    private String Cdate;
    private String Csituat; //当天情况
    private String Csign;   //生命体征
    private String Cuse;    //药物使用
    private String Cregimen;    //服药时间
    private String Cresult; //辅助检查结果

    public String getCno() {
        return Cno;
    }

    public void setCno(String cno) {
        Cno = cno;
    }

    public String getCdate() {
        return Cdate;
    }

    public void setCdate(String cdate) {
        Cdate = cdate;
    }

    public String getCsituat() {
        return Csituat;
    }

    public void setCsituat(String csituat) {
        Csituat = csituat;
    }

    public String getCsign() {
        return Csign;
    }

    public void setCsign(String csign) {
        Csign = csign;
    }

    public String getCuse() {
        return Cuse;
    }

    public void setCuse(String cuse) {
        Cuse = cuse;
    }

    public String getCregimen() {
        return Cregimen;
    }

    public void setCregimen(String cregimen) {
        Cregimen = cregimen;
    }

    public String getCresult() {
        return Cresult;
    }

    public void setCresult(String cresult) {
        Cresult = cresult;
    }
}
