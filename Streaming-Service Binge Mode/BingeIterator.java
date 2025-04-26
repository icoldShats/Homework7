import java.util.List;
class BingeIterator implements EpisodeIterator {
    private List<Season> seasons;
    private int seasonIndex = 0;
    private EpisodeIterator current;

    public BingeIterator(Series series) {
        this.seasons = series.getSeasons();
        if (!seasons.isEmpty()) {
            current = new SeasonIterator(seasons.get(0));
        }
    }

    public boolean hasNext() {
        while (seasonIndex < seasons.size()) {
            if (current != null && current.hasNext()) return true;
            seasonIndex++;
            if (seasonIndex < seasons.size())
                current = new SeasonIterator(seasons.get(seasonIndex));
        }
        return false;
    }

    public Episode next() {
        return current.next();
    }}