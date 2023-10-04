
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		List<USAName> list = new List(30000);

		int count = 2000;
		while (count < 2017){
			String s2 = "C:\\Users\\1220989\\Desktop\\USA_yob"+String.valueOf(count)+".txt";

			File file = new File(s2);
			try(Scanner in = new Scanner(file)){
				while(in.hasNextLine()){
					String [] s = in.nextLine().split(",");
					String name = s[0].trim();
					int index = list.find(new USAName(name ,' '));
					if(index == -1){
						char gender = s[1].charAt(0);
						int freq = Integer.valueOf(s[2]);
						int year = count;
						USAName obj = new USAName(name , gender);
						obj.addYearFreq(year, freq);
						list.add(obj);

					}else{
						int freq = Integer.valueOf(s[2].trim());
						int year = count;
						list.get(index).addYearFreq(year, freq);

					}


				}
		}catch(IOException e){
			System.out.println("Exception");
		}

			count++;

		}
		list.print();

	}

	public static void getMaxFreq(List list){

		for(int i = 0 ; i < list.size() ; i++){

		}
	}
}