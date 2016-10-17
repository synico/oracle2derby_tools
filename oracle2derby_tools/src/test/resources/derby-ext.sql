--CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE (null, 'BATCH_STEP_EXECUTION', 'D:\export.txt', null, null, null);

ALTER TABLE ATCHTGT ALTER COLUMN IDENTIFIER SET DATA TYPE VARCHAR(2000);

ALTER TABLE SCHBRDCST DROP COLUMN CLONEID;
ALTER TABLE SCHBRDCST ADD COLUMN CLONEID VARCHAR(256);

ALTER TABLE COLLATERAL ALTER COLUMN NAME SET DATA TYPE VARCHAR(256);
ALTER TABLE COLLATERAL ALTER COLUMN URL SET DATA TYPE VARCHAR(1024);
ALTER TABLE CATFILTER ALTER COLUMN FIELD3 SET DATA TYPE VARCHAR(4000);
ALTER TABLE PX_CDPOOL ADD COLUMN REFERENCE_ID INTEGER;
ALTER TABLE PX_CDPOOL ADD COLUMN INTERNAL_ID INTEGER;-- NOT NULL;
ALTER TABLE PX_CDPOOL ADD COLUMN WORKSPACE VARCHAR(25);
ALTER TABLE PX_CDPOOL ADD COLUMN TASKGROUP VARCHAR(25);

ALTER TABLE ORDPROMOCD DROP COLUMN OPTCOUNTER;
ALTER TABLE ORDPROMOCD ADD COLUMN OPTCOUNTER INTEGER;

ALTER TABLE SRCHCONFEXT DROP COLUMN LANGUAGE_ID;
ALTER TABLE SRCHCONFEXT ADD COLUMN LANGUAGE_ID INTEGER DEFAULT -1;

ALTER TABLE ORGENTITY DROP COLUMN FIELD1;
ALTER TABLE ORGENTITY ADD COLUMN FIELD1 VARCHAR(256);

ALTER TABLE STLOC ADD COLUMN STOREENT_ID BIGINT;-- NOT NULL;

CREATE TABLE FACETCATGRP (
		FACETCATGRP_ID INT NOT NULL,
		FACET_ID INT NOT NULL,
		SEQUENCE INT,
		STOREENT_ID BIGINT NOT NULL,
		CATGROUP_ID INT NOT NULL,
		DISPLAYABLE SMALLINT NOT NULL,
		OPTCOUNTER INT NOT NULL
	);

CREATE TABLE XFORM_QUESTION (
		FORM_ID INTEGER NOT NULL,
		FORM_VERSION_ID INTEGER NOT NULL,
		FORM_QUESTION_ID INTEGER NOT NULL,
		FORM_QUESTION_TYPE_CD VARCHAR(3) NOT NULL,
		SORT_ORDER_NO INTEGER NOT NULL,
		FORM_QUESTION_SET_ID INTEGER
	);
	
CREATE TABLE XFORM_QUESTION_LANGUAGE (
		FORM_ID INTEGER NOT NULL,
		FORM_VERSION_ID INTEGER NOT NULL,
		FORM_QUESTION_ID INTEGER NOT NULL,
		LANGUAGE_ID INTEGER NOT NULL,
		FORM_QUESTION_TX VARCHAR(400) NOT NULL
	);
	
CREATE TABLE PAGELAYOUTTYPE (
		PAGELAYOUTTYPE_ID VARCHAR(32) NOT NULL,
		ISSTATIC INTEGER NOT NULL,
		OPTCOUNTER INTEGER NOT NULL
	);
	
CREATE TABLE XSUBSCRIPTIONDESC (
		SUBSCRIPTION_ID INTEGER NOT NULL,
		DESCRIPTION VARCHAR(256),
		LANGUAGE_ID INTEGER NOT NULL,
		OPTCOUNTER INTEGER
	);	

CREATE TABLE XSCCREPORTS (
		REPORT_ID BIGINT NOT NULL,
		USERS_ID BIGINT NOT NULL,
		ORGENTITY_ID BIGINT NOT NULL,
		REPORTTYPE VARCHAR(32),
		REPORTNAME VARCHAR(256),
		REPORTFREQUENCY VARCHAR(32),
		REPORTSCHEDULEDTIME TIMESTAMP,
		REPORTSCHEDULEDDATE INTEGER,
		REPORTSCHEDULEDDAY VARCHAR(32),
		REPORTCREATEDDATE TIMESTAMP,
		REPORTFILTERS VARCHAR(1000),
		REPORTLASTUPDATEDDATE TIMESTAMP,
		SENDREPORTEMAILIDS VARCHAR(1000),
		REPORTCOMMENTS VARCHAR(4000),
		NEXTINVOCATIONTIME TIMESTAMP,
		REPORTSTATUS VARCHAR(32),
		FIELD1 VARCHAR(1000),
		OPTCOUNTER INTEGER
	);	

CREATE TABLE XSCCREPORTSTATUS (
		REPORT_ID BIGINT NOT NULL,
		LASTREPORTSENDTIME TIMESTAMP,
		REPORTSENDSTATUS VARCHAR(32),
		LASTREPORTGENERATEDTIME TIMESTAMP,
		REPORTNAME VARCHAR(256),
		REPORTLOC VARCHAR(1000),
		OPTCOUNTER INTEGER
	);

CREATE TABLE XSUBSCRSTOREREL (
		SUBSCRIPTION_ID INTEGER NOT NULL,
		STORE_ID BIGINT NOT NULL,
		OPTCOUNTER INTEGER
	);
	
CREATE TABLE XSUBSCRIPTIONLIST (
		SUBSCRIPTION_ID INTEGER NOT NULL,
		SUBSCRIPTION_NAME VARCHAR(256),
		SOURCE_ID INTEGER NOT NULL,
		FIELD1 VARCHAR(256),
		FIELD2 VARCHAR(256),
		FIELD3 VARCHAR(256),
		FIELD4 VARCHAR(256),
		OPTCOUNTER INTEGER
	);	

CREATE TABLE XSCCREPORTCOLHEADR (
		REPORTCOLHEADER_ID INTEGER NOT NULL,
		REPORT_ID INTEGER NOT NULL,
		ACTUALNAME VARCHAR(256),
		DISPLAYNAME VARCHAR(256),
		USERSPECIFICNAME VARCHAR(256),
		COLHEADERORDER INTEGER,
		OPTCOUNTER INTEGER
	);

CREATE TABLE XUSERPYMNTRETRY (
		XUSERPYMNTRETRY_ID INTEGER NOT NULL,
		USERS_ID BIGINT NOT NULL,
		FAILURE_COUNTER SMALLINT NOT NULL,
		CVVINVALID TIMESTAMP,
		OPTCOUNTER INTEGER NOT NULL
	);

CREATE TABLE XDIVISION (
		DIVISIONCODE VARCHAR(64) NOT NULL,
		ERPNAME VARCHAR(64) NOT NULL,
		REGIONNAME VARCHAR(64) NOT NULL,
		FFMCENTER_ID BIGINT NOT NULL,
		CARTTYPE VARCHAR(4) NOT NULL,
		CARTTYPE_DESC VARCHAR(256),
		DEFAULT_CURRENCY VARCHAR(3) NOT NULL,
		FIELD1 INTEGER,
		FIELD2 VARCHAR(254),
		FIELD3 VARCHAR(254),
		OPTCOUNTER INTEGER
	);
	
CREATE TABLE XBOMUPLOAD (
		XBOMUPLOADID INTEGER NOT NULL,
		USERS_ID BIGINT NOT NULL,
		REQUISITIONLISTID BIGINT,
		STOREENT_ID BIGINT,
		CREATEDDATE TIMESTAMP,
		LASTUPDATE TIMESTAMP,
		ROWCOUNTER INTEGER,
		UPLOADSTATUS VARCHAR(32),
		OPTCOUNTER INTEGER
	);
	
CREATE TABLE XFORM_QUESTION_SET_REL (
		FORM_ID INTEGER NOT NULL,
		FORM_VERSION_ID INTEGER NOT NULL,
		FORM_QUESTION_SET_ID INTEGER NOT NULL,
		FORM_QUESTION_ID INTEGER NOT NULL,
		CSS_STYLE_TX INTEGER,
		DISPLAY_FL VARCHAR(1) NOT NULL
	);	
	
CREATE TABLE STORECATOVRGRP (
		STOREENT_ID BIGINT NOT NULL,
		CATOVRGRP_ID BIGINT NOT NULL,
		SEQUENCE INTEGER NOT NULL,
		OPTCOUNTER INTEGER NOT NULL
	);

CREATE TABLE XSOURCE (
		SOURCE_ID INTEGER NOT NULL,
		SOURCE_NAME VARCHAR(256),
		OPTCOUNTER INTEGER
	);
	
CREATE TABLE CATOVRGRP (
		CATOVRGRP_ID BIGINT NOT NULL,
		MEMBER_ID BIGINT NOT NULL,
		IDENTIFIER VARCHAR(254) NOT NULL,
		STOREENT_ID BIGINT NOT NULL,
		OPTCOUNTER INTEGER NOT NULL
	);
	
CREATE TABLE XFORM (
		FORM_ID INTEGER NOT NULL,
		CREATE_DT DATE NOT NULL,
		FORM_NM VARCHAR(200) NOT NULL,
		FORM_TYPE_CD VARCHAR(3) NOT NULL
	);
	
CREATE TABLE XFORM_VERSION (
		FORM_ID INTEGER NOT NULL,
		FORM_VERSION_ID INTEGER NOT NULL,
		CREATE_DT DATE NOT NULL,
		FORM_VERSION_DS VARCHAR(200)
	);
	
CREATE TABLE FOLDER (
		FOLDER_ID BIGINT NOT NULL,
		STOREENT_ID BIGINT NOT NULL,
		MEMBER_ID BIGINT,
		PARENTFOLDER_ID INTEGER,
		IDENTIFIER VARCHAR(256) NOT NULL,
		DESCRIPTION VARCHAR(256),
		TYPE VARCHAR(128),
		FIELD1 INTEGER,
		FIELD2 VARCHAR(256),
		FIELD3 VARCHAR(256),
		OPTCOUNTER INTEGER NOT NULL
	);
	
CREATE TABLE XJOBCONFIG (
		STOREENT_ID BIGINT NOT NULL,
		JOBIDENTIFIER VARCHAR(25) NOT NULL,
		CONFIGNAME VARCHAR(25) NOT NULL,
		DATEVALUE TIMESTAMP,
		STRINGVALUE VARCHAR(25)
	);	
	
CREATE TABLE FOLDERITEM (
		FOLDERITEM_ID BIGINT NOT NULL,
		FOLDER_ID BIGINT NOT NULL,
		REFERENCE_ID INTEGER NOT NULL,
		FOLDERITEMTYPE VARCHAR(128) NOT NULL,
		STOREENT_ID BIGINT NOT NULL,
		FIELD1 INTEGER,
		FIELD2 VARCHAR(256),
		FIELD3 VARCHAR(256),
		OPTCOUNTER INTEGER NOT NULL
	);	
	
CREATE TABLE X_SAP_SALESDOC_HDR (
        VBAK_VBELN VARCHAR(10) NOT NULL,
        SOLD_TO VARCHAR(10),
        VBAK_AUART VARCHAR(4),
        VBKD_BSTDK TIMESTAMP,
        UPDATED_FLAG VARCHAR(2)
    );
    
CREATE TABLE X_ZFC_CUSTMATSPLIT (
        MANDT VARCHAR(3) NOT NULL,
        ZZFPA VARCHAR(10) NOT NULL,
		VKORG VARCHAR(4) NOT NULL,
		VTWEG VARCHAR(2) NOT NULL,
		ZZCMA VARCHAR(35) NOT NULL,
		MATNR VARCHAR(18) NOT NULL,
		WERKS VARCHAR(4),
		MFRPN VARCHAR(40),
		ERZEIT TIMESTAMP,
		MFRNR VARCHAR(10),
		UPDATED_FLAG VARCHAR(10)
    );
    
CREATE TABLE X_ZFC_CUSTMAT (
        MANDT VARCHAR(3) NOT NULL,
        ZZFPA VARCHAR(10) NOT NULL,
        ZZCMA VARCHAR(35) NOT NULL,
        VKORG VARCHAR(4) NOT NULL,
        VTWEG VARCHAR(2) NOT NULL,
        RESERVING CHAR(1),
        CONSIGNMENT CHAR(1),
        ERZEIT TIMESTAMP,
        UPDATED_FLAG VARCHAR(2)
    );
    
CREATE TABLE XOFFERLOG (
        PRICELISTNAME VARCHAR(64),
        CUSTOMERID VARCHAR(64) NOT NULL,
        CATENTRYPARTNUMBER VARCHAR(64) NOT NULL,
        STARTDATE VARCHAR(64),
        ENDDATE VARCHAR(64),
        MINQUANTITY VARCHAR(64) NOT NULL,
        MAXQUANTITY VARCHAR(64),
        PRICE VARCHAR(64),
        QUANTITY VARCHAR(64),
        PRICEPERQUANTITY VARCHAR(64),
        UOM VARCHAR(64),
        CURRENCY VARCHAR(64),
        PROCESSED VARCHAR(64),
        OPTCOUNTER DECIMAL(20,0)
    );

CREATE TABLE XFCSTMASTERDETAILS (
        FORECAST_ID DECIMAL(20,0) NOT NULL,
        FCST_PARTY VARCHAR(50) NOT NULL,
        CUST_MAT VARCHAR(50) NOT NULL,
        MATERIAL_NBR VARCHAR(50) NOT NULL,
        MFR_PART_NBR VARCHAR(40) NOT NULL,
        MFR VARCHAR(20),
        FCST_FREQ CHAR(1),
        NET_OF_BACKLOG CHAR(1),
        NET_OF_QOH CHAR(1),
        CONSIGNMENT CHAR(1),
        RESERVING CHAR(1),
        CONSIGNMENT_FLAG CHAR(1),
        W_INV VARCHAR(50),
        INVENTORY DECIMAL(20,0),
        CATENTRY_ID BIGINT,
        LEAD_TIME DECIMAL(20,0),
        COVERED_FLAG DECIMAL(20,0),
        CONSTRAINED_FLAG DECIMAL(20,0),
        NO_FCST_QTY_FLAG DECIMAL(20,0),
        FORECAST_RCV_DATE DATE,
        UPDATED_ON TIMESTAMP,
        VMI CHAR(1),
        PLANT_INVENTORY DECIMAL(20,0),
        WERKS VARCHAR(4),
        CONSIGN_INV DECIMAL(20,0)
    );

   
CREATE TABLE X_SAP_MSKU (
        MSKU_WERKS VARCHAR(4) NOT NULL,
        MSKU_MATNR VARCHAR(18) NOT NULL,
        MSKU_KUNNR VARCHAR(10) NOT NULL,
        MSKU_LABST DECIMAL(13 , 3),
        UPDATED_FLAG VARCHAR(2)
    ); 
    
CREATE TABLE EXPRESSION (
        EXPRESSION_ID BIGINT NOT NULL,
        TRADING_ID BIGINT,
        CATFILTER_ID BIGINT,
        MEMBER_ID BIGINT,
        QUERY VARCHAR(4000),
        FIELD1 DECIMAL(20,0),
        FIELD2 VARCHAR(256),
        FIELD3 VARCHAR(256),
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );
    
CREATE TABLE XMDMMATERIALSTS (
        MDMMATERIALNUMBER VARCHAR(64) NOT NULL,
        STATUS CHAR(1),
        LASTUPDATE TIMESTAMP,
        OPTCOUNTER DECIMAL(20,0)
    );    

CREATE TABLE XINVLOG (
        SAPMATERIALID VARCHAR(64) NOT NULL,
        PROCESSED CHAR(1),
        LASTUPDATE VARCHAR(64),
        OPTCOUNTER DECIMAL(20,0)
    ); 

    
CREATE TABLE XORDERITEMS (
        ORDERITEMS_ID DECIMAL(20,0) NOT NULL,
        ORDERS_ID DECIMAL(20,0) NOT NULL,
        ATTENTION VARCHAR(128),
        PHONENO VARCHAR(32),
        SHIPCOMPLETE CHAR(1) NOT NULL,
        EMAIL VARCHAR(256),
        PARENTITEM_ID DECIMAL(20,0),
        ORDERITEMTYPE VARCHAR(4),
        CUSTOMERREFNO VARCHAR(64),
        AVN_AVLQUANTITY DECIMAL(20,0),
        BONDED_AVLQUANTITY DECIMAL(20,0),
        FACTORY_AVLQUANTITY DECIMAL(20,0),
        LEADTIME DECIMAL(20,0),
        LEADTIME_UOM CHAR(1),
        FIELD1 DECIMAL(20,0),
        FIELD2 VARCHAR(254),
        FIELD3 VARCHAR(254),
        FIELD4 VARCHAR(254),
        OPTCOUNTER DECIMAL(20,0),
        RFQ_ID VARCHAR(254),
        FIELD5 VARCHAR(254),
        FIELD6 VARCHAR(254),
        FIELD7 VARCHAR(254)
    );

CREATE TABLE PLWIDGETNVP (
        PLWIDGETNVP_ID DECIMAL(20,0) NOT NULL,
        PLWIDGET_ID DECIMAL(20,0) NOT NULL,
        NAME VARCHAR(256) NOT NULL,
        VALUE VARCHAR(256) NOT NULL,
        PROPERTIES VARCHAR(256),
        SEQUENCE DECIMAL(20,0) NOT NULL,
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE DSR_INVOICE (
        INVOICE_NBR VARCHAR(14) NOT NULL,
        CREATE_DT DATE NOT NULL,
        UPDATE_DT DATE,
        DELETE_DT DATE,
        UPDATE_ID VARCHAR(12) NOT NULL,
        LAST_UPDATE_ACTION VARCHAR(1),
        AUDIT_LOG_KEY DECIMAL(12 , 0),
        SYSTEM_ID CHAR(1) NOT NULL,
        SEG_RCVD_DT DATE,
        DIVISION_ID VARCHAR(1),
        INVOICE_COMPANY VARCHAR(4),
        INVOICE_SEQ_NBR VARCHAR(10),
        INV_LINE_ITEM_CNT DECIMAL(3 , 0),
        SCN VARCHAR(13),
        SHIPTO_CUST_NBR VARCHAR(12),
        CUST_INVOICE_NBR DECIMAL(8 , 0),
        CUSTOMER_PO_NBR VARCHAR(22),
        INVOICE_AMT DECIMAL(13 , 5),
        INVOICE_TAX_AMT DECIMAL(13 , 5),
        MISC_CHARGE_AMT DECIMAL(13 , 5),
        PART_TOTAL_AMT DECIMAL(15 , 5),
        RESTOCK_CHARGE_AMT DECIMAL(11 , 5),
        COMMISSION_PCT DECIMAL(5 , 5),
        RELEASE_ID VARCHAR(15),
        INSIDE_SLSMN_ID VARCHAR(3),
        SLSMN_FIELD VARCHAR(3),
        SLSMN_CSM VARCHAR(3),
        SLSMN_ASM VARCHAR(3),
        SLSMN_CSR VARCHAR(3),
        SLSMN_PSS VARCHAR(3),
        SLSMN_TAE VARCHAR(3),
        SLSMN_MISC1 VARCHAR(3),
        SLSMN_MISC2 VARCHAR(3),
        SLSMN_MISC3 VARCHAR(3),
        SLSMN_MISC4 VARCHAR(3),
        SLSMN_MISC5 VARCHAR(3),
        SLSMN_MISC6 VARCHAR(3),
        SLSMN_MISC7 VARCHAR(3),
        SLSMN_MISC8 VARCHAR(3),
        SLSMN_MISC9 VARCHAR(3),
        ACTUAL_CARRIER_CD VARCHAR(3),
        CARRIER_OVERRIDE_TXT VARCHAR(16),
        CARRIER_OVRRD_RSN_CD VARCHAR(3),
        COD_AMT DECIMAL(11 , 5),
        FOB_CD VARCHAR(2),
        FREIGHT_AMT DECIMAL(13 , 5),
        FREIGHT_CHARGE_CD VARCHAR(1),
        FREIGHT_PROCESSED_FL VARCHAR(1),
        MAIL_FL VARCHAR(1),
        PACKAGE_QTY DECIMAL(5 , 0),
        QID_PACKER_CD VARCHAR(3),
        SHIP_VIA_CD VARCHAR(3),
        SHIP_VIA_OVERRIDE_CD VARCHAR(3),
        SHIP_VIA_OVRRD_RSN_CD VARCHAR(3),
        SHIP_VIA_OVRRD_RSN_TXT VARCHAR(16),
        WEIGHT_LBS DECIMAL(5 , 0),
        FACILITY_STATUS_DS VARCHAR(1),
        INVENTORY_LOC_CD VARCHAR(4),
        ORDER_DT DATE,
        SHIP_DT DATE,
        SHIP_FIRST_FL VARCHAR(1),
        SHIPPER_CREATE_DT DATE,
        WAYBILL_ID VARCHAR(20),
        WRHS_LOC_CD VARCHAR(4),
        CREDIT_DEBIT_CD VARCHAR(1),
        CUST_TAX_TYPE_CD VARCHAR(1),
        PAY_METHOD_CD VARCHAR(4),
        PAY_TERMS_CD VARCHAR(2),
        TRADE_TERMS_CD VARCHAR(2),
        LOCAL_TAX_PCT DECIMAL(5 , 5),
        STATE_TAX_PCT DECIMAL(5 , 5),
        TAX_CREDIT_FL VARCHAR(1),
        ICST_PO_ID VARCHAR(11),
        ICST_TYPE_CD VARCHAR(2),
        STATUS_CUTBACK_CNT DECIMAL(3 , 0),
        STATUS_INSP_CNT DECIMAL(3 , 0),
        STATUS_INSP_DBL_CNT DECIMAL(3 , 0),
        STATUS_INSP_TDSK_CNT DECIMAL(3 , 0),
        STATUS_LARGE_ORDER_CNT DECIMAL(3 , 0),
        STATUS_PACK_CNT DECIMAL(3 , 0),
        STATUS_PACK_DE_CNT DECIMAL(3 , 0),
        STATUS_PRODUCTION_CNT DECIMAL(3 , 0),
        STATUS_WRHS_TDSK_CNT DECIMAL(3 , 0),
        TAX_RATE_GEO_STATE_CD VARCHAR(2),
        TAX_RATE_GEO_COUNTY_CD VARCHAR(3),
        TAX_RATE_GEO_CITY_CD VARCHAR(5),
        QID_INSPECTOR1_CD VARCHAR(3),
        QID_INSPECTOR2_CD VARCHAR(3),
        QID_INSPECTOR3_CD VARCHAR(3),
        QID_LAST_UPDATE VARCHAR(3),
        ASRS_LAST_PRINT VARCHAR(1),
        COMPLETE_2006_FL VARCHAR(1),
        COMPLETE_RELEASE_FL VARCHAR(1),
        CONFIRM_PURGE_FL VARCHAR(1),
        MAG_PRINT_ID VARCHAR(3),
        PROM_FL VARCHAR(1),
        WMS_CD VARCHAR(1),
        SEGMENT_CREATE_CD VARCHAR(1),
        INVOICE_CHANGE_AUDIT_KEY DECIMAL(20,0),
        BILLTO_CUST_NBR VARCHAR(9),
        CUST_ST_NO VARCHAR(12),
        COMPANY_ST_NO VARCHAR(4),
        CUST_ACCT_ST_NO VARCHAR(5),
        CUST_LOC_ST_NO VARCHAR(3),
        FLAT_FREIGHT_AM DECIMAL(20,0),
        FLAT_FRT_CD VARCHAR(2),
        IVC_ORIGINAL_NO VARCHAR(14),
        FRT_INSUR_AM DECIMAL(20,0),
        FRT_CUST_PARTIAL_AM DECIMAL(20,0),
        STD_HANDLING_AM DECIMAL(20,0),
        SPLIT_PREV_INVOICE_NBR VARCHAR(14),
        SPLIT_INVOICE_CD VARCHAR(1),
        EMAIL_FL VARCHAR(2),
        AUDIT_LOG_DT DATE
    );

CREATE TABLE X_ZFC_CUSTMAT_CEM (
        MANDT VARCHAR(3) NOT NULL,
        ZZFPA VARCHAR(10) NOT NULL,
        VKORG VARCHAR(4) NOT NULL,
        VTWEG VARCHAR(2) NOT NULL,
        ZZCMA VARCHAR(35) NOT NULL,
        KUNNR_CEM VARCHAR(10) NOT NULL,
        UPDATED_FLAG VARCHAR(2)
    );

CREATE TABLE DSR_INVOICE_LINE (
        INVOICE_NBR VARCHAR(14) NOT NULL,
        LINE_ITEM_NBR VARCHAR(3) NOT NULL,
        CREATE_DT DATE NOT NULL,
        UPDATE_DT DATE,
        DELETE_DT DATE,
        UPDATE_ID VARCHAR(12) NOT NULL,
        LAST_UPDATE_ACTION VARCHAR(1),
        AUDIT_LOG_KEY DECIMAL(12 , 0),
        SYSTEM_ID CHAR(1) NOT NULL,
        SEG_RCVD_DT DATE,
        DIVISION_ID VARCHAR(1),
        INVOICE_COMPANY VARCHAR(4),
        INVOICE_SEQ_NBR VARCHAR(10),
        LINE_ITEM_LAST_UPDATE_DT DATE,
        LINE_ITEM_SHIP_QTY DECIMAL(7 , 0),
        MFG_CD VARCHAR(3),
        PART_NBR VARCHAR(30),
        PART_CLASS_CD VARCHAR(3),
        CUST_REF_ID_1 VARCHAR(15),
        CUST_REF_ID_2 VARCHAR(15),
        CUST_PART_NBR VARCHAR(30),
        ADJUSTED_COST_AMT DECIMAL(13 , 5),
        AVG_POOL_COST_AMT DECIMAL(13 , 5),
        MISC_CHARGE_AMT DECIMAL(13 , 5),
        ORIG_COST_AMT DECIMAL(13 , 5),
        PROGRAM_CHARGE_AMT DECIMAL(5 , 2),
        RESALE_PRICE_AMT DECIMAL(13 , 5),
        TARGET_COST_AMT DECIMAL(13 , 5),
        UNIT_COST_AMT DECIMAL(13 , 5),
        US_RESALE_PRICE_AMT DECIMAL(13 , 5),
        CURRENCY_RATE_PCT DECIMAL(6 , 4),
        DUTY_RATE_PCT DECIMAL(6 , 4),
        REQUIRED_DT DATE,
        SCHED_DT DATE,
        BACK_ORDER_QTY DECIMAL(9 , 0),
        CUMULATIVE_PICK_QTY DECIMAL(7 , 0),
        ORDER_QTY DECIMAL(7 , 0),
        ORIG_SHIPPER_QTY DECIMAL(9 , 0),
        REMAINING_DEMAND_QTY DECIMAL(7 , 0),
        SCHED_LATE_DEL_QTY DECIMAL(2 , 0),
        SCHED_ON_TIME_DEL_QTY DECIMAL(2 , 0),
        SHIP_DE_QTY DECIMAL(7 , 0),
        TARGET_COST_QTY DECIMAL(9 , 0),
        DW_MATCH_CD VARCHAR(2),
        DW_REG_NBR VARCHAR(20),
        DW_SUPPORT_IND_ID VARCHAR(1),
        LOI_AUTH_ID VARCHAR(15),
        LOI_DEBIT_CREATE_FL VARCHAR(1),
        LOI_EXPIRE_DT DATE,
        LOI_FL VARCHAR(1),
        LOI_SUPPL_QUOTE_ID VARCHAR(15),
        ASSIGNED_COST_CD VARCHAR(1),
        CONDITION_CD VARCHAR(2),
        CURRENCY_TYPE_CD VARCHAR(4),
        INVOICE_TYPE_CD VARCHAR(1),
        ORDER_STATUS_MOVE_CD VARCHAR(4),
        RETURN_REASON_CD VARCHAR(3),
        WMS_CD VARCHAR(1),
        WRHS_LOC_CD VARCHAR(4),
        EXPERT_SELLER_NBR VARCHAR(15),
        PO_LINE_ITEM_NBR VARCHAR(4),
        SHOP_TICKET_NBR VARCHAR(15),
        CUST_MFG_ID VARCHAR(15),
        ICST_PO_ID VARCHAR(11),
        POURSIT_ID VARCHAR(6),
        QID_INSPECTOR_ID VARCHAR(3),
        QID_PULLER_ID VARCHAR(3),
        QID_SHIP_ID VARCHAR(3),
        USER_ID VARCHAR(8),
        ADD_CHG_FL VARCHAR(1),
        COMPLETE_INTG_FL VARCHAR(1),
        CONFIRM_PURGE_FL VARCHAR(1),
        RED_COST_FL VARCHAR(1),
        MISC_CHARGE_DESC VARCHAR(30),
        FIRST_CHG_ADD_COST_AMT DECIMAL(13 , 5),
        FIRST_CHG_ADD_AMT DECIMAL(13 , 5),
        FIRST_CHG_ADD_REASON_CD VARCHAR(3),
        SECOND_CHG_ADD_COST_AMT DECIMAL(13 , 5),
        SECOND_CHG_ADD_AMT DECIMAL(13 , 5),
        SECOND_CHG_ADD_REASON_CD VARCHAR(3),
        ADD_COST_UNIT_AMT DECIMAL(13 , 5),
        ADD_U_COST_REASON_CD VARCHAR(3),
        US_FIRST_CHG_ADD_AMT DECIMAL(13 , 5),
        US_SECOND_CHG_ADD_AMT DECIMAL(13 , 5),
        FIRST_CHG_ADD_TAX_FL VARCHAR(1),
        SECOND_CHG_ADD_TAX_FL VARCHAR(2),
        ERROR1_CD VARCHAR(1),
        ERROR2_CD VARCHAR(1),
        ERROR3_CD VARCHAR(1),
        ERROR4_CD VARCHAR(1),
        ERROR5_CD VARCHAR(1),
        MKT_COST_MULT DECIMAL(5 , 2),
        MKT_UNIT_COST_AMT DECIMAL(13 , 5),
        MKT_ADJ_UNIT_COST_AMT DECIMAL(13 , 5),
        MKT_ORIG_COST_AMT DECIMAL(13 , 5),
        INVOICE_LINE_CHANGE_AUDIT_KEY DECIMAL(12 , 0),
        DW_REG_NO VARCHAR(30),
        ORIG_CUST_HAZMAT_PREF_CD VARCHAR(2),
        ORIG_LEAD_FREE_FL VARCHAR(1),
        ORIG_ROHS_COMPLIANT_FL VARCHAR(1),
        ORIG_GREEN_COMPLIANT_FL VARCHAR(1),
        MARKET_COST_OVERRIDE_FL VARCHAR(1),
        AFA_REPLENISH_CD VARCHAR(1),
        SPEC_DRAWING_TX VARCHAR(25)
    );

CREATE TABLE PLWIDGETSLOT (
        PLWIDGETSLOT_ID DECIMAL(20,0) NOT NULL,
        PAGELAYOUT_ID DECIMAL(20,0) NOT NULL,
        PLWIDGET_ID DECIMAL(20,0) NOT NULL,
        ADMINNAME VARCHAR(256) NOT NULL,
        SLOTID VARCHAR(64) NOT NULL,
        SLOTTYPE DECIMAL(20,0) NOT NULL,
        PROPERTIES VARCHAR(1024) NOT NULL,
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );


CREATE TABLE XADDRESS (
        ADDRESS_ID BIGINT NOT NULL,
        LANGUAGE_ID DECIMAL(20,0) NOT NULL,
        ADDRESSTYPE CHAR(5),
        MEMBER_ID BIGINT,
        SELFADDRESS BIGINT,
        FIRSTNAME VARCHAR(128),
        LASTNAME VARCHAR(128),
        ADDRESS1 VARCHAR(256),
        ADDRESS2 VARCHAR(256),
        ADDRESS3 VARCHAR(256),
        CITY VARCHAR(128),
        STATE VARCHAR(128),
        COUNTRY VARCHAR(128),
        ZIPCODE VARCHAR(40),
        STATUS CHAR(1),
        FIELD1 VARCHAR(128),
        FIELD2 VARCHAR(128),
        OPTCOUNTER DECIMAL(20,0)
    );

CREATE TABLE DSR_SALES_ORDER (
        SCN VARCHAR(13) NOT NULL,
        CREATE_DT DATE NOT NULL,
        UPDATE_DT DATE,
        DELETE_DT DATE,
        UPDATE_ID VARCHAR(12) NOT NULL,
        LAST_UPDATE_ACTION VARCHAR(1),
        AUDIT_LOG_KEY DECIMAL(12 , 0),
        SYSTEM_ID CHAR(1) NOT NULL,
        SEG_RCVD_DT DATE,
        DIVISION_ID VARCHAR(1),
        SALES_ORDER_COMPANY VARCHAR(4),
        SCN_SEQ_NBR VARCHAR(9),
        BILLTO_CUST_NBR VARCHAR(9),
        SHIPTO_CUST_NBR VARCHAR(12),
        CUST_PO_ID VARCHAR(22),
        RELEASE_ID VARCHAR(15),
        ORDER_DT DATE,
        CLOSE_DT DATE,
        ORDER_TYPE_CD VARCHAR(1),
        STATUS_CD VARCHAR(2),
        GOVT_CONTRACT_ID VARCHAR(22),
        REASON_CD VARCHAR(3),
        AUTHORIZER_NAME VARCHAR(15),
        SO_LINE_ITEM_CNT DECIMAL(3 , 0),
        FORECAST_ID VARCHAR(8),
        PURGE_ORDER_FL VARCHAR(1),
        LAST_UPDATE_ID VARCHAR(8),
        BUYER_NAME VARCHAR(15),
        BUYER_AREA_CODE_NBR VARCHAR(3),
        BUYER_PHONE_NBR VARCHAR(7),
        BUYER_PHONE_EXT_NBR VARCHAR(5),
        SPEC_TXT VARCHAR(25),
        SPEC_DRAWING_TXT VARCHAR(25),
        SPCL_INST_TXT VARCHAR(55),
        INTERNAL_INST_TXT VARCHAR(55),
        COMMENT_TXT VARCHAR(40),
        SLSMN_INSIDE_ID VARCHAR(3),
        PAY_METHOD_CD VARCHAR(4),
        PAY_TERMS_CD VARCHAR(2),
        PRIORITY_CD VARCHAR(4),
        FRT_CHARGE_CD VARCHAR(1),
        FOB_CD VARCHAR(2),
        TOTAL_VALUE_AMT DECIMAL(15 , 5),
        SHIP_COMPLETE_CD VARCHAR(1),
        OVERRIDE_CUST_FL VARCHAR(1),
        DW_ORDER_TYPE_CD VARCHAR(1),
        CUST_TAX_TYPE_CD VARCHAR(1),
        ORIG_CARRIER_CD VARCHAR(3),
        CARRIER_BAL_CD VARCHAR(3),
        CARRIER_ACCT_ID VARCHAR(12),
        AUTH_TERMS_CD VARCHAR(1),
        AUTH_TERMS_ID VARCHAR(3),
        AUTH_TRADE_TERMS_CD VARCHAR(1),
        AUTH_TRADE_TERMS_ID VARCHAR(2),
        TRADE_TERMS_CD VARCHAR(2),
        CREDIT_HOLD_FL VARCHAR(1),
        CREDIT_CAT_CD VARCHAR(1),
        WEB_ORDER_DIVISION VARCHAR(1),
        WEB_ORDER_NBR DECIMAL(8 , 0),
        WEB_USER_DIVISION VARCHAR(1),
        WEB_USER_NBR VARCHAR(15),
        WEB_FREIGHT_AMT DECIMAL(7 , 2),
        WEB_HANDLING_AMT DECIMAL(7 , 2),
        WEB_EMAIL_ADDR_TXT VARCHAR(65),
        PLN_FL VARCHAR(1),
        RENEGOTIATE_FL VARCHAR(1),
        SHIP_FIRST_FL VARCHAR(1),
        HOT_SHIP_FL VARCHAR(1),
        FDS_PO_CNT DECIMAL(3 , 0),
        B2B_IDENTIFIER_CD VARCHAR(1),
        MISC_EMAIL_FL VARCHAR(1),
        LAST_ACCESSED_DT_TXT VARCHAR(8),
        LAST_ACCESSED_TM_TXT VARCHAR(8),
        DATE_STAMP_NBR DECIMAL(5 , 0),
        TIME_STAMP_NBR DECIMAL(9 , 0),
        ORDER_CHANGE_AUDIT_KEY DECIMAL(20,0),
        SHC_CNTL_CD VARCHAR(1),
        WEB_USER_ID VARCHAR(16),
        CUST_ST_NO VARCHAR(12),
        APO_QT DECIMAL(3 , 0),
        FLAT_FREIGHT_AM DECIMAL(11 , 2),
        FLAT_FRT_CD VARCHAR(2),
        CONTRACT_START_DT DATE,
        CONTRACT_END_DT DATE,
        INVOICE_OK_FL VARCHAR(1),
        ENTITLEMENT_FL VARCHAR(1),
        BILLING_FREQUENCY_TX VARCHAR(8),
        SERVICE_CONTRACT_ID VARCHAR(20),
        COMPANY_ST_NO VARCHAR(4),
        CUST_ACCT_ST_NO VARCHAR(5),
        CUST_LOC_ST_NO VARCHAR(5),
        ORDER_CUST_PO_AL_KEY DECIMAL(20,0),
        RESERVATION_ORDER_CD VARCHAR(1)
    );

 CREATE TABLE XINVOICE (
        XINVOICE_ID BIGINT NOT NULL,
        XINVOICE_DATE TIMESTAMP,
        XINVOICE_AMT DECIMAL(20 , 5),
        ORDERS_ID BIGINT NOT NULL,
        ORDRELEASENUM DECIMAL(20,0) NOT NULL,
        STATUS VARCHAR(5),
        FIELD1 DECIMAL(20,0),
        FIELD2 DECIMAL(20,0),
        FIELD3 VARCHAR(64),
        FIELD4 TIMESTAMP,
        FIELD5 VARCHAR(254),
        FIELD6 VARCHAR(254),
        EMAIL_FLAG VARCHAR(5),
        EMAIL_SENT_TIME TIMESTAMP,
        OPTCOUNTER DECIMAL(20,0)
    );

CREATE TABLE PLWIDGETREL (
        PLWIDGET_ID_PARENT DECIMAL(20,0),
        PLWIDGET_ID_CHILD DECIMAL(20,0) NOT NULL,
        SEQUENCE DECIMAL(20,0),
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE PLWIDGET (
        PLWIDGET_ID DECIMAL(20,0) NOT NULL,
        PAGELAYOUT_ID DECIMAL(20,0) NOT NULL,
        PLWIDGETDEF_ID DECIMAL(20,0) NOT NULL,
        ADMINNAME VARCHAR(256) NOT NULL,
        SLOTID VARCHAR(64),
        FIELD1 DECIMAL(20,0),
        FIELD2 VARCHAR(256),
        FIELD3 VARCHAR(256),
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE XORDATTR (
        ORDERS_ID BIGINT NOT NULL,
        ORDATTR_ID BIGINT NOT NULL,
        NAME VARCHAR(64) NOT NULL,
        VALUE VARCHAR(2048) NOT NULL,
        OPTCOUNTER DECIMAL(20,0)
    );

CREATE TABLE DSR_INVOICE_ADDRESS (
        INVOICE_NBR VARCHAR(14) NOT NULL,
        CREATE_DT DATE NOT NULL,
        UPDATE_DT DATE,
        DELETE_DT DATE,
        UPDATE_ID VARCHAR(12) NOT NULL,
        LAST_UPDATE_ACTION VARCHAR(1),
        AUDIT_LOG_KEY DECIMAL(12 , 0),
        SYSTEM_ID CHAR(1) NOT NULL,
        SEG_RCVD_DT DATE,
        DIVISION_ID VARCHAR(1),
        INVOICE_COMPANY VARCHAR(4),
        INVOICE_SEQ_NBR VARCHAR(10),
        BILLTO_CUST_NAME VARCHAR(25),
        BILLTO_ATTN_NAME VARCHAR(30),
        BILLTO_ADDR1 VARCHAR(30),
        BILLTO_ADDR2 VARCHAR(30),
        BILLTO_ADDR3 VARCHAR(30),
        BILLTO_CITY VARCHAR(15),
        BILLTO_STATE VARCHAR(2),
        BILLTO_POST_ZIP VARCHAR(9),
        BILLTO_CNTRY VARCHAR(4),
        SHIPTO_CUST_NAME VARCHAR(25),
        SHIPTO_ATTN_NAME VARCHAR(30),
        SHIPTO_ADDR1 VARCHAR(30),
        SHIPTO_ADDR2 VARCHAR(30),
        SHIPTO_ADDR3 VARCHAR(30),
        SHIPTO_CITY VARCHAR(15),
        SHIPTO_STATE VARCHAR(2),
        SHIPTO_POST_ZIP VARCHAR(9),
        SHIPTO_CNTRY VARCHAR(4)
    );

ALTER TABLE EMSPOT ADD COLUMN UIDISPLAYABLE DECIMAL(20,0);
ALTER TABLE EMSPOT ADD COLUMN MANAGINGTOOL DECIMAL(20,0);

ALTER TABLE DMEMSPOTDEF ADD COLUMN SEQUENCE DECIMAL(20,0);

ALTER TABLE COLLATERAL ADD COLUMN UIDISPLAYABLE DECIMAL(20,0);
ALTER TABLE COLLATERAL ADD COLUMN MANAGINGTOOL DECIMAL(20,0);
ALTER TABLE COLLATERAL ADD COLUMN OVRMKTLIMIT DECIMAL(20,0);
    
CREATE TABLE XUSERSUBSCRIPTION (
        LOGON_ID VARCHAR(256) NOT NULL,
        SUBSCRIPTION_ID DECIMAL(20,0) NOT NULL,
        SUBSCRIBED CHAR(1),
        SYNCSTATUS CHAR(1),
        TIME_CREATED TIMESTAMP,
        TIME_SUBSCRIBED TIMESTAMP,
        TIME_UNSUBSCRIBED TIMESTAMP,
        STORE_ID DECIMAL(20,0) NOT NULL,
        LASTUPDATED DATE,
        FIELD1 VARCHAR(256),
        FIELD2 VARCHAR(256),
        FIELD3 VARCHAR(256),
        FIELD4 VARCHAR(256),
        OPTCOUNTER DECIMAL(20,0)
    );


CREATE TABLE XFORM_ANSWER (
        FORM_ID DECIMAL(20,0) NOT NULL,
        FORM_VERSION_ID DECIMAL(20,0) NOT NULL,
        STORE_ID DECIMAL(20,0) NOT NULL,
        FORM_QUESTION_ID DECIMAL(20,0) NOT NULL,
        FORM_RESPONSE_ID DECIMAL(20,0) NOT NULL,
        FORM_ANSWER_TX VARCHAR(400) NOT NULL
    );

CREATE TABLE SRCHPROPRELV (
        SRCHPROPRELV_ID BIGINT NOT NULL,
        CATALOG_ID DECIMAL(20,0) NOT NULL,
        STOREENT_ID DECIMAL(20,0) NOT NULL,
        CATGROUP_ID DECIMAL(20,0) NOT NULL,
        RELVALUE DECIMAL(20,0) NOT NULL,
        INDEXFIELD VARCHAR(128),
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

ALTER TABLE ATTR ADD COLUMN STOREDISPLAY DECIMAL(20,0);
ALTER TABLE ATTR ADD COLUMN FACETABLE DECIMAL(20,0);
ALTER TABLE ATTR ADD COLUMN MERCHANDISABLE DECIMAL(20,0);


CREATE TABLE FACET (
        FACET_ID BIGINT NOT NULL,
        ATTR_ID BIGINT,
        SRCHATTR_ID BIGINT NOT NULL,
        SELECTION DECIMAL(20,0) NOT NULL,
        SORT_ORDER DECIMAL(20,0) NOT NULL,
        KEYWORD_SEARCH DECIMAL(20,0) NOT NULL,
        ZERO_DISPLAY DECIMAL(20,0) NOT NULL,
        STOREENT_ID DECIMAL(20,0) NOT NULL,
        MAX_DISPLAY DECIMAL(20,0) NOT NULL,
        SEQUENCE DECIMAL(20,0) NOT NULL,
        FIELD1 DECIMAL(20,0),
        FIELD2 VARCHAR(256),
        FIELD3 VARCHAR(256),
        OPTCOUNTER DECIMAL(20,0) NOT NULL,
        GROUP_ID DECIMAL(20,0)
    );
    
 ALTER TABLE CATGROUP ADD COLUMN DYNAMIC DECIMAL(20,0);
 

CREATE TABLE X_WKNBR_DATE (
        WEEK_NBR VARCHAR(20),
        WEEK_BEGIN_DATE DATE
    );

CREATE TABLE XBOMUPLOADDATA (
        XBOMUPLOADDATAID DECIMAL(20,0) NOT NULL,
        XBOMUPLOADID DECIMAL(20,0) NOT NULL,
        PARTNUMBER VARCHAR(256),
        MFNAME VARCHAR(256),
        QUANTITY DECIMAL(20,0),
        STATUS VARCHAR(4),
        ROWCOUNTER DECIMAL(20,0),
        CREATEDDATE TIMESTAMP,
        OPTCOUNTER DECIMAL(20,0),
        CUSTOMERPARTNUMBER VARCHAR(256)
    );

CREATE TABLE X_ZFC_CUSTOMER (
        MANDT VARCHAR(3) NOT NULL,
        ZZFPA VARCHAR(10) NOT NULL,
        VKORG VARCHAR(4) NOT NULL,
        VTWEG VARCHAR(2) NOT NULL,
        WERKS VARCHAR(4),
        FCPERIOD CHAR(1),
        NET CHAR(1),
        NET_QOH CHAR(1),
        CONSIGNMENT CHAR(1),
        ERZEIT TIMESTAMP,
        UPDATED_FLAG VARCHAR(2),
        VMI CHAR(1)
    );

CREATE TABLE PAGELAYOUT (
        PAGELAYOUT_ID DECIMAL(20,0) NOT NULL,
        NAME VARCHAR(256) NOT NULL,
        VIEWNAME VARCHAR(256),
        MEMBER_ID BIGINT NOT NULL,
        STOREENT_ID DECIMAL(20,0) NOT NULL,
        PAGELAYOUTTYPE_ID VARCHAR(32),
        DESCRIPTION VARCHAR(1024),
        THUMBNAIL VARCHAR(256),
        FULLIMAGE VARCHAR(256),
        MASTERCSS VARCHAR(256),
        DEVICETYPE VARCHAR(64) NOT NULL,
        STATE DECIMAL(20,0) NOT NULL,
        ISTEMPLATE DECIMAL(20,0) NOT NULL,
        CREATEDATE TIMESTAMP,
        LASTUPDATE TIMESTAMP,
        FIELD1 DECIMAL(20,0),
        FIELD2 VARCHAR(256),
        FIELD3 VARCHAR(256),
        OPTCOUNTER DECIMAL(20,0) NOT NULL,
        ISDEFAULT DECIMAL(20,0) NOT NULL,
        STARTDATE TIMESTAMP,
        ENDDATE TIMESTAMP,
        PRIORITY DECIMAL(20,0) NOT NULL
    );

ALTER TABLE DMACTIVITY ADD COLUMN UIDISPLAYABLE DECIMAL(20,0);
ALTER TABLE DMACTIVITY ADD COLUMN MANAGINGTOOL DECIMAL(20,0);

CREATE TABLE BRANCH_ZIP (
        BRANCH_ZIP_ID DECIMAL(20,0) NOT NULL,
        BRANCH_ID VARCHAR(4),
        COUNTRY_CD VARCHAR(3),
        LOW_POSTAL_CD VARCHAR(10),
        HIGH_POSTAL_CD VARCHAR(10),
        DISPLAY_FL VARCHAR(1),
        SALES_ORG VARCHAR(10),
        SALES_OFFICE VARCHAR(10)
    );

CREATE TABLE PLTEMPLATEREL (
        PAGELAYOUT_ID BIGINT NOT NULL,
        TEMPLATE_ID BIGINT NOT NULL,
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );


CREATE TABLE PLLOCATION (
        PLLOCATION_ID DECIMAL(20,0) NOT NULL,
        PAGELAYOUT_ID BIGINT NOT NULL,
        DMACTIVITY_ID BIGINT NOT NULL,
        GROUPNUMBER DECIMAL(20,0) NOT NULL,
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE XROLEREQUEST (
        USERS_ID DECIMAL(20,0) NOT NULL,
        ORGANIZATION_ID BIGINT NOT NULL,
        APPROVER_ID DECIMAL(20,0),
        ROLE_ID DECIMAL(20,0),
        MBRGRP_ID BIGINT NOT NULL,
        STATUS DECIMAL(20,0) NOT NULL,
        OPTCOUNTER DECIMAL(20,0)
    );

CREATE TABLE XORDITEMRELEASE (
        XORDITEMRELEASE_ID DECIMAL(19 , 0) NOT NULL,
        ORDERITEMS_ID DECIMAL(19 , 0) NOT NULL,
        ORDRELEASENUM DECIMAL(10 , 0) NOT NULL,
        QUANTITY DECIMAL(20 , 5) NOT NULL,
        FIELD1 VARCHAR(254),
        FIELD2 VARCHAR(254),
        LASTUPDATE TIMESTAMP
    );

CREATE TABLE PLWIDGETDEFDESC (
        PLWIDGETDEF_ID DECIMAL(20,0) NOT NULL,
        LANGUAGE_ID DECIMAL(20,0) NOT NULL,
        DISPLAYNAME VARCHAR(256) NOT NULL,
        DESCRIPTION VARCHAR(1024) NOT NULL,
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE XMSG (
        XMSG_ID DECIMAL(20 , 0) NOT NULL,
        STOREENT_ID DECIMAL(20 , 0) NOT NULL,
        ENTITY_ID DECIMAL(20 , 0) NOT NULL,
        ENTITY_TYPE VARCHAR(64),
        REQUEST BLOB,
        RESPONSE BLOB,
        LAST_UPDATE TIMESTAMP,
        FIELD1 DECIMAL(20 , 0),
        FIELD2 VARCHAR(256),
        FIELD3 VARCHAR(256),
        FIELD4 BLOB,
        OPTCOUNTER DECIMAL(20,0)
    );

CREATE TABLE XBOOKMARKS (
        BOOKMARK_ID DECIMAL(20,0) NOT NULL,
        USERS_ID DECIMAL(20,0) NOT NULL,
        ORGANIZATION_ID BIGINT NOT NULL,
        URL VARCHAR(4000) NOT NULL,
        BOOKMARK_TYPE VARCHAR(30) NOT NULL,
        TITLE VARCHAR(100) NOT NULL,
        DESCRIPTION VARCHAR(500) NOT NULL,
        OPTCOUNTER DECIMAL(20,0)
    );

CREATE TABLE PLPAGE (
        PLPAGE_ID DECIMAL(20,0) NOT NULL,
        ADMINNAME VARCHAR(256) NOT NULL,
        MEMBER_ID BIGINT NOT NULL,
        STOREENT_ID DECIMAL(20,0) NOT NULL,
        PAGELAYOUTTYPE_ID VARCHAR(32) NOT NULL,
        DELETABLE DECIMAL(20,0) NOT NULL,
        ADMINNAMEEDITABLE DECIMAL(20,0) NOT NULL,
        URLCONFIGURABLE DECIMAL(20,0) NOT NULL,
        FIELD1 DECIMAL(20,0),
        FIELD2 VARCHAR(256),
        FIELD3 VARCHAR(256),
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

ALTER TABLE STGMERTAB ADD COLUMN UPDATABLE_UK_COL VARCHAR(128);

CREATE TABLE SRCHATTRDESC (
        SRCHATTR_ID DECIMAL(20,0) NOT NULL,
        LANGUAGE_ID DECIMAL(20,0) NOT NULL,
        DISPLAYNAME VARCHAR(256),
        DESCRIPTION VARCHAR(512),
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE XFORM_RESALE_ADDRESS (
        FORM_ID DECIMAL(20,0) NOT NULL,
        FORM_VERSION_ID DECIMAL(20,0) NOT NULL,
        STORE_ID DECIMAL(20,0) NOT NULL,
        FORM_QUESTION_ID DECIMAL(20,0) NOT NULL,
        FORM_RESALE_ADDRESS_ID DECIMAL(20,0) NOT NULL,
        FORM_RESPONSE_ID DECIMAL(20,0) NOT NULL,
        RESALE_ADDRESS_TX_01 VARCHAR(200),
        RESALE_ADDRESS_TX_02 VARCHAR(50),
        RESALE_ADDRESS_TX_03 VARCHAR(50),
        RESALE_CITY_NM VARCHAR(128),
        RESALE_COMPANY_NM VARCHAR(128),
        RESALE_COUNTRY_NM VARCHAR(128),
        RESALE_STATE_NM VARCHAR(128),
        RESALE_POSTAL_CD VARCHAR(40)
    );

CREATE TABLE FACETDESC (
        FACET_ID DECIMAL(20,0) NOT NULL,
        LANGUAGE_ID DECIMAL(20,0) NOT NULL,
        NAME VARCHAR(256) NOT NULL,
        DESCRIPTION VARCHAR(256),
        FIELD1 DECIMAL(20,0),
        FIELD2 VARCHAR(256),
        FIELD3 VARCHAR(256),
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE XFORM_RESPONSE (
        FORM_ID DECIMAL(20,0) NOT NULL,
        FORM_VERSION_ID DECIMAL(20,0) NOT NULL,
        STORE_ID DECIMAL(20,0) NOT NULL,
        FORM_RESPONSE_ID DECIMAL(20,0) NOT NULL,
        LANGUAGE_ID DECIMAL(20,0) NOT NULL,
        ORG_ID VARCHAR(254),
        PARTY_ID VARCHAR(254),
        USERS_ID DECIMAL(20,0) NOT NULL
    );

CREATE TABLE XFORM_RESPONSE_EXPORT_COMP (
        FORM_ID DECIMAL(20,0) NOT NULL,
        FORM_VERSION_ID DECIMAL(20,0) NOT NULL,
        STORE_ID DECIMAL(20,0) NOT NULL,
        FORM_RESPONSE_ID DECIMAL(20,0) NOT NULL,
        ADDRESS_ID BIGINT NOT NULL,
        ORDERS_ID DECIMAL(20,0) NOT NULL
    );

ALTER TABLE STGSITETAB ADD COLUMN UPDATABLE_UK_COL VARCHAR(128);

CREATE TABLE XMANFOVERRIDE (
        CATGROUP_ID BIGINT NOT NULL,
        STOREENT_ID DECIMAL(20,0) NOT NULL,
        OVERRIDE VARCHAR(254),
        LASTUPDATED TIMESTAMP,
        FIELD1 VARCHAR(254),
        FIELD2 VARCHAR(254),
        OPTCOUNTER DECIMAL(20,0)
    );

CREATE TABLE X_ORDER_SOFTWARE (
        ORDERS_ID DECIMAL(20,0),
        EMAIL_ADDRESS_TX VARCHAR(255),
        FIRST_NM VARCHAR(30),
        LAST_NM VARCHAR(30),
        SOFTWARE_PROCESS_CD VARCHAR(3),
        SOFTWARE_VOUCHER_NO VARCHAR(50),
        APPL_CREATE_DT TIMESTAMP,
        APPL_UPDATE_DT TIMESTAMP,
        SOFTWARE_AUTHORIZER_CD VARCHAR(1)
    );

CREATE TABLE PLWIDGETDEF (
        PLWIDGETDEF_ID DECIMAL(20,0) NOT NULL,
        STOREENT_ID DECIMAL(20,0) NOT NULL,
        IDENTIFIER VARCHAR(256) NOT NULL,
        UI_OBJECT_NAME VARCHAR(128),
        VENDOR VARCHAR(128) NOT NULL,
        WIDGETTYPE DECIMAL(20,0) NOT NULL,
        JSPPATH VARCHAR(512) NOT NULL,
        DEFINITIONXML CLOB NOT NULL,
        STATE DECIMAL(20,0) NOT NULL,
        CREATEDATE TIMESTAMP NOT NULL,
        LASTUPDATE TIMESTAMP NOT NULL,
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE PLSTOREWIDGET (
        PLSTOREWIDGET_ID DECIMAL(20,0) NOT NULL,
        STOREENT_ID DECIMAL(20,0) NOT NULL,
        PLWIDGETDEF_ID DECIMAL(20,0) NOT NULL,
        STATE DECIMAL(20,0) NOT NULL,
        DEFINITIONXML CLOB,
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE XPREFERREDADDRESS (
        USERS_ID DECIMAL(20,0) NOT NULL,
        ORGANIZATION_ID BIGINT NOT NULL,
        ADDRESS_ID BIGINT NOT NULL,
        FLAG VARCHAR(10),
        OPTCOUNTER DECIMAL(20,0)
    );

CREATE TABLE XACCOUNTPREFERENCE (
        USERS_ID DECIMAL(19 , 0) NOT NULL,
        ORGENTITY_ID DECIMAL(30 , 0) NOT NULL,
        PREFERENCETYPE VARCHAR(24) NOT NULL,
        PREFERENCE_ID VARCHAR(4000)
    );

CREATE TABLE DMEMSPOTCOLLDEF (
        DMEMSPOTCOLLDEF_ID BIGINT NOT NULL,
        EMSPOT_ID BIGINT NOT NULL,
        STOREENT_ID DECIMAL(20,0) NOT NULL,
        COLLATERAL_ID BIGINT NOT NULL,
        SEQUENCE DECIMAL(20,0) NOT NULL,
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

CREATE TABLE XFORM_OPTION (
        FORM_ID DECIMAL(20,0) NOT NULL,
        FORM_VERSION_ID DECIMAL(20,0) NOT NULL,
        FORM_QUESTION_ID DECIMAL(20,0) NOT NULL,
        FORM_OPTION_ID DECIMAL(20,0) NOT NULL,
        SORT_ORDER_NO DECIMAL(20,0) NOT NULL,
        DEPENDENT_QUESTION_SET_ID DECIMAL(20,0)
    );

CREATE TABLE STOREPLTYPES (
        PAGELAYOUTTYPE_ID VARCHAR(32) NOT NULL,
        STOREENT_ID DECIMAL(20,0) NOT NULL,
        VIEWNAME VARCHAR(256) NOT NULL,
        OPTCOUNTER DECIMAL(20,0) NOT NULL
    );

    
    
