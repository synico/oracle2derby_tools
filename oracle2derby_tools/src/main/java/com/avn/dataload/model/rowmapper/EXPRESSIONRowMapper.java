package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EXPRESSION;

public class EXPRESSIONRowMapper<T> implements RowMapper<EXPRESSION> {

	@Override
	public EXPRESSION mapRow(ResultSet rs, int rowNum) throws SQLException {
		EXPRESSION obj = new EXPRESSION();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setEXPRESSION_ID(rs.getBigDecimal("EXPRESSION_ID"));
		obj.setQUERY(rs.getString("QUERY"));
		
		return obj;
	}

}
