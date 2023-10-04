
public class YearFreq implements Comparable<YearFreq> {
	private int year;
	private int freq;


	public YearFreq(int year , int freq){
		this.year = year;
		this.freq = freq;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year > 0)
		this.year = year;
		else
			System.out.println("Error :Positive ..");
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		if(freq > 0)
		this.freq = freq;
		else
			System.out.println("Error :Positive ..");
	}


	@Override
	public String toString() {
		return "year=" + year + ", freq=" + freq + "]";
	}

	@Override
	public int compareTo(YearFreq o) {
		if(this.year == o.year && this.freq == o.freq)
			return 0;

		return -1;
	}




}
