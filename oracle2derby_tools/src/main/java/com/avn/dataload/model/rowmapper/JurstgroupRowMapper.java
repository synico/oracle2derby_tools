package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Jurstgroup;

public class JurstgroupRowMapper<T> implements RowMapper<Jurstgroup> {

	@Override
	public Jurstgroup mapRow(ResultSet rs, int rowNum) throws SQLException {
		Jurstgroup obj = new Jurstgroup();
		
		obj.setCode(rs.getString("CODE"));
		obj.setSubclass(rs.getBigDecimal("SUBCLASS"));
		obj.setJurstgroupId(rs.getBigDecimal("JURSTGROUP_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
