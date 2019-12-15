package com.takebushi.shinobigami;

public class Room {
    String roomName;
    public Room(){

    }
    public Room(String roomName){
        this.roomName = roomName;
    }
    public String getRoomName(){return roomName;}
    public void setRoomName(String roomName){this.roomName = roomName;}
}
