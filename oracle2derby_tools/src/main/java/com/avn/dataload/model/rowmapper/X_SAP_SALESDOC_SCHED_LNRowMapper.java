package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_SAP_SALESDOC_SCHED_LN;

public class X_SAP_SALESDOC_SCHED_LNRowMapper<T> implements RowMapper<X_SAP_SALESDOC_SCHED_LN> {

    private static final Logger log = Logger.getLogger(X_SAP_SALESDOC_SCHED_LNRowMapper.class);

	@Override
	public X_SAP_SALESDOC_SCHED_LN mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_SAP_SALESDOC_SCHED_LN obj = new X_SAP_SALESDOC_SCHED_LN();
		
		obj.setVBAK_VBELN(rs.getString("VBAK_VBELN"));
		obj.setVBAP_POSNR(rs.getString("VBAP_POSNR"));
		obj.setVBEP_ETENR(rs.getString("VBEP_ETENR"));
		obj.setREQ_DATE(rs.getTimestamp("REQ_DATE"));
		obj.setATP_DATE(rs.getTimestamp("ATP_DATE"));
		obj.setVBEP_WMENG(rs.getBigDecimal("VBEP_WMENG"));
		obj.setVBEP_BMENG(rs.getBigDecimal("VBEP_BMENG"));
		obj.setU_ATP_QTY(rs.getBigDecimal("U_ATP_QTY"));
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		obj.setU_UNSHIPPED_QTY(rs.getBigDecimal("U_UNSHIPPED_QTY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
