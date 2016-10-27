package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SCHERRORLOG;

public class SCHERRORLOGRowMapper<T> implements RowMapper<SCHERRORLOG> {

    private static final Logger log = Logger.getLogger(SCHERRORLOGRowMapper.class);

	@Override
	public SCHERRORLOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		SCHERRORLOG obj = new SCHERRORLOG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSCSERROR(rs.getClob("SCSERROR"));
		obj.setSCSINSTREFNUM(rs.getBigDecimal("SCSINSTREFNUM"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
