package com.springboot_sept2020.tweeter.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class TweeterFact {

    private String tweetText;
    private String userName;
    private LocalDate tweetDate;
    private LocalTime tweetTime;

    public TweeterFact(String tweetText, String userName){
        this.tweetText = tweetText;
        this.userName = userName;
        this.tweetDate = tweetDate.now();
        this.tweetTime = tweetTime.now();
    }

    public LocalTime getTweetTime() {
        return tweetTime;
    }

    public void setTweetTime(LocalTime tweetTime) {
        this.tweetTime = tweetTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(LocalDate tweetDate) {
        this.tweetDate = tweetDate;
    }

    public String getTweetText(){
        return tweetText;
    }

    public void setTweet(String tweet){
        this.tweetText = tweet;
    }

    @Override
    public String toString (){
        return tweetText;
    }
}
