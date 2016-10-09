package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ppcpayment;

public class PpcpaymentRowMapper<T> implements RowMapper<Ppcpayment> {

	@Override
	public Ppcpayment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ppcpayment obj = new Ppcpayment();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		obj.setPpcpayinstId(rs.getBigDecimal("PPCPAYINST_ID"));
		obj.setPpcpaytranId(rs.getBigDecimal("PPCPAYTRAN_ID"));
		obj.setApprovingamount(rs.getBigDecimal("APPROVINGAMOUNT"));
		obj.setApprovedamount(rs.getBigDecimal("APPROVEDAMOUNT"));
		obj.setCreditingamount(rs.getBigDecimal("CREDITINGAMOUNT"));
		obj.setCreditedamount(rs.getBigDecimal("CREDITEDAMOUNT"));
		obj.setDepositingamount(rs.getBigDecimal("DEPOSITINGAMOUNT"));
		obj.setDepositedamount(rs.getBigDecimal("DEPOSITEDAMOUNT"));
		obj.setRvrsngaprvedamnt(rs.getBigDecimal("RVRSNGAPRVEDAMNT"));
		obj.setRvrsngdpstedamnt(rs.getBigDecimal("RVRSNGDPSTEDAMNT"));
		obj.setRvrsngcrdtedamnt(rs.getBigDecimal("RVRSNGCRDTEDAMNT"));
		obj.setPpcpaymentId(rs.getBigDecimal("PPCPAYMENT_ID"));
		obj.setAvscommoncode(rs.getBigDecimal("AVSCOMMONCODE"));
		obj.setExpectedamount(rs.getBigDecimal("EXPECTEDAMOUNT"));
		obj.setTimeexpired(rs.getDate("TIMEEXPIRED"));
		
		return obj;
	}

}
