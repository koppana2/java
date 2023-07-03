package collections;


import java.util.Set;
import java.util.TreeSet;

public class Movie_Main {

	public static void main(String[] args) {
		Set<Movie>movieList=new TreeSet<Movie>();
		movieList.add(new Movie("Bahubhali 2","RajaMouli",3,2021));
		movieList.add(new Movie("RRR","RajaMouli",3,2022));
		movieList.add(new Movie("Bahubhali 1","RajaMouli",2.5f,2019));
		movieList.add(new Movie("Bheemla Nayak","TriVikram",2.6f,2021));
		movieList.add(new Movie("Na peru Surya","David",2.2f,2018));
		movieList.add(new Movie("Simha","Boyapati Sreenu",3,2019));
		movieList.add(new Movie("Alludu Seenu","TriviKram",2.8f,2017));
		movieList.add(new Movie("Khiladi","Adharsh",2.9f,2020));
		movieList.add(new Movie("King Kong","James Cameron",3,2019));
		movieList.add(new Movie("Avatar","James Cameron",2.4f,2022));
		
		for(Movie m:movieList )
		System.out.println(m);
		

	}

}
