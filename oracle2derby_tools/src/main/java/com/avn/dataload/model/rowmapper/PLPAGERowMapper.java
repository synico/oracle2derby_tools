package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLPAGE;

public class PLPAGERowMapper<T> implements RowMapper<PLPAGE> {

	@Override
	public PLPAGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLPAGE obj = new PLPAGE();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setPAGELAYOUTTYPE_ID(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setADMINNAMEEDITABLE(rs.getBigDecimal("ADMINNAMEEDITABLE"));
		obj.setURLCONFIGURABLE(rs.getBigDecimal("URLCONFIGURABLE"));
		obj.setPLPAGE_ID(rs.getBigDecimal("PLPAGE_ID"));
		obj.setADMINNAME(rs.getString("ADMINNAME"));
		obj.setDELETABLE(rs.getBigDecimal("DELETABLE"));
		
		return obj;
	}

}
