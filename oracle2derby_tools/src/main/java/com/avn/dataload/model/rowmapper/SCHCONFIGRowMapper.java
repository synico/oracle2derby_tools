package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SCHCONFIG;

public class SCHCONFIGRowMapper<T> implements RowMapper<SCHCONFIG> {

    private static final Logger log = Logger.getLogger(SCHCONFIGRowMapper.class);

	@Override
	public SCHCONFIG mapRow(ResultSet rs, int rowNum) throws SQLException {
		SCHCONFIG obj = new SCHCONFIG();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setINTERFACENAME(rs.getString("INTERFACENAME"));
		obj.setSCCHOST(rs.getString("SCCHOST"));
		obj.setSCCRECATT(rs.getBigDecimal("SCCRECATT"));
		obj.setSCCQUERY(rs.getString("SCCQUERY"));
		obj.setSCCSTART(rs.getTimestamp("SCCSTART"));
		obj.setSCCACTIVE(rs.getString("SCCACTIVE"));
		obj.setSCCAPPTYPE(rs.getString("SCCAPPTYPE"));
		obj.setSCCJOBREFNUM(rs.getBigDecimal("SCCJOBREFNUM"));
		obj.setSCCRECDELAY(rs.getBigDecimal("SCCRECDELAY"));
		obj.setSCCPATHINFO(rs.getString("SCCPATHINFO"));
		obj.setSCCINTERVAL(rs.getBigDecimal("SCCINTERVAL"));
		obj.setSCCPRIORITY(rs.getBigDecimal("SCCPRIORITY"));
		obj.setSCCSEQUENCE(rs.getBigDecimal("SCCSEQUENCE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
