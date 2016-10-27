package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECENT;

public class STORECENTRowMapper<T> implements RowMapper<STORECENT> {

    private static final Logger log = Logger.getLogger(STORECENTRowMapper.class);

	@Override
	public STORECENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECENT obj = new STORECENT();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
