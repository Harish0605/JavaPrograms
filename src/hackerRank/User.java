package hackerRank;

public class User {
	int id;
	String name;
	Double CGPA;
	public User(int id, String name, Double CGPA) {
		this.id = id;
		this.name = name;
		this.CGPA = CGPA;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Double getCGPA() {
		return CGPA;
	}
	public void setCGPA(Double CGPA) {
		this.CGPA=CGPA;
	}
	public String toString() {
		return id + ":" + name + ":" + CGPA;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
