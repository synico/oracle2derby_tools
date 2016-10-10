package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYPASSWD;

public class PLCYPASSWDRowMapper<T> implements RowMapper<PLCYPASSWD> {

	@Override
	public PLCYPASSWD mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYPASSWD obj = new PLCYPASSWD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPLCYPASSWD_ID(rs.getBigDecimal("PLCYPASSWD_ID"));
		obj.setMINPASSWDLENGTH(rs.getBigDecimal("MINPASSWDLENGTH"));
		obj.setMINALPHABETIC(rs.getBigDecimal("MINALPHABETIC"));
		obj.setMAXINSTANCES(rs.getBigDecimal("MAXINSTANCES"));
		obj.setMAXCONSECUTIVETYPE(rs.getBigDecimal("MAXCONSECUTIVETYPE"));
		obj.setMAXLIFETIME(rs.getBigDecimal("MAXLIFETIME"));
		obj.setMATCHUSERID(rs.getBigDecimal("MATCHUSERID"));
		obj.setREUSEPASSWORD(rs.getBigDecimal("REUSEPASSWORD"));
		obj.setMINNUMERIC(rs.getBigDecimal("MINNUMERIC"));
		
		return obj;
	}

}
