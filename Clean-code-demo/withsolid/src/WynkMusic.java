
class WynkMusic extends PlayAudio implements SubscriptionAccount
{
    String song;

    @Override
    public void subscriptionAccount() {
        System.out.print("Subscription account");
    }
}