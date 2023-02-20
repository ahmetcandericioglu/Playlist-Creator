import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class OrderByReleaseDate implements OrderStrategy{
    @Override
    public void orderBy(ArrayList<Music> songs) {
        sort(songs);
    }

    void sort(ArrayList<Music> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            int key = arr.get(i).getReleaseYear();
            Music key2 = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j).getReleaseYear() > key) {
                Collections.swap(arr,j+1,j);
                j = j - 1;
            }
            arr.set(j+1, key2);
        }
    }
}


