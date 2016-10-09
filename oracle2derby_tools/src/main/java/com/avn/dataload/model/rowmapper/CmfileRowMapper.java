package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmfile;

public class CmfileRowMapper<T> implements RowMapper<Cmfile> {

	@Override
	public Cmfile mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmfile obj = new Cmfile();
		
		obj.setPublished(rs.getBigDecimal("PUBLISHED"));
		obj.setUploadTimestamp(rs.getDate("UPLOAD_TIMESTAMP"));
		obj.setPromoteTimestamp(rs.getDate("PROMOTE_TIMESTAMP"));
		obj.setStorageType(rs.getBigDecimal("STORAGE_TYPE"));
		obj.setCmfileId(rs.getBigDecimal("CMFILE_ID"));
		obj.setCmfilepath(rs.getString("CMFILEPATH"));
		obj.setPromoteFs(rs.getBigDecimal("PROMOTE_FS"));
		obj.setAssociated(rs.getBigDecimal("ASSOCIATED"));
		obj.setFilesize(rs.getBigDecimal("FILESIZE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCmfiledirId(rs.getBigDecimal("CMFILEDIR_ID"));
		
		return obj;
	}

}
