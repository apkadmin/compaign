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
        String pushNotification  = rs.getString("channel.pushNotification");
        String email             = rs.getString("channel.email");
        String sms               = rs.getString("channel.Sms");
        String facebookMessenger = rs.getString("channel.facebookMessenger");
        String zalo              = rs.getString("channel.zalo");
        String twitterMessenger  = rs.getString("channel.twitterMessenger");
        String slackMessenger    = rs.getString("channel.slackMessenger");
        String viberMessenger    = rs.getString("channel.viberMessenger");
        String skypeMessenger    = rs.getString("channel.skypeMessenger");
        String line              = rs.getString("channel.line");
        String discord           = rs.getString("channel.discord");
        String singal            = rs.getString("channel.singalPrivateMessenger");
        String telegramMessenger = rs.getString("channel.telegramMessenger");
        String whatappsMessages  = rs.getString("channel.whatappsMessages");
        String linkedinMessages  = rs.getString("channel.linkedinMessages");
        String facebookAds       = rs.getString("channel.facebookAds");
        String googleAds         = rs.getString("channel.googleAds");
        Channel channel          = new Channel(pushNotification,email,sms,facebookMessenger,zalo,twitterMessenger,slackMessenger,viberMessenger,skypeMessenger,line,discord,singal,telegramMessenger,whatappsMessages,linkedinMessages,facebookAds,googleAds);
        return new Campaign(id,name,app_id,segment_id,state_of_funel,date_added,status,expired_time,channel);
    }
}
