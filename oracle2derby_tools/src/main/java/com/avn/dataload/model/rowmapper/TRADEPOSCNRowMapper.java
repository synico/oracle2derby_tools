package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TRADEPOSCN;

public class TRADEPOSCNRowMapper<T> implements RowMapper<TRADEPOSCN> {

    private static final Logger log = Logger.getLogger(TRADEPOSCNRowMapper.class);

	@Override
	public TRADEPOSCN mapRow(ResultSet rs, int rowNum) throws SQLException {
		TRADEPOSCN obj = new TRADEPOSCN();
		
		obj.setTYPE(rs.getString("TYPE"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setFLAGS(rs.getBigDecimal("FLAGS"));
		obj.setPRECEDENCE(rs.getBigDecimal("PRECEDENCE"));
		obj.setTRADEPOSCN_ID(rs.getBigDecimal("TRADEPOSCN_ID"));
		obj.setPRODUCTSET_ID(rs.getBigDecimal("PRODUCTSET_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
