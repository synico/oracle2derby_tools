package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xbomupload;

public class XbomuploadRowMapper<T> implements RowMapper<Xbomupload> {

	@Override
	public Xbomupload mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xbomupload obj = new Xbomupload();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setXbomuploadid(rs.getBigDecimal("XBOMUPLOADID"));
		obj.setRequisitionlistid(rs.getBigDecimal("REQUISITIONLISTID"));
		obj.setCreateddate(rs.getDate("CREATEDDATE"));
		obj.setUploadstatus(rs.getString("UPLOADSTATUS"));
		obj.setRowcounter(rs.getBigDecimal("ROWCOUNTER"));
		
		return obj;
	}

}
