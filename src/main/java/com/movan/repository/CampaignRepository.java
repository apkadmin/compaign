package com.movan.repository;


import com.movan.mapper.CampaignMapper;
import com.movan.modal.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.yandex.clickhouse.except.ClickHouseException;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author annguyen
 */

@Repository
@Transactional
public class CampaignRepository extends JdbcDaoSupport {

    @Autowired
    public CampaignRepository(DataSource dataSource){
        this.setDataSource(dataSource);
    }

    public List<Campaign> getAll(){
        String sql = CampaignMapper.Base_SQL;
        CampaignMapper mapper = new CampaignMapper();
        Object[] params = new Object[]{};
        List<Campaign> campaigns =  this.getJdbcTemplate().query(sql,params,mapper);
      return campaigns;
    }

    public Campaign getById(String id){
        String sql = CampaignMapper.Base_SQL + " WHERE id = ?";
        CampaignMapper mapper = new CampaignMapper();
        Object[] params = new Object[]{id};
        try {
            Campaign campaign = this.getJdbcTemplate().queryForObject(sql, params, mapper);
            return campaign;
        }catch(EmptyResultDataAccessException e){
            return null;
        }
    }

    public String newCampaign(Campaign campaign){

        String sql = "INSERT INTO Campaign(id,name,app_id,segment_id,status,state_of_funel,date_added,expired_time";
        String Value = " VALUES(?,?,?,?,?,?,?,?";
        ArrayList<Object> params = new ArrayList<>();
        Collections.addAll(params,campaign.getId(),campaign.getName(),campaign.getApp_id(),campaign.getSegment_id(),campaign.getStatus(),campaign.getState_of_funel(),campaign.getDate_added(),campaign.getExpired_time());
        if(!isNull(campaign.getChannel().getPushNotification())){
            sql+=",channel.pushNotification";
            Value+=",?";
            params.add(campaign.getChannel().getPushNotification());
        }

        if(!isNull(campaign.getChannel().getEmail())){
            sql+=",channel.email";
            Value+=",?";
            params.add(campaign.getChannel().getEmail());
        }

        if(!isNull(campaign.getChannel().getSms())){
            sql+=",channel.Sms";
            Value+=",?";
            params.add(campaign.getChannel().getSms());
        }

        if(!isNull(campaign.getChannel().getFacebookMessenger())){
            sql+=",channel.facebookMessenger";
            Value+=",?";
            params.add(campaign.getChannel().getFacebookMessenger());
        }

        if(!isNull(campaign.getChannel().getZalo())){
            sql+=",channel.zalo";
            Value+=",?";
            params.add(campaign.getChannel().getZalo());
        }

        if(!isNull(campaign.getChannel().getTwitterMessenger())){
            sql+=",channel.twitterMessenger";
            Value+=",?";
            params.add(campaign.getChannel().getTwitterMessenger());
        }

        if(!isNull(campaign.getChannel().getSlackMessenger())){
            sql+=",channel.slackMessenger";
            Value+=",?";
            params.add(campaign.getChannel().getSlackMessenger());
        }

        if(!isNull(campaign.getChannel().getSkypeMessenger())){
            sql+=",channel.skypeMessenger";
            Value+=",?";
            params.add(campaign.getChannel().getSkypeMessenger());
        }

        if(!isNull(campaign.getChannel().getLine())){
            sql+=",channel.line";
            Value+=",?";
            params.add(campaign.getChannel().getLine());
        }

        if(!isNull(campaign.getChannel().getDiscord())){
            sql+=",channel.discord";
            Value+=",?";
            params.add(campaign.getChannel().getDiscord());
        }

        if(!isNull(campaign.getChannel().getSingalPrivate())){
            sql+=",channel.singalPrivateMessenger";
            Value+=",?";
            params.add(campaign.getChannel().getSingalPrivate());
        }

        if(!isNull(campaign.getChannel().getTelegramMessenger())){
            sql+=",channel.telegramMessenger";
            Value+=",?";
            params.add(campaign.getChannel().getTelegramMessenger());
        }

        if(!isNull(campaign.getChannel().getWhatappsMessages())){
            sql+=",channel.whatappsMessages";
            Value+=",?";
            params.add(campaign.getChannel().getWhatappsMessages());
        }

        if(!isNull(campaign.getChannel().getLinkedinMessages())){
            sql+=",channel.linkedinMessages";
            Value+=",?";
            params.add(campaign.getChannel().getLinkedinMessages());
        }

        if(!isNull(campaign.getChannel().getFacebookAds())){
            sql+=",channel.facebookAds";
            Value+=",?";
            params.add(campaign.getChannel().getFacebookAds());
        }

        if(!isNull(campaign.getChannel().getGoogleAds())){
            sql+=",channel.googleAds";
            Value+=",?";
            params.add(campaign.getChannel().getGoogleAds());
        }

        sql+=")"+ Value+")";
        try{
          int id = this.getJdbcTemplate().update(sql,params.toArray());
          return "accept";
          } catch(UncategorizedSQLException ex){
            return "error";
        }
    }
    private <T> Boolean isNull(T[] array){
        if(array != null && array.length > 0){
            return false;
        }
        return true;
    }
}
