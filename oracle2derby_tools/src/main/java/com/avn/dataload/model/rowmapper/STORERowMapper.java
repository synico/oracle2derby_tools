package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORE;

public class STORERowMapper<T> implements RowMapper<STORE> {

    private static final Logger log = Logger.getLogger(STORERowMapper.class);

	@Override
	public STORE mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORE obj = new STORE();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setOID(rs.getString("OID"));
		obj.setSTORELEVEL(rs.getString("STORELEVEL"));
		obj.setDIRECTORY(rs.getString("DIRECTORY"));
		obj.setSTORETYPE(rs.getString("STORETYPE"));
		obj.setRMAGOODFOR(rs.getBigDecimal("RMAGOODFOR"));
		obj.setSTOREGRP_ID(rs.getBigDecimal("STOREGRP_ID"));
		obj.setSTORECGRY_ID(rs.getBigDecimal("STORECGRY_ID"));
		obj.setQUOTEGOODFOR(rs.getBigDecimal("QUOTEGOODFOR"));
		obj.setALLOCATIONGOODFOR(rs.getBigDecimal("ALLOCATIONGOODFOR"));
		obj.setMAXBOOFFSET(rs.getBigDecimal("MAXBOOFFSET"));
		obj.setREJECTEDORDEXPIRY(rs.getBigDecimal("REJECTEDORDEXPIRY"));
		obj.setFFMCSELECTIONFLAGS(rs.getBigDecimal("FFMCSELECTIONFLAGS"));
		obj.setBOPMPADFACTOR(rs.getBigDecimal("BOPMPADFACTOR"));
		obj.setRTNFFMCTR_ID(rs.getBigDecimal("RTNFFMCTR_ID"));
		obj.setDEFAULTBOOFFSET(rs.getBigDecimal("DEFAULTBOOFFSET"));
		obj.setPRICEREFFLAGS(rs.getBigDecimal("PRICEREFFLAGS"));
		obj.setAVSACCEPTCODES(rs.getString("AVSACCEPTCODES"));
		obj.setCRTDBYCNTR_ID(rs.getBigDecimal("CRTDBYCNTR_ID"));
		obj.setLASTUPDATESTATUS(rs.getTimestamp("LASTUPDATESTATUS"));
		obj.setALLOCATIONOFFSET(rs.getBigDecimal("ALLOCATIONOFFSET"));
		obj.setMAXFOOFFSET(rs.getBigDecimal("MAXFOOFFSET"));
		obj.setINVENTORYOPFLAG(rs.getBigDecimal("INVENTORYOPFLAG"));
		obj.setBLOCKINGACTIVE(rs.getBigDecimal("BLOCKINGACTIVE"));
		obj.setBLKEXTASYNCH(rs.getBigDecimal("BLKEXTASYNCH"));
		obj.setPERSISTENTSESSION(rs.getBigDecimal("PERSISTENTSESSION"));
		obj.setORDERHISTACTIVE(rs.getString("ORDERHISTACTIVE"));
		obj.setINVENTORYSYSTEM(rs.getBigDecimal("INVENTORYSYSTEM"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
