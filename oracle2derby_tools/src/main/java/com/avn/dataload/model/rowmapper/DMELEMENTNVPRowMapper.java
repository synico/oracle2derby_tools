package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMELEMENTNVP;

public class DMELEMENTNVPRowMapper<T> implements RowMapper<DMELEMENTNVP> {

    private static final Logger log = Logger.getLogger(DMELEMENTNVPRowMapper.class);

	@Override
	public DMELEMENTNVP mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMELEMENTNVP obj = new DMELEMENTNVP();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setDMELEMENT_ID(rs.getBigDecimal("DMELEMENT_ID"));
		obj.setTRIGGERMATCH(rs.getBigDecimal("TRIGGERMATCH"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
