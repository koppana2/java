package Test;
class Args{
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);

                     String[] s= new String[args.length];
                         s [i]= args[i];
                        System.out.println(s);
		}
	}
}