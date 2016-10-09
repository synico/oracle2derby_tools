package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ctxdata;

public class CtxdataRowMapper<T> implements RowMapper<Ctxdata> {

	@Override
	public Ctxdata mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ctxdata obj = new Ctxdata();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setServalue(rs.getString("SERVALUE"));
		
		return obj;
	}

}
