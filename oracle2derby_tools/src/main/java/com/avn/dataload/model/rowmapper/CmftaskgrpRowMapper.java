package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmftaskgrp;

public class CmftaskgrpRowMapper<T> implements RowMapper<Cmftaskgrp> {

	@Override
	public Cmftaskgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmftaskgrp obj = new Cmftaskgrp();
		
		obj.setDuedate(rs.getDate("DUEDATE"));
		obj.setCommitdate(rs.getDate("COMMITDATE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setTemplatetype(rs.getBigDecimal("TEMPLATETYPE"));
		obj.setCmftaskgrpId(rs.getBigDecimal("CMFTASKGRP_ID"));
		obj.setApprovedate(rs.getDate("APPROVEDATE"));
		obj.setPromotiondate(rs.getDate("PROMOTIONDATE"));
		obj.setPersistentype(rs.getBigDecimal("PERSISTENTYPE"));
		obj.setQuickpublishtype(rs.getBigDecimal("QUICKPUBLISHTYPE"));
		
		return obj;
	}

}
