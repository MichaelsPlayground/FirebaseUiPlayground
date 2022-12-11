package com.firebase.uidemo.models;

public class UserFirestoreModel {

    String userPhotoUrl, userName, userMail, userId, userPassword = "null", recentMessage, about="null", token="null", userPublicKey;
    long  recentMsgTime;
    boolean userOnline;

    public UserFirestoreModel() {
    }

    // for secure messaging
    public UserFirestoreModel(String userName, String userMail, String userPhotoUrl, String userPublicKey) {
        this.userName = userName;
        this.userMail = userMail;
        this.userPhotoUrl = userPhotoUrl;
        this.userPublicKey = userPublicKey;
    }

    // for signUp
    public UserFirestoreModel(String userName, String userMail, String userPhotoUrl, String userPublicKey, boolean userIsOnline) {
        this.userName = userName;
        this.userMail = userMail;
        this.userPhotoUrl = userPhotoUrl;
        this.userPublicKey = userPublicKey;
        this.userOnline = userIsOnline;
    }

    public boolean isUserOnline() {
        return userOnline;
    }

    public void setUserOnline(boolean userOnline) {
        this.userOnline = userOnline;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAbout() {
        return about;
    }

    public long getRecentMsgTime() {
        return recentMsgTime;
    }

    public void setRecentMsgTime(long recentMsgTime) {
        this.recentMsgTime = recentMsgTime;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getUserPhotoUrl() {
        return userPhotoUrl;
    }

    public void setUserPhotoUrl(String userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl;
    }

    public String getUserPublicKey() {
        return userPublicKey;
    }

    public void setUserPublicKey(String userPublicKey) {
        this.userPublicKey = userPublicKey;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getRecentMessage() {
        return recentMessage;
    }

    public void setRecentMessage(String recentMessage) {
        this.recentMessage = recentMessage;
    }
}
