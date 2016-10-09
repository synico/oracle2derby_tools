package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cacheivl;

public class CacheivlRowMapper<T> implements RowMapper<Cacheivl> {

	@Override
	public Cacheivl mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cacheivl obj = new Cacheivl();
		
		obj.setTemplate(rs.getString("TEMPLATE"));
		obj.setDataid(rs.getString("DATAID"));
		obj.setInserttime(rs.getDate("INSERTTIME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
