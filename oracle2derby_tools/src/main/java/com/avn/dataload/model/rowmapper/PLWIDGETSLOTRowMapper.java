package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGETSLOT;

public class PLWIDGETSLOTRowMapper<T> implements RowMapper<PLWIDGETSLOT> {

    private static final Logger log = Logger.getLogger(PLWIDGETSLOTRowMapper.class);

	@Override
	public PLWIDGETSLOT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGETSLOT obj = new PLWIDGETSLOT();
		
		obj.setPAGELAYOUT_ID(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPLWIDGETSLOT_ID(rs.getBigDecimal("PLWIDGETSLOT_ID"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setADMINNAME(rs.getString("ADMINNAME"));
		obj.setSLOTID(rs.getString("SLOTID"));
		obj.setSLOTTYPE(rs.getBigDecimal("SLOTTYPE"));
		obj.setPLWIDGET_ID(rs.getBigDecimal("PLWIDGET_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
