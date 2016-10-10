package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EDPPAYINST;

public class EDPPAYINSTRowMapper<T> implements RowMapper<EDPPAYINST> {

	@Override
	public EDPPAYINST mapRow(ResultSet rs, int rowNum) throws SQLException {
		EDPPAYINST obj = new EDPPAYINST();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setAMOUNT(rs.getBigDecimal("AMOUNT"));
		obj.setEDPPAYINST_ID(rs.getBigDecimal("EDPPAYINST_ID"));
		obj.setEDPORDER_ID(rs.getBigDecimal("EDPORDER_ID"));
		obj.setBACKENDPIID(rs.getString("BACKENDPIID"));
		obj.setSEQUENCENUMBER(rs.getBigDecimal("SEQUENCENUMBER"));
		obj.setHUMANEDITABLE(rs.getBigDecimal("HUMANEDITABLE"));
		obj.setSYSTEMEDITABLE(rs.getBigDecimal("SYSTEMEDITABLE"));
		obj.setREFUNDALLOWED(rs.getBigDecimal("REFUNDALLOWED"));
		obj.setPAYMENTRULE(rs.getString("PAYMENTRULE"));
		obj.setPAYMENTMETHOD(rs.getString("PAYMENTMETHOD"));
		obj.setPAYMENTSYSTEM(rs.getString("PAYMENTSYSTEM"));
		obj.setPAYCONFIGGROUP(rs.getString("PAYCONFIGGROUP"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		obj.setMAXAMOUNT(rs.getBigDecimal("MAXAMOUNT"));
		obj.setMINAMOUNT(rs.getBigDecimal("MINAMOUNT"));
		obj.setDEPRECATED(rs.getBigDecimal("DEPRECATED"));
		obj.setDIRTY(rs.getBigDecimal("DIRTY"));
		obj.setPENDING(rs.getBigDecimal("PENDING"));
		obj.setPOLICY_ID(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
