package collections;

import java.util.*;

import interfaces.Triangle;

public class UserObjects {

	public static void main(String[] args) {
		Triangle t1=new Triangle(2,6,8,"0.##");
		Triangle t2=new Triangle(5,6,9,"0.##");
		Triangle t3=new Triangle(3,5,2,"0.##");
		Triangle t4=new Triangle(5,6,4,"0.##");
		Triangle t5=new Triangle(2,1,8,"0.##");
		
		List<Triangle> triList=new ArrayList <Triangle>();
		triList.add(t1);
		triList.add(t2);
		triList.add(t3);
		triList.add(t4);
		triList.add(t5);
		
		for(int i=0;i<triList.size();i++) {
			                                    //if((triList.get(i)).getSide2()>5)
			System.out.println(triList.get(i));
		}
		
	}

}
