public class Main {
    public static void main(String[] args) {
        Season s1 = new Season();
        s1.addEpisode(new Episode("S1E1", 1200));
        s1.addEpisode(new Episode("S1E2", 1250));
        Season s2 = new Season();
        s2.addEpisode(new Episode("S2E1", 1300));
        s2.addEpisode(new Episode("S2E2", 1350));

        Series series = new Series();
        series.addSeason(s1);
        series.addSeason(s2);

        System.out.println("Normal order:");
        for (Episode e : s1) {
            System.out.println(e.getTitle());
        }

        System.out.println("\nReverse order:");
        EpisodeIterator reverse = new ReverseSeasonIterator(s1);
        while (reverse.hasNext()) {
            System.out.println(reverse.next().getTitle());
        }

        System.out.println("\nShuffle order:");
        EpisodeIterator shuffle = new ShuffleSeasonIterator(s1, 42);
        while (shuffle.hasNext()) {
            System.out.println(shuffle.next().getTitle());
        }

        System.out.println("\nBinge watching:");
        EpisodeIterator binge = new BingeIterator(series);
        while (binge.hasNext()) {
            System.out.println(binge.next().getTitle());
        }
    }
}
