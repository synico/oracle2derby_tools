package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Setcurr;

public class SetcurrRowMapper<T> implements RowMapper<Setcurr> {

	@Override
	public Setcurr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Setcurr obj = new Setcurr();
		
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSetccode(rs.getBigDecimal("SETCCODE"));
		obj.setSetcexp(rs.getBigDecimal("SETCEXP"));
		obj.setSetcnote(rs.getString("SETCNOTE"));
		
		return obj;
	}

}
