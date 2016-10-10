package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PROCMSGVW;

public class PROCMSGVWRowMapper<T> implements RowMapper<PROCMSGVW> {

	@Override
	public PROCMSGVW mapRow(ResultSet rs, int rowNum) throws SQLException {
		PROCMSGVW obj = new PROCMSGVW();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setPROCPROTCL_ID(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setMSGNAME(rs.getString("MSGNAME"));
		obj.setERRORVIEW(rs.getString("ERRORVIEW"));
		obj.setVIEWNAME(rs.getString("VIEWNAME"));
		
		return obj;
	}

}
