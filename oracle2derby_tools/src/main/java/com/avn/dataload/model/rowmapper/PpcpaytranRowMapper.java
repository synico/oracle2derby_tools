package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ppcpaytran;

public class PpcpaytranRowMapper<T> implements RowMapper<Ppcpaytran> {

	@Override
	public Ppcpaytran mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ppcpaytran obj = new Ppcpaytran();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		obj.setPpcpaytranId(rs.getBigDecimal("PPCPAYTRAN_ID"));
		obj.setPpcpaymentId(rs.getBigDecimal("PPCPAYMENT_ID"));
		obj.setPpccreditId(rs.getBigDecimal("PPCCREDIT_ID"));
		obj.setTransactiontype(rs.getBigDecimal("TRANSACTIONTYPE"));
		obj.setRequestedamount(rs.getBigDecimal("REQUESTEDAMOUNT"));
		obj.setProcessedamount(rs.getBigDecimal("PROCESSEDAMOUNT"));
		obj.setResponsecode(rs.getString("RESPONSECODE"));
		obj.setReferencenumber(rs.getString("REFERENCENUMBER"));
		obj.setTrackingid(rs.getString("TRACKINGID"));
		obj.setReasoncode(rs.getString("REASONCODE"));
		obj.setPpcbatchId(rs.getBigDecimal("PPCBATCH_ID"));
		
		return obj;
	}

}
