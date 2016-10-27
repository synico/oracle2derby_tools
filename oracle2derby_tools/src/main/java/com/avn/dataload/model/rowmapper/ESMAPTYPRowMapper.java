package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ESMAPTYP;

public class ESMAPTYPRowMapper<T> implements RowMapper<ESMAPTYP> {

    private static final Logger log = Logger.getLogger(ESMAPTYPRowMapper.class);

	@Override
	public ESMAPTYP mapRow(ResultSet rs, int rowNum) throws SQLException {
		ESMAPTYP obj = new ESMAPTYP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setESMAPTYP_ID(rs.getBigDecimal("ESMAPTYP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
