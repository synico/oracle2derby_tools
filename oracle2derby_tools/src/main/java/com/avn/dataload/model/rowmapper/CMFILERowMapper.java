package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFILE;

public class CMFILERowMapper<T> implements RowMapper<CMFILE> {

	@Override
	public CMFILE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFILE obj = new CMFILE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPUBLISHED(rs.getBigDecimal("PUBLISHED"));
		obj.setCMFILE_ID(rs.getBigDecimal("CMFILE_ID"));
		obj.setCMFILEPATH(rs.getString("CMFILEPATH"));
		obj.setPROMOTE_FS(rs.getBigDecimal("PROMOTE_FS"));
		obj.setASSOCIATED(rs.getBigDecimal("ASSOCIATED"));
		obj.setFILESIZE(rs.getBigDecimal("FILESIZE"));
		obj.setUPLOAD_TIMESTAMP(rs.getTimestamp("UPLOAD_TIMESTAMP"));
		obj.setPROMOTE_TIMESTAMP(rs.getTimestamp("PROMOTE_TIMESTAMP"));
		obj.setSTORAGE_TYPE(rs.getBigDecimal("STORAGE_TYPE"));
		obj.setCMFILEDIR_ID(rs.getBigDecimal("CMFILEDIR_ID"));
		
		return obj;
	}

}
