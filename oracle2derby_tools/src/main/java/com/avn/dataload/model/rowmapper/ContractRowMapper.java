package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Contract;

public class ContractRowMapper<T> implements RowMapper<Contract> {

	@Override
	public Contract mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contract obj = new Contract();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setName(rs.getString("NAME"));
		obj.setContractId(rs.getBigDecimal("CONTRACT_ID"));
		obj.setUsage(rs.getBigDecimal("USAGE"));
		obj.setOrigin(rs.getBigDecimal("ORIGIN"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setComments(rs.getString("COMMENTS"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTimecreated(rs.getDate("TIMECREATED"));
		obj.setTimeupdated(rs.getDate("TIMEUPDATED"));
		obj.setTimeapproved(rs.getDate("TIMEAPPROVED"));
		obj.setTimeactivated(rs.getDate("TIMEACTIVATED"));
		obj.setFamilyId(rs.getBigDecimal("FAMILY_ID"));
		obj.setMajorversion(rs.getBigDecimal("MAJORVERSION"));
		obj.setMinorversion(rs.getBigDecimal("MINORVERSION"));
		obj.setTimedeployed(rs.getDate("TIMEDEPLOYED"));
		
		return obj;
	}

}
