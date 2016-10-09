package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmactivity;

public class DmactivityRowMapper<T> implements RowMapper<Dmactivity> {

	@Override
	public Dmactivity mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmactivity obj = new Dmactivity();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setName(rs.getString("NAME"));
		obj.setField4(rs.getString("FIELD4"));
		obj.setPublished(rs.getBigDecimal("PUBLISHED"));
		obj.setStartdate(rs.getDate("STARTDATE"));
		obj.setEnddate(rs.getDate("ENDDATE"));
		obj.setDmactivityId(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setDmcampaignId(rs.getBigDecimal("DMCAMPAIGN_ID"));
		obj.setDmacttypeId(rs.getBigDecimal("DMACTTYPE_ID"));
		obj.setDmtemplatetypeId(rs.getBigDecimal("DMTEMPLATETYPE_ID"));
		obj.setDmexptypeId(rs.getBigDecimal("DMEXPTYPE_ID"));
		obj.setLastupdatedby(rs.getString("LASTUPDATEDBY"));
		obj.setBehavior(rs.getBigDecimal("BEHAVIOR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setVersion(rs.getBigDecimal("VERSION"));
		obj.setRepeatable(rs.getBigDecimal("REPEATABLE"));
		obj.setCreated(rs.getDate("CREATED"));
		obj.setFlowxml(rs.getString("FLOWXML"));
		obj.setUidisplayable(rs.getBigDecimal("UIDISPLAYABLE"));
		obj.setManagingtool(rs.getBigDecimal("MANAGINGTOOL"));
		
		return obj;
	}

}
