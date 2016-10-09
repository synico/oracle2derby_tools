package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acplgpsubs;

public class AcplgpsubsRowMapper<T> implements RowMapper<Acplgpsubs> {

	@Override
	public Acplgpsubs mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acplgpsubs obj = new Acplgpsubs();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
