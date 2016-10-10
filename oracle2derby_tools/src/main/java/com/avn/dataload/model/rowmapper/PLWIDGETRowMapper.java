package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGET;

public class PLWIDGETRowMapper<T> implements RowMapper<PLWIDGET> {

	@Override
	public PLWIDGET mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGET obj = new PLWIDGET();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setPAGELAYOUT_ID(rs.getBigDecimal("PAGELAYOUT_ID"));
		obj.setPLWIDGETDEF_ID(rs.getBigDecimal("PLWIDGETDEF_ID"));
		obj.setPLWIDGET_ID(rs.getBigDecimal("PLWIDGET_ID"));
		obj.setADMINNAME(rs.getString("ADMINNAME"));
		obj.setSLOTID(rs.getString("SLOTID"));
		
		return obj;
	}

}
