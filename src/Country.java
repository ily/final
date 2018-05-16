import java.io.*;
import java.util.*;

public class Country implements Comparable {
    String country;
    int area;

    public static void main(String[] args) throws IOException {
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader("src/country.txt")));
            //Map<Object> arr = new ArrayList<>();
            Set<Country> arr = new HashSet<>();
            while (s.hasNext()) {
                String country = s.next();
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(this.area==area);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        return this.area-area;
    }
}
