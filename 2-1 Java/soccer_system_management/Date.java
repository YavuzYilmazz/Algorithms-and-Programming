package soccermanagementsystem;

public class Date {
	private String birth_day;
	private String birth_month;
	private String birth_year;
	private String start_day;
	private String start_month;
	private String start_year;
	private String end_day;
	private String end_month;
	private String end_year;

	public Date(String birth_day, String birth_month, String birth_year, String start_day, String start_month,
			String start_year, String end_day, String end_month, String end_year) {
		this.birth_day = birth_day;
		this.birth_month = birth_month;
		this.birth_year = birth_year;
		this.start_day = start_day;
		this.start_month = start_month;
		this.start_year = start_year;
		this.end_day = end_day;
		this.end_month = end_month;
		this.end_year = end_year;
	}
	

	public Date(String start_day, String start_month, String start_year, String end_day, String end_month,
			String end_year) {
		this.start_day = start_day;
		this.start_month = start_month;
		this.start_year = start_year;
		this.end_day = end_day;
		this.end_month = end_month;
		this.end_year = end_year;
	}


	public String getBirth_day() {
		return birth_day;
	}


	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}


	public String getBirth_month() {
		return birth_month;
	}


	public void setBirth_month(String birth_month) {
		this.birth_month = birth_month;
	}


	public String getBirth_year() {
		return birth_year;
	}


	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}


	public String getStart_day() {
		return start_day;
	}


	public void setStart_day(String start_day) {
		this.start_day = start_day;
	}


	public String getStart_month() {
		return start_month;
	}


	public void setStart_month(String start_month) {
		this.start_month = start_month;
	}


	public String getStart_year() {
		return start_year;
	}


	public void setStart_year(String start_year) {
		this.start_year = start_year;
	}


	public String getEnd_day() {
		return end_day;
	}


	public void setEnd_day(String end_day) {
		this.end_day = end_day;
	}


	public String getEnd_month() {
		return end_month;
	}


	public void setEnd_month(String end_month) {
		this.end_month = end_month;
	}


	public String getEnd_year() {
		return end_year;
	}


	public void setEnd_year(String end_year) {
		this.end_year = end_year;
	}



}
