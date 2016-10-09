package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Creditline;

public class CreditlineRowMapper<T> implements RowMapper<Creditline> {

	@Override
	public Creditline mapRow(ResultSet rs, int rowNum) throws SQLException {
		Creditline obj = new Creditline();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAccountId(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		obj.setCreditlineId(rs.getBigDecimal("CREDITLINE_ID"));
		obj.setCreditlimit(rs.getBigDecimal("CREDITLIMIT"));
		obj.setDecimalfield1(rs.getBigDecimal("DECIMALFIELD1"));
		obj.setDecimalfield2(rs.getBigDecimal("DECIMALFIELD2"));
		
		return obj;
	}

}
