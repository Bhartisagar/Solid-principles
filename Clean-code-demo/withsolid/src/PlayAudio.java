
//liskov principle fixed  we added new player like wynk music which plays only song

public class PlayAudio implements  AudioPlayer //single responsibility principle fixed here
{
    @Override
    public void playAudio()
    {
        System.out.println("audio will play....");
    }

}
