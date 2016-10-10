package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STGMERTAB;

public class STGMERTABRowMapper<T> implements RowMapper<STGMERTAB> {

	@Override
	public STGMERTAB mapRow(ResultSet rs, int rowNum) throws SQLException {
		STGMERTAB obj = new STGMERTAB();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUPDATABLE_UK_COL(rs.getString("UPDATABLE_UK_COL"));
		obj.setTABNBR(rs.getBigDecimal("TABNBR"));
		obj.setTABNAME(rs.getString("TABNAME"));
		
		return obj;
	}

}
