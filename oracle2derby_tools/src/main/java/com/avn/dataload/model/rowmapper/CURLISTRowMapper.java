package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CURLIST;

public class CURLISTRowMapper<T> implements RowMapper<CURLIST> {

    private static final Logger log = Logger.getLogger(CURLISTRowMapper.class);

	@Override
	public CURLIST mapRow(ResultSet rs, int rowNum) throws SQLException {
		CURLIST obj = new CURLIST();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCURRSTR(rs.getString("CURRSTR"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
