package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plcylckdsc;

public class PlcylckdscRowMapper<T> implements RowMapper<Plcylckdsc> {

	@Override
	public Plcylckdsc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plcylckdsc obj = new Plcylckdsc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
