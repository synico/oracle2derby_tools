package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHTGTDSC;

public class ATCHTGTDSCRowMapper<T> implements RowMapper<ATCHTGTDSC> {

	@Override
	public ATCHTGTDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHTGTDSC obj = new ATCHTGTDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setATCHTGT_ID(rs.getBigDecimal("ATCHTGT_ID"));
		obj.setSHORTDESCRIPTION(rs.getString("SHORTDESCRIPTION"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setATCHTGTDSC_ID(rs.getBigDecimal("ATCHTGTDSC_ID"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
