package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Edppayinst;

public class EdppayinstRowMapper<T> implements RowMapper<Edppayinst> {

	@Override
	public Edppayinst mapRow(ResultSet rs, int rowNum) throws SQLException {
		Edppayinst obj = new Edppayinst();
		
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setAmount(rs.getBigDecimal("AMOUNT"));
		obj.setPaymentsystem(rs.getString("PAYMENTSYSTEM"));
		obj.setPayconfiggroup(rs.getString("PAYCONFIGGROUP"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setEdppayinstId(rs.getBigDecimal("EDPPAYINST_ID"));
		obj.setBackendpiid(rs.getString("BACKENDPIID"));
		obj.setSequencenumber(rs.getBigDecimal("SEQUENCENUMBER"));
		obj.setHumaneditable(rs.getBigDecimal("HUMANEDITABLE"));
		obj.setSystemeditable(rs.getBigDecimal("SYSTEMEDITABLE"));
		obj.setRefundallowed(rs.getBigDecimal("REFUNDALLOWED"));
		obj.setPaymentrule(rs.getString("PAYMENTRULE"));
		obj.setPaymentmethod(rs.getString("PAYMENTMETHOD"));
		obj.setEdporderId(rs.getBigDecimal("EDPORDER_ID"));
		obj.setMaxamount(rs.getBigDecimal("MAXAMOUNT"));
		obj.setMinamount(rs.getBigDecimal("MINAMOUNT"));
		obj.setDeprecated(rs.getBigDecimal("DEPRECATED"));
		obj.setDirty(rs.getBigDecimal("DIRTY"));
		obj.setPending(rs.getBigDecimal("PENDING"));
		obj.setPolicyId(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
