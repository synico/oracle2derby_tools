package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Operator;

public class OperatorRowMapper<T> implements RowMapper<Operator> {

	@Override
	public Operator mapRow(ResultSet rs, int rowNum) throws SQLException {
		Operator obj = new Operator();
		
		obj.setOperatortype(rs.getString("OPERATORTYPE"));
		obj.setOperator(rs.getString("OPERATOR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOperatorId(rs.getBigDecimal("OPERATOR_ID"));
		
		return obj;
	}

}
