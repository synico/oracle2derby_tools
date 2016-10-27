package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.COLLTYPE;

public class COLLTYPERowMapper<T> implements RowMapper<COLLTYPE> {

    private static final Logger log = Logger.getLogger(COLLTYPERowMapper.class);

	@Override
	public COLLTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		COLLTYPE obj = new COLLTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setCOLLTYPE_ID(rs.getBigDecimal("COLLTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
