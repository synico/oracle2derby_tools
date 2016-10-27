package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EXPRESSION;

public class EXPRESSIONRowMapper<T> implements RowMapper<EXPRESSION> {

    private static final Logger log = Logger.getLogger(EXPRESSIONRowMapper.class);

	@Override
	public EXPRESSION mapRow(ResultSet rs, int rowNum) throws SQLException {
		EXPRESSION obj = new EXPRESSION();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		obj.setQUERY(rs.getString("QUERY"));
		obj.setEXPRESSION_ID(rs.getBigDecimal("EXPRESSION_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
