package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TCTYPE;

public class TCTYPERowMapper<T> implements RowMapper<TCTYPE> {

    private static final Logger log = Logger.getLogger(TCTYPERowMapper.class);

	@Override
	public TCTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		TCTYPE obj = new TCTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTCTYPE_ID(rs.getString("TCTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
