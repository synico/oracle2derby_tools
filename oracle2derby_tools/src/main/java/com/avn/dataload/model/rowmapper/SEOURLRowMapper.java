package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOURL;

public class SEOURLRowMapper<T> implements RowMapper<SEOURL> {

	@Override
	public SEOURL mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOURL obj = new SEOURL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		obj.setCHANGE_FREQUENCY(rs.getString("CHANGE_FREQUENCY"));
		obj.setMOBILE_PRIORITY(rs.getBigDecimal("MOBILE_PRIORITY"));
		obj.setMOBILE_CHG_FREQ(rs.getString("MOBILE_CHG_FREQ"));
		obj.setSEOURL_ID(rs.getBigDecimal("SEOURL_ID"));
		obj.setTOKENNAME(rs.getString("TOKENNAME"));
		obj.setTOKENVALUE(rs.getString("TOKENVALUE"));
		
		return obj;
	}

}
