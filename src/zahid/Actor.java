package zahid;

import java.util.ArrayList;
import java.util.List;

public class Actor {
	
	private String name;
	private List<String> movies = new ArrayList<String>();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addMovie(String movieName) {
		this.movies.add(movieName);
	}
	
	public String getName() {
		return name;
	}
	
	public void printAllMovieNames() {
		for(int i = 0; i < movies.size(); i++) {
		    System.out.print((movies.get(i)).toString() + "\n");
		}
	}

}
