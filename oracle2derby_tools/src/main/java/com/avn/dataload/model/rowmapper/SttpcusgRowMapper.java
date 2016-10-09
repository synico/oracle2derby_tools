package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Sttpcusg;

public class SttpcusgRowMapper<T> implements RowMapper<Sttpcusg> {

	@Override
	public Sttpcusg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Sttpcusg obj = new Sttpcusg();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setSttpcusgId(rs.getBigDecimal("STTPCUSG_ID"));
		
		return obj;
	}

}
