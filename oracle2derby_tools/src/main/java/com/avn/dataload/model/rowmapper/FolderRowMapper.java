package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Folder;

public class FolderRowMapper<T> implements RowMapper<Folder> {

	@Override
	public Folder mapRow(ResultSet rs, int rowNum) throws SQLException {
		Folder obj = new Folder();
		
		obj.setParentfolderId(rs.getBigDecimal("PARENTFOLDER_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setType(rs.getString("TYPE"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setFolderId(rs.getBigDecimal("FOLDER_ID"));
		
		return obj;
	}

}
