package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Trdtype;

public class TrdtypeRowMapper<T> implements RowMapper<Trdtype> {

	@Override
	public Trdtype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trdtype obj = new Trdtype();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTrdtypeId(rs.getBigDecimal("TRDTYPE_ID"));
		
		return obj;
	}

}
