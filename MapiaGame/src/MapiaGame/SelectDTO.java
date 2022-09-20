package miniproject;

public class SelectDTO { //테이블별로 구성이 된다
	
	private String name;
	private int age;
	private String evidence1;
	private String evidence2;
	private String evidence3;
	private String role;
	private String survive;
	
	
	public SelectDTO(String name, int age, String evidence1, String evidence2, String evidence3, String role,
			String survive) {
		super();
		this.setName(name);
		this.age = age;
		this.evidence1 = evidence1;
		this.evidence2 = evidence2;
		this.evidence3 = evidence3;
		this.role = role;
		this.survive = survive;
	}
	
	
	
	
	
	public SelectDTO(String name, String survive) {
		this.setName(name);
		this.survive = survive;
	}
	
	public SelectDTO(String name) {
		this.setName(name);

	}

	public int getAge() {return age;}

	public String getEvidence1() {return evidence1;}

	public String getEvidence2() {return evidence2;}

	public String getEvidence3() {return evidence3;}

	public String getRole() {return role;}

	public String getSurvive() {return survive;}

	public void setAge(int age) {this.age = age;}

	public void setEvidence1(String evidence1) {this.evidence1 = evidence1;}

	public void setEvidence2(String evidence2) {this.evidence2 = evidence2;}

	public void setEvidence3(String evidence3) {this.evidence3 = evidence3;}

	public void setRole(String role) {this.role = role;}

	public void setSurvive(String survive) {this.survive = survive;}
	
	public void setname(String name) {this.setName(name);}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}


}
