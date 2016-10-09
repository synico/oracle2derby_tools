package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pllocation;

public class PllocationRowMapper<T> implements RowMapper<Pllocation> {

	@Override
	public Pllocation mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pllocation obj = new Pllocation();
		
		obj.setDmactivityId(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPagelayoutId(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setPllocationId(rs.getBigDecimal("PLLOCATION_ID"));
		obj.setGroupnumber(rs.getBigDecimal("GROUPNUMBER"));
		
		return obj;
	}

}
