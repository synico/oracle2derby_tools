package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmftask;

public class CmftaskRowMapper<T> implements RowMapper<Cmftask> {

	@Override
	public Cmftask mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmftask obj = new Cmftask();
		
		obj.setUsage(rs.getBigDecimal("USAGE"));
		obj.setCmftaskId(rs.getBigDecimal("CMFTASK_ID"));
		obj.setDuedate(rs.getDate("DUEDATE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setType(rs.getBigDecimal("TYPE"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setCompletedate(rs.getDate("COMPLETEDATE"));
		obj.setTemplatetype(rs.getBigDecimal("TEMPLATETYPE"));
		
		return obj;
	}

}
