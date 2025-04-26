import java.util.List;
public class ShuffleSeasonIterator implements EpisodeIterator{
    private List<Episode> shuffled;
    private int index = 0;

    public boolean hasNext() {
        return index < shuffled.size();
    }

    public Episode next() {
        return shuffled.get(index++);
    }


}
