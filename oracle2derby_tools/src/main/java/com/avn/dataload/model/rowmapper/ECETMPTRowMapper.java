package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ECETMPT;

public class ECETMPTRowMapper<T> implements RowMapper<ECETMPT> {

	@Override
	public ECETMPT mapRow(ResultSet rs, int rowNum) throws SQLException {
		ECETMPT obj = new ECETMPT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setECCOMMANDNAME(rs.getString("ECCOMMANDNAME"));
		obj.setECRFNBR(rs.getBigDecimal("ECRFNBR"));
		obj.setECDOCTYP(rs.getString("ECDOCTYP"));
		obj.setECDOCVER(rs.getString("ECDOCVER"));
		obj.setECRECTYP(rs.getString("ECRECTYP"));
		obj.setECRECVER(rs.getString("ECRECVER"));
		
		return obj;
	}

}
