package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PROFILE;

public class PROFILERowMapper<T> implements RowMapper<PROFILE> {

    private static final Logger log = Logger.getLogger(PROFILERowMapper.class);

	@Override
	public PROFILE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PROFILE obj = new PROFILE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setLOWPRIORITY(rs.getBigDecimal("LOWPRIORITY"));
		obj.setHIGHPRIORITY(rs.getBigDecimal("HIGHPRIORITY"));
		obj.setDEVICEFMT_ID(rs.getBigDecimal("DEVICEFMT_ID"));
		obj.setMSGTYPE_ID(rs.getBigDecimal("MSGTYPE_ID"));
		obj.setUSERSVIEW(rs.getString("USERSVIEW"));
		obj.setARCHIVEMSG(rs.getBigDecimal("ARCHIVEMSG"));
		obj.setTRANSPORT_ID(rs.getBigDecimal("TRANSPORT_ID"));
		obj.setPROFILE_ID(rs.getBigDecimal("PROFILE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
