package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMELEMENTNVP;

public class DMELEMENTNVPRowMapper<T> implements RowMapper<DMELEMENTNVP> {

	@Override
	public DMELEMENTNVP mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMELEMENTNVP obj = new DMELEMENTNVP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setDMELEMENT_ID(rs.getBigDecimal("DMELEMENT_ID"));
		obj.setTRIGGERMATCH(rs.getBigDecimal("TRIGGERMATCH"));
		
		return obj;
	}

}
