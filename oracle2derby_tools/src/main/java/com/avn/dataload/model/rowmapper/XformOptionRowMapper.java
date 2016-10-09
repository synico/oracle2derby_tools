package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformOption;

public class XformOptionRowMapper<T> implements RowMapper<XformOption> {

	@Override
	public XformOption mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformOption obj = new XformOption();
		
		obj.setSortOrderNo(rs.getBigDecimal("SORT_ORDER_NO"));
		obj.setDependentQuestionSetId(rs.getBigDecimal("DEPENDENT_QUESTION_SET_ID"));
		
		return obj;
	}

}
