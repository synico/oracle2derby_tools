package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_SAP_SALESDOC_ITEM;

public class X_SAP_SALESDOC_ITEMRowMapper<T> implements RowMapper<X_SAP_SALESDOC_ITEM> {

    private static final Logger log = Logger.getLogger(X_SAP_SALESDOC_ITEMRowMapper.class);

	@Override
	public X_SAP_SALESDOC_ITEM mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_SAP_SALESDOC_ITEM obj = new X_SAP_SALESDOC_ITEM();
		
		obj.setVBAK_VBELN(rs.getString("VBAK_VBELN"));
		obj.setVBAP_POSNR(rs.getString("VBAP_POSNR"));
		obj.setVBAP_PSTYV(rs.getString("VBAP_PSTYV"));
		obj.setVBAP_WERKS(rs.getString("VBAP_WERKS"));
		obj.setVBAP_KDMAT(rs.getString("VBAP_KDMAT"));
		obj.setVBAP_MATNR(rs.getString("VBAP_MATNR"));
		obj.setMARA_MFRNR(rs.getString("MARA_MFRNR"));
		obj.setZZ_DATWSTA(rs.getTimestamp("ZZ_DATWSTA"));
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		obj.setVBAP_KWMENG(rs.getBigDecimal("VBAP_KWMENG"));
		obj.setVBSTT_ABSTA_BEZ(rs.getString("VBSTT_ABSTA_BEZ"));
		obj.setLIPSD_G_LFIMG(rs.getBigDecimal("LIPSD_G_LFIMG"));
		obj.setVBAP_ZZ_CBLK(rs.getString("VBAP_ZZ_CBLK"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
