package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlusrrecv;

public class EmlusrrecvRowMapper<T> implements RowMapper<Emlusrrecv> {

	@Override
	public Emlusrrecv mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlusrrecv obj = new Emlusrrecv();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setReceiveeml(rs.getBigDecimal("RECEIVEEML"));
		obj.setReceivesms(rs.getBigDecimal("RECEIVESMS"));
		
		return obj;
	}

}
