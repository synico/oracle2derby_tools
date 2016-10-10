package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EDPATMPAY;

public class EDPATMPAYRowMapper<T> implements RowMapper<EDPATMPAY> {

	@Override
	public EDPATMPAY mapRow(ResultSet rs, int rowNum) throws SQLException {
		EDPATMPAY obj = new EDPATMPAY();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setEDPATMPAY_ID(rs.getBigDecimal("EDPATMPAY_ID"));
		obj.setEDPPAYINST_ID(rs.getBigDecimal("EDPPAYINST_ID"));
		obj.setTOTALAMOUNT(rs.getBigDecimal("TOTALAMOUNT"));
		obj.setVALIDATIONAMOUNT(rs.getBigDecimal("VALIDATIONAMOUNT"));
		obj.setRESERVATIONAMOUNT(rs.getBigDecimal("RESERVATIONAMOUNT"));
		obj.setFINALIZATIONAMOUNT(rs.getBigDecimal("FINALIZATIONAMOUNT"));
		obj.setVALIDATINGAMOUNT(rs.getBigDecimal("VALIDATINGAMOUNT"));
		obj.setRESERVINGAMOUNT(rs.getBigDecimal("RESERVINGAMOUNT"));
		obj.setFINALIZINGAMOUNT(rs.getBigDecimal("FINALIZINGAMOUNT"));
		obj.setBACKENDPAYMENTID(rs.getString("BACKENDPAYMENTID"));
		
		return obj;
	}

}
