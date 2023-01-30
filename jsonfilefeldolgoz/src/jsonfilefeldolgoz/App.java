package jsonfilefeldolgoz;

public class App {

	public static void main(String[] args) {
		JsonReaderWriter file=new JsonReaderWriter();
		file.jsonWriter();
		System.out.println("Kirtak vissza olvasása:");
		file.jsonReader();

	}

}
