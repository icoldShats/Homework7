import java.util.Iterator;
import java.util.List;
class SeasonIterator implements EpisodeIterator, Iterator<Episode> {
    private List<Episode> episodes;
}