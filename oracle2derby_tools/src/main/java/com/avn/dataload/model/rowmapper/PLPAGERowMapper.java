package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLPAGE;

public class PLPAGERowMapper<T> implements RowMapper<PLPAGE> {

    private static final Logger log = Logger.getLogger(PLPAGERowMapper.class);

	@Override
	public PLPAGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLPAGE obj = new PLPAGE();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setPAGELAYOUTTYPE_ID(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setPLPAGE_ID(rs.getBigDecimal("PLPAGE_ID"));
		obj.setADMINNAME(rs.getString("ADMINNAME"));
		obj.setDELETABLE(rs.getBigDecimal("DELETABLE"));
		obj.setADMINNAMEEDITABLE(rs.getBigDecimal("ADMINNAMEEDITABLE"));
		obj.setURLCONFIGURABLE(rs.getBigDecimal("URLCONFIGURABLE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
