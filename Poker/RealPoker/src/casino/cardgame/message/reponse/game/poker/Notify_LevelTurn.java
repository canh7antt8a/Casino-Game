//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Notify_userTurn.java
//  @ Date : 8/4/2012
//  @ Author : @khoa
//
//
package casino.cardgame.message.reponse.game.poker;

import casino.cardgame.message.reponse.SFSGameReponse;
import com.smartfoxserver.v2.entities.data.SFSArray;
import com.smartfoxserver.v2.entities.data.SFSObject;
import java.util.ArrayList;

public class Notify_LevelTurn extends SFSGameReponse {

    private int _level;
    private double _smallBlind;
    private double _bigBlind;
    private double _ante;
    private int _time;
    
    public Notify_LevelTurn() {
        super(POKER_REPONSE_NAME.LEVEL_TURN_RES);
    }
    
    public SFSObject ToSFSObject() {
        SFSObject obj = new SFSObject();
        obj.putInt("level", _level);
        obj.putDouble("small_blind", _smallBlind);
        obj.putDouble("big_blind", _bigBlind);
        obj.putDouble("ante", _ante);
        obj.putInt("time", _time);
        
        return obj;
     }

    public Notify_LevelTurn setSmallBlind(double smallBlind) {
        this._smallBlind = smallBlind;
        return this;
    }

    public Notify_LevelTurn setBigBlind(double bigBlind) {
        this._bigBlind = bigBlind;
        return this;
    }

    public Notify_LevelTurn setAnte(double ante) {
        this._ante = ante;
        return this;
    }

    public Notify_LevelTurn setTime(int time) {
        this._time = time;
        return this;
    }

    public Notify_LevelTurn setLevel(int level) {
        this._level = level;
        return this;
    }

}