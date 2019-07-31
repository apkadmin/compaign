package com.movan.modal;

import java.util.Arrays;

public class Channel {

   private String[] pushNotification  = null;
   private String[] email             = null;
   private String[] sms               = null;
   private String[] facebookMessenger = null;
   private String[] zalo              = null;
   private String[] twitterMessenger  = null;
   private String[] slackMessenger    = null;
   private String[] viberMessenger    = null;
   private String[] skypeMessenger    = null;
   private String[] line              = null;
   private String[] discord           = null;
   private String[] singalPrivate     = null;
   private String[] telegramMessenger = null;
   private String[] whatappsMessages  = null;
   private String[] linkedinMessages  = null;
   private String[] facebookAds       = null;
   private String[] googleAds         = null;
    public Channel() {
    }

    public Channel(String[] pushNotification, String[] email, String[] sms, String[] facebookMessenger, String[] zalo, String[] twitterMessenger, String[] slackMessenger, String[] viberMessenger, String[] skypeMessenger, String[] line, String[] discord, String[] singalPrivate, String[] telegramMessenger, String[] whatappsMessages, String[] linkedinMessages, String[] facebookAds, String[] googleAds) {
        this.pushNotification = pushNotification;
        this.email = email;
        this.sms = sms;
        this.facebookMessenger = facebookMessenger;
        this.zalo = zalo;
        this.twitterMessenger = twitterMessenger;
        this.slackMessenger = slackMessenger;
        this.viberMessenger = viberMessenger;
        this.skypeMessenger = skypeMessenger;
        this.line = line;
        this.discord = discord;
        this.singalPrivate = singalPrivate;
        this.telegramMessenger = telegramMessenger;
        this.whatappsMessages = whatappsMessages;
        this.linkedinMessages = linkedinMessages;
        this.facebookAds = facebookAds;
        this.googleAds = googleAds;
    }

    public String[] getPushNotification() {
        return pushNotification;
    }

    public void setPushNotification(String[] pushNotification) {
        this.pushNotification = pushNotification;
    }

    public String[] getEmail() {
        return email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public String[] getSms() {
        return sms;
    }

    public void setSms(String[] sms) {
        this.sms = sms;
    }

    public String[] getFacebookMessenger() {
        return facebookMessenger;
    }

    public void setFacebookMessenger(String[] facebookMessenger) {
        this.facebookMessenger = facebookMessenger;
    }

    public String[] getZalo() {
        return zalo;
    }

    public void setZalo(String[] zalo) {
        this.zalo = zalo;
    }

    public String[] getTwitterMessenger() {
        return twitterMessenger;
    }

    public void setTwitterMessenger(String[] twitterMessenger) {
        this.twitterMessenger = twitterMessenger;
    }

    public String[] getSlackMessenger() {
        return slackMessenger;
    }

    public void setSlackMessenger(String[] slackMessenger) {
        this.slackMessenger = slackMessenger;
    }

    public String[] getViberMessenger() {
        return viberMessenger;
    }

    public void setViberMessenger(String[] viberMessenger) {
        this.viberMessenger = viberMessenger;
    }

    public String[] getSkypeMessenger() {
        return skypeMessenger;
    }

    public void setSkypeMessenger(String[] skypeMessenger) {
        this.skypeMessenger = skypeMessenger;
    }

    public String[] getLine() {
        return line;
    }

    public void setLine(String[] line) {
        this.line = line;
    }

    public String[] getDiscord() {
        return discord;
    }

    public void setDiscord(String[] discord) {
        this.discord = discord;
    }

    public String[] getSingalPrivate() {
        return singalPrivate;
    }

    public void setSingalPrivate(String[] singalPrivate) {
        this.singalPrivate = singalPrivate;
    }

    public String[] getTelegramMessenger() {
        return telegramMessenger;
    }

    public void setTelegramMessenger(String[] telegramMessenger) {
        this.telegramMessenger = telegramMessenger;
    }

    public String[] getWhatappsMessages() {
        return whatappsMessages;
    }

    public void setWhatappsMessages(String[] whatappsMessages) {
        this.whatappsMessages = whatappsMessages;
    }

    public String[] getLinkedinMessages() {
        return linkedinMessages;
    }

    public void setLinkedinMessages(String[] linkedinMessages) {
        this.linkedinMessages = linkedinMessages;
    }

    public String[] getFacebookAds() {
        return facebookAds;
    }

    public void setFacebookAds(String[] facebookAds) {
        this.facebookAds = facebookAds;
    }

    public String[] getGoogleAds() {
        return googleAds;
    }

    public void setGoogleAds(String[] googleAds) {
        this.googleAds = googleAds;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "pushNotification='" + Arrays.toString(pushNotification) + '\'' +
                ", email='" +  Arrays.toString(email) + '\'' +
                ", sms='" +  Arrays.toString(sms) + '\'' +
                ", facebookMessenger='" +  Arrays.toString(facebookMessenger) + '\'' +
                ", zalo='" +  Arrays.toString(zalo) + '\'' +
                ", twitterMessenger='" +  Arrays.toString(twitterMessenger) + '\'' +
                ", slackMessenger='" +  Arrays.toString(slackMessenger) + '\'' +
                ", viberMessenger='" +  Arrays.toString(viberMessenger) + '\'' +
                ", skypeMessenger='" +  Arrays.toString(skypeMessenger) + '\'' +
                ", line='" +  Arrays.toString(line) + '\'' +
                ", discord='" +  Arrays.toString(discord) + '\'' +
                ", singalPrivate='" +  Arrays.toString(singalPrivate) + '\'' +
                ", telegramMessenger='" +  Arrays.toString(telegramMessenger) + '\'' +
                ", whatappsMessages='" +  Arrays.toString(whatappsMessages) + '\'' +
                ", linkedinMessages='" +  Arrays.toString(linkedinMessages) + '\'' +
                ", facebookAds='" +  Arrays.toString(facebookAds) + '\'' +
                ", googleAds='" +  Arrays.toString(googleAds) + '\'' +
                '}';
    }
}
