package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FOLDER;

public class FOLDERRowMapper<T> implements RowMapper<FOLDER> {

	@Override
	public FOLDER mapRow(ResultSet rs, int rowNum) throws SQLException {
		FOLDER obj = new FOLDER();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setFOLDER_ID(rs.getBigDecimal("FOLDER_ID"));
		obj.setPARENTFOLDER_ID(rs.getBigDecimal("PARENTFOLDER_ID"));
		
		return obj;
	}

}
