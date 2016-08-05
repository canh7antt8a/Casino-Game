//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : Notify_Start.java
//  @ Date : 6/7/2012
//  @ Author : sangdn
//  @ Description : send init cards for each player
//
//
package casino.cardgame.message.reponse.game.tala;

import com.smartfoxserver.v2.entities.data.SFSObject;
import java.util.ArrayList;

public class Notify_UserReady extends casino.cardgame.message.reponse.SFSGameReponse {

    private String m_username;
    
    public Notify_UserReady() {
        super(TALA_REPONSE_NAME.USER_READY_RES);
    }

    public SFSObject ToSFSObject() {
        SFSObject obj = new SFSObject();
         obj.putUtfString("user_name", m_username);
        return obj;
    }

    public String getUserName() {
        return m_username;
    }

    public Notify_UserReady setUserName(String userName) {
        this.m_username = userName;
        return this;
    }
}