package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Calmethod;

public class CalmethodRowMapper<T> implements RowMapper<Calmethod> {

	@Override
	public Calmethod mapRow(ResultSet rs, int rowNum) throws SQLException {
		Calmethod obj = new Calmethod();
		
		obj.setName(rs.getString("NAME"));
		obj.setCalusageId(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setTaskname(rs.getString("TASKNAME"));
		obj.setSubclass(rs.getBigDecimal("SUBCLASS"));
		obj.setCalmethodId(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
