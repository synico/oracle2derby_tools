package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acresatrel;

public class AcresatrelRowMapper<T> implements RowMapper<Acresatrel> {

	@Override
	public Acresatrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acresatrel obj = new Acresatrel();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setAttrtblname(rs.getString("ATTRTBLNAME"));
		obj.setAttrcolname(rs.getString("ATTRCOLNAME"));
		obj.setReskeycolname(rs.getString("RESKEYCOLNAME"));
		
		return obj;
	}

}
