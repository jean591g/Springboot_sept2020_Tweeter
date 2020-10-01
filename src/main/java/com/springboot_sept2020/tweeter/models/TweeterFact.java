package com.springboot_sept2020.tweeter.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class TweeterFact {

    private String tweetText;
    private String userName;
    private LocalDate tweetDate;
    private LocalTime tweetTime;
    private String makePublic;

    public TweeterFact(String tweetText, String userName, String makePublic){
        this.tweetText = tweetText;
        this.userName = userName;
        this.makePublic = makePublic;
        this.tweetDate = tweetDate.now();
        this.tweetTime = tweetTime.now();
    }
    public String getTweetText(){
        return tweetText;
    }

    public void setTweet(String tweet){
        this.tweetText = tweet;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMakePublic(){
        return makePublic;
    }
    public void setMakePublic(String makePublic) {
        this.makePublic = makePublic;
    }

    public LocalDate getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(LocalDate tweetDate) {
        this.tweetDate = tweetDate;
    }

    public LocalTime getTweetTime() {
        return tweetTime;
    }

    public void setTweetTime(LocalTime tweetTime) {
        this.tweetTime = tweetTime;
    }

    @Override
    public String toString (){
        return tweetText;
    }
}
