package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGETSLOT;

public class PLWIDGETSLOTRowMapper<T> implements RowMapper<PLWIDGETSLOT> {

	@Override
	public PLWIDGETSLOT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGETSLOT obj = new PLWIDGETSLOT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setPAGELAYOUT_ID(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setPLWIDGET_ID(rs.getBigDecimal("PLWIDGET_ID"));
		obj.setPLWIDGETSLOT_ID(rs.getBigDecimal("PLWIDGETSLOT_ID"));
		obj.setADMINNAME(rs.getString("ADMINNAME"));
		obj.setSLOTID(rs.getString("SLOTID"));
		obj.setSLOTTYPE(rs.getBigDecimal("SLOTTYPE"));
		
		return obj;
	}

}
