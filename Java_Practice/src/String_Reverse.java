
public class String_Reverse {

	 String input="hello Deepak";
	 char [] input_array= input.toCharArray();
	 char[] output_array=new char[input_array.length];
	
	 public void reverse_string()
	 {
		 System.out.println(input_array); 
		 for( int i=0;i<input_array.length;i++) {
				output_array[i]=input_array[input_array.length-i-1];
		}
			System.out.println(output_array); 
	 }
	

	public static void main(String[] args) {
		
		String_Reverse obj=new String_Reverse();
		
		obj.reverse_string();
	}
}
