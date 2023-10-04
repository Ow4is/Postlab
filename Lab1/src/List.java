import java.util.Arrays;

public class List <T extends Comparable> implements ListInterface {

	T [] arr ;
	int count = 0 ;


	public List(){
		arr = (T []) new Comparable[16];

	}

	List (int size){
		if( size > 0)
			arr = (T []) new Comparable[size];
		else{
			System.out.println("ERROR : Size must be positive");
			arr = (T []) new Comparable[16];
		}

	}



	public void add(Comparable data) {
		if(count < arr.length){
			arr[count] = (T) data;
			count++;
		}else
			System.out.println("Error : Array is full");
	}

	public T get(int index){
		return arr[index];
	}



	@Override
	public void delete(Comparable data) {

		int index = find((String) data);

		if(index == -1)
			System.out.println("No Such Data");
		else {
			arr[index] = null;
			for(int i = index ; i < count ; i++) {
				arr[i] = arr[i +1];
			}
			count--;
		}


	}



	@Override
	public void set(Comparable data, int index) {
		if(index < count && index >= 0)
		arr[index] = (T) data;
		else
			System.out.println("Error : index out of bound");
	}


	@Override
	public int find(Comparable data) {
		
		for(int i = 0 ; i < count ; i++) {
			if(arr[i].compareTo(data) == 0)
				return i;
		}
		return -1;

	}

	@Override
	public void print() {

		System.out.print("[");
		for(int i = 0 ; i < count ; i++)
			System.out.print(arr[i] + ", ");
		System.out.print("]");

	}

	@Override
	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return arr[0] == null;
	}

	@Override
	public String toString() {
		String s="";
		for(int i = 0 ; i < count ; i++)
			s+=arr[i] + ", ";
		return s;
	}
	
	

}
