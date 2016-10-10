package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREPLTYPES;

public class STOREPLTYPESRowMapper<T> implements RowMapper<STOREPLTYPES> {

	@Override
	public STOREPLTYPES mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREPLTYPES obj = new STOREPLTYPES();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setPAGELAYOUTTYPE_ID(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setVIEWNAME(rs.getString("VIEWNAME"));
		
		return obj;
	}

}
