package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PVCDEVSPEC;

public class PVCDEVSPECRowMapper<T> implements RowMapper<PVCDEVSPEC> {

	@Override
	public PVCDEVSPEC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PVCDEVSPEC obj = new PVCDEVSPEC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setSESSIONTYPE(rs.getString("SESSIONTYPE"));
		obj.setMAXCONTENTLENGTH(rs.getBigDecimal("MAXCONTENTLENGTH"));
		obj.setMAXURLLENGTH(rs.getBigDecimal("MAXURLLENGTH"));
		obj.setLCDMONOCHROME(rs.getString("LCDMONOCHROME"));
		obj.setSPEC_ID(rs.getBigDecimal("SPEC_ID"));
		obj.setSPECNAME(rs.getString("SPECNAME"));
		obj.setLCDWIDTH(rs.getBigDecimal("LCDWIDTH"));
		obj.setLCDHEIGHT(rs.getBigDecimal("LCDHEIGHT"));
		obj.setLCDCOLORS(rs.getBigDecimal("LCDCOLORS"));
		obj.setCONTENTDIR(rs.getString("CONTENTDIR"));
		obj.setIMAGEFORMAT(rs.getString("IMAGEFORMAT"));
		obj.setSOUNDFORMAT(rs.getString("SOUNDFORMAT"));
		obj.setDOCUMENTFORMAT(rs.getString("DOCUMENTFORMAT"));
		obj.setDOCUMENTVERSION(rs.getString("DOCUMENTVERSION"));
		
		return obj;
	}

}
