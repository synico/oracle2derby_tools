package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Termcond;

public class TermcondRowMapper<T> implements RowMapper<Termcond> {

	@Override
	public Termcond mapRow(ResultSet rs, int rowNum) throws SQLException {
		Termcond obj = new Termcond();
		
		obj.setTradingId(rs.getBigDecimal("TRADING_ID"));
		obj.setMandatory(rs.getBigDecimal("MANDATORY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		obj.setTcsubtypeId(rs.getString("TCSUBTYPE_ID"));
		obj.setStringfield1(rs.getString("STRINGFIELD1"));
		obj.setStringfield2(rs.getString("STRINGFIELD2"));
		obj.setStringfield3(rs.getString("STRINGFIELD3"));
		obj.setIntegerfield1(rs.getBigDecimal("INTEGERFIELD1"));
		obj.setIntegerfield2(rs.getBigDecimal("INTEGERFIELD2"));
		obj.setIntegerfield3(rs.getBigDecimal("INTEGERFIELD3"));
		obj.setBigintfield1(rs.getBigDecimal("BIGINTFIELD1"));
		obj.setBigintfield2(rs.getBigDecimal("BIGINTFIELD2"));
		obj.setBigintfield3(rs.getBigDecimal("BIGINTFIELD3"));
		obj.setFloatfield1(rs.getBigDecimal("FLOATFIELD1"));
		obj.setFloatfield2(rs.getBigDecimal("FLOATFIELD2"));
		obj.setFloatfield3(rs.getBigDecimal("FLOATFIELD3"));
		obj.setDecimalfield3(rs.getBigDecimal("DECIMALFIELD3"));
		obj.setTermcondId(rs.getBigDecimal("TERMCOND_ID"));
		obj.setChangeable(rs.getBigDecimal("CHANGEABLE"));
		obj.setTimefield1(rs.getDate("TIMEFIELD1"));
		obj.setTimefield2(rs.getDate("TIMEFIELD2"));
		obj.setTimefield3(rs.getDate("TIMEFIELD3"));
		obj.setDecimalfield1(rs.getBigDecimal("DECIMALFIELD1"));
		obj.setDecimalfield2(rs.getBigDecimal("DECIMALFIELD2"));
		
		return obj;
	}

}
