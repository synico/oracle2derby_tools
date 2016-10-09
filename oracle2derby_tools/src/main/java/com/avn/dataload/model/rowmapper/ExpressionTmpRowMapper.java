package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.ExpressionTmp;

public class ExpressionTmpRowMapper<T> implements RowMapper<ExpressionTmp> {

	@Override
	public ExpressionTmp mapRow(ResultSet rs, int rowNum) throws SQLException {
		ExpressionTmp obj = new ExpressionTmp();
		
		obj.setCatfilterId(rs.getBigDecimal("CATFILTER_ID"));
		obj.setExpressionId(rs.getBigDecimal("EXPRESSION_ID"));
		obj.setTradingId(rs.getBigDecimal("TRADING_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setQuery(rs.getString("QUERY"));
		
		return obj;
	}

}
