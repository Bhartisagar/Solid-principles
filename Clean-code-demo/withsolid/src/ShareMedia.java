
class ShareMedia ///dependency inverse fixed here because sharemedia no more depends on mxplayer
{    AudioPlayer audioplayer;
    public void shareSong(AudioPlayer audioplayer)
    { this.audioplayer= audioplayer;
        System.out.println("song will be shared ");

    }

}