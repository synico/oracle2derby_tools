package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLMCREL;

public class EMLMCRELRowMapper<T> implements RowMapper<EMLMCREL> {

	@Override
	public EMLMCREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLMCREL obj = new EMLMCREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setEMLCONTENT_ID(rs.getBigDecimal("EMLCONTENT_ID"));
		obj.setEMLMSG_ID(rs.getBigDecimal("EMLMSG_ID"));
		
		return obj;
	}

}
