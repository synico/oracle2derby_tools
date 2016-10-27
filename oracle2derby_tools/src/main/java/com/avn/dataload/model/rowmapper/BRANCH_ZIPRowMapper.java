package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BRANCH_ZIP;

public class BRANCH_ZIPRowMapper<T> implements RowMapper<BRANCH_ZIP> {

    private static final Logger log = Logger.getLogger(BRANCH_ZIPRowMapper.class);

	@Override
	public BRANCH_ZIP mapRow(ResultSet rs, int rowNum) throws SQLException {
		BRANCH_ZIP obj = new BRANCH_ZIP();
		
		obj.setBRANCH_ZIP_ID(rs.getBigDecimal("BRANCH_ZIP_ID"));
		obj.setLOW_POSTAL_CD(rs.getString("LOW_POSTAL_CD"));
		obj.setHIGH_POSTAL_CD(rs.getString("HIGH_POSTAL_CD"));
		obj.setSALES_OFFICE(rs.getString("SALES_OFFICE"));
		obj.setBRANCH_ID(rs.getString("BRANCH_ID"));
		obj.setCOUNTRY_CD(rs.getString("COUNTRY_CD"));
		obj.setDISPLAY_FL(rs.getString("DISPLAY_FL"));
		obj.setSALES_ORG(rs.getString("SALES_ORG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
