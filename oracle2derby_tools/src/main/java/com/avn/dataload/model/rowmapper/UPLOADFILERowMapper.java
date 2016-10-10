package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.UPLOADFILE;

public class UPLOADFILERowMapper<T> implements RowMapper<UPLOADFILE> {

	@Override
	public UPLOADFILE mapRow(ResultSet rs, int rowNum) throws SQLException {
		UPLOADFILE obj = new UPLOADFILE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setFILESIZE(rs.getBigDecimal("FILESIZE"));
		obj.setUPLOADFILE_ID(rs.getBigDecimal("UPLOADFILE_ID"));
		obj.setFILEENCODING(rs.getString("FILEENCODING"));
		obj.setFILECONTENT(rs.getBlob("FILECONTENT"));
		obj.setOBJECTID(rs.getString("OBJECTID"));
		obj.setUPLOADTYPE(rs.getString("UPLOADTYPE"));
		obj.setUPLOADTIME(rs.getTimestamp("UPLOADTIME"));
		obj.setFILEPATH(rs.getString("FILEPATH"));
		obj.setFILENAME(rs.getString("FILENAME"));
		
		return obj;
	}

}
