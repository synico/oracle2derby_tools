package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SCHERRORLOG;

public class SCHERRORLOGRowMapper<T> implements RowMapper<SCHERRORLOG> {

	@Override
	public SCHERRORLOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		SCHERRORLOG obj = new SCHERRORLOG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSCSINSTREFNUM(rs.getBigDecimal("SCSINSTREFNUM"));
		obj.setSCSERROR(rs.getClob("SCSERROR"));
		
		return obj;
	}

}
