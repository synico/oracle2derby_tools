package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Seoredirect;

public class SeoredirectRowMapper<T> implements RowMapper<Seoredirect> {

	@Override
	public Seoredirect mapRow(ResultSet rs, int rowNum) throws SQLException {
		Seoredirect obj = new Seoredirect();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSeoredirectId(rs.getBigDecimal("SEOREDIRECT_ID"));
		obj.setSeourlkwdIdNew(rs.getBigDecimal("SEOURLKWD_ID_NEW"));
		obj.setSeourlkwdIdOrig(rs.getBigDecimal("SEOURLKWD_ID_ORIG"));
		
		return obj;
	}

}
