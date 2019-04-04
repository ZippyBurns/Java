
import java.util.HashMap;
import java.util.Set;
public class MapOfTheHashmatique {
	public static void main (String[] args) {
		HashMap<String, String> songList = new HashMap<String, String>();
		songList.put("Hotel California", "The Eagles");
		songList.put("Don't Stop Believing", "Journey");
		songList.put("The Devil Went Down to Georgia", "Charlie Daniels Band");
		songList.put("Bye, Bye, Bye", "Nsync");
		Set<String> keys= songList.keySet();
		for(String key : keys) {
			System.out.println(key);
			System.out.println(songList.get(key));
		}
		
	}
}
