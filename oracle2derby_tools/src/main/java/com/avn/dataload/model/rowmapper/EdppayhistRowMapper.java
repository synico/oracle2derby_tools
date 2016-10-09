package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Edppayhist;

public class EdppayhistRowMapper<T> implements RowMapper<Edppayhist> {

	@Override
	public Edppayhist mapRow(ResultSet rs, int rowNum) throws SQLException {
		Edppayhist obj = new Edppayhist();
		
		obj.setAmount(rs.getBigDecimal("AMOUNT"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setEdppayinstId(rs.getBigDecimal("EDPPAYINST_ID"));
		obj.setBackendpaymentid(rs.getString("BACKENDPAYMENTID"));
		obj.setEdppayhistId(rs.getBigDecimal("EDPPAYHIST_ID"));
		obj.setHisttimestamp(rs.getDate("HISTTIMESTAMP"));
		obj.setOperationname(rs.getString("OPERATIONNAME"));
		obj.setOperationresult(rs.getString("OPERATIONRESULT"));
		obj.setReadablestatus(rs.getString("READABLESTATUS"));
		obj.setBackendpiid(rs.getString("BACKENDPIID"));
		obj.setOrderId(rs.getBigDecimal("ORDER_ID"));
		obj.setRmaId(rs.getBigDecimal("RMA_ID"));
		obj.setRecordtype(rs.getString("RECORDTYPE"));
		obj.setAccount(rs.getString("ACCOUNT"));
		
		return obj;
	}

}
