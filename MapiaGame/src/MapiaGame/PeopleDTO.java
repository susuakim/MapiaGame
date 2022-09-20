package miniproject;

public class PeopleDTO {
	String name;
	String age;
	String role;
	String survive;
	String room;
	public PeopleDTO(String name, String age, String role, String survive, String room) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
		this.survive = survive;
		this.room = room;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getRole() {
		return role;
	}
	public String getSurvive() {
		return survive;
	}
	public String getRoom() {
		return room;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setSurvive(String survive) {
		this.survive = survive;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	
	
}