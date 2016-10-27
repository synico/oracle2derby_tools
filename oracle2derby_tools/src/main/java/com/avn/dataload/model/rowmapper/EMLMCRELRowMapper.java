package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLMCREL;

public class EMLMCRELRowMapper<T> implements RowMapper<EMLMCREL> {

    private static final Logger log = Logger.getLogger(EMLMCRELRowMapper.class);

	@Override
	public EMLMCREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLMCREL obj = new EMLMCREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setEMLMSG_ID(rs.getBigDecimal("EMLMSG_ID"));
		obj.setEMLCONTENT_ID(rs.getBigDecimal("EMLCONTENT_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
