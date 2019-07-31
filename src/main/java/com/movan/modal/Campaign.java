package com.movan.modal;

import java.util.Date;
import java.util.UUID;

public class Campaign {
    private String id 				= UUID.randomUUID().toString();
    private String name 			= null;
    private String app_id  			= null;
    private String segment_id  		= null;
    private String state_of_funel   = null;
    private Date date_added         = new Date();
    private int status 				= 0;
    private Date expired_time   	= new Date();
    private Channel channel         = null;

    public Campaign() {
    }

    public Campaign(String id, String name, String app_id, String segment_id, String state_of_funel, Date date_added, int status, Date expired_time, Channel channel) {
        this.id = id;
        this.name = name;
        this.app_id = app_id;
        this.segment_id = segment_id;
        this.state_of_funel = state_of_funel;
        this.date_added = date_added;
        this.status = status;
        this.expired_time = expired_time;
        this.channel = channel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getSegment_id() {
        return segment_id;
    }

    public void setSegment_id(String segment_id) {
        this.segment_id = segment_id;
    }

    public String getState_of_funel() {
        return state_of_funel;
    }

    public void setState_of_funel(String state_of_funel) {
        this.state_of_funel = state_of_funel;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getExpired_time() {
        return expired_time;
    }

    public void setExpired_time(String Date) {
        this.expired_time = expired_time;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", app_id='" + app_id + '\'' +
                ", segment_id='" + segment_id + '\'' +
                ", state_of_funel='" + state_of_funel + '\'' +
                ", date_added=" + date_added +
                ", status=" + status +
                ", expired_time=" + expired_time +
                ", channel=" + channel.toString() +
                '}';
    }
}
