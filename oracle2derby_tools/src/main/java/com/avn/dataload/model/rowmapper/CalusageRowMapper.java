package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Calusage;

public class CalusageRowMapper<T> implements RowMapper<Calusage> {

	@Override
	public Calusage mapRow(ResultSet rs, int rowNum) throws SQLException {
		Calusage obj = new Calusage();
		
		obj.setCalusageId(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setStreltypnamecfg(rs.getString("STRELTYPNAMECFG"));
		obj.setStreltypnamert(rs.getString("STRELTYPNAMERT"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
