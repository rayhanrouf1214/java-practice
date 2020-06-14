package zahid;

public class App {
	
	public static void main(String[] args) {
		Actor actor = new Actor();
		
		actor.setName("shah rukh khan");
		actor.addMovie("Dilwale");
		actor.addMovie("Kuch Kuch Hota Hai");
		actor.addMovie("Zero");
		
		actor.printAllMovieNames();

	}

}
