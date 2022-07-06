public interface MediaPlayer  //interface segregation principle breaking here if some type of player doesnot want to implement all the functions
{
    public void playAudio();
    public void playVideo() throws Exception;
    public void playList();

}
