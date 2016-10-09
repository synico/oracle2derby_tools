package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Expression;

public class ExpressionRowMapper<T> implements RowMapper<Expression> {

	@Override
	public Expression mapRow(ResultSet rs, int rowNum) throws SQLException {
		Expression obj = new Expression();
		
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
