import java.util.Iterator;
import java.util.List;
class SeasonIterator implements EpisodeIterator, Iterator<Episode> {
    private List<Episode> episodes;
    private int index = 0;

    public SeasonIterator(Season season) {
        this.episodes = season.getEpisodes();
    }
    public boolean hasNext() {
        return index < episodes.size();
    }

    public Episode next() {
        return episodes.get(index++);
    }
}