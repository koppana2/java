package variables_datatypes;

public class SwapEx {

	public static void main(String[] args) {
		int i=5;
		int j=2;
		int temp;
		System.out.println("before : "+i);
		System.out.println("before : "+j);
		temp=i;
		i=j;
		j=temp;
		System.out.println("after : "+i);
		System.out.println("after : "+j);
	}

}
/*   5      2
    temp
     i      j   */