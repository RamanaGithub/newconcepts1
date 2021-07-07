package newconcepts1;
//@Data
public class Student {
	private int sid;
	private String sname;
	private int smark;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmark() {
		return smark;
	}
	public void setSmark(int smark) {
		this.smark = smark;
	}
	public Student(int sid, String sname, int smark) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smark = smark;
	}
	//public Student(int sid2, String sname2, int smark2) {
		// TODO Auto-generated constructor stub
	//}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smark=" + smark + "]";
	}
	
	

}
