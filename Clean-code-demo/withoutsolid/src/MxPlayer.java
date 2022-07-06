public class MxPlayer extends Player
{
    String song;
    String video;
    public MxPlayer()
    {

    }
    public MxPlayer(String song,String video)
    { this.video=video;
        this.song=song;

    }
    public void displayartist(String song)
    {
        System.out.print("Artist of song"+song);
    }


}