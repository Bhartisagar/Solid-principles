public class WynkMusic extends Player implements AccountType
{
    //wynkMusic app do no play video so cannot use in place of player.




    public void playVideo() throws Exception {
        throw new Exception("cannot play video in wynkmusic");

    }

    @Override
    public void subscriptionAccount()
    { System.out.print("you have subscription");

    }

    @Override
    public void freeAccount() throws Exception {
        throw new Exception("you cannot use free account");
    }
}
