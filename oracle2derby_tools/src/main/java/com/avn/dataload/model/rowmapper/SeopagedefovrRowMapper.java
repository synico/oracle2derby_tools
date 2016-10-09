package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Seopagedefovr;

public class SeopagedefovrRowMapper<T> implements RowMapper<Seopagedefovr> {

	@Override
	public Seopagedefovr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Seopagedefovr obj = new Seopagedefovr();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setObjectId(rs.getString("OBJECT_ID"));
		obj.setSeopagedefId(rs.getBigDecimal("SEOPAGEDEF_ID"));
		obj.setSeopagedefovrId(rs.getBigDecimal("SEOPAGEDEFOVR_ID"));
		obj.setApplyToChild(rs.getBigDecimal("APPLY_TO_CHILD"));
		obj.setObjecttype(rs.getString("OBJECTTYPE"));
		
		return obj;
	}

}
