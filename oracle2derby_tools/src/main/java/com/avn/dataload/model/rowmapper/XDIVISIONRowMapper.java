package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XDIVISION;

public class XDIVISIONRowMapper<T> implements RowMapper<XDIVISION> {

	@Override
	public XDIVISION mapRow(ResultSet rs, int rowNum) throws SQLException {
		XDIVISION obj = new XDIVISION();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setDIVISIONCODE(rs.getString("DIVISIONCODE"));
		obj.setERPNAME(rs.getString("ERPNAME"));
		obj.setREGIONNAME(rs.getString("REGIONNAME"));
		obj.setCARTTYPE(rs.getString("CARTTYPE"));
		obj.setCARTTYPE_DESC(rs.getString("CARTTYPE_DESC"));
		obj.setDEFAULT_CURRENCY(rs.getString("DEFAULT_CURRENCY"));
		
		return obj;
	}

}
