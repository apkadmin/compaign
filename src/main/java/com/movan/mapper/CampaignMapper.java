package com.movan.mapper;

import com.movan.modal.Campaign;
import com.movan.modal.Channel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author annguyen
 */


public class CampaignMapper implements RowMapper<Campaign> {


    public static final String Base_SQL = "SELECT id,name,app_id,segment_id,status,state_of_funel,date_added,expired_time,channel.pushNotification ,channel.email,channel.Sms,channel.facebookMessenger,channel.zalo,channel.twitterMessenger,channel.slackMessenger,channel.viberMessenger,channel.skypeMessenger,channel.line,channel.discord,channel.singalPrivateMessenger,channel.telegramMessenger,channel.whatappsMessages,channel.linkedinMessages,channel.facebookAds,channel.googleAds from Campaign";

    @Override
    public Campaign mapRow(ResultSet rs, int rowNum) throws SQLException {
        String id 				= rs.getString("id");
        String name 			= rs.getString("name");
        String app_id  			= rs.getString("app_id");
        String segment_id  		= rs.getString("segment_id");
        String state_of_funel   = rs.getString("state_of_funel");
        Date date_added   	= rs.getDate("date_added");
        int status 				= rs.getInt("status");
        Date expired_time 	= rs.getDate("expired_time");
        String[] pushNotification  = (String[]) rs.getArray("channel.pushNotification").getArray();
        String[] email             = (String[]) rs.getArray("channel.email").getArray();
        String[] sms               = (String[]) rs.getArray("channel.Sms").getArray();
        String[] facebookMessenger = (String[]) rs.getArray("channel.facebookMessenger").getArray();
        String[] zalo              = (String[]) rs.getArray("channel.zalo").getArray();
        String[] twitterMessenger  = (String[]) rs.getArray("channel.twitterMessenger").getArray();
        String[] slackMessenger    = (String[]) rs.getArray("channel.slackMessenger").getArray();
        String[] viberMessenger    = (String[]) rs.getArray("channel.viberMessenger").getArray();
        String[] skypeMessenger    = (String[]) rs.getArray("channel.skypeMessenger").getArray();
        String[] line              = (String[]) rs.getArray("channel.line").getArray();
        String[] discord           = (String[]) rs.getArray("channel.discord").getArray();
        String[] singalPrivateMessenger = (String[]) rs.getArray("channel.singalPrivateMessenger").getArray();
        String[] telegramMessenger =(String[])  rs.getArray("channel.telegramMessenger").getArray();
        String[] whatappsMessages  = (String[]) rs.getArray("channel.whatappsMessages").getArray();
        String[] linkedinMessages  = (String[]) rs.getArray("channel.linkedinMessages").getArray();
        String[] facebookAds       = (String[]) rs.getArray("channel.facebookAds").getArray();
        String[] googleAds         = (String[]) rs.getArray("channel.googleAds").getArray();
        Channel channel          = new Channel(pushNotification,email,sms,facebookMessenger,zalo,twitterMessenger,slackMessenger,viberMessenger,skypeMessenger,line,discord,singalPrivateMessenger,telegramMessenger,whatappsMessages,linkedinMessages,facebookAds,googleAds);
        return new Campaign(id,name,app_id,segment_id,state_of_funel,date_added,status,expired_time,channel);
    }
}
