package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Uploadfile;

public class UploadfileRowMapper<T> implements RowMapper<Uploadfile> {

	@Override
	public Uploadfile mapRow(ResultSet rs, int rowNum) throws SQLException {
		Uploadfile obj = new Uploadfile();
		
		obj.setProperties(rs.getString("PROPERTIES"));
		obj.setFilesize(rs.getBigDecimal("FILESIZE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setUploadfileId(rs.getBigDecimal("UPLOADFILE_ID"));
		obj.setFileencoding(rs.getString("FILEENCODING"));
		obj.setFilecontent(rs.getbyte[]("FILECONTENT"));
		obj.setObjectid(rs.getString("OBJECTID"));
		obj.setUploadtype(rs.getString("UPLOADTYPE"));
		obj.setUploadtime(rs.getDate("UPLOADTIME"));
		obj.setFilepath(rs.getString("FILEPATH"));
		obj.setFilename(rs.getString("FILENAME"));
		
		return obj;
	}

}
