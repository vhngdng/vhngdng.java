package mypack.animal;

public class Series extends FilmList{
    protected int episode;
    protected double averageDuration;
    Series series;

    public Series(String id, String title, TYPE type, double ranking, double averageDuration, int episode) {
        setID(id);
        setTitle(title);
        setType(type);
        setRanking(ranking);
        setAverageDuration(averageDuration);
        setEpisode(episode);
    }

    public int getEpisode(int episode){
        return this.episode = episode;
    }

    public double setAverageDuration(double averageDuration) {
        return this.averageDuration = averageDuration;
    }

     public double getAverageDuration(){
        return this.averageDuration;
    }

    public int setEpisode(int episode) {
        return this.episode = episode;
    }

     public  String toString(){
        String text = "ID: " + getID() + " | title: " + getTitle() + " | type: " + getType() + " | ranking: " + getRanking() + " | episode " + episode + " | averageDuration " + averageDuration;
        
        return text;
    }

    // In thong tin series
   
}
