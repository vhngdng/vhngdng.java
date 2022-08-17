public class Song {


    private String name;
    private int Id;


    

    public void setSinger(String singer) {
        this.singer = singer;
    }


    public void setName(String name) {
        this.name = name;
    }



    public void setId(int id) {
        Id = id;
    }


    protected String singer;
    
    


  


    public String getName() {
        return name;
    }


    public int getId() {
        return Id;
    }


    public String getSinger() {
        return singer;
    }

      @Override
    public String toString() {
        return "Song: " + name + ", Id" + Id + ", singer" + singer;
    }


}
