Without Solid Principle:-

1). Created MediaPlayer Interface which contains method playAudio,playVideo,playList.
2). Created Player class that implements MediaPlayer interface and implements all methods of mediaplayer.
3). Created MxPlayer class that extends Player class.
4). Created Sharemedia class which used to sharesong and depends on MxPlayer, without Mxplayer it cannot be used.
5). Created ShowLyrics Class which contains functions to show lyrics in hindi and english.
6). Created WithOutSolid class which contains main function to implement all classes.
7). Created new WynkMusic class which extending player class. But it can play only song.



1). Single responsibilty principle-
    Player class contains different functions inside it. It breaking the single responsibility principle.

2). Open/Closed Principle-
    ShowLyrics contains functions which shows lyrics in hindi and in english. Let we want to add new function that shows lyrics in tamil so we have to modify the class ShowLyrics.
    Here open/closed principle will break.

3). Liscov Substitution Principle-
    Let we want to add new type of player that is WynkMusic that know to play only songs. 
    It extending the player class which contains functions like playVideo and playAudio. playvideo is not going to use in WynkMusic and it will throw exception.
    WynkMusic cannot use inplace of its parent class that is player class.
    So it breaks here Liskov principle.

4). Interface Segregation Principle-
    created a interface having two function freeAccount() and subscriptionAccount(). 
    let wynkmusic can have only subscriptionaccount,not a freeaccount.it cannot work without subscription
    so by implemention AccountType in Wynkmusic forcefully we have to implement both funtions ,in which freeaccount is not required
    so here ISP principle is breaking.

5). Dependency Inversion Principle-
    ShareMedia depends on object of mxplayer class. Without MxPlayer it cannot work.
    It depends on low level class MxPlayer.




With SOLID Principle:

1). Single responsibilty principle- 
    For solving this principle created new different class for play audio that implements interface AudioPlayer and VideoPlayer, any type of player can use it.

2). Open/Closed Principle-
    To fix problem given in without open/closed principle,
    created a interface displayLyrics that is implemented by class LyricsInHindi and LyricsInEnglish  and LyricsInTamil.
    Without changing any Lyrics class we can simple implement Showlyrics interface displayLyrics function.

3). Liscov Substitution Principle-
    To fix the problem given in without liscov principle, we have created interface AudioPlayer and VideoPlayer.
    AudioPlayer contains AudioPlay function only.
    so, now WynkMusic can extend PlayAudio class that know only to playsong.
    WynkMusic instance can be used in place of PlayAudio class. 

4). Interface Segregation Principle-
    Created Different Interfaces for subscirptionAccount() and freeAccount().
    Now wynkMusic can implement only subscriptionAccount() .

5). Dependency Inversion Principle-
    ShareMedia is now do not depend on Low level class that is MxPlayer.
    It takes reference of interface and can be used by any class that implements that interface.
    
 
       
