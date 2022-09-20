package miniproject;

public class RankDTO {
	String user_id,rank_time;

	public RankDTO(String user_id, String rank_time) {
		super();
		this.user_id = user_id;
		this.rank_time = rank_time;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getRank_time() {
		return rank_time;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void setRank_time(String rank_time) {
		this.rank_time = rank_time;
	}
	
}
