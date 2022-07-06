public class WithSolid {
    public static void main(String[] args)
    {
        MxPlayer obj=new MxPlayer();
        obj.playAudio();
        obj.playVideo();

        ShareMedia obj2=new ShareMedia();
        AudioPlayer audioplayer=new MxPlayer();
        obj2.shareSong(audioplayer);

        ShareMedia obj3=new ShareMedia();
        AudioPlayer wMusic=new WynkMusic();
        obj3.shareSong(wMusic);

        WynkMusic wm=new WynkMusic();
        wm.playAudio();

        ShowLyrics l=new LyricsInTamil();
        l.displayLyrics();
        ShowLyrics l2=new LyricsInHindi();
        l2.displayLyrics();
    }
}
