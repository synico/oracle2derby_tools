package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PVCDEVSPEC;

public class PVCDEVSPECRowMapper<T> implements RowMapper<PVCDEVSPEC> {

    private static final Logger log = Logger.getLogger(PVCDEVSPECRowMapper.class);

	@Override
	public PVCDEVSPEC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PVCDEVSPEC obj = new PVCDEVSPEC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSESSIONTYPE(rs.getString("SESSIONTYPE"));
		obj.setMAXCONTENTLENGTH(rs.getBigDecimal("MAXCONTENTLENGTH"));
		obj.setMAXURLLENGTH(rs.getBigDecimal("MAXURLLENGTH"));
		obj.setLCDMONOCHROME(rs.getString("LCDMONOCHROME"));
		obj.setIMAGEFORMAT(rs.getString("IMAGEFORMAT"));
		obj.setSOUNDFORMAT(rs.getString("SOUNDFORMAT"));
		obj.setDOCUMENTFORMAT(rs.getString("DOCUMENTFORMAT"));
		obj.setDOCUMENTVERSION(rs.getString("DOCUMENTVERSION"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setSPEC_ID(rs.getBigDecimal("SPEC_ID"));
		obj.setSPECNAME(rs.getString("SPECNAME"));
		obj.setLCDWIDTH(rs.getBigDecimal("LCDWIDTH"));
		obj.setLCDHEIGHT(rs.getBigDecimal("LCDHEIGHT"));
		obj.setLCDCOLORS(rs.getBigDecimal("LCDCOLORS"));
		obj.setCONTENTDIR(rs.getString("CONTENTDIR"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
