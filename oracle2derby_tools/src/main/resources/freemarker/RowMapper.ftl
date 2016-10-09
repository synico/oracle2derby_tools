package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.${table_name};

public class ${table_name}RowMapper<T> implements RowMapper<${table_name}> {

	@Override
	public ${table_name} mapRow(ResultSet rs, int rowNum) throws SQLException {
		${table_name} obj = new ${table_name}();
		
		<#list rowMapper as item>
		${item};
		</#list>
		
		return obj;
	}

}
