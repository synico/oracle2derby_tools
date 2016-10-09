package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Srchattr;

public class SrchattrRowMapper<T> implements RowMapper<Srchattr> {

	@Override
	public Srchattr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Srchattr obj = new Srchattr();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setIndexscope(rs.getString("INDEXSCOPE"));
		obj.setIndextype(rs.getString("INDEXTYPE"));
		obj.setSrchattrId(rs.getBigDecimal("SRCHATTR_ID"));
		
		return obj;
	}

}
