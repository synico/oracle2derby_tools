package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Schstatus;

public class SchstatusRowMapper<T> implements RowMapper<Schstatus> {

	@Override
	public Schstatus mapRow(ResultSet rs, int rowNum) throws SQLException {
		Schstatus obj = new Schstatus();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setScsinstrefnum(rs.getBigDecimal("SCSINSTREFNUM"));
		obj.setScsactlstart(rs.getDate("SCSACTLSTART"));
		obj.setScsinstrecov(rs.getBigDecimal("SCSINSTRECOV"));
		obj.setScsprefstart(rs.getDate("SCSPREFSTART"));
		obj.setScssequence(rs.getBigDecimal("SCSSEQUENCE"));
		obj.setScsjobnbr(rs.getBigDecimal("SCSJOBNBR"));
		obj.setScsattleft(rs.getBigDecimal("SCSATTLEFT"));
		obj.setScsend(rs.getDate("SCSEND"));
		obj.setScsqueue(rs.getString("SCSQUEUE"));
		obj.setScsresult(rs.getString("SCSRESULT"));
		obj.setScsstate(rs.getString("SCSSTATE"));
		
		return obj;
	}

}
