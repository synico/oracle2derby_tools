package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XCATENTRY;

public class XCATENTRYRowMapper<T> implements RowMapper<XCATENTRY> {

	@Override
	public XCATENTRY mapRow(ResultSet rs, int rowNum) throws SQLException {
		XCATENTRY obj = new XCATENTRY();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setDISPLAYABLE(rs.getString("DISPLAYABLE"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setFIELD5(rs.getString("FIELD5"));
		obj.setBUYABLE(rs.getString("BUYABLE"));
		obj.setSUPPLIERCODE(rs.getString("SUPPLIERCODE"));
		obj.setDIVISIONCODE(rs.getString("DIVISIONCODE"));
		obj.setAVNETPARTNUMBER(rs.getString("AVNETPARTNUMBER"));
		obj.setERPPARTNUMBER(rs.getString("ERPPARTNUMBER"));
		obj.setERP_TAXONOMY_LEVEL_1_NM(rs.getString("ERP_TAXONOMY_LEVEL_1_NM"));
		obj.setERP_TAXONOMY_LEVEL_2_NM(rs.getString("ERP_TAXONOMY_LEVEL_2_NM"));
		obj.setERP_TAXONOMY_LEVEL_3_NM(rs.getString("ERP_TAXONOMY_LEVEL_3_NM"));
		obj.setERP_TAXONOMY_LEVEL_4_NM(rs.getString("ERP_TAXONOMY_LEVEL_4_NM"));
		obj.setSAPMATGROUP(rs.getString("SAPMATGROUP"));
		obj.setMDMMATERIALNUMBER(rs.getString("MDMMATERIALNUMBER"));
		obj.setALLOCATIONFLAG(rs.getString("ALLOCATIONFLAG"));
		obj.setCUSTOMREELFLAG(rs.getString("CUSTOMREELFLAG"));
		obj.setDEFAULTPLANT(rs.getString("DEFAULTPLANT"));
		obj.setDESIGNWINFLAG(rs.getString("DESIGNWINFLAG"));
		obj.setDISPLAYPART(rs.getString("DISPLAYPART"));
		obj.setFIELD7(rs.getString("FIELD7"));
		obj.setMFCODE(rs.getString("MFCODE"));
		obj.setABC_CD_01(rs.getString("ABC_CD_01"));
		obj.setABC_CD_02(rs.getString("ABC_CD_02"));
		obj.setABC_CD_03(rs.getString("ABC_CD_03"));
		obj.setFIELD8(rs.getString("FIELD8"));
		obj.setACTIVEDATE(rs.getString("ACTIVEDATE"));
		obj.setECCNCODE(rs.getString("ECCNCODE"));
		obj.setENDOFLIFE(rs.getString("ENDOFLIFE"));
		obj.setHTSCODE(rs.getString("HTSCODE"));
		obj.setNCNRFLAG(rs.getString("NCNRFLAG"));
		obj.setSALESORG(rs.getString("SALESORG"));
		obj.setREDTAGFLAG(rs.getString("REDTAGFLAG"));
		obj.setWEBBUYABLE(rs.getString("WEBBUYABLE"));
		obj.setFIELD9(rs.getBigDecimal("FIELD9"));
		obj.setFIELD10(rs.getBigDecimal("FIELD10"));
		obj.setFIELD11(rs.getString("FIELD11"));
		obj.setFIELD12(rs.getString("FIELD12"));
		obj.setFIELD13(rs.getString("FIELD13"));
		obj.setDOWNLOADFLAG(rs.getString("DOWNLOADFLAG"));
		obj.setEXISTSINSAP(rs.getString("EXISTSINSAP"));
		obj.setISASOFTWAREFLAG(rs.getString("ISASOFTWAREFLAG"));
		obj.setMILITARYPRODUCTFLAG(rs.getString("MILITARYPRODUCTFLAG"));
		obj.setOBSOLETEDATE(rs.getString("OBSOLETEDATE"));
		obj.setOBSOLETEFLAG(rs.getString("OBSOLETEFLAG"));
		obj.setPACKAGETYPECODE(rs.getString("PACKAGETYPECODE"));
		obj.setROHSCOMPLIANCECODE(rs.getString("ROHSCOMPLIANCECODE"));
		obj.setSCHEDULABLEFLAG(rs.getString("SCHEDULABLEFLAG"));
		obj.setSCHEDULEBCODE(rs.getString("SCHEDULEBCODE"));
		obj.setSUPPLIERSTOCKFLAG(rs.getString("SUPPLIERSTOCKFLAG"));
		obj.setTOPSELLERFLAG(rs.getString("TOPSELLERFLAG"));
		obj.setWEBONLYFLAG(rs.getString("WEBONLYFLAG"));
		obj.setERPCOREPARTNUMBER(rs.getString("ERPCOREPARTNUMBER"));
		obj.setDISPLAYINVENTORY(rs.getString("DISPLAYINVENTORY"));
		obj.setSUPPLIERPARTNUMBER(rs.getString("SUPPLIERPARTNUMBER"));
		obj.setFIELD6(rs.getString("FIELD6"));
		obj.setISSOFTWAREANDISDOWNLOADABLE(rs.getString("ISSOFTWAREANDISDOWNLOADABLE"));
		
		return obj;
	}

}
