package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mbrattr;

public class MbrattrRowMapper<T> implements RowMapper<Mbrattr> {

	@Override
	public Mbrattr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mbrattr obj = new Mbrattr();
		
		obj.setName(rs.getString("NAME"));
		obj.setAttrtypeId(rs.getString("ATTRTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setMbrattrId(rs.getBigDecimal("MBRATTR_ID"));
		
		return obj;
	}

}
