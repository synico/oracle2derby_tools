package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flstaterel;

public class FlstaterelRowMapper<T> implements RowMapper<Flstaterel> {

	@Override
	public Flstaterel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flstaterel obj = new Flstaterel();
		
		obj.setEntryactninterface(rs.getString("ENTRYACTNINTERFACE"));
		obj.setExitactninterface(rs.getString("EXITACTNINTERFACE"));
		obj.setResponseviewname(rs.getString("RESPONSEVIEWNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
