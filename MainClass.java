package classes_Objects;

public class MainClass {

	public static void main(String[] args) {
		// ClassName ObjectName= new ClassName();
		Mobile samsung = new Mobile();

		// Access class Members : objectname.member
		samsung.RAM = 8;
		samsung.ROM = 64;
		samsung.OS = "Android 11";
		samsung.processor = "Snapdragon 720";

		System.out.println("RAM : " + samsung.RAM);
		System.out.println("ROM : " + samsung.ROM);
		System.out.println("OS : " + samsung.OS);
		System.out.println("processor : " + samsung.processor);

		samsung.communication();
		samsung.gaming();
		samsung.browsing();

		System.out.println("--------------------------------------------------");

		Mobile iphone = new Mobile();

		iphone.RAM = 4;
		iphone.ROM = 256;
		iphone.OS = "ios";
		iphone.processor = "Bionic";

		System.out.println("RAM : " + iphone.RAM);
		System.out.println("ROM : " + iphone.ROM);
		System.out.println("OS : " + iphone.OS);
		System.out.println("processor : " + iphone.processor);

		iphone.communication();
		iphone.gaming();
		iphone.browsing();
	}

}
