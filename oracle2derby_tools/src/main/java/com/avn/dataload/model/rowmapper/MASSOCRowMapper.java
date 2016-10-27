package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MASSOC;

public class MASSOCRowMapper<T> implements RowMapper<MASSOC> {

    private static final Logger log = Logger.getLogger(MASSOCRowMapper.class);

	@Override
	public MASSOC mapRow(ResultSet rs, int rowNum) throws SQLException {
		MASSOC obj = new MASSOC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setOID(rs.getString("OID"));
		obj.setMASSOC_ID(rs.getString("MASSOC_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
