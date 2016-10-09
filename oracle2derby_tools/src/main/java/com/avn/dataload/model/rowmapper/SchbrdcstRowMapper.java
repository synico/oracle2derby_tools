package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Schbrdcst;

public class SchbrdcstRowMapper<T> implements RowMapper<Schbrdcst> {

	@Override
	public Schbrdcst mapRow(ResultSet rs, int rowNum) throws SQLException {
		Schbrdcst obj = new Schbrdcst();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPrefstarttime(rs.getDate("PREFSTARTTIME"));
		obj.setActlstarttime(rs.getDate("ACTLSTARTTIME"));
		obj.setExceptioncode(rs.getString("EXCEPTIONCODE"));
		obj.setEndtime(rs.getDate("ENDTIME"));
		obj.setJobstate(rs.getString("JOBSTATE"));
		obj.setResult(rs.getString("RESULT"));
		
		return obj;
	}

}
