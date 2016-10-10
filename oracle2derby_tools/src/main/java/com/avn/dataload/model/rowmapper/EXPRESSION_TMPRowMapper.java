package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EXPRESSION_TMP;

public class EXPRESSION_TMPRowMapper<T> implements RowMapper<EXPRESSION_TMP> {

	@Override
	public EXPRESSION_TMP mapRow(ResultSet rs, int rowNum) throws SQLException {
		EXPRESSION_TMP obj = new EXPRESSION_TMP();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setCATFILTER_ID(rs.getBigDecimal("CATFILTER_ID"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setEXPRESSION_ID(rs.getBigDecimal("EXPRESSION_ID"));
		obj.setQUERY(rs.getClob("QUERY"));
		
		return obj;
	}

}
