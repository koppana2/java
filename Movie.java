package collections;

public class Movie implements Comparable <Movie>{
	private
	String name;
	String director_name;
	float duration;
	int year;
	
	public Movie() {
		
	}

	public Movie(String name, String director_name, float duration, int year) {
		this();
		this.name = name;
		this.director_name = director_name;
		this.duration = duration;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", director_name=" + director_name + ", duration=" + duration + ", year=" + year
				+ "]";
	}

	@Override
	public int compareTo(Movie m) {
		if(year<m.getYear()) {
			return -1;
		}
		return 1;
	}

	
	

	
	}
	
