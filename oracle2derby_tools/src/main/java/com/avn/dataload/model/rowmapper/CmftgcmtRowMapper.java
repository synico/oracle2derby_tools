package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmftgcmt;

public class CmftgcmtRowMapper<T> implements RowMapper<Cmftgcmt> {

	@Override
	public Cmftgcmt mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmftgcmt obj = new Cmftgcmt();
		
		obj.setCmftgcmtId(rs.getBigDecimal("CMFTGCMT_ID"));
		obj.setPosteddate(rs.getDate("POSTEDDATE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setComments(rs.getString("COMMENTS"));
		obj.setCmftaskgrpId(rs.getBigDecimal("CMFTASKGRP_ID"));
		
		return obj;
	}

}
