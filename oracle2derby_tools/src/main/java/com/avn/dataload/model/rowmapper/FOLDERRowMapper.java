package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FOLDER;

public class FOLDERRowMapper<T> implements RowMapper<FOLDER> {

    private static final Logger log = Logger.getLogger(FOLDERRowMapper.class);

	@Override
	public FOLDER mapRow(ResultSet rs, int rowNum) throws SQLException {
		FOLDER obj = new FOLDER();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setPARENTFOLDER_ID(rs.getBigDecimal("PARENTFOLDER_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setFOLDER_ID(rs.getBigDecimal("FOLDER_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
