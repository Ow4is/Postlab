
public class USAName implements Comparable<USAName> {
	private String name;
	private char gender;
	private List<YearFreq> yearList = new List(2000);


	public USAName(){

	}

	public USAName(String name , char gender){
		this.name = name;
		this.gender = gender;
	}


	public void addYearFreq(int year , int freq){
		YearFreq obj = new YearFreq(year , freq);
		yearList.add(obj);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if(gender =='F' || gender == 'M')
			this.gender = gender;
		else
			System.out.println("Invalid Gender");
	}

	@Override
	public String toString() {
		return "name=" + name + ", gender=" + gender +" , Year : " + yearList + "\n" ;
	}
	@Override
	public int compareTo(USAName o) {
		if(this.name.compareTo(o.name) == 0)
			return 0;
		else
			return -1;
	}
}
