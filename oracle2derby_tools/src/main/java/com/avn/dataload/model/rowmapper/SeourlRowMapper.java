package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Seourl;

public class SeourlRowMapper<T> implements RowMapper<Seourl> {

	@Override
	public Seourl mapRow(ResultSet rs, int rowNum) throws SQLException {
		Seourl obj = new Seourl();
		
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setChangeFrequency(rs.getString("CHANGE_FREQUENCY"));
		obj.setMobilePriority(rs.getBigDecimal("MOBILE_PRIORITY"));
		obj.setMobileChgFreq(rs.getString("MOBILE_CHG_FREQ"));
		obj.setSeourlId(rs.getBigDecimal("SEOURL_ID"));
		obj.setTokenname(rs.getString("TOKENNAME"));
		obj.setTokenvalue(rs.getString("TOKENVALUE"));
		
		return obj;
	}

}
