package com.movan.repository;


import com.movan.mapper.CampaignMapper;
import com.movan.modal.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
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
}
