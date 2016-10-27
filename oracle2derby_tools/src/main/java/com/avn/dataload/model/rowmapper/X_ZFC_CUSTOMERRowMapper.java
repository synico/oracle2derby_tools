package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_ZFC_CUSTOMER;

public class X_ZFC_CUSTOMERRowMapper<T> implements RowMapper<X_ZFC_CUSTOMER> {

    private static final Logger log = Logger.getLogger(X_ZFC_CUSTOMERRowMapper.class);

	@Override
	public X_ZFC_CUSTOMER mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_ZFC_CUSTOMER obj = new X_ZFC_CUSTOMER();
		
		obj.setCONSIGNMENT(rs.getString("CONSIGNMENT"));
		obj.setVMI(rs.getString("VMI"));
		obj.setWERKS(rs.getString("WERKS"));
		obj.setMANDT(rs.getString("MANDT"));
		obj.setZZFPA(rs.getString("ZZFPA"));
		obj.setVKORG(rs.getString("VKORG"));
		obj.setVTWEG(rs.getString("VTWEG"));
		obj.setERZEIT(rs.getTimestamp("ERZEIT"));
		obj.setFCPERIOD(rs.getString("FCPERIOD"));
		obj.setNET(rs.getString("NET"));
		obj.setNET_QOH(rs.getString("NET_QOH"));
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
