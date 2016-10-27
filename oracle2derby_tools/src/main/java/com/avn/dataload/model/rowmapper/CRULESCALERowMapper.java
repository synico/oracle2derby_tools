package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CRULESCALE;

public class CRULESCALERowMapper<T> implements RowMapper<CRULESCALE> {

    private static final Logger log = Logger.getLogger(CRULESCALERowMapper.class);

	@Override
	public CRULESCALE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CRULESCALE obj = new CRULESCALE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCALRULE_ID(rs.getBigDecimal("CALRULE_ID"));
		obj.setCALSCALE_ID(rs.getBigDecimal("CALSCALE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
