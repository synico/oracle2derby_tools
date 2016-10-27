package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATENTRY;

public class CATENTRYRowMapper<T> implements RowMapper<CATENTRY> {

    private static final Logger log = Logger.getLogger(CATENTRYRowMapper.class);

	@Override
	public CATENTRY mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATENTRY obj = new CATENTRY();
		
		obj.setURL(rs.getString("URL"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setSTATE(rs.getString("STATE"));
		obj.setITEMSPC_ID(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setMFNAME(rs.getString("MFNAME"));
		obj.setONSPECIAL(rs.getBigDecimal("ONSPECIAL"));
		obj.setONAUCTION(rs.getBigDecimal("ONAUCTION"));
		obj.setFIELD5(rs.getString("FIELD5"));
		obj.setBUYABLE(rs.getBigDecimal("BUYABLE"));
		obj.setRANK(rs.getBigDecimal("RANK"));
		obj.setBASEITEM_ID(rs.getBigDecimal("BASEITEM_ID"));
		obj.setOID(rs.getString("OID"));
		obj.setPARTNUMBER(rs.getString("PARTNUMBER"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setAVAILABILITYDATE(rs.getTimestamp("AVAILABILITYDATE"));
		obj.setCATENTTYPE_ID(rs.getString("CATENTTYPE_ID"));
		obj.setMFPARTNUMBER(rs.getString("MFPARTNUMBER"));
		obj.setLASTORDERDATE(rs.getTimestamp("LASTORDERDATE"));
		obj.setENDOFSERVICEDATE(rs.getTimestamp("ENDOFSERVICEDATE"));
		obj.setDISCONTINUEDATE(rs.getTimestamp("DISCONTINUEDATE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
