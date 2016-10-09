package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Account;

public class AccountRowMapper<T> implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account obj = new Account();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setAccountId(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setComments(rs.getString("COMMENTS"));
		obj.setDefaultcontract(rs.getBigDecimal("DEFAULTCONTRACT"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		obj.setTimeapproved(rs.getDate("TIMEAPPROVED"));
		obj.setTimeactivated(rs.getDate("TIMEACTIVATED"));
		obj.setPrcplcypref(rs.getString("PRCPLCYPREF"));
		obj.setUseprcplcypref(rs.getBigDecimal("USEPRCPLCYPREF"));
		
		return obj;
	}

}
