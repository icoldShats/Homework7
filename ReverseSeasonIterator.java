import java.util.List;
public class ReverseSeasonIterator implements EpisodeIterator{
    private List<Episode> episodes;
    private int index;

    public boolean hasNext() {
        return index >= 0;
    }

    public Episode next() {
        return episodes.get(index--);
    }
}
