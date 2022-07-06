//liskov principle will break  we  want to  add new player like wynk music which plays only song
public class WithOutSolid
{

    public static void main(String[] args) throws Exception {
        Player obj=new MxPlayer();
        obj.playAudio();
        obj.playVideo();
        MxPlayer mxPlayer=new MxPlayer("Mxplayersong","Mxplayervideo");
        ShareMedia obj2=new ShareMedia();
        obj2.shareSong(mxPlayer);
        ShowLyrics object=new ShowLyrics();
        object.showLyricsInHindi(mxPlayer.song);

        Player w=new WynkMusic(); // violeting liscov principle as wynkmusic class is not behaving like parent player class.
        w.playVideo();

        WynkMusic account=new WynkMusic(); // violeted ISP in account type interface
        account.subscriptionAccount();
        account.freeAccount();

    }

}
