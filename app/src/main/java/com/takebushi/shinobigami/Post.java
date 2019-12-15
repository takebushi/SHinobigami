package com.takebushi.shinobigami;

public class Post {
    String kplName;
    String kplMission;
    String kplSecret;
    public Post(){

    }
    public Post(String kplName, String kplMission,String kplSecret){
        this.kplName = kplName;
        this.kplMission = kplMission;
        this.kplSecret  =kplSecret;

    }
    public String getKplName(){return kplName;}
    public void setKplName(String kplname){this.kplName = kplname;}
    public String getKplMission(){return  kplMission;}
    public void setKplMission(String kplmission){this.kplMission = kplmission;}
    public String getKplSecret(){return  kplSecret;}
    public void setKplSecret(String kplsecret){this.kplSecret = kplsecret;}

}
