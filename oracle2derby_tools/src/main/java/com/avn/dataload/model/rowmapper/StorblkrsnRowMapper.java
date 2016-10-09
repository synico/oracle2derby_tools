package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storblkrsn;

public class StorblkrsnRowMapper<T> implements RowMapper<Storblkrsn> {

	@Override
	public Storblkrsn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storblkrsn obj = new Storblkrsn();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setTklrgeneration(rs.getBigDecimal("TKLRGENERATION"));
		obj.setRespected(rs.getBigDecimal("RESPECTED"));
		
		return obj;
	}

}
