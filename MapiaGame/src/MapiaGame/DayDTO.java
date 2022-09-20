package miniproject;

public class DayDTO {

	String name, time, die_name, roon_n;

	public String getName() {
		return name;
	}

	public String getTime() {
		return time;
	}

	public String getDie_name() {
		return die_name;
	}

	public String getRoon_n() {
		return roon_n;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setDie_name(String die_name) {
		this.die_name = die_name;
	}

	public void setRoon_n(String roon_n) {
		this.roon_n = roon_n;
	}

	public DayDTO(String name, String time, String die_name, String roon_n) {
		super();
		this.name = name;
		this.time = time;
		this.die_name = die_name;
		this.roon_n = roon_n;
	}
	
}
