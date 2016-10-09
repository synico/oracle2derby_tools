package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flowdesc;

public class FlowdescRowMapper<T> implements RowMapper<Flowdesc> {

	@Override
	public Flowdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flowdesc obj = new Flowdesc();
		
		obj.setLongdescription(rs.getString("LONGDESCRIPTION"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
