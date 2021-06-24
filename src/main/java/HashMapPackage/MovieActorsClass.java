package HashMapPackage;

import java.util.HashMap;
import java.util.Map;

public class MovieActorsClass {
    public Map<String, String> hashMap = new HashMap<String, String>();

    public MovieActorsClass() {
        hashMap.put("KGF", "Yash");
        hashMap.put("Me bana Goo", "Vivek kumar Bharti");
        hashMap.put("Dashing Detective", "Mahesh Babu");
        hashMap.put("DJ", "Allu Arjun");
    }

    public void setNewEntry(String Movie, String Actor) {
        hashMap.put(Movie, Actor);
    }

    public String getValue(String MovieName) {
        return hashMap.get(MovieName);
    }
}
