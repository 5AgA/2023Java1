
public class Student {
	private int id, tuition;
	private double gpa;
	
	public Student(int id, int tuition, double gpa) {
		super();
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	
	public int getId() { return id; }
	public int getTuition() { return tuition; }
	public double getGpa() { return gpa; }
	public void setTuition(int tuition) { this.tuition = tuition; }
	public void setGpa(double gpa) { this.gpa = gpa; }
	
	public String toString() {
		String rslt = "";
		
		rslt += "학번:" + id + ", 등록금:" + tuition;
		rslt += ", 평균등급:" + String.format("%.2f", gpa);
		rslt += ", 장학금:" + scholarship();
		
		return rslt;
	}
	
	public int scholarship() { return (int)(tuition * 0.5); }
}
