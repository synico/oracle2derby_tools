package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FOLDERITEM;

public class FOLDERITEMRowMapper<T> implements RowMapper<FOLDERITEM> {

	@Override
	public FOLDERITEM mapRow(ResultSet rs, int rowNum) throws SQLException {
		FOLDERITEM obj = new FOLDERITEM();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setFOLDER_ID(rs.getBigDecimal("FOLDER_ID"));
		obj.setFOLDERITEM_ID(rs.getBigDecimal("FOLDERITEM_ID"));
		obj.setREFERENCE_ID(rs.getBigDecimal("REFERENCE_ID"));
		obj.setFOLDERITEMTYPE(rs.getString("FOLDERITEMTYPE"));
		
		return obj;
	}

}
