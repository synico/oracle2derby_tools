package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Plcypasswd;

public class PlcypasswdRowMapper<T> implements RowMapper<Plcypasswd> {

	@Override
	public Plcypasswd mapRow(ResultSet rs, int rowNum) throws SQLException {
		Plcypasswd obj = new Plcypasswd();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPlcypasswdId(rs.getBigDecimal("PLCYPASSWD_ID"));
		obj.setMinpasswdlength(rs.getBigDecimal("MINPASSWDLENGTH"));
		obj.setMinalphabetic(rs.getBigDecimal("MINALPHABETIC"));
		obj.setMaxinstances(rs.getBigDecimal("MAXINSTANCES"));
		obj.setMaxconsecutivetype(rs.getBigDecimal("MAXCONSECUTIVETYPE"));
		obj.setMaxlifetime(rs.getBigDecimal("MAXLIFETIME"));
		obj.setMatchuserid(rs.getBigDecimal("MATCHUSERID"));
		obj.setReusepassword(rs.getBigDecimal("REUSEPASSWORD"));
		obj.setMinnumeric(rs.getBigDecimal("MINNUMERIC"));
		
		return obj;
	}

}
