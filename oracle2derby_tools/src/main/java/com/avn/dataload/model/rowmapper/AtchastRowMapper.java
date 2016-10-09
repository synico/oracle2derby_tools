package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Atchast;

public class AtchastRowMapper<T> implements RowMapper<Atchast> {

	@Override
	public Atchast mapRow(ResultSet rs, int rowNum) throws SQLException {
		Atchast obj = new Atchast();
		
		obj.setAtchastpath(rs.getString("ATCHASTPATH"));
		obj.setDirectorypath(rs.getString("DIRECTORYPATH"));
		obj.setMimetypeencoding(rs.getString("MIMETYPEENCODING"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAtchastId(rs.getBigDecimal("ATCHAST_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setAtchtgtId(rs.getBigDecimal("ATCHTGT_ID"));
		obj.setMimetype(rs.getString("MIMETYPE"));
		obj.setImage1(rs.getString("IMAGE1"));
		obj.setImage2(rs.getString("IMAGE2"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		
		return obj;
	}

}
