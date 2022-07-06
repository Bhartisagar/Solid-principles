
class Player implements  MediaPlayer //single responsibility principle breaking here
{


    @Override
    public void playAudio() {
        System.out.println("audio will play....");
    }

    @Override
    public void playVideo() throws Exception {
        System.out.println("video will play....");
    }

    @Override
    public void playList() {
        System.out.println("Playlist is here");
    }
}
