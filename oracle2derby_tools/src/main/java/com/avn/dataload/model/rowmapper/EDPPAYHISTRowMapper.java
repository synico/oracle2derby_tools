package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EDPPAYHIST;

public class EDPPAYHISTRowMapper<T> implements RowMapper<EDPPAYHIST> {

    private static final Logger log = Logger.getLogger(EDPPAYHISTRowMapper.class);

	@Override
	public EDPPAYHIST mapRow(ResultSet rs, int rowNum) throws SQLException {
		EDPPAYHIST obj = new EDPPAYHIST();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setORDER_ID(rs.getBigDecimal("ORDER_ID"));
		obj.setRMA_ID(rs.getBigDecimal("RMA_ID"));
		obj.setRECORDTYPE(rs.getString("RECORDTYPE"));
		obj.setACCOUNT(rs.getString("ACCOUNT"));
		obj.setAMOUNT(rs.getBigDecimal("AMOUNT"));
		obj.setEDPPAYINST_ID(rs.getBigDecimal("EDPPAYINST_ID"));
		obj.setBACKENDPAYMENTID(rs.getString("BACKENDPAYMENTID"));
		obj.setEDPPAYHIST_ID(rs.getBigDecimal("EDPPAYHIST_ID"));
		obj.setHISTTIMESTAMP(rs.getTimestamp("HISTTIMESTAMP"));
		obj.setOPERATIONNAME(rs.getString("OPERATIONNAME"));
		obj.setOPERATIONRESULT(rs.getString("OPERATIONRESULT"));
		obj.setREADABLESTATUS(rs.getString("READABLESTATUS"));
		obj.setBACKENDPIID(rs.getString("BACKENDPIID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
