package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Folderitem;

public class FolderitemRowMapper<T> implements RowMapper<Folderitem> {

	@Override
	public Folderitem mapRow(ResultSet rs, int rowNum) throws SQLException {
		Folderitem obj = new Folderitem();
		
		obj.setFolderitemId(rs.getBigDecimal("FOLDERITEM_ID"));
		obj.setReferenceId(rs.getBigDecimal("REFERENCE_ID"));
		obj.setFolderitemtype(rs.getString("FOLDERITEMTYPE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setFolderId(rs.getBigDecimal("FOLDER_ID"));
		
		return obj;
	}

}
