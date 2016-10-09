package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acrescgry;

public class AcrescgryRowMapper<T> implements RowMapper<Acrescgry> {

	@Override
	public Acrescgry mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acrescgry obj = new Acrescgry();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setResjoinkey(rs.getString("RESJOINKEY"));
		obj.setAcrescgryId(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setResprimarytable(rs.getString("RESPRIMARYTABLE"));
		obj.setResownertable(rs.getString("RESOWNERTABLE"));
		obj.setResownercol(rs.getString("RESOWNERCOL"));
		obj.setReskeyowncol(rs.getString("RESKEYOWNCOL"));
		obj.setResclassname(rs.getString("RESCLASSNAME"));
		
		return obj;
	}

}
