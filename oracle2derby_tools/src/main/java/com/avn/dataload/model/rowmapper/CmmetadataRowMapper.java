package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmmetadata;

public class CmmetadataRowMapper<T> implements RowMapper<Cmmetadata> {

	@Override
	public Cmmetadata mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmmetadata obj = new Cmmetadata();
		
		obj.setWorkspace(rs.getString("WORKSPACE"));
		obj.setTaskgrp(rs.getString("TASKGRP"));
		obj.setTask(rs.getString("TASK"));
		obj.setCmresmgrId(rs.getBigDecimal("CMRESMGR_ID"));
		obj.setBokey1(rs.getBigDecimal("BOKEY1"));
		obj.setBokey2(rs.getBigDecimal("BOKEY2"));
		obj.setBokey3(rs.getBigDecimal("BOKEY3"));
		obj.setBokey4(rs.getBigDecimal("BOKEY4"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setAction(rs.getString("ACTION"));
		obj.setCmcontainerId(rs.getBigDecimal("CMCONTAINER_ID"));
		obj.setCmtimestamp(rs.getDate("CMTIMESTAMP"));
		
		return obj;
	}

}
