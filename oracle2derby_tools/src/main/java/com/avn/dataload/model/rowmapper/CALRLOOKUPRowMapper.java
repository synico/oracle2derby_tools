package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALRLOOKUP;

public class CALRLOOKUPRowMapper<T> implements RowMapper<CALRLOOKUP> {

    private static final Logger log = Logger.getLogger(CALRLOOKUPRowMapper.class);

	@Override
	public CALRLOOKUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALRLOOKUP obj = new CALRLOOKUP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setVALUE(rs.getBigDecimal("VALUE"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setCALRANGE_ID(rs.getBigDecimal("CALRANGE_ID"));
		obj.setCALRLOOKUP_ID(rs.getBigDecimal("CALRLOOKUP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
