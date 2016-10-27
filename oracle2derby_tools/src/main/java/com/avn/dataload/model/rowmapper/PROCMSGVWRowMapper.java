package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PROCMSGVW;

public class PROCMSGVWRowMapper<T> implements RowMapper<PROCMSGVW> {

    private static final Logger log = Logger.getLogger(PROCMSGVWRowMapper.class);

	@Override
	public PROCMSGVW mapRow(ResultSet rs, int rowNum) throws SQLException {
		PROCMSGVW obj = new PROCMSGVW();
		
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPROCPROTCL_ID(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setVIEWNAME(rs.getString("VIEWNAME"));
		obj.setMSGNAME(rs.getString("MSGNAME"));
		obj.setERRORVIEW(rs.getString("ERRORVIEW"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
