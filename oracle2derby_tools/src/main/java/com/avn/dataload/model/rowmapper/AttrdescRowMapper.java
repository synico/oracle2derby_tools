package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Attrdesc;

public class AttrdescRowMapper<T> implements RowMapper<Attrdesc> {

	@Override
	public Attrdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attrdesc obj = new Attrdesc();
		
		obj.setName(rs.getString("NAME"));
		obj.setDescription2(rs.getString("DESCRIPTION2"));
		obj.setAttrtypeId(rs.getString("ATTRTYPE_ID"));
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setNoteinfo(rs.getString("NOTEINFO"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setGroupname(rs.getString("GROUPNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
