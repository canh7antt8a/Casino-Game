//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : Notify_ShowCard.java
//  @ Date : 6/7/2012
//  @ Author : sangdn
//  
//
package casino.cardgame.message.reponse.game.tala;

import com.smartfoxserver.v2.entities.data.SFSArray;
import com.smartfoxserver.v2.entities.data.SFSObject;
import java.util.ArrayList;

public class Notify_ShowCard extends casino.cardgame.message.reponse.SFSGameReponse {

    protected String m_username;
    protected ArrayList<Integer> m_listCard;
    private int m_time;
    
    public Notify_ShowCard() {
        super(TALA_REPONSE_NAME.SHOW_CARD);
    }

    public ArrayList<Integer> getM_listCard() {
        return m_listCard;
    }

    public String getM_username() {
        return m_username;
    }

    public Notify_ShowCard setM_listCard(ArrayList<Integer> m_listCard) {
        this.m_listCard = m_listCard;
        return this;
    }

    public Notify_ShowCard setM_username(String m_username) {
        this.m_username = m_username;
        return this;
    }
    
    public SFSObject ToSFSObject() {
        SFSObject obj = new SFSObject();
        obj.putUtfString("user_name", m_username);
        obj.putInt("time", m_time);
        
        SFSArray sfsArr = new SFSArray();
        for (Integer cardId : m_listCard) {
                sfsArr.addInt(cardId);
        }
        obj.putSFSArray("list_card", sfsArr);
        return obj;
    }

    public int getM_time() {
        return m_time;
    }
    public Notify_ShowCard setM_time(int m_time) {
        this.m_time = m_time;
        return this;
    }
}
