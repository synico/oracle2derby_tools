package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SETCURR;

public class SETCURRRowMapper<T> implements RowMapper<SETCURR> {

    private static final Logger log = Logger.getLogger(SETCURRRowMapper.class);

	@Override
	public SETCURR mapRow(ResultSet rs, int rowNum) throws SQLException {
		SETCURR obj = new SETCURR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setSETCCODE(rs.getBigDecimal("SETCCODE"));
		obj.setSETCEXP(rs.getBigDecimal("SETCEXP"));
		obj.setSETCNOTE(rs.getString("SETCNOTE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
