package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Participnt;

public class ParticipntRowMapper<T> implements RowMapper<Participnt> {

	@Override
	public Participnt mapRow(ResultSet rs, int rowNum) throws SQLException {
		Participnt obj = new Participnt();
		
		obj.setTradingId(rs.getBigDecimal("TRADING_ID"));
		obj.setPartroleId(rs.getBigDecimal("PARTROLE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		obj.setParticipntId(rs.getBigDecimal("PARTICIPNT_ID"));
		obj.setInformation(rs.getString("INFORMATION"));
		obj.setTermcondId(rs.getBigDecimal("TERMCOND_ID"));
		
		return obj;
	}

}
