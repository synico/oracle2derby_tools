package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STGSITETAB;

public class STGSITETABRowMapper<T> implements RowMapper<STGSITETAB> {

	@Override
	public STGSITETAB mapRow(ResultSet rs, int rowNum) throws SQLException {
		STGSITETAB obj = new STGSITETAB();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUPDATABLE_UK_COL(rs.getString("UPDATABLE_UK_COL"));
		obj.setTABNBR(rs.getBigDecimal("TABNBR"));
		obj.setTABNAME(rs.getString("TABNAME"));
		
		return obj;
	}

}
