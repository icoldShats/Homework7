import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ShuffleSeasonIterator implements EpisodeIterator{
    private List<Episode> shuffled;
    private int index = 0;

    public ShuffleSeasonIterator(Season season, long seed) {
        shuffled = new ArrayList<>(season.getEpisodes());
        Collections.shuffle(shuffled, new Random(seed));
    }

    public boolean hasNext() {
        return index < shuffled.size();
    }

    public Episode next() {
        return shuffled.get(index++);
    }


}
