package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emlstrplcy;

public class EmlstrplcyRowMapper<T> implements RowMapper<Emlstrplcy> {

	@Override
	public Emlstrplcy mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emlstrplcy obj = new Emlstrplcy();
		
		obj.setEmlpolicyId(rs.getBigDecimal("EMLPOLICY_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		
		return obj;
	}

}
