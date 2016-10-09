package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pattribute;

public class PattributeRowMapper<T> implements RowMapper<Pattribute> {

	@Override
	public Pattribute mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pattribute obj = new Pattribute();
		
		obj.setName(rs.getString("NAME"));
		obj.setAttrtypeId(rs.getString("ATTRTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setPattributeId(rs.getBigDecimal("PATTRIBUTE_ID"));
		obj.setAccessbeanname(rs.getString("ACCESSBEANNAME"));
		obj.setEncryptflag(rs.getBigDecimal("ENCRYPTFLAG"));
		
		return obj;
	}

}
