class ShareMedia   ///dependency inverse breaks here because sharemedia depends on low level class mxplayer
{    MxPlayer mxplayer;
    public void shareSong(MxPlayer mxplayer)
    {   this.mxplayer=mxplayer;
        System.out.println("song will be shared of "+mxplayer.song);

    }

}