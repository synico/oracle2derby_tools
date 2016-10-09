package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XSapSalesdocItem;

public class XSapSalesdocItemRowMapper<T> implements RowMapper<XSapSalesdocItem> {

	@Override
	public XSapSalesdocItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSapSalesdocItem obj = new XSapSalesdocItem();
		
		obj.setVbapPstyv(rs.getString("VBAP_PSTYV"));
		obj.setVbapWerks(rs.getString("VBAP_WERKS"));
		obj.setVbapKdmat(rs.getString("VBAP_KDMAT"));
		obj.setVbapMatnr(rs.getString("VBAP_MATNR"));
		obj.setVbapKwmeng(rs.getBigDecimal("VBAP_KWMENG"));
		obj.setMaraMfrnr(rs.getString("MARA_MFRNR"));
		obj.setZzDatwsta(rs.getDate("ZZ_DATWSTA"));
		obj.setVbapZzCblk(rs.getString("VBAP_ZZ_CBLK"));
		obj.setUpdatedFlag(rs.getString("UPDATED_FLAG"));
		obj.setVbsttAbstaBez(rs.getString("VBSTT_ABSTA_BEZ"));
		obj.setLipsdGLfimg(rs.getBigDecimal("LIPSD_GLFIMG"));
		
		return obj;
	}

}
