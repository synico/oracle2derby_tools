package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ECETMPT;

public class ECETMPTRowMapper<T> implements RowMapper<ECETMPT> {

    private static final Logger log = Logger.getLogger(ECETMPTRowMapper.class);

	@Override
	public ECETMPT mapRow(ResultSet rs, int rowNum) throws SQLException {
		ECETMPT obj = new ECETMPT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setECRFNBR(rs.getBigDecimal("ECRFNBR"));
		obj.setECDOCTYP(rs.getString("ECDOCTYP"));
		obj.setECDOCVER(rs.getString("ECDOCVER"));
		obj.setECRECTYP(rs.getString("ECRECTYP"));
		obj.setECRECVER(rs.getString("ECRECVER"));
		obj.setECCOMMANDNAME(rs.getString("ECCOMMANDNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
