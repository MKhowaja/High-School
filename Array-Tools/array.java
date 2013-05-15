
public class array {
  public static int [] reverse (int []x){
		int [] temp = new int [x.length];
		for (int i = 0; i < x.length; i++){
			temp[i] = x[x.length-i-1];
		}
		return temp;
	}
	public static void output(int[]x){
		for (int i = 0; i<x.length; i++){
			System.out.println(x[i]);
		}
	}
	public static int[] copy (int []x){
		int [] temp = new int [x.length];
		for (int i = 0; i < x.length; i++){
			temp[i] = x[i];
		}
		return temp;
	}
	public static int[] copylarger (int []x){
		int [] temp = new int [x.length + 1];
		for (int i = 0; i < x.length; i++){
			temp[i] = x[i];
		}
		return temp;
	}
	public static int[] increasefirst (int[]x){
		int [] temp = new int [x.length + 1];
		for (int i = 1; i < temp.length; i++){
			temp[i] = x[i-1];
		}
		return temp;
	}
	public static int[] removefirst (int []x){
		int [] temp = new int [x.length-1];
		for (int i = 0; i < temp.length; i++){
			temp[i] = x[i+1];
		}
		return temp;
	}
	public static int[] removelast (int []x){
		int [] temp = new int [x.length-1];
		for (int i = 0; i < temp.length; i++){
			temp[i] = x[i];
		}
		return temp;
	}
	public static void main (String[]args){
		int [] sample = {54, 19, 59, 98, 85, 71, 86, 45, 50};
		//sample = reverse(sample);
		//output(sample);
		int [] sample2 = new int [sample.length];
		sample2 = copy(sample);
		int [] sample3 = new int [sample.length];
		sample3 = copylarger(sample);
		//output(sample3);
		int [] sample4 = new int [sample.length];
		sample4 = increasefirst(sample);
		output(sample4);
		int [] sample5 = new int [sample.length];
		sample5 = removefirst(sample);
		//output(sample5);
		
	}
}
