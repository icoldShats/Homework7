
class Season implements Iterable<Episode>  {
    private List<Episode> episodes = new ArrayList<>();
    public void addEpisode(Episode e) {
        episodes.add(e);
    }

}