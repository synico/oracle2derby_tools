package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEXPTYPE;

public class DMEXPTYPERowMapper<T> implements RowMapper<DMEXPTYPE> {

    private static final Logger log = Logger.getLogger(DMEXPTYPERowMapper.class);

	@Override
	public DMEXPTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEXPTYPE obj = new DMEXPTYPE();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setDMEXPTYPE_ID(rs.getBigDecimal("DMEXPTYPE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
