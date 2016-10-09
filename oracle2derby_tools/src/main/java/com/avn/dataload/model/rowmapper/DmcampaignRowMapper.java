package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmcampaign;

public class DmcampaignRowMapper<T> implements RowMapper<Dmcampaign> {

	@Override
	public Dmcampaign mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmcampaign obj = new Dmcampaign();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setName(rs.getString("NAME"));
		obj.setOwner(rs.getString("OWNER"));
		obj.setField4(rs.getString("FIELD4"));
		obj.setStartdate(rs.getDate("STARTDATE"));
		obj.setEnddate(rs.getDate("ENDDATE"));
		obj.setDmcampaignId(rs.getBigDecimal("DMCAMPAIGN_ID"));
		obj.setLastupdatedby(rs.getString("LASTUPDATEDBY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setType(rs.getBigDecimal("TYPE"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setCreated(rs.getDate("CREATED"));
		obj.setSeason(rs.getString("SEASON"));
		obj.setObjective(rs.getString("OBJECTIVE"));
		
		return obj;
	}

}
