package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xform;

public class XformRowMapper<T> implements RowMapper<Xform> {

	@Override
	public Xform mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xform obj = new Xform();
		
		obj.setCreateDt(rs.getDate("CREATE_DT"));
		obj.setFormId(rs.getBigDecimal("FORM_ID"));
		obj.setFormNm(rs.getString("FORM_NM"));
		obj.setFormTypeCd(rs.getString("FORM_TYPE_CD"));
		
		return obj;
	}

}
