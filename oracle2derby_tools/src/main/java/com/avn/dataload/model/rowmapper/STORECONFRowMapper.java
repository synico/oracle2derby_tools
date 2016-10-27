package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECONF;

public class STORECONFRowMapper<T> implements RowMapper<STORECONF> {

    private static final Logger log = Logger.getLogger(STORECONFRowMapper.class);

	@Override
	public STORECONF mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECONF obj = new STORECONF();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setVALUE(rs.getString("VALUE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
