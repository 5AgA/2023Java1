
public class Student extends Person{
	private long sid;
	private String major;
	
	public void setSid(long sid) { this.sid = sid; }
	public void setMajor(String major) { this.major = major; }
	public long getSid() { return this.sid; }
	public String getMajor() { return this.major; }
	
	public Student() { super(); setSid(-1); setMajor("모름");}
	public Student(String name) { super(name); setSid(-1); setMajor("모름");}
	public Student(String name, long sid) { super(name, -1); setSid(sid); setMajor("모름");}
	public Student(String name, long sid, String major) { super(name, -1, "모름"); setSid(sid); setMajor(major);}
	
	public String toString() {
		String ret = "";
		
		ret += super.toString() + ", ";
		ret += "학번: " + getSid() + ", ";
		ret += "전공: " + getMajor();
		
		return ret;
	}
	
	public String printSafely() {
		String ret = "";
		
		ret += "이름: " + super.getName() + ", ";
		ret += "학번: " + getSid() + ", ";
		ret += "전공: " + getMajor();
		
		return ret;
	}
	
	public int isSenior(Student s) {
		 if (getSid() < s.getSid())
			 return -1;
		 else if (getSid() == s.getSid())
			 return 0;
		 else
			 return 1;
	}
	
	public boolean equalsMajor(Student s) {
		if (getMajor() == s.getMajor())
			return true;
		else
			return false;
	}
}
