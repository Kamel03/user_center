--基本信息统计报表序列
create sequence s_baseSituationStatement
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
--新人口模型新增
-- Create sequence
create sequence S_BASEINFO
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
-- Create sequence
create sequence s_addressInfo
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
-- Create sequence
create sequence s_RECOVERDATAINFOS
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
------------------

-- Create sequence
create sequence S_APPROVALITEMFILE
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

  -- Create sequence
create sequence S_APPROVALITEM
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
  -- Create sequence
create sequence S_ITEMATTACHMENTS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
  -- Create sequence
create sequence s_issueEvaluate
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

  -- Create sequence
create sequence S_ITEMS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create sequence S_platformMessagesAttachFiles
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

-- Create sequence
create sequence S_INCIDENTSTEPFEEDBACKS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

-- Create sequence
create sequence s_JOBMONITOR
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

-- Create sequence
create sequence S_INCIDENTSTEPS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

-- Create sequence
create sequence S_INCIDENTS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;


-- Create sequence
create sequence S_INCIDENTDEALPLANS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

-- Create sequence
create sequence S_INCIDENTTYPES
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

-- Create sequence
create sequence S_INCIDENTDEALTEAMS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

-- Create sequence
create sequence S_INCIDENTPLANSTEPS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create sequence s_callserviceteam
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_houseInfo
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_rentalhouse
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;



create sequence S_HOUSEHOLDSTAFF
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence S_CENSUSREGISTERFAMILY
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_overseaPersonnel
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_populationTypes
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_assessmentLog
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_assessmentUsers
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence S_ISSUEINSPECTDETAIL
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_attentionObjects
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_comprehensiveManageMembers
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_contacters
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_dailyDirectorys
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_dailyLogAttachFiles
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_dailyLogs
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_dailyYears
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_dangerousGoodsPractitioners
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_druggys
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

 create sequence s_unemployedPeople
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;

create sequence s_participatedProgram
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;


create sequence s_optimalObjects
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_partyMemberInfos
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_partyOrgInfos
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_partyOrgActivitys
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_partyOrgActivityFiles
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_enterprises
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_examineCatalogs
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_examineItems
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_examinePlans
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_examineScoreRecords
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_examineScores
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_gridTerms
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_historicalIssues
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_hospitals
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_idleYouths
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;


create sequence s_issueInvestigationMediate
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_issueLogs
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_issueStep
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_issueStepGroups
 increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_issueStatueStanals
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_issueTypeDomains
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_issueTypeStanals
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_issueTypes
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_issues
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_documents
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_documentsHasOrg
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_lettingHouses
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_mentalPatients
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_messageTargetAttachFiles
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;



create sequence s_newSocietyOrganizations
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_organizations
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_otherLocales
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;


create sequence s_constructionUnits
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_overTimeIssueLog
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_permissions
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_personnelMessageTargets
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_personnelMessages
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_outboxPlatformMessages
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_inboxPlatformMessages
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
create sequence s_userHasPlatformMessageTypes
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_personnelmessagesAttachFiles
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_poorpeople
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_positiveInfos
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_proclamations
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_propertyDicts
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_propertyDomains
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_publicltyCass
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_rectificativePersons
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

 create sequence s_issueDealStats
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_regradedPoints
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_roles
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_schools
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;


create sequence s_smsReceivedBoxs
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_smsSendBoxs
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;



create sequence s_statRegradedPoint
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_statementStatistics
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_superiorVisits
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_superviseLog
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_systemKeyInfos
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_systemLogs
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_userSessions
increment by 1
start with 1
 minvalue 1
 maxvalue 9999999999;

create sequence s_users
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_villageProfiles
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_workBulletinAttachFiles
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_workBulletins
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_workCalendars
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_keyplaces
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

create sequence s_helpPersonnels
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_helpPrecords
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;



create sequence s_workDiarys
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_societySafeCheck
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create sequence s_evaluates
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_detailedRules
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_detailedRuleDailyLogRelas
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

 -- Create sequence
create sequence s_issueinspect
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create sequence s_scoreStandard
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create sequence s_workingRecords
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create sequence s_entourages
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create sequence s_socialrelations
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create sequence s_userhasPlatformMessages
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;

create sequence s_issueDealingHestories
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_floatingPopulations
 increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_unsettledPopulations
 increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_actualPopulations
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create sequence s_housinginfo
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;


create sequence s_BUILDINGDATAS
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create sequence s_desktopMenu
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create sequence s_nurturesWomen
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 99999999999;

create sequence s_aidNeedPopulation
 increment by 1
 start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_newEconomicOrganizations
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;

create sequence s_partyConstructionFiles
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;

create sequence s_dangerousChemicalsUnit
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_undergroundSpace
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_dustbin
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_oldTree
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

create sequence s_cleaner
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

create sequence s_communalFacilities
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

create sequence s_roadTraffic
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;


create sequence s_landscaping
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

create sequence s_housingAndLand
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;


create sequence s_otherFacilities
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

create sequence s_partyAbilityPersons
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_teamInfos
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_issueHasAttachFile
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_documentsHasAttachFiles
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create sequence s_publicNotice
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_moduelClickCounts
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence s_topIssues
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create sequence S_PRIMARYORGANIZATIONS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
 
create sequence S_PRIMARYORGMEMBERS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create sequence S_CENSUSREGISTERFAMILYS 
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;


--创建其他人员的序列
create sequence S_OTHERATTENTIONPERSONNEL
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;  
 
create sequence s_gridManagementNormal
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
    
--社会服务管理中心建设表
create sequence s_serviceManagement
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
--系列平安创建表
create sequence s_seriesSecurity
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
--社会治安防控体系建设表
create sequence s_societySecurity
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
--平安综治宣传
create sequence s_SecurityPropaganda
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
 --附件表
create sequence s_daily_attachfiles
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

--房屋轨迹表
create sequence S_HOUSETRACKS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--组织场所轨迹表 
create sequence S_ORGLOCATIONTRACKS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--操作日志表 
create sequence s_systemOperateLogs
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--岗位修改日志表
create sequence s_roleUpdateLog
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

-----区域党委成员
create sequence s_regionalPartyMembers
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

-----区域联建情况
create sequence s_regionalBuildInfos
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;
------区域联建情况附件
create sequence S_regionalBuildInfoAttachFiles
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20; 

------区域联建情况认领
create sequence S_claimRegionalBuildInfos
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20; 

/*==============================================================*/
/* 新人口模型新增表				    							*/
/*==============================================================*/
--人员基本信息
create table BASEINFO 
(
   ID                   NUMBER(10)           not null,
   NAME                 VARCHAR2(60)         not null,
   FULLPINYIN           VARCHAR2(30),
   SIMPLEPINYIN         VARCHAR2(10),
   USEDNAME             VARCHAR2(60),
   IDCARDNO             VARCHAR2(60),
   TELEPHONE            VARCHAR2(80),
   MOBILENUMBER         VARCHAR2(50),
   BIRTHDAY             DATE,
   GENDER               NUMBER(10)           not null,
   WORKUNIT             VARCHAR2(150),
   IMGURL               VARCHAR2(300),
   EMAIL                VARCHAR2(150),
   ISDEATH              NUMBER(1)            default 0,
   NATION               NUMBER(10),
   POLITICALBACKGROUND  NUMBER(10),
   SCHOOLING            NUMBER(10),
   CAREER               NUMBER(10),
   MARITALSTATE         NUMBER(10),
   BLOODTYPE            NUMBER(10),
   FAITH                NUMBER(10),
   STATURE              NUMBER(10),
   PROVINCE             VARCHAR2(60),
   CITY                 VARCHAR2(60),
   DISTRICT             VARCHAR2(60),
   NATIVEPLACEADDRESS   VARCHAR2(150),
   NATIVEPOLICESTATION  VARCHAR2(160),
   CREATEUSER           VARCHAR2(32)         not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                 not null,
   UPDATEDATE           DATE,
   constraint PKBASEINFO primary key (ID)
);

comment on table BASEINFO is
'人员基本信息';

comment on column BASEINFO.ID is
'人员id';

comment on column BASEINFO.NAME is
'姓名';

comment on column BASEINFO.FULLPINYIN is
'全拼';

comment on column BASEINFO.SIMPLEPINYIN is
'简拼';

comment on column BASEINFO.USEDNAME is
'曾用名';

comment on column BASEINFO.IDCARDNO is
'身份证号';

comment on column BASEINFO.TELEPHONE is
'固定电话';

comment on column BASEINFO.MOBILENUMBER is
'手机号码';

comment on column BASEINFO.BIRTHDAY is
'出生日期';

comment on column BASEINFO.GENDER is
'性别';

comment on column BASEINFO.WORKUNIT is
'工作单位';

comment on column BASEINFO.IMGURL is
'图片链接地址';

comment on column BASEINFO.EMAIL is
'电子邮箱';

comment on column BASEINFO.ISDEATH is
'是否死亡';

comment on column BASEINFO.NATION is
'民族';

comment on column BASEINFO.POLITICALBACKGROUND is
'政治面貌';

comment on column BASEINFO.SCHOOLING is
'文化程度';

comment on column BASEINFO.CAREER is
'职业';

comment on column BASEINFO.MARITALSTATE is
'婚姻状况';

comment on column BASEINFO.BLOODTYPE is
'血型';

comment on column BASEINFO.FAITH is
'宗教信仰';

comment on column BASEINFO.STATURE is
'身高';

comment on column BASEINFO.PROVINCE is
'省';

comment on column BASEINFO.CITY is
'市';

comment on column BASEINFO.DISTRICT is
'区县';

comment on column BASEINFO.NATIVEPLACEADDRESS is
'户籍地详址';

comment on column BASEINFO.NATIVEPOLICESTATION is
'户籍派出所';

comment on column BASEINFO.CREATEUSER is
'创建用户';

comment on column BASEINFO.UPDATEUSER is
'修改用户';

comment on column BASEINFO.CREATEDATE is
'创建日期';

comment on column BASEINFO.UPDATEDATE is
'修改时间';

/*==============================================================*/
/* index: indexBaseinfoIdCardNo                                 */
/*==============================================================*/
create index indexBaseinfoIdCardNo on BASEINFO (IDCARDNO);


--地址信息
create table ADDRESSINFO 
(
   ID                   NUMBER(10)           not null,
   ISHAVEHOUSE          NUMBER(1)            default 0,
   NOHOUSEREASON        VARCHAR2(800),
   CURRENTADDRESS       VARCHAR2(150),
   OTHERADDRESS         VARCHAR2(150),
   REMARK               VARCHAR2(900),
   CREATEUSER           VARCHAR2(32)         not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                 not null,
   UPDATEDATE           DATE,
   constraint PKADDRESSINFO primary key (ID)
);

comment on table ADDRESSINFO is
'地址信息';

comment on column ADDRESSINFO.ID is
'人员id';

comment on column ADDRESSINFO.ISHAVEHOUSE is
'是否有房屋';

comment on column ADDRESSINFO.NOHOUSEREASON is
'无房原因';

comment on column ADDRESSINFO.CURRENTADDRESS is
'现在居住地';

comment on column ADDRESSINFO.OTHERADDRESS is
'其他地址';

comment on column ADDRESSINFO.REMARK is
'备注';

comment on column ADDRESSINFO.CREATEUSER is
'创建用户';

comment on column ADDRESSINFO.UPDATEUSER is
'修改用户';

comment on column ADDRESSINFO.CREATEDATE is
'创建日期';

comment on column ADDRESSINFO.UPDATEDATE is
'修改时间';

-- 数据恢复中心
create table RECOVERDATAINFOS
(
  id            	NUMBER(10)		not null,
  moduletype		VARCHAR2(50)	not null,
  businessid		NUMBER(15)		not null,
  businesstype		VARCHAR2(50)	not null,
  baseinfoid		NUMBER(10),
  orgid				NUMBER(10)		not null,
  orgCode         	VARCHAR2(60)	not null,
  name				VARCHAR2(200)	not null,
  fullpinyin		VARCHAR2(30),
  simplepinyin		VARCHAR2(10),
  IDCARDNO			VARCHAR2(60),
  contents			CLOB,
  createuser		VARCHAR2(32)	not null,
  updateuser		VARCHAR2(32),
  createdate		DATE not null,
  updatedate		DATE,
  constraint pkRECOVERDATAINFOS primary key (id)
);
-- Add comments to the columns 
comment on table RECOVERDATAINFOS
  is '数据恢复中心';
comment on column RECOVERDATAINFOS.ID
  is 'ID';
comment on column RECOVERDATAINFOS.MODULETYPE
  is '所属模块';
comment on column RECOVERDATAINFOS.BUSINESSID
  is '业务ID';
comment on column RECOVERDATAINFOS.BUSINESSTYPE
  is '业务类型';
comment on column RECOVERDATAINFOS.BASEINFOID
  is '基础信息ID';
comment on column RECOVERDATAINFOS.ORGID
  is '组织机构ID';
comment on column RECOVERDATAINFOS.ORGCODE
  is '组织机构内置编号';
comment on column RECOVERDATAINFOS.NAME
  is '名称';
comment on column RECOVERDATAINFOS.FULLPINYIN
  is '全拼';
comment on column RECOVERDATAINFOS.SIMPLEPINYIN
  is '简拼';
comment on column RECOVERDATAINFOS.IDCARDNO
  is '身份证号';
comment on column RECOVERDATAINFOS.CONTENTS
  is '存储所有删除信息(GSON对象)';

/*==============================================================*/
/* Table: publicNotice     通知通报                                                                                                            */
/*==============================================================*/

-- Create table
create table publicNotice
(
  ID                      NUMBER(10) not null,
  ORGID                   NUMBER(10) not null,
  ORGINTERNALCODE         VARCHAR2(50),
  CREATEUSER              VARCHAR2(30) not null,
  UPDATEUSER              VARCHAR2(30),
  CREATEDATE              DATE not null,
  UPDATEDATE              DATE,
  publicNoticeTitle       varchar2(200),
  userId                  number(10) ,
  noticeEditor            VARCHAR2(30) not null,
  editorDate              DATE not null,
  publicNoticeMatter      VARCHAR2(1500)  not null,
  overdueDate             DATE  ,
  isAttachment            NUMBER(2) default 0,
  constraint pkpublicNotice primary key (ID)
);

----add comments to publicNotice table
comment on table publicNotice
  is '通知通报';
----add comments to publicNotice colummn
comment on column publicNotice.ID
  is '通知通报ID';
comment on column publicNotice.ORGID
  is '所属网格';
comment on column publicNotice.ORGINTERNALCODE
  is '部门内部编号';
comment on column publicNotice.CREATEUSER
  is '创建用户';
comment on column publicNotice.UPDATEUSER
  is '修改用户';
comment on column publicNotice.CREATEDATE
  is '创建时间';
comment on column publicNotice.UPDATEDATE
  is '修改时间';
comment on column publicNotice.publicNoticeTitle
  is '通知通报标题';
comment on column publicNotice.userId
  is '当前用户ID';
comment on column publicNotice.noticeEditor
  is '当前编辑者';
comment on column publicNotice.editorDate
  is '编辑时间';
comment on column publicNotice.publicNoticeMatter
  is '编辑内容';
comment on column publicNotice.overdueDate
  is '截止时间';



/*==============================================================*/
/* Table: populationTypes                                         */
/*==============================================================*/
create table populationTypes  (
   id                   NUMBER(10)                      not null,
   actualId             NUMBER(15)                      not null,
   actualType           VARCHAR2(32)                    not null,
   populationId         NUMBER(10)                      not null,
   populationType       VARCHAR2(32)                    not null
);
comment on table populationTypes is
'实有人口与业务信息关系表';

comment on column populationTypes.id is
'主键';

comment on column populationTypes.actualId is
'实有人口主键';

comment on column populationTypes.actualType is
'实有人口类型';

comment on column populationTypes.populationId is
'业务人员主键';

comment on column populationTypes.populationType is
'业务人员类型';


/*==============================================================*/
/* Table: assessmentLog                                         */
/*==============================================================*/
create table assessmentLog  (
   id                   NUMBER(10)                      not null,
   assessmentDate       DATE                            not null,
   issuccessful         NUMBER(1)                       not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE
);

comment on column assessmentLog.assessmentDate is
'考核时间';

comment on column assessmentLog.issuccessful is
'考核是否成功，1为成功，0为不成功';

/*==============================================================*/
/* Table: assessmentUsers                                       */
/*==============================================================*/
create table assessmentUsers  (
   id                   NUMBER(10)                      not null,
   userId               NUMBER(10)                      not null,
   userName             VARCHAR2(100)                   not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE
);

comment on column assessmentUsers.userId is
'不纳入考核用户ID';

comment on column assessmentUsers.userName is
'不纳入考核用户名';


/*==============================================================*/
/* Table: organizations                                         */
/*==============================================================*/
create table organizations  (
   id                   NUMBER(10)                      not null,
   parentFunOrgId       NUMBER(10),
   parentId             NUMBER(10),
   orgType              NUMBER(10)                      not null,
   orgLevel             NUMBER(10),
   subCount             NUMBER(10)                     default 0 not null,
   seq                  NUMBER(10)                     default 0 not null,
   maxCode              NUMBER(10)                     default 0 not null,
   subCountFun          NUMBER(10)                     default 0 not null,
   departmentNo         VARCHAR2(32),
   orgName              VARCHAR2(60)                    not null,
   contactWay           VARCHAR2(15),
   orgInternalCode      VARCHAR2(32)                    not null,
   simplePinyin         VARCHAR2(10)                    not null,
   fullpinyin           VARCHAR2(30)                    not null,
   remark               VARCHAR2(600),
   createUser           VARCHAR2(32)                    not null,
   buildingId      		VARCHAR2(30),
   centerX 				NUMBER(10),
   centerY 				NUMBER(10),
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   functionalOrgType              NUMBER(10),
   constraint pkOrganizations primary key (id),
   constraint fkParentOrg foreign key (parentId)
         references organizations (id),
   constraint fkParentFunOrg foreign key (parentFunOrgId)
         references organizations (id)
);

comment on column organizations.parentFunOrgId is
'所属职能部门';

comment on column organizations.orgType is
'部门类型';

comment on column organizations.orgLevel is
'组织机构层级';

comment on column organizations.subCount is
'子部门数';

comment on column organizations.seq is
'序号';

comment on column organizations.maxCode is
'分配子部门最大编码';

comment on column organizations.subCountFun is
'子职能部门数';

comment on column organizations.departmentNo is
'部门编号';

comment on column organizations.orgName is
'部门名称';

comment on column organizations.contactWay is
'部门联系方式';

comment on column organizations.orgInternalCode is
'部门内置类型码';

comment on column organizations.simplePinyin is
'部门名称简拼';

comment on column organizations.fullpinyin is
'部门名称全拼';

comment on column organizations.remark is
'备注';

comment on column organizations.createUser is
'创建用户';

comment on column organizations.updateUser is
'更新用户名';

comment on column organizations.updateDate is
'更新用户';

comment on column organizations.createDate is
'创建日期';

/*==============================================================*/
/* Index: idx_org_parentId_orgType                              */
/*==============================================================*/
create index idx_org_parentId_orgType on organizations (
   parentId ASC,
   orgType ASC
);

/*==============================================================*/
/* Index: idx_org_parentId                                      */
/*==============================================================*/
create index idx_org_parentId on organizations (
   parentId ASC
);

alter table ORGANIZATIONS
  add constraint ORGINTERNALCODE_UNIQUE unique (ORGINTERNALCODE);

alter table ORGANIZATIONS
  add constraint DEPARTMENTNO_UNIQUE unique (DEPARTMENTNO);


/*==============================================================*/
/* Table: houseInfo                                         */
/*==============================================================*/
create table houseInfo  (
   id                   NUMBER(10)                      not null,
   orgId				NUMBER(10)			not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   buildingId      		VARCHAR2(30),
   houseCode            VARCHAR2(150),
   addressType          NUMBER(10),
   community            VARCHAR2(60),
   block 				VARCHAR2(24),
   unit 				VARCHAR2(18),
   room 				VARCHAR2(30),
   address         		VARCHAR2(150)                   not null,
   isRentalHouse        NUMBER(2)			  default 0 not null,
   buildingName      	VARCHAR2(300),
   buildingUses         NUMBER(10),
   propertyName      	VARCHAR2(300),
   houseOwner           VARCHAR2(150),
   houseOwnerIdCardNo   VARCHAR2(18),
   telephone            VARCHAR2(80),
   mobileNumber         VARCHAR2(50),
   houseDoorModel      	VARCHAR2(100),
   builtYear            VARCHAR2(4),
   houseStructure       NUMBER(10),
   houseArea            NUMBER(15,5),
   houseUses            NUMBER(10),
   houseSource          NUMBER(10),
   ownProperty          NUMBER(10),
   rentalBuildings      NUMBER(10),
   housingVouchers      NUMBER(10),
   houseRightNumber   	VARCHAR2(100),
   houseRightNumberDate DATE,
   landDocuments        NUMBER(10),
   landRightsNumbe   	VARCHAR2(100),
   landRightsNumbeDate  DATE,
   propertyTypes        NUMBER(10),
   name  	            VARCHAR2(60),
   fullPinyin	        VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   certificateType      NUMBER(10),
   certificateNumbe     VARCHAR2(60),
   propertyPersonTel    VARCHAR2(80),
   propertyPersonMobile VARCHAR2(50),
   imgUrl               VARCHAR2(300),
   remark               VARCHAR2(900),
   centerX 				NUMBER(10),
   centerY 				NUMBER(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   builddatasId			NUMBER(10),
   centerLon            VARCHAR2(32),
   centerLat		    VARCHAR2(32),
   centerLon2			VARCHAR2(32),
   centerLat2   		VARCHAR2(32),
   featureId		    VARCHAR2(32),
   FLOORAREA NUMBER(10,2),
   ISHASTAPWATER NUMBER(1)  default 0,
   ISHASNET NUMBER(1)  default 0,
   ISHASTOILET NUMBER(1)  default 0,
   ISDANGEROUSBUILDING NUMBER(1)  default 0,
   OCCUPIEDNO VARCHAR2(30),
   OCCUPIEDADDRESS VARCHAR2(150),   
   SOURCESSTATE NUMBER(1)  default 1 ,
   constraint pkHouseInfos primary key (id),
   constraint fkHouseInfoOrg foreign key (orgId)
         references organizations (id)
);

comment on table houseInfo is
'住房信息';

comment on column houseInfo.id is
'主键';

comment on column houseInfo.orgId is
'所属网格';

comment on column houseInfo.orgInternalCode is
'网格编号';

comment on column houseInfo.houseCode is
'住房编号';

comment on column houseInfo.address is
'住房地址';

comment on column houseInfo.isRentalHouse is
'是否出租房';

comment on column houseInfo.addressType is
'常住地址类型';

comment on column houseInfo.community is
'常住地址商品房 小区';

comment on column houseInfo.block is
'常住地址商品房 幢';

comment on column houseInfo.unit is
'常住地址商品房 单元';

comment on column houseInfo.room is
'常住地址商品房  室';

comment on column houseInfo.houseOwner is
'代表人/业主';

comment on column houseInfo.houseOwnerIdCardNo is
'业主身份证号码';

comment on column houseInfo.mobileNumber is
'业主联系手机';

comment on column houseInfo.telephone is
'业主联系电话';

comment on column houseInfo.houseStructure is
'住房结构';

comment on column houseInfo.houseArea is
'住房面积';

comment on column houseInfo.remark is
'备注';

comment on column houseInfo.buildingName is
'建筑物名称';

comment on column houseInfo.buildingUses is
'建筑物用途 ';

comment on column houseInfo.propertyName is
'物业管理单位名称 ';

comment on column houseInfo.houseDoorModel is
'房屋户型';

comment on column houseInfo.builtYear is
'建成年份';

comment on column houseInfo.houseUses is
'房屋用途';

comment on column houseInfo.houseSource is
'房屋来源';

comment on column houseInfo.ownProperty is
'自有产权';

comment on column houseInfo.rentalBuildings is
'租赁公房';

comment on column houseInfo.housingVouchers is
'房屋凭证';

comment on column houseInfo.houseRightNumber is
'房屋权证号';

comment on column houseInfo.houseRightNumberDate is
'房屋权证发证时间';

comment on column houseInfo.landDocuments is
'土地凭证';

comment on column houseInfo.landRightsNumbe is
'土地权证号';

comment on column houseInfo.landRightsNumbeDate is
'土地权证发证时间';

comment on column houseInfo.propertyTypes is
'产权人类型';

comment on column houseInfo.name is
'产权人名称';

comment on column houseInfo.certificateType is
'证件类型';

comment on column houseInfo.certificateNumbe is
'证件号码';

comment on column houseInfo.propertyPersonTel is
'产权人联系电话';

comment on column houseInfo.propertyPersonMobile is
'产权人联系手机';

comment on column houseInfo.createUser is
'创建用户';

comment on column houseInfo.updateUser is
'更新用户名';

comment on column houseInfo.updateDate is
'更新用户';

comment on column houseInfo.createDate is
'创建日期';

comment on column houseInfo.builddatasId is
'楼宇编号';

comment on column houseInfo.centerlon is
'二维地图经度';

comment on column houseInfo.centerlat is
'二维地图纬度';

comment on column houseInfo.featureid is
'二维地图热区Id';
comment on column HOUSEINFO.FLOORAREA is
'占地面积';
comment on column HOUSEINFO.ISHASTAPWATER is
'自来水是否已入户';
comment on column HOUSEINFO.ISHASNET is
'互连网是否已入户';
comment on column HOUSEINFO.ISHASTOILET is
'是否有卫生厕所';
comment on column HOUSEINFO.ISDANGEROUSBUILDING is
'是否危房';
comment on column HOUSEINFO.OCCUPIEDNO is
'出租房房产证';
comment on column HOUSEINFO.OCCUPIEDADDRESS is
'出租房地址';

/*==============================================================*/
/* Table: rentalhouse                                         */
/*==============================================================*/
create table rentalhouse  (
   id                   NUMBER(10)                      not null,
   orgId				NUMBER(10)						not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   buildingId      		VARCHAR2(30),
   houseCode            VARCHAR2(150),
   addressType          NUMBER(10),
   community            VARCHAR2(60),
   block 				VARCHAR2(24),
   unit 				VARCHAR2(18),
   room 				VARCHAR2(30),
   address         		VARCHAR2(150)                   not null,
   buildingName      	VARCHAR2(300),
   buildingUses         NUMBER(10),
   propertyName      	VARCHAR2(300),
   houseOwner           VARCHAR2(150),
   houseOwnerIdCardNo   VARCHAR2(18),
   telephone            VARCHAR2(80),
   mobileNumber         VARCHAR2(50),
   houseDoorModel      	VARCHAR2(100),
   builtYear            VARCHAR2(4),
   houseStructure       NUMBER(10),
   houseArea            NUMBER(15,5),
   houseUses            NUMBER(10),
   houseSource          NUMBER(10),
   ownProperty          NUMBER(10),
   rentalBuildings      NUMBER(10),
   housingVouchers      NUMBER(10),
   houseRightNumber   	VARCHAR2(100),
   houseRightNumberDate DATE,
   landDocuments        NUMBER(10),
   landRightsNumbe   	VARCHAR2(100),
   landRightsNumbeDate  DATE,
   propertyTypes        NUMBER(10),
   name  	            VARCHAR2(60),
   fullPinyin	        VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   certificateType      NUMBER(10),
   certificateNumbe     VARCHAR2(50),
   propertyPersonTel    VARCHAR2(80),
   propertyPersonMobile VARCHAR2(50),
   imgUrl               VARCHAR2(300),
   remark               VARCHAR2(900),
   centerX 				NUMBER(10),
   centerY 				NUMBER(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   usage                NUMBER(10),
   houseFileNum         VARCHAR2(150),
   lessorType           NUMBER(10),
   rentalPerson           VARCHAR2(150),
   rentalCertificateType NUMBER(10),
   rentalCertificateNumbe  VARCHAR2(50),
   rentalTelephone         VARCHAR2(80),
   rentalMobileNumber      VARCHAR2(50),
   lessorAddress        VARCHAR2(150),
   hiddenDangerLevel    NUMBER(10),
   mangerTypes          NUMBER(10),
   lessorDate           DATE,
   roomNumber           NUMBER(10),
   rentMonth            NUMBER(10,2),
   isFireChannels       NUMBER(2) default 0,
   isSafetyChannel      NUMBER(2) default 0,
   isSignGuarantee      NUMBER(2) default 0,
   isEmphasis	        NUMBER(2) default 0,
   sourcesState number(1) default 1,
   rentalProperty       NUMBER(10),
   registDate           DATE,
   type                NUMBER(10),
   limitPersons         NUMBER(6),
   hiddenRectification  VARCHAR2(600),
   houseId              NUMBER(10),
   LETTINGHOUSEPROPERTY NUMBER(10),
   REALITYPERSONS NUMBER(6),
   constraint pkRentalhouse primary key (id),
   constraint fkRentalhouseOrg foreign key (orgId)
         references organizations (id)
);

comment on table rentalhouse is
'出租房信息';

comment on column rentalhouse.id is
'主键';

comment on column rentalhouse.orgId is
'所属网格';

comment on column rentalhouse.orgInternalCode is
'网格编号';

comment on column rentalhouse.houseCode is
'住房编号';

comment on column rentalhouse.address is
'常住地址';

comment on column rentalhouse.addressType is
'常住地址类型';

comment on column rentalhouse.community is
'常住地址商品房 小区';

comment on column rentalhouse.block is
'常住地址商品房 幢';

comment on column rentalhouse.unit is
'常住地址商品房 单元';

comment on column rentalhouse.room is
'常住地址商品房  室';

comment on column rentalhouse.houseOwner is
'代表人/业主';

comment on column rentalhouse.houseOwnerIdCardNo is
'业主身份证号码';

comment on column rentalhouse.mobileNumber is
'业主联系手机';

comment on column rentalhouse.telephone is
'业主联系电话';

comment on column rentalhouse.houseStructure is
'住房结构';

comment on column rentalhouse.houseArea is
'住房面积';

comment on column rentalhouse.remark is
'备注';

comment on column rentalhouse.buildingName is
'建筑物名称';

comment on column rentalhouse.buildingUses is
'建筑物用途 ';

comment on column rentalhouse.propertyName is
'物业管理单位名称 ';

comment on column rentalhouse.houseDoorModel is
'房屋户型';

comment on column rentalhouse.builtYear is
'建成年份';

comment on column rentalhouse.houseUses is
'房屋用途';

comment on column rentalhouse.houseSource is
'房屋来源';

comment on column rentalhouse.ownProperty is
'自有产权';

comment on column rentalhouse.rentalBuildings is
'租赁公房';

comment on column rentalhouse.housingVouchers is
'房屋凭证';

comment on column rentalhouse.houseRightNumber is
'房屋权证号';

comment on column rentalhouse.houseRightNumberDate is
'房屋权证发证时间';

comment on column rentalhouse.landDocuments is
'土地凭证';

comment on column rentalhouse.landRightsNumbe is
'土地权证号';

comment on column rentalhouse.landRightsNumbeDate is
'土地权证发证时间';

comment on column rentalhouse.propertyTypes is
'产权人类型';

comment on column rentalhouse.name is
'产权人名称';

comment on column rentalhouse.certificateType is
'证件类型';

comment on column rentalhouse.certificateNumbe is
'证件号码';

comment on column rentalhouse.propertyPersonTel is
'产权人联系电话';

comment on column rentalhouse.propertyPersonMobile is
'产权人联系手机';

comment on column rentalhouse.createUser is
'创建用户';

comment on column rentalhouse.updateUser is
'更新用户名';

comment on column rentalhouse.updateDate is
'更新用户';

comment on column rentalhouse.createDate is
'创建日期';

comment on column rentalhouse.usage is
'出租房用途';

comment on column rentalhouse.houseFileNum is
'租赁备案证号';

comment on column rentalhouse.lessorType is
'出租人类型';

comment on column rentalhouse.rentalPerson is
'出租人';

comment on column rentalhouse.rentalCertificateType is
'出租人证件类型';

comment on column rentalhouse.rentalCertificateNumbe is
'出租人证件号码';

comment on column rentalhouse.rentalTelephone is
'出租人联系电话';

comment on column rentalhouse.rentalMobileNumber is
'出租人联系手机';

comment on column rentalhouse.lessorAddress is
'出租人联系地址';

comment on column rentalhouse.hiddenDangerLevel is
'隐患等级';

comment on column rentalhouse.mangerTypes is
'管理类别';

comment on column rentalhouse.lessorDate is
'出租时间';

comment on column rentalhouse.roomNumber is
'出租间数';

comment on column rentalhouse.rentMonth is
'月租金';

comment on column rentalhouse.isFireChannels is
'有无消防通道';

comment on column rentalhouse.isSafetyChannel is
'有无安全通道';

comment on column rentalhouse.isSignGuarantee is
'是否签订治安责任保证书';

comment on column rentalhouse.isEmphasis is
'是否注销';
comment on column rentalhouse.sourcesState
  is '数据来源：1.录入；2.认领；3.已核实';
comment on column rentalhouse.rentalProperty
  is '出租房属性';
comment on column rentalhouse.registDate
  is '注册时间';
comment on column rentalhouse.type
  is '出租房类别';
comment on column rentalhouse.limitPersons
  is '限制人数'; 
comment on column rentalhouse.hiddenRectification
  is '隐患情况'; 
comment on column rentalhouse.houseId
  is '实有房屋id';
comment on column rentalhouse.LETTINGHOUSEPROPERTY
  is '出租房性质';
comment on column rentalhouse.REALITYPERSONS 
  is '实住人数';

/*==============================================================*/
/* Table: attentionObjects                                      */
/*==============================================================*/
create table attentionObjects  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   gender               NUMBER(10)                      not null,
   attentionReason      VARCHAR2(300)                   not null,
   workUnit             VARCHAR2(150),
   nativePlaceAddress   VARCHAR2(150),
   nativePoliceStation  VARCHAR2(160),
   currentlyAddress     VARCHAR2(150),
   nativeProvince       VARCHAR2(60),
   nativeCity           VARCHAR2(60),
   nativeDistrict       VARCHAR2(60),
   name                 VARCHAR2(60)                    not null,
   idCardNo             VARCHAR2(18),
   telephone            VARCHAR2(15),
   mobileNumber         VARCHAR2(11),
   orgInternalCode      VARCHAR2(32)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   remark               VARCHAR2(600),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   birthday             DATE,
    isEmphasis           NUMBER(1)                      default 0,
   constraint pkAttentionObjects primary key (id),
   constraint fkAttentionObjectsOrg foreign key (orgId)
         references organizations (id)
);

comment on table attentionObjects is
'其他关注对象表';

comment on column attentionObjects.orgId is
'所属网格';

comment on column attentionObjects.gender is
'性别';

comment on column attentionObjects.attentionReason is
'关注原因';

comment on column attentionObjects.workUnit is
'工作单位或就读学校';

comment on column attentionObjects.nativePlaceAddress is
'户籍地详址';

comment on column attentionObjects.nativePoliceStation is
'户籍派出所';

comment on column attentionObjects.currentlyAddress is
'现在居住地';

comment on column attentionObjects.nativeProvince is
'省';

comment on column attentionObjects.nativeCity is
'市';

comment on column attentionObjects.nativeDistrict is
'区县';

comment on column attentionObjects.name is
'姓名';

comment on column attentionObjects.idCardNo is
'身份证号码';

comment on column attentionObjects.telephone is
'固定电话';

comment on column attentionObjects.mobileNumber is
'手机号码';

comment on column attentionObjects.orgInternalCode is
'所属责任区编号';

comment on column attentionObjects.fullPinyin is
'全拼';

comment on column attentionObjects.simplePinyin is
'简拼';

comment on column attentionObjects.remark is
'备注';

comment on column attentionObjects.createUser is
'创建用户';

comment on column attentionObjects.updateUser is
'修改用户';

comment on column attentionObjects.createDate is
'创建日期';

comment on column attentionObjects.updateDate is
'修改时间';

comment on column attentionObjects.birthday is
'出生日期';

/*==============================================================*/
/* Index: idx_AO_orgIdAndidCardNo                          */
/*==============================================================*/
create unique index idx_AO_orgIdAndidCardNo on attentionObjects (
   orgId ASC,
   idCardNo ASC
);

create index idx_AO_orgIntCodeAndisEmphasis on attentionObjects (
   orgInternalCode ASC,
   isEmphasis ASC
);

create sequence s_servicePersons
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
  /*==============================================================*/
/* Table: servicePersons                                        */
/*==============================================================*/
create table servicePersons  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   name                 VARCHAR2(30)                    not null,
   phone                VARCHAR2(15),
   position             VARCHAR2(60),
   orgInternalCode      VARCHAR2(32)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkServicePersons primary key (id),
   constraint fkServicePersonsOrg foreign key (orgId)
         references organizations (id)
);

comment on table servicePersons is
'服务队成员';

comment on column servicePersons.orgId is
'所属责任区';

comment on column servicePersons.name is
'姓名';

comment on column servicePersons.phone is
'电话';

comment on column servicePersons.position is
'职务';

comment on column servicePersons.orgInternalCode is
'所属责任区编号';

comment on column servicePersons.fullPinyin is
'全拼音';

comment on column servicePersons.simplePinyin is
'姓名简拼';

comment on column servicePersons.createUser is
'创建用户';

comment on column servicePersons.updateUser is
'更新用户名';

comment on column servicePersons.createDate is
'创建日期';

comment on column servicePersons.updateDate is
'更新用户';

/*==============================================================*/
/* Table: enterprises                                           */
/*==============================================================*/
create table enterprises  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   employeeAmount       NUMBER(10),
   partyMemberAmount    NUMBER(10),
   industry             NUMBER(10),
   type                 NUMBER(10)                      not null,
   isRiskEnterprise     NUMBER(1)                      default 0,
   area                 NUMBER(15,5),
   registeredCapital    NUMBER(15,5),
   name                 VARCHAR2(150)                   not null,
   businessLicense      VARCHAR2(60),
   legalPerson          VARCHAR2(60)                    not null,
   hiddenCases          VARCHAR2(300),
   hiddenRectification  VARCHAR2(300),
   remark               VARCHAR2(600),
   createUser           VARCHAR2(32),
   updateUser           VARCHAR2(32),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   orgInternalCode      VARCHAR2(32)                    not null,
   telephone            VARCHAR2(15),
   enterpriseTelephone  VARCHAR2(15),
   mobileNumber         VARCHAR2(11),
   fax                  VARCHAR2(15),
   imgUrl               VARCHAR2(300),
   address              VARCHAR2(150)                   not null,
   createDate           DATE                            not null,
   updateDate           DATE,
   keyType				VARCHAR2(32),
   isEmphasis           NUMBER(1)                      default 0,
   isEmphasisReason     VARCHAR2(300),
   isEmphasisDate       DATE,
   renovatetype NUMBER(10),
   sourcesState number(1) default 1,
   attentionExtent      NUMBER(10),
   constraint pkEnterprise primary key (id),
   constraint fkEnterprisesOrg foreign key (orgId)
         references organizations (id)
);

comment on table enterprises is
'规上企业';

comment on column enterprises.orgId is
'所属网格';

comment on column enterprises.employeeAmount is
'员工数量';

comment on column enterprises.partyMemberAmount is
'党员数量';

comment on column enterprises.industry is
'所属行业';

comment on column enterprises.type is
'类型';

comment on column enterprises.isRiskEnterprise is
'是否危化企业（0为‘否’，1为''是''）';

comment on column enterprises.area is
'面积（单位为‘平方米’）';

comment on column enterprises.registeredCapital is
'注册资金（单位为‘万’）';

comment on column enterprises.name is
'企业名称';

comment on column enterprises.businessLicense is
'工商执照号码';

comment on column enterprises.legalPerson is
'法人代表';

comment on column enterprises.hiddenCases is
'隐患情况';

comment on column enterprises.hiddenRectification is
'隐患整改情况';

comment on column enterprises.remark is
'备注';

comment on column enterprises.createUser is
'创建用户';

comment on column enterprises.updateUser is
'修改用户';

comment on column enterprises.fullPinyin is
'全拼';

comment on column enterprises.simplePinyin is
'简拼';

comment on column enterprises.orgInternalCode is
'所属责任区编号';

comment on column enterprises.telephone is
'法人电话';

comment on column enterprises.enterpriseTelephone is
'企业电话';

comment on column enterprises.mobileNumber is
'法人手机号码';

comment on column enterprises.fax is
'传真';

comment on column enterprises.address is
'地址';

comment on column enterprises.createDate is
'创建日期';

comment on column enterprises.updateDate is
'修改时间';
comment on column ENTERPRISES.renovatetype
  is '挂牌整治:1 省挂牌整治、2 市挂牌整治、3县挂牌整治';

comment on column enterprises.isEmphasis is
'是否关注';
comment on column enterprises.sourcesState is
 '数据来源：1.录入；2.认领；3.已核实';
comment on column enterprises.attentionExtent is
'关注程度：1.一般；2.中等；3.严重';


/*==============================================================*/
/* Index: idx_Enterprise_orgIntCode                             */
/*==============================================================*/
create index idx_Enterprise_orgIntCode on enterprises (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Index: idx_EP_orgIntCodeAndNameAndKeyType                    */
/*==============================================================*/
create unique index idx_EP_orgIdAndNAndK on enterprises (
   orgId ASC,
   name ASC,
   keyType ASC
);

/*==============================================================*/
/* Table: comprehensiveManageMembers                            */
/*==============================================================*/
create table comprehensiveManageMembers  (
   id                   NUMBER(10)                      not null,
   enterpriseId         NUMBER(10)                      not null,
   type                 NUMBER(10)                      not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   name                 VARCHAR2(60)                    not null,
   telephone            VARCHAR2(15),
   mobileNumber         VARCHAR2(11),
   updateDate           DATE,
   createDate           DATE                            not null,
   constraint pkMembersEnterprises primary key (id),
   constraint fkMembersEnterprises foreign key (enterpriseId)
         references enterprises (id)
);

comment on table comprehensiveManageMembers is
'综治八大员成员表';

comment on column comprehensiveManageMembers.enterpriseId is
'规上企业id';

comment on column comprehensiveManageMembers.type is
'成员类型(引用字典表中的八大员类型)';

comment on column comprehensiveManageMembers.createUser is
'创建用户';

comment on column comprehensiveManageMembers.updateUser is
'修改用户';

comment on column comprehensiveManageMembers.fullPinyin is
'全拼';

comment on column comprehensiveManageMembers.simplePinyin is
'简拼';

comment on column comprehensiveManageMembers.name is
'姓名';

comment on column comprehensiveManageMembers.telephone is
'固定电话';

comment on column comprehensiveManageMembers.mobileNumber is
'手机号码';

comment on column comprehensiveManageMembers.updateDate is
'修改时间';

comment on column comprehensiveManageMembers.createDate is
'创建日期';

/*==============================================================*/
/* Index: idx_EpManageMember_epId                               */
/*==============================================================*/
create index idx_EpManageMember_epId on comprehensiveManageMembers (
   enterpriseId ASC
);

/*==============================================================*/
/* Table: contacters   平台内联系人/站内联系                                          				*/
/*==============================================================*/
create table contacters  (
   id                   NUMBER(10)                      not null,
   ownerId              NUMBER(10),
   fromUserId           NUMBER(10),
   name                 VARCHAR2(60)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   mobileNumber         VARCHAR2(11),
   member			 	NUMBER(5)						default 0,
   belongClass          VARCHAR2(20)                    not null,
   remark               VARCHAR2(600),
   constraint pkContacters primary key (id)
);

comment on table contacters is
'平台内联系人/站内联系 ';

comment on column contacters.ownerId is
'所属用户';

comment on column contacters.fromUserId is
'对应用户';

comment on column contacters.name is
'姓名';

comment on column contacters.fullPinyin is
'姓名全拼';

comment on column contacters.simplePinyin is
'姓名简拼';

comment on column contacters.mobileNumber is
'联系手机';

comment on column contacters.belongClass is
'所属类别';

comment on column contacters.remark is
'描述';

/*==============================================================*/
/* Index: idx_contacter_name                             		*/
/*==============================================================*/
create index idx_contacter_name on contacters (
   name ASC
);

/*==============================================================*/
/* Index: idx_contacter_fullpy                           		*/
/*==============================================================*/
create index idx_contacter_fullpy on contacters (
   fullPinyin ASC
);

/*==============================================================*/
/* Index: idx_contacter_simplePy                         		*/
/*==============================================================*/
create index idx_contacter_simplePy on contacters (
   simplePinyin ASC
);

/*==============================================================*/
/* Index: idx_contacter_belongClass                        		*/
/*==============================================================*/
create index idx_contacter_belongClass on contacters (
   belongClass ASC
);


/*==============================================================*/
/* Table: groupHasContacts 群组和群组中的联系人关联表                                     			*/
/*==============================================================*/
create table groupHasContacts  (
   groupId              NUMBER(10)                      not null,
   contacterId          NUMBER(10)                      not null,
   constraint fkGroupHasContactsContacter foreign key (contacterId)
   references contacters (id)
);
comment on table GROUPHASCONTACTS
  is '群组和群组中的联系人关联表        ';
comment on column GROUPHASCONTACTS.GROUPID
  is '群组id';
comment on column GROUPHASCONTACTS.CONTACTERID
  is '站内联系人id';


/*==============================================================*/
/* Table: dailyYears                                            */
/*==============================================================*/
create table dailyYears  (
   id                   NUMBER(10)                      not null,
   name                 VARCHAR2(180)                   not null,
   remark               VARCHAR2(200),
   makedOrgId			NUMBER(10),
   makedOrgInternalCode VARCHAR2(32),
   yearDate				VARCHAR2(10),
   status				NUMBER(1)						default 0,
   simplePinyin			VARCHAR2(30),
   fullPinyin			VARCHAR2(128),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   reminderDate         DATE,
   whetherAutoStart     NUMBER(1) default 0,
   constraint pkDailyYears primary key (id)
);

comment on table dailyYears is
'年度工作目录';
comment on column dailyYears.name is
'年度工作目录名称';
comment on column dailyYears.makedOrgId is
'制定年度工作目录的部门Id';
comment on column dailyYears.makedOrgInternalCode is
'制定年度工作目录的部门内部代码';
comment on column dailyYears.yearDate is
'年度时间';
comment on column dailyYears.status is
'使用状态';
comment on column dailyYears.simplePinyin is
'年度工作目录名称简拼';
comment on column dailyYears.fullPinyin is
'年度工作目录名称全拼';
comment on column dailyYears.createUser is
'创建用户';
comment on column dailyYears.updateUser is
'修改用户';
comment on column dailyYears.createDate is
'创建日期';
comment on column dailyYears.updateDate is
'修改时间';
comment on column dailyYears.reminderDate is 
'台帐设置启动时间';
comment on column dailyYears.whetherAutoStart is 
'是否自动启用 0表示不自动 1表示自动';
/*==============================================================*/
/* Table: dailyDirectorys                                       */
/*==============================================================*/
create table dailyDirectorys  (
   id                   NUMBER(10)                      not null,
   parentId             NUMBER(10),
   dailyYearId          NUMBER(10)                      not null,
   directoryReportTypeId          NUMBER(10),
   type                 NUMBER(10),
   indexId              NUMBER(10)                     default 1 not null,
   shortName            VARCHAR2(100),
   fullName             VARCHAR2(180)                   not null,
   remark               VARCHAR2(600),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   INDATE 				NUMBER(10),
   effectiveDate		NUMBER(1)                      default 0,
   require 				NUMBER(1),
   timeLimit 			NUMBER(1),
   effectiveDays 		NUMBER(3),
   deadlineType 		NUMBER(1),
   deadlineDate 		DATE,
   deadlineStart 		NUMBER(2),
   deadlineEnd 			NUMBER(2),
   simplePinyin			VARCHAR2(32),
   fullPinyin			VARCHAR2(128),
   whetherAdd           NUMBER(1),
   constraint pkDailyDirectorys primary key (id),
   constraint fkDailyDirectoryDailyYear foreign key (dailyYearId)
         references dailyYears (id)
);

comment on table dailyDirectorys is
'工作台帐目录';

comment on column dailyDirectorys.parentId is
'工作台帐上级目录';

comment on column dailyDirectorys.dailyYearId is
'工作台帐年度Id';

comment on column dailyDirectorys.indexId is
'工作台账显示顺序';

comment on column dailyDirectorys.shortName is
'工作台帐目录简称';

comment on column dailyDirectorys.fullName is
'工作台帐目录全称';

comment on column dailyDirectorys.remark is
'工作台帐目录描述';

comment on column DAILYDIRECTORYS.INDATE
  is '有效期';

comment on column dailyDirectorys.effectiveDate is
'是否含有有效期';

comment on column dailyDirectorys.require is
'名称是否必填 ';

comment on column dailyDirectorys.timeLimit is
'时限 ';

comment on column dailyDirectorys.effectiveDays is
'有效天数  ';

comment on column dailyDirectorys.deadlineType is
'截止时间类型  ';

comment on column dailyDirectorys.deadlineDate is
'截止时间类型的普通台账类型截止日期';

comment on column dailyDirectorys.deadlineStart is
'截止时间起始';

comment on column dailyDirectorys.deadlineEnd is
'截止时间结束';

comment on column dailyDirectorys.simplePinyin is
'工作台帐目简拼';

comment on column dailyDirectorys.fullPinyin is
'工作台帐目全拼';

comment on column dailydirectorys.whetherAdd is 
'新增子目录，操作显示表示'; 
/*==============================================================*/
/* Index: idx_directory_yearId_parentId                              */
/*==============================================================*/
create index idx_directory_yearId_parentId on dailyDirectorys (
   dailyYearId ASC,
   parentId ASC
);

/*==============================================================*/
/* Index: idx_directory_dailyYearId                              */
/*==============================================================*/
create index idx_directory_dailyYearId on dailyDirectorys (
   dailyYearId ASC
);

/*==============================================================*/
/* Table: dailyLogs                                             */
/*==============================================================*/
create table dailyLogs  (
   id                   NUMBER(10)                      not null,
   dailyDirectoryId     NUMBER(10),
   orgId                NUMBER(10)                      not null,
   dailyYearId          NUMBER(10)                      not null,
   name                 VARCHAR2(150)                   not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   site                 VARCHAR2(150),
   convenor             VARCHAR2(60),
   attendUnit           VARCHAR2(60),
   theme                VARCHAR2(120),
   remark               VARCHAR2(900),
   fileNumber 			VARCHAR2(32),
   fileUnit				VARCHAR2(120),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   dealDate             DATE                            not null,
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkDailyLogs primary key (id),
   constraint fkDailyLogOrg foreign key (orgId)
         references organizations (id)
);

comment on table dailyLogs is
'工作台帐';

comment on column dailyLogs.dailyDirectoryId is
'工作台帐的目录';

comment on column dailyLogs.dailyYearId is
'工作台帐年度Id';

comment on column dailyLogs.name is
'工作台帐名称';

comment on column dailyLogs.site is
'工作台帐地点';

comment on column dailyLogs.convenor is
'召集人';

comment on column dailyLogs.attendUnit is
'参加单位';

comment on column dailyLogs.theme is
'主题';
comment on column dailyLogs.remark is
'工作台帐描述';

comment on column dailyLogs.dealDate is
'工作台帐时间';

comment on column dailyLogs.fileNumber is
'文件号';

comment on column dailyLogs.fileUnit is
'发文单位';

/*==============================================================*/
/* Index: idx_dlog_orgIdAndDirectoryid                              */
/*==============================================================*/
create index idx_dlog_orgIdAndDirectoryid on dailyLogs (
   orgId ASC,
   dailyDirectoryId ASC
);

/*==============================================================*/
/* Table: dangerousGoodsPractitioners                           */
/*==============================================================*/
create table DANGEROUSGOODSPRACTITIONERS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   DANGEROUSWORKINGTYPE NUMBER(10),
   LEGALPERSON          VARCHAR2(60),
   LEGALPERSONTELEPHONE VARCHAR2(80),
   LEGALPERSONMOBILENUMBER VARCHAR2(50),
   WORKINGCERTIFICATE   VARCHAR2(150),
   WORKINGCERTIFICATENO VARCHAR2(150),
   HEALTHSTATE          NUMBER(10),
   PERIODOFVALIDITYSTART DATE,
   PERIODOFVALIDITYEND  DATE,
   SCHOOL               VARCHAR2(150),
   RESIDENCETYPE        NUMBER(10),
   OLDCURRENTADDRESS    VARCHAR2(150),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(60)         not null,
   UPDATEUSER           VARCHAR2(60),
   CREATEDATE           DATE                 not null,
   UPDATEDATE           DATE,
   constraint PKDANGEROUSGOODSPRACTITIONERS primary key (ID),
   constraint fkDangerGoodsPractitionersOrg foreign key (orgId)
         references organizations (id)
);

comment on table DANGEROUSGOODSPRACTITIONERS is
'危险品从业人员';

comment on column DANGEROUSGOODSPRACTITIONERS.ID is
'主键';

comment on column DANGEROUSGOODSPRACTITIONERS.ORGID is
'所属网格';

comment on column DANGEROUSGOODSPRACTITIONERS.ORGINTERNALCODE is
'所属责任区编号';

comment on column DANGEROUSGOODSPRACTITIONERS.DANGEROUSWORKINGTYPE is
'危险从业类别';

comment on column DANGEROUSGOODSPRACTITIONERS.LEGALPERSON is
'法人';

comment on column DANGEROUSGOODSPRACTITIONERS.LEGALPERSONTELEPHONE is
'法人电话';

comment on column DANGEROUSGOODSPRACTITIONERS.LEGALPERSONMOBILENUMBER is
'法人手机';

comment on column DANGEROUSGOODSPRACTITIONERS.WORKINGCERTIFICATE is
'从业资格证';

comment on column DANGEROUSGOODSPRACTITIONERS.WORKINGCERTIFICATENO is
'从业资格证号';

comment on column DANGEROUSGOODSPRACTITIONERS.HEALTHSTATE is
'健康状态';

comment on column DANGEROUSGOODSPRACTITIONERS.PERIODOFVALIDITYSTART is
'有效开始日期';

comment on column DANGEROUSGOODSPRACTITIONERS.PERIODOFVALIDITYEND is
'有效结束日期';

comment on column DANGEROUSGOODSPRACTITIONERS.SCHOOL is
'就读学校';

comment on column DANGEROUSGOODSPRACTITIONERS.RESIDENCETYPE is
'户口类别';

comment on column DANGEROUSGOODSPRACTITIONERS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column DANGEROUSGOODSPRACTITIONERS.CREATEUSER is
'创建用户';

comment on column DANGEROUSGOODSPRACTITIONERS.UPDATEUSER is
'修改用户';

comment on column DANGEROUSGOODSPRACTITIONERS.CREATEDATE is
'创建日期';

comment on column DANGEROUSGOODSPRACTITIONERS.UPDATEDATE is
'修改时间';


/*==============================================================*/
/* Index: idx_DGP_orgIntCodeAndisEmphasis                       */
/*==============================================================*/
create index idx_DGP_orgCodeAndisEmphasis on dangerousGoodsPractitioners (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Table:newEconomicOrganizations                                  */
/*==============================================================*/
create table newEconomicOrganizations (
  ID                  NUMBER(10) not null,
  NAME                VARCHAR2(150) not null,
  residence           VARCHAR2(150) not null,
  licenseNumber       VARCHAR2(60) not null,
  validityStartDate           DATE,
  validityEndDate             DATE,
  style               NUMBER(10),
  chief               VARCHAR2(60),
  ORGID               NUMBER(10) not null,
  orgInternalCode     VARCHAR2(32) ,
  foxNumber           VARCHAR2(30),
  area                NUMBER(20,2),
  employeeNumber      number(20),
  partyMemberNumber   number(20),
  introduction        VARCHAR2(600),
  honor               VARCHAR2(600),
  REMARK              VARCHAR2(600),
  FULLPINYIN          VARCHAR2(30),
  SIMPLEPINYIN        VARCHAR2(10),
  CREATEUSER          VARCHAR2(32) not null,
  CREATEDATE          DATE not null,
  UPDATEUSER          VARCHAR2(32),
  UPDATEDATE          DATE,
  TELEPHONE           VARCHAR2(60),
  MOBILENUMBER        VARCHAR2(11),
  ISEMPHASIS          NUMBER(1) default 0,
  imgUrl              VARCHAR2(300),
  isEmphasisReason     VARCHAR2(300),
  isEmphasisDate       DATE,
  SOURCESSTATE NUMBER(1)  default 1 ,
	constraint pknewEconomicOrganizations primary key (id),
	constraint fknewEconomicOrganizationsOrg foreign key (orgId)
		references organizations (id)
);

comment on table newEconomicOrganizations
  is '新经济组织';
-- Add comments to the columns
comment on column newEconomicOrganizations.ID
  is 'ID';
comment on column newEconomicOrganizations.NAME
  is '名称';
comment on column newEconomicOrganizations.residence
  is '住所';
comment on column newEconomicOrganizations.licenseNumber
  is '营业执照号码';
comment on column newEconomicOrganizations.validityStartDate
  is '有效期开始';
comment on column newEconomicOrganizations.validityEndDate
  is '有效期结束';
comment on column newEconomicOrganizations.TELEPHONE
  is '固定电话';
comment on column newEconomicOrganizations.MOBILENUMBER
  is '手机号码';
comment on column newEconomicOrganizations.ORGID
  is '所属网格';

comment on column newEconomicOrganizations.REMARK
  is '备注';
comment on column newEconomicOrganizations.FULLPINYIN
  is '全拼';
comment on column newEconomicOrganizations.SIMPLEPINYIN
  is '简拼';
comment on column newEconomicOrganizations.ORGINTERNALCODE
  is '所属网格编号';
comment on column newEconomicOrganizations.CREATEUSER
  is '创建用户';
comment on column newEconomicOrganizations.CREATEDATE
  is '创建时间';
comment on column newEconomicOrganizations.UPDATEUSER
  is '修改用户';
comment on column newEconomicOrganizations.UPDATEDATE
  is '修改时间';


comment on column newEconomicOrganizations.ISEMPHASIS
  is '是否注销';
comment on column newEconomicOrganizations.style
  is '类别';
comment on column newEconomicOrganizations.chief
  is '负责人';
comment on column newEconomicOrganizations.foxNumber
  is '传真号码';
comment on column newEconomicOrganizations.AREA
  is '面积';
comment on column newEconomicOrganizations.employeeNumber
  is '从业人数';
comment on column newEconomicOrganizations.partyMemberNumber
  is '党员人数';
comment on column newEconomicOrganizations.introduction
  is '简介';
comment on column newEconomicOrganizations.honor
  is '获得荣耀';

/*==============================================================*/
/* Index: idx_tno_orgIdAndlicenseNumber                              */
/*==============================================================*/
create unique index idx_tno_orgIdAndlicenseNumber on newEconomicOrganizations (
   orgId ASC,
   licenseNumber ASC
);
/*==============================================================*/
/* Index: idx_tno_orgIdAndName                              */
/*==============================================================*/
create unique index idx_tno_orgIdAndName on newEconomicOrganizations (
   orgId ASC,
   name ASC
);

/*==============================================================*/
/* Index: idx_DGP_orgIntCodeAndisEmphasis                       */
/*==============================================================*/
create index idx_tno_orgCodeAndisEmphasis on newEconomicOrganizations (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Table: druggys                                               */
/*==============================================================*/
create table DRUGGYS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   DRUGREASON           NUMBER(10),
   DRUGSOURCE           NUMBER(10),
   DETOXICATECASE       NUMBER(10),
   DETOXICATECONDITION  NUMBER(10),
   ISADANON             NUMBER(1)            default 0,
   CONTROLACTUALITY     VARCHAR2(150),
   DRUGTYPE             VARCHAR2(150),
   FERRETOUTDATE        DATE,
   DRUGFRISTDATE        DATE,
   ISUNDERGO_TREATMENT  NUMBER(1),
   OLDCURRENTADDRESS    VARCHAR2(150),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                 not null,
   UPDATEDATE           DATE,
   constraint PKDRUGGYS primary key (ID),
   constraint fkDruggysOrg foreign key (orgId)
         references organizations (id)
);

comment on table DRUGGYS is
'吸毒者信息';

comment on column DRUGGYS.ID is
'人员id';

comment on column DRUGGYS.ORGID is
'所属网格';

comment on column DRUGGYS.ORGINTERNALCODE is
'所属责任区编号';

comment on column DRUGGYS.DRUGREASON is
'吸毒原因';

comment on column DRUGGYS.DRUGSOURCE is
'毒品来源';

comment on column DRUGGYS.DETOXICATECASE is
'戒毒情况';

comment on column DRUGGYS.DETOXICATECONDITION is
'是否在吸';

comment on column DRUGGYS.ISADANON is
'是否服美沙酮戒毒';

comment on column DRUGGYS.CONTROLACTUALITY is
'管控现状';

comment on column DRUGGYS.DRUGTYPE is
'滥用毒品种类';

comment on column DRUGGYS.FERRETOUTDATE is
'查获日期';

comment on column DRUGGYS.ISUNDERGO_TREATMENT is
'目前是否在接受治疗';

comment on column DRUGGYS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column DRUGGYS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column DRUGGYS.ISEMPHASIS is
'是否关注';

comment on column DRUGGYS.CREATEUSER is
'创建用户';

comment on column DRUGGYS.UPDATEUSER is
'修改用户';

comment on column DRUGGYS.CREATEDATE is
'创建日期';

comment on column DRUGGYS.UPDATEDATE is
'修改时间';



/*==============================================================*/
/* Index: idx_D_orgIntCodeAndisEmphasis                           */
/*==============================================================*/
create index idx_D_orgIntCodeAndisEmphasis on druggys (
   orgInternalCode ASC,
   isEmphasis ASC
);



/*==============================================================*/
/* Table:unemployedPeople                                    */
/*==============================================================*/
create table UNEMPLOYEDPEOPLE 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   RESIDENCETYPE        NUMBER(10),
   UNEMPLOYEDPEOPLETYPE NUMBER(10),
   REGISTERNUMBER       VARCHAR2(60),
   ORIGINALWORKUNIT     VARCHAR2(100),
   ORIGINALWORKUNITTYPE VARCHAR2(60),
   ENTERWORKDATE        DATE,
   UNEMPLOYMENTDATE     DATE,
   TECHNOLOGYLEVEL      NUMBER(10),
   SPECIALTYSKILLS      VARCHAR2(150),
   UNEMPLOYMENTREASON   NUMBER(10),
   TITLE                VARCHAR2(30),
   PARTICIPATEDPROGRAMS VARCHAR2(600),
   WORKSTATE            NUMBER(10),
   SKILL                NUMBER(10),
   JOBINTENTION         VARCHAR2(100),
   MONTHLYWAGES         NUMBER(10,2),
   ISDEALWITHLOW        NUMBER(1)            default 0,
   ISENJOYUNEMPLOYMENTMONEY NUMBER(1)            default 0,
   ENDDATEOFUNEMPLOYMENTMONEY DATE,
   HEADNAME             VARCHAR2(60),
   FAMILYID             VARCHAR2(32),
   OLDCURRENTADDRESS    VARCHAR2(150),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PKUNEMPLOYEDPEOPLE primary key (ID),
   constraint fkunemployedPeopleOrg foreign key (orgId)
		references organizations (id)
);

comment on table UNEMPLOYEDPEOPLE is
'失业人员';

comment on column UNEMPLOYEDPEOPLE.ID is
'ID';

comment on column UNEMPLOYEDPEOPLE.ORGID is
'所属网格';

comment on column UNEMPLOYEDPEOPLE.ORGINTERNALCODE is
'所属网格编号';

comment on column UNEMPLOYEDPEOPLE.RESIDENCETYPE is
'户口类别';

comment on column UNEMPLOYEDPEOPLE.UNEMPLOYEDPEOPLETYPE is
'人员类型';

comment on column UNEMPLOYEDPEOPLE.REGISTERNUMBER is
'就业/失业登记证号';

comment on column UNEMPLOYEDPEOPLE.ORIGINALWORKUNIT is
'原工作单位';

comment on column UNEMPLOYEDPEOPLE.ORIGINALWORKUNITTYPE is
'原工作单位类型';

comment on column UNEMPLOYEDPEOPLE.ENTERWORKDATE is
'参加工作时间';

comment on column UNEMPLOYEDPEOPLE.UNEMPLOYMENTDATE is
'失业时间';

comment on column UNEMPLOYEDPEOPLE.TECHNOLOGYLEVEL is
'技术等级';

comment on column UNEMPLOYEDPEOPLE.SPECIALTYSKILLS is
'特长技能';

comment on column UNEMPLOYEDPEOPLE.UNEMPLOYMENTREASON is
'失业原因';

comment on column UNEMPLOYEDPEOPLE.TITLE is
'职称';

comment on column UNEMPLOYEDPEOPLE.WORKSTATE is
'就业状况';

comment on column UNEMPLOYEDPEOPLE.SKILL is
'技能特长';

comment on column UNEMPLOYEDPEOPLE.JOBINTENTION is
'求职意向';

comment on column UNEMPLOYEDPEOPLE.MONTHLYWAGES is
'求职月工资';

comment on column UNEMPLOYEDPEOPLE.ISDEALWITHLOW is
'已办理低保（是否）0否1是';

comment on column UNEMPLOYEDPEOPLE.ISENJOYUNEMPLOYMENTMONEY is
'享受失业保障金（是否）0否1是';

comment on column UNEMPLOYEDPEOPLE.ENDDATEOFUNEMPLOYMENTMONEY is
'失业保障金结束日期';

comment on column UNEMPLOYEDPEOPLE.HEADNAME is
'户主姓名';

comment on column UNEMPLOYEDPEOPLE.FAMILYID is
'户号';

comment on column UNEMPLOYEDPEOPLE.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column UNEMPLOYEDPEOPLE.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column UNEMPLOYEDPEOPLE.ISEMPHASIS is
'是否注销';

comment on column UNEMPLOYEDPEOPLE.CREATEUSER is
'创建用户';

comment on column UNEMPLOYEDPEOPLE.CREATEDATE is
'创建时间';

comment on column UNEMPLOYEDPEOPLE.UPDATEUSER is
'修改用户';

comment on column UNEMPLOYEDPEOPLE.UPDATEDATE is
'修改时间'; 
 

  /* Table: uPeopleHasEIntention                                    */
/*==============================================================*/
create table uPeopleHasEIntention (
   unemployedPeopleId               NUMBER(10)                      not null,
   propertyDictId                   NUMBER(10)                      not null,
   constraint pkuPeopleHasEIntention primary key (unemployedPeopleId, propertyDictId),
   constraint fkuPeopleHasEIntention foreign key (unemployedPeopleId)
         references unemployedPeople (id)
);

  /* Table: uPeopleHasTIntention                                    */
/*==============================================================*/
create table uPeopleHasTIntention (
   unemployedPeopleId               NUMBER(10)                      not null,
   propertyDictId                   NUMBER(10)                      not null,
   constraint pkuPeopleHasTIntention primary key (unemployedPeopleId, propertyDictId),
   constraint fkuPeopleHasTIntention foreign key (unemployedPeopleId)
         references unemployedPeople (id)
);

/*==============================================================*/
/* Index: idx_unem_orgIntCodeAndisEmphasis                       */
/*==============================================================*/
create index idx_unem_orgCodeAndisEmphasis on UNEMPLOYEDPEOPLE (
   orgInternalCode ASC,
   isEmphasis ASC
);



/*==============================================================*/
/* Table: optimalObjects                                               */
/*==============================================================*/
create table OPTIMALOBJECTS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   OPTIMALCARDNO        VARCHAR2(90),
   OPTIMALCARDTYPE      NUMBER(10),
   LABORABILITY         NUMBER(10),
   ABILITYLIVING        NUMBER(10),
   EMPLOYMENTSITUATION  NUMBER(10),
   SUPPORTSITUATION     NUMBER(10),
   MONTHLIVINGEXPENSES  NUMBER(15,5)         default 0,
   FERRETOUTDATE        DATE,
   DRUGFRISTDATE        DATE,
   INHABITANTID         NUMBER(10),
   OLDCURRENTADDRESS    VARCHAR2(150),
   RESIDENCETYPE        NUMBER(10),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PKOPTIMALOBJECTS primary key (ID),
   constraint fkOptimalObjects foreign key (orgId)
         references organizations (id)
);

comment on table OPTIMALOBJECTS is
'优抚对象信息';

comment on column OPTIMALOBJECTS.ID is
'人员id';

comment on column OPTIMALOBJECTS.ORGID is
'所属网格';

comment on column OPTIMALOBJECTS.ORGINTERNALCODE is
'所属责任区编号';

comment on column OPTIMALOBJECTS.OPTIMALCARDNO is
'优待证号';

comment on column OPTIMALOBJECTS.OPTIMALCARDTYPE is
'优抚类型';

comment on column OPTIMALOBJECTS.LABORABILITY is
'劳动能力';

comment on column OPTIMALOBJECTS.ABILITYLIVING is
'生活能力';

comment on column OPTIMALOBJECTS.EMPLOYMENTSITUATION is
'就业情况';

comment on column OPTIMALOBJECTS.SUPPORTSITUATION is
'供养情况';

comment on column OPTIMALOBJECTS.MONTHLIVINGEXPENSES is
'月生活费';

comment on column OPTIMALOBJECTS.FERRETOUTDATE is
'查获日期';

comment on column OPTIMALOBJECTS.INHABITANTID is
'常住人口ID';

comment on column OPTIMALOBJECTS.RESIDENCETYPE is
'户口类别';

comment on column OPTIMALOBJECTS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column OPTIMALOBJECTS.ISEMPHASIS is
'是否关注';

comment on column OPTIMALOBJECTS.CREATEUSER is
'创建用户';

comment on column OPTIMALOBJECTS.CREATEDATE is
'创建日期';

comment on column OPTIMALOBJECTS.UPDATEUSER is
'修改用户';

comment on column OPTIMALOBJECTS.UPDATEDATE is
'修改时间';

/*==============================================================*/
/* Index: idx_O_orgIntCodeAndisEmphasis                           */
/*==============================================================*/
create index idx_O_orgIntCodeAndisEmphasis on optimalObjects (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Table: partyOrgInfos                                          */
/*==============================================================*/
create table partyOrgInfos  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   partyBranchName      VARCHAR2(150)                   not null,
   partyBranchSecretary VARCHAR2(50)                    not null,
   idCardNo             VARCHAR2(60),
   mobileNumber         VARCHAR2(50),
   telephone            VARCHAR2(80),
   remark               CLOB,
   partyNumbers         NUMBER(10)                      default 0,
   partyBranchAddr      VARCHAR2(600),
   orginternalCode      VARCHAR2(32)                    not null,
   establishedDate      DATE                            not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkPartyOrgInfos primary key (id),
   constraint fkPartyOrgInfos foreign key (orgId)
         references organizations (id)
);

comment on table partyOrgInfos is
'党组织信息表';

comment on column partyOrgInfos.id is
'主键';

comment on column partyOrgInfos.orgId is
'所属网格';

comment on column partyOrgInfos.partyBranchName is
'党支部名称';

comment on column partyOrgInfos.partyBranchSecretary is
'党支部书记';

comment on column partyOrgInfos.idCardNo is
'身份证号码';

comment on column partyOrgInfos.mobileNumber is
'联系手机';

comment on column partyOrgInfos.telephone is
'联系电话';

comment on column partyOrgInfos.partyNumbers is
'党员人数';

comment on column partyOrgInfos.partyBranchAddr is
'党组织地址';

comment on column partyOrgInfos.remark is
'备注';

comment on column partyOrgInfos.orginternalCode is
'所属责任区编号';

comment on column partyOrgInfos.establishedDate is
'党支部成立时间';

comment on column partyOrgInfos.createDate is
'创建时间';

comment on column partyOrgInfos.updateDate is
'修改时间';


/*==============================================================*/
/* Table: partyOrgActivitys                                          */
/*==============================================================*/
create table partyOrgActivitys  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   partyOrgId           NUMBER(10)                      not null,
   activityDate         DATE                            not null,
   activityAddr         VARCHAR2(600)                   not null,
   activitySubject      VARCHAR2(300)                   not null,
   organizers           VARCHAR2(500),
   participants         VARCHAR2(500),
   activeContent        CLOB                            not null,
   orginternalCode      VARCHAR2(32)                    not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkPartyOrgActivitys primary key (id),
   constraint fkPartyOrgActivitys foreign key (orgId)
         references organizations (id)
);

comment on table partyOrgActivitys is
'党组织活动记录表';

comment on column partyOrgActivitys.id is
'主键';

comment on column partyOrgActivitys.orgId is
'所属网格';

comment on column partyOrgActivitys.partyOrgId is
'所属党支部';

comment on column partyOrgActivitys.activityDate is
'活动时间';

comment on column partyOrgActivitys.activityAddr is
'活动地点';

comment on column partyOrgActivitys.activitySubject is
'活动主题';

comment on column partyOrgActivitys.organizers is
'组织者';

comment on column partyOrgActivitys.participants is
'参与者';

comment on column partyOrgActivitys.activeContent is
'活动内容';

comment on column partyOrgActivitys.orginternalCode is
'所属责任区编号';

comment on column partyOrgActivitys.createDate is
'创建时间';

comment on column partyOrgActivitys.updateDate is
'修改时间';


/*==============================================================*/
/* Table: partyOrgActivityFiles                                          */
/*==============================================================*/
create table partyOrgActivityFiles  (
   id                   NUMBER(10)                      not null,
   orgActivityId        NUMBER(10)                      not null,
   fileName             VARCHAR2(300)                   not null,
   fileActualUrl        VARCHAR2(600)                   not null,
   fileSize             NUMBER(10),
   constraint pkpartyOrgActivityFiles primary key (id),
   constraint fkpartyOrgActivityFiles foreign key (orgActivityId)
         references partyOrgActivitys (id)
);

comment on table partyOrgActivityFiles is
'党组织活动记录附件表';

comment on column partyOrgActivityFiles.id is
'主键';

comment on column partyOrgActivityFiles.orgActivityId is
'所属党组织活动记录';

comment on column partyOrgActivityFiles.fileName is
'文件名称';

comment on column partyOrgActivityFiles.fileActualUrl is
'文件路径 ';

comment on column partyOrgActivityFiles.fileSize is
'文件大小';


/*==============================================================*/
/* Table: partyMemberInfos                                               */
/*==============================================================*/
create table partyMemberInfos  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   partyOrgId           NUMBER(10),
   joinPartyBranchDate  DATE,
   partyMemberType      NUMBER(10),
   joinPartyDate        DATE,
   joinPartyBranch      VARCHAR2(300),
   becomesDate          DATE,
   becomesState         NUMBER(10),
   partyPosition        VARCHAR2(100),
   officeDate           DATE,
   trainingState        NUMBER(10),
   rewardsPunishment    VARCHAR2(800),
   expertise            VARCHAR2(800),
   isFlowPartyCard      NUMBER(1)                      default 0,
   flowPartyBranch      VARCHAR2(300),
   flowPartyBranchDate  DATE,
   partyBranchContacts  VARCHAR2(20),
   branchTelephone      VARCHAR2(80),
   branchMobileNumber   VARCHAR2(50),
   gender               NUMBER(10)                      not null,
   workUnit             VARCHAR2(150),
   province             VARCHAR2(30),
   city                 VARCHAR2(30),
   district             VARCHAR2(30),
   nativePlaceAddress   VARCHAR2(150),
   currentAddress       VARCHAR2(150),
   name                 VARCHAR2(60)                    not null,
   usedName		        VARCHAR2(60),
   idCardNo             VARCHAR2(60),
   telephone            VARCHAR2(80),
   mobileNumber         VARCHAR2(50),
   orgInternalCode      VARCHAR2(32)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   remark               VARCHAR2(900),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   birthday             DATE,
   ferretOutDate        DATE,
   drugfristDate        DATE,
   imgUrl               VARCHAR2(300),
   email                VARCHAR2(150),
   isEmphasis           NUMBER(1)                      default 0,
   isDeath              NUMBER(1)                      default 0,
   currentAddressType   NUMBER(10)                     default 0,
   community            VARCHAR2(150),
   block 				VARCHAR2(150),
   unit 				VARCHAR2(150),
   room 				VARCHAR2(150),
   nation               NUMBER(10),
   politicalBackground  NUMBER(10),
   schooling			NUMBER(10),
   career               NUMBER(10),
   maritalState         NUMBER(10),
   bloodType            NUMBER(10),
   faith                NUMBER(10),
   residenceType        NUMBER(10),
   otherAddress         VARCHAR2(150),
   stature              NUMBER(10),
   PERSONORIGIN         VARCHAR2(50),
   WORKTIME             DATE,
   FIMILYINSTANCE       NUMBER(10),
   PEROSNINCOME         NUMBER(10,2),
   PERSONTYPE           NUMBER(10),
   APPLYTIME            DATE,
   PLANTTIME            DATE,
   INTRODUCER           VARCHAR2(30),
   PARTYSTART           NUMBER(10),
   STRUCTUREHANDLE      NUMBER(10),
   AWARDSUPPLY          NUMBER,
   TAKEFRAMEWORK        VARCHAR2(100),
   SUPPLYFUND           NUMBER,
   OTHERDUTY            NUMBER,
   SFDELETE             NUMBER  default 0,
   OTHERTAKEFRAMEWORK   VARCHAR2(100),
   constraint pkPartyMemberInfos primary key (id),
   constraint fkPartyMemberInfos foreign key (orgId)
         references organizations (id)
);

comment on table partyMemberInfos is
'党员信息';

comment on column partyMemberInfos.id is
'人员id';

comment on column partyMemberInfos.orgId is
'所属网格';

comment on column partyMemberInfos.partyOrgId is
'所属党支部';

comment on column partyMemberInfos.joinPartyBranchDate is
'进入党支部时间';

comment on column partyMemberInfos.partyMemberType is
'党员类型';

comment on column partyMemberInfos.joinPartyDate is
'入党时间';

comment on column partyMemberInfos.joinPartyBranch is
'入党时所在党支部';

comment on column partyMemberInfos.becomesDate is
'转正时间';

comment on column partyMemberInfos.becomesState is
'转正情况';

comment on column partyMemberInfos.partyPosition is
'党内主要职务';

comment on column partyMemberInfos.officeDate is
'任职日期';

comment on column partyMemberInfos.trainingState is
'培训情况';

comment on column partyMemberInfos.rewardsPunishment is
'奖惩情况';

comment on column partyMemberInfos.expertise is
'专长';

comment on column partyMemberInfos.isFlowPartyCard is
'是否持流动党员证';

comment on column partyMemberInfos.flowPartyBranch is
'流入地（单位）党支部';

comment on column partyMemberInfos.flowPartyBranchDate is
'流入时间';

comment on column partyMemberInfos.partyBranchContacts is
'党支部联系人';

comment on column partyMemberInfos.branchTelephone is
'固定电话（党支部联系人）';

comment on column partyMemberInfos.branchMobileNumber is
'联系手机（党支部联系人)';

comment on column partyMemberInfos.gender is
'性别';

comment on column partyMemberInfos.workUnit is
'工作单位或就读学校';

comment on column partyMemberInfos.province is
'省';

comment on column partyMemberInfos.city is
'市';

comment on column partyMemberInfos.district is
'区县';

comment on column partyMemberInfos.nativePlaceAddress is
'户籍地详址';

comment on column partyMemberInfos.currentAddress is
'现在居住地';

comment on column partyMemberInfos.name is
'姓名';

comment on column partyMemberInfos.usedName is
'曾用名';

comment on column partyMemberInfos.idCardNo is
'身份证号码';

comment on column partyMemberInfos.telephone is
'固定电话';

comment on column partyMemberInfos.mobileNumber is
'手机号码';

comment on column partyMemberInfos.orgInternalCode is
'所属责任区编号';

comment on column partyMemberInfos.fullPinyin is
'全拼';

comment on column partyMemberInfos.simplePinyin is
'简拼';

comment on column partyMemberInfos.remark is
'备注';

comment on column partyMemberInfos.createUser is
'创建用户';

comment on column partyMemberInfos.updateUser is
'修改用户';

comment on column partyMemberInfos.createDate is
'创建日期';

comment on column partyMemberInfos.updateDate is
'修改时间';

comment on column partyMemberInfos.birthday is
'出生日期';

comment on column partyMemberInfos.ferretOutDate is
'查获日期';

comment on column partyMemberInfos.isEmphasis is
'是否关注';

comment on column partyMemberInfos.isDeath is
'是否死亡';

comment on column partyMemberInfos.imgUrl is
'图片链接地址';

comment on column partyMemberInfos.email is
'电子邮箱';

comment on column partyMemberInfos.currentAddressType is
'常住地址类型';

comment on column partyMemberInfos.community is
'常住地址商品房 小区';

comment on column partyMemberInfos.block is
'常住地址商品房 幢';

comment on column partyMemberInfos.unit is
'常住地址商品房 单元';

comment on column partyMemberInfos.room is
'常住地址商品房  室';

comment on column partyMemberInfos.nation is
'民族';

comment on column partyMemberInfos.politicalBackground is
'政治面貌';

comment on column partyMemberInfos.schooling is
'文化程度';

comment on column partyMemberInfos.career is
'职业';

comment on column partyMemberInfos.maritalState is
'婚姻状况';

comment on column partyMemberInfos.bloodType is
'血型';

comment on column partyMemberInfos.faith is
'宗教信仰';

comment on column partyMemberInfos.otherAddress is
'临时居所';

comment on column partyMemberInfos.residenceType  is
'户口类别';

comment on column partyMemberInfos.stature is
'身高';

comment on column PARTYMEMBERINFOS.PERSONORIGIN is
'籍贯';

comment on column PARTYMEMBERINFOS.WORKTIME is
'工作时间';

comment on column PARTYMEMBERINFOS.FIMILYINSTANCE is
'家庭状况';

comment on column PARTYMEMBERINFOS.PEROSNINCOME is
'个人收入';

comment on column PARTYMEMBERINFOS.PERSONTYPE is
'人员类型';

comment on column PARTYMEMBERINFOS.APPLYTIME is
'申请时间';

comment on column PARTYMEMBERINFOS.PLANTTIME is
'培养时间';

comment on column PARTYMEMBERINFOS.INTRODUCER is
'介绍人';

comment on column PARTYMEMBERINFOS.PARTYSTART is
'党员星级';

comment on column PARTYMEMBERINFOS.STRUCTUREHANDLE is
'组织处理';

comment on column PARTYMEMBERINFOS.AWARDSUPPLY is
'以奖代补';

comment on column PARTYMEMBERINFOS.TAKEFRAMEWORK is
'任职组织';

comment on column PARTYMEMBERINFOS.SUPPLYFUND is
'互补基金';

comment on column PARTYMEMBERINFOS.OTHERDUTY is
'其它职务';

comment on column PARTYMEMBERINFOS.SFDELETE is
'是否删除';

comment on column PARTYMEMBERINFOS.OTHERTAKEFRAMEWORK is
'其它任职组织';

/*==============================================================*/
/* Index: idx_PM_orgIdAndidCardNo                                */
/*==============================================================*/
create index idx_PM_orgIdAndidCardNo on partyMemberInfos (
   orgId ASC,
   idCardNo ASC
);

/*==============================================================*/
/* Index: idx_PM_orgIntCodeAndisEmphasis                           */
/*==============================================================*/
create index idx_PM_orgIntCodeAndisEmphasis on partyMemberInfos (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Table: examineCatalogs                                       */
/*==============================================================*/
create table examineCatalogs  (
   id                   NUMBER(10)                      not null,
   catalogSeq           NUMBER(10),
   shortName            VARCHAR2(100),
   fullName             VARCHAR2(150),
   remark               VARCHAR2(600),
   constraint pkExamineCatalogs primary key (id)
);

comment on table examineCatalogs is
'大则表';

comment on column examineCatalogs.catalogSeq is
'大规则序号';

comment on column examineCatalogs.shortName is
'大规则简称';

comment on column examineCatalogs.fullName is
'大规则全称';

comment on column examineCatalogs.remark is
'大规则描述';

/*==============================================================*/
/* Table: examineItems                                          */
/*==============================================================*/
create table examineItems  (
   id                   NUMBER(10)                      not null,
   planId               NUMBER(10),
   cataId               NUMBER(10),
   itemSeq              NUMBER(10),
   examineType          NUMBER(10)                     default 1 not null,
   ownerItemId          NUMBER(10),
   refItemId            NUMBER(10),
   planScore            NUMBER(10,4),
   actualCaculateScore  NUMBER(10,4),
   autoExamine          NUMBER(1),
   editabled            NUMBER(1),
   selected             NUMBER(1),
   catalogDisplayName   VARCHAR2(300),
   scoreWayDetail       VARCHAR2(150),
   examineContent       VARCHAR2(1200),
   examineOrganizationNames VARCHAR2(150),
   remark               VARCHAR2(600),
   constraint pkExamineItems primary key (id),
   constraint fkExamineItemsCatalog foreign key (cataId)
         references examineCatalogs (id)
);

comment on table examineItems is
'小规则表';

comment on column examineItems.planId is
'年度计划表id';

comment on column examineItems.cataId is
'大规则id';

comment on column examineItems.itemSeq is
'小规则序号';

comment on column examineItems.examineType is
'评分基数，-1为扣分，1为加分';

comment on column examineItems.ownerItemId is
'上一级小则标题ID';

comment on column examineItems.refItemId is
'引用的小则编号';

comment on column examineItems.planScore is
'计划分值';

comment on column examineItems.actualCaculateScore is
'实际分值';

comment on column examineItems.autoExamine is
'手动自动';

comment on column examineItems.editabled is
'是否可以被修盖';

comment on column examineItems.selected is
'是否被选中';

comment on column examineItems.catalogDisplayName is
'所属大则名称';

comment on column examineItems.scoreWayDetail is
'扣分规则';

comment on column examineItems.examineContent is
'小则内容';

comment on column examineItems.examineOrganizationNames is
'考核部门';

comment on column examineItems.remark is
'备注';

/*==============================================================*/
/* Table: examinePlans                                          */
/*==============================================================*/
create table examinePlans  (
   id                   NUMBER(10)                      not null,
   fullScore            NUMBER(10,4),
   year                 VARCHAR2(20),
   title                VARCHAR2(100),
   draftOrganization    VARCHAR2(150),
   constraint pkExaminePlans primary key (id)
);

comment on table examinePlans is
'年度计划表';

comment on column examinePlans.fullScore is
'总分';

comment on column examinePlans.year is
'大规则序号';

comment on column examinePlans.title is
'标题';

comment on column examinePlans.draftOrganization is
'制定部门';

/*==============================================================*/
/* Table: examineScores                                         */
/*==============================================================*/
create table examineScores  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   planId               NUMBER(10)                      not null,
   annualActualScore    NUMBER(10,4),
   annualMaxScore       NUMBER(10,4),
   year                 VARCHAR2(20)                    not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   constraint pkExamineScores primary key (id),
   constraint fkExamineScoresPlan foreign key (planId)
         references examinePlans (id),
   constraint fkExamineScoresOrg foreign key (orgId)
         references organizations (id)
);

comment on table examineScores is
'年度得分表';

comment on column examineScores.orgId is
'组织机构id';

comment on column examineScores.planId is
'年度计划id';

comment on column examineScores.annualActualScore is
'年度实际得分';

comment on column examineScores.annualMaxScore is
'年度最大分值';

comment on column examineScores.year is
'年份';

comment on column examineScores.orgInternalCode is
'组织机构orgInternalCode';

/*==============================================================*/
/* Table: examineScoreRecords                                   */
/*==============================================================*/
create table examineScoreRecords  (
   id                   NUMBER(10)                      not null,
   examineScoresId      NUMBER(10),
   examineItemId        NUMBER(10),
   score                NUMBER(10,4),
   scoreContent         VARCHAR2(600),
   constraint pkExamineScoreRecords primary key (id),
   constraint fkExamineScoreRecordsScores foreign key (examineScoresId)
         references examineScores (id),
   constraint fkExamineScoreRecordsItem foreign key (examineItemId)
         references examineItems (id)
);

comment on table examineScoreRecords is
'评分内容表';

comment on column examineScoreRecords.examineScoresId is
'年度评分表Id';

comment on column examineScoreRecords.examineItemId is
'小规则id';

comment on column examineScoreRecords.score is
'得分';

comment on column examineScoreRecords.scoreContent is
'评分内容';

/*==============================================================*/
/* Table: gridTerms                                             */
/*==============================================================*/
create table gridTerms  (
   id                   NUMBER(10)                      not null,
   termNo               VARCHAR2(45)                    not null,
   sysDefaultName       VARCHAR2(100)                   not null,
   specificName         VARCHAR2(100),
   moduleName           VARCHAR2(45)                    not null,
   constraint pkGridTerms primary key (id)
);

comment on column gridTerms.termNo is
'术语编号';

comment on column gridTerms.sysDefaultName is
'术语系统默认名称';

comment on column gridTerms.specificName is
'术语用户指定名称';

comment on column gridTerms.moduleName is
'模块名';


/*==============================================================*/
/* Table: issueTypeDomains  事件类型大类	                            */
/*==============================================================*/
create table issueTypeDomains  (
   id                   NUMBER(10)                      not null,
   module               VARCHAR2(30)                    not null,
   systemSensitive      NUMBER(1)                      default 0 not null,
   personalized         NUMBER(1),
   domainName           VARCHAR2(60)                    not null,
   systemRestrict       CLOB,
   constraint pkIssueTypeDomains primary key (id)
);

comment on table issueTypeDomains is
'事件类型大类';
comment on column issueTypeDomains.systemSensitive is
'系统敏感，是否具有系统内置属性';
comment on column issueTypeDomains.personalized is
'是否个性化';
comment on column issueTypeDomains.domainName is
'大类名称';
comment on column issueTypeDomains.systemRestrict is
'系统约束';

/*==============================================================*/
/* Table: issueTypes  事件具体类型表(每个事件大类下面的小类)                  */
/*==============================================================*/
create table issueTypes  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10),
   domainId             NUMBER(10)                     default 0 not null,
   internalId           NUMBER(10),
   personalized         NUMBER(1),
   enabled              NUMBER(1)                      default 1,
   indexId              NUMBER(10)                     default 1 not null,
   issueTypeName        VARCHAR2(150)                   not null,
   content              VARCHAR2(600),
   simplePinyin         VARCHAR2(10),
   fullPinyin           VARCHAR2(30),
   orgInternalCode      VARCHAR2(32),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkIssueTypes primary key (id, domainId),
   constraint fkIssueTypesIssueTypeDomains foreign key (domainId) references issueTypeDomains (id)
);

comment on table issueTypes is
'事件类型表(每个事件大类下面的小类)';
comment on column issueTypes.orgId is
'所属网格';
comment on column issueTypes.domainId is
'所属类别父类id';
comment on column issueTypes.internalId is
'该类型的内部id';
comment on column issueTypes.personalized is
'是否个性化';
comment on column issueTypes.enabled is
'是否可用';
comment on column issueTypes.indexId is
'显示顺序';
comment on column issueTypes.issueTypeName is
'事件类别名称';
comment on column issueTypes.content is
'事件类别描述';
comment on column issueTypes.simplePinyin is
'事件类别名称简拼';
comment on column issueTypes.fullPinyin is
'事件类别名称全拼';
comment on column issueTypes.orgInternalCode is
'所属责任区编号';
comment on column issueTypes.createUser is
'创建人';
comment on column issueTypes.updateUser is
'修改人';
comment on column issueTypes.createDate is
'创建时间';
comment on column issueTypes.updateDate is
'修改时间';

/*==============================================================*/
/* Table: issues   事件表	                                        */
/*==============================================================*/
create table issues  (
   id                   NUMBER(10)                      not null,
   occurOrg             NUMBER(10)                      not null,
   createOrg            NUMBER(10)                      not null,
   lastOrg              NUMBER(10),
   issueKind            NUMBER(10),
   sourceKind           NUMBER(10),
   relatePeopleCount    NUMBER(10),
   displayStyle         NUMBER(10),
   currentStep          NUMBER(10),
   relateAmount         NUMBER(10,4),
   important            NUMBER(1)                      default 0,
   urgent               NUMBER(1)                      default 0,
   isEmergency          NUMBER(1)                      default 0,
   serialNumber         VARCHAR2(30)                    not null,
   subject              VARCHAR2(150)                   not null,
   occurOrgInternalCode VARCHAR2(32)                    not null,
   createOrgInternalCode VARCHAR2(32)                    not null,
   lastOrgInternalCode  VARCHAR2(32),
   lastUsername         VARCHAR2(60),
   currentOrg           NUMBER(10),
   currentOrgDisplayName VARCHAR2(60),
   sourcePerson         VARCHAR2(60),
   sourceMobile         VARCHAR2(11),
   occurLocation        VARCHAR2(150),
   mainCharacters       VARCHAR2(90),
   historic             NUMBER(1)                      default 0,
   completeDate         DATE,
   status               VARCHAR2(60),
   issueType			NUMBER(1)                      default 0,
   undertakeUserName    VARCHAR2(60),
   undertakeMobile      VARCHAR2(11),
   buildingid			VARCHAR2(30),
   centerX 				NUMBER(10),
   centerY 				NUMBER(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   occurDate            DATE                            not null,
   createDate           DATE                            not null,
   updateDate           DATE,
   issueContent         CLOB,
   remark               CLOB,
   lat                  NUMBER(16,12),
   lon                  NUMBER(16,12),
   centerLon            VARCHAR2(32),
   centerLat            VARCHAR2(32),
   centerLon2			VARCHAR2(32),
   centerLat2			VARCHAR2(32),
   zoom					NUMBER(2),
   CREATEPERSON 		VARCHAR2(32),
   CREATEPERSONID 		NUMBER(10),
   SENTIMENET 			NUMBER(1)  						default 0,
   DEALTIME 			DATE,
   COMMENTS 			NUMBER(10)  					default 0,
   DEGREE 				NUMBER(1),
   hours                VARCHAR2(5),
   minute               VARCHAR2(5),
   emergencyLevel		NUMBER(10),
   importantPlace		NUMBER(1),
   uniqueidformobile 	VARCHAR2(32),
   createorglevel       NUMBER(10),
   lastorglevel         NUMBER(10),
   createorgfunctionalorgType 	NUMBER(10)  			default 0,
   lastorgfunctionalorgType 	NUMBER(10)  			default 0,
   fromserialnumber varchar2(20),
   deadLine number(10),
   constraint pkIssues primary key (id),
   constraint fkIssuesOrg foreign key (occurOrg) references organizations (id)
);
comment on table issues is
'事件表';
comment on column issues.id is
'事件id';
comment on column issues.occurOrg is
'事件发生网格id';
comment on column issues.createOrg is
'创建网格id';
comment on column issues.lastOrg is
'最后操作网格id';
comment on column issues.issueKind is
'事件性质';
comment on column issues.sourceKind is
'来源方式';
comment on column issues.relatePeopleCount is
'涉及人数';
comment on column issues.relateAmount is
'涉及金额';
comment on column issues.important is
'是否重大事件';
comment on column issues.isEmergency is
'是否紧急事件';
comment on column issues.urgent is
'是否加急';
comment on column issues.serialNumber is
'事件的服务单号';
comment on column issues.subject is
'主题';
comment on column issues.occurOrgInternalCode is
'发生网格内置编码';
comment on column issues.createOrgInternalCode is
'创建网格内置编码';
comment on column issues.lastOrgInternalCode is
'最后操作网格内置编码';
comment on column issues.lastUsername is
'最后操作用户名称';
comment on column issues.currentOrg is
'当前操作网格';
comment on column issues.currentOrgDisplayName is
'当前操作网格名称';
comment on column issues.sourcePerson is
'来源人(社情民意中心转入的事件才会有) ';
comment on column issues.sourceMobile is
'来源手机';
comment on column issues.occurLocation is
'发生地';
comment on column issues.mainCharacters is
'主要当事人';
comment on column issues.historic is
'是否是历史遗留';
comment on column issues.completeDate is
'办理结束时间';
comment on column issues.status is
'状态';
comment on column issues.undertakeUserName is
'承办人';
comment on column issues.undertakeMobile is
'承办人联系手机';
comment on column issues.occurDate is
'发生时间';
comment on column issues.issueContent is
'事件简述';
comment on column issues.remark is
'备注';
comment on column issues.lat is
'纬度';
comment on column issues.lon is
'经度';
comment on column issues.ISSUETYPE is
'0、事件 1、服务审批';
comment on column ISSUES.CREATEPERSON is '日志所属人';
comment on column ISSUES.CREATEPERSONID is '日志所属人id';
comment on column ISSUES.SENTIMENET is '是否服务办事,0服务办事,1民情日志';
comment on column ISSUES.DEALTIME is '处理时间';
comment on column ISSUES.COMMENTS is '点评次数';
comment on column issues.hours is
'小时';
comment on column issues.minute is
'分钟';
comment on column issues.emergencyLevel is
'重大紧急等级 ';
comment on column issues.importantPlace is
'是否重点场所';
comment on column issues.uniqueidformobile is 
'为手机端新增一个单独id';
comment on column ISSUES.fromserialnumber is 
'呼叫中心分流事件系列号';
comment on column issues.deadLine 
is '呼叫中心的办理期限';
comment on column ISSUES.createorglevel is 
'创建组织机构层级';
comment on column ISSUES.lastorglevel is 
'最后操作组织机构层级';
comment on column ISSUES.createorgfunctionalorgType is 
'创建组织机构类型';
comment on column ISSUES.lastorgfunctionalorgType is 
'最后操作组织机构类型';

CREATE INDEX ISSUES_CREATEORGLEVEL ON ISSUES (CREATEORGLEVEL,CREATEORGFUNCTIONALORGTYPE,CREATEORGINTERNALCODE);
CREATE INDEX ISSUES_LASTORGLEVEL ON ISSUES (LASTORGLEVEL,LASTORGFUNCTIONALORGTYPE,LASTORGINTERNALCODE);
	
/*==============================================================*/
/* Table: issueHasTypes 事件类型关联表                                                                                                        */
/*==============================================================*/
create table issueHasTypes  (
   issueId              NUMBER(10)                      not null,
   issueTypeId          NUMBER(10)                      not null,
   issueTypeDomainId    NUMBER(10)                      not null,
   constraint pkIssueHasTypes primary key (issueId, issueTypeId),
   constraint fkIssue foreign key (issueId) references issues (id)
);
comment on table issueHasTypes is
'事件类型表(每个事件大类下面的小类)';
comment on column issueHasTypes.issueId is
'事件id';
comment on column issueHasTypes.issueTypeId is
'事件所属类型(小类)id';
comment on column issueHasTypes.issueTypeDomainId is
'事件所属类型(大类)id';

/*==============================================================*/
/* Table: issueHasAttachFiles                                      */
/*==============================================================*/
create table issueHasAttachFiles  (
   id                     NUMBER(10)                      not null,
   issueId                NUMBER(10)                      not null,
   issueLogId             NUMBER(10),
   fileType               VARCHAR2(150)                   not null,
   constraint pkIssueHasAttachFiles primary key (id),
   constraint fkIssueHasAttachFiles foreign key (issueId) references issues (id)
);
comment on table issueHasAttachFiles is
'事件附件关联表';
comment on column issueHasAttachFiles.issueId is
'事件id';
comment on column issueHasAttachFiles.issueLogId is
'事件处理记录id';
comment on column issueHasAttachFiles.fileType is
'使用到该文件的对象类型（issue or issuelog）';

/*==============================================================*/
/* Table: issueSteps                                             */
/*==============================================================*/
create table issueSteps  (
   id                   NUMBER(10)                      not null,
   source               NUMBER(10)                      not null,
   sourceInternalCode   VARCHAR2(32)                    not null,
   target               NUMBER(10)                      not null,
   targetInternalCode   VARCHAR2(32)                    not null,
   entryOperate         VARCHAR2(100),
   entryDate            DATE,
   endDate              DATE,
   lastDealDate         DATE,
   superviseLevel       NUMBER(10)                      not null,
   backTo               NUMBER(10),
   state                VARCHAR2(300)                   not null,
   stateCode            NUMBER(10)                      not null,
   issue                NUMBER(10)                      not null,
   groupid              NUMBER(10) ,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                           not null,
   updateDate           DATE,
   FORISSUELOGID 		NUMBER(10),
   DEALSTEPINDEX 		NUMBER(10),
   RETURNTOISSUELOGID 	NUMBER(10),
   DEALTYPE NUMBER(4),
   DEALSTATE NUMBER(4),
   DEALUSERNAME 		VARCHAR2(60),
   MOBILE VARCHAR2(15),
   DEALDESCRIPTION 		VARCHAR2(300),
   LOGCOMPLETETIME 		DATE,
   FORLOGENTRYTIME 		DATE,
   CONTENT CLOB,
   assign               NUMBER(10),
   submit               NUMBER(10),
   delayWorkday 		number(10) 						default 0,
   delaystate 			number(2) 						default 0,
   isextended 			number(1) 						default 0,
   fourTeamsTypeID  	number(10) ,
   fourTeams  			NUMBER(10) ,
   emergencylevel 		number(10),
   targetorglevel 		NUMBER(10),
   targetorgfunctionalorgType 	NUMBER(10) 				default 0,
   constraint pkIssueSteps primary key (id)
);
comment on table issueSteps is
'事件处理步骤表';
comment on column issueSteps.id is
'处理步骤id';
comment on column issueSteps.source is
'该步骤来源部门id';
comment on column ISSUESTEPS.SOURCEINTERNALCODE
  is '该步骤来源部门orgCode';
comment on column issueSteps.target is
'该步骤的目标处理部门';
comment on column issueSteps.entryDate is
'进入该处理部门的时间';
comment on column issueSteps.entryOperate is
'进入该处理部门的原因';
comment on column issueSteps.endDate is
'该步骤的结束时间';
comment on column issueSteps.lastDealDate is
'该步骤上一次处理的时间';
comment on column issueSteps.superviseLevel is
'该步骤督办状态';
comment on column issueSteps.state is
'该步骤状态';
comment on column issueSteps.backTo is
'该步骤如果回退的参考步骤';
comment on column issueSteps.issue is
'该步骤所属事件的id';
comment on column issueSteps.groupid is
'处理部门的处理步骤组id';
comment on column issuesteps.fourTeams is '四支队伍名称(存储为队伍的ID)';
comment on column ISSUESTEPS.FORISSUELOGID is '针对的日志编号';
comment on column ISSUESTEPS.DEALSTEPINDEX is '处理步骤编号';
comment on column ISSUESTEPS.DEALTYPE is '处理类型';
comment on column ISSUESTEPS.DEALSTATE is '处理状态(是否完成)';
comment on column ISSUESTEPS.DEALUSERNAME is '处理用户';
comment on column ISSUESTEPS.MOBILE is '处理人手机';
comment on column ISSUESTEPS.DEALDESCRIPTION is '处理描述';
comment on column ISSUESTEPS.LOGCOMPLETETIME is '日志完成时间';
comment on column ISSUESTEPS.FORLOGENTRYTIME is '针对日志的创建时间';
comment on column ISSUESTEPS.CONTENT is '内容';
comment on column issuesteps.delayWorkday is '允许延长工作日数';
comment on column issuesteps.delaystate is '延期状态(0 未申请 1 审核中 2 审核通过 3 审核不通过)';
comment on column issuesteps.isextended is '是否超期';
comment on column issuesteps.emergencylevel is '重大紧急等级';
comment on column issuesteps.targetorglevel is '目标组织机构层级';
comment on column issuesteps.targetorgfunctionalorgType is '目标组织机构类型';

CREATE INDEX ISSUESTEPS_TARGETORGLEVEL ON ISSUESTEPS (TARGETORGLEVEL,TARGETORGFUNCTIONALORGTYPE,TARGETINTERNALCODE);

/*==============================================================*/
/* Table: issueLogs                                             */
/*==============================================================*/
create table issueLogs  (
   id                   NUMBER(10)                      not null,
   issueId              NUMBER(10)                      not null,
   dealOrgId            NUMBER(10)                      not null,
   targeOrgId           NUMBER(10),
   forIssueLogId        NUMBER(10),
   backIssueLogId       NUMBER(10),
   dealStepIndex        NUMBER(10),
   returnToIssueLogId   NUMBER(10),
   supervisionState     NUMBER(5),
   dealType             NUMBER(4),
   dealState            NUMBER(4),
   dealOrgInternalCode  VARCHAR2(32),
   dealUserName         VARCHAR2(60)                    not null,
   mobile               VARCHAR2(15),
   dealDescription      VARCHAR2(600),
   targeOrgInternalCode VARCHAR2(32),
   stateClass           VARCHAR2(200),
   createUser           VARCHAR2(60)                    not null,
   updateUser           VARCHAR2(60),
   dealTime             DATE                            not null,
   dealDeadline         DATE,
   logCompleteTime      DATE,
   forLogEntryTime      DATE,
   createDate           DATE                            not null,
   updateDate           DATE,
   content              CLOB,
   stepID               NUMBER(10),
   fourTeamsName        varchar2(60),
   constraint pkIssueLogs primary key (id)
);
comment on table issueLogs is
'事件处理日志表';
comment on column issueLogs.issueId is
'服务办事编号';
comment on column issueLogs.dealOrgId is
'处理部门编号';
comment on column issueLogs.targeOrgId is
'目标部门编号';
comment on column issueLogs.forIssueLogId is
'针对的日志编号';
comment on column issueLogs.backIssueLogId is
'回退的日志编号';
comment on column issueLogs.dealStepIndex is
'处理步骤编号';
comment on column issueLogs.supervisionState is
'督办状态';
comment on column issueLogs.dealType is
'处理类型';
comment on column issueLogs.dealState is
'处理状态(是否完成)';
comment on column issueLogs.dealOrgInternalCode is
'处理部门内部编号';
comment on column issueLogs.dealUserName is
'处理用户';
comment on column issueLogs.mobile is
'处理人手机';
comment on column issueLogs.dealDescription is
'处理描述';
comment on column issueLogs.targeOrgInternalCode is
'目标部门内部编号';
comment on column issueLogs.stateClass is
'状态类名';
comment on column issueLogs.createUser is
'创建人';
comment on column issueLogs.updateUser is
'修改人';
comment on column issueLogs.dealTime is
'处理时间';
comment on column issueLogs.dealDeadline is
'事件交办时 给主办部门指定的办理截止时间';
comment on column issueLogs.logCompleteTime is
'日志完成时间';
comment on column issueLogs.forLogEntryTime is
'针对日志的创建时间';
comment on column issueLogs.createDate is
'创建时间';
comment on column issueLogs.updateDate is
'修改时间';
comment on column issueLogs.content is
'内容';
comment on column issueLogs.stepid is
'处理步骤ID';
comment on column issuelogs.fourTeamsName is '四支队伍名称';
CREATE INDEX indexIssuelogsIssueId ON issuelogs (issueId);
/*==============================================================*/
/* Table: issueStepGroups                                       */
/*==============================================================*/
create table issueStepGroups  (
   id                   NUMBER(10)                      not null,
   issue                NUMBER(10) ,
   keyStep        		NUMBER(10) ,
   entyLog         		NUMBER(10) ,
   outLog               NUMBER(10) ,
   constraint pkIssueStepGroups primary key (id)
);
comment on table issueStepGroups is
'处理步骤组 (指事件从进入该部门到从该部门流出或结案这期间的处理步骤)';
comment on column issueStepGroups.id is
'处理步骤组id';
comment on column issueStepGroups.issue is
'事件ID';
comment on column issueStepGroups.keyStep is
'该事件正在处理的步骤id';
comment on column issueStepGroups.entyLog is
'事件进入处理部门的处理记录ID';
comment on column issueStepGroups.outLog is
'事件流出处理部门的处理记录ID';
/*==============================================================*/
/* Table: topIssues                                      */
/*==============================================================*/
create table topIssues  (
   id                   NUMBER(10)                      not null,
   issueId              NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   issueTag          	NUMBER(2)                      	not null,
   topState      		NUMBER(1)                    	default 0,
   topDate           	DATE									,
   constraint pkTopIssues primary key (id)
);
comment on table topIssues is
'事件置顶关联表';
comment on column topIssues.issueId is
'事件id';
comment on column topIssues.orgId is
'置顶网格id';
comment on column topIssues.issueTag is
'事件标签(待办/已办/已办结/宣传案例/历史遗留)';
comment on column topIssues.topState is
'置顶状态(0:未置顶 1:置顶)';
comment on column topIssues.topDate is
'置顶时间';

/*==============================================================*/
/* Table: issueEvaluate     事件评价                                                                                                       */
/*==============================================================*/
create table issueEvaluate
(
  ID                      NUMBER(10)     not null,
  issueId                 NUMBER(10)     not null,
  evaluateType            NUMBER(10)     not null,
  evaluateContent         varchar2(600)  not null,
  evaluateTime            DATE           not null,
  CREATEUSER              VARCHAR2(30)   not null,
  UPDATEUSER              VARCHAR2(30),
  CREATEDATE              DATE           not null,
  UPDATEDATE              DATE,
  constraint pkIssueEvaluate primary key (ID),
  constraint fkIssueEvaluateIssue foreign key (issueId) references issues (id) on delete cascade
);
comment on table issueEvaluate
  is '事件评价';
comment on column issueEvaluate.ID
  is '事件评价ID';
comment on column issueEvaluate.issueId
  is '事件ID';
comment on column issueEvaluate.evaluateType
  is '评价类型';
comment on column issueEvaluate.evaluateContent
  is '评价内容';
comment on column issueEvaluate.evaluateTime
  is '评价时间';
comment on column issueEvaluate.CREATEUSER
  is '创建用户';
comment on column issueEvaluate.UPDATEUSER
  is '修改用户';
comment on column issueEvaluate.CREATEDATE
  is '创建时间';
comment on column issueEvaluate.UPDATEDATE
  is '修改时间';

/*==============================================================*/
/* Table: historicalIssues                                      */
/*==============================================================*/
create table historicalIssues  (
   id                   NUMBER(10)                      not null,
   issueId              NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   issueLogId           NUMBER(10)                      ,
   orgInternalCode      VARCHAR2(32)                    not null,
   constraint pkHistoricalIssues primary key (id),
   constraint fkHistoricalIssuesOrg foreign key (orgId) references organizations (id),
   constraint fkHistoricalIssuesIssue foreign key (issueId) references issues (id),
   constraint fkHistoricalIssuesIssueLog foreign key (issueLogId) references issueLogs (id)
);
comment on table historicalIssues is
'历史遗留事件表';
comment on column historicalIssues.issueId is
'服务办事编号';
comment on column historicalIssues.orgId is
'部门编号';
comment on column historicalIssues.issueLogId is
'服务办事日志编号';
comment on column historicalIssues.orgInternalCode is
'orgInternalCode';
create index idx_historicalIssues_orgId on historicalIssues (orgId ASC);

/*==============================================================*/
/* Table: publicltyCass                                         */
/*==============================================================*/
create table publicltyCass  (
   id                   NUMBER(10)                      not null,
   issueId              NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   issueLogId           NUMBER(10)                      ,
   constraint fkPublicltyCassIssue foreign key (issueId) references issues (id),
   constraint fkPublicltyCassIssueLog foreign key (issueLogId) references issueLogs (id),
   constraint fkPublicltyCassOrg foreign key (orgId) references organizations (id)
);
comment on table publicltyCass is
'宣传案例';
comment on column publicltyCass.issueId is
'事件id';
comment on column publicltyCass.orgId is
'部门id';
comment on column publicltyCass.issueLogId is
'事件处理记录id';

/*==============================================================*/
/* Table: hospitals                                             */
/*==============================================================*/
create table hospitals  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   hospitalLevel        NUMBER(10),
   kind                 NUMBER(10),
   type                 NUMBER(10),
   isMedicalInsurance   NUMBER(1),
   orgInternalCode      VARCHAR2(32)                    not null,
   anotherName          VARCHAR2(60),
   hospitalName         VARCHAR2(90)                    not null,
   address              VARCHAR2(150)                   not null,
   director             VARCHAR2(60),
   affiliatedUnit       VARCHAR2(150),
   contactName          VARCHAR2(60),
   telephone            VARCHAR2(15),
   mobileNumber         VARCHAR2(11),
   email                VARCHAR2(50),
   fax                  VARCHAR2(15),
   remark               VARCHAR2(600),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   isEmphasis	        NUMBER(2) default 0,
   imgUrl               VARCHAR2(300),
   logOutTime           DATE,
   logOutReason         VARCHAR2(300),
   attentionExtent      NUMBER(10),
   SOURCESSTATE         NUMBER(1)            default 1,
   constraint pkHospitals primary key (id),
   constraint fkHospitalsOrg foreign key (orgId) references organizations (id)
);

comment on table hospitals is
'医院信息';

comment on column hospitals.id is
'医院ID';

comment on column hospitals.orgId is
'所属网格';

comment on column hospitals.hospitalLevel is
'医院等级';

comment on column hospitals.kind is
'医院性质';

comment on column hospitals.type is
'医院类型';

comment on column hospitals.isMedicalInsurance is
'是否医保';

comment on column hospitals.orgInternalCode is
'所属网格编号';

comment on column hospitals.anotherName is
'医院别名';

comment on column hospitals.hospitalName is
'医院名称';

comment on column hospitals.address is
'医院地址';

comment on column hospitals.director is
'医院院长';

comment on column hospitals.affiliatedUnit is
'所属单位';

comment on column hospitals.contactName is
'联系人姓名';

comment on column hospitals.telephone is
'联系人固定电话';

comment on column hospitals.mobileNumber is
'联系人手机号码';

comment on column hospitals.email is
'联系人电子邮件';

comment on column hospitals.fax is
'传真';

comment on column hospitals.remark is
'备注';

comment on column hospitals.fullPinyin is
'全拼';

comment on column hospitals.simplePinyin is
'简拼';

comment on column hospitals.createUser is
'创建人';

comment on column hospitals.updateUser is
'修改人';

comment on column hospitals.createDate is
'创建时间';

comment on column hospitals.updateDate is
'修改时间';

comment on column hospitals.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

/*==============================================================*/
/* Index: idx_Hospital_orgId                                    */
/*==============================================================*/
create index idx_Hospital_orgId on hospitals (
   orgId ASC
);

/*==============================================================*/
/* Index: idx_Hospital_orgIntCode                               */
/*==============================================================*/
create index idx_Hospital_orgIntCode on hospitals (
   orgInternalCode ASC
);

/*==============================================================*/
/* Index: idx_Hospital_hospitalName                             */
/*==============================================================*/
create index idx_Hospital_hospitalName on hospitals (
   hospitalName ASC
);

/*==============================================================*/
/* Index: idx_Hospital_fullpy                                   */
/*==============================================================*/
create index idx_Hospital_fullpy on hospitals (
   fullPinyin ASC
);

/*==============================================================*/
/* Index: idx_Hospital_simplePy                                 */
/*==============================================================*/
create index idx_Hospital_simplePy on hospitals (
   simplePinyin ASC
);

/*==============================================================*/
/* Index: idx_H_orgIntCodeAndName                               */
/*==============================================================*/
create unique index idx_H_orgIntCodeAndName on hospitals (
   orgInternalCode ASC,
   hospitalName ASC
);

/* Table: idleYouths                                            */
/*==============================================================*/
create table IDLEYOUTHS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32),
   WORKCONDITION        VARCHAR2(300),
   STAFFTYPE            NUMBER(10),
   GUARDIANNAME         VARCHAR2(60),
   GUARDIANTELEPHONE    VARCHAR2(15),
   GUARDIANMOBILENUMBER VARCHAR2(11),
   ISSTAYINSCHOOL       NUMBER(1)            default 0,
   SCHOOLNAME           VARCHAR2(90),
   OLDCURRENTADDRESS    VARCHAR2(150),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                 not null,
   UPDATEDATE           DATE,
   constraint PKIDLEYOUTHS primary key (ID),
   constraint fkIdleYouthsOrg foreign key (orgId)
         references organizations (id)
);

comment on table IDLEYOUTHS is
'重点青少年';

comment on column IDLEYOUTHS.ORGID is
'所属网格';

comment on column IDLEYOUTHS.ORGINTERNALCODE is
'所属网格编号';

comment on column IDLEYOUTHS.STAFFTYPE is
'人员类型';

comment on column IDLEYOUTHS.GUARDIANNAME is
'监护人';

comment on column IDLEYOUTHS.GUARDIANTELEPHONE is
'监护人电话';

comment on column IDLEYOUTHS.GUARDIANMOBILENUMBER is
'监护人手机号码';

comment on column IDLEYOUTHS.ISSTAYINSCHOOL is
'是否在校住宿';

comment on column IDLEYOUTHS.SCHOOLNAME is
'学校名称';

comment on column IDLEYOUTHS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column IDLEYOUTHS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column IDLEYOUTHS.ISEMPHASIS is
'是否关注';

comment on column IDLEYOUTHS.CREATEUSER is
'创建用户';

comment on column IDLEYOUTHS.UPDATEUSER is
'修改用户';

comment on column IDLEYOUTHS.CREATEDATE is
'创建日期';

comment on column IDLEYOUTHS.UPDATEDATE is
'修改时间';



/*==============================================================*/
/* Table: idleYouthsHasPropertyDicts                                      */
/*==============================================================*/
create table idleYouthsHasPropertyDicts  (
   idleYouthsId               NUMBER(10)                      not null,
   propertyDictId            NUMBER(10)                      not null,
   constraint pkidleYouthsHasPropertyDicts primary key (idleYouthsId, propertyDictId),
   constraint fkidleYouHasProDictIdleYths foreign key (idleYouthsId)
         references idleYouths (id)
);


/*==============================================================*/
/* Index: idx_IY_orgIntCodeAndisEmphasis                        */
/*==============================================================*/
create index idx_IY_orgIntCodeAndisEmphasis on idleYouths (
   orgInternalCode ASC,
   isEmphasis ASC
);


/*==============================================================*/
/* Table: issueInvestigationMediate                             */
/*==============================================================*/
create table issueInvestigationMediate  (
   id                   NUMBER(10)                      not null,
   cityCount            NUMBER(10)                      not null,
   districtCount        NUMBER(10)                      not null,
   townCount            NUMBER(10)                      not null,
   villageCount         NUMBER(10)                      not null,
   subtotal             NUMBER(10)                      not null,
   yearCumulative       NUMBER(10)                      not null,
   year                 NUMBER(10)                      not null,
   month                NUMBER(10)                      not null,
   week                 NUMBER(10)                      not null,
   quarter              NUMBER(10),
   typeName             VARCHAR2(60)                    not null,
   typeSubsetName       VARCHAR2(60)                    not null,
   types                VARCHAR2(32)                    not null,
   startDate            DATE                            not null,
   endDate              DATE                            not null,
   searchEndDate        DATE                            not null,
   constraint pkIssueInvestigationMediate primary key (id)
);

comment on table issueInvestigationMediate is
'矛盾纠纷排查调处情况报表';

comment on column issueInvestigationMediate.id is
'id';

comment on column issueInvestigationMediate.cityCount is
'矛盾纠纷排查调处市级记录';

comment on column issueInvestigationMediate.districtCount is
'矛盾纠纷排查调处县级记录';

comment on column issueInvestigationMediate.townCount is
'矛盾纠纷排查调处镇级记录';

comment on column issueInvestigationMediate.villageCount is
'矛盾纠纷排查调处村级记录';

comment on column issueInvestigationMediate.subtotal is
'矛盾纠纷排查调处小计';

comment on column issueInvestigationMediate.yearCumulative is
'矛盾纠纷排查调处年度累计';

comment on column issueInvestigationMediate.year is
'矛盾纠纷排查调处统计年份';

comment on column issueInvestigationMediate.month is
'矛盾纠纷排查调处统计月份';

comment on column issueInvestigationMediate.week is
'矛盾纠纷排查调处统计第几周';

comment on column issueInvestigationMediate.quarter is
'矛盾纠纷排查调处统计第几季度';

comment on column issueInvestigationMediate.typeName is
'矛盾纠纷排查调处父级类型';

comment on column issueInvestigationMediate.typeSubsetName is
'矛盾纠纷排查调处子级类型';

comment on column issueInvestigationMediate.types is
'矛盾纠纷排查调处统计生成类型(年报，月报，周报)';

comment on column issueInvestigationMediate.startDate is
'矛盾纠纷排查调处统计开始时间';

comment on column issueInvestigationMediate.endDate is
'矛盾纠纷排查调处统计结束时间';

comment on column issueInvestigationMediate.searchEndDate is
'矛盾纠纷排查调处实际查询结束时间';

/*==============================================================*/
/* Table: issueStatueStanals                                    */
/*==============================================================*/
create table issueStatueStanals  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   overTimeNoTdone      NUMBER(10)                      not null,
   overTimeDone         NUMBER(10)                      not null,
   normalNotDone        NUMBER(10)                      not null,
   normalDone           NUMBER(10)                      not null,
   year                 NUMBER(10)                      not null,
   month                NUMBER(10)                      not null,
   issueStatDate        Date                            not null,
   constraint pkIssueStatueStanals primary key (id),
   constraint fkIssueStatueStanalsOrg foreign key (orgId)
         references organizations (id)
);

comment on table issueStatueStanals is
'状态统计表';

comment on column issueStatueStanals.id is
'状态统计id';

comment on column issueStatueStanals.orgId is
'所属网格';

comment on column issueStatueStanals.orgInternalCode is
'所属责任区编号';

comment on column issueStatueStanals.overTimeNoTdone is
'待办(超期)';

comment on column issueStatueStanals.overTimeDone is
'已办(超期)';

comment on column issueStatueStanals.normalNotDone is
'待办(正常)';

comment on column issueStatueStanals.normalDone is
'已办(正常)';

comment on column issueStatueStanals.year is
'年';

comment on column issueStatueStanals.month is
'月';

comment on column issueStatueStanals.issueStatDate is
'统计时间';

/*==============================================================*/
/* Table: issueTypeStanals                                      */
/*==============================================================*/
create table issueTypeStanals  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   domainId             NUMBER(10)                      not null,
   typeId               NUMBER(10),
   count                NUMBER(10)                      not null,
   domainName           VARCHAR2(60)                    not null,
   typeName             VARCHAR2(150),
   orgInternalCode      VARCHAR2(32)                    not null,
   startDate            DATE                            not null,
   endDate              DATE                            not null,
   year                 NUMBER(10),
   month                NUMBER(10),
   constraint pkIssueTypeStanals primary key (id),
   constraint fkIssueTypeStanalsOrg foreign key (orgId)
         references organizations (id)
);

comment on table issueTypeStanals is
'服务办事类别统计';

comment on column issueTypeStanals.orgId is
'部门id';

comment on column issueTypeStanals.domainId is
'issueTypeDomain的Id';

comment on column issueTypeStanals.typeId is
'issueType的Id';

comment on column issueTypeStanals.count is
'统计数';

comment on column issueTypeStanals.domainName is
'domainName';

comment on column issueTypeStanals.typeName is
'typeName';

comment on column issueTypeStanals.orgInternalCode is
'部门orgInternalCode';

comment on column issueTypeStanals.startDate is
'开始时间';

comment on column issueTypeStanals.endDate is
'结束时间';


/*==============================================================*/
/* Table: lettingHouses                                         */
/*==============================================================*/
create table lettingHouses  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   usage                NUMBER(10),
   type                 NUMBER(10),
   lettingHouseProperty NUMBER(10),
   lettingHouseStruts   NUMBER(10),
   hiddenTroubleLevel   NUMBER(10)						not null,
   limitPersons         NUMBER(6),
   realityPersons       NUMBER(6),
   roomNumbers          NUMBER(6),
   name                 VARCHAR2(60)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   lettingHouseNo       VARCHAR2(20),
   orgInternalCode      VARCHAR2(32)                    not null,
   idCardNo             VARCHAR2(18),
   landlordAddr         VARCHAR2(150),
   lettingHouseAddr     VARCHAR2(150)                   not null,
   lettingHouseAreas    VARCHAR2(30),
   hiddenRectification  VARCHAR2(600)                  ,
   telephone            VARCHAR2(15),
   mobileNumber         VARCHAR2(11),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   registDate           DATE,
   isEmphasis           NUMBER(1)                       default 0,
   constraint pkLettingHouses primary key (id),
   constraint fkLettingHousesOrg foreign key (orgId)
         references organizations (id)
);

comment on table lettingHouses is
'出租房';

comment on column lettingHouses.orgId is
'所属网格';

comment on column lettingHouses.usage is
'出租房用途';

comment on column lettingHouses.type is
'出租房类别';

comment on column lettingHouses.lettingHouseProperty is
'出租房性质';

comment on column lettingHouses.lettingHouseStruts is
'出租房结构';

comment on column lettingHouses.hiddenTroubleLevel is
'隐患程度';

comment on column lettingHouses.limitPersons is
'限住人数';

comment on column lettingHouses.realityPersons is
'实住人数';

comment on column lettingHouses.roomNumbers is
'房间数';

comment on column lettingHouses.name is
'出租人姓名';

comment on column lettingHouses.fullPinyin is
'出租人姓名全拼';

comment on column lettingHouses.simplePinyin is
'出租人姓名简拼';

comment on column lettingHouses.lettingHouseNo is
'编号';

comment on column lettingHouses.idCardNo is
'身份证号码';

comment on column lettingHouses.landlordAddr is
'出租人住址';

comment on column lettingHouses.lettingHouseAddr is
'出租房地址';

comment on column lettingHouses.lettingHouseAreas is
'出租房面积';

comment on column lettingHouses.hiddenRectification is
'隐患整改情况';

comment on column lettingHouses.telephone is
'固定电话';

comment on column lettingHouses.mobileNumber is
'手机号码';

comment on column lettingHouses.registDate is
'登记日期';

comment on column lettingHouses.isEmphasis is
'登记日期';

/*==============================================================*/
/* Index: idx_LHouse_orgInternalCode                                */
/*==============================================================*/
create index idx_LHouse_orgInternalCode on lettingHouses (
   orgInternalCode ASC
);

/*==============================================================*/
/* Table: mentalPatients                                        */
/*==============================================================*/
create table MENTALPATIENTS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   HEALTHSTATE          NUMBER(10),
   ADDRESS              VARCHAR2(150),
   PSYCHOSISNAME        VARCHAR2(150),
   PSYCHOSISTYPE        NUMBER(10),
   DANGERLEVEL          NUMBER(10),
   ISTREAT              NUMBER(1),
   CUREDEPARTMENT       VARCHAR2(150),
   BUSINESSREMARK       VARCHAR2(900),
   GUARDIAN             VARCHAR2(60),
   GUARDIANTELEPHONE    VARCHAR2(80),
   GUARDIANMOBILENUMBER VARCHAR2(50),
   DISEASETIME          DATE,
   TREATMENTSTATE       NUMBER(10),
   RECOVERYTIME         DATE,
   ISUNDERGO_TREATMENT  NUMBER(1),
   SCHOOL               VARCHAR2(150),
   OLDCURRENTADDRESS    VARCHAR2(150),
   RESIDENCETYPE        NUMBER(10),
   SOURCESSTATE         NUMBER(1)            default 1,
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PKMENTALPATIENTS primary key (ID),
   constraint fkMentalPatientsOrg foreign key (orgId)
         references organizations (id)
);

comment on table MENTALPATIENTS is
'精神病人';

comment on column MENTALPATIENTS.ID is
'ID';

comment on column MENTALPATIENTS.ORGID is
'所属网格';

comment on column MENTALPATIENTS.ORGINTERNALCODE is
'所属责任区编号';

comment on column MENTALPATIENTS.HEALTHSTATE is
'健康状况';

comment on column MENTALPATIENTS.PSYCHOSISNAME is
'患病名称';

comment on column MENTALPATIENTS.PSYCHOSISTYPE is
'精神病类型';

comment on column MENTALPATIENTS.DANGERLEVEL is
'发病危险等级';

comment on column MENTALPATIENTS.ISTREAT is
'是否接受过精神病治疗';

comment on column MENTALPATIENTS.CUREDEPARTMENT is
'康复机构';

comment on column MENTALPATIENTS.BUSINESSREMARK is
'业务信息备注';

comment on column MENTALPATIENTS.GUARDIAN is
'监护人';

comment on column MENTALPATIENTS.GUARDIANTELEPHONE is
'监护人联系电话';

comment on column MENTALPATIENTS.GUARDIANMOBILENUMBER is
'监护人移动电话';

comment on column MENTALPATIENTS.DISEASETIME is
'发病时间';

comment on column MENTALPATIENTS.TREATMENTSTATE is
'治疗状态';

comment on column MENTALPATIENTS.RECOVERYTIME is
'康复时间';

comment on column MENTALPATIENTS.ISUNDERGO_TREATMENT is
'目前是否在接受治疗';

comment on column MENTALPATIENTS.SCHOOL is
'就读学校';

comment on column MENTALPATIENTS.RESIDENCETYPE is
'户口类别';

comment on column MENTALPATIENTS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column MENTALPATIENTS.ISEMPHASIS is
'是否关注';

comment on column MENTALPATIENTS.CREATEUSER is
'创建用户';

comment on column MENTALPATIENTS.CREATEDATE is
'创建日期';

comment on column MENTALPATIENTS.UPDATEUSER is
'修改用户';

comment on column MENTALPATIENTS.UPDATEDATE is
'修改时间';

/*==============================================================*/
/* Index: idx_MP_orgIntCodeAndisEmphasis                        */
/*==============================================================*/
create index idx_MP_orgIntCodeAndisEmphasis on mentalPatients (
   orgInternalCode ASC,
   isEmphasis ASC
);


/*==============================================================*/
/* Table: 新社会组织                               */
/*==============================================================*/
create table newSocietyOrganizations  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   type                 NUMBER(10)                      not null,
   name                 VARCHAR2(60)                    not null,
   legalPerson          VARCHAR2(60)                    not null,
   legalPersonTelephone VARCHAR2(15),
   legalPersonMobileNumber VARCHAR2(11),
   address              VARCHAR2(150),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   orgInternalCode      VARCHAR2(32)                    not null,
   remark               VARCHAR2(600),
   imgUrl               VARCHAR2(300),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   isEmphasis           NUMBER(1)                       default 0,

   subType				NUMBER(10),
   chargeUnit           VARCHAR2(180),
   registrationNumber   NUMBER(32),
   validityStartDate    DATE,
   validityEndDate      DATE,
   personNum            NUMBER(10),
   partyNum				NUMBER(10),
   introduction         VARCHAR2(600),
   honor                VARCHAR2(600),
   area                 NUMBER(10,2),
   logOutTime           DATE,
   logOutReason         VARCHAR2(300),
   buildingId      	    VARCHAR2(30),
   centerX 			    NUMBER(10),
   centerY 				NUMBER(10),
   mainResponsibilities nvarchar2(300),
   SOURCESSTATE NUMBER(1)  default 1,
   constraint pkNewSocietyOrganizations primary key (id),
   constraint fkNewSocietyOrganizationsOrg foreign key (orgId)
         references organizations (id)
);

comment on table newSocietyOrganizations is
'新社会组织';

comment on column newSocietyOrganizations.id is
'人员id';

comment on column newSocietyOrganizations.orgId is
'所属网格';

comment on column newSocietyOrganizations.type is
'组织类别';

comment on column newSocietyOrganizations.name is
'组织名称';

comment on column newSocietyOrganizations.legalPerson is
'法定代表人';

comment on column newSocietyOrganizations.legalPersonTelephone is
'固定电话';

comment on column newSocietyOrganizations.legalPersonMobileNumber is
'联系手机';

comment on column newSocietyOrganizations.address is
'住所';

comment on column newSocietyOrganizations.fullPinyin is
'全拼';

comment on column newSocietyOrganizations.simplePinyin is
'简拼';

comment on column newSocietyOrganizations.orgInternalCode is
'所属责任区编号';

comment on column newSocietyOrganizations.remark is
'备注';

comment on column newSocietyOrganizations.createUser is
'创建用户';

comment on column newSocietyOrganizations.updateUser is
'修改用户';

comment on column newSocietyOrganizations.updateDate is
'修改时间';

comment on column newSocietyOrganizations.createDate is
'创建日期';

comment on column newSocietyOrganizations.subtype is
'组织子类别';

comment on column newSocietyOrganizations.chargeUnit is
'业务主管单位';

comment on column newSocietyOrganizations.registrationNumber is
'登记证号码';

comment on column newSocietyOrganizations.validityStartDate is
'有效期开始日期';

comment on column newSocietyOrganizations.validityEndDate is
'有效期结束日期';

comment on column newSocietyOrganizations.personNum is
'成员数';

comment on column newSocietyOrganizations.partyNum is
'党员人数';

comment on column newSocietyOrganizations.introduction is
'简 介';

comment on column newSocietyOrganizations.honor is
'获得荣誉';

comment on column newSocietyOrganizations.area is
'面积';

comment on column newSocietyOrganizations.logOutTime is
'注销时间';

comment on column newSocietyOrganizations.logOutReason is
'注销原因';
comment on column NEWSOCIETYORGANIZATIONS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

/*==============================================================*/
/* Index: idx_newS_orgIdAndName                    */
/*==============================================================*/
create unique index idx_newS_orgIdAndName on newSocietyOrganizations (
   orgId ASC,
   name ASC
);

/*==============================================================*/
/* Table: otherLocales                                          */
/*==============================================================*/
create table otherLocales  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   type                 NUMBER(10),
   contactPerson        VARCHAR2(60),
   orgInternalCode      VARCHAR2(32)                    not null,
   name                 VARCHAR2(60)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   address              VARCHAR2(150),
   mobileNumber         VARCHAR2(11),
   telephone            VARCHAR2(15),
   imgUrl               VARCHAR2(300),
   remark               VARCHAR2(600),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   isEmphasis           NUMBER(1)                      default 0,
   isEmphasisReason     VARCHAR2(300),
   isEmphasisDate       DATE,
   sourcesState number(1) default 1,
   attentionExtent      NUMBER(10),
   practitioner_number	NUMBER(10),
   constraint pkotherLocales primary key (id),
   constraint fkOtherLocalesOrg foreign key (orgId)
         references organizations (id)
);

comment on table otherLocales is
'其他场所';

comment on column otherLocales.id is
'主键';

comment on column otherLocales.orgId is
'所属网格';

comment on column otherLocales.type is
'场所类型';

comment on column otherLocales.contactPerson is
'联系人';

comment on column otherLocales.orgInternalCode is
'所属网格内置编码';

comment on column otherLocales.name is
'场所名称';

comment on column otherLocales.fullPinyin is
'全拼';

comment on column otherLocales.simplePinyin is
'简拼';

comment on column otherLocales.address is
'场所地址';

comment on column otherLocales.mobileNumber is
'联系手机号码';

comment on column otherLocales.telephone is
'联系电话';

comment on column otherLocales.remark is
'备注';

comment on column otherLocales.sourcesState
  is '数据来源：1.录入；2.认领；3.已核实';
comment on column otherLocales.attentionExtent is
'关注程度：1.一般；2.中等；3.严重';

comment on column otherLocales.practitioner_number is
'从业人员数';

/*==============================================================*/
/* Index: idx_OL_orgIdAndName                                   */
/*==============================================================*/
create unique index idx_OL_orgIdAndName on otherLocales (
   orgId ASC,
   name ASC
);

/*==============================================================*/
/* Index: idx_OL_orgIntCodeAndisEmphasis                        */
/*==============================================================*/
create index idx_OL_orgIntCodeAndisEmphasis on otherLocales (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Table: constructionUnits                                          */
/*==============================================================*/
create table constructionUnits  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   projectName          VARCHAR2(60)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   projectAddress       VARCHAR2(150)					not null,
   developmentUnit		VARCHAR2(60)					not null,
   developmentContactPerson   VARCHAR2(60)				not null,
   developmentContactPersonPhone   VARCHAR2(15)			not null,
   contractor			VARCHAR2(60),
   contractorContactPerson VARCHAR2(60),
   contractorContactPersonPhone VARCHAR2(15),
   laborer				VARCHAR2(60),
   laborerContactPerson	VARCHAR2(60),
   laborerContactPersonPhone	VARCHAR2(15),
   salaryPayDate		DATE,
   actualTotalSalary	NUMBER(15,2),
   shouldSignContractNumber NUMBER,
   notSignContractNumber	NUMBER,
   workersNumber			NUMBER,
   startTime				DATE,
   remark               VARCHAR2(300),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   isEmphasis           NUMBER(1)                      default 0,
   constraint pkconstructionUnits primary key (id),
   constraint fkconstructionUnits foreign key (orgId)
         references organizations (id)
);

comment on table constructionUnits is
'建筑施工单位';

comment on column constructionUnits.id is
'主键';

comment on column constructionUnits.orgId is
'所属网格';


comment on column constructionUnits.orgInternalCode is
'所属网格内置编码';


comment on column constructionUnits.fullPinyin is
'全拼';

comment on column constructionUnits.simplePinyin is
'简拼';

comment on column constructionUnits.remark is
'备注';

/*==============================================================*/
/* Index: idx_CU_orgIdAndName                                   */
/*==============================================================*/
create unique index idx_CU_orgIdAndName on constructionUnits (
   orgId ASC,
   projectName ASC
);

/*==============================================================*/
/* Index: idx_CU_orgIntCodeAndisEmphasis                        */
/*==============================================================*/
create index idx_CU_orgIntCodeAndisEmphasis on constructionUnits (
   orgInternalCode ASC,
   isEmphasis ASC
);




/*==============================================================*/
/* Table: overTimeIssueLog                                      */
/*==============================================================*/
create table overTimeIssueLog  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   issueId              NUMBER(10)                      not null,
   issueLogId           NUMBER(10)                      not null,
   overType             NUMBER(10)                      not null,
   year                 NUMBER(4)                       not null,
   month                NUMBER(2)                       not null,
   orgName              VARCHAR2(32)                    not null,
   orginternalCode      VARCHAR2(32)                    not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkOverTimeIssueLog primary key (id),
   constraint fkOverTimeIssueLogIssue foreign key (issueId)
         references issues (id),
   constraint fkOvertimeissuelogIssueLog foreign key (issueLogId)
         references issueLogs (id),
   constraint fkOvertimeissuelogOrg foreign key (orgId)
         references organizations (id)
);

comment on table overTimeIssueLog is
'超期处理记录表';

comment on column overTimeIssueLog.orgId is
'组织机构ID';

comment on column overTimeIssueLog.issueId is
'服务办事ID';

comment on column overTimeIssueLog.issueLogId is
'服务办事日志ID';

comment on column overTimeIssueLog.overType is
'督办类型';

comment on column overTimeIssueLog.year is
'年份';

comment on column overTimeIssueLog.month is
'月份';

comment on column overTimeIssueLog.orgName is
'组织机构名称';

comment on column overTimeIssueLog.orginternalCode is
'组织机构编码';

/*==============================================================*/
/* Table: permissions                                           */
/*==============================================================*/
create table permissions  (
   id                   NUMBER(10)                      not null,
   cname                VARCHAR2(100)                   not null,
   ename                VARCHAR2(100)                   not null,
   permissionType       NUMBER(10)                      not null,
   moduleName           VARCHAR2(45)                    not null,
   enable               NUMBER(1)                      default 0 not null,
   parentId             NUMBER(10),
   description          VARCHAR2(200),
   normalUrl            VARCHAR2(200),
   leaderUrl            VARCHAR2(200),
   indexId              NUMBER(10),
   gridUrl              VARCHAR2(200),
   constraint pkPermissions primary key (id)
);

comment on column permissions.cname is
'权限英文名称';

comment on column permissions.ename is
'权限中文名称';

comment on column permissions.permissionType is
'权限类型:菜单，控制点';

comment on column permissions.moduleName is
'模块名称';

comment on column permissions.enable is
'是否启用该模块';

comment on column permissions.parentId is
'父菜单id';

comment on column permissions.description is
'权限描述';

/*==============================================================*/
/* Index: idx_Permission_ename                                  */
/*==============================================================*/
create unique index idx_Permission_ename on permissions (
   ename ASC
);

/*==============================================================*/
/* Index: idx_Per_id_enable                                  */
/*==============================================================*/
create index idx_Per_id_enable on permissions (
   id ASC,
   enable ASC
);


/*==============================================================*/
/* Table: outboxPlatformMessages                                     */
/*==============================================================*/
create table outboxPlatformMessages  (
   id                   NUMBER(10)                      not null,
   title                VARCHAR2(150),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   content              clob,
   historyMessage		clob,
   messageType          NUMBER(2),
   url         			VARCHAR2(200),
   orgCode         		VARCHAR2(60),
   roleOrgId         	NUMBER(10),
   senderId         	NUMBER(10),
   sendDate         	DATE,
   sendType				NUMBER(2),
   receiverType         VARCHAR2(60),
   receiverNames        clob,
   receiverId         	NUMBER(10),
   isDraft				NUMBER(1) default 0,
   originatorsName		varchar2(100),
   originatorsDate		DATE,
   recipientInfo        clob,
   constraint pkoutboxPlatformMessages primary key (id)
);

comment on table outboxPlatformMessages is
'发件箱平台消息';
comment on column outboxPlatformMessages.id is
'Id';
comment on column outboxPlatformMessages.title is
'标题';
comment on column outboxPlatformMessages.content is
'内容';
comment on column outboxPlatformMessages.historyMessage is
'历史消息内容';
comment on column outboxPlatformMessages.messageType is
'消息类型';
comment on column outboxPlatformMessages.url is
'消息中的url链接';
comment on column outboxPlatformMessages.orgCode is
'网格编码';
comment on column outboxPlatformMessages.senderId is
'发件人id';
comment on column outboxPlatformMessages.sendDate is
'发送时间';
comment on column outboxPlatformMessages.sendType is
'发送类型';
comment on column outboxPlatformMessages.receiverId is
'收件人id';

/*==============================================================*/
/* Table: inboxPlatformMessages                                     */
/*==============================================================*/
create table inboxPlatformMessages  (
   id                   NUMBER(10)                      not null,
   title                VARCHAR2(150),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   content              clob,
   historyMessage		clob,
   messageType          NUMBER(2),
   url         			VARCHAR2(200),
   orgCode         		VARCHAR2(60),
   roleOrgId         	NUMBER(10),
   senderId         	NUMBER(10),
   sendDate         	DATE,
   sendType				NUMBER(2),
   receiverType         VARCHAR2(60),
   receiverNames        clob,
   receiverId         	NUMBER(10),
   readState         	NUMBER(2),	
   readDate             DATE,
   originatorsName		varchar2(100),
   originatorsDate		DATE,
   constraint pkinboxPlatformMessages primary key (id)
);

comment on table inboxPlatformMessages is
'收件箱平台消息';
comment on column inboxPlatformMessages.id is
'Id';
comment on column inboxPlatformMessages.title is
'标题';
comment on column inboxPlatformMessages.content is
'内容';
comment on column inboxPlatformMessages.historyMessage is
'历史消息内容';
comment on column inboxPlatformMessages.messageType is
'消息类型';
comment on column inboxPlatformMessages.url is
'消息中的url链接';
comment on column inboxPlatformMessages.orgCode is
'网格编码';
comment on column inboxPlatformMessages.senderId is
'发件人id';
comment on column inboxPlatformMessages.sendDate is
'发送时间';
comment on column inboxPlatformMessages.sendType is
'发送类型';
comment on column inboxPlatformMessages.receiverType is
'收件人类型';
comment on column inboxPlatformMessages.receiverId is
'收件人id';
comment on column inboxPlatformMessages.readState is
'阅读状态/是否阅读';
comment on column inboxPlatformMessages.readDate is
'阅读时间';


/*==============================================================*/
/* Table: userhasPlatformMessages                				*/
/*==============================================================*/
create table userhasPlatformMessages  (
   id                   NUMBER(10)                      not null,
   pmId  				NUMBER(10)                      not null,
   userId               NUMBER(10)                      not null,
   readState            NUMBER(2),
   readDate           	DATE,
   deleteState          NUMBER(2),
   MESSAGETYPE 			NUMBER(2),
   SENDERID    			NUMBER(10),
   CREATEDATE 			DATE,
   constraint pkUserhasPlatformMessages primary key (id)
);
comment on table userhasPlatformMessages is
'收件人为org和role类型的平台消息关联表';
comment on column userhasPlatformMessages.pmId is
'收件箱里平台消息id';
comment on column userhasPlatformMessages.userId is
'能收到消息的用户id';
comment on column userhasPlatformMessages.readState is
'消息阅读状态 0：未阅读 1：已阅读';
comment on column userhasPlatformMessages.deleteState is
'消息的删除状态 0：未删除 1：已删除';
comment on column userhasPlatformMessages.MESSAGETYPE is
'消息类型';
comment on column userhasPlatformMessages.SENDERID is
'发件人id';
comment on column userhasPlatformMessages.CREATEDATE is
'创建时间';


/*==============================================================*/
/* Table: userHasPlatformMessageTypes         					*/
/*==============================================================*/
create table userHasPlatformMessageTypes  (
   id                   NUMBER(10)                      not null,
   userId               NUMBER(10)                      not null,
   messageType  		NUMBER(2)                       not null,
   constraint pkUserHasPlatformMessageTypes primary key (id)
);
comment on table userHasPlatformMessageTypes is
'用户订阅的平台消息表';
comment on column userHasPlatformMessageTypes.id is
'用户订阅的平台消息表的id';
comment on column userHasPlatformMessageTypes.userId is
'用户id';
comment on column userHasPlatformMessageTypes.messageType is
'平台消息类型';

/*==============================================================*/
/* Table: platformMessagesAttachFiles                          */
/*==============================================================*/
create table platformMessagesAttachFiles  (
   id                   NUMBER(10)                      not null,
   pmId  				NUMBER(10)                      not null,
   userId               NUMBER(10)                      not null,
   fileSize             NUMBER(10),
   attachType           NUMBER(2)						not null,
   fileName             VARCHAR2(150)                   not null,
   fileActualUrl        VARCHAR2(250)                   not null,
   createUser           VARCHAR2(32),
   createDate           DATE  ,
   constraint pkPlatformMessagesAttachFiles primary key (id)
);

comment on table platformMessagesAttachFiles is
'平台消息附件';


/*==============================================================*/
/* Table: poorpeople                                            */
/*==============================================================*/
create table poorpeople  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   gender               NUMBER(10)                      not null,
   poorSource           NUMBER(10),
   islowhousehold       NUMBER(1)                      default 0,
   name                 VARCHAR2(60)                    not null,
   idCardNo             VARCHAR2(18),
   currentlyAddress     VARCHAR2(150),
   telephone            VARCHAR2(15),
   simplePinyin         VARCHAR2(10),
   fullPinyin           VARCHAR2(30),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   orgInternalCode      VARCHAR2(32)                    not null,
   birthday             DATE,
   createDate           DATE                            not null,
   updateDate           DATE,
    isEmphasis           NUMBER(1)                      default 0,
   constraint pkpoorpeople primary key (id),
   constraint fkpoorpeopleOrg foreign key (orgId)
         references organizations (id)
);

comment on table poorpeople is
'困难群众信息';

comment on column poorpeople.id is
'困难群众id';

comment on column poorpeople.orgId is
'所属网格';

comment on column poorpeople.gender is
'性别';

comment on column poorpeople.poorSource is
'困难原因';

comment on column poorpeople.islowhousehold is
'是否低保户';

comment on column poorpeople.name is
'姓名';

comment on column poorpeople.idCardNo is
'身份证号码';

comment on column poorpeople.currentlyAddress is
'现在居住地';

comment on column poorpeople.telephone is
'固定电话';

comment on column poorpeople.simplePinyin is
'简拼';

comment on column poorpeople.fullPinyin is
'全拼';

comment on column poorpeople.createUser is
'创建用户';

comment on column poorpeople.updateUser is
'修改用户';

comment on column poorpeople.orgInternalCode is
'所属责任区编号';

comment on column poorpeople.birthday is
'出生日期';

comment on column poorpeople.createDate is
'创建日期';

comment on column poorpeople.updateDate is
'修改时间';

/*==============================================================*/
/* Index: idx_poo_orgIdAndidCardNo                                */
/*==============================================================*/
create unique index idx_poo_orgIdAndidCardNo on poorpeople (
   orgId ASC,
   idCardNo ASC
);

/*==============================================================*/
/* Index: idx_poo_orgCode_isEmphasis                           */
/*==============================================================*/
create index idx_poo_orgCode_isEmphasis on poorpeople (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Table: positiveInfos                                         */
/*==============================================================*/
create table POSITIVEINFOS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   ISREPEAT             NUMBER(1),
   IMPRISONMENTDATE     VARCHAR2(48),
   CASEREASON           VARCHAR2(150),
   LABOREDUADDRESS      VARCHAR2(150),
   NORESETTLEMENTREASON VARCHAR2(150),
   AGOPROFESSION        NUMBER(10),
   HOUSEHOLDID          VARCHAR2(32),
   HELPEDUCATOR         VARCHAR2(60),
   EDUCATORTELEPHONE    VARCHAR2(80),
   EDUCATORMOBILENUMBER VARCHAR2(50),
   RESETTLEMENTDATE     DATE,
   RELEASEORBACKDATE    DATE,
   POSITIVEINFOTYPE     NUMBER(10),
   ISCRIME              NUMBER(1),
   CRIMEDATE            DATE,
   CRIMINALBEHAVIOR     VARCHAR2(900),
   RESETTLEMENT         VARCHAR2(60)         default '0',
   RESIDENCETYPE        NUMBER(10),
   OLDCURRENTADDRESS    VARCHAR2(150),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PKPOSITIVEINFOS primary key (ID),
   constraint fkPositiveInfosOrg foreign key (orgId)
         references organizations (id)
);

comment on table POSITIVEINFOS is
'刑释人员';

comment on column POSITIVEINFOS.ORGID is
'所属网格';

comment on column POSITIVEINFOS.ORGINTERNALCODE is
'所属责任区编号';

comment on column POSITIVEINFOS.ISREPEAT is
'是否累犯';

comment on column POSITIVEINFOS.IMPRISONMENTDATE is
'刑期';

comment on column POSITIVEINFOS.CASEREASON is
'原罪(错)';

comment on column POSITIVEINFOS.LABOREDUADDRESS is
'劳教(服刑)场所';

comment on column POSITIVEINFOS.NORESETTLEMENTREASON is
'未安置原因';

comment on column POSITIVEINFOS.AGOPROFESSION is
'原职业';

comment on column POSITIVEINFOS.HOUSEHOLDID is
'户号';

comment on column POSITIVEINFOS.HELPEDUCATOR is
'帮教人员';

comment on column POSITIVEINFOS.EDUCATORTELEPHONE is
'帮教人员电话';

comment on column POSITIVEINFOS.EDUCATORMOBILENUMBER is
'帮教人员手机号码';

comment on column POSITIVEINFOS.RESETTLEMENTDATE is
'安置时间';

comment on column POSITIVEINFOS.RELEASEORBACKDATE is
'解教（刑释）日期';

comment on column POSITIVEINFOS.CRIMINALBEHAVIOR is
'犯罪行为';

comment on column POSITIVEINFOS.RESIDENCETYPE is
'户口类别';

comment on column POSITIVEINFOS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column POSITIVEINFOS.ATTENTIONEXTENT is
'关注程度';

comment on column POSITIVEINFOS.ISEMPHASIS is
'是否关注';

comment on column POSITIVEINFOS.CREATEUSER is
'创建用户';

comment on column POSITIVEINFOS.CREATEDATE is
'创建日期';

comment on column POSITIVEINFOS.UPDATEUSER is
'修改用户';

comment on column POSITIVEINFOS.UPDATEDATE is
'修改时间';

/*==============================================================*/
/* Index: idx_P_orgIntCodeAndisEmphasis                         */
/*==============================================================*/
create index idx_P_orgIntCodeAndisEmphasis on positiveInfos (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Table: proclamations                                         */
/*==============================================================*/
create table proclamations  (
   id                   NUMBER(10)                      not null,
   display              NUMBER(1),
   content              VARCHAR2(1500)                  not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   pcusable             NUMBER(1),
   mobileusable         NUMBER(1),
   constraint pkProclamations primary key (id)
);

comment on table proclamations is
'公告信息';

comment on column proclamations.id is
'公告id';

comment on column proclamations.display is
'是否显示';

comment on column proclamations.content is
'公告内容';

comment on column proclamations.pcusable is
'是否pc端显示';

comment on column proclamations.mobileusable is
'是否手机端显示';

/*==============================================================*/
/* Table: propertyDomains                                       */
/*==============================================================*/
create table propertyDomains  (
   id                   NUMBER(10)                      not null,
   domainName           VARCHAR2(60)                    not null,
   systemSensitive      NUMBER(1)                      default 0 not null,
   systemRestrict       CLOB,
   constraint pkPropertyDomains primary key (id)
);

comment on column propertyDomains.domainName is
'什么领域的属性';

comment on column propertyDomains.systemSensitive is
'系统敏感，是否具有系统内置属性';

comment on column propertyDomains.systemRestrict is
'系统约束';

/*==============================================================*/
/* Index: idx_PropertyDomain_domainName                         */
/*==============================================================*/
create unique index idx_PropertyDomain_domainName on propertyDomains (
   domainName ASC
);

/*==============================================================*/
/* Index: idx_PropertyDomain_sysSensit                          */
/*==============================================================*/
create index idx_PropertyDomain_sysSensit on propertyDomains (
   systemSensitive ASC
);

/*==============================================================*/
/* Table: propertyDicts                                         */
/*==============================================================*/
create table propertyDicts  (
   id                   NUMBER(10)                      not null,
   propertyDomainId     NUMBER(10)                      not null,
   internalId           NUMBER(10)                     default 0,
   displaySeq           NUMBER(10)                     default 0 not null,
   displayName          VARCHAR2(80)                    not null,
   simplePinyin         VARCHAR2(10)                    not null,
   fullPinyin           VARCHAR2(30)                    not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkPropertyDicts primary key (id),
   constraint fkPropertyDictPropertyDomain foreign key (propertyDomainId)
         references propertyDomains (id),
   constraint uniqueDomainIdAndPropertyName unique(propertyDomainId,displayName)
);

comment on column propertyDicts.propertyDomainId is
'领域属性id';

comment on column propertyDicts.internalId is
'系统内置id';

comment on column propertyDicts.displaySeq is
'显示顺序';

comment on column propertyDicts.displayName is
'什么领域的属性';

comment on column propertyDicts.simplePinyin is
'简拼';

comment on column propertyDicts.fullPinyin is
'全拼';

comment on column propertyDicts.createUser is
'创建人';

comment on column propertyDicts.updateUser is
'修改人';

comment on column propertyDicts.createDate is
'创建时间';

comment on column propertyDicts.updateDate is
'修改时间';

/*==============================================================*/
/* Index: idx_PropertyDict_pDomainId                            */
/*==============================================================*/
create index idx_PropertyDict_pDomainId on propertyDicts (
   propertyDomainId ASC
);

/*==============================================================*/
/* Index: idx_PropDict_dId_interId                              */
/*==============================================================*/
create index idx_PropDict_dId_interId on propertyDicts (
   propertyDomainId ASC,
   internalId ASC
);



/*==============================================================*/
/* Table: rectificativePersons                                  */
/*==============================================================*/
create table RECTIFICATIVEPERSONS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   EXECUTETYPE          NUMBER(10),
   PENALTYTERM          VARCHAR2(60),
   RECENTSITUATION      VARCHAR2(900),
   HELPEDUCATOR         VARCHAR2(60),
   EDUCATORTELEPHONE    VARCHAR2(80),
   EDUCATORMOBILENUMBER VARCHAR2(50),
   RECTIFYSTARTDATE     DATE,
   RECTIFYENDDATE       DATE,
   BUSSINESSREMARK      VARCHAR2(600),
   ACCUSATION           VARCHAR2(150),
   OLDCURRENTADDRESS    VARCHAR2(150),
   RESIDENCETYPE        NUMBER(10),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   ISREMIND				NUMBER(1)            default 0,
   CREATEUSER           VARCHAR2(60)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(60),
   UPDATEDATE           DATE,
   constraint PKRECTIFICATIVEPERSONS primary key (ID),
   constraint fkRectificativePersonsOrg foreign key (orgId)
         references organizations (id)
);
comment on column rectificativePersons.isEmphasis is
'是否关注 0关注  1取消关注';

/*==============================================================*/
/* Index: idx_RP_orgIntCodeAndisEmphasis                        */
/*==============================================================*/
create index idx_RP_orgIntCodeAndisEmphasis on rectificativePersons (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Table: regradedPoints                                        */
/*==============================================================*/
create table regradedPoints  (
   id                   NUMBER(10)                      not null,
   regradedOrg          NUMBER(10)                      not null,
   pointType            NUMBER(1)                       not null,
   points               NUMBER(13,3)                      not null,
   targeOrg             NUMBER(10)                      not null,
   content              VARCHAR2(2000)                  not null,
   regradedOrgInternalCode VARCHAR2(32)                    not null,
   regradedUser         VARCHAR2(32)                    not null,
   regradedUserRealName VARCHAR2(50)                    not null,
   targeOrgInternalCode VARCHAR2(32)                    not null,
   regradeReason        VARCHAR2(2000)                  not null,
   regradedType         VARCHAR2(32)                    not null,
   keyString            VARCHAR2(2000),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   regradedDate         DATE                            not null,
   applicationDate      DATE                            not null,
   createDate           DATE                            not null,
   updateDate           DATE,
   logid                NUMBER(10),
   constraint pkRegradedPoints primary key (id)
);

comment on column regradedPoints.regradedOrg is
'打分部门Id';

comment on column regradedPoints.pointType is
'分值类型1表示加分，-1表示扣分';

comment on column regradedPoints.targeOrg is
'目标部门ID';

comment on column regradedPoints.content is
'打分说明';

comment on column regradedPoints.regradedOrgInternalCode is
'打分部门编号';

comment on column regradedPoints.regradedUser is
'打分用户';

comment on column regradedPoints.regradedUserRealName is
'打分用户名称';

comment on column regradedPoints.targeOrgInternalCode is
'目标部门编号';

comment on column regradedPoints.regradeReason is
'打分原因';

comment on column regradedPoints.regradedType is
'打分类型黄牌督办，红牌督办，人工扣分';

comment on column regradedPoints.regradedDate is
'打分时间';

comment on column regradedPoints.applicationDate is
'打分应用时间';
comment on column REGRADEDPOINTS.logid
  is '日志ID';

/*==============================================================*/
/* Table: roles                                                 */
/*==============================================================*/
create table roles  (
   id                   NUMBER(10)                      not null,
   roleName             VARCHAR2(45)                    not null,
   createDate           DATE                            not null,
   description          VARCHAR2(600),
   createUser           VARCHAR2(32)                    not null,
   updateDate           DATE,
   updateUser           VARCHAR2(32),
   useInLevel           NUMBER(10),
   useInOrgType         NUMBER(10),
   workBenchType        NUMBER(10),
   constraint pkRoles primary key (id)
);

comment on table roles is
'岗位';

comment on column roles.roleName is
'角色名称';

comment on column roles.createDate is
'创建日期';

comment on column roles.description is
'描述';

comment on column roles.createUser is
'创建的用户名';

comment on column roles.updateDate is
'最后更新时间 ';

comment on column roles.updateUser is
'最后更新用户名';

comment on column roles.useInLevel is
'岗位应用层级';

comment on column roles.useInOrgType is
'岗位应用于何种类型责任区';

comment on column roles.workBenchType is
'工作台类型';

/*==============================================================*/
/* Index: idx_Role_roleName                                     */
/*==============================================================*/
create index idx_Role_roleName on roles (
   roleName ASC
);

/*==============================================================*/
/* Index: idx_Role_useInLevel                                   */
/*==============================================================*/
create index idx_Role_useInLevel on roles (
   useInLevel ASC
);

/*==============================================================*/
/* Index: idx_Role_useInOrgType                                 */
/*==============================================================*/
create index idx_Role_useInOrgType on roles (
   useInOrgType ASC
);

/*==============================================================*/
/* Table: roleHasPermissions                                    */
/*==============================================================*/
create table roleHasPermissions  (
   roleId               NUMBER(10)                      not null,
   permissionId         NUMBER(10)                      not null,
   constraint pkRoleHasPermissions primary key (roleId, permissionId),
   constraint fkRoleHasPermissionPermission foreign key (permissionId)
         references permissions (id),
   constraint fkRoleHasPermissionRole foreign key (roleId)
         references roles (id)
);

/*==============================================================*/
/* Index: idx_roleHasPers_roleId                                 */
/*==============================================================*/
create index idx_roleHasPers_roleId on roleHasPermissions (
   roleid ASC
);

/*==============================================================*/
/* Table: schools                                               */
/*==============================================================*/
create table schools  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   type                 NUMBER(10)                      not null,
   kind                 NUMBER(10)                      not null,
   atSchoolHeadcount    NUMBER(10),
   orgInternalCode      VARCHAR2(32)                    not null,
   englishName          VARCHAR2(90),
   chineseName          VARCHAR2(90),
   personLiable         VARCHAR2(60)                    		,
   personLiableTelephone VARCHAR2(15)                   		,
   personLiableMobileNumber VARCHAR2(11)                		,
   address              VARCHAR2(150)                   not null,
   webSite              VARCHAR2(60),
   president            VARCHAR2(60)                    not null,
   contactName          VARCHAR2(60),
   telephone            VARCHAR2(15),
   mobileNumber         VARCHAR2(11),
   email                VARCHAR2(32),
   fax                  VARCHAR2(15),
   imgUrl               VARCHAR2(300),
   remark               VARCHAR2(600),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   isEmphasis           NUMBER(1)                      default 0,
   isEmphasisReason     VARCHAR2(300),
   isEmphasisDate       DATE,
   attentionExtent      NUMBER(10),
   SOURCESSTATE NUMBER(1)  default 1,
   constraint pkSchools primary key (id),
   constraint fkSchoolsOrg foreign key (orgId)
         references organizations (id)
);

comment on table schools is
'学校';

comment on column schools.id is
'编号';

comment on column schools.orgId is
'所属网格';

comment on column schools.type is
'学校类型';

comment on column schools.kind is
'学校性质';

comment on column schools.atSchoolHeadcount is
'在校总人数';

comment on column schools.orgInternalCode is
'所属网格编号';

comment on column schools.englishName is
'英文名称';

comment on column schools.chineseName is
'中文名称';

comment on column schools.address is
'学校地址';

comment on column schools.webSite is
'学校网址';

comment on column schools.president is
'校长';

comment on column schools.personLiable is
'综治负责人';

comment on column schools.personLiableTelephone is
'综治负责人电话';

comment on column schools.personLiableMobileNumber is
'综治负责人手机';

comment on column schools.contactName is
'联系人姓名';

comment on column schools.telephone is
'联系人固定电话';

comment on column schools.mobileNumber is
'联系人手机号码';

comment on column schools.email is
'联系人电子邮件';

comment on column schools.fax is
'传真';

comment on column schools.remark is
'备注';

comment on column schools.fullPinyin is
'全拼';

comment on column schools.simplePinyin is
'简拼';

comment on column schools.createUser is
'创建人';

comment on column schools.updateUser is
'修改人';

comment on column schools.createDate is
'创建时间';

comment on column schools.updateDate is
'修改时间';

comment on column schools.isEmphasis is
'是否关注';

comment on column schools.attentionExtent is
'关注程度：1.一般；2.中等；3.严重';
comment on column SCHOOLS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

/*==============================================================*/
/* Index: idx_School_orgIdAndName                               */
/*==============================================================*/
create unique index idx_School_orgIdAndName on schools (
   orgId ASC,
   chineseName ASC
);

/*==============================================================*/
/* Index: idx_Schl_orgCodeAndisEmphasis                         */
/*==============================================================*/
create index idx_Schl_orgCodeAndisEmphasis on schools (
   orgInternalCode ASC,
   isEmphasis ASC
);



/*==============================================================*/
/* Table: smsReceivedBoxs                                       */
/*==============================================================*/
create table smsReceivedBoxs  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   userId               NUMBER(10),
   sourceSmsId          NUMBER(10),
   processFlag          NUMBER(1)                      default 0,
   handlePerson         VARCHAR2(32),
   handleMobile         VARCHAR2(15),
   sourceMobile         VARCHAR2(11)                    not null,
   targetMobile         VARCHAR2(11)                    not null,
   smsContent           VARCHAR2(1500)                  not null,
   disposition          VARCHAR2(1500),
   receiverTime         DATE                            not null,
   updateDate           DATE,
   constraint pkSmsReceivedBoxs primary key (id),
   constraint fkSmsReceivedBoxsOrg foreign key (orgId)
         references organizations (id)
);

comment on table smsReceivedBoxs is
'短信接收（上行表）';

comment on column smsReceivedBoxs.id is
'短信id';

comment on column smsReceivedBoxs.userId is
'处理人id';

comment on column smsReceivedBoxs.sourceSmsId is
'针对要回复的短讯息';

comment on column smsReceivedBoxs.processFlag is
'应用程序处理标志: 0-未处理，1-已处理';

comment on column smsReceivedBoxs.handlePerson is
'处理人';

comment on column smsReceivedBoxs.handleMobile is
'处理联系人手机';

comment on column smsReceivedBoxs.sourceMobile is
'发送者手机号码';

comment on column smsReceivedBoxs.targetMobile is
'目标手机号码';

comment on column smsReceivedBoxs.smsContent is
'短信内容';

comment on column smsReceivedBoxs.disposition is
'处理情况';

comment on column smsReceivedBoxs.receiverTime is
'短信发上来的时间(来自下行发送手机)';

comment on column smsReceivedBoxs.updateDate is
'处理时间';

/*==============================================================*/
/* Table: smsSendBoxs                                           */
/*==============================================================*/
create table smsSendBoxs  (
   id                   NUMBER(10)                      not null,
   senderId             NUMBER(10)                      not null,
   sendStatus           NUMBER(1)                      default 1,
   sendLevel            NUMBER(1)                      default 6,
   type                 NUMBER(1),
   sendMobile           VARCHAR2(11)                    not null,
   sender               VARCHAR2(60)                    not null,
   receiver             VARCHAR2(300)                   not null,
   smsContent           VARCHAR2(1500)                  not null,
   createDate           DATE                            not null,
   sentTime             DATE,
   constraint pkSmsSendBoxs primary key (id)
);

comment on table smsSendBoxs is
'发短信(短信下行)表';

comment on column smsSendBoxs.id is
'短信id';

comment on column smsSendBoxs.senderId is
'发短信人id';

comment on column smsSendBoxs.sendStatus is
'下发状态:  1-未下发到服务器,2-系统处理中,3-下发到服务器,4-下发到终端成功,5-未成功发送到终端';

comment on column smsSendBoxs.sendLevel is
'系统消息默认为：0；优先级逐步递减：1，2，3，4，5，6；';

comment on column smsSendBoxs.type is
'短信类型：0：系统触发发送短信   1:会议通知   2：节日祝福';

comment on column smsSendBoxs.sendMobile is
'发短信人手机(系统登录用户联系手机)';

comment on column smsSendBoxs.sender is
'发短信人(系统登录用户)';

comment on column smsSendBoxs.receiver is
'收短信人(支持多个例如：可以同时发送给系统用户、通讯录用户、用户组)';

comment on column smsSendBoxs.smsContent is
'短信内容';

comment on column smsSendBoxs.createDate is
'入库时间';

comment on column smsSendBoxs.sentTime is
'提交到行业网关的时间';

/*==============================================================*/
/* Table: smsSendTargets                                        */
/*==============================================================*/
create table smsSendTargets  (
   smsId                NUMBER(10)                      not null,
   contactId            NUMBER(10)                      not null,
   type                 VARCHAR2(20)                    not null
);

comment on table smsSendTargets is
'短信发送目标关系表';

comment on column smsSendTargets.smsId is
'下行短信id';

comment on column smsSendTargets.contactId is
'发送目标用户Id';

comment on column smsSendTargets.type is
'用户来源类型：1-系统用户；2-通讯录用户；3-通讯录组';




/*==============================================================*/
/* Table: statRegradedPoint                                     */
/*==============================================================*/
create table statRegradedPoint  (
   id                   NUMBER(10)                      not null,
   parentOrg            NUMBER(10)                      not null,
   org                  NUMBER(10)                      not null,
   yellowAmout          NUMBER(10)                      not null,
   redAmout             NUMBER(10)                      not null,
   deductPointByPerson  NUMBER(10)                      not null,
   addPointByPerson     NUMBER(10)                      not null,
   assessmentUser       NUMBER(10)                      not null,
   amoutPoint           NUMBER(10)                      not null,
   year                 NUMBER(4)                       not null,
   month                NUMBER(2)                       not null,
   audited              NUMBER(1)                       not null,
   orgName              VARCHAR2(50)                    not null,
   auditUser            VARCHAR2(32)                    not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   auditDate            DATE                            not null,
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkStatRegradedPoint primary key (id)
);

comment on column statRegradedPoint.parentOrg is
'审核部门父id';

comment on column statRegradedPoint.org is
'被审核部门id';

comment on column statRegradedPoint.yellowAmout is
'黄牌督办总分';

comment on column statRegradedPoint.redAmout is
'红牌督办总分';

comment on column statRegradedPoint.deductPointByPerson is
'手动扣分总分';

comment on column statRegradedPoint.addPointByPerson is
'手动加分总分';

comment on column statRegradedPoint.assessmentUser is
'未登录用户扣分，暂归到其他';

comment on column statRegradedPoint.amoutPoint is
'总得分';

comment on column statRegradedPoint.year is
'统计年份';

comment on column statRegradedPoint.month is
'统计月份';

comment on column statRegradedPoint.audited is
'是否已审核';

comment on column statRegradedPoint.orgName is
'被审核部门名称';

comment on column statRegradedPoint.auditUser is
'审核用户';

comment on column statRegradedPoint.auditDate is
'审核时间';

/*==============================================================*/
/* Table: statementStatistics                                   */
/*==============================================================*/
create table statementStatistics  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   statementNo          NUMBER(10),
   statementTypeId      NUMBER(10)                      not null,
   statementTotal       NUMBER(10)                      not null,
   currentPeriodRegister NUMBER(10)                      not null,
   registerTotal        NUMBER(10)                      not null,
   overdueNotAccepted   NUMBER(10)                      not null,
   normalNotAccepted    NUMBER(10)                      not null,
   sevenDaysInDeal      NUMBER(10)                      not null,
   overtakeSevenDaysInDeal NUMBER(10)                      not null,
   onScheduleHandle     NUMBER(10)                      not null,
   overdueHandle        NUMBER(10)                      not null,
   transferTotal        NUMBER(10)                      not null,
   endTotal             NUMBER(10)                      not null,
   year                 NUMBER(20)                      not null,
   month                NUMBER(20),
   orgInternalCode      VARCHAR2(32)                    not null,
   onScheduleRateOfEnd  VARCHAR2(6)                     not null,
   rateOfEnding         VARCHAR2(6)                     not null,
   constraint pkStatementStatistics primary key (id),
   constraint fkStatementStatisticsOrg foreign key (orgId)
         references organizations (id)
);

comment on table statementStatistics is
'办件统计';

comment on column statementStatistics.orgId is
'办件来源网格(职能部门)';

comment on column statementStatistics.statementNo is
'办件序号';

comment on column statementStatistics.statementTypeId is
'办件报表类型(周报/月报/年报)';

comment on column statementStatistics.statementTotal is
'累计办件';

comment on column statementStatistics.currentPeriodRegister is
'当期立案';

comment on column statementStatistics.registerTotal is
'累计立案';

comment on column statementStatistics.overdueNotAccepted is
'逾期未受理';

comment on column statementStatistics.normalNotAccepted is
'正常未受理';

comment on column statementStatistics.sevenDaysInDeal is
'七天在办';

comment on column statementStatistics.overtakeSevenDaysInDeal is
'超七天在办';

comment on column statementStatistics.onScheduleHandle is
'按期办理';

comment on column statementStatistics.overdueHandle is
'超期办理';

comment on column statementStatistics.transferTotal is
'累计移交';

comment on column statementStatistics.endTotal is
'累计结案数';

comment on column statementStatistics.year is
'年份';

comment on column statementStatistics.month is
'月份';

comment on column statementStatistics.orgInternalCode is
'办件来源网格InternalCode(职能部门InternalCode)';

comment on column statementStatistics.onScheduleRateOfEnd is
'按期结案率';

comment on column statementStatistics.rateOfEnding is
'结案率';

/*==============================================================*/
/* Table: superiorVisits                                        */
/*==============================================================*/
create table SUPERIORVISITS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   VISITSTATE           NUMBER(10),
   VISITTYPE            NUMBER(10),
   VISITREASON          VARCHAR2(900),
   NATIVEPLACE          VARCHAR2(60),
   RESIDENCETYPE        NUMBER(10),
   OLDCURRENTADDRESS    VARCHAR2(150),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PKSUPERIORVISITS primary key (ID),
   constraint fkSuperiorVisitsOrg foreign key (orgId)
         references organizations (id)
);

comment on table SUPERIORVISITS is
'信访上访人员';

comment on column SUPERIORVISITS.ID is
'信访上访人员ID';

comment on column SUPERIORVISITS.ORGID is
'所属网格';

comment on column SUPERIORVISITS.ORGINTERNALCODE is
'所属责任区编号';

comment on column SUPERIORVISITS.VISITSTATE is
'上访状态';

comment on column SUPERIORVISITS.VISITTYPE is
'上访类型';

comment on column SUPERIORVISITS.VISITREASON is
'信访原因';

comment on column SUPERIORVISITS.NATIVEPLACE is
'户籍';

comment on column SUPERIORVISITS.RESIDENCETYPE is
'户口类别';

comment on column SUPERIORVISITS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column SUPERIORVISITS.ISEMPHASIS is
'是否关注';

comment on column SUPERIORVISITS.CREATEUSER is
'创建用户';

comment on column SUPERIORVISITS.CREATEDATE is
'创建日期';

comment on column SUPERIORVISITS.UPDATEUSER is
'修改用户';

comment on column SUPERIORVISITS.UPDATEDATE is
'修改时间';



/*==============================================================*/
/* Index: idx_SuperiorVisit_orgId                               */
/*==============================================================*/
create index idx_SuperiorVisit_orgId on superiorVisits (
   orgId ASC
);

/*==============================================================*/
/* Index: idx_SuperiorVisit_orgInteCode                         */
/*==============================================================*/
create index idx_SuperiorVisit_orgInteCode on superiorVisits (
   orgInternalCode ASC
);


/*==============================================================*/
/* Index: idx_SV_orgIntCodeAndisEmphasis                          */
/*==============================================================*/
create index idx_SV_orgIntCodeAndisEmphasis on superiorVisits (
   orgInternalCode ASC,
   isEmphasis ASC
);

/*==============================================================*/
/* Table: superviseLog                                          */
/*==============================================================*/
create table superviseLog  (
   id                   NUMBER(10)                      not null,
   success              NUMBER(1)                       not null,
   dealType             NUMBER(10)                      not null,
   days                 NUMBER(10)                      not null,
   overType             NUMBER(1),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   superviseType        VARCHAR2(32),
   superviseDate        DATE                            not null,
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkSuperviseLog primary key (id)
);

comment on table superviseLog is
'自动督办日志表';

comment on column superviseLog.success is
'是否执行成功';

comment on column superviseLog.dealType is
'操作对象类型，新增、受理等';

comment on column superviseLog.days is
'督办几天前数据';

comment on column superviseLog.superviseDate is
'执行时间';

/*==============================================================*/
/* Table: systemKeyInfos                                        */
/*==============================================================*/
create table systemKeyInfos  (
   id                   NUMBER(10)                      not null,
   curNum               NUMBER(10)                     default 0,
   step                 NUMBER(10)                     default 1,
   name                 VARCHAR2(60)                    not null,
   remark               VARCHAR2(200),
   constraint pkSystemKeyInfos primary key (id)
);

comment on table systemKeyInfos is
'系统主键信息';

comment on column systemKeyInfos.curNum is
'当前序列号';

comment on column systemKeyInfos.step is
'每一次增加步长';

comment on column systemKeyInfos.name is
'系统主键名称';

comment on column systemKeyInfos.remark is
'备注';

/*==============================================================*/
/* Table:                                             */
/*==============================================================*/
create table systemLogs  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType 		NUMBER(10),
   beforekey 			varchar2(150),
   afterkey 			varchar2(150),
   beforename 			varchar2(150),
   aftername 			varchar2(150),
   constraint pkSystemLogs primary key (id),
   constraint fkSystemLogsOrg foreign key (orgId)
         references organizations (id)
);
comment on column systemLogs.operationType is
'操作类型';
comment on column systemLogs.logLevel is
'日志等级';

comment on column systemLogs.operation is
'术语编号';

comment on column systemLogs.moduleName is
'模块名';

comment on column systemLogs.username is
'操作的用户';

comment on column systemLogs.clientIp is
'访问IP ';

comment on column systemLogs.orgInternalCode is
'部门内部编码';

comment on column systemLogs.operateTime is
'术语系统默认名称';
comment on column systemlogs.beforekey is '修改之前的key';
comment on column systemlogs.afterkey is '修改之后的key';
comment on column systemlogs.beforename is '修改之前的name';
comment on column systemlogs.aftername is '修改之后的name';
/*==============================================================*/
/* Index: idx_SystemLog_logLevel                                */
/*==============================================================*/
create index idx_SystemLog_logLevel on systemLogs (
   logLevel ASC
);

/*==============================================================*/
/* Index: idx_SystemLog_moduleName                              */
/*==============================================================*/
create index idx_SystemLog_moduleName on systemLogs (
   moduleName ASC
);

/*==============================================================*/
/* Index: idx_SystemLog_username                                */
/*==============================================================*/
create index idx_SystemLog_username on systemLogs (
   username ASC
);

/*==============================================================*/
/* Index: idx_SystemLog_orgIntCode                              */
/*==============================================================*/
create index idx_SystemLog_orgIntCode on systemLogs (
   orgInternalCode ASC
);

/*==============================================================*/
/* Index: idx_SystemLog_operateTime                             */
/*==============================================================*/
create index idx_SystemLog_operateTime on systemLogs (
   operateTime ASC
);

/*==============================================================*/
/* Table: users                                                 */
/*==============================================================*/
create table users  (
   id                   NUMBER(10)                      not null,
   organizationId       NUMBER(10)                      not null,
   credits1             NUMBER(10)                     default 0 not null,
   credits2             NUMBER(10)                     default 0 not null,
   failureTimes         NUMBER(5)                      default 0,
   isLock               NUMBER(1)                      default 0 not null,
   isAdmin              NUMBER(1)                      default 0 not null,
   changePassword       NUMBER(1)                      default 1 not null,
   hasNewMessage        NUMBER(1)                      default 0 not null,
   userName             VARCHAR2(32)                    not null,
   name                 VARCHAR2(32),
   password             VARCHAR2(32)                    not null,
   mobile               VARCHAR2(15),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   email                VARCHAR2(32),
   lastLoginIp          VARCHAR2(32),
   previousLoginIp      VARCHAR2(32),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   orgInternalCode      VARCHAR2(32)                    not null,
   workCompany          VARCHAR2(64),
   workPhone            VARCHAR2(32),
   homePhone            VARCHAR2(32),
   headerUrl 			VARCHAR2(300),
   previousLoginTime    DATE,
   lastLoginTime        DATE,
   createDate           DATE                            not null,
   updateDate           DATE,
   vpdn                 VARCHAR2(50)                    ,
   isShutDown           NUMBER(1)                      default 0 not null,
   connectVpdn			NUMBER(1)                      default 1 not null,
   ISFRISTWORKBENCH     NUMBER(1)                      default 1 not null,
   VALIDATEUSERCA       NUMBER(1)                      default 0,
   IDCARDNO             VARCHAR2(18),
   PCUSABLE             NUMBER(1),
   MOBILEUSABLE         NUMBER(1),
   isValidatorImsi 		NUMBER(2) default 0,
   imsi 				VARCHAR2(60),
   isFourthAccount 		number(2) default 0, 
   isgps				NUMBER(1)  default 0,
   isFourTeams			NUMBER(1)  default 0,
   mobileVersion        varchar2(32),
   mobileInnerVersion   varchar2(32),
   updatepswtime    DATE,
   activationTime   DATE,
   state                NUMBER(10),
   constraint pkUsers primary key (id),
   constraint fkUserOrganization foreign key (organizationId)
         references organizations (id)
);

comment on column users.credits1 is
'积分1';

comment on column users.credits2 is
'积分2';

comment on column users.failureTimes is
'记录用户登录失败次数';

comment on column users.isLock is
'是否锁定';

comment on column users.isAdmin is
'是否超级管理员';

comment on column users.changePassword is
'登录时需要修改密码不';

comment on column users.userName is
'用户名';

comment on column users.name is
'用户姓名';

comment on column users.password is
'密码';

comment on column users.mobile is
'手机号码';

comment on column users.fullPinyin is
'姓名全拼';

comment on column users.simplePinyin is
'姓名简拼';

comment on column users.email is
'电子邮件';

comment on column users.lastLoginIp is
'最后登录ip';

comment on column users.previousLoginIp is
'上次登录IP';

comment on column users.createUser is
'创建用户名';

comment on column users.updateUser is
'最后更新用户名';

comment on column users.previousLoginTime is
'上次登录时间';

comment on column users.lastLoginTime is
'最后登录时间';

comment on column users.createDate is
'创建日期';

comment on column users.updateDate is
'最后更新日期';

comment on column users.vpdn is
'用户vpdn帐号';

comment on column users.isShutDown is
'用户是否启用';

comment on column users.connectVpdn is
'登陆时是否连接vpdn';

comment on column users.isfristworkbench is
'是否首次登录工作台';

comment on column users.VALIDATEUSERCA is
'登录时是否进行CA验证';

comment on column users.IDCARDNO is
'登录用户身份证号码（用于ca认证';

comment on column users.PCUSABLE is
'是否pc可登录';

comment on column users.MOBILEUSABLE is
'是否手机可登录';
comment on column USERS.imsi is
'imsi号';
comment on column USERS.isValidatorImsi is
'是否验证imsi号';
comment on column users.isFourthAccount
  is '是否四级平台账号'; 
COMMENT ON COLUMN users.isgps IS '是否GPS';
COMMENT ON COLUMN users.isFourTeams IS '是否四支队伍';
comment on column USERS.mobileVersion is
'手机端 版本号';
comment on column users.mobileInnerVersion
  is '手机端 内部版本号'; 
comment on column users.updatepswtime is '密码修改时间';
comment on column users.activationTime is
'账号激活时间';
comment on column users.state  is
'账号状态（待激活1，正常2，停用3）';

/*==============================================================*/
/* Index: idx_User_userName 登入                                                                                      */
/*==============================================================*/
create unique index idx_User_userName on users (
   userName ASC
);

create index idx_User_orgId_isLock on users (
   organizationId ASC,
   isLock ASC
);

create index idx_User_orgCode_isLock on users (
   orgInternalCode ASC,
   isLock ASC
);

create index idx_User_autocomplete_orgid on users (
   userName ASC,
   name ASC,
   fullPinyin ASC,
   simplePinyin ASC,
   organizationId ASC,
   isLock ASC
);

create index idx_User_autocomplete_orgcode on users (
   userName ASC,
   name ASC,
   fullPinyin ASC,
   simplePinyin ASC,
   orgInternalCode ASC,
   isLock ASC
);

/*==============================================================*/
/* Table: userHasMultizones                                     */
/*==============================================================*/
create table userHasMultizones  (
   userId               NUMBER(10)                      not null,
   organizationId       NUMBER(10)                      not null,
   constraint pkUserHasMultizones primary key (userId, organizationId),
   constraint fkUserHasOrganizationOrg foreign key (organizationId)
         references organizations (id),
   constraint fkUserHasOrganizationUser foreign key (userId)
         references users (id)
);

/*==============================================================*/
/* Table: userHasRoles                                          */
/*==============================================================*/
create table userHasRoles  (
   userId               NUMBER(10)                      not null,
   roleId               NUMBER(10)                      not null,
   constraint pkUserHasRoles primary key (userId, roleId),
   constraint fkUserHasRoleRole foreign key (roleId)
         references roles (id),
   constraint fkUserHasRoleUser foreign key (userId)
         references users (id)
);

/*==============================================================*/
/* Index: idx_User_userName 登入                                                                                      */
/*==============================================================*/
create index idx_userHasRoles_userId on userHasRoles (
   userId ASC
);


/*==============================================================*/
/* Table: userSessions                                          */
/*==============================================================*/
create table userSessions  (
   id                   NUMBER(10)                      not null,
   sessionId            VARCHAR2(45)                   default '' not null,
   userId               NUMBER(10)                     default NULL,
   userName             VARCHAR2(45)                   default NULL,
   userRealName         varchar2(32),
   orgId                number(10),
   accessIp             VARCHAR2(32),
   accessTime           DATE                           default NULL,
   isLogin              NUMBER(1)                      default 0 not null,
   loginDate            DATE                           default NULL,
   lastUrl              VARCHAR2(200)                  default NULL,
   loginIp              VARCHAR2(32),
   validateCode         VARCHAR2(4),
   orgInternalCode      VARCHAR2(32),
   clientMode 			number(1) 			default 0,
   constraint pkUserSessions primary key (id)
);

comment on column userSessions.sessionId is
'32位uuid';

comment on column userSessions.userId is
'用户id';

comment on column userSessions.userName is
'用户名';

comment on column userSessions.accessIp is
'最后访问ip';

comment on column userSessions.accessTime is
'最后访问时间';

comment on column userSessions.isLogin is
'是否登录';

comment on column userSessions.validateCode is
'验证码';

comment on column userSessions.orgInternalCode is
'组织机构内置编码';
COMMENT ON COLUMN usersessions.clientMode IS '客户端登陆类型';
/*==============================================================*/
/* Index: idx_UserSession_sessionId                             */
/*==============================================================*/
create unique index idx_UserSession_sessionId on userSessions (
   sessionId ASC
);

/*==============================================================*/
/* Index: idx_session_userId_ip                                */
/*==============================================================*/
create index idx_session_userId_ip on userSessions (
   userName ASC,
   loginIp ASC
);

/*==============================================================*/
/* Index: idx_UserSession_userName                              */
/*==============================================================*/
create index idx_UserSession_userName on userSessions (
   userName ASC
);

/*==============================================================*/
/* Index: idx_UserSession_accessTime                            */
/*==============================================================*/
create index idx_UserSession_accessTime on userSessions (
   accessTime ASC
);

/*==============================================================*/
/* Table: villageProfiles                                       */
/*==============================================================*/
create table villageProfiles  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   acreage              NUMBER(20,2),
   doors                NUMBER(10),
   villagers            NUMBER(10),
   villageRingsters     NUMBER(10),
   gridNum              NUMBER(10),
   villageDelegate      NUMBER(10),
   hamletEconomyinclude NUMBER(10,4),
   individualAverageInclude NUMBER(6,4),
   villageCollectivityAsset NUMBER(10,4),
   interzoneLeading     VARCHAR2(20),
   department           VARCHAR2(100),
   villageBuildupSecretary VARCHAR2(20),
   buildupSecretaryPhone VARCHAR2(20),
   villageDirector      VARCHAR2(20),
   villageDirectorPhone VARCHAR2(20),
   informationPersonA   VARCHAR2(20),
   informationPersonAPhone VARCHAR2(20),
   informationPersonB   VARCHAR2(20),
   informationPersonBPhone VARCHAR2(20),
   natureGeography      CLOB,
   economyGeography     CLOB,
   communityGeography   CLOB,
   itemEngineering      CLOB,
   orgInternalCode      VARCHAR2(32)                    not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   description          VARCHAR2(200),
   imgUrl               VARCHAR2(50),
   createDate           DATE                            not null,
   updateDate           DATE,
   introduction         CLOB,
   constraint pkVillageProfiles primary key (id),
   constraint fkVillageProfilesOrg foreign key (orgId)
         references organizations (id)
);

comment on column villageProfiles.id is
'村情况基本信息编号';

comment on column villageProfiles.orgId is
'所属责任区';

comment on column villageProfiles.acreage is
'村面积';

comment on column villageProfiles.doors is
'村户数';

comment on column villageProfiles.villagers is
'村民数';

comment on column villageProfiles.villageRingsters is
'村民党员数';

comment on column villageProfiles.gridNum is
'片组数';

comment on column villageProfiles.villageDelegate is
'村民代表数';

comment on column villageProfiles.hamletEconomyinclude is
'村集体经济年收入';

comment on column villageProfiles.individualAverageInclude is
'农民平均年收入';

comment on column villageProfiles.villageCollectivityAsset is
'村集体资产';

comment on column villageProfiles.interzoneLeading is
'联系的区领导';

comment on column villageProfiles.department is
'挂钩的机关部门';

comment on column villageProfiles.villageBuildupSecretary is
'党委组织书记';

comment on column villageProfiles.buildupSecretaryPhone is
'党委组织书记联系方式';

comment on column villageProfiles.villageDirector is
'村委会主任';

comment on column villageProfiles.villageDirectorPhone is
'村委会主任联系方式';

comment on column villageProfiles.informationPersonA is
'信息员A岗姓名';

comment on column villageProfiles.informationPersonAPhone is
'信息员A岗联系方式';

comment on column villageProfiles.informationPersonB is
'信息员B岗姓名';

comment on column villageProfiles.informationPersonBPhone is
'信息员B岗联系方式';

comment on column villageProfiles.natureGeography is
'自然情况地理位置';

comment on column villageProfiles.economyGeography is
'经济情况和发展思路';

comment on column villageProfiles.communityGeography is
'社会发展情况';

comment on column villageProfiles.itemEngineering is
'重点工程项目';

comment on column villageProfiles.orgInternalCode is
'所属责任区编号';

comment on column villageProfiles.createUser is
'创建用户';

comment on column villageProfiles.updateUser is
'更新用户名';

comment on column villageProfiles.description is
'描述';

comment on column villageProfiles.imgUrl is
'村基本信息图片地址';

comment on column villageProfiles.createDate is
'创建日期';

comment on column villageProfiles.updateDate is
'更新用户';

/*==============================================================*/
/* Index: idx_VillageProfile_orgId                              */
/*==============================================================*/
create index idx_VillageProfile_orgId on villageProfiles (
   orgId ASC
);

/*==============================================================*/
/* Table: visitTypes                                            */
/*==============================================================*/
create table visitTypes  (
   superiorVisitId      NUMBER(10)                      not null,
   superiorVisitType    NUMBER(10),
   constraint fkVisitTypesSuperiorVisits foreign key (superiorVisitId)
         references superiorVisits (id)
);

comment on table visitTypes is
'访问类型';

comment on column visitTypes.superiorVisitId is
'信访上访人员ID';

comment on column visitTypes.superiorVisitType is
'上访类型';



/*==============================================================*/
/* Table: workBulletins                                         */
/*==============================================================*/
create table workBulletins  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10),
   useId                NUMBER(10),
   bulletinName         VARCHAR2(60)                    not null,
   orgInternalCode      VARCHAR2(32),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   bulletinDate         DATE                            not null,
   fillDate             DATE,
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkWorkBulletin primary key (id),
   constraint fkWorkBulletinsOrg foreign key (orgId)
         references organizations (id)
);

comment on table workBulletins is
'工作简报';

comment on column workBulletins.id is
'工作简报系统编号';

comment on column workBulletins.orgId is
'所属组织编号';

comment on column workBulletins.useId is
'创建人编号';

comment on column workBulletins.bulletinName is
'工作简报名称';

comment on column workBulletins.orgInternalCode is
'所属责任区编号';

comment on column workBulletins.createUser is
'创建人';

comment on column workBulletins.updateUser is
'修改人';

comment on column workBulletins.bulletinDate is
'简报时间';

comment on column workBulletins.fillDate is
'填写简报时间';

comment on column workBulletins.createDate is
'创建时间';

comment on column workBulletins.updateDate is
'修改时间';

/*==============================================================*/
/* Table: workBulletinAttachFiles                               */
/*==============================================================*/
create table workBulletinAttachFiles  (
   id                   NUMBER(10)                      not null,
   bulletinId           NUMBER(10),
   fileName             VARCHAR2(150)                   not null,
   fileActualUrl        VARCHAR2(250)                   not null,
   fileSize             NUMBER(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkWorkBulletinAttachFiles primary key (id),
   constraint fkAttachFilesWorkBull foreign key (bulletinId)
         references workBulletins (id)
);

comment on table workBulletinAttachFiles is
'简报附件';

comment on column workBulletinAttachFiles.id is
'系统编号';

comment on column workBulletinAttachFiles.bulletinId is
'简报编号';

comment on column workBulletinAttachFiles.fileName is
'附件文件名';

comment on column workBulletinAttachFiles.fileActualUrl is
'文件访问路径';

comment on column workBulletinAttachFiles.fileSize is
'文件大小';

comment on column workBulletinAttachFiles.createUser is
'创建人';

comment on column workBulletinAttachFiles.updateUser is
'修改人';

comment on column workBulletinAttachFiles.createDate is
'创建时间';

comment on column workBulletinAttachFiles.updateDate is
'修改时间';

create table workCalendars  (
   id                   NUMBER(10)                      not null,
   year                 NUMBER(10)                      not null,
   month                NUMBER(10)                      not null,
   day                  NUMBER(10)                      not null,
   dayofyear            NUMBER(10)                      not null,
   holiday              NUMBER(10)                      not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   actualDate			DATE,
   createDate           DATE                            not null,
   updateDate           DATE,
   startWorkTimeAM    	VARCHAR2(32)                    not null,
   endWorkTimeAM        VARCHAR2(32)                    not null,
   startWorkTimePM      VARCHAR2(32)                    not null,
   endWorkTimePM        VARCHAR2(32)                    not null,
   calendarType 		NUMBER(10) 						default 0 ,
   orgId 				NUMBER(10),
   constraint pkWorkCalendars primary key (id)
);

comment on table workCalendars is
'工作日历';

comment on column workCalendars.id is
'工作日历表id';

comment on column workCalendars.year is
'年份';

comment on column workCalendars.month is
'月份';

comment on column workCalendars.day is
'天';

comment on column workCalendars.dayofyear is
'当前第几天';

comment on column workCalendars.holiday is
'是否为节假日';

comment on column workCalendars.createUser is
'创建人';

comment on column workCalendars.updateUser is
'修改人';

comment on column workCalendars.createDate is
'创建时间';

comment on column workCalendars.updateDate is
'修改时间';

comment on column workCalendars.actualDate is
'实际日期';

comment on column workCalendars.startWorkTimeAM is
'上午起始工作时间';

comment on column workCalendars.endWorkTimeAM is
'上午结束工作时间';

comment on column workCalendars.startWorkTimePM is
'下午起始工作时间';

comment on column workCalendars.endWorkTimePM is
'下午结束工作时间';
comment on column workcalendars.calendarType is 
'日历类型，0代表默认，1代表地区特色';
comment on column workcalendars.orgId is 
'地区特色日历对应地区的组织机构ID，默认日历时此值为空';

/*==============================================================*/
/* Table: messageTargetAttachFiles                              */
/*==============================================================*/
create table messageTargetAttachFiles  (
   id                         NUMBER(10)                      not null,
   personnelMessageTargetsId  NUMBER(10)                      not null,
   userId                     NUMBER(10)                      not null,
   fileSize                   NUMBER(10),
   fileName                   VARCHAR2(150)                   not null,
   fileActualUrl              VARCHAR2(250)                   not null,
   createUser                 VARCHAR2(32)                    not null,
   updateUser                 VARCHAR2(32),
   createDate                 DATE                            not null,
   updateDate                 DATE,
   constraint pkMessageTargetAttachFiles primary key (id)
);

comment on table messageTargetAttachFiles is
'站内短信附件';

comment on column messageTargetAttachFiles.personnelmessageTargetsId is
'收件人目录';

comment on column messageTargetAttachFiles.fileName is
'站内短信文件名称';

comment on column messageTargetAttachFiles.fileActualUrl is
'站内短信文件路径';

comment on column messageTargetAttachFiles.fileSize is
'站内短信文件大小';

comment on column messageTargetAttachFiles.userId is
'目标用户';


  create sequence s_personInCharges
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

 create sequence s_floorpersons
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

  /*==============================================================*/
/* Table: "personInCharges"                                         */
/*==============================================================*/
create table personInCharges
(
  id         	NUMBER(10) 	not null,
  name		VARCHAR2(32)	not null,
  moblie	VARCHAR2(11),
  telephone     VARCHAR2(15),
  placeId	NUMBER(10) 	not null,
  placeType		VARCHAR2(32)	not null,
  status	NUMBER(1) ,
  createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
    fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
  constraint personInCharges primary key (id)
);
comment on table personInCharges is
'综治负责人';
comment on column personInCharges.name is
'负责人姓名';
comment on column personInCharges.moblie is
'综治负责人手机';
comment on column personInCharges.telephone is
'综治人联系电话';
comment on column personInCharges.placeId is
'场所Id';
comment on column personInCharges.placeType is
'场所类型';
comment on column personInCharges.createUser is
'创建用户';
comment on column personInCharges.updateUser is
'修改用户';
comment on column personInCharges.createDate is
'创建日期';
comment on column personInCharges.updateDate is
'修改时间';
comment on column personInCharges.fullPinyin is
'全拼';
comment on column personInCharges.simplePinyin is
'简拼';

 /*==============================================================*/
/* Table: "floorpersons"                                         */
/*==============================================================*/

 create table floorpersons
(
  id         	NUMBER(10) 	not null,
  floorpersonsTime			DATE		not null,
  address   VARCHAR2(150) not null,
  events	VARCHAR2(300),
  placeId	NUMBER(10) 	not null,
  placeType		VARCHAR2(32)	not null,
  personInChargeName 	VARCHAR2(128) 	not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   placeName           VARCHAR2(150)  not null ,
   placeTypeName        VARCHAR2(32)  not  null,
  constraint floorpersons primary key (id)
);
comment on table floorpersons is
'巡场情况';
comment on column floorpersons.floorpersonsTime is
'巡场时间';
comment on column floorpersons.address is
'巡场地址';
comment on column floorpersons.events is
'发生情况';
comment on column floorpersons.placeId is
'场所Id';
comment on column floorpersons.placeType is
'场所类型';
comment on column floorpersons.createUser is
'创建用户';
comment on column floorpersons.updateUser is
'修改用户';
comment on column floorpersons.createDate is
'创建日期';
comment on column floorpersons.updateDate is
'修改时间';
comment on column floorpersons.placeName is
'场所名称';
comment on column floorpersons.placeTypeName is
'场所类型名称';

create table workDiarys (
 id                  NUMBER(10)                      not null,
 objectType		     VARCHAR2(32)                    not null,
 objectId     		 NUMBER(10)                      not null,
 workTime            DATE                            not null,
 workPlace	         VARCHAR2(150),
 orgId               NUMBER(10)                      not null,
 orgInternalCode     VARCHAR2(32)                    not null,
 diaryType	         NUMBER(10)                      not null,
 workContent	       VARCHAR2(4000)                ,
 workUserName	       VARCHAR2(128)                  not null,
 createUser          VARCHAR2(32)                    not null,
 createDate          DATE                            not null,
 updateUser          VARCHAR2(32),
 updateDate          DATE,
 constraint workDiarys primary key (id)
);

-- Add comments to the table
comment on table WORKDIARYS
  is '工作日志表';
comment on column WORKDIARYS.objectType
  is '对应的类型名称';
comment on column WORKDIARYS.objectId
  is '对应的类型id';
comment on column WORKDIARYS.WORKTIME
  is '时间';
comment on column WORKDIARYS.WORKPLACE
  is '地点';
comment on column WORKDIARYS.ORGID
  is '部门编号';
comment on column WORKDIARYS.ORGINTERNALCODE
  is '部门内部编码';
comment on column WORKDIARYS.DIARYTYPE
  is '日志类型';
comment on column WORKDIARYS.WORKCONTENT
  is '工作内容';
comment on column WORKDIARYS.WORKUSERNAME
  is '录入人员姓名';


 /*==============================================================*/
/* Table: "helpPersonnels"                                         */
/*==============================================================*/

create table helpPersonnels (
  id         	NUMBER(10) 	not null,
  name		    VARCHAR2(32)	not null,
  mobile	    VARCHAR2(11),
  telephone     VARCHAR2(15),
  personId	    NUMBER(10) 	not null,
  personType		VARCHAR2(32)	not null,
  status	          NUMBER(1),
  createUser           VARCHAR2(32)                    not null,
  updateUser           VARCHAR2(32),
  createDate           DATE                            not null,
  updateDate           DATE,
  fullPinyin           VARCHAR2(30),
  simplePinyin         VARCHAR2(10),
  identity				varchar2(32),
  constraint helpPersonnels primary key (id)
);
comment on table helpPersonnels is
'帮教人员';
comment on column helpPersonnels.name is
'帮教人姓名';
comment on column helpPersonnels.mobile is
'帮教人手机';
comment on column helpPersonnels.telephone is
'帮教人电话';
comment on column helpPersonnels.personId is
'人员Id';
comment on column helpPersonnels.personType is
'人员类型';
comment on column helpPersonnels.createUser is
'创建用户';
comment on column helpPersonnels.updateUser is
'修改用户';
comment on column helpPersonnels.createDate is
'创建日期';
comment on column helpPersonnels.updateDate is
'修改时间';
comment on column helpPersonnels.fullPinyin is
'全拼';
comment on column helpPersonnels.simplePinyin is
'简拼';

 /*==============================================================*/
/* Table: "helpPrecords"                                         */
/*==============================================================*/

 create table helpPrecords (
  id         	NUMBER(10) 	not null,
  helpTime			DATE		not null,
  address   VARCHAR2(150) not null,
  events	VARCHAR2(300),
  personnelId	NUMBER(10) 	not null,
  personnelType		VARCHAR2(32)	not null,
  helpPersonnelName  VARCHAR2(128) 	not null,
  createUser           VARCHAR2(32)                    not null,
  updateUser           VARCHAR2(32),
  createDate           DATE                            not null,
  updateDate           DATE,
  personNmae         VARCHAR2(60)						not null,
   personTypeName    VARCHAR2(32)						not null,
  constraint helpPrecords primary key (id)
);
comment on table helpPrecords is
'帮教记录';
comment on column helpPrecords.helpTime is
'帮教时间';
comment on column helpPrecords.address is
'帮教地点';
comment on column helpPrecords.events is
'帮教情况';
comment on column helpPrecords.helpPersonnelName is
'帮教人员名称';
comment on column helpPrecords.personnelId is
'人员Id';
comment on column helpPrecords.personnelType is
'人员类型';
comment on column helpPrecords.createUser is
'创建用户';
comment on column helpPrecords.updateUser is
'修改用户';
comment on column helpPrecords.createDate is
'创建日期';
comment on column helpPrecords.updateDate is
'修改时间';
comment on column helpPrecords.personNmae is
'人员姓名';
comment on column helpPrecords.personTypeName is
'人员类型名称';




/*==============================================================*/
/* Table: "GlobalSettings"                                      */
/*==============================================================*/
create table GlobalSettings (
  GlobalValue			clob		not null
);
comment on table GlobalSettings is
'系统全局配置';
comment on column GlobalSettings.GlobalValue is
'全局配置';


/*==============================================================*/
/* Table: "keyPlaces"                                        */
/*==============================================================*/

create table keyplaces  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   name                 VARCHAR2(150)                    not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   type      VARCHAR2(32)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   address   VARCHAR2(150),
    buildingId           NUMBER(10),
   centerX				NUMBER(10,3),
   centerY				NUMBER(10,3),
   centerLon          	VARCHAR2(32),
   centerLat		  	VARCHAR2(32),
   centerLon2			VARCHAR2(32),
   centerLat2			VARCHAR2(32),
   featureId		  	VARCHAR2(32),
   buildDataId		  	NUMBER(10),
   createDate           DATE,
   updateDate           DATE,
   id_key    NUMBER(10),
   emphasis           NUMBER(1)                      default 0,
   chargePerson VARCHAR2(150)
);

comment on column keyplaces.orgId is
'所属网格';
comment on column keyplaces.id is
'场所id';
comment on column keyplaces.name is
'场所名称';
comment on column keyplaces.orgInternalCode is
'所属责任区编号';
comment on column keyplaces.fullPinyin is
'全拼';
comment on column keyplaces.simplePinyin is
'简拼';
comment on column keyplaces.address is
'地址';
comment on column keyplaces.createDate is
'创建时间';
comment on column keyplaces.id_key is
'keyplaces表的id';
comment on column keyplaces.chargePerson is
'负责人';
comment on column keyplaces.emphasis is
'是否注销';

/*==============================================================*/
/* Index: idx_keyplaces                                         */
/*==============================================================*/
create index idx_keyplaces on keyplaces (
   orgInternalCode ASC,
   name ASC,
   fullPinyin ASC,
   simplePinyin ASC
);



 /*==============================================================*/
/* Table: "societySafeCheck"                                         */
/*==============================================================*/
create table societySafeCheck (
  id                      number(10),
  dailyLogId              number(10) not null,
  checkEngineSum          number(10) default 0 not null,
  checkEngineCadre        number(10) default 0 not null,
  checkEnginePeople       number(10) default 0 not null,
  checkEngineWork         number(10) default 0 not null,
  checkOther              number(10) default 0 not null,
  publicitySum            number(10) default 0 not null,
  publicityIssueReport    number(10) default 0 not null,
  publicityMeeting        number(10) default 0 not null,
  publicityPeopleAccuse   number(10) default 0 not null,
  publicityFerretPenal    number(10) default 0 not null,
  publicityArrestOffender number(10) default 0 not null,
  findCounty              number(10) default 0 not null,
  findTown                number(10) default 0 not null,
  findVillage             number(10) default 0 not null,
  findOther               number(10) default 0 not null,
  findBlackArea           number(10) default 0 not null,
  findDangerCrime         number(10) default 0 not null,
  findRobAndSteal         number(10) default 0 not null,
  findYellowBetBane       number(10) default 0 not null,
  findHeresy              number(10) default 0 not null,
  finishCounty            number(10) default 0 not null,
  finishTown              number(10) default 0 not null,
  finishVillage           number(10) default 0 not null,
  finishOther             number(10) default 0 not null,
  justCounty              number(10) default 0 not null,
  justTown                number(10) default 0 not null,
  justVillage             number(10) default 0 not null,
  justOher                number(10) default 0 not null,
  hitFerretSum		      number(10) default 0 not null,
  hitFerretDangerCrime    number(10) default 0 not null,
  hitFerretRobAndSteal    number(10) default 0 not null,
  hitFerretYellowBetBane  number(10) default 0 not null,
  hitArrestSum	          number(10) default 0 not null,
  hitArrestFlowCrime      number(10) default 0 not null,
  hitArrestExternalPeople number(10) default 0 not null,
  hitArrestNoWork         number(10) default 0 not null,
  hitArrestLiberate       number(10) default 0 not null,
  hitArrestYouth          number(10) default 0 not null,
  hitDestroySum			  number(10) default 0 not null,
  hitDestroyOrganization  number(10) default 0 not null,
  hitDestroyForce         number(10) default 0 not null,
  cautionProvince         number(10) default 0 not null,
  cautionCity             number(10) default 0 not null,
  cautionCounty           number(10) default 0 not null,
  urgeProvince            number(10) default 0 not null,
  urgeCity                number(10) default 0 not null,
  urgeCounty              number(10) default 0 not null,
  createTabUser			  varchar2(20) not null,
  checkUser				  varchar2(20) ,
  reportDate              varchar2(20) ,
  createDate              varchar2(20) ,
  reportState			  number(1) not null,
  orgCode				  varchar2(20),
  reportYear              varchar2(8) not null,
  reportMonth			  number(2) not null,
  reportName			  varchar2(80) not null,
  reportType			  number(2),
  quarter				  number(2),
  directoryNameSign 	  varchar2(30),
  signCode				  varchar2(100) not null,
  ORGID                   NUMBER(15),
  constraint pkSocietySafeCheck primary key (id),
  constraint ukSocietySafeCheck unique (signCode),
  constraint fkSocietySafeCheck foreign key (dailyLogId)
         references dailyLogs (id)
)
;
comment on table societySafeCheck
  is '社会治安重点地区排查整治工作情况';
comment on column societySafeCheck.id
  is '主键识别码';
comment on column societySafeCheck.dailyLogId
  is '引用台账id';
comment on column societySafeCheck.checkEngineSum
  is '排查次数目录下的总数';
comment on column societySafeCheck.checkEngineCadre
  is '排查次数目录下的发动干部数';
comment on column societySafeCheck.checkEnginePeople
  is '排查次数目录下的发动群众数';
comment on column SOCIETYSAFECHECK.CHECKENGINEWORK
  is '排查次数目录下的组织工作组数';
comment on column societySafeCheck.checkOther
  is '排查次数目录下的其它';
comment on column societySafeCheck.publicitySum
  is '宣传发动数目录下的总数';
comment on column societySafeCheck.publicityIssueReport
  is '宣传发动数目录下的发布通告数';
comment on column societySafeCheck.publicityMeeting
  is '宣传发动数目录下的召开座谈会数';
comment on column societySafeCheck.publicityPeopleAccuse
  is '宣传发动数目录下的群众举报数';
comment on column societySafeCheck.publicityFerretPenal
  is '宣传发动数目录下的破获刑事案件数';
comment on column societySafeCheck.publicityArrestOffender
  is '宣传发动数目录下的抓获犯罪人数';
comment on column societySafeCheck.findCounty
  is '排查发现治安重点目录下的县级数';
comment on column societySafeCheck.findTown
  is '排查发现治安重点目录下的乡级数';
comment on column societySafeCheck.findVillage
  is '排查发现治安重点目录下的村级数';
comment on column societySafeCheck.findOther
  is '排查发现治安重点目录下的其它数';
comment on column societySafeCheck.findBlackArea
  is '排查发现治安重点目录下的黑恶势力数';
comment on column societySafeCheck.findDangerCrime
  is '排查发现治安重点目录下的严重犯罪地区数';
comment on column societySafeCheck.findRobAndSteal
  is '排查发现治安重点目录下的抢和盗数';
comment on column societySafeCheck.findYellowBetBane
  is '排查发现治安重点目录下的黄赌毒数';
comment on column societySafeCheck.findHeresy
  is '排查发现治安重点目录下的邪教地区数';
comment on column societySafeCheck.finishCounty
  is '已整治重点地区数目录下的县级数';
comment on column societySafeCheck.finishTown
  is '已整治重点地区数目录下的乡级数';
comment on column societySafeCheck.finishVillage
  is '已整治重点地区数目录下的村级数';
comment on column societySafeCheck.finishOther
  is '已整治重点地区数目录下的其它数';
comment on column societySafeCheck.justCounty
  is '正整治重点地区数目录下的县级数';
comment on column societySafeCheck.justTown
  is '正整治重点地区数目录下的乡级数';
comment on column societySafeCheck.justVillage
  is '正整治重点地区数目录下的村级数';
comment on column societySafeCheck.justOher
  is '正整治重点地区数目录下的其它数';
comment on column societySafeCheck.hitFerretSum
  is '打击整治目录下的破获刑事案件目录下的总数';
comment on column societySafeCheck.hitFerretDangerCrime
  is '打击整治目录下的破获刑事案件目录下的严重犯罪数';
comment on column societySafeCheck.hitFerretRobAndSteal
  is '打击整治目录下的破获刑事案件目录下的抢和盗数';
comment on column societySafeCheck.hitFerretYellowBetBane
  is '打击整治目录下的破获刑事案件目录下的黄赌毒数';
comment on column societySafeCheck.hitArrestSum
  is '打击整治目录下的抓获犯罪嫌疑人目录下的总数';
comment on column societySafeCheck.hitArrestFlowCrime
  is '打击整治目录下的抓获犯罪嫌疑人目录下的流窜犯罪人数';
comment on column societySafeCheck.hitArrestExternalPeople
  is '打击整治目录下的抓获犯罪嫌疑人目录下的外来人员数';
comment on column societySafeCheck.hitArrestNoWork
  is '打击整治目录下的抓获犯罪嫌疑人目录下的无业人员数';
comment on column societySafeCheck.hitArrestLiberate
  is '打击整治目录下的抓获犯罪嫌疑人目录下的刑释人员';
comment on column societySafeCheck.hitArrestYouth
  is '打击整治目录下的抓获犯罪嫌疑人目录下的青少年';
comment on column SOCIETYSAFECHECK.hitDestroySum
  is '打击整治目录下的打掉黑恶势力数目录下的总数';
comment on column SOCIETYSAFECHECK.HITDESTROYORGANIZATION
  is '打击整治目录下的打掉黑恶势力数目录下的黑社会组织数';
comment on column SOCIETYSAFECHECK.HITDESTROYFORCE
  is '打击整治目录下的打掉黑恶势力数目录下的黑势力数';
comment on column societySafeCheck.cautionProvince
  is '警示数目录下的省级数';
comment on column societySafeCheck.cautionCity
  is '警示数目录下的市级数';
comment on column societySafeCheck.cautionCounty
  is '警示数目录下的县级数';
comment on column societySafeCheck.urgeProvince
  is '挂牌整治目录下的省级数';
comment on column societySafeCheck.urgeCity
  is '挂牌整治目录下的市级数';
comment on column societySafeCheck.urgeCounty
  is '挂牌整治目录下的县级数';
comment on column societySafeCheck.createTabUser
  is '创建报表人';
comment on column societySafeCheck.checkUser
  is '签发人';
comment on column societySafeCheck.reportDate
  is '上报日期';
comment on column societySafeCheck.createDate
  is '创建日期';
comment on column societySafeCheck.reportState
  is '上报状态:0-未上报 1-已上报';
comment on column societySafeCheck.orgCode
  is '组织机构编码';
comment on column societySafeCheck.reportYear
  is '报表年份';
comment on column societySafeCheck.reportMonth
  is '报表月份';
comment on column societySafeCheck.reportName
  is '报表名称';
comment on column societySafeCheck.reportType
  is '报表类型：1-月报 2-季报';
comment on column societySafeCheck.quarter
  is '季度';
comment on column societySafeCheck.signCode
  is '唯一标识码';
comment on column SOCIETYSAFECHECK.directoryNameSign
  is '上下级台账目录名称对应';
comment on column SOCIETYSAFECHECK.ORGID
  is '组织机构id';

/*==============================================================*/
/* Table: evaluates                                             */
/*==============================================================*/
create table evaluates  (
   id                   number(10)                      not null,
   year                 VARCHAR2(10)                    not null,
   title                Varchar2(64)                    not null,
   evaluateResult       Varchar2(32),
   totalScore           NUMBER(8),
   selfAssessmentTotalScore NUMBER(8),
   state                NUMBER(1),
   isEvaluateUsed       NUMBER(1),
   evaluateTypeId       number(10),
   orgId                number(10),
   orgInternalCode      VARCHAR2(32),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   TEMPLATETOTALSCORE       NUMBER(8),
   standardEvaluateId       number(10),
   constraint PKevaluates primary key (id)
);

comment on table evaluates is
'评估表';

comment on column evaluates.id is
'主键';

comment on column evaluates.year is
'年度';

comment on column evaluates.title is
'标题';

comment on column evaluates.evaluateResult is
'评估结果';

comment on column evaluates.totalScore is
'总分值';

comment on column evaluates.selfAssessmentTotalScore is
'自评总分';

comment on column evaluates.evaluateTypeId is
'所属评估类型';

comment on column evaluates.orgId is
'所属网格';

comment on column evaluates.orgInternalCode is
'所属网格内部代码';

comment on column evaluates.createUser is
'创建用户';

comment on column evaluates.updateUser is
'更新用户名';

comment on column evaluates.updateDate is
'更新用户';

comment on column evaluates.createDate is
'创建日期';

comment on column EVALUATES.TEMPLATETOTALSCORE is
'模板总分';

alter table evaluates
   add constraint fkOrganizations_evaluates foreign key (orgId)
      references organizations (id);

alter table evaluates
   add constraint fkEvaluate_standardEvaluate foreign key (standardEvaluateId)
      references evaluates (id);
/*==============================================================*/
/* Table: detailedRules                                         */
/*==============================================================*/
create table detailedRules  (
   id                   number(10)                      not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   evaluateId           number(10),
   content              varchar2(300)                   not null,
   remark               VARCHAR2(32),
   score                number(8),
   standardScore        number(8),
   summary              VARCHAR2(128),
   parentId             number(10),
   seq                  number(10),
   ruleType             number(10),
   selfAssessmentScore  number(8),
   scoreReason 			VARCHAR2(128),
   endScore 			NUMBER(8),
   constraint pkDetailedRules primary key (id)
);

comment on table detailedRules is
'细则表';

comment on column detailedRules.id is
'主键';

comment on column detailedRules.createUser is
'创建用户';

comment on column detailedRules.updateUser is
'更新用户名';

comment on column detailedRules.updateDate is
'更新日期';

comment on column detailedRules.createDate is
'创建日期';

comment on column detailedRules.evaluateId is
'评估表的外键';

comment on column detailedRules.content is
'细则内容';

comment on column detailedRules.remark is
'描述';

comment on column detailedRules.score is
'分值';

comment on column detailedRules.standardScore is
'标准分值';

comment on column detailedRules.summary is
'摘要';

comment on column detailedRules.parentId is
'所属细则';

comment on column detailedRules.seq is
'索引值';

comment on column detailedRules.ruleType is
'细则类型';

comment on column detailedRules.selfAssessmentScore is
'自评分数';
comment on column detailedRules.SCOREREASON is
'评分依据';

alter table detailedRules
   add constraint fkDetailedRulesEvaluates foreign key (evaluateId)
      references evaluates (id);

alter table detailedRules
   add constraint fkParentDetailedRules foreign key (parentId)
      references detailedRules (id);



/*==============================================================*/
/* Table: scoreStandard                                         */
/*==============================================================*/
create table scoreStandard  (
   id                   number(10)                      not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   evaluateId           number(10),
   startScore           number(8),
   endScore             number(8),
   propertyDictId       number(10),
   constraint PK_SCORESTANDARD primary key (id)
);

comment on table scoreStandard is
'考核成绩标准表';

comment on column scoreStandard.id is
'主键';

comment on column scoreStandard.createUser is
'创建用户';

comment on column scoreStandard.updateUser is
'更新用户名';

comment on column scoreStandard.updateDate is
'更新日期';

comment on column scoreStandard.createDate is
'创建日期';

comment on column scoreStandard.evaluateId is
'评估表的外键';

comment on column scoreStandard.startScore is
'起始分数';

comment on column scoreStandard.endScore is
'截止分数';

comment on column scoreStandard.propertyDictId is
'考核结果类型id';

alter table scoreStandard
   add constraint FK_SCORESTA_FKDETAILE_EVALUATE foreign key (evaluateId)
      references evaluates (id);


/*==============================================================*/
/* Table: detailedRuleDialyLogRela                              */
/*==============================================================*/
create table detailedRuleDailyLogRelas  (
   id                   number(10)                      not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   detailedRuleId       number(10),
   dailyLogId           number(10),
   dailyLogType         number(10),
   constraint pk_detailedRuleDailyLogRelas primary key (id)
);

comment on column detailedRuleDailyLogRelas.createUser is
'创建用户';

comment on column detailedRuleDailyLogRelas.updateUser is
'更新用户名';

comment on column detailedRuleDailyLogRelas.updateDate is
'更新日期';

comment on column detailedRuleDailyLogRelas.createDate is
'创建日期';

comment on column detailedRuleDailyLogRelas.DAILYLOGID is
'日常工作具体表的ID';

comment on column detailedRuleDailyLogRelas.dailyLogType is
'日常工作类型';



-- Create table
create table ISSUEINSPECT (
  ID              NUMBER not null,
  CREATEREPUNION  VARCHAR2(30),
  CREATEREPDATE   DATE,
  CREATEREPPERSON VARCHAR2(100),
  AUDITPERSON     VARCHAR2(100),
  REMARK          VARCHAR2(100),
  REPDATE         DATE,
  SUBMITSTATE     NUMBER,
  SUBMITDATE      DATE,
  ISSUELEVEL      NUMBER,
  DAILYDIRECTORYID NUMBER(10)
);
-- Add comments to the table
comment on table ISSUEINSPECT
  is '矛盾纠纷排查';
-- Add comments to the columns
comment on column ISSUEINSPECT.ID
  is '物理主键';
comment on column ISSUEINSPECT.CREATEREPUNION
  is '出表单位';
comment on column ISSUEINSPECT.CREATEREPDATE
  is '填表时间';
comment on column ISSUEINSPECT.CREATEREPPERSON
  is '填表人';
comment on column ISSUEINSPECT.AUDITPERSON
  is '签发人';
comment on column ISSUEINSPECT.REMARK
  is '备注';
comment on column ISSUEINSPECT.REPDATE
  is '报表时间';
comment on column ISSUEINSPECT.SUBMITSTATE
  is '上报状态';
comment on column ISSUEINSPECT.SUBMITDATE
  is '上报时间';
comment on column ISSUEINSPECT.ISSUELEVEL
  is '矛盾纠纷类型1月报，2季报';
comment on column ISSUEINSPECT.DAILYDIRECTORYID
  is '台账目录Id';

-- Create table
create table ISSUEINSPECTDETAIL (
  ID                  NUMBER not null,
  ISSUETYPE           NUMBER,
  ISSUECOUNT          NUMBER,
  DEALCOUNT           NUMBER,
  FINISHCOUNT         NUMBER,
  REMARK              VARCHAR2(100),
  INSSUEID            NUMBER,
  CITYISSUECOUNT      NUMBER,
  CITYDEALCOUNT       NUMBER,
  CITYFINISHCOUNT     NUMBER,
  DISTRICTISSUECOUNT  NUMBER,
  DISTRICTDEALCOUNT   NUMBER,
  DISTRICTFINISHCOUNT NUMBER,
  TOWNISSUECOUNT      NUMBER,
  TOWNDEALCOUNT       NUMBER,
  TOWNFINISHCOUNT     NUMBER,
  VILLAGEISSUECOUNT   NUMBER,
  VILLAGEDEALCOUNT    NUMBER,
  VILLAGEFINISHCOUNT  NUMBER,
  ISSUEMONTHSUM       NUMBER,
  ISSUEYEARSUM        NUMBER,
  DEALMONTHSUM        NUMBER,
  FINISHMONTHSUM      NUMBER,
  DEALYEARSUM         NUMBER,
  FINISHYEARSUM       NUMBER
);
-- Add comments to the table
comment on table ISSUEINSPECTDETAIL
  is '矛盾纠纷排查明细表';
-- Add comments to the columns
comment on column ISSUEINSPECTDETAIL.ID
  is '物理主键';
comment on column ISSUEINSPECTDETAIL.ISSUETYPE
  is '纠纷类型';
comment on column ISSUEINSPECTDETAIL.ISSUECOUNT
  is '排查数量';
comment on column ISSUEINSPECTDETAIL.DEALCOUNT
  is '处理数量';
comment on column ISSUEINSPECTDETAIL.FINISHCOUNT
  is '完成数量';
comment on column ISSUEINSPECTDETAIL.REMARK
  is '备注';
commit;

alter table ISSUEINSPECT
add constraint pk_issue_id primary key (ID);
create index idx_issue_createdate on ISSUEINSPECT (createrepdate);
alter table ISSUEINSPECTDETAIL
add constraint pk_issuedetail primary key (ID);

create table keyAreasOfInvestigationInfos (
      id    number(10)    not null,
      directoryId number(10) not null,
      fromId    number(10),
      orgId    number(10) not null,
      orgInternalCode  varchar2(32) not null,
      investigationOrgId number(10) not null,
      areaName  varchar2(120) not null,
      mainProblem  varchar2(2000),
      policiesAndMeasures varchar2(2000),
      remark    varchar2(2000),
      status    number(1)  not null,
      createDate  date  not null,
      createUser  varchar2(32) not null,
      updateDate  date,
      updateUser  varchar2(32),
      investigationDate date,
      reportedDate	date,
      SUBORGID number(10),
      WARNINGORLISTING  varchar(100),
      expiredEntering      NUMBER(1),
      constraint pkKeyAreasOfInvestigationInfos primary key (id)
);
-- Add comments to the table
comment on table keyAreasOfInvestigationInfos
  is '治安重点地区情况表';
comment on column keyAreasOfInvestigationInfos.id
  is 'id';
comment on column keyAreasOfInvestigationInfos.directoryId
  is '所属目录id';
comment on column keyAreasOfInvestigationInfos.fromId
  is '数据来源id';
comment on column keyAreasOfInvestigationInfos.orgId
  is '部门id';
comment on column keyAreasOfInvestigationInfos.orgInternalCode
  is '部门内码';
comment on column keyAreasOfInvestigationInfos.investigationOrgId
  is '排查部门编号';
comment on column keyAreasOfInvestigationInfos.areaName
  is '地区名称';
comment on column keyAreasOfInvestigationInfos.mainProblem
  is '主要问题';
comment on column keyAreasOfInvestigationInfos.policiesAndMeasures
  is '对策和措施';
comment on column keyAreasOfInvestigationInfos.remark
  is '备注';
comment on column keyAreasOfInvestigationInfos.status
  is '状态';
comment on column keyAreasOfInvestigationInfos.createDate
  is '创建时间';
comment on column keyAreasOfInvestigationInfos.createUser
  is '创建用户';
comment on column keyAreasOfInvestigationInfos.updateDate
  is '修改时间';
comment on column keyAreasOfInvestigationInfos.updateUser
  is '修改用户';
comment on column keyAreasOfInvestigationInfos.investigationDate
  is '排查时间';
comment on column keyAreasOfInvestigationInfos.reportedDate
  is '上报时间';
comment on column keyAreasOfInvestigationInfos.expiredEntering 
  is '过期录入（0正常录入，1过期录入）';
create sequence s_keyAreasOfInvestigationInfos
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;


 create sequence s_significantIssuedeal
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;


create table significantIssuedeals (
    id    number(10)    not null,
    directoryId number(10) not null,
    fromId    number(10),
    orgId    number(10) not null,
    orgInternalCode  varchar2(32) not null,
    investigationOrgId number(10) not null,
    status    number(1)  not null,
    createDate  date  not null,
    createUser  varchar2(32) not null,
    updateDate  date,
    updateUser  varchar2(32),
    investigationDate date,
    reportedDate	date,
    sunorgId number(10),
    address varchar2(60) not null,
	significantIssuedealReason varchar2(1000),
	accountabilityUnit varchar2(60) not null,
	accountabilityLeading varchar2(60) not null,
	remarks varchar2(1000),
	SUBORGID number(10),
	expiredEntering      NUMBER(1),
   constraint pkSignificantIssuedeals primary key (id)
);

comment on table significantIssuedeals
is '重大矛盾纠纷排查调处情况表';
comment on column significantIssuedeals.id
is 'id';
comment on column significantIssuedeals.directoryId
is '所属目录id';
comment on column significantIssuedeals.fromId
is '数据来源id';
comment on column significantIssuedeals.orgId
is '部门id';
comment on column significantIssuedeals.orgInternalCode
is '部门内码';
comment on column significantIssuedeals.investigationOrgId
is '排查部门编号';
comment on column significantIssuedeals.status
is '状态';
comment on column significantIssuedeals.createDate
is '创建时间';
comment on column significantIssuedeals.createUser
is '创建用户';
comment on column significantIssuedeals.updateDate
is '修改时间';
comment on column significantIssuedeals.updateUser
is '修改用户';
comment on column significantIssuedeals.investigationDate
is '排查时间';
comment on column significantIssuedeals.reportedDate
is '上报时间';
comment on column significantIssuedeals.address
is '地方单位';
comment on column significantIssuedeals.significantIssuedealReason
is '矛盾纠纷简况及原因';
comment on column significantIssuedeals.accountabilityUnit
is '责任单位';
comment on column significantIssuedeals.accountabilityLeading
is '责任领导';
comment on column significantIssuedeals.remarks
is '调处情况';
comment on column significantIssuedeals.expiredEntering 
is '过期录入（0正常录入，1过期录入）';

/*==============================================================*/
/* Table: workingRecords                                         */
/*==============================================================*/
create table workingRecords  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   name                 VARCHAR2(200),
   simplePinyin         VARCHAR2(10),
   fullPinyin           VARCHAR2(30),
   dailyDirectoryId     NUMBER(10)                      not null,
   dailyYearId          NUMBER(10),
   dealDate             DATE,
   submitState          NUMBER(10),
   submitTime           DATE,
   backTime             DATE,
   proceedSite          VARCHAR2(150),
   workingUnit          VARCHAR2(400),
   dailyLogType         NUMBER(10),
   fileNo               VARCHAR2(100),
   participant          VARCHAR2(200),
   lister               VARCHAR2(60),
   dealPerson           VARCHAR2(60),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   subject              VARCHAR2(400),
   content              CLOB,
   fromId               number(10),
   reportTime				number(10),
   abilityUnit          varchar2(60),
   abilityLeading       varchar2(60),
   areaName             varchar2(120),
   mainProblem          varchar2(2000),
   policiesAndMeasures  varchar2(2000),
   significantIssuedealReason varchar2(300),
   expiredEntering      NUMBER(1),
   constraint pkWorkingRecords primary key (id)
);

comment on table workingRecords is
'工作台帐';

comment on column workingRecords.id is
'物理id';

comment on column workingRecords.orgId is
'所属网格';

comment on column workingRecords.orgInternalCode is
'网格名称';

comment on column workingRecords.name is
'名称';

comment on column workingRecords.simplePinyin is
'简拼';

comment on column workingRecords.fullPinyin is
'全拼';

comment on column workingRecords.dailyDirectoryId is
'工作台帐的目录';

comment on column workingRecords.dailyYearId is
'工作台帐年度Id';

comment on column workingRecords.dealDate is
'处理时间';

comment on column workingRecords.submitState is
'上报状态';

comment on column workingRecords.submitTime is
'上报时间';

comment on column workingRecords.backTime is
'回退时间';

comment on column workingRecords.proceedSite is
'开展地点';

comment on column workingRecords.workingUnit is
'工作单位或就读学校';

comment on column workingRecords.dailyLogType is
'台账类型类型';

comment on column workingRecords.fileNo is
'文件编号';

comment on column workingRecords.participant is
'参加人员';

comment on column workingRecords.lister is
'制表人';

comment on column workingRecords.dealPerson is
'签发人';

comment on column workingRecords.createUser is
'创建用户';

comment on column workingRecords.updateUser is
'修改用户';

comment on column workingRecords.createDate is
'创建时间';

comment on column workingRecords.updateDate is
'修改时间';

comment on column workingRecords.subject is
'主题';

comment on column workingRecords.content is
'报表明细及内容描述';

comment on column workingRecords.fromId is
'父类数据来源id';

comment on column workingRecords.abilityUnit is
'责任单位';

comment on column workingRecords.abilityLeading is
'责任领导';

comment on column workingRecords.areaName is
'地区名称';

comment on column workingRecords.mainProblem is
'主要问题';

comment on column workingRecords.policiesAndMeasures is
'对策与措施';

comment on column workingRecords.significantIssuedealReason is
'矛盾纠纷简况';

comment on column workingRecords.reportTime is
'报表时间';

comment on column workingRecords.expiredEntering is 
'过期录入（0正常录入，1过期录入）';
/*==============================================================*/
/* Index: idx_dlog_orgIdAndDirectoryid                          */
/*==============================================================*/
create index idx_wRed_orgIdAndDirectoryid on workingRecords (
   orgId ASC,
   dailyDirectoryId ASC
);

alter table workingRecords
   add constraint fkworkingRecords foreign key (dailyDirectoryId)
      references dailyDirectorys (id);


/*==============================================================*/
/* Table: overseaPersonnel                                      */
/*==============================================================*/
 create table overseaPersonnel  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   name                 VARCHAR2(180),
   gender               NUMBER(10)                      not null,
   mobileNumber         VARCHAR2(50),
   telephone            VARCHAR2(80),
   birthday             DATE,
   profession           VARCHAR2(150),
   workUnit             VARCHAR2(150),
   currentAddressType   NUMBER(10),
   community            VARCHAR2(150),
   block  				VARCHAR2(150),
   unit  				VARCHAR2(150),
   room  				VARCHAR2(150),
   currentAddress       VARCHAR2(150),
   nationality          VARCHAR2(60),
   certificateType      NUMBER(10),
   certificateNo        VARCHAR2(60)                   not null,
   arrivalTime          DATE,
   leaveTime 			DATE,
   remark               VARCHAR2(600),
   imgUrl               VARCHAR2(300),
   orgInternalCode      VARCHAR2(32)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   logOut           	NUMBER(10)                      default 0,
   englishName          VARCHAR2(180)                   not null,
   certificateStrartDay DATE,
   certificateEndDay    DATE,
   inflowReason	        VARCHAR2(120),
   isHaveHouse      	NUMBER(1)  					default 0,
   noHouseReason	    VARCHAR2(800),
   logOutReason         VARCHAR2(300),
   logOutDate          date,
   mail                varchar2(60),
   nativePlaceAddress varchar2(100),
   oldcurrentaddress VARCHAR2(150),
   ATTENTIONREASON VARCHAR2(300),
   NATIVEPOLICESTATION VARCHAR2(90),
   ISEMPHASIS NUMBER(1)  default 0,
   SOURCESSTATE NUMBER(1)  default 1 ,
   constraint pkOverseaPersonnel primary key (id),
   constraint fkOverseaPersonnelOrg foreign key (orgId)
         references organizations (id)
);

comment on table overseaPersonnel is
'境外人员对象表';

comment on column overseaPersonnel.orgId is
'所属网格';

comment on column overseaPersonnel.name is
'姓名';

comment on column overseaPersonnel.gender is
'性别';

comment on column overseaPersonnel.mobileNumber is
'手机号码';

comment on column overseaPersonnel.telephone is
'固定电话';

comment on column overseaPersonnel.birthday is
'出生日期';

comment on column overseaPersonnel.profession is
'职业';

comment on column overseaPersonnel.workUnit is
'工作单位或就读学校';

comment on column overseaPersonnel.currentAddressType is
'常住地址类型';

comment on column overseaPersonnel.community is
'常住地址商品房 小区';

comment on column overseaPersonnel.block is
'常住地址商品房 幢';

comment on column overseaPersonnel.unit is
'常住地址商品房 单元';

comment on column overseaPersonnel.room is
'常住地址商品房  室';

comment on column overseaPersonnel.currentAddress is
'现在居住地';

comment on column overseaPersonnel.nationality is
'国籍';

comment on column overseaPersonnel.certificateType is
'证件种类';

comment on column overseaPersonnel.certificateNo is
'证件号码';

comment on column overseaPersonnel.arrivalTime is
'抵达时间';

comment on column overseaPersonnel.leaveTime is
'离开时间';

comment on column overseaPersonnel.remark is
'备注';

comment on column overseaPersonnel.imgUrl is
'图片保存地址';

comment on column overseaPersonnel.orgInternalCode is
'所属责任区编号，以.分开';

comment on column overseaPersonnel.fullPinyin is
'全拼';

comment on column overseaPersonnel.simplePinyin is
'简拼';

comment on column overseaPersonnel.createUser is
'创建用户';

comment on column overseaPersonnel.updateUser is
'修改用户';

comment on column overseaPersonnel.createDate is
'创建日期';

comment on column overseaPersonnel.updateDate is
'修改时间';

comment on column overseaPersonnel.logOut is
'注销状态';
comment on column overseaPersonnel.englishName is
'英文名称';
comment on column overseaPersonnel.certificateStrartDay is
'有效期开始时间';
comment on column overseaPersonnel.certificateEndDay is
'有效期结束时间';
comment on column overseaPersonnel.inflowReason is
'流入原因';
comment on column overseaPersonnel.isHaveHouse is
'是否有房屋';
comment on column overseaPersonnel.noHouseReason is
'无房原因';
comment on column OVERSEAPERSONNEL.ATTENTIONREASON is '关注原因';
comment on column OVERSEAPERSONNEL.NATIVEPOLICESTATION is '户籍派出所';
comment on column OVERSEAPERSONNEL.SOURCESSTATE is '数据来源：1.录入；2.认领；3.已核实';

/*==============================================================*/
/* Index: idx_o_orgIdAndidCardNo                               */
/*==============================================================*/
create unique index idx_o_orgIdAndCTypeCNo on overseaPersonnel (
   orgId ASC,
   certificateType ASC,
   certificateNo ASC
);
/*==============================================================*/
/* Table: dailyLogAttachFiles                                   */
/*==============================================================*/
create table dailyLogAttachFiles  (
   id                   NUMBER(10)                      not null,
   dailyLogId           NUMBER(10),
   dailyYearId          NUMBER(10),
   workingRecordId		NUMBER(10)                      not null,
   fileSize             NUMBER(10),
   fileName             VARCHAR2(150)                   not null,
   fileActualUrl        VARCHAR2(250)                   not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkdailyLogAttachFiles primary key (id),
   constraint fkAttachFileDailyLog foreign key (workingRecordId)
         references workingRecords (id)
);

comment on table dailyLogAttachFiles is
'工作台帐附件';

comment on column dailyLogAttachFiles.dailyLogId is
'工作台帐的目录';

comment on column dailyLogAttachFiles.dailyYearId is
'工作台帐年度目录';

comment on column dailyLogAttachFiles.fileSize is
'工作台帐文件大小';

comment on column dailyLogAttachFiles.fileName is
'工作台帐文件名称';

comment on column dailyLogAttachFiles.fileActualUrl is
'工作台帐文件路径';

/*==============================================================*/
/* Table: overseaPersonnel                                      */
/*==============================================================*/
create table IdCardNoNativeAddress
(
  sixthIdCardNo nvarchar2(60),
  address       nvarchar2(60)
);

/*==============================================================*/
/* 20111011 skp                                     			*/
/*==============================================================*/

create sequence s_specialCareGroups
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;
/*==============================================================*/
/* Table: specialCareGroups                                     */
/*==============================================================*/
create table specialCareGroups (
	id					NUMBER(10)						not null,
	name				VARCHAR2(60)					not null,
	idCardNo            VARCHAR2(18)					not null,
	inhabitantId		NUMBER(10),
	gender              NUMBER(10)                      not null,
	birthday			DATE,
	currentAddress		VARCHAR2(150),
	telephone           VARCHAR2(15),
	mobileNumber        VARCHAR2(11),
	orgId        		NUMBER(10),
	specialCareNo		VARCHAR2(50)					not null,
	specialCareType		NUMBER(10),
	labourCapacity		NUMBER(10),
	viability			NUMBER(10),
	employmentStatus	NUMBER(10),
	supportStatus		NUMBER(10),
	monthsExpenses		NUMBER(15,5),
	remark              VARCHAR2(600),
	fullPinyin          VARCHAR2(30),
	simplePinyin        VARCHAR2(10),
	orgInternalCode		VARCHAR2(32)					not null,
	createUser          VARCHAR2(32)                    not null,
	createDate          DATE                            not null,
	updateUser          VARCHAR2(32),
	updateDate          DATE,
	constraint pkspecialCareGroups primary key (id),
	constraint fkspecialCareGroupsOrg foreign key (orgId)
		references organizations (id)
);

comment on table specialCareGroups is
'优抚对象';

comment on column specialCareGroups.id is
'ID';

comment on column specialCareGroups.name is
'姓名';

comment on column specialCareGroups.idCardNo is
'身份证号码';

comment on column specialCareGroups.inhabitantId is
'常住人口ID';

comment on column specialCareGroups.gender is
'性别';

comment on column specialCareGroups.birthday is
'出生日期';

comment on column specialCareGroups.currentAddress is
'常住地址';

comment on column specialCareGroups.telephone is
'固定电话';

comment on column specialCareGroups.mobileNumber is
'手机号码';

comment on column specialCareGroups.orgId is
'所属网格';

comment on column specialCareGroups.specialCareNo is
'优抚证号';

comment on column specialCareGroups.specialCareType is
'优抚类型';

comment on column specialCareGroups.labourCapacity is
'劳动能力';

comment on column specialCareGroups.viability is
'生活能力';

comment on column specialCareGroups.employmentStatus is
'就业情况';

comment on column specialCareGroups.supportStatus is
'供养情况';

comment on column specialCareGroups.monthsExpenses is
'月生活费';

comment on column specialCareGroups.remark is
'备注';

comment on column specialCareGroups.fullPinyin is
'全拼';

comment on column specialCareGroups.simplePinyin is
'简拼';

comment on column specialCareGroups.orgInternalCode is
'所属网格编号';

comment on column specialCareGroups.createUser is
'创建用户';

comment on column specialCareGroups.createDate is
'创建时间';

comment on column specialCareGroups.updateUser is
'修改用户';

comment on column specialCareGroups.updateDate is
'修改时间';

create sequence s_personnelTracks
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create table personnelTracks(
  id					  	NUMBER(10)                      not null,
  operationOrgId	  	  	NUMBER(10)                      not null,
  personnelId			  	NUMBER(10)                      not null,
  idCardno                	VARCHAR2(50)                    not null,
  personnelOrgId			NUMBER(10)                      not null,
  personnelOrgInternalCode	VARCHAR2(32)                    not null,
  oldPersonnelOrgId			NUMBER(10),
  personnelName			  	VARCHAR2(60)					not null,
  personnelType			  	VARCHAR2(32)                    not null,
  operationType			  	NUMBER(10)                      not null,
  personinitType            NUMBER(10)                      not null,
  operationContent	      	VARCHAR2(300),
  operationUserId		  	NUMBER(10)                      not null,
  operationDate				DATE                            not null,
  createUser              	VARCHAR2(32)                    not null,
  createDate              	DATE                            not null,
  constraint pkPersonnelTracks primary key (id)
);
comment on table personnelTracks is
'人员轨迹';
comment on column personnelTracks.operationOrgId is
'操作用户部门';
comment on column personnelTracks.personnelId is
'人员id';
comment on column personnelTracks.idCardno is
'人员身份证号码';
comment on column personnelTracks.personnelOrgId is
'人员所在部门';
comment on column personnelTracks.oldPersonnelOrgId is
'人员之前所在部门';
comment on column personnelTracks.personnelName is
'人员名称';
comment on column personnelTracks.personnelType is
'人员类型';
comment on column personnelTracks.operationType is
'操作类型';
comment on column personnelTracks.personinitType is
'人员内置类型';
comment on column personnelTracks.operationContent is
'操作内容';
comment on column personnelTracks.operationUserId is
'操作人id';
comment on column personnelTracks.createDate is
'操作日期';
comment on column personnelTracks.createUser is
'创建用户名';
comment on column personnelTracks.createDate is
'创建日期';

create table ISSUEDEALSTATS
(
  ID                          NUMBER(10) not null,
  ORGID                       NUMBER(10) not null,
  ORGINTERNALCODE             VARCHAR2(32) not null,
  ORGLEVELID                  NUMBER(10),
  ORGTYPEID                   NUMBER(10),
  STATYEAR                    NUMBER(10),
  STATMONTH                   NUMBER(10),
  STATSTARTTIME               DATE,
  STATENDTIME                 DATE,
  MONTHADDCOUNT               NUMBER(10),
  YEARADDCOUNT                NUMBER(10),
  TOTALADDCOUNT               NUMBER(10),
  MONTHNOMALDEALINGCOUNT      NUMBER(10),
  MONTHOVERTIMEDEALINGCOUNT   NUMBER(10),
  MONTHNOMALCOMPLETEDCOUNT    NUMBER(10),
  MONTHOVERTIMECOMPLETEDCOUNT NUMBER(10),
  YEARCOMPLETEDCOUNT          NUMBER(10),
  TOTALCOMPLETEDCOUNT         NUMBER(10),
  monthComplededAddCount      number(10),
  yearComplededAddCount       number(10),
  totalComplededAddCount      number(10),
  CREATEDATE                  DATE,
  CREATEUSER                  VARCHAR2(32),
  UPDATEDATE                  DATE,
  UPDATEUSER                  VARCHAR2(32)
);
-- Add comments to the columns
comment on column ISSUEDEALSTATS.MONTHADDCOUNT
  is '本月立案（新增）';
comment on column ISSUEDEALSTATS.YEARADDCOUNT
  is '本年立案（新增）';
comment on column ISSUEDEALSTATS.TOTALADDCOUNT
  is '累计（全部）立案（新增）';
comment on column ISSUEDEALSTATS.MONTHNOMALDEALINGCOUNT
  is '本月正常在办';
comment on column ISSUEDEALSTATS.MONTHOVERTIMEDEALINGCOUNT
  is '本月超期在办（包含以前超期）';
comment on column ISSUEDEALSTATS.MONTHNOMALCOMPLETEDCOUNT
  is '本月正常办结';
comment on column ISSUEDEALSTATS.MONTHOVERTIMECOMPLETEDCOUNT
  is '本月超期办结';
comment on column ISSUEDEALSTATS.YEARCOMPLETEDCOUNT
  is '本年办结';
comment on column ISSUEDEALSTATS.TOTALCOMPLETEDCOUNT
  is '累计办结';
-- Create/Recreate primary, unique and foreign key constraints
alter table ISSUEDEALSTATS
  add constraint PK_ISSUEDEALSTAT primary key (ID);
alter table ISSUEDEALSTATS
  add constraint FK_ISSUEDEALSTATORGID foreign key (ORGID)
  references ORGANIZATIONS (ID);
-- Create/Recreate indexes
create index INDEX_ORG_ENDTIME on ISSUEDEALSTATS (ORGINTERNALCODE, STATENDTIME);
create index INDEX_ORG_ENDTIME_ORGTYPE on ISSUEDEALSTATS (STATENDTIME, ORGINTERNALCODE, ORGLEVELID);

create table ISSUEMONTHENDDEALINGHISTORIES
(
  ID                        NUMBER(10) not null,
  ORGID                     NUMBER(10),
  ORGINTERNALCODE           VARCHAR2(32),
  ORGLEVELID                NUMBER(10),
  ORGTYPEID                 NUMBER(10),
  STATYEAR                  NUMBER(10),
  STATMONTH                 NUMBER(10),
  OVERTIMESTARTTIME         DATE,
  OVERTIMEENDTIME           DATE,
  ISSUESERIALNUMBER         VARCHAR2(20),
  ISSUEID                   NUMBER(10),
  ISSUELOGID                NUMBER(10),
  ISSUEOPERATIONDESCRIPTION VARCHAR2(300),
  CREATEUSER                VARCHAR2(32),
  CREATEDATE                DATE,
  UPDATEUSER                VARCHAR2(32),
  UPDATEDATE                DATE
);
alter table ISSUEMONTHENDDEALINGHISTORIES
  add constraint PK_ISSUEDEALINGHISTORIES primary key (ID);


-- Create table
create table FAMILYHONORS
(
  PROPERTYDICTID NUMBER(10),
  FAMILYID       NUMBER(10)
);

-- Add comments to the table
comment on table FAMILYHONORS
  is '家庭称呼类型表';
-- Add comments to the columns
comment on column FAMILYHONORS.PROPERTYDICTID
  is '子类型ID';
comment on column FAMILYHONORS.FAMILYID
  is '户号ID';

create sequence s_systemhighlogs
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;


  create table systemhighlogs(
id NUMBER(10) not null,
OrgId	NUMBER(10) ,
orgInternalCode      VARCHAR2(32),
modelId			  	NUMBER(10)                      not null,
modelName         VARCHAR2(60)					not null,
name VARCHAR2(60)					not null,
operationUserName		  	 VARCHAR2(60)		                    not null,
operationType NUMBER(10)                       not null,
operationContent	      	VARCHAR2(300),
clientIp             VARCHAR2(32),
operationDate				DATE                            not null,
 constraint Pk_systemhighlogs primary key (id)
);
comment on table systemhighlogs is
'系统高级日志';
comment on column systemhighlogs.OrgId is
'部门';
comment on column systemhighlogs.modelName is
'模块名称';
comment on column systemhighlogs.operationUserName is
'操作用户';
comment on column systemhighlogs.operationtype is
'操作类型';
comment on column systemhighlogs.operationContent is
'操作类容';
comment on column systemhighlogs.clientIp is
'访问IP';
comment on column systemhighlogs.operationDate is
'操作时间';


alter table detailedRuleDailyLogRelas
   add constraint fk_detailedRuleDailyLogRela foreign key (detailedRuleId)
      references detailedRules (id);
 /*==============================================================*/
/* Table: handicapped                                            */
/*==============================================================*/
create sequence s_handicappeds
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

/*==============================================================*/
/* 20111107 skp                                     			*/
/*==============================================================*/

create sequence s_elderlyPeople
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;
/*==============================================================*/
/* Table: elderlyPeople                                     */
/*==============================================================*/
create table ELDERLYPEOPLE 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   ENTERWORKDATE        DATE,
   RETIREDATE           DATE,
   PENSION              NUMBER(11,2),
   LIVESTATUS           NUMBER(10),
   PEOPLETYPE           NUMBER(10),
   SPOUSESTATUS         NUMBER(10),
   CURRENTSTATUS        NUMBER(10),
   INCOMESOURCE         NUMBER(10),
   RETIREUNITANDDUTY    VARCHAR2(100),
   ELDERPEOPLEID        VARCHAR2(60),
   ZHIWU                VARCHAR2(60),
   BEIZHU               VARCHAR2(160),
   OLDCURRENTADDRESS    VARCHAR2(150),
   RESIDENCETYPE        NUMBER(10),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PKELDERLYPEOPLE primary key (ID),
   constraint fkelderlyPeopleOrg foreign key (orgId)
		references organizations (id)
);

comment on table ELDERLYPEOPLE is
'老年人';

comment on column ELDERLYPEOPLE.ID is
'ID';

comment on column ELDERLYPEOPLE.ORGID is
'所属网格';

comment on column ELDERLYPEOPLE.ORGINTERNALCODE is
'所属网格编号';

comment on column ELDERLYPEOPLE.ENTERWORKDATE is
'参加工作日期';

comment on column ELDERLYPEOPLE.RETIREDATE is
'离退休日期';

comment on column ELDERLYPEOPLE.PENSION is
'退休金';

comment on column ELDERLYPEOPLE.LIVESTATUS is
'居住情况';

comment on column ELDERLYPEOPLE.PEOPLETYPE is
'特殊人员';

comment on column ELDERLYPEOPLE.SPOUSESTATUS is
'配偶情况';

comment on column ELDERLYPEOPLE.CURRENTSTATUS is
'目前情况';

comment on column ELDERLYPEOPLE.INCOMESOURCE is
'经济来源';

comment on column ELDERLYPEOPLE.RETIREUNITANDDUTY is
'离退休单位';

comment on column ELDERLYPEOPLE.ELDERPEOPLEID is
'老年人证号';

comment on column ELDERLYPEOPLE.ZHIWU is
'离退休单位职位';

comment on column ELDERLYPEOPLE.BEIZHU is
'业务信息备注';

comment on column ELDERLYPEOPLE.RESIDENCETYPE is
'户口类别';

comment on column ELDERLYPEOPLE.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column ELDERLYPEOPLE.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column ELDERLYPEOPLE.ISEMPHASIS is
'是否注销';

comment on column ELDERLYPEOPLE.CREATEUSER is
'创建用户';

comment on column ELDERLYPEOPLE.CREATEDATE is
'创建时间';

comment on column ELDERLYPEOPLE.UPDATEUSER is
'修改用户';

comment on column ELDERLYPEOPLE.UPDATEDATE is
'修改时间';


/*==============================================================*/
/* Index: idx_IY_orgIntCodeAndisEmphasis                        */
/*==============================================================*/
create index idx_el_orgIntCodeAndisEmphasis on ELDERLYPEOPLE (
   orgInternalCode ASC,
   isEmphasis ASC
);

create table HANDICAPPEDS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32),
   HADDISABILITYCARD    NUMBER(1),
   DISABILITYREASON     VARCHAR2(150),
   DISABILITYTYPE       NUMBER(10),
   DISABILITYCARDNO     VARCHAR2(90),
   DISABILITY           NUMBER(10),
   DISABILITYDATE       DATE,
   WORKPROFILE          NUMBER(10),
   SKILLPROFILE         NUMBER(10),
   GUARDIANNAME         VARCHAR2(60),
   GUARDIANTELEPHONE    VARCHAR2(15),
   GUARDIANMOBILENUMBER VARCHAR2(11),
   OLDCURRENTADDRESS    VARCHAR2(150),
   RESIDENCETYPE        NUMBER(10),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                 not null,
   UPDATEDATE           DATE,
   constraint PK_HANDICAPPEDS primary key (ID),
   constraint fk_HandicappedsOrg foreign key (orgId)
         references organizations (id)
);

comment on table HANDICAPPEDS is
'残疾人';

comment on column HANDICAPPEDS.ID is
'残疾人ID';

comment on column HANDICAPPEDS.ORGID is
'所属网格';

comment on column HANDICAPPEDS.ORGINTERNALCODE is
'所属网格编号';

comment on column HANDICAPPEDS.HADDISABILITYCARD is
'是否有残疾证';

comment on column HANDICAPPEDS.DISABILITYREASON is
'残疾原因';

comment on column HANDICAPPEDS.DISABILITYTYPE is
'残疾类别';

comment on column HANDICAPPEDS.DISABILITYCARDNO is
'残疾证号';

comment on column HANDICAPPEDS.DISABILITY is
'残疾状况';

comment on column HANDICAPPEDS.DISABILITYDATE is
'残疾时间';

comment on column HANDICAPPEDS.WORKPROFILE is
'劳动能力';

comment on column HANDICAPPEDS.SKILLPROFILE is
'技能特长';

comment on column HANDICAPPEDS.GUARDIANNAME is
'监护人名字';

comment on column HANDICAPPEDS.GUARDIANTELEPHONE is
'监护人电话';

comment on column HANDICAPPEDS.GUARDIANMOBILENUMBER is
'监护人手机号码';

comment on column HANDICAPPEDS.RESIDENCETYPE is
'户口类别';

comment on column HANDICAPPEDS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column HANDICAPPEDS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column HANDICAPPEDS.ISEMPHASIS is
'是否注销';

comment on column HANDICAPPEDS.CREATEUSER is
'创建用户';

comment on column HANDICAPPEDS.UPDATEUSER is
'修改用户';

comment on column HANDICAPPEDS.CREATEDATE is
'创建时间';

comment on column HANDICAPPEDS.UPDATEDATE is
'修改时间';


/*==============================================================*/
/* Index: idx_IY_orgIntCodeAndisEmphasis                        */
/*==============================================================*/
create index idx_ha_orgIntCodeAndisEmphasis on HANDICAPPEDS (
   orgInternalCode ASC,
   isEmphasis ASC
);

create table systemLogs_Archive  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(255),
   moduleName           VARCHAR2(60),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType        NUMBER(10),
   constraint pkSystemLogsArchive primary key (id),
   constraint fkSystemLogsArchiveOrg foreign key (orgId)
         references organizations (id)
);
comment on column systemLogs_Archive.logLevel is
'日志等级';
comment on column systemLogs_Archive.operation is
'术语编号';
comment on column systemLogs_Archive.moduleName is
'模块名';
comment on column systemLogs_Archive.username is
'操作的用户';
comment on column systemLogs_Archive.clientIp is
'访问IP ';
comment on column systemLogs_Archive.orgInternalCode is
'部门内部编码';
comment on column systemLogs_Archive.operateTime is
'操作时间';
comment on column systemLogs_Archive.operationType is
'操作类型';


alter table keyAreasOfInvestigationInfos
   add constraint fkKeyAreasOfInvestigationInfos foreign key (orgId)
      references organizations (id);

alter table significantIssuedeals
   add constraint fkSignificantIssuedeals foreign key (orgId)
      references organizations (id);

alter table SYSTEMLOGS drop constraint FKSYSTEMLOGSORG;

alter table ISSUEDEALSTATS drop constraint FK_ISSUEDEALSTATORGID;

alter table issueStatueStanals drop constraint fkIssueStatueStanalsOrg;

/*==============================================================*/
/* Table: floatingPopulations                                           */
/*==============================================================*/
create table FLOATINGPOPULATIONS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(50),
   ISINFLOWING          NUMBER(1)            default 0,
   INFLOWINGREASON      NUMBER(10),
   INFLOWINGDATE        DATE,
   INFLOWINGPROVINCE    VARCHAR2(60),
   INFLOWINGCITY        VARCHAR2(60),
   INFLOWINGDISTRICT    VARCHAR2(60),
   REGISTRATIONTYPE     NUMBER(10),
   REGISTERDATE         DATE,
   EXPECTEDDATEDUE      DATE,
   RESIDENCETYPE        NUMBER(10),
   CERTIFICATENUMBER    VARCHAR2(150),
   STAYLOCATIONTYPEID   NUMBER(10),
   ECONOMYSOURCEID      NUMBER(10),
   STAYTIMELIMITID      NUMBER(10),
   PREPAREDSTAYTIMELIMITID NUMBER(10),
   HASMARRIEDPROVE      NUMBER(1),
   SETTLETIME           VARCHAR2(30),
   SOURCESSTATE         NUMBER(1)            default 1,
   OLDCURRENTADDRESS    VARCHAR2(150),
   TOBERASTATE          NUMBER(10),
   HOUSEHOLDTYPE        NUMBER(10),
   PROFESSIONALQUALIFICATIONS NUMBER(10),
   ISCOUPLESPEER        NUMBER(1),
   PREGNANCYANDCONTRACEPTIONCASE NUMBER(10),
   FERTILITYNO          VARCHAR2(45),
   BOYCHILDRENNO        NUMBER(2),
   GIRLCHILDRENNO       NUMBER(2),
   CARTYPE              VARCHAR2(60),
   CARCOLOR             VARCHAR2(30),
   CARPLATE             VARCHAR2(45),
   LOGOUT               NUMBER(1)            default 0,
   ISREMIND				NUMBER(1)            default 0,
   LOGOUTREASON         VARCHAR2(300),
   LOGOUTDATE           DATE,
   CREATEUSER           VARCHAR2(60)         not null,
   UPDATEUSER           VARCHAR2(60),
   CREATEDATE           DATE                 not null,
   UPDATEDATE           DATE,
   MARKBIRTHDAY			DATE,
   MARKGENDER 			NUMBER(10),
   constraint PKFLOATINGPOPULATIONS primary key (ID),
   constraint fkFloatingPopulationsOrg foreign key (orgId)
         references organizations (id)
);

comment on table FLOATINGPOPULATIONS is
'流动人口';

comment on column FLOATINGPOPULATIONS.ORGID is
'所属网格';

comment on column FLOATINGPOPULATIONS.ORGINTERNALCODE is
'部门内部编码';

comment on column FLOATINGPOPULATIONS.ISINFLOWING is
'是否流入';

comment on column FLOATINGPOPULATIONS.INFLOWINGREASON is
'流入原因';

comment on column FLOATINGPOPULATIONS.INFLOWINGDATE is
'流入时间';

comment on column FLOATINGPOPULATIONS.INFLOWINGPROVINCE is
'流入来源省';

comment on column FLOATINGPOPULATIONS.INFLOWINGCITY is
'流入来源市';

comment on column FLOATINGPOPULATIONS.INFLOWINGDISTRICT is
'流入来源县';

comment on column FLOATINGPOPULATIONS.REGISTRATIONTYPE is
'登记证情况';

comment on column FLOATINGPOPULATIONS.REGISTERDATE is
'登记日期';

comment on column FLOATINGPOPULATIONS.EXPECTEDDATEDUE is
'预期到期日期';

comment on column FLOATINGPOPULATIONS.RESIDENCETYPE is
'文化程度';

comment on column FLOATINGPOPULATIONS.CERTIFICATENUMBER is
'证件编号';

comment on column FLOATINGPOPULATIONS.STAYLOCATIONTYPEID is
'暂住处所';

comment on column FLOATINGPOPULATIONS.ECONOMYSOURCEID is
'经济来源';

comment on column FLOATINGPOPULATIONS.STAYTIMELIMITID is
'居住时限';

comment on column FLOATINGPOPULATIONS.PREPAREDSTAYTIMELIMITID is
'预居住时限';

comment on column FLOATINGPOPULATIONS.HASMARRIEDPROVE is
'是否有婚育证明';

comment on column FLOATINGPOPULATIONS.SETTLETIME is
'转为流动人口的时间';

comment on column FLOATINGPOPULATIONS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column FLOATINGPOPULATIONS.TOBERASTATE is
'生育状况';

comment on column FLOATINGPOPULATIONS.HOUSEHOLDTYPE is
'原户口类型';

comment on column FLOATINGPOPULATIONS.PROFESSIONALQUALIFICATIONS is
'职称技术等级';

comment on column FLOATINGPOPULATIONS.ISCOUPLESPEER is
'夫妻是否同行';

comment on column FLOATINGPOPULATIONS.PREGNANCYANDCONTRACEPTIONCASE is
'怀孕避孕情况';

comment on column FLOATINGPOPULATIONS.FERTILITYNO is
'婚育证明号';

comment on column FLOATINGPOPULATIONS.BOYCHILDRENNO is
'拥有子女中的男孩数';

comment on column FLOATINGPOPULATIONS.GIRLCHILDRENNO is
'拥有子女中的女孩数';

comment on column FLOATINGPOPULATIONS.CARTYPE is
'车辆类型';

comment on column FLOATINGPOPULATIONS.CARCOLOR is
'车辆颜色';

comment on column FLOATINGPOPULATIONS.CARPLATE is
'车辆号牌';

comment on column FLOATINGPOPULATIONS.LOGOUT is
'是否注销';

comment on column FLOATINGPOPULATIONS.CREATEUSER is
'创建用户';

comment on column FLOATINGPOPULATIONS.UPDATEUSER is
'修改用户';

comment on column FLOATINGPOPULATIONS.CREATEDATE is
'创建日期';

comment on column FLOATINGPOPULATIONS.UPDATEDATE is
'修改时间';
create index INDEX_FLOAT_MARKBIRTHDAY on floatingPopulations (MARKBIRTHDAY);
create index INDEX_FLOAT_MARKGENDER on floatingPopulations (MARKGENDER);



/* Table: unsettledPopulations                                           */
/*==============================================================*/
create table unsettledPopulations  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode VARCHAR2(32),
   gender               NUMBER(10)                      not null,
   idCardNo             VARCHAR2(60),
   name                 VARCHAR2(60)                    not null,
   usedName             VARCHAR2(60),
   birthday             DATE,
   province             VARCHAR2(60),
   city                 VARCHAR2(60),
   district             VARCHAR2(60),
   nativePlaceAddress   VARCHAR2(150),
   currentAddress       VARCHAR2(150),
   mobileNumber         VARCHAR2(50),
   telephone            VARCHAR2(80),
   politicalBackground  NUMBER(10),
   maritalState         NUMBER(10),
   stature              NUMBER(10),
   nation               NUMBER(10),
   faith                NUMBER(10),
   bloodType            NUMBER(10),
   schooling            NUMBER(10),
   email                VARCHAR2(150),
   workUnit             VARCHAR2(150),
   isDeath              NUMBER(1)                      default 0 ,
   remark               VARCHAR2(900),
   otherAddress         VARCHAR2(150),
   certificateNo        VARCHAR2(150),
   unSettedTime         DATE,
   unSettedReason       NUMBER(10),
   certificateType      NUMBER(10),
   career               NUMBER(10),
   imgUrl               VARCHAR2(300),
   currentAddressType   NUMBER(10)                default 0,
   community            VARCHAR2(60),
   block          VARCHAR2(24),
   unit          VARCHAR2(18),
   room          VARCHAR2(30),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   logout               NUMBER(1) default 0,
   isHaveHouse      	NUMBER(1)  						default 0,
   noHouseReason	    VARCHAR2(800),
   logoutReason          VARCHAR2(300),
   logoutDate            DATE,
    SOURCESSTATE NUMBER(1)  default 1 ,
   constraint pkUnsettledPopulations primary key (id),
   constraint fkUnsettledPopulationsOrg foreign key (orgId)
         references organizations (id)
);

comment on table unsettledPopulations is
'未落户人口';

comment on column unsettledPopulations.orgId is
'所属网格';

comment on column unsettledPopulations.gender is
'性别';

comment on column unsettledPopulations.idCardno is
'身份证id';

comment on column unsettledPopulations.name is
'姓名';

comment on column unsettledPopulations.usedName is
'曾用名';

comment on column unsettledPopulations.birthday is
'出生日期';

comment on column unsettledPopulations.province is
'省';

comment on column unsettledPopulations.city is
'市';

comment on column unsettledPopulations.district is
'区县';

comment on column unsettledPopulations.nativePlaceAddress is
'户籍地详址';

comment on column unsettledPopulations.currentAddress is
'常住地址';

comment on column unsettledPopulations.politicalBackground is
'政治面貌';

comment on column unsettledPopulations.mobileNumber is
'手机号码';

comment on column unsettledPopulations.telephone is
'固定电话';

comment on column unsettledPopulations.maritalState is
'婚姻状况';

comment on column unsettledPopulations.stature is
'身高';

comment on column unsettledPopulations.nation is
'民族';

comment on column unsettledPopulations.faith is
'宗教信仰';

comment on column unsettledPopulations.schooling is
'文化程度';

comment on column unsettledPopulations.bloodType is
'血型';

comment on column unsettledPopulations.email is
'电子邮箱';

comment on column unsettledPopulations.workUnit is
'工作单位或就读学校';

comment on column unsettledPopulations.remark is
'备注';

comment on column unsettledPopulations.isDeath is
'是否死亡';

comment on column unsettledPopulations.createUser is
'创建用户';

comment on column unsettledPopulations.updateUser is
'修改用户';

comment on column unsettledPopulations.createDate is
'创建日期';

comment on column unsettledPopulations.updateDate is
'修改时间';

comment on column unsettledPopulations.certificateType is
'持证类别';

comment on column unsettledPopulations.otherAddress is
'临时居所';

comment on column unsettledPopulations.certificateNo is
'持证编号';

comment on column unsettledPopulations.unSettedTime is
'未落户时间';

comment on column unsettledPopulations.unSettedReason is
'未落户原因';

comment on column unsettledPopulations.career is
'职业';

comment on column unsettledPopulations.imgUrl is
'头像路径';

comment on column unsettledPopulations.currentAddressType is
'常住地址类型';

comment on column unsettledPopulations.community is
'常住地址商品房 小区';

comment on column unsettledPopulations.block is
'常住地址商品房 幢';

comment on column unsettledPopulations.unit is
'常住地址商品房 单元';

comment on column unsettledPopulations.room is
'常住地址商品房  室';
comment on column unsettledPopulations.simplePinyin is
'简拼';

comment on column unsettledPopulations.fullPinyin is
'全拼';

comment on column unsettledPopulations.orgInternalCode is
'所属责任区编号';
comment on column unsettledPopulations.logout is
'是否注销（为与其它实有人口保持一致）';

comment on column unsettledPopulations.isHaveHouse is
'是否有房屋';

comment on column unsettledPopulations.noHouseReason is
'无房原因';

 create table CENSUSREGISTERFAMILYS
(
  ID            NUMBER(10) not null,
  ORGID         NUMBER(10) not null,
  ACCOUNTNUMBER VARCHAR2(150) not null,
  IDCARDNO      VARCHAR2(60),
  HOUSEHOLDNAME VARCHAR2(150),
  HOMEPHONE     VARCHAR2(150),
  PROVINCE      VARCHAR2(150),
  CITY          VARCHAR2(150),
  DISTRICT      VARCHAR2(150),
  createUser    VARCHAR2(60) not null,
  updateUser    VARCHAR2(60),
  createDate    DATE         not null,
  updateDate    DATE,
  MOBILENUMBER  VARCHAR2(50),
  TELEPHONE     VARCHAR2(80),
  currentAddress VARCHAR2(150),
  orginternalcode VARCHAR2(32)  not null,
  oldcurrentaddress VARCHAR2(150),
  HOUSEADDRESS VARCHAR2(150),
  COMMENTS NUMBER(10)  default 0,
  SOURCESSTATE NUMBER(1)  default 1,
  constraint PK_CENSUSREGISTERFAMILYS_ID primary key (ID),
  constraint FK_FAMILY_ORGID foreign key (ORGID)
  references ORGANIZATIONS (ID)
);

comment on column CENSUSREGISTERFAMILYS.ORGID
  is '所属网格';
comment on column CENSUSREGISTERFAMILYS.ACCOUNTNUMBER
  is '户号';
comment on column CENSUSREGISTERFAMILYS.IDCARDNO
  is '户主身份证号码';
comment on column CENSUSREGISTERFAMILYS.HOUSEHOLDNAME
  is '户主姓名';
comment on column CENSUSREGISTERFAMILYS.HOMEPHONE
  is '住宅电话';
comment on column CENSUSREGISTERFAMILYS.PROVINCE
  is '省';
comment on column CENSUSREGISTERFAMILYS.CITY
  is '市';
comment on column CENSUSREGISTERFAMILYS.DISTRICT
  is '区县';
comment on column CENSUSREGISTERFAMILYS.MOBILENUMBER
  is '手机号码';
comment on column CENSUSREGISTERFAMILYS.TELEPHONE
  is '固定电话';
comment on column CENSUSREGISTERFAMILYS.CURRENTADDRESS
  is '当前地址';
comment on column CENSUSREGISTERFAMILYS.ORGINTERNALCODE
  is '所属网格编号';
comment on column CENSUSREGISTERFAMILYS.HOUSEADDRESS is '户籍地';
comment on column CENSUSREGISTERFAMILYS.COMMENTS is '家庭走访记录次数';
comment on column CENSUSREGISTERFAMILYS.SOURCESSTATE is '数据来源：1.录入；2.认领；3.已核实';

/*==============================================================*/
/* Index: idx_O_orgIdAndidACCOUNTNUMBER                               */
/*==============================================================*/
create unique index idx_O_orgIdAndidACCOUNTNUMBER on CENSUSREGISTERFAMILYS (
   orgId ASC,
   ACCOUNTNUMBER ASC
);
  


/*==============================================================*/
/* Table: HOUSINGINFO                                           */
/*==============================================================*/
create table HOUSINGINFO
(
  ID          NUMBER(10) not null,
  HOUSINGCODE VARCHAR2(30) not null,
  HOUSINGTYPE NUMBER(2),
  ISOWNER     NUMBER(1) default 0 not null,
  OWNERCARD   VARCHAR2(18),
  OWNERNAME   VARCHAR2(30),
  TOWNORGID   NUMBER(10),
  ORGID       NUMBER(10),
  STATE       NUMBER(1) default 0 not null,
  PERSONTYPE  CHAR(1) default '0' not null,
  PERSONID    NUMBER(10),
  CREATEUSER  VARCHAR2(32) not null,
  UPDATEUSER  VARCHAR2(32),
  CREATEDATE  DATE not null,
  UPDATEDATE  DATE,
  constraint PK_HOUSINGINFO_ID primary key (ID),
  constraint FK_HOUSINGINFO_ORGID foreign key (ORGID) references ORGANIZATIONS (ID),
  constraint FK_HOUSINGINFO_TOWNID foreign key (TOWNORGID) references ORGANIZATIONS (ID)
);

comment on table HOUSINGINFO
  is '住房信息表';
-- Add comments to the columns
comment on column HOUSINGINFO.ID
  is '住房信息主键';
comment on column HOUSINGINFO.HOUSINGCODE
  is '住房编号';
comment on column HOUSINGINFO.HOUSINGTYPE
  is '住房类别(字典数据)';
comment on column HOUSINGINFO.ISOWNER
  is '是否房主';
comment on column HOUSINGINFO.OWNERCARD
  is '房主身份证号码';
comment on column HOUSINGINFO.OWNERNAME
  is '房主姓名';
comment on column HOUSINGINFO.TOWNORGID
  is '所在乡镇网格编号';
comment on column HOUSINGINFO.ORGID
  is '所在最小网格编号';
comment on column HOUSINGINFO.STATE
  is '注销状态';
comment on column HOUSINGINFO.PERSONTYPE
  is '人口类型';
comment on column HOUSINGINFO.PERSONID
  is '人口编号';
comment on column HOUSINGINFO.CREATEUSER
  is '创建人员';
comment on column HOUSINGINFO.UPDATEUSER
  is '更新人员';
comment on column HOUSINGINFO.CREATEDATE
  is '创建日期';
comment on column HOUSINGINFO.UPDATEDATE
  is '更新日期';

create table BUILDINGDATAS
(
  ID      		  NUMBER(10) not null,
  BUILDINGID      VARCHAR2(30) not null,
  ORGID           NUMBER(10) not null,
  ORGINTERNALCODE VARCHAR2(32) not null,
  BUILDINGNAME    VARCHAR2(150),
  BUILDINGADDRESS VARCHAR2(150),
  CENTERX         NUMBER(10) not null,
  CENTERY         NUMBER(10) not null,
  FULLPINYIN      VARCHAR2(30),
  SIMPLEPINYIN    VARCHAR2(10),
  CREATEUSER      VARCHAR2(32) not null,
  UPDATEUSER      VARCHAR2(32),
  CREATEDATE      DATE not null,
  UPDATEDATE      DATE,
  constraint pkBuildingDatas primary key (id),
  constraint fkBuildingDatasOrg foreign key (orgId)
         references organizations (id)
);
comment on table BUILDINGDATAS
  is '楼宇信息表';
comment on column BUILDINGDATAS.BUILDINGID
  is '楼宇ID';
comment on column BUILDINGDATAS.ORGID
  is '所属网格';
comment on column BUILDINGDATAS.ORGINTERNALCODE
  is '所属网格编号';
comment on column BUILDINGDATAS.BUILDINGNAME
  is '楼宇名称';
comment on column BUILDINGDATAS.BUILDINGADDRESS
  is '楼宇地址';
comment on column BUILDINGDATAS.CENTERX
  is '楼宇中心坐标X';
comment on column BUILDINGDATAS.CENTERY
  is '楼宇中心坐标Y';
comment on column BUILDINGDATAS.FULLPINYIN
  is '全拼';
comment on column BUILDINGDATAS.SIMPLEPINYIN
  is '简拼';
comment on column BUILDINGDATAS.CREATEUSER
  is '创建用户';
comment on column BUILDINGDATAS.UPDATEUSER
  is '修改用户';
comment on column BUILDINGDATAS.CREATEDATE
  is '创建日期';
comment on column BUILDINGDATAS.UPDATEDATE
  is '修改时间';


create table DESKTOPMENU
(
  ID            NUMBER(10) not null,
  USERID        NUMBER(10),
  PERMISSIONID  NUMBER(10),
  INDEXID       NUMBER(10),
  PAGE          NUMBER(10),
  MENUTYPE      NUMBER(2),
  IMGURL        VARCHAR2(300),
  URL           VARCHAR2(300),
  NAME          VARCHAR2(300),
  WIDTH         NUMBER(20),
  HEIGHT        NUMBER(20),
  ENAME         VARCHAR2(300),
  ISUSERDEFINED NUMBER(1) default 0,
  PARENTID      NUMBER(10),
  constraint pkDesktopMenus primary key (id)
);

comment on table DesktopMenu
  is '桌面菜单表';
comment on column DesktopMenu.USERID
  is '用户ID';
comment on column DesktopMenu.PERMISSIONID
  is '权限ID';
comment on column DesktopMenu.INDEXID
  is '序号';
comment on column DesktopMenu.PAGE
  is '页码';
comment on column DesktopMenu.MENUTYPE
  is '菜单类型，文件夹：1，菜单：0';

/*==============================================================*/
/* Table: NurturesWomen                                         */
/*==============================================================*/
create table NURTURESWOMEN 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(50),
   FERTILITYSERVICESNO  VARCHAR2(150),
   MARRIAGEREGISTRATIONTIME DATE,
   ONECHILDOFCOUPLE     NUMBER(10),
   LICENSESITUATION     NUMBER(10),
   BOYNUMBER            NUMBER(2),
   GIRLNUMBER           NUMBER(2),
   LICENSETIME          DATE,
   CONTRACEPTIVEMETHOD  VARCHAR2(150),
   CONTRACEPTIVETIME    DATE,
   MANNAME              VARCHAR2(60),
   MARRIAGEORDIVORCETIME DATE,
   MANMARITALSTATE      NUMBER(10),
   MANIDCARDNO          VARCHAR2(60),
   MANFIRSTMARRIAGETIME DATE,
   MANMOBILENUMBER      VARCHAR2(50),
   MANTELEPHONE         VARCHAR2(80),
   MANBIRTHDAY          DATE,
   MANNATION            NUMBER(10),
   MANPOLITICALBACKGROUND NUMBER(10),
   MANRESIDENCETYPE     NUMBER(10),
   MANSCHOOLING         NUMBER(10),
   MANCAREER            NUMBER(10),
   MANWORKUNIT          VARCHAR2(150),
   MANPROVINCE          VARCHAR2(60),
   MANCITY              VARCHAR2(60),
   MANDISTRICT          VARCHAR2(60),
   MANNATIVEPLACEADDRESS VARCHAR2(60),
   MANCURRENTADDRESS    VARCHAR2(150),
   MANCURRENTADDRESSTYPE NUMBER(10),
   MANCOMMUNITY         VARCHAR2(60),
   MANBLOCK             VARCHAR2(24),
   MANUNIT              VARCHAR2(18),
   MANROOM              VARCHAR2(30),
   MANREMARK            VARCHAR2(900),
   SINGLECHILDCARDNO    VARCHAR2(150),
   CERTIFIEDUNIT        VARCHAR2(150),
   ISUNMARRIEDPREGNANT  NUMBER(1),
   ISLEVIED             NUMBER(1),
   ISMATERNITYCARD      NUMBER(1),
   MATERNITYCARDUNIT    VARCHAR2(60),
   MATERNITYCARDNO      VARCHAR2(90),
   MATERNITYCARDISSUETIME DATE,
   MATERNITYCARDVALIDITYTIME DATE,
   MATERNITYCARDCHECKTIME DATE,
   MATERNITYCARDREMARK  VARCHAR2(900),
   PREGNANTPHOTO        VARCHAR2(200),
   PREGNANTHEALTHSTATUS VARCHAR2(10),
   PREGNANTMOTHERHOUSE  VARCHAR2(150),
   HUSBANDHEALTHSTATUS  VARCHAR2(10),
   CONCEPTIONCONTROLDATE DATE,
   PAUSIMENIADATE       DATE,
   ISSIGNCOMPACT        NUMBER               default 0,
   CHILDCOUNT           NUMBER,
   DRAWLETTERCONDITION  NUMBER,
   CANCELDATE           DATE,
   ISCANCEL             NUMBER               default 0,
   CANCELREASON         VARCHAR2(4000),
   PERSONTYPE           VARCHAR2(10),
   RESIDENCENUMBER      VARCHAR2(32),
   HOUSEMASTERNAME      VARCHAR2(20),
   HOUSEMASTERRELATION  VARCHAR2(10),
   SINGLECHILDCDISSUETIME DATE,
   FIRSTMARRIAGETIME    DATE,
   ISDELETE             NUMBER(1)            default 0,
   RESIDENCETYPE        NUMBER(10),
   OLDCURRENTADDRESS    VARCHAR2(150),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(60)         not null,
   UPDATEUSER           VARCHAR2(60),
   CREATEDATE           DATE                 not null,
   UPDATEDATE           DATE,
   constraint PKNURTURESWOMEN primary key (ID),
   constraint FKNURTURESWOMENORG foreign key (ORGID)
   references ORGANIZATIONS (ID)
);

comment on table NURTURESWOMEN is
'育妇对象表';

comment on column NURTURESWOMEN.ORGID is
'所属网格';

comment on column NURTURESWOMEN.ORGINTERNALCODE is
'部门内部编号';

comment on column NURTURESWOMEN.FERTILITYSERVICESNO is
'生育服务证号';

comment on column NURTURESWOMEN.MARRIAGEREGISTRATIONTIME is
'离婚时间';

comment on column NURTURESWOMEN.ONECHILDOFCOUPLE is
'夫妻双方独生子女情况';

comment on column NURTURESWOMEN.LICENSESITUATION is
'领证情况';

comment on column NURTURESWOMEN.BOYNUMBER is
'男孩数';

comment on column NURTURESWOMEN.GIRLNUMBER is
'女孩数';

comment on column NURTURESWOMEN.LICENSETIME is
'领证时间';

comment on column NURTURESWOMEN.CONTRACEPTIVEMETHOD is
'避孕方法';

comment on column NURTURESWOMEN.CONTRACEPTIVETIME is
'避孕起始时间';

comment on column NURTURESWOMEN.MANNAME is
'丈夫姓名';

comment on column NURTURESWOMEN.MARRIAGEORDIVORCETIME is
'最近再婚时间';

comment on column NURTURESWOMEN.MANMARITALSTATE is
'丈夫婚姻状况';

comment on column NURTURESWOMEN.MANIDCARDNO is
'丈夫身份证号码';

comment on column NURTURESWOMEN.MANFIRSTMARRIAGETIME is
'丈夫初婚时间';

comment on column NURTURESWOMEN.MANMOBILENUMBER is
'丈夫联系手机';

comment on column NURTURESWOMEN.MANTELEPHONE is
'丈夫固定电话';

comment on column NURTURESWOMEN.MANBIRTHDAY is
'丈夫出生日期';

comment on column NURTURESWOMEN.MANNATION is
'丈夫民族';

comment on column NURTURESWOMEN.MANPOLITICALBACKGROUND is
'丈夫政治面貌';

comment on column NURTURESWOMEN.MANRESIDENCETYPE is
'丈夫户口类型';

comment on column NURTURESWOMEN.MANSCHOOLING is
'丈夫文化程度';

comment on column NURTURESWOMEN.MANCAREER is
'丈夫职业';

comment on column NURTURESWOMEN.MANWORKUNIT is
'丈夫工作单位或就读学校';

comment on column NURTURESWOMEN.MANPROVINCE is
'丈夫户籍地 省';

comment on column NURTURESWOMEN.MANCITY is
'丈夫户籍地 市';

comment on column NURTURESWOMEN.MANDISTRICT is
'丈夫户籍地 区县';

comment on column NURTURESWOMEN.MANNATIVEPLACEADDRESS is
'丈夫户籍地详址';

comment on column NURTURESWOMEN.MANCURRENTADDRESS is
'丈夫常住地址';

comment on column NURTURESWOMEN.MANCURRENTADDRESSTYPE is
'丈夫常住地址类型';

comment on column NURTURESWOMEN.MANCOMMUNITY is
'丈夫常住地址 商品房 小区';

comment on column NURTURESWOMEN.MANBLOCK is
'丈夫常住地址 商品房 幢';

comment on column NURTURESWOMEN.MANUNIT is
'丈夫常住地址 商品房  单元';

comment on column NURTURESWOMEN.MANROOM is
'丈夫常住地址 商品房 室';

comment on column NURTURESWOMEN.MANREMARK is
'丈夫备注';

comment on column NURTURESWOMEN.SINGLECHILDCARDNO is
'独生子女证号';

comment on column NURTURESWOMEN.CERTIFIEDUNIT is
'发证单位';

comment on column NURTURESWOMEN.ISUNMARRIEDPREGNANT is
'是否未婚先孕';

comment on column NURTURESWOMEN.ISLEVIED is
'是否征收';

comment on column NURTURESWOMEN.ISMATERNITYCARD is
'是否有婚育证';

comment on column NURTURESWOMEN.MATERNITYCARDUNIT is
'孕育证发证单位';

comment on column NURTURESWOMEN.MATERNITYCARDNO is
'证书编号';

comment on column NURTURESWOMEN.MATERNITYCARDISSUETIME is
'发放证书时间';

comment on column NURTURESWOMEN.MATERNITYCARDVALIDITYTIME is
'孕育证有效期';

comment on column NURTURESWOMEN.MATERNITYCARDCHECKTIME is
'查验时间';

comment on column NURTURESWOMEN.MATERNITYCARDREMARK is
'查验情况';

comment on column NURTURESWOMEN.PREGNANTPHOTO is
'照片';

comment on column NURTURESWOMEN.PREGNANTHEALTHSTATUS is
'健康状况';

comment on column NURTURESWOMEN.PREGNANTMOTHERHOUSE is
'娘家地址';

comment on column NURTURESWOMEN.HUSBANDHEALTHSTATUS is
'丈夫健康状况';

comment on column NURTURESWOMEN.CONCEPTIONCONTROLDATE is
'节育年月';

comment on column NURTURESWOMEN.PAUSIMENIADATE is
'绝经年月';

comment on column NURTURESWOMEN.ISSIGNCOMPACT is
'已签订计生合同';

comment on column NURTURESWOMEN.CHILDCOUNT is
'现有子女数';

comment on column NURTURESWOMEN.DRAWLETTERCONDITION is
'独生证领证情况';

comment on column NURTURESWOMEN.CANCELDATE is
'注销年月';

comment on column NURTURESWOMEN.ISCANCEL is
'是否注销';

comment on column NURTURESWOMEN.CANCELREASON is
'注销原因';

comment on column NURTURESWOMEN.PERSONTYPE is
'人户状况';

comment on column NURTURESWOMEN.RESIDENCENUMBER is
'户口簿号';

comment on column NURTURESWOMEN.HOUSEMASTERNAME is
'户主姓名';

comment on column NURTURESWOMEN.HOUSEMASTERRELATION is
'与户主关系';

comment on column NURTURESWOMEN.FIRSTMARRIAGETIME is
'初婚时间';

comment on column NURTURESWOMEN.ISDELETE is
'是否删除';

comment on column NURTURESWOMEN.RESIDENCETYPE is
'户口类型';

comment on column NURTURESWOMEN.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column NURTURESWOMEN.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column NURTURESWOMEN.ISEMPHASIS is
'是否关注';

comment on column NURTURESWOMEN.CREATEUSER is
'创建用户';

comment on column NURTURESWOMEN.UPDATEUSER is
'修改用户';

comment on column NURTURESWOMEN.CREATEDATE is
'创建时间';

comment on column NURTURESWOMEN.UPDATEDATE is
'修改时间';

/*==============================================================*/
/* Index: idx_ai_orgIntCodeAndisEmphasis                        */
/*==============================================================*/
create index idx_nu_orgIntCodeAndisEmphasis on nurturesWomen (
   orgInternalCode ASC,
   isEmphasis ASC
);

 


/*==============================================================*/
/* Table: aidNeedPopulation                                            */
/*==============================================================*/
create table AIDNEEDPOPULATION 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32),
   AIDREASON            NUMBER(10),
   ISLOWHOUSEHOLDS      NUMBER(1)            default 0,
   DIFFICULTCARDNO      VARCHAR2(90),
   DIFFICULTTYPE        NUMBER(10),
   SUBSIDIESAMOUNT      NUMBER(10,4),
   SUBSIDIESGETTIME     DATE,
   SUBSIDIESSTARTTIME   DATE,
   SUBSIDIESPOPULATION  NUMBER(3),
   SUBSIDIESAREA        VARCHAR2(150),
   OLDCURRENTADDRESS    VARCHAR2(150),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                 not null,
   UPDATEDATE           DATE,
   constraint PKAIDNEEDPOPULATION primary key (ID),
   constraint fkAidNeedPopulationOrg foreign key (orgId)
         references organizations (id)
);

comment on table AIDNEEDPOPULATION is
'需救助人员';

comment on column AIDNEEDPOPULATION.ORGID is
'所属网格';

comment on column AIDNEEDPOPULATION.ORGINTERNALCODE is
'所属网格编号';

comment on column AIDNEEDPOPULATION.AIDREASON is
'救助原因';

comment on column AIDNEEDPOPULATION.ISLOWHOUSEHOLDS is
'是否低保户';

comment on column AIDNEEDPOPULATION.DIFFICULTCARDNO is
'困难证号';

comment on column AIDNEEDPOPULATION.DIFFICULTTYPE is
'困难类型';

comment on column AIDNEEDPOPULATION.SUBSIDIESAMOUNT is
'领取金额';

comment on column AIDNEEDPOPULATION.SUBSIDIESGETTIME is
'领取时间';

comment on column AIDNEEDPOPULATION.SUBSIDIESSTARTTIME is
'享受起始时间';

comment on column AIDNEEDPOPULATION.SUBSIDIESPOPULATION is
'享受人数';

comment on column AIDNEEDPOPULATION.SUBSIDIESAREA is
'享受地区';

comment on column AIDNEEDPOPULATION.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column AIDNEEDPOPULATION.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column AIDNEEDPOPULATION.ISEMPHASIS is
'是否关注';

comment on column AIDNEEDPOPULATION.CREATEUSER is
'创建用户';

comment on column AIDNEEDPOPULATION.UPDATEUSER is
'修改用户';

comment on column AIDNEEDPOPULATION.CREATEDATE is
'创建日期';

comment on column AIDNEEDPOPULATION.UPDATEDATE is
'修改时间';



/*==============================================================*/
/* Index: idx_ai_orgIntCodeAndisEmphasis                        */
/*==============================================================*/
create index idx_ai_orgIntCodeAndisEmphasis on aidNeedPopulation (
   orgInternalCode ASC,
   isEmphasis ASC
);
/*==============================================================*/
/* Table: HOUSEHASIMPORTANTPOPULATION                                            */
/*==============================================================*/
create table HOUSEHASIMPORTANTPOPULATION(
  PERSONTYPE     VARCHAR2(100) not null,
  POPULATIONTYPE VARCHAR2(100) not null,
  HOUSEID        NUMBER(10) not null,
  POPULATIONID   NUMBER(10) not null,
  DEFAULTLIVINGHOUSE NUMBER(1) default 0 not null
);

comment on column HOUSEHASIMPORTANTPOPULATION.PERSONTYPE
  is '人员大类';
comment on column HOUSEHASIMPORTANTPOPULATION.POPULATIONTYPE
  is '人员类型';
comment on column HOUSEHASIMPORTANTPOPULATION.HOUSEID
  is '住房id';
comment on column HOUSEHASIMPORTANTPOPULATION.POPULATIONID
  is '某类人员的id';
comment on column HOUSEHASIMPORTANTPOPULATION.DEFAULTLIVINGHOUSE
  is '是否将该居住信息应用于人员信息';

/*==============================================================*/
/* Table: HOUSEHASACTUALPOPULATION                                            */
/*==============================================================*/
create table HOUSEHASACTUALPOPULATION(
  PERSONTYPE         VARCHAR2(100) not null,
  POPULATIONTYPE     VARCHAR2(100) not null,
  HOUSEID            NUMBER(10) not null,
  POPULATIONID       NUMBER(15) not null,
  DEFAULTLIVINGHOUSE NUMBER(1) default 0 not null
);

comment on column HOUSEHASACTUALPOPULATION.PERSONTYPE
  is '人员大类';
comment on column HOUSEHASACTUALPOPULATION.POPULATIONTYPE
  is '人员类型';
comment on column HOUSEHASACTUALPOPULATION.HOUSEID
  is '住房id';
comment on column HOUSEHASACTUALPOPULATION.POPULATIONID
  is '某类人员的id';
comment on column HOUSEHASACTUALPOPULATION.DEFAULTLIVINGHOUSE
  is '是否将该居住信息应用于人员信息';

-- Create table
create table RESIDENTPOPULATIONS
(
  ID            NUMBER(10),
  IDCARD        VARCHAR2(20),
  PERSONNAME    VARCHAR2(100),
  PERSONSEX     VARCHAR2(10),
  HOMEADDRESS   VARCHAR2(500),
  SERVICEPLACES VARCHAR2(500),
  PERSONNALINFO VARCHAR2(100)
);

-- Add comments to the table
comment on table RESIDENTPOPULATIONS
  is '公安常住人口初始化库';
-- Add comments to the columns
comment on column RESIDENTPOPULATIONS.ID
  is '物理主键';
comment on column RESIDENTPOPULATIONS.IDCARD
  is '身份证号码';
comment on column RESIDENTPOPULATIONS.PERSONNAME
  is '人员姓名';
comment on column RESIDENTPOPULATIONS.PERSONSEX
  is '人员性别';
comment on column RESIDENTPOPULATIONS.HOMEADDRESS
  is '户籍地';
comment on column RESIDENTPOPULATIONS.SERVICEPLACES
  is '服务处所';
comment on column RESIDENTPOPULATIONS.PERSONNALINFO
  is '人员属性';

create sequence s_actualCompany
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 99999999999;

/*==============================================================*/
/* Table: ActualCompany                                         */
/*==============================================================*/
create table ACTUALCOMPANY(
  ID                      NUMBER(10) not null,
  ORGID                   NUMBER(10) not null,
  ORGINTERNALCODE         VARCHAR2(50),
  COMPANYNAME             VARCHAR2(150) not null,
  addressId                NUMBER(10),
  COMPANYADDRESS          VARCHAR2(150),
  COMPANYTYPE             NUMBER(10),
  ISKEY                   NUMBER(1) default 0,
  CORPORATEREPRESENTATIVE VARCHAR2(150),
  IDCARDNO                VARCHAR2(60),
  TELEPHONE               VARCHAR2(80),
  FACSIMILE               VARCHAR2(150),
  BUSINESSLICENSENO       VARCHAR2(150),
  ORGCODE                 VARCHAR2(150)  not null,
  REGISTEREDCAPITAL       NUMBER(10,4),
  ECONOMICNATURE         NUMBER(10),
  EXPIRYDATE              DATE,
  REGISTRATIONDATE        DATE,
  BUSINESSSCOPE           VARCHAR2(150),
  REGISTRATIONADDRESS     VARCHAR2(150),
  EMPLOYEESNUM            NUMBER(10),
  COMPETENTDEPARTMENT     VARCHAR2(90),
  SUPERVISORYLEVEL        NUMBER(10),
  SUPERVISORYDEPARTMENT   VARCHAR2(90),
  FIREFIGHTINGLEVEL       NUMBER(10),
  SECURITYCHIEF           VARCHAR2(150),
  REMARK                  VARCHAR2(900),
  FULLPINYIN              VARCHAR2(150),
  SIMPLEPINYIN            VARCHAR2(90),
  IMGURL                  VARCHAR2(300),
  CREATEUSER              VARCHAR2(60),
  CREATEDATE              DATE,
  UPDATEUSER              VARCHAR2(60),
  UPDATEDATE              DATE,
  ISEMPHASIS              NUMBER(1) default 1,
  logOutTime              DATE,
  logOutReason            VARCHAR2(300),
  keyName                 VARCHAR2(150),
  policeNumber            NUMBER(10),
  position                VARCHAR2(150),
  importantFacilities     VARCHAR2(150),
  convoyNumber            NUMBER(10),
  economicValue           NUMBER(10,4),
  securityNumber          NUMBER(10),
  staffNumber             NUMBER(10),
  classicsAlarmNumber     NUMBER(10),
  keyPhone                VARCHAR2(80),
  location                VARCHAR2(150),
  defendEstablishment     VARCHAR2(600),
  chief                   VARCHAR2(150),
  chiefIdNumber           VARCHAR2(60),
  relevantSafety          VARCHAR2(150),
  safetyMeasures          VARCHAR2(90),
  civilMeasures           VARCHAR2(90),
  thingMeasures           VARCHAR2(90),
  dogMeasures             VARCHAR2(90),
  judgementBasis          VARCHAR2(90),
  safetyMeasuresFunds     NUMBER(10,4),
  buildingId      		  VARCHAR2(30),
  centerX 				  NUMBER(10),
  centerY 				  NUMBER(10),
  facilitiesName          VARCHAR2(150),
  facilitiesCategory      NUMBER(10),
  installationTime         DATE,
  investmentAmount        NUMBER(10,4),
  installationPosition    VARCHAR2(90),
  securityClassification  NUMBER(10),
  canLose                 NUMBER(1) default 0,
  connectedDepartment     VARCHAR2(90),
  coverageArea            VARCHAR2(90),
  keepDays                NUMBER(10),
  storageWays             VARCHAR2(90),
  camerasNumber           NUMBER(10),
  configurationDescribe   VARCHAR2(600),
  intrusionDetectorNumber NUMBER(10),
  builddatasid  NUMBER(10),
   SOURCESSTATE NUMBER(1)  default 1 ,
   constraint pkactualCompany primary key (id),
   constraint fkactualCompany foreign key (orgId)
         references organizations (id)
);

comment on table ACTUALCOMPANY
  is '实有单位';

comment on column ACTUALCOMPANY.ORGID
  is '所属网格';

comment on column ACTUALCOMPANY.ORGINTERNALCODE
  is '部门内部编号';

comment on column ACTUALCOMPANY.COMPANYNAME
  is '单位名称';

comment on column ACTUALCOMPANY.COMPANYADDRESS
  is '单位地址';

comment on column ACTUALCOMPANY.COMPANYTYPE
  is '单位类别';

comment on column ACTUALCOMPANY.ISKEY
  is '是否重点单位';

comment on column ACTUALCOMPANY.CORPORATEREPRESENTATIVE
  is '法人代表';

comment on column ACTUALCOMPANY.IDCARDNO
  is '身份证号码';

comment on column ACTUALCOMPANY.TELEPHONE
  is '单位电话';

comment on column ACTUALCOMPANY.FACSIMILE
  is '单位传真';

comment on column ACTUALCOMPANY.BUSINESSLICENSENO
  is '营业执照号码';

comment on column ACTUALCOMPANY.ORGCODE
  is '组织机构代码';

comment on column ACTUALCOMPANY.REGISTEREDCAPITAL
  is '注册资本';

comment on column ACTUALCOMPANY.ECONOMICNATURE
  is '经济性质';

comment on column ACTUALCOMPANY.EXPIRYDATE
  is '有效期至';

comment on column ACTUALCOMPANY.REGISTRATIONDATE
  is '注册日期';

comment on column ACTUALCOMPANY.BUSINESSSCOPE
  is '经营范围';

comment on column ACTUALCOMPANY.REGISTRATIONADDRESS
  is '注册地址';

comment on column ACTUALCOMPANY.EMPLOYEESNUM
  is '从业人数';

comment on column ACTUALCOMPANY.COMPETENTDEPARTMENT
  is '主管部门';

comment on column ACTUALCOMPANY.SUPERVISORYLEVEL
  is '管理级别';

comment on column ACTUALCOMPANY.SUPERVISORYDEPARTMENT
  is '管理部门';

comment on column ACTUALCOMPANY.FIREFIGHTINGLEVEL
  is '消防等级';

comment on column ACTUALCOMPANY.SECURITYCHIEF
  is '治安负责人';

comment on column ACTUALCOMPANY.REMARK

  is '备注';

comment on column ACTUALCOMPANY.FULLPINYIN
  is '单位名称全拼';

comment on column ACTUALCOMPANY.SIMPLEPINYIN
  is '单位名称简拼';

comment on column ACTUALCOMPANY.IMGURL
  is '头像路径';

comment on column ACTUALCOMPANY.CREATEUSER
  is '创建用户';

comment on column ACTUALCOMPANY.CREATEDATE
  is '创建时间';

comment on column ACTUALCOMPANY.UPDATEUSER
  is '修改用户';

comment on column ACTUALCOMPANY.UPDATEDATE
  is '修改时间';

comment on column ACTUALCOMPANY.ISEMPHASIS
  is '是否注销';

comment on column ACTUALCOMPANY.logOutTime
  is '注销时间';

comment on column ACTUALCOMPANY.logOutReason
  is '注销原因';
  
comment on column ACTUALCOMPANY.builddatasid is
'楼宇id';

/*==============================================================*/
/* Index: idx_operateLogs_operateTime                             */
/*==============================================================*/
create index idx_ac_orgIdAndCompanyName on ACTUALCOMPANY (
   orgId ASC,
   COMPANYNAME ASC
);


create sequence s_publicPlace
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

/*==============================================================*/
/* Table: publicPlaces                                          */
/*==============================================================*/
create table publicPlace (
	id                   NUMBER(10)                      not null,
	orgId                NUMBER(10)                      not null,
	orgInternalCode      VARCHAR2(32)                    not null,
	placeName      		 VARCHAR2(150)  				 not null,
	placeAddress         VARCHAR2(150)  				 not null,
	manager           	 VARCHAR2(60),
	licenseDate      	 DATE,
	openingDate      	 DATE,
	category    	     VARCHAR2(60),
	registrationNumber   VARCHAR2(150),
	placeLevel  		 VARCHAR2(60),
	buildingStructure    VARCHAR2(60),
	totalArea     		 NUMBER(10,2),
	operationArea 		 NUMBER(10,2),
	cloakroom  			 NUMBER(10),
	vouchedPeopleCount   NUMBER(10),
	privateRoomCount     NUMBER(10),
	surrounding          VARCHAR2(450),
	passageway  		 VARCHAR2(90),
	innerStructure  	 VARCHAR2(60),
	logOutReason         VARCHAR2(150),
	isEmphasis    		 NUMBER(1)   	           	    default 0,
	logOutTime  		 DATE,
	remark     			 VARCHAR2(900),
	imgUrl               VARCHAR2(300),
	fullPinyin           VARCHAR2(30),
    simplePinyin         VARCHAR2(10),
    createUser           VARCHAR2(32)                    not null,
    updateUser           VARCHAR2(32),
    createDate           DATE                            not null,
    buildingId      	 VARCHAR2(30),
    centerX 			 NUMBER(10),
    centerY 			 NUMBER(10),
    updateDate           DATE,
    attentionExtent      NUMBER(10),
     SOURCESSTATE NUMBER(1)  default 1 ,
	constraint			 pkPublicPlace primary key(id),
	constraint			 fkPublicPlace foreign key(orgId)
		references organizations(id)
);
comment on table publicPlace is
'公共场所信息';
comment on column publicPlace.id is
'公共场所Id';
comment on column publicPlace.orgId is
'所属网格';
comment on column publicPlace.orgInternalCode is
'所属责任区编号';
comment on column publicPlace.placeName is
'场所名称';
comment on column publicPlace.placeAddress is
'场所地址';
comment on column publicPlace.manager is
'负责人';
comment on column publicPlace.LicenseDate is
'领取执照时间';
comment on column publicPlace.openingDate is
'开业时间';
comment on column publicPlace.category is
'公共产所类别';
comment on column publicPlace.registrationNumber is
'备案登记号码';
comment on column publicPlace.placeLevel is
'场所等级';
comment on column publicPlace.buildingStructure is
'建筑物结构';
comment on column publicPlace.totalArea is
'总面积';
comment on column publicPlace.operationArea is
'营业面积';
comment on column publicPlace.cloakroom is
'小件寄存处';
comment on column publicPlace.vouchedPeopleCount is
'核定人数';
comment on column publicPlace.privateRoomCount is
'包间数';
comment on column publicPlace.surrounding is
'周围环境';
comment on column publicPlace.passageway is
'通道口';
comment on column publicPlace.innerStructure is
'内部结构';
comment on column publicPlace.logOutReason is
'注销时间';
comment on column publicPlace.isEmphasis is
'注销标识';
comment on column publicPlace.logOutTime is
'注销时间';
comment on column publicPlace.remark is
'备注';
comment on column publicPlace.attentionExtent is
'关注程度：1.一般；2.中等；3.严重';


/*==============================================================*/
/* Index: idx_in_orgIdAndPlaceName                    */
/*==============================================================*/
create unique index idx_pu_orgIdAndPlaceName on publicPlace (
   orgId ASC,
   placeName ASC
);

 
 create sequence s_publicComplexPlaces
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

/*==============================================================*/
/* Table: publicComplexPlaces                                          */
/*==============================================================*/
create table publicComplexPlaces (
	id                   NUMBER(10)                      not null,
	orgId                NUMBER(10)                      not null,
	orgInternalCode      VARCHAR2(32)                    not null,
	placeName      		 VARCHAR2(150)  				 not null,
	placeAddress         VARCHAR2(150)  				 not null,
	manager		 		 VARCHAR2(32),
	managerMobile 		 VARCHAR2(30),
	managerTelephone  	 VARCHAR2(30),
	type				 NUMBER(10),
	detailedType		 NUMBER(10),
	hiddenCases          VARCHAR2(300),
	hiddenRectification  VARCHAR2(300),
	logOutReason         VARCHAR2(150),
	isEmphasis    		 NUMBER(1)   	           	    default 0,
	logOutTime  		 DATE,
	remark     			 VARCHAR2(900),
	imgUrl               VARCHAR2(300),
	fullPinyin           VARCHAR2(30),
    simplePinyin         VARCHAR2(10),
    createUser           VARCHAR2(32)                    not null,
    updateUser           VARCHAR2(32),
    createDate           DATE                            not null,
    buildingId      	 VARCHAR2(30),
    centerX 			 NUMBER(10),
    centerY 			 NUMBER(10),
    updateDate           DATE,
    attentionExtent      NUMBER(10),
    SOURCESSTATE NUMBER(1)  default 1 ,
	constraint			 pkPublicComplexPlace primary key(id),
	constraint			 fkPublicComplexPlace foreign key(orgId)
		references organizations(id)
);
comment on table publicComplexPlaces is
'公共复杂场所信息';
comment on column publicComplexPlaces.id is
'公共复杂场所Id';
comment on column publicComplexPlaces.orgId is
'所属网格';
comment on column publicComplexPlaces.orgInternalCode is
'所属责任区编号';
comment on column publicComplexPlaces.placeName is
'场所名称';
comment on column publicComplexPlaces.placeAddress is
'场所地址';
comment on column publicComplexPlaces.manager is
'负责人';
comment on column publicComplexPlaces.managerMobile is
'负责人手机';
comment on column publicComplexPlaces.managerTelephone is
'负责人电话';
comment on column publicComplexPlaces.type is
'公共复杂场所类别';
comment on column publicComplexPlaces.detailedType is
'公共复杂场所细类';
comment on column publicComplexPlaces.hiddenCases is
'存在隐患';
comment on column publicComplexPlaces.hiddenRectification is
'隐患整改情况';
comment on column publicComplexPlaces.logOutReason is
'注销时间';
comment on column publicComplexPlaces.isEmphasis is
'注销标识';
comment on column publicComplexPlaces.logOutTime is
'注销时间';
comment on column publicComplexPlaces.remark is
'备注';
comment on column publicComplexPlaces.attentionExtent is
'关注程度：1.一般；2.中等；3.严重';


/*==============================================================*/
/* Index: idx_pcp_orgIdAndPlaceName                    */
/*==============================================================*/
create unique index idx_pcp_orgIdAndPlaceName on publicComplexPlaces (
   orgId ASC,
   placeName ASC
);


/* Table: dangerousChemicalsUnit                                               */
/*==============================================================*/
create table dangerousChemicalsUnit  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   unitName             VARCHAR2(60),
   unitAddress          VARCHAR2(150),
   superintendent       VARCHAR2(60),
   telephone            VARCHAR2(80),
   unitType             VARCHAR2(150),
   commodityType        VARCHAR2(150),
   copyScope            VARCHAR2(150),
   storageDevice        VARCHAR2(150),
   isEmphasis           NUMBER(1)                       default 0,
   logOutReason         VARCHAR2(60),
   logOutTime           DATE,
   remark               VARCHAR2(900),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   buildingId      		VARCHAR2(30),
   centerX 				NUMBER(10),
   centerY 				NUMBER(10),
   imgUrl               VARCHAR2(300),
   attentionExtent      NUMBER(10),
    SOURCESSTATE NUMBER(1)  default 1 ,
   constraint pkDangerousChemicalsUnit primary key (id),
   constraint fkDangerousChemicalsUnitOrg foreign key (orgId)
         references organizations (id)
);

comment on table dangerousChemicalsUnit is
'危险化学品单位';

comment on column dangerousChemicalsUnit.id is
'危险化学品单位id';

comment on column dangerousChemicalsUnit.orgId is
'所属网格';

comment on column dangerousChemicalsUnit.unitName is
'单位名称';

comment on column dangerousChemicalsUnit.unitAddress is
'单位地址';

comment on column dangerousChemicalsUnit.superintendent is
'负责人';

comment on column dangerousChemicalsUnit.telephone is
'联系电话';

comment on column dangerousChemicalsUnit.unitType is
'单位类别';

comment on column dangerousChemicalsUnit.commodityType is
'货物类别';

comment on column dangerousChemicalsUnit.copyScope is
'副本许可范围';

comment on column dangerousChemicalsUnit.storageDevice is
'存储设备';

comment on column dangerousChemicalsUnit.storageDevice is
'存储设备';

comment on column dangerousChemicalsUnit.isEmphasis is
'注销标志';

comment on column dangerousChemicalsUnit.logOutReason is
'注销原因';

comment on column dangerousChemicalsUnit.logOutTime is
'注销时间';

comment on column dangerousChemicalsUnit.createUser is
'创建用户';

comment on column dangerousChemicalsUnit.updateUser is
'修改用户';

comment on column dangerousChemicalsUnit.createDate is
'创建日期';

comment on column dangerousChemicalsUnit.updateDate is
'修改时间';

comment on column dangerousChemicalsUnit.remark is
'备注';

comment on column dangerousChemicalsUnit.attentionExtent is
'关注程度：1.一般；2.中等；3.严重';


/* Table: undergroundSpaces                                               */
/*==============================================================*/
create table undergroundSpaces  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   unitName             VARCHAR2(60),
   unitAddress          VARCHAR2(150),
   superintendent       VARCHAR2(60),
   telephone            VARCHAR2(80),
   unitType             VARCHAR2(150),
   commodityType        VARCHAR2(150),
   copyScope            VARCHAR2(150),
   storageDevice        VARCHAR2(150),
   isEmphasis           NUMBER(1)                       default 0,
   logOutReason         VARCHAR2(60),
   logOutTime           DATE,
   remark               VARCHAR2(900),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   constraint pkUndergroundSpace primary key (id),
   constraint fkUndergroundSpaceOrg foreign key (orgId)
         references organizations (id)
);

comment on table undergroundSpaces is
'地下空间';

comment on column undergroundSpaces.id is
'地下空间id';

comment on column undergroundSpaces.orgId is
'所属网格';

comment on column undergroundSpaces.unitName is
'单位名称';

comment on column undergroundSpaces.unitAddress is
'单位地址';

comment on column undergroundSpaces.superintendent is
'负责人';

comment on column undergroundSpaces.telephone is
'联系电话';

comment on column undergroundSpaces.unitType is
'单位类别';

comment on column undergroundSpaces.commodityType is
'货物类别';

comment on column dangerousChemicalsUnit.copyScope is
'副本许可范围';

comment on column undergroundSpaces.storageDevice is
'存储设备';

comment on column undergroundSpaces.storageDevice is
'存储设备';

comment on column undergroundSpaces.isEmphasis is
'注销标志';

comment on column undergroundSpaces.logOutReason is
'注销原因';

comment on column undergroundSpaces.logOutTime is
'注销时间';

comment on column undergroundSpaces.createUser is
'创建用户';

comment on column undergroundSpaces.updateUser is
'修改用户';

comment on column undergroundSpaces.createDate is
'创建日期';

comment on column undergroundSpaces.updateDate is
'修改时间';

comment on column undergroundSpaces.remark is
'备注';




 create table partyConstructionFiles(
  ID                  NUMBER(10) not null,
  title               VARCHAR2(300) not null,
  ORGID               NUMBER(10) not null,
  orgInternalCode     VARCHAR2(32) ,
  FULLPINYIN          VARCHAR2(30),
  SIMPLEPINYIN        VARCHAR2(10),
  CREATEUSER          VARCHAR2(32) not null,
  CREATEDATE          DATE not null,
  UPDATEUSER          VARCHAR2(32),
  UPDATEDATE          DATE,
  url                 VARCHAR2(600),
  describe            VARCHAR2(600),
  categories          number(10),
  smallClass          number(10),
  fileName            VARCHAR2(300),
  fileSize            number(10),
  dalei               VARCHAR2(90),
  xiaolei             VARCHAR2(90),
  createUserRealName  VARCHAR2(32),
  author              VARCHAR2(32),
  content             clob,
	constraint pkpartyConstructionFiles primary key (id),
	constraint fkpartyConstructionFilesOrg foreign key (orgId)
		references organizations (id)
);


comment on column PARTYCONSTRUCTIONFILES.ID
  is 'id';
comment on column PARTYCONSTRUCTIONFILES.TITLE
  is '标题';
comment on column PARTYCONSTRUCTIONFILES.ORGID
  is '所属网格';
comment on column PARTYCONSTRUCTIONFILES.ORGINTERNALCODE
  is '所属网格编号';
comment on column PARTYCONSTRUCTIONFILES.FULLPINYIN
  is '全拼';
comment on column PARTYCONSTRUCTIONFILES.SIMPLEPINYIN
  is '简拼';
comment on column PARTYCONSTRUCTIONFILES.CREATEUSER
  is '创建用户';
comment on column PARTYCONSTRUCTIONFILES.CREATEDATE
  is '创建时间';
comment on column PARTYCONSTRUCTIONFILES.UPDATEUSER
  is '修改用户';
comment on column PARTYCONSTRUCTIONFILES.UPDATEDATE
  is '修改时间';
comment on column PARTYCONSTRUCTIONFILES.URL
  is '附件地址';
comment on column PARTYCONSTRUCTIONFILES.DESCRIBE
  is '附件描述';
comment on column PARTYCONSTRUCTIONFILES.CATEGORIES
  is '大类';
comment on column PARTYCONSTRUCTIONFILES.SMALLCLASS
  is '小类';

create sequence s_speech
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;


 /* Table: speech                                               */
/*==============================================================*/
create table speech  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   title                VARCHAR2(300)                   not null,
   content              VARCHAR2(4000)                 not null,
   speechType                 VARCHAR2(2)               not null,
   createUserRealName         varchar2(32)              not null,
   constraint pkSpeech primary key (id),
   constraint fkSpeechOrg foreign key (orgId)
         references organizations (id)
);

comment on table speech is
'心得和服务评价';

comment on column speech.id is
'心得和服务评价id';

comment on column speech.orgId is
'所属网格id';

comment on column speech.orgInternalCode is
'所属网格编号';

comment on column speech.title is
'标题';

comment on column speech.content is
'内容';

comment on column speech.speechType is
'类型';
comment on column speech.createUserRealName is
'创建者真实姓名';

create sequence s_news
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;


 /* Table: news                                               */
/*==============================================================*/
create table news  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   title                VARCHAR2(300)                   not null,
   subTitle                VARCHAR2(300)  ,
   keyWord                VARCHAR2(300)                   not null,
   content              VARCHAR2(4000)                 not null,
   author				VARCHAR2(32)					not null,
   publishUser			VARCHAR2(32)					not null,
   publishDate			DATE,
   newsType             VARCHAR2(10)     				not null,
   navigateWord			 VARCHAR2(300)  ,
   imgUrl				VARCHAR2(600),
   constraint pkNews primary key (id),
   constraint fkNewsOrg foreign key (orgId)
         references organizations (id)
);

comment on table news is
'新闻';

comment on column news.id is
'新闻id';

comment on column news.orgId is
'所属网格id';

comment on column news.orgInternalCode is
'所属网格编号';

comment on column news.title is
'标题';
comment on column news.subTitle is
'副标题';
comment on column news.keyWord is
'关键字';
comment on column news.author is
'作者';
comment on column news.publishUser is
'发布者';
comment on column news.publishDate is
'发布时间';
comment on column news.content is
'内容';
comment on column news.imgUrl is
'图片url';
comment on column news.newsType is
'新闻类型';

/* Table: dustbin                                               */
/*==============================================================*/
create table dustbin(
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   partType        NUMBER(10)                      not null,
   partName        NUMBER(10)                      not null,
   dustbinCode          VARCHAR2(60)                    not null,
   address              VARCHAR2(90),
   deptName             VARCHAR2(60)                   not null,
   hasVideo            NUMBER(1)              default 0,
   ownershipUnitName    VARCHAR2(60),
   maintenanceUnitName  VARCHAR2(60),
   remark        VARCHAR2(600),
   IMGURL               VARCHAR2(300),
   ISEMPHASIS           NUMBER(1)             default 0,
   logOutTime           DATE,
   logOutReason         VARCHAR2(300),
   centerLon            VARCHAR2(32),
   centerLat        VARCHAR2(32),
   centerLon2           VARCHAR2(32),
   centerLat2        VARCHAR2(32),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   sourcesState 		number(1) 			default 1,
   constraint pkdustbin primary key (id),
   constraint fkdustbinOrg foreign key (orgId)
         references organizations (id)
);

comment on table dustbin is
'部件信息';

comment on column dustbin.id is
'部件信息id';

comment on column dustbin.orgId is
'所属网格';

comment on column dustbin.dustbinCode is
'部件标识码';

comment on column dustbin.address is
'地址';

comment on column dustbin.hasVideo is
'是否有视频流';

comment on column dustbin.deptName is
'主管部门名称';

comment on column dustbin.ownershipUnitName is
'权属单位名称';

comment on column dustbin.maintenanceUnitName is
'养护单位名称';

comment on column dustbin.createUser is
'创建用户';

comment on column dustbin.updateUser is
'修改用户';

comment on column dustbin.createDate is
'创建日期';

comment on column dustbin.updateDate is
'修改时间';

comment on column dustbin.remark is
'备注';

comment on column dustbin.IMGURL is 
'图片路径';

comment on column dustbin.ISEMPHASIS is 
'是否注销';

comment on column dustbin.logOutTime is 
'注销时间';

comment on column dustbin.logOutReason is 
'注销原因';

comment on column dustbin.centerLon is 
'部件信息经度';

comment on column dustbin.centerLat is 
'部件信息纬度';

comment on column dustbin.sourcesState is 
'数据来源';


/* Table: oldTrees                                               */
/*==============================================================*/
create table oldTrees(
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   street          		VARCHAR2(50)                    not null,
   address              VARCHAR2(50)					not null,
   treeKinds          	VARCHAR2(20)					not null,
   treeNum              NUMBER(10)	                 	not null,
   treeHeight           NUMBER,
   mainCircumference    NUMBER,
   chestDiameter    	NUMBER,
   headDiameter    		NUMBER,
   growing			  	NUMBER(10),
   managementUnit		VARCHAR2(50),
   gps               	VARCHAR2(20),
   rejuvenationTime     DATE,
   rejuvenationMethod   VARCHAR2(20),
   constructionUnit 	VARCHAR2(50),
   remark				VARCHAR2(300),
   photoUrl				VARCHAR2(200),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkoldTree primary key (id),
   constraint fkoldTreeOrg foreign key (orgId)
         references organizations (id)
);

comment on table oldTrees is
'古树木';

comment on column oldTrees.id is
'古树id';

comment on column oldTrees.orgId is
'所属网格';

comment on column oldTrees.street is
'所属街道';

comment on column oldTrees.address is
'地址';

comment on column oldTrees.treeKinds is
'树种';

comment on column oldTrees.treeNum is
'树号';

comment on column oldTrees.treeHeight is
'树高';

comment on column oldTrees.mainCircumference is
'干周m';

comment on column oldTrees.chestDiameter is
'胸径cm';

comment on column oldTrees.headDiameter is
'冠径m';

comment on column oldTrees.growing is
'长势';

comment on column oldTrees.managementUnit is
'管护单位';

comment on column oldTrees.gps is
'卫星定位';

comment on column oldTrees.rejuvenationTime is
'复壮时间';

comment on column oldTrees.rejuvenationMethod  is
'复壮措施';

comment on column oldTrees.constructionUnit is
'复壮施工单位';
comment on column oldTrees.remark is
'备注';
comment on column oldTrees.photoUrl is
'照片';

comment on column oldTrees.createUser is
'创建用户';

comment on column oldTrees.updateUser is
'修改用户';

comment on column oldTrees.createDate is
'创建日期';

comment on column oldTrees.updateDate is
'修改时间';




/* Table: cleaners                                               */
/*==============================================================*/
create table cleaners(
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   name          		VARCHAR2(50)                    not null,
   gender				NUMBER(10)						not null,
   idCardNo          	VARCHAR2(30)					not null,
   nativePlace          VARCHAR2(50),
   currentAddress       VARCHAR2(50),
   contactWay           VARCHAR2(30)					not null,
   employmentForm    	VARCHAR2(30),
   laborStartingTime    DATE,
   contractPeriod    	NUMBER(10),
   work			  		VARCHAR2(30),
   monthlySalary        NUMBER,
   yearlySalary     	NUMBER,
   isFarming  			NUMBER(10),
   remark				VARCHAR2(300),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkcleaner primary key (id),
   constraint fkcleanerOrg foreign key (orgId)
         references organizations (id)
);

comment on table cleaners is
'保洁人员';

comment on column cleaners.id is
'保洁人员id';

comment on column cleaners.orgId is
'所属网格';

comment on column cleaners.name is
'姓名';

comment on column cleaners.gender is
'性别';

comment on column cleaners.idCardNo is
'身份证号码';

comment on column cleaners.nativePlace is
'籍贯';

comment on column cleaners.currentAddress is
'常住地址';

comment on column cleaners.employmentForm is
'用工形式';

comment on column cleaners.laborStartingTime is
'用工起始时间';

comment on column cleaners.contractPeriod is
'劳动合同期限';

comment on column cleaners.work is
'工作岗位';

comment on column cleaners.monthlySalary is
'月基本工资';

comment on column cleaners.yearlySalary is
'年收入';

comment on column cleaners.isFarming is
'农业及非农业';

comment on column cleaners.remark is
'备注';

comment on column cleaners.createUser is
'创建用户';

comment on column cleaners.updateUser is
'修改用户';

comment on column cleaners.createDate is
'创建日期';

comment on column cleaners.updateDate is
'修改时间';



/* Table: communalFacilities                                               */
/*==============================================================*/
create table communalFacilities(
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   objNum          		VARCHAR2(48)                    not null,
   objName				VARCHAR2(48)  					not null,
   objType         		NUMBER(10),
   street              	VARCHAR2(100),
   community         	VARCHAR2(50),
   deptCode            VARCHAR2(30)                     not null,
   deptName             VARCHAR2(180)                   not null,
   ownershipUnitCode    VARCHAR2(30),
   ownershipUnitName    VARCHAR2(180),
   maintenanceUnitCode  VARCHAR2(30),
   maintenanceUnitName  VARCHAR2(180),
   state                NUMBER(10),
   startDate            DATE ,
   changeDate           DATE ,
   dateSource           VARCHAR2(90),
   researchOwnership    VARCHAR2(180),
   verifyOwnership      VARCHAR2(180),
   caseMaterialOwnership VARCHAR2(180),
   otherSourceOwnership  VARCHAR2(180),
   objPosition			VARCHAR2(180),
   remark				VARCHAR2(300),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkcommunalFacilities primary key (id),
   constraint fkcommunalFacilitiesOrg foreign key (orgId)
         references organizations (id)
);

comment on table communalFacilities is
'公用设施类';

comment on column communalFacilities.id is
'公用设施类id';

comment on column communalFacilities.orgId is
'所属网格';

comment on column communalFacilities.objNum is
'部件编号';

comment on column communalFacilities.objName is
'部件名称';

comment on column communalFacilities.objType is
'类型';

comment on column communalFacilities.street is
'所在街道';

comment on column communalFacilities.community is
'所在社区 ';

comment on column communalFacilities.deptCode is
'主管部门代码';

comment on column communalFacilities.deptName is
'主管部门名称';

comment on column communalFacilities.ownershipUnitCode is
'权属单位代码';

comment on column communalFacilities.ownershipUnitName is
'权属单位名称';

comment on column communalFacilities.maintenanceUnitCode is
'养护单位代码';

comment on column communalFacilities.maintenanceUnitName is
'养护单位名称';

comment on column communalFacilities.state is
'状态';

comment on column communalFacilities.startDate is
'初始时间';

comment on column communalFacilities.changeDate is
'变更时间';

comment on column communalFacilities.dateSource is
'数据来源';

comment on column communalFacilities.researchOwnership is
'现场调查权属 ';

comment on column communalFacilities.verifyOwnership is
'专业部门确认权属';

comment on column communalFacilities.caseMaterialOwnership is
'案件资料确认权属';

comment on column communalFacilities.otherSourceOwnership is
'其他来源权属';

comment on column communalFacilities.objPosition is
'位置描述';

comment on column communalFacilities.createUser is
'创建用户';

comment on column communalFacilities.updateUser is
'修改用户';

comment on column communalFacilities.createDate is
'创建日期';

comment on column communalFacilities.updateDate is
'修改时间';



/* Table: roadTraffic                                               */
/*==============================================================*/
create table roadTraffic(
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   objNum          		VARCHAR2(48)                    not null,
   objName				VARCHAR2(48)  					not null,
   street              	VARCHAR2(100),
   community         	VARCHAR2(50),
   deptCode            VARCHAR2(30)                     not null,
   deptName             VARCHAR2(180)                   not null,
   ownershipUnitCode    VARCHAR2(30),
   ownershipUnitName    VARCHAR2(180),
   maintenanceUnitCode  VARCHAR2(30),
   maintenanceUnitName  VARCHAR2(180),
   state                NUMBER(10),
   startDate            DATE ,
   changeDate           DATE ,
   dateSource           VARCHAR2(90),
   researchOwnership    VARCHAR2(180),
   verifyOwnership      VARCHAR2(180),
   caseMaterialOwnership VARCHAR2(180),
   otherSourceOwnership  VARCHAR2(180),
   objPosition			VARCHAR2(180),
   remark				VARCHAR2(300),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkroadTraffic primary key (id),
   constraint fkroadTrafficOrg foreign key (orgId)
         references organizations (id)
);

comment on table roadTraffic is
'道路交通类';

comment on column roadTraffic.id is
'道路交通类id';

comment on column roadTraffic.orgId is
'所属网格';

comment on column roadTraffic.objNum is
'部件编号';

comment on column roadTraffic.objName is
'部件名称';

comment on column roadTraffic.street is
'所在街道';

comment on column roadTraffic.community is
'所在社区 ';

comment on column roadTraffic.deptCode is
'主管部门代码';

comment on column roadTraffic.deptName is
'主管部门名称';

comment on column roadTraffic.ownershipUnitCode is
'权属单位代码';

comment on column roadTraffic.ownershipUnitName is
'权属单位名称';

comment on column roadTraffic.maintenanceUnitCode is
'养护单位代码';

comment on column roadTraffic.maintenanceUnitName is
'养护单位名称';

comment on column roadTraffic.state is
'状态';

comment on column roadTraffic.startDate is
'初始时间';

comment on column roadTraffic.changeDate is
'变更时间';

comment on column roadTraffic.dateSource is
'数据来源';

comment on column roadTraffic.researchOwnership is
'现场调查权属 ';

comment on column roadTraffic.verifyOwnership is
'专业部门确认权属';

comment on column roadTraffic.caseMaterialOwnership is
'案件资料确认权属';

comment on column roadTraffic.otherSourceOwnership is
'其他来源权属';

comment on column roadTraffic.objPosition is
'位置描述';

comment on column roadTraffic.createUser is
'创建用户';

comment on column roadTraffic.updateUser is
'修改用户';

comment on column roadTraffic.createDate is
'创建日期';

comment on column roadTraffic.updateDate is
'修改时间';


/* Table: landscaping                                               */
/*==============================================================*/
create table landscaping(
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   objNum          		VARCHAR2(48)                    not null,
   objName				VARCHAR2(48)  					not null,
   street              	VARCHAR2(100),
   community         	VARCHAR2(50),
   deptCode            VARCHAR2(30)                     not null,
   deptName             VARCHAR2(180)                   not null,
   ownershipUnitCode    VARCHAR2(30),
   ownershipUnitName    VARCHAR2(180),
   maintenanceUnitCode  VARCHAR2(30),
   maintenanceUnitName  VARCHAR2(180),
   state                NUMBER(10),
   startDate            DATE ,
   changeDate           DATE ,
   dateSource           VARCHAR2(90),
   researchOwnership    VARCHAR2(180),
   verifyOwnership      VARCHAR2(180),
   caseMaterialOwnership VARCHAR2(180),
   otherSourceOwnership  VARCHAR2(180),
   objPosition			VARCHAR2(180),
   remark				VARCHAR2(300),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pklandscaping primary key (id),
   constraint fklandscapingOrg foreign key (orgId)
         references organizations (id)
);

comment on table landscaping is
'园林绿化';

comment on column landscaping.id is
'园林绿化id';

comment on column landscaping.orgId is
'所属网格';

comment on column landscaping.objNum is
'部件编号';

comment on column landscaping.objName is
'部件名称';

comment on column landscaping.street is
'所在街道';

comment on column landscaping.community is
'所在社区 ';

comment on column landscaping.deptCode is
'主管部门代码';

comment on column landscaping.deptName is
'主管部门名称';

comment on column landscaping.ownershipUnitCode is
'权属单位代码';

comment on column landscaping.ownershipUnitName is
'权属单位名称';

comment on column landscaping.maintenanceUnitCode is
'养护单位代码';

comment on column landscaping.maintenanceUnitName is
'养护单位名称';

comment on column landscaping.state is
'状态';

comment on column landscaping.startDate is
'初始时间';

comment on column landscaping.changeDate is
'变更时间';

comment on column landscaping.dateSource is
'数据来源';

comment on column landscaping.researchOwnership is
'现场调查权属 ';

comment on column landscaping.verifyOwnership is
'专业部门确认权属';

comment on column landscaping.caseMaterialOwnership is
'案件资料确认权属';

comment on column landscaping.otherSourceOwnership is
'其他来源权属';

comment on column landscaping.objPosition is
'位置描述';

comment on column landscaping.createUser is
'创建用户';

comment on column landscaping.updateUser is
'修改用户';

comment on column landscaping.createDate is
'创建日期';

comment on column landscaping.updateDate is
'修改时间';




/* Table: housingAndLand                                               */
/*==============================================================*/
create table housingAndLand(
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   objNum          		VARCHAR2(48)                    not null,
   objName				VARCHAR2(48)  					not null,
   street              	VARCHAR2(100),
   community         	VARCHAR2(50),
   deptCode            VARCHAR2(30)                     not null,
   deptName             VARCHAR2(180)                   not null,
   ownershipUnitCode    VARCHAR2(30),
   ownershipUnitName    VARCHAR2(180),
   maintenanceUnitCode  VARCHAR2(30),
   maintenanceUnitName  VARCHAR2(180),
   state                NUMBER(10),
   startDate            DATE ,
   changeDate           DATE ,
   dateSource           VARCHAR2(90),
   researchOwnership    VARCHAR2(180),
   verifyOwnership      VARCHAR2(180),
   caseMaterialOwnership VARCHAR2(180),
   otherSourceOwnership  VARCHAR2(180),
   objPosition			VARCHAR2(180),
   remark				VARCHAR2(300),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkhousingAndLand primary key (id),
   constraint fkhousingAndLandOrg foreign key (orgId)
         references organizations (id)
);

comment on table housingAndLand is
'房屋土地类';

comment on column housingAndLand.id is
'房屋土地类id';

comment on column housingAndLand.orgId is
'所属网格';

comment on column housingAndLand.objNum is
'部件编号';

comment on column housingAndLand.objName is
'部件名称';

comment on column housingAndLand.street is
'所在街道';

comment on column housingAndLand.community is
'所在社区 ';

comment on column housingAndLand.deptCode is
'主管部门代码';

comment on column housingAndLand.deptName is
'主管部门名称';

comment on column housingAndLand.ownershipUnitCode is
'权属单位代码';

comment on column housingAndLand.ownershipUnitName is
'权属单位名称';

comment on column housingAndLand.maintenanceUnitCode is
'养护单位代码';

comment on column housingAndLand.maintenanceUnitName is
'养护单位名称';

comment on column housingAndLand.state is
'状态';

comment on column housingAndLand.startDate is
'初始时间';

comment on column housingAndLand.changeDate is
'变更时间';

comment on column housingAndLand.dateSource is
'数据来源';

comment on column housingAndLand.researchOwnership is
'现场调查权属 ';

comment on column housingAndLand.verifyOwnership is
'专业部门确认权属';

comment on column housingAndLand.caseMaterialOwnership is
'案件资料确认权属';

comment on column housingAndLand.otherSourceOwnership is
'其他来源权属';

comment on column housingAndLand.objPosition is
'位置描述';

comment on column housingAndLand.createUser is
'创建用户';

comment on column housingAndLand.updateUser is
'修改用户';

comment on column housingAndLand.createDate is
'创建日期';

comment on column housingAndLand.updateDate is
'修改时间';




/* Table: otherFacilities                                               */
/*==============================================================*/
create table otherFacilities(
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32),
   objNum          		VARCHAR2(48)                    not null,
   objName				VARCHAR2(48)  					not null,
   street              	VARCHAR2(100),
   community         	VARCHAR2(50),
   deptCode            VARCHAR2(30)                     not null,
   deptName             VARCHAR2(180)                   not null,
   ownershipUnitCode    VARCHAR2(30),
   ownershipUnitName    VARCHAR2(180),
   maintenanceUnitCode  VARCHAR2(30),
   maintenanceUnitName  VARCHAR2(180),
   state                NUMBER(10),
   startDate            DATE ,
   changeDate           DATE ,
   dateSource           VARCHAR2(90),
   researchOwnership    VARCHAR2(180),
   verifyOwnership      VARCHAR2(180),
   caseMaterialOwnership VARCHAR2(180),
   otherSourceOwnership  VARCHAR2(180),
   objPosition			VARCHAR2(180),
   remark				VARCHAR2(300),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkotherFacilities primary key (id),
   constraint fkotherFacilitiesOrg foreign key (orgId)
         references organizations (id)
);

comment on table otherFacilities is
'其他设施类';

comment on column otherFacilities.id is
'其他设施类id';

comment on column otherFacilities.orgId is
'所属网格';

comment on column otherFacilities.objNum is
'部件编号';

comment on column otherFacilities.objName is
'部件名称';

comment on column otherFacilities.street is
'所在街道';

comment on column otherFacilities.community is
'所在社区 ';

comment on column otherFacilities.deptCode is
'主管部门代码';

comment on column otherFacilities.deptName is
'主管部门名称';

comment on column otherFacilities.ownershipUnitCode is
'权属单位代码';

comment on column otherFacilities.ownershipUnitName is
'权属单位名称';

comment on column otherFacilities.maintenanceUnitCode is
'养护单位代码';

comment on column otherFacilities.maintenanceUnitName is
'养护单位名称';

comment on column otherFacilities.state is
'状态';

comment on column otherFacilities.startDate is
'初始时间';

comment on column otherFacilities.changeDate is
'变更时间';

comment on column otherFacilities.dateSource is
'数据来源';

comment on column otherFacilities.researchOwnership is
'现场调查权属 ';

comment on column otherFacilities.verifyOwnership is
'专业部门确认权属';

comment on column otherFacilities.caseMaterialOwnership is
'案件资料确认权属';

comment on column otherFacilities.otherSourceOwnership is
'其他来源权属';

comment on column otherFacilities.objPosition is
'位置描述';

comment on column otherFacilities.createUser is
'创建用户';

comment on column otherFacilities.updateUser is
'修改用户';

comment on column otherFacilities.createDate is
'创建日期';

comment on column otherFacilities.updateDate is
'修改时间';


/* Table: partyAbilityPerson                                               */
/*==============================================================*/
create table partyAbilityPerson(
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   name                 VARCHAR2(60)                    not null,
   telphone             VARCHAR2(60),
   gender               NUMBER(10),
   simplePinyin         VARCHAR2(10),
   fullPinyin           VARCHAR2(30),
   position             VARCHAR2(150),
   workingOrg           VARCHAR2(150),
   abilityDesc          VARCHAR2(300),
   remark               VARCHAR2(600),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   imgUrl               VARCHAR2(300),
   constraint pkpartyAbilityPerson primary key (id),
   constraint fkpartyAbilityPersonOrg foreign key (orgId)
         references organizations (id)
);

comment on table partyAbilityPerson is
'党建人才库';

comment on column partyAbilityPerson.id is
'党建人才库id';

comment on column partyAbilityPerson.orgId is
'所属机构（党组织）';

comment on column partyAbilityPerson.name is
'姓名';

comment on column partyAbilityPerson.gender is
'性别';

comment on column partyAbilityPerson.position is
'（工作单位或就读学校）职务';

comment on column partyAbilityPerson.telphone is
'联系电话';

comment on column partyAbilityPerson.workingOrg is
'工作单位或就读学校';

comment on column partyAbilityPerson.abilityDesc is
'专长描述';

create table teamInfos(
   id                   NUMBER(10)                      not null,
   teamType             VARCHAR2(60)                    not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   name                 VARCHAR2(150)                   not null,
   telphone             VARCHAR2(60),
   teamLeader           VARCHAR2(60),
   simplePinyin         VARCHAR2(10),
   fullPinyin           VARCHAR2(30),
   leaderPhone          VARCHAR2(60),
   establishDate        DATE,
   remark               CLOB,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkteamInfos primary key (id),
   constraint fkteamInfosOrg foreign key (orgId)
         references organizations (id)
);

comment on table teamInfos is
'团队信息';

comment on column teamInfos.id is
'团队id';

comment on column teamInfos.orgId is
'所属机构（党组织）';

comment on column teamInfos.name is
'名称';

comment on column teamInfos.teamType is
'类型';

comment on column teamInfos.teamLeader is
'团队负责人';

comment on column teamInfos.telphone is
'联系电话';

comment on column teamInfos.leaderPhone is
'负责人电话';

comment on column teamInfos.establishDate is
'团队成立时间';
create sequence s_internetBar
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

/*==============================================================*/
/* Table: internetBar                                          */
/*==============================================================*/
create table internetBar (
	id                   NUMBER(10)                      not null,
	orgId                NUMBER(10)                      not null,
	orgInternalCode      VARCHAR2(32)                    not null,
	placeName      		 VARCHAR2(150)  				 not null,
	placeAddress         VARCHAR2(150)  				,
	placeId              NUMBER(10)                     ,
	manager           	 VARCHAR2(60),
	mobile               VARCHAR2(12) ,
	netCultureLicenceNo  VARCHAR2(60),
	netAccessProviders   VARCHAR2(60),
	internetAccessType   VARCHAR2(60),
	netSecurityAuditNo   VARCHAR2(60),
	tempNetCardNum        NUMBER(10),
	totalComputerNum      NUMBER(10),
	fireAuditDocumentNo   VARCHAR2(60),
	barCode               VARCHAR2(60),
	operationArea 		  NUMBER(10,2),
	useIP                 VARCHAR2(180),
	stationPolice         VARCHAR2(150),
	logOutReason         VARCHAR2(150),
	isEmphasis    		 NUMBER(1)   	           	    default 0,
	logOutTime  		 DATE,
	remark     			 VARCHAR2(900),
	imgUrl               VARCHAR2(300),
	fullPinyin           VARCHAR2(30),
    simplePinyin         VARCHAR2(10),
    createUser           VARCHAR2(32)                    not null,
    updateUser           VARCHAR2(32),
    createDate           DATE                            not null,
    buildingId      	 VARCHAR2(30),
    centerX 			 NUMBER(10),
    centerY 			 NUMBER(10),
    updateDate           DATE,
    attentionExtent      NUMBER(10),
    SOURCESSTATE NUMBER(1)  default 1 ,
	constraint			 pkinternetBar primary key(id),
	constraint			 fkinternetBar foreign key(orgId)
		references organizations(id)
);
comment on table internetBar is
'网吧信息';
comment on column internetBar.id is
'网吧Id';
comment on column internetBar.orgId is
'所属网格';
comment on column internetBar.orgInternalCode is
'所属责任区编号';
comment on column internetBar.placeName is
'场所名称';
comment on column internetBar.placeAddress is
'场所地址';
comment on column internetBar.placeId is
'场所Id';
comment on column internetBar.manager is
'负责人';
comment on column internetBar.mobile is
'负责人联系电话';
comment on column internetBar.netCultureLicenceNo is
'网络文化经营许可证号';
comment on column internetBar.netAccessProviders is
'宽带接入服务商';
comment on column internetBar.internetAccessType is
'接入方式';
comment on column internetBar.netSecurityAuditNo is
'网络安全审核意见书号';
comment on column internetBar.tempNetCardNum is
'临时上网卡数量';
comment on column internetBar.totalComputerNum is
'电脑台数';
comment on column internetBar.fireAuditDocumentNo is
'消防审核意见证书号';
comment on column internetBar.barCode is
'网吧编号';
comment on column internetBar.operationArea is
'营业面积';
comment on column internetBar.useIP is
'现使用ip';
comment on column internetBar.stationPolice is
'所在地派出所名称';
comment on column internetBar.logOutReason is
'注销时间';
comment on column internetBar.isEmphasis is
'注销标识';
comment on column internetBar.logOutTime is
'注销时间';
comment on column internetBar.remark is
'备注';
comment on column internetBar.attentionExtent is
'关注程度：1.一般；2.中等；3.严重';

/*==============================================================*/
/* Index: idx_in_orgIdAndPlaceName                    */
/*==============================================================*/
create unique index idx_in_orgIdAndPlaceName on internetBar (
   orgId ASC,
   placeName ASC
);

create sequence s_operateLogs
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

create table operateLogs  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(255),
   moduleName           VARCHAR2(60),
   moduleType           VARCHAR2(60),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType 		NUMBER(10),
   constraint pkoperateLogs primary key (id),
   constraint fkoperateLogs foreign key (orgId)
         references organizations (id)
);


comment on table operateLogs is
'操作信息日志';
comment on column operateLogs.operationType is
'操作类型';
comment on column operateLogs.logLevel is
'日志等级';

comment on column operateLogs.operation is
'术语编号';

comment on column operateLogs.moduleName is
'模块名';

comment on column operateLogs.moduleType is
'模块名(区别各个操作的表名)';

comment on column operateLogs.username is
'操作的用户';

comment on column operateLogs.clientIp is
'访问IP ';

comment on column operateLogs.orgInternalCode is
'部门内部编码';

comment on column operateLogs.operateTime is
'术语系统默认名称';


-- Create table
create table FAMILYHOUSES
(
  PROPERTYDICTID   NUMBER(10),
  HOUSEHOLDSTAFFID NUMBER(10)
);

-- Add comments to the table
comment on table FAMILYHOUSES
  is '家庭称呼类型表';
-- Add comments to the columns
comment on column FAMILYHOUSES.PROPERTYDICTID
  is '子类型ID';
comment on column FAMILYHOUSES.HOUSEHOLDSTAFFID
  is '家庭称呼类型表ID';

/*==============================================================*/
/* Index: idx_operateLogs_logLevel                                */
/*==============================================================*/
create index idx_operateLogs_logLevel on operateLogs (
   logLevel ASC
);

/*==============================================================*/
/* Index: idx_operateLogs_moduleName                              */
/*==============================================================*/
create index idx_operateLogs_moduleName on operateLogs (
   moduleName ASC
);

/*==============================================================*/
/* Index: idx_operateLogs_moduleType                             */
/*==============================================================*/
create index idx_operateLogs_moduleType  on operateLogs (
   moduleType ASC
);


/*==============================================================*/
/* Index: idx_operateLogs_username                                */
/*==============================================================*/
create index idx_operateLogs_username on operateLogs (
   username ASC
);

/*==============================================================*/
/* Index: idx_operateLogs_orgIntCode                              */
/*==============================================================*/
create index idx_operateLogs_orgIntCode on operateLogs (
   orgInternalCode ASC
);

/*==============================================================*/
/* Index: idx_operateLogs_operateTime                             */
/*==============================================================*/
create index idx_operateLogs_operateTime on operateLogs (
   operateTime ASC
);

create sequence s_LaborEmploymentUnit
	increment by 1
	start with 1
 	minvalue 1
 	cache 20
 	maxvalue 9999999999;


/*==============================================================*/
/* Table: ActualCompany                                         */
/*==============================================================*/
create table LaborEmploymentUnit(
  ID                      NUMBER(10) not null,
  ORGID                   NUMBER(10) not null,
  ORGINTERNALCODE         VARCHAR2(50),
  COMPANYNAME             VARCHAR2(150) not null,
  addressId                NUMBER(10),
  COMPANYADDRESS          VARCHAR2(150),
  COMPANYTYPE             VARCHAR2(90),
  ISKEY                   NUMBER(1) default 0,
  CORPORATEREPRESENTATIVE VARCHAR2(150),
  IDCARDNO                VARCHAR2(60),
  post					  VARCHAR2(60),
  postTelephone			  VARCHAR2(60),
  TELEPHONE               VARCHAR2(80),
  FACSIMILE               VARCHAR2(150),
  BUSINESSLICENSENO       VARCHAR2(150),
  ORGCODE                 VARCHAR2(150)  not null,
  REGISTEREDCAPITAL       NUMBER(10,4),
  ECONOMICNATURE          NUMBER(10),
  EXPIRYDATE              DATE,
  REGISTRATIONDATE        DATE,
  BUSINESSSCOPE           VARCHAR2(150),
  REGISTRATIONADDRESS     VARCHAR2(150),
  COMPETENTDEPARTMENT     VARCHAR2(90),
  SUPERVISORYLEVEL        NUMBER(10),
  SUPERVISORYDEPARTMENT   VARCHAR2(90),
  FIREFIGHTINGLEVEL       NUMBER(10),
  SECURITYCHIEF           VARCHAR2(150),
  REMARK                  VARCHAR2(900),
  FULLPINYIN              VARCHAR2(150),
  SIMPLEPINYIN            VARCHAR2(90),
  IMGURL                  VARCHAR2(300),
  CREATEUSER              VARCHAR2(60),
  CREATEDATE              DATE,
  UPDATEUSER              VARCHAR2(60),
  UPDATEDATE              DATE,
  ISEMPHASIS              NUMBER(1) default 1,
  logOutTime              DATE,
  logOutReason            VARCHAR2(300),
  principal				  VARCHAR2(60),
  principalTelephone	  VARCHAR2(60),
  insureNumber	          VARCHAR2(60),

  EMPLOYEESNUM            NUMBER(10),
  femaleWorkerNumber      NUMBER(10),
  localTownNumber         NUMBER(10),
  localCountryNumber      NUMBER(10),
  otherTownNumber         NUMBER(10),
  otherNumber             NUMBER(10),
  isUserdChild            NUMBER(1),
  isObservedOrder         NUMBER(1),
  workNumber              NUMBER(10),
  standardWorkNumber      NUMBER(10),
  unLimitWorkNumber       NUMBER(10),
  compositeWorkNumber     NUMBER(10),
  overtimePayCondition    VARCHAR2(150),
  payMoneyDate            DATE,
  payTotalMoney           NUMBER(10,2),
  getLivingMoneyNum       NUMBER(10),
  shouldEmployeeNum       NUMBER(10),
  unEmployeeNum           NUMBER(10),
  unEmployeeReason        VARCHAR2(150),
  isAcceptRewardCondition NUMBER(1),
  isBreakLaw              NUMBER(1),
  isAcceptPunish          NUMBER(1),
   constraint pkLaborEmploymentUnit primary key (id),
   constraint fkLaborEmploymentUnit foreign key (orgId)
         references organizations (id)
);

comment on table LaborEmploymentUnit
  is '劳动用工单位';

comment on column LaborEmploymentUnit.ORGID
  is '所属网格';

comment on column LaborEmploymentUnit.ORGINTERNALCODE
  is '部门内部编号';

comment on column LaborEmploymentUnit.COMPANYNAME
  is '单位名称';

comment on column LaborEmploymentUnit.COMPANYADDRESS
  is '单位地址';

comment on column LaborEmploymentUnit.COMPANYTYPE
  is '单位类别';

comment on column LaborEmploymentUnit.ISKEY
  is '是否重点单位';

comment on column LaborEmploymentUnit.CORPORATEREPRESENTATIVE
  is '法人代表';

comment on column LaborEmploymentUnit.IDCARDNO
  is '身份证号码';

comment on column LaborEmploymentUnit.post
  is '法人代表职务';

comment on column LaborEmploymentUnit.postTelephone
  is '法人代表联系电话';

comment on column LaborEmploymentUnit.TELEPHONE
  is '单位电话';

comment on column LaborEmploymentUnit.FACSIMILE
  is '单位传真';

comment on column LaborEmploymentUnit.BUSINESSLICENSENO
  is '营业执照号码';

comment on column LaborEmploymentUnit.ORGCODE
  is '组织机构代码';

comment on column LaborEmploymentUnit.REGISTEREDCAPITAL
  is '注册资本';

comment on column LaborEmploymentUnit.ECONOMICNATURE
  is '经济性质';

comment on column LaborEmploymentUnit.EXPIRYDATE
  is '有效期至';

comment on column LaborEmploymentUnit.REGISTRATIONDATE
  is '注册日期';

comment on column LaborEmploymentUnit.BUSINESSSCOPE
  is '经营范围';

comment on column LaborEmploymentUnit.REGISTRATIONADDRESS
  is '注册地址';

comment on column LaborEmploymentUnit.COMPETENTDEPARTMENT
  is '主管部门';

comment on column LaborEmploymentUnit.SUPERVISORYLEVEL
  is '管理级别';

comment on column LaborEmploymentUnit.SUPERVISORYDEPARTMENT
  is '管理部门';

comment on column LaborEmploymentUnit.FIREFIGHTINGLEVEL
  is '消防等级';

comment on column LaborEmploymentUnit.SECURITYCHIEF
  is '治安负责人';

comment on column LaborEmploymentUnit.REMARK
  is '备注';

comment on column LaborEmploymentUnit.FULLPINYIN
  is '单位名称全拼';

comment on column LaborEmploymentUnit.SIMPLEPINYIN
  is '单位名称简拼';

comment on column LaborEmploymentUnit.IMGURL
  is '头像路径';

comment on column LaborEmploymentUnit.CREATEUSER
  is '创建用户';

comment on column LaborEmploymentUnit.CREATEDATE
  is '创建时间';

comment on column LaborEmploymentUnit.UPDATEUSER
  is '修改用户';

comment on column LaborEmploymentUnit.UPDATEDATE
  is '修改时间';

comment on column LaborEmploymentUnit.ISEMPHASIS
  is '是否注销';

comment on column LaborEmploymentUnit.logOutTime
  is '注销时间';

comment on column LaborEmploymentUnit.logOutReason
  is '注销原因';

comment on column LaborEmploymentUnit.principal
  is '劳资部门负责人';

comment on column LaborEmploymentUnit.principalTelephone
  is '劳资部门负责人电话';

comment on column LaborEmploymentUnit.insureNumber
  is '社会保险登记号';

comment on column LaborEmploymentUnit.EMPLOYEESNUM
  is '从业人数';

comment on column LaborEmploymentUnit.femaleWorkerNumber
  is '女职工数';

comment on column LaborEmploymentUnit.localTownNumber
  is '本市城镇职工人数';

comment on column LaborEmploymentUnit.localCountryNumber
  is '本市农村职工人数';

comment on column LaborEmploymentUnit.otherTownNumber
  is '外省市职工人数';

comment on column LaborEmploymentUnit.otherNumber
  is '其他从业人数';

comment on column LaborEmploymentUnit.isUserdChild
  is '是否使用童工';

comment on column LaborEmploymentUnit.isObservedOrder
  is '是否遵守女职工未成年保护规定';

comment on column LaborEmploymentUnit.workNumber
  is '从事规定工种人数/保证上岗人数';

comment on column LaborEmploymentUnit.standardWorkNumber
  is '标准工作时间人数';

comment on column LaborEmploymentUnit.unLimitWorkNumber
  is '不定时工作时间人数';

comment on column LaborEmploymentUnit.compositeWorkNumber
  is '综合工作时间人数';

comment on column LaborEmploymentUnit.overtimePayCondition
  is '加班工资支付情况';

comment on column LaborEmploymentUnit.payMoneyDate
  is '工资支付日期';

comment on column LaborEmploymentUnit.payTotalMoney
  is '实际发放工资总额';

comment on column LaborEmploymentUnit.getLivingMoneyNum
  is '领取生活费人数';

comment on column LaborEmploymentUnit.shouldEmployeeNum
  is '应签劳动合同人数';

comment on column LaborEmploymentUnit.unEmployeeNum
  is '未签订劳动合同人数';

comment on column LaborEmploymentUnit.unEmployeeReason
  is '未签订劳动合同原因';

comment on column LaborEmploymentUnit.isAcceptRewardCondition
  is '企业是否有接受奖励情况';

comment on column LaborEmploymentUnit.isBreakLaw
  is '企业是否有违法情况';

comment on column LaborEmploymentUnit.isAcceptPunish
  is '企业是否有接受处罚情况';

create sequence s_EmergencyShelter
	increment by 1
	start with 1
 	minvalue 1
 	cache 20
 	maxvalue 9999999999;

create table EmergencyShelter(
  ID                      NUMBER(10) not null,
  ORGID                   NUMBER(10) not null,
  ORGINTERNALCODE         VARCHAR2(50),
  name         			  VARCHAR2(60) not null,
  address                 VARCHAR2(150),
  longAititude            VARCHAR2(60),
  siteType                VARCHAR2(60),
  area                    NUMBER(10,2),
  fullPersonNum           NUMBER(10),
  aroundVillageNum        NUMBER(10),
  aroundPersonNum         NUMBER(10),
  aroundRoadCondition	  VARCHAR2(150),
  functionComplete  	  VARCHAR2(150),
  identificationNum       NUMBER(10),
  imageSymbolNum          NUMBER(10),
  pointNum                NUMBER(10),
  REMARK                  VARCHAR2(600),
  FULLPINYIN              VARCHAR2(150),
  SIMPLEPINYIN            VARCHAR2(90),
  IMGURL                  VARCHAR2(300),
  CREATEUSER              VARCHAR2(60),
  CREATEDATE              DATE,
  UPDATEUSER              VARCHAR2(60),
  UPDATEDATE              DATE,
  ISEMPHASIS              NUMBER(1) default 1,
  logOutTime              DATE,
  logOutReason            VARCHAR2(300),
   constraint pkEmergencyShelter primary key (id),
   constraint fkEmergencyShelter foreign key (orgId)
         references organizations (id)
);

comment on table EmergencyShelter
  is '应急避难场所';

comment on column EmergencyShelter.ORGID
  is '所属网格';

comment on column EmergencyShelter.ORGINTERNALCODE
  is '部门内部编号';

comment on column EmergencyShelter.name
  is '场地名称';

comment on column EmergencyShelter.address
  is '场地位置';

comment on column EmergencyShelter.longAititude
  is '经纬度';

comment on column EmergencyShelter.siteType
  is '场地类型';

comment on column EmergencyShelter.area
  is '面积';

comment on column EmergencyShelter.fullPersonNum
  is '可容纳人数（人）';

comment on column EmergencyShelter.aroundVillageNum
  is '周边社区/村数量';

comment on column EmergencyShelter.aroundPersonNum
  is '周边人口';

comment on column EmergencyShelter.aroundRoadCondition
  is '周边道路情况';

comment on column EmergencyShelter.functionComplete
  is '功能完善';

comment on column EmergencyShelter.identificationNum
  is '标识';

comment on column EmergencyShelter.imageSymbolNum
  is '图形符号';

comment on column EmergencyShelter.REMARK
  is '备注';

comment on column EmergencyShelter.FULLPINYIN
  is '名称全拼';

comment on column EmergencyShelter.SIMPLEPINYIN
  is '名称简拼';

comment on column EmergencyShelter.IMGURL
  is '头像路径';

comment on column EmergencyShelter.CREATEUSER
  is '创建用户';

comment on column EmergencyShelter.CREATEDATE
  is '创建时间';

comment on column EmergencyShelter.UPDATEUSER
  is '修改用户';

comment on column EmergencyShelter.UPDATEDATE
  is '修改时间';

comment on column EmergencyShelter.ISEMPHASIS
  is '是否注销';

comment on column EmergencyShelter.logOutTime
  is '注销时间';

comment on column EmergencyShelter.logOutReason
  is '注销原因';

/*==============================================================*/
/* Table: attachFiles                                      */
/*==============================================================*/
create table attachFiles  (
   fileName             VARCHAR2(150)                   not null,
   physicsFullFileName  VARCHAR2(250)                   not null,
   moduleKey            VARCHAR2(150)                   not null,
   moduleObjectId       VARCHAR2(100)                   not null
);

comment on column attachFiles.moduleKey is
'使用到该文件的功能模块';

comment on column attachFiles.moduleObjectId is
'使用到该文件的功能模块具体对象id';

comment on column attachFiles.fileName is
'附件文件名';

comment on column attachFiles.physicsFullFileName is
'文件存放的物理路径';



/*==============================================================*/
/* Table: documentsHasAttachFiles                                      */
/*==============================================================*/
create table documentsHasAttachFiles  (
   id                     NUMBER(10)                      not null,
   documentId                NUMBER(10)                      not null,
   fileType               VARCHAR2(150)                   not null,
   constraint pkDocumentsHasAttachFiles primary key (id)
);

comment on column documentsHasAttachFiles.fileType is
'使用到该文件的对象类型（for_document）';


/*==============================================================*/
/* Table: peopleLog                                         */
/*==============================================================*/

  create sequence s_peopleLog
	increment by 1
	start with 1
 	minvalue 1
 	cache 20
 	maxvalue 9999999999;

CREATE TABLE peopleLog(
	id					number(10)			not null,
	userId 				number(10)          not null,
	orgId 				number(10)          not null,
	orgInternalCode 	varchar2(32)  		not null,
	logType 			number(10)          not null,
	belonger 			varchar2(60)        not null,
	publishDate 		date              	not null,
	address 			varchar2(200)       ,
	title 				varchar2(200)       ,
	contents 			clob                ,
	summary 			varchar2(600)       ,
	commentNums 		number(10)			not null,
	isAttachment		number(2)			default 0,
	createUser          VARCHAR2(32)        not null,
	updateUser          VARCHAR2(32)		,
	createDate          DATE                not null,
	updateDate          DATE,
	constraint	pkpeopleLog	primary	key(id)
);

comment on table peopleLog
  is '民情日志';

comment on column peopleLog.ORGID
  is '所属网格';

comment on column peopleLog.ORGINTERNALCODE
  is '部门内部编号';

comment on column peopleLog.userId
  is '用户Id';

comment on column peopleLog.logType
  is '日志类型';

comment on column peopleLog.belonger
  is '日志所属人';

comment on column peopleLog.publishDate
  is '日志生成日期';

comment on column peopleLog.address
  is '用户地址';

comment on column peopleLog.title
  is '日志标题';

comment on column peopleLog.contents
  is '日志内容';

comment on column peopleLog.summary
  is '日志总结';

comment on column peopleLog.commentNums
  is '日志点评次数';

comment on column peopleLog.isAttachment
  is '日志是否有附件';

comment on column peopleLog.CREATEUSER
  is '创建用户';

comment on column peopleLog.CREATEDATE
  is '创建时间';

comment on column peopleLog.UPDATEUSER
  is '修改用户';

comment on column peopleLog.UPDATEDATE
  is '修改时间';

/*==============================================================*/
/* Table: peopleLogAttachFiles     民情日志附件表                                                                                                            */
/*==============================================================*/

create sequence s_peopleLogAttachFiles
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
-- Create table
create table peopleLogAttachFiles
(
  ID                      NUMBER(10)    not null,
  peopleLogId             NUMBER(10)    not null,
  fileName                VARCHAR2(300)  not null,
  fileActualUrl           VARCHAR2(300)  not null,
  CREATEUSER              VARCHAR2(30)  not null,
  UPDATEUSER              VARCHAR2(30)  ,
  CREATEDATE              DATE          not null,
  UPDATEDATE              DATE          ,

  constraint pkpeopleLogAttachFiles primary key (ID),
  constraint fkpeopleLogAttachFiles foreign key (peopleLogId)
         references peopleLog (id)
);

----add comments to peopleLogAttachFiles table
comment on table peopleLogAttachFiles
  is '民情日志附件表';
----add comments to peopleLogAttachFiles colummn
comment on column peopleLogAttachFiles.ID
  is '民情日志附件ID';
comment on column peopleLogAttachFiles.peopleLogId
  is '民情日志ID';
comment on column peopleLogAttachFiles.fileName
  is '民情日志附件名';
comment on column peopleLogAttachFiles.fileActualUrl
  is '民情日志附件路径';
comment on column peopleLogAttachFiles.CREATEUSER
  is '创建用户';
comment on column peopleLogAttachFiles.UPDATEUSER
  is '修改用户';
comment on column peopleLogAttachFiles.CREATEDATE
  is '创建时间';
comment on column peopleLogAttachFiles.UPDATEDATE
  is '修改时间';

/*==============================================================*/
/* Table: commentLog                                         */
/*==============================================================*/

create sequence s_commentLog
	increment by 1
	start with 1
 	minvalue 1
 	cache 20
 	maxvalue 9999999999;

CREATE TABLE commentLog (
	id 					number(10)		not null,
	logId 				number(10)		not null,
	userId 				number(10)		not null,
	commentUser 		varchar2(60)	not null,
	comments 			varchar2(600)	,
	commentTime 		DATE			,
	createUser       	VARCHAR2(32)    not null,
	updateUser       	VARCHAR2(32)	,
	createDate       	DATE            not null,
	updateDate       	DATE			,
	constraint	pkcommentLog	primary	key (id),
   	constraint fklogId foreign key(logId)
         references Peoplelog (id)
);

comment on table commentLog
  is '点评日志';

comment on column commentLog.logId
  is '日志Id';

comment on column commentLog.userId
  is '用户Id';

comment on column commentLog.comments
  is '点评内容';

comment on column commentLog.commentUser
  is '点评人';

comment on column commentLog.commentTime
  is '点评日期';

comment on column commentLog.CREATEUSER
  is '创建用户';

comment on column commentLog.CREATEDATE
  is '创建时间';

comment on column commentLog.UPDATEUSER
  is '修改用户';

comment on column commentLog.UPDATEDATE
  is '修改时间';

/*==============================================================*/
/* Table: INCIDENTTYPES  应急事件类型表                                       */
/*==============================================================*/
-- Create table
create table INCIDENTTYPES
(
  ID          NUMBER(10) 					not null,
  NAME        VARCHAR2(60) 					not null,
  SUBJECTION  NUMBER(10) 		default 0 	not null,
  DESCRIPTION VARCHAR2(1500)   				not null,
  DEGREED     NUMBER(1) 					not null,
  CREATEUSER  VARCHAR2(32)					not null,
  UPDATEUSER  VARCHAR2(32),
  CREATEDATE  DATE 							not null,
  UPDATEDATE  DATE
);

-- Add comments to the table
comment on table INCIDENTTYPES
  is '应急事件类型表';
-- Add comments to the columns
comment on column INCIDENTTYPES.NAME
  is '事件类型名称';
comment on column INCIDENTTYPES.SUBJECTION
  is '归属于（数据字典）';
comment on column INCIDENTTYPES.DESCRIPTION
  is '事件定义';
comment on column INCIDENTTYPES.DEGREED
  is '是否分级';
comment on column INCIDENTTYPES.CREATEUSER
  is '创建用户';
comment on column INCIDENTTYPES.UPDATEUSER
  is '修改用户';
comment on column INCIDENTTYPES.CREATEDATE
  is '创建时间';
comment on column INCIDENTTYPES.UPDATEDATE
  is '修改时间';

/*==============================================================*/
/* Table: INCIDENTTYPEDEGREES  应急事件类型分级标准表                                       */
/*==============================================================*/

-- Create table
create table INCIDENTTYPEDEGREES
(
  INCIDENTTYPEID NUMBER(10) not null,
  DEGREE         NUMBER(10) not null,
  RULE           VARCHAR2(1500) not null
);
-- Add comments to the table
comment on table INCIDENTTYPEDEGREES
  is '应急事件类型分级标准表';
-- Add comments to the columns
comment on column INCIDENTTYPEDEGREES.INCIDENTTYPEID
  is '事件类型表ID';
comment on column INCIDENTTYPEDEGREES.DEGREE
  is '分级（数据字典）';
comment on column INCIDENTTYPEDEGREES.RULE
  is '分级依据';

/*==============================================================*/
/* Table: INCIDENTDEALPLANS  应急事件处置预案                                       */
/*==============================================================*/

-- Create table
create table INCIDENTDEALPLANS
(
  ID             NUMBER(10) not null,
  INCIDENTTYPEID NUMBER(10) not null,
  DEGREE         NUMBER(10),
  ENDRULE        VARCHAR2(1500) not null,
  LEADTEAM       NUMBER(1) not null,
  COMPLYTEAM     NUMBER(1) not null,
  CREATEUSER     VARCHAR2(30) not null,
  UPDATEUSER     VARCHAR2(30),
  CREATEDATE     DATE not null,
  UPDATEDATE     DATE
);
-- Add comments to the table
comment on table INCIDENTDEALPLANS
  is '应急事件预案表';
-- Add comments to the columns
comment on column INCIDENTDEALPLANS.INCIDENTTYPEID
  is '事件类型ID';
comment on column INCIDENTDEALPLANS.DEGREE
  is '分级';
comment on column INCIDENTDEALPLANS.ENDRULE
  is '终止条件';
comment on column INCIDENTDEALPLANS.LEADTEAM
  is '是否成立领导小组';
comment on column INCIDENTDEALPLANS.COMPLYTEAM
  is '是否成立处置小组';
comment on column INCIDENTDEALPLANS.CREATEUSER
  is '创建用户';
comment on column INCIDENTDEALPLANS.UPDATEUSER
  is '修改用户';
comment on column INCIDENTDEALPLANS.CREATEDATE
  is '创建时间';
comment on column INCIDENTDEALPLANS.UPDATEDATE
  is '修改时间';


/*==============================================================*/
/* Table: INCIDENTDEALTEAMS  应急事件预案小组                                       */
/*==============================================================*/

-- Create table
create table INCIDENTDEALTEAMS
(
  ID                 NUMBER(10) not null,
  INCIDENTDEALPLANID NUMBER(10) not null,
  TEAMTYPE           NUMBER(10) not null,
  RESPONSIBILITY     VARCHAR2(1500) not null,
  COMPOSITION        VARCHAR2(600),
  TEAMNAME           VARCHAR2(150) not null,
  TEAMLEADER         VARCHAR2(150),
  TEAMMEMBER         VARCHAR2(600),
  CREATEUSER         VARCHAR2(30) not null,
  UPDATEUSER         VARCHAR2(30),
  CREATEDATE         DATE not null,
  UPDATEDATE         DATE
);

-- Add comments to the table
comment on table INCIDENTDEALTEAMS
  is '应急事件预案小组';
-- Add comments to the columns
comment on column INCIDENTDEALTEAMS.INCIDENTDEALPLANID
  is '应急事件预案ID';
comment on column INCIDENTDEALTEAMS.TEAMTYPE
  is '是否领导小组';
comment on column INCIDENTDEALTEAMS.RESPONSIBILITY
  is '职责';
comment on column INCIDENTDEALTEAMS.COMPOSITION
  is '组成方式';
comment on column INCIDENTDEALTEAMS.TEAMNAME
  is '小组名称';
comment on column INCIDENTDEALTEAMS.TEAMLEADER
  is '牵头部门';
comment on column INCIDENTDEALTEAMS.TEAMMEMBER
  is '参与部门';
comment on column INCIDENTDEALTEAMS.CREATEUSER
  is '创建用户';
comment on column INCIDENTDEALTEAMS.UPDATEUSER
  is '修改用户';
comment on column INCIDENTDEALTEAMS.CREATEDATE
  is '创建时间';
comment on column INCIDENTDEALTEAMS.UPDATEDATE
  is '修改时间';

/*==============================================================*/
/* Table: INCIDENTPLANSTEPS  应急事件预案处置步骤                                       */
/*==============================================================*/

-- Create table
create table INCIDENTPLANSTEPS
(
  ID                 NUMBER(10) not null,
  INCIDENTDEALPLANID NUMBER(10) not null,
  SEQINDEX           NUMBER(3) not null,
  CONTENT            VARCHAR2(1500) not null,
  CREATEUSER         VARCHAR2(30) not null,
  UPDATEUSER         VARCHAR2(30),
  CREATEDATE         DATE not null,
  UPDATEDATE         DATE
);

-- Add comments to the table
comment on table INCIDENTPLANSTEPS
  is '应急事件预案处置步骤';
-- Add comments to the columns
comment on column INCIDENTPLANSTEPS.INCIDENTDEALPLANID
  is '应急事件预案ID';
comment on column INCIDENTPLANSTEPS.SEQINDEX
  is '顺序';
comment on column INCIDENTPLANSTEPS.CONTENT
  is '处置内容';
comment on column INCIDENTPLANSTEPS.CREATEUSER
  is '创建用户';
comment on column INCIDENTPLANSTEPS.UPDATEUSER
  is '修改用户';
comment on column INCIDENTPLANSTEPS.CREATEDATE
  is '创建时间';
comment on column INCIDENTPLANSTEPS.UPDATEDATE
  is '修改时间';




/*==============================================================*/
/* Table: PATELCONFIGER  工作台配置                                       */
/*==============================================================*/

-- Create table

create table patelConfiger (
   userid number(10) not null,
   keyName varchar2(60) not null,
   patelConfigerindex number(10) not null,
   tabKeyName varchar2(60),
   tabConfigerindex number(10) ,
   constraint fkpatelConfiger foreign key (userid)
    references users (id),
   constraint patelConfiger_unique unique(userid,keyName,tabKeyName)
);

create index patelConfiger_index on patelConfiger(
   userid
);
comment on table PATELCONFIGER
  is '工作台配置 ';
-- Add comments to the columns
comment on column PATELCONFIGER.USERID
  is '用户ID';
comment on column PATELCONFIGER.keyName
  is '常用设置keyName';
comment on column PATELCONFIGER.patelConfigerindex
  is '常用设置序号';
comment on column PATELCONFIGER.tabKeyName
  is '标签设置keyName';
comment on column PATELCONFIGER.tabConfigerindex
  is '标签设置序号';

  /*==============================================================*/
/* Table: workMemo  工作备忘录                                         */
/*==============================================================*/

  -- Create sequence
  create sequence s_WorkMemo
	increment by 1
	start with 1
 	minvalue 1
 	cache 20
 	maxvalue 9999999999;
-- Create table
create table workMemo(
id          number(10)          not null,
userId      number(10)          not null,
addMemoDate   DATE              not null,
memoContents  varchar2(200)     not null,
createUser    VARCHAR2(32)      not null,
updateUser    VARCHAR2(32),
createDate      DATE             not null,
updateDate      DATE
);
-- Add comments to the table
comment on table WORKMEMO
  is '工作备忘录 ';
-- Add comments to the columns
comment on column WORKMEMO.USERID
  is '用户ID';
comment on column WORKMEMO.ADDMEMODATE
  is '添加备忘录的日期';
comment on column WORKMEMO.MEMOCONTENTS
  is '备忘录内容';

/*==============================================================*/
/* Table: publicNoticeAttachFiles     通知通报附件表                                                                                                            */
/*==============================================================*/


create sequence s_publicNoticeAttachFiles
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
-- Create table
create table publicNoticeAttachFiles
(
  ID                      NUMBER(10)    not null,
  noticeId                NUMBER(10)    not null,
  CREATEUSER              VARCHAR2(30)  not null,
  UPDATEUSER              VARCHAR2(30)  ,
  CREATEDATE              DATE          not null,
  UPDATEDATE              DATE          ,
  fileName                varchar2(300)  not null,
  fileActualUrl           VARCHAR2(300)  not null,

  constraint pkpublicNoticeAttachFiles primary key (ID),
  constraint fkpublicNoticeAttachFiles foreign key (noticeId)
         references publicNotice (id)
);

----add comments to publicNoticeAttachFiles table
comment on table publicNoticeAttachFiles
  is '通知通报附件表';
----add comments to publicNoticeAttachFiles colummn
comment on column publicNoticeAttachFiles.ID
  is '通知通报附件ID';
comment on column publicNoticeAttachFiles.noticeId
  is '通知通报ID';
comment on column publicNoticeAttachFiles.CREATEUSER
  is '创建用户';
comment on column publicNoticeAttachFiles.UPDATEUSER
  is '修改用户';
comment on column publicNoticeAttachFiles.CREATEDATE
  is '创建时间';
comment on column publicNoticeAttachFiles.UPDATEDATE
  is '修改时间';
comment on column publicNoticeAttachFiles.fileName
  is '通知通报附件名';
comment on column publicNoticeAttachFiles.fileActualUrl
  is '通知通报附件路径';


/*==============================================================*/
/* Table: INCIDENTS  应急事件                                       */
/*==============================================================*/


-- Create table
create table INCIDENTS
(
  ID           NUMBER(10) not null,
  TITLE        VARCHAR2(150) not null,
  CATEGORY     NUMBER(10) not null,
  SUBDIVISION  NUMBER(10) not null,
  DEGREE       NUMBER(10),
  SOURCETYPE   VARCHAR2(150) not null,
  APPLICANT    VARCHAR2(32) not null,
  APPLYDATE    DATE not null,
  OCCURADDRESS VARCHAR2(150) not null,
  RANGE        VARCHAR2(60) not null,
  CONTENT      CLOB not null,
  STATUS       NUMBER(3) not null,
  INCIDENT     NUMBER(1),
  CENSORREASON VARCHAR2(2400),
  CREATEUSER   VARCHAR2(30) not null,
  UPDATEUSER   VARCHAR2(30),
  CREATEDATE   DATE not null,
  UPDATEDATE   DATE,
  SOURCE       VARCHAR2(150),
  AUDITER      VARCHAR2(32),
  AUDITDATE    DATE,
  BUILDINGID   VARCHAR2(30),
  CENTERX      NUMBER(10),
  CENTERY 	   NUMBER(10)
);

-- Add comments to the table
comment on table INCIDENTS
  is '应急事件';
-- Add comments to the columns
comment on column INCIDENTS.TITLE
  is '预警标题';
comment on column INCIDENTS.CATEGORY
  is '大类';
comment on column INCIDENTS.SUBDIVISION
  is '小类';
comment on column INCIDENTS.DEGREE
  is '级别';
comment on column INCIDENTS.SOURCETYPE
  is '事件来源';
comment on column INCIDENTS.APPLICANT
  is '提交人';
comment on column INCIDENTS.APPLYDATE
  is '提交日期';
comment on column INCIDENTS.OCCURADDRESS
  is '事发地点';
comment on column INCIDENTS.RANGE
  is '影响范围';
comment on column INCIDENTS.CONTENT
  is '事件详细情况';
comment on column INCIDENTS.STATUS
  is '状态';
comment on column INCIDENTS.INCIDENT
  is '是否需要启动预案';
comment on column INCIDENTS.CENSORREASON
  is '解除原因';
comment on column INCIDENTS.CREATEUSER

  is '创建用户';
comment on column INCIDENTS.UPDATEUSER
  is '修改用户';
comment on column INCIDENTS.CREATEDATE
  is '创建时间';
comment on column INCIDENTS.UPDATEDATE
  is '修改时间';
comment on column INCIDENTS.SOURCE
  is '来源';
comment on column INCIDENTS.AUDITER
  is '审核人';
comment on column INCIDENTS.AUDITDATE
  is '审核时间';


/*==============================================================*/
/* Table: INCIDENTSTEPS  应急事件处置步骤                         */
/*==============================================================*/

  -- Create table
create table INCIDENTSTEPS
(
  ID            NUMBER(10) not null,
  INCIDENTID    NUMBER(10) not null,
  EXECUTEDATE   DATE ,
  EXECUTED      NUMBER(1) not null,
  EXECUTEUSER   VARCHAR2(32),
  STEPTYPE      NUMBER(10) not null,
  SEQINDEX      NUMBER(3) not null,
  PLANCONTENT   VARCHAR2(2400),
  ACTUALCONTENT VARCHAR2(2400),
  CREATEUSER    VARCHAR2(30) not null,
  UPDATEUSER    VARCHAR2(30),
  CREATEDATE    DATE not null,
  UPDATEDATE    DATE,
  STEPNAME      VARCHAR2(150)
);

-- Add comments to the table
comment on table INCIDENTSTEPS
  is '应急事件处置步骤';
-- Add comments to the columns
comment on column INCIDENTSTEPS.INCIDENTID
  is '应急事件Id';
comment on column INCIDENTSTEPS.EXECUTEDATE
  is '执行时间';
comment on column INCIDENTSTEPS.EXECUTED
  is '是否执行';
comment on column INCIDENTSTEPS.EXECUTEUSER
  is '执行人';
comment on column INCIDENTSTEPS.STEPTYPE
  is '步骤类型';
comment on column INCIDENTSTEPS.SEQINDEX
  is '顺序';
comment on column INCIDENTSTEPS.PLANCONTENT
  is '预案处置内容';
comment on column INCIDENTSTEPS.ACTUALCONTENT
  is '实际处置内容';
comment on column INCIDENTSTEPS.CREATEUSER
  is '创建用户';
comment on column INCIDENTSTEPS.UPDATEUSER
  is '修改用户';
comment on column INCIDENTSTEPS.CREATEDATE
  is '创建时间';
comment on column INCIDENTSTEPS.UPDATEDATE
  is '修改时间';
comment on column INCIDENTSTEPS.STEPNAME
  is '步骤名称';

create sequence s_EventSource
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
/*==============================================================*/
/* Table: eventSource 社情民意中心 录入的事件信息                 					    */
/*==============================================================*/
create table eventSource
(
  ID                      NUMBER(10)     	not null,
  title                   VARCHAR2(60)   	not null,
  content                 VARCHAR2(600)  	not null,
  sourceDate              DATE  ,
  sourcePeople            VARCHAR2(60)   	not null,
  telephone               VARCHAR2(60) ,
  orgName                 VARCHAR2(60)  	not null,
  sourceType              NUMBER(10)  		not null,
  state                   NUMBER(10),
  createUser              VARCHAR2(32)      not null,
  updateUser              VARCHAR2(32),
  createDate              DATE             	not null,
  updateDate              DATE,
  serialNumber           VARCHAR2(20),
  constraint pkEventSource primary key (ID)
);

comment on table EVENTSOURCE  
 is '社情民意中心 录入的事件信息    ';
comment on column EVENTSOURCE.TITLE
  is '标题';
comment on column EVENTSOURCE.CONTENT
  is '内容';
comment on column EVENTSOURCE.SOURCEDATE
  is '来源日期';
comment on column EVENTSOURCE.SOURCEPEOPLE
  is '来源人';
comment on column EVENTSOURCE.TELEPHONE
  is '联系电话';
comment on column EVENTSOURCE.ORGNAME
  is '所属区域';
comment on column EVENTSOURCE.SOURCETYPE
  is '来源类型';
comment on column EVENTSOURCE.STATE
  is '状态';
comment on column EVENTSOURCE.CREATEUSER
  is '创建用户';
comment on column EVENTSOURCE.UPDATEUSER
  is '修改用户';
comment on column EVENTSOURCE.CREATEDATE
  is '创建时间';
comment on column EVENTSOURCE.UPDATEDATE
  is '修改时间';
comment on column EVENTSOURCE.SERIALNUMBER
  is '转入事件后生成的服务单号';


/*==============================================================*/
/* Table: IncidentStepFeedbacks 应急事件处置反馈                         				*/
/*==============================================================*/

  -- Create table
create table INCIDENTSTEPFEEDBACKS
(
  ID             NUMBER(10) not null,
  INCIDENTSTEPID NUMBER(10) not null,
  FEEDBACKUSER   VARCHAR2(32) not null,
  FEEDBACKDATE   DATE not null,
  CONTENT        VARCHAR2(1500)not null
);
-- Add comments to the table
comment on table INCIDENTSTEPFEEDBACKS
  is '应急事件处置反馈';
-- Add comments to the columns
comment on column INCIDENTSTEPFEEDBACKS.INCIDENTSTEPID
  is '处置步骤ID';
comment on column INCIDENTSTEPFEEDBACKS.FEEDBACKUSER
  is '反馈人';
comment on column INCIDENTSTEPFEEDBACKS.FEEDBACKDATE
  is '反馈时间';
comment on column INCIDENTSTEPFEEDBACKS.CONTENT
  is '反馈内容';



 -- Create table
 create table CALLSERVICETEAM
 (
 	ID             NUMBER(10) 		not null,
 	NAME		   VARCHAR2(60)		not null,
    SIMPLEPINYIN   VARCHAR2(10),
    FULLPINYIN     VARCHAR2(30),
 	ADDRESS        VARCHAR2(150)    not null,
 	CORPORATION    VARCHAR2(60)		not null,
 	MOBILENUMBER   VARCHAR2(50)     not null,
 	SERVICECONTENT VARCHAR2(1500)   not null,
 	CREATEUSER     VARCHAR2(30)     not null,
    UPDATEUSER     VARCHAR2(30),
    CREATEDATE     DATE             not null,
    UPDATEDATE     DATE
 );

 -- Add comments to the table
 comment on table CALLSERVICETEAM
 is '呼叫中心 服务团队';
-- Add comments to the columns
 comment on column CALLSERVICETEAM.ID
 is '服务团队ID';
 comment on column CALLSERVICETEAM.NAME
 is '服务团队名称';
 comment on column CALLSERVICETEAM.ADDRESS
 is '服务团队地址';
 comment on column CALLSERVICETEAM.CORPORATION
 is '服务团队法人';
 comment on column CALLSERVICETEAM.MOBILENUMBER
 is '服务团队联系电话';
 comment on column CALLSERVICETEAM.SERVICECONTENT
 is '服务团队服务内容';
 comment on column CALLSERVICETEAM.CREATEUSER
  is '创建用户';
comment on column CALLSERVICETEAM.UPDATEUSER
  is '修改用户';
comment on column CALLSERVICETEAM.CREATEDATE
  is '创建时间';
comment on column CALLSERVICETEAM.UPDATEDATE
  is '修改时间';


/*==============================================================*/
/* S_directorySettings                                    */
/*==============================================================*/

create sequence s_directorySettings
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

/*==============================================================*/
/* Table: directorySettings                               */
/*==============================================================*/
create table directorySettings(
     ID                   NUMBER(10)				   not null,
     RESOURCEPOOLTYPE     NUMBER(10),
     PARENTID			  NUMBER(10),
     NAME                 VARCHAR2(30)                 not null,
     USERID    			  NUMBER(10),
     fullPinyin           VARCHAR2(300),
     simplePinyin         VARCHAR2(100),
     indexId              NUMBER(10)                   default 1 not null,
     createUser           VARCHAR2(32),
     updateUser           VARCHAR2(32),
     createDate           DATE,
     updateDate           DATE,
     rank    			  NUMBER(10),
     directoryType        NUMBER(10)     				not null,
     constraint pkDirectorySettings primary key (id)
);

-- Add comments to the table
comment on table directorySettings
  is '资料库目录';
-- Add comments to the columns
comment on column directorySettings.ID
  is '物理ID';
comment on column directorySettings.RESOURCEPOOLTYPE
  is '资料库类型';
comment on column directorySettings.PARENTID
  is '上级个人目录';
comment on column directorySettings.NAME
  is '目录名称';
comment on column directorySettings.USERID
  is '创建目录人ID';
  comment on column directorySettings.fullPinyin
  is '全拼';
comment on column directorySettings.simplePinyin
  is '简拼';
comment on column directorySettings.indexId
  is '排序';
  comment on column directorySettings.rank
  is '目录级数';
  comment on column directorySettings.directoryType
  is '目录类型';

  /*==============================================================*/
/* S_departmentGrops                                  */
/*==============================================================*/
create sequence S_myDepartmentGrops
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;
 /*================================================================*/
/* Table:departmentGrops                                           */
/*================================================================*/
create table  myDepartmentGrops
 (
  ID               NUMBER(10) not null,
  NAME             VARCHAR2(450) not null,
  fullPinyin           VARCHAR2(1000),
  simplePinyin         VARCHAR2(450),
  orgId           NUMBER(10) not null,
  groupMembers    CLOB,
  CREATEUSER       VARCHAR2(32),
  UPDATEUSER       VARCHAR2(32),
  CREATEDATE       DATE not null,
  UPDATEDATE       DATE,
  constraint PKmyDepartmentGrops primary key (ID)
);
 -- Add comments to the table
comment on table myDepartmentGrops
  is '我的部门';
-- Add comments to the columns
comment on column myDepartmentGrops.ID
  is '物理id';
  comment on column myDepartmentGrops.NAME
  is '部门规范统称';
  comment on column myDepartmentGrops.orgId
  is '创建部门';
  comment on column myDepartmentGrops.groupMembers
  is '群部门成员';

    /*==============================================================*/
/* S_departmentGrops                                  */
/*==============================================================*/
create sequence S_optionalObjs
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;
 /*================================================================*/
/* Table:optrionalObjs                                           */
/*================================================================*/
create table  optionalObjs
 (
  ID               NUMBER(10) not null,
  documentId       NUMBER(10) not null,
  optionalOrgIds   VARCHAR2(1000),
  postObj          VARCHAR2(10) not null,
  constraint PKoptionalObjs primary key (ID)
);
 -- Add comments to the table
comment on table optionalObjs
  is '手动输入部门';
-- Add comments to the columns
comment on column optionalObjs.ID
  is '物理id';
  comment on column optionalObjs.documentId
  is '文件Id';
  comment on column optionalObjs.optionalOrgIds
  is '手动输入的部门ID';
  comment on column optionalObjs.postObj
  is '发文对象是主送还是抄送';

      /*==============================================================*/
/* S_groupObjs                                  */
/*==============================================================*/
create sequence S_groupObjs
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;
 /*================================================================*/
/* Table:groupObjs                                           */
/*================================================================*/
create table  groupObjs
 (
  ID               NUMBER(10) not null,
  documentId       NUMBER(10) not null,
  departmentGroupId   NUMBER(10) not null,
  deleteState      NUMBER(10) not null,
  postObj          VARCHAR2(10) not null,
  constraint PKgroupObjs primary key (ID)
);
 -- Add comments to the table
comment on table groupObjs
  is '发文对象群部门';
-- Add comments to the columns
comment on column groupObjs.ID
  is '物理id';
  comment on column groupObjs.documentId
  is '文件Id';
  comment on column groupObjs.departmentGroupId
  is '部门群ID';
  comment on column groupObjs.deleteState
  is '删除状态';
  comment on column groupObjs.postObj
  is '发文对象是主送还是抄送';


 /*==============================================================*/
/* S_myProfiles                                    */
/*==============================================================*/

create sequence s_myProfiles
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

 /*==============================================================*/
/* Table: myProfiles                              */
/*==============================================================*/
create table  myProfiles
 (
  ID               NUMBER(10) not null,
  ORGID            NUMBER(10) not null,
  RESOURCEPOOLTYPE NUMBER(10) not null,
  ORGINTERNALCODE  VARCHAR2(32) not null,
  NAME             VARCHAR2(450) not null,
  fullPinyin           VARCHAR2(1000),
  simplePinyin         VARCHAR2(450),
  userId           NUMBER(10) not null,
  RELEASETIME      DATE ,
  RELEASEUNIT      VARCHAR2(150) ,
  FILENO           VARCHAR2(50),
  DOCUMENTSUBJECT  VARCHAR2(150),
  CONTENT          CLOB,
  CREATEUSER       VARCHAR2(32) not null,
  UPDATEUSER       VARCHAR2(32),
  CREATEDATE       DATE not null,
  UPDATEDATE       DATE,
  underJurisdiction             NUMBER(1)         default 0 not null,
  sendMessage	   NUMBER(1) ,
  shareState       NUMBER(1)                 not null,
  shareDirectoryId   NUMBER(10),
  shareDate           DATE,
  source            VARCHAR2(60),
  constraint PKmyProfiles primary key (ID)
);
  -- Add comments to the table
comment on table myProfiles
  is '我的资料';
-- Add comments to the columns
comment on column myProfiles.ID
  is '物理id';
comment on column myProfiles.ORGID
  is '所属网格';
comment on column myProfiles.RESOURCEPOOLTYPE
  is '资料类型';
comment on column myProfiles.ORGINTERNALCODE
  is '网格内置编码';
comment on column myProfiles.NAME
  is '名称';
comment on column myProfiles.fullPinyin
  is '全拼';
comment on column myProfiles.simplePinyin
  is '简拼';
comment on column myProfiles.userId
  is '创建者Id';
comment on column myProfiles.RELEASETIME
  is '时间（发文时间）';
comment on column myProfiles.RELEASEUNIT
  is '发文单位（所属单位）';
comment on column myProfiles.FILENO
  is '文件号';
comment on column myProfiles.DOCUMENTSUBJECT
  is '文件主题';
comment on column myProfiles.CONTENT
  is '内容';
comment on column myProfiles.sendMessage
  is '是否发送消息';
 comment on column myProfiles.shareDate
  is '共享时间';
  comment on column myProfiles.source
  is '来源';


  /*==============================================================*/
/* S_myProfileAttachfiles                                   */
/*==============================================================*/

create sequence S_myProfileAttachfiles
increment by 1
start with 1
minvalue 1
cache 20
maxvalue 9999999999;
/*==============================================================*/
/* Table: myProfileAttachfiles                               */
/*==============================================================*/
create table myProfileAttachfiles
(
  ID             NUMBER(10) not null,
  myProfileId NUMBER(10),
  fileSize       NUMBER(10),
  fileName       VARCHAR2(150) not null,
  fileActualURL  VARCHAR2(250) not null,
  createUser     VARCHAR2(32) not null,
  updateUser     VARCHAR2(32),
  createDate     DATE not null,
  updateDate     DATE,
  constraint PKmyProfileAttachfiles primary key (ID)
);
-- Add comments to the table
comment on table myProfileAttachfiles
  is '我的资料附件';
-- Add comments to the columns
comment on column myProfileAttachfiles.ID
  is '物理ID';
comment on column myProfileAttachfiles.myProfileId
  is '我的资料ID';
comment on column myProfileAttachfiles.fileSize
  is '文件大小';
comment on column myProfileAttachfiles.fileName
  is '文件名称';
comment on column myProfileAttachfiles.fileActualURL
  is '文件路径';
-- Create/Recreate primary, unique and foreign key constraints

alter table myProfileAttachfiles
  add constraint FKmyProfileAttachfiles foreign key (myProfileId)
  references myProfiles (ID);

  create table userHasMyProfilePermissions (
   orgId                NUMBER(10)                      not null,
   myProfileId       NUMBER(10)                      not null,
   constraint FKuserHasMyProfilePermissions foreign key (myProfileId)
  references myProfiles (ID)
);
comment on table userhasmyprofilepermissions
  is '共享资料权限表（共享给谁）';
/*==============================================================*/
/* s_groupfamily                                    			*/
/*==============================================================*/

  

  
  
create sequence s_groupfamily
increment by 1
start with 1
minvalue 1
cache 10
maxvalue 9999999999;
/*==============================================================*/
/* Table: GROUPFAMILY                                           */
/*==============================================================*/
create table groupfamily
(
  id               		NUMBER(10) 					not null,
  orginternalcode       VARCHAR2(32)  				not null,
  familyaccount    		VARCHAR2(150) 				not null,
  familymaster     		VARCHAR2(60),
  mastercardno     		VARCHAR2(60),
  mastermobilenumber    VARCHAR2(30),
  mastertelephone  		VARCHAR2(30),
  membersCount          NUMBER(10)  default 0 not null,
  fullPinyin           VARCHAR2(60),
  simplePinyin         VARCHAR2(20),
  CREATEUSER       		VARCHAR2(32) 				not null,
  UPDATEUSER       		VARCHAR2(32),
  CREATEDATE       		DATE 						not null,
  UPDATEDATE      		DATE,
  constraint PKGROUPFAMILY primary key (id)
);
-- Add comments to the table
comment on table GROUPFAMILY
  is '团体家庭';
comment on column GROUPFAMILY.id
  is '团体家庭id';
comment on column GROUPFAMILY.orginternalcode
  is '所属网格编号';
comment on column GROUPFAMILY.familyaccount
  is '家庭编号';
comment on column GROUPFAMILY.familymaster
  is '家长姓名';
comment on column GROUPFAMILY.mastercardno
  is '家长身份号';
comment on column GROUPFAMILY.membersCount
  is '家庭成员数';
comment on column GROUPFAMILY.fullPinyin
  is '家长姓名全拼';
 comment on column GROUPFAMILY.simplePinyin
  is '家长姓名简拼';
comment on column GROUPFAMILY.mastermobilenumber
  is '联系手机';
comment on column GROUPFAMILY.mastertelephone
  is '固定电话';

/*==============================================================*/
/* Index: idx_O_orgCodeAndFamilyaccount                             */
/*==============================================================*/
create unique index idx_O_orgCodeAndFamilyaccount on groupfamily (
   orginternalcode ASC,
   familyaccount ASC
);
/*==============================================================*/
/* Table: groupfamilyhaspopulation                              */
/*==============================================================*/
create table groupfamilyhaspopulation
(
  familyid             NUMBER(10)           not null,
  familyrelation       NUMBER(10),
  populationid         NUMBER(15)         	not null,
  populationtype       VARCHAR2(30)         not null
);
-- Add comments to the table
comment on table groupfamilyhaspopulation
  is '团体家庭人员关系';
comment on column groupfamilyhaspopulation.familyid
  is '团体家庭id';
comment on column groupfamilyhaspopulation.familyrelation
  is '团体家庭关系';
comment on column groupfamilyhaspopulation.populationid
  is '人员的id';
comment on column groupfamilyhaspopulation.populationtype
  is '人员的类型';


 /*==============================================================*/
/* Table: JOBMONITOR                              */
/*==============================================================*/
create table JOBMONITOR
(
  id        NUMBER(10) not null,
  jobname   VARCHAR2(4000) not null,
  startdate DATE not null,
  entdate   DATE,
  remark    VARCHAR2(4000),
  success   NUMBER(1),
  constraint pk_JOBMONITOR primary key (id)
);
-- Add comments to the columns
comment on column JOBMONITOR.id
  is 'id';
comment on column JOBMONITOR.jobname
  is 'job名称';
comment on column JOBMONITOR.startdate
  is '开始时间';
comment on column JOBMONITOR.entdate
  is '结束时间';
comment on column JOBMONITOR.remark
  is '备注';
comment on column JOBMONITOR.success
  is '是否成功';



  /* Table: documents                            */
/*==============================================================*/
create table documents
(
  id                NUMBER(10) 			not null,
  orgId             NUMBER(10)          not null,
  title       		VARCHAR2(450) 		not null,
  documentNo       	VARCHAR2(150),
  dispatchState     VARCHAR2(60),
  dispatchDate      DATE,
  transmitDate      DATE,
  dispatchUnit		VARCHAR2(150),
  theme       		VARCHAR2(150),
  secretDegree 		NUMBER(10),
  urgentDegree		NUMBER(10),
  synchroDocs       NUMBER(2) default 0 not null,
  attachFiles       NUMBER(2) default 0 not null,
  contents			clob,
  fullPinyin        VARCHAR2(40),
  simplePinyin      VARCHAR2(20),
  createUser        VARCHAR2(32)        not null,
  updateUser        VARCHAR2(32),
  createDate        DATE                not null,
  updateDate        DATE,
  constraint PKdocuments primary key (id)
);
-- Add comments to the table
comment on table documents
  is '公文';
comment on column documents.id
  is '公文id';
comment on column documents.orgId
  is '所属网格';
comment on column documents.title
  is '文件标题';
comment on column documents.documentNo
  is '文件号';
comment on column documents.dispatchState
  is '发文状态';
comment on column documents.dispatchDate
  is '发文日期';
 comment on column documents.transmitDate
  is '转发日期';
comment on column documents.createDate
  is '创建时间';
comment on column documents.dispatchUnit
  is '发文单位';
comment on column documents.theme
  is '主题词';
comment on column documents.secretDegree
  is '机密程度';
comment on column documents.urgentDegree
  is '紧急程度';
comment on column documents.synchroDocs
  is '是否同步资料库';
comment on column documents.attachFiles
  is '是否有附件';
comment on column documents.contents
  is '内容';
comment on column documents.fullPinyin
  is '全拼';
comment on column documents.simplePinyin
  is '简拼';

  /* Table: documentsHasOrg                            */
/*==============================================================*/
create table documentsHasOrg
(
  documentsHasOrgId   NUMBER(10) 		not null,
  documentId        NUMBER(10) 			not null,
  organizationId    NUMBER(10) 			not null,
  signState       	VARCHAR2(60),
  signDate      	DATE,
  signer		    VARCHAR2(150),
  receiptContent    VARCHAR2(300),
  status            VARCHAR2(60),
  constraint fkdocumentsHasOrg foreign key (documentId)
  references documents (id),
  	constraint fkdocumentsHasOrgs foreign key (organizationId)
  references organizations (id),
   constraint PKdocumentsHasOrg primary key (documentsHasOrgId)
);
-- Add comments to the table
comment on table documentsHasOrg
  is '公文和部门的关联表的id';
comment on table documentsHasOrg
  is '公文和部门的关联表';
comment on column documentsHasOrg.documentId
  is '公文id';
comment on column documentsHasOrg.organizationId
  is '部门id';
comment on column documentsHasOrg.signState
  is '签收状态';
comment on column documentsHasOrg.signDate
  is '签收日期';
comment on column documentsHasOrg.signer
  is '签收人';
comment on column documentsHasOrg.receiptContent
  is '回执内容';
  comment on column documentsHasOrg.status
  is '主送或抄送状态';


create sequence s_documentsHasUsers
increment by 1
start with 1
minvalue 1
cache 10
maxvalue 9999999999;
  /* Table: documentsHasUsers                            */
/*==============================================================*/
  create table documentsHasUsers
  (
  documentsHasUserId  NUMBER(10) 		not null,
  documentsHasOrgId   NUMBER(10) 		not null,
  documentId        NUMBER(10) 			not null,
  userId    		NUMBER(10) 			not null,
  readState       	NUMBER(2) default 0 not null,
  readDate          DATE,
  constraint fkdocumentsHasUser foreign key (documentId)
  references documents (id),
  	constraint fkdocumentsHasUsers foreign key (userId)
  references users (id),
   constraint PKdocumentsHasUsers primary key (documentsHasUserId)
);
-- Add comments to the table
comment on table documentsHasUsers
  is '公文和用户的关联表';
comment on column documentsHasUsers.documentsHasUserId
  is '自身的主键id';
comment on column documentsHasUsers.userId
  is '用户id';
comment on column documentsHasUsers.readState
  is '阅读状态';
comment on column documentsHasUsers.readDate
  is '阅读时间';

create table ITEMS
(
  ID           NUMBER(10) not null,
  itemNumber   VARCHAR2(90) not null,
  itemName     VARCHAR2(300) not null,
  promiseTime  NUMBER(3) not null,
  legalTime    NUMBER(3) not null,
  isFees       NUMBER(1) default 0 not null,
  standardFees NUMBER(10,2),
  fullPinyin           VARCHAR2(2000),
  simplePinyin         VARCHAR2(500),
  matterKind   NUMBER(10) not null,
  REMARK       CLOB,
  LEGALBASIS   CLOB,
  LAWGUIDE     CLOB,
  CREATEUSER              VARCHAR2(30)   not null,
  UPDATEUSER              VARCHAR2(30),
  CREATEDATE              DATE           not null,
  UPDATEDATE              DATE,
  constraint pk_items_id primary key  (id)
);

-- Add comments to the table
comment on table ITEMS
  is '审批事项表';
-- Add comments to the columns
comment on column ITEMS.itemNumber
  is '事项编号';
comment on column ITEMS.itemName
  is '事项名称';
comment on column ITEMS.fullPinyin
  is '全拼';
comment on column ITEMS.simplePinyin
  is '简拼';
comment on column ITEMS.promiseTime
  is '承诺时限';
comment on column ITEMS.LEGALTIME
  is '法定时限';
comment on column ITEMS.ISFEES
  is '是否收费项目';
comment on column ITEMS.STANDARDFEES
  is '收费标准';
comment on column ITEMS.MATTERKIND
  is '事项类别';
comment on column ITEMS.REMARK
  is '事项备注';
comment on column ITEMS.LEGALBASIS
  is '法定依据';
comment on column ITEMS.LAWGUIDE
  is '办事指南';

/* Table: moduelClickCounts */
create table moduelClickCounts  (
   id                	NUMBER(10)    		not null,
   userId             	NUMBER(10)			not null,
   permissionId         NUMBER(10)          not null,
   clickTimes           NUMBER(10)          not null,
   constraint pkModuelClickCounts primary key (id),
   constraint fkModuelClickCounts foreign key (permissionId)
         references permissions (id)
);
-- Add comments to the table
comment on table moduelClickCounts is
'模块点击次数统计';
-- Add comments to the columns
comment on column moduelClickCounts.userId is
'点击用户Id';

comment on column moduelClickCounts.permissionId is
'模块Id';

comment on column moduelClickCounts.clickTimes is
'模块点击次数';

create table ITEMATTACHMENTS
(
  ID               NUMBER(10) not null,
  itemid           NUMBER(10) not null,
  FILENAME         VARCHAR2(90),
  FILEACTUALURL    VARCHAR2(300),
  CREATEUSER       VARCHAR2(32),
  UPDATEUSER       VARCHAR2(32),
  UPDATEDATE       DATE,
  CREATEDATE       DATE,
  constraint pk_ITEMATTACHMENT_id primary key  (id),
  constraint FK_approvalMatterId foreign key (itemid)
         references items (id)
);

-- Add comments to the table
comment on table ITEMATTACHMENTS
  is '事项附件表';
-- Add comments to the columns
comment on column ITEMATTACHMENTS.ITEMID
  is '事项id';
comment on column ITEMATTACHMENTS.FILENAME
  is '附件名称';
comment on column ITEMATTACHMENTS.FILEACTUALURL
  is '附件路径';

create table APPROVALITEMS
(
  ID               NUMBER(10) not null,
  APPROVALNUMBER   VARCHAR2(90) not null,
  NAME             VARCHAR2(90) not null,
  IDCARDNO         VARCHAR2(60) not null,
  MOBILENUMBER     VARCHAR2(60),
  CURRENTADDRESS   VARCHAR2(600),
  ITEMID           NUMBER(10) not null,
  CREATEUSER       VARCHAR2(32),
  UPDATEUSER       VARCHAR2(32),
  STATUS		   NUMBER(10) not null,
  orginternalcode  VARCHAR2(32) not null,
  orgId            NUMBER(10) not null,
  CREATEORG		   NUMBER(10) not null,
  CREATEORGCODE	   VARCHAR2(32) not null,
  UPDATEDATE       DATE,
  CREATEDATE       DATE,
  REMARK           CLOB,
  constraint pk_approvalitems_id primary key  (id),
  constraint fk_app_rovalmatterid foreign key (itemId)
         references items (id)
);

-- Add comments to the table
comment on table ApprovalItems
  is '申请审批表';
-- Add comments to the columns
comment on column ApprovalItems.APPROVALNUMBER
  is '编号';
  comment on column ApprovalItems.STATUS
  is '状态';
comment on column ApprovalItems.NAME
  is '申请人名称';
comment on column ApprovalItems.IDCARDNO
  is '申请人身分证';
comment on column ApprovalItems.MOBILENUMBER
  is '手机号码';
comment on column ApprovalItems.CURRENTADDRESS
  is '详细地址';
comment on column ApprovalItems.ITEMID
  is '事项id';
comment on column ApprovalItems.REMARK
  is '备注';
comment on column ApprovalItems.orginternalcode
  is '办理网格code';
comment on column ApprovalItems.orgId
  is '办理网格id';
comment on column ApprovalItems.CREATEORG
  is '创建网格id';
comment on column ApprovalItems.CREATEORGCODE
  is '创建网格code';

create sequence s_dailyDirectoryAttachFiles
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create table dailyDirectoryAttachFiles(
       fileId NUMBER(10)                      not null,
       dailyDirectoryId NUMBER(10)            not null,
       dailyYearId NUMBER(10)                 not null,
       fileName VARCHAR2(180)                 not null,
       fileActualUrl VARCHAR2(512)            not null,
       fileSize NUMBER(10),
       constraint pkDirectoryAttachFiles primary key (fileId)
);
comment on table dailyDirectoryAttachFiles is
'台帐目录附件表 ';
comment on column dailyDirectoryAttachFiles.dailyDirectoryId is
'台帐目录id ';
comment on column dailyDirectoryAttachFiles.dailyYearId is
'台帐年度目录id';
comment on column dailyDirectoryAttachFiles.fileId is
'文件Id';
comment on column dailyDirectoryAttachFiles.fileName is
'文件名称';
comment on column dailyDirectoryAttachFiles.fileActualUrl is
'文件路径';
comment on column dailyDirectoryAttachFiles.fileSize is
'文件大小';

create table APPROVALITEMFILES
(
  ID               NUMBER(10) not null,
  APPROVALITEMID   NUMBER(10) not null,
  FILENAME         VARCHAR2(90),
  FILEACTUALURL    VARCHAR2(300),
  CREATEUSER       VARCHAR2(32),
  UPDATEUSER       VARCHAR2(32),
  UPDATEDATE       DATE,
  CREATEDATE       DATE,
  constraint pk_approvalitemfiles_id primary key  (id),
  constraint fk_approvalitemid foreign key (approvalitemid)
         references approvalitems (id)
);

-- Add comments to the table
comment on table APPROVALITEMFILES
  is '申请审批附件表';
-- Add comments to the columns
comment on column APPROVALITEMFILES.APPROVALITEMID
  is '事项id';
comment on column APPROVALITEMFILES.FILENAME
  is '附件名称';
comment on column APPROVALITEMFILES.FILEACTUALURL
  is '附件路径';


create sequence s_otherLocalesTemp
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
 /*==============================================================*/
/* Table: otherLocalesTemp                                          */
/*==============================================================*/
create table otherLocalesTemp  (
   id                   NUMBER(10)                      not null,
   orgId                NUMBER(10)                      not null,
   type                 NUMBER(10),
   contactPerson        VARCHAR2(60),
   orgInternalCode      VARCHAR2(32)                    not null,
   name                 VARCHAR2(60)                    not null,
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   address              VARCHAR2(150),
   mobileNumber         VARCHAR2(11),
   telephone            VARCHAR2(15),
   imgUrl               VARCHAR2(300),
   remark               VARCHAR2(600),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   isEmphasis           NUMBER(1)                      default 0,
   isEmphasisReason     VARCHAR2(300),
   isEmphasisDate       DATE,
   repeatState            NUMBER(1)                     not null,
   claimState             NUMBER(1),
   claimDate              Date,
   claimUserName          VARCHAR2(4000),
   claimUserId            NUMBER(10),
   claimOrgId             NUMBER(10),
   importDepartmentId     NUMBER(10)                     not null,
   oldOrgId				  NUMBER(10),
   inId					  NUMBER(10),
   attentionExtent      NUMBER(10),
   constraint pkotherLocalesTemp primary key (id),
   constraint fkOtherLocalesTempOrg foreign key (orgId)
         references organizations (id)
);

comment on table otherLocalesTemp is
'其他场所';

comment on column otherLocalesTemp.id is
'主键';

comment on column otherLocalesTemp.orgId is
'所属网格';

comment on column otherLocalesTemp.type is
'场所类型';

comment on column otherLocalesTemp.contactPerson is
'联系人';

comment on column otherLocalesTemp.orgInternalCode is
'所属网格内置编码';

comment on column otherLocalesTemp.name is
'场所名称';

comment on column otherLocalesTemp.fullPinyin is
'全拼';

comment on column otherLocalesTemp.simplePinyin is
'简拼';

comment on column otherLocalesTemp.address is
'场所地址';

comment on column otherLocalesTemp.mobileNumber is
'联系手机号码';

comment on column otherLocalesTemp.telephone is
'联系电话';

comment on column otherLocalesTemp.remark is
'备注';
comment on column otherLocalesTemp.repeatState is
'是否重复';

comment on column otherLocalesTemp.claimState is
'认领状态';

comment on column otherLocalesTemp.claimDate is
'认领日期';

comment on column otherLocalesTemp.claimUserName is
'认领人用户名';

comment on column otherLocalesTemp.claimUserId is
'认领人Id';

comment on column otherLocalesTemp.claimOrgId is
'认领人网格';

comment on column otherLocalesTemp.importDepartmentId is
'导入部门Id';

comment on column otherLocalesTemp.oldOrgId is
'刚导入时的所属网格Id';

comment on column otherLocalesTemp.inId is
'认领时插入到原库中数据id';

comment on column otherLocalesTemp.attentionExtent is
'关注程度：1.一般；2.中等；3.严重';  

 

create sequence s_viewObjectVo
increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create table viewObjectVos(
	   id number(10)						  not null,
       selectedRadio                          varchar2(100)   ,
       selectedCheckBoxStrs         		  varchar2(200)           ,
       selectedIdStrs              		 	  varchar2(4000),
       exclusiveIdStrs      				  varchar2(4000)         ,
       provinceNum    varchar2(10),
       cityNum        varchar2(10),
       districtNum    varchar2(10),
       townNum        varchar2(10),
       villageNum     varchar2(10),
       gridNum        varchar2(10),
       provinceFucDepartmentNum varchar2(10),
       cityFucDepartmentNum     varchar2(10),
       districtFucDepartmentNum varchar2(10),
       townFucDepartmentNum     varchar2(10),
       defProvinceNum    varchar2(10),
       defCityNum        varchar2(10),
       defDistrictNum    varchar2(10),
       defTownNum        varchar2(10),
       defVillageNum     varchar2(10),
       defGridNum        varchar2(10),
       defProvinceFucDepartmentNum varchar2(10),
       defCityFucDepartmentNum     varchar2(10),
       defDistrictFucDepartmentNum varchar2(10),
       defTownFucDepartmentNum     varchar2(10),
       constraint pkviewObjectVos primary key (id)
);
comment on table viewObjectVos is
'查看对象 ';
comment on column viewObjectVos.selectedRadio is
'选择了那个方式，全部，按层级等 ';
comment on column viewObjectVos.selectedCheckBoxStrs is
'选择了那个选择框，省，市，县';
comment on column viewObjectVos.selectedIdStrs is
'选择的组织机构的id,此时左边的input没有选择';
comment on column viewObjectVos.exclusiveIdStrs is
'忽略掉那些id';
comment on column viewObjectVos.provinceNum is
'实际选择的数量';
comment on column viewObjectVos.defProvinceNum is
'系统中默认的数量';


create sequence s_disputeissuedealAttachFiles
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

/*==============================================================*/
/* Table: disputeissuedealAttachFiles重大矛盾纠纷排查附件表               */
/*==============================================================*/
create table disputeissuedealAttachFiles (
   id                   NUMBER(10)                      not null,
   disputeissuedealId           NUMBER(10),
   fileName             VARCHAR2(150)                   not null,
   fileActualUrl        VARCHAR2(250)                   not null,
   fileSize             NUMBER(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint pkDisputeAttachFiles primary key (id),
   constraint fkDisputeAttachFiles foreign key (disputeissuedealId)
         references significantissuedeals (id)
);


create sequence s_builddatas
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create table builddatas
(
  ID      		  	NUMBER(10) not null,
  BUILDINGID      	VARCHAR2(32),
  ORGID      		NUMBER(10) not null,
  ORGINTERNALCODE 	VARCHAR2(32) not null,
  BUILDINGNAME    	VARCHAR2(150),
  BUILDINGADDRESS 	VARCHAR2(150),
  owner			  	VARCHAR2(60),
  responsibleperson VARCHAR2(60),
  phone				varchar2(30),
  buildingstructures number(32),
  CENTERX         	NUMBER(10),
  CENTERY         	NUMBER(10),
  isLayout			NUMBER(1)	default 0,
  CREATEUSER      	VARCHAR2(32) not null,
  UPDATEUSER      	VARCHAR2(32),
  CREATEDATE      	DATE not null,
  UPDATEDATE      	DATE,
  type				number(32) ,
  centerLon			VARCHAR2(32),
  centerLat			VARCHAR2(32),
  centerLon2		VARCHAR2(32),
  centerLat2		VARCHAR2(32),
  isPropertyManagement  number(1) ,
  constraint pkBuilddatas primary key (id),
  constraint fkBuilddatasOrg foreign key (ORGID)
         references organizations (id)
);
comment on table builddatas
  is '楼宇信息表';
comment on column builddatas.id
  is '表ID';
comment on column builddatas.BUILDINGID
  is '楼宇ID';
comment on column builddatas.ORGID
  is '所属网格';
comment on column builddatas.ORGINTERNALCODE
  is '所属网格编号';
comment on column builddatas.BUILDINGNAME
  is '楼宇名称';
comment on column builddatas.BUILDINGADDRESS
  is '楼宇地址';
comment on column builddatas.owner
  is '业主';
comment on column builddatas.responsibleperson
  is '负责人';
comment on column builddatas.buildingstructures
  is '建筑结构';
comment on column builddatas.phone
  is '联系电话';
comment on column builddatas.CENTERX
  is '楼宇中心坐标X';
comment on column builddatas.CENTERY
  is '楼宇中心坐标Y';
comment on column builddatas.isLayout
  is '是否有楼宇布局';
comment on column builddatas.CREATEUSER
  is '创建用户';
comment on column builddatas.UPDATEUSER
  is '修改用户';
comment on column builddatas.CREATEDATE
  is '创建日期';
comment on column builddatas.UPDATEDATE
  is '修改时间';
comment on column builddatas.type
  is '楼宇类型';
comment on column builddatas.centerLon
  is '楼宇经度';
comment on column builddatas.centerLat
  is '楼宇纬度';
comment on column builddatas.isPropertyManagement
  is '是否有物管';

create sequence s_BuildLayout
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;


create table BuildLayout(
   id                   NUMBER(10)                      not null,
   buildId				VARCHAR2(32)					not null,
   orgId                NUMBER(10)                      not null,
   orgInternalCode      VARCHAR2(32)                    not null,
   layoutRow            NUMBER(10)                      not null,
   layoutColumn			NUMBER(10)						not null,
   layoutColSpan		NUMBER(10)						not null,
   housePropertyId		NUMBER(10)						not null,
   buildType            NUMBER(1)                       not null, 
   keyPlaceType         varchar2(32),
   room					varchar2(150),
   totalRow				NUMBER(10)                      not null,
   totalColumn			NUMBER(10)						not null,
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   constraint pkBuildLayout primary key (id),
   constraint fkBuildLayout foreign key (orgid)
   references organizations (id)
);
comment on table BuildLayout is
'楼宇布局表';
comment on column BuildLayout.id is
'主键';
comment on column BuildLayout.buildId is
'楼宇ID';
comment on column BuildLayout.orgId is
'所属责任区ID';
comment on column BuildLayout.orgInternalCode is
'所属责任区编号';

comment on column BuildLayout.layoutRow is
'第几行';
comment on column BuildLayout.layoutColumn is
'第几列';
comment on column BuildLayout.layoutColSpan is
'占几列';
comment on column BuildLayout.housePropertyId is
'住房Id';
comment on column BuildLayout.buildType is
'建筑物类型 1房屋2单位3场所';
comment on column BuildLayout.keyPlaceType is
'重点场所类型';
comment on column BuildLayout.totalRow is
'布局行数';
comment on column BuildLayout.totalColumn is
'布局列数';
comment on column BuildLayout.createUser is
'创建用户';
comment on column BuildLayout.updateUser is
'修改用户';
comment on column BuildLayout.createDate is
'创建日期';
comment on column BuildLayout.updateDate is
'修改时间';

create sequence s_religion
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

/*==============================================================*/
/* Table: religion                                              */
/*==============================================================*/
create table religion  (
   id 					number(10)                      not null,
   orgId                number(10)                      not null,
   orgInternalCode      varchar2(32)                    not null,
   religiousPlaces      varchar2(60),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   subordinateReligious number(10),
   dutyPeople           varchar2(60),
   placeType            number(10),
   mobilePone           varchar2(30),
   familyPhone          varchar2(30),
   address              varchar2(150),
   hiddenTrouble        varchar2(150),
   remarkMessage        varchar2(600),
   createUser           varchar2(32)                    not null,
   updateUser           varchar2(32),
   createDate           date                            not null,
   updateDate           date,
   idCardNo				varchar2(18),
   someone				varchar2(600),
   capitalSource		varchar2(150),
   area					NUMBER(8,1),
   rightful				NUMBER(1)                      default 0,
   peopleNumber			NUMBER(10),
   isEmphasis 			number(1) 					   default 0,
   constraint pkReligion primary key(id),
   constraint fkReligion foreign key(orgId)
      references organizations(id)
);
comment on table religion is
'宗教场所';

comment on column religion.orgId is
'所属网格';

comment on column religion.orgInternalCode is
'所属网格编号';

comment on column religion.religiousPlaces is
'宗教场所';

comment on column religion.fullPinyin is
'全拼';

comment on column religion.simplePinyin is
'简拼';

comment on column religion.subordinateReligious is
'所属宗教';

comment on column religion.dutyPeople is
'负责人';

comment on column religion.placeType is
'场所类型';

comment on column religion.mobilePone is
'联系手机';

comment on column religion.familyPhone is
'联系电话';

comment on column religion.address is
'地址';

comment on column religion.hiddenTrouble is
'隐患情况';

comment on column religion.remarkMessage is
'备注';

comment on column religion.createUser is
'创建用户';

comment on column religion.updateUser is
'更新用户';

comment on column religion.createDate is
'创建时间';

comment on column religion.updateDate is
'更新时间';

comment on column religion.idCardNo is
'负责人身份证号码';

comment on column religion.someone is
'其他人员';

comment on column religion.capitalSource is
'资金来源';

comment on column religion.area is
'面积';

comment on column religion.rightful is
'是否合法';

comment on column religion.peopleNumber is
'宗教人数';
comment on column religion.isEmphasis is
'是否关注';
create sequence s_religionBelief
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

/*==============================================================*/
/* Table: religionBelief                                        */
/*==============================================================*/
create table religionBelief  (
   id                   number(10)                      not null,
   orgId                number(10)                      not null,
   orgInternalCode      varchar2(32)                    not null,
   name                 varchar2(60),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   gender               NUMBER(10),
   idCardNo             varchar2(18),
   nativePlace      varchar2(150),
   politicsStatus    number(10),
   jobPost        varchar2(150),
   familyAddress    varchar2(150),
   familyPhone          varchar2(30),
   birthDate            DATE,
   nation               NUMBER(10),
   religiousPlaces      varchar2(60),
   faith                NUMBER(10),
   postType             NUMBER(10),
   schooling            NUMBER(10),
   highRisk        NUMBER(1)                      default 0,
   mobileNumber         VARCHAR2(11),
   faithCause           NUMBER(10),
   address              VARCHAR2(150),
   remarkMessage        varchar2(600),
   status                NUMBER(1)                      default 0,
   createUser           varchar2(32)                    not null,
   updateUser           varchar2(32),
   createDate           date                            not null,
   updateDate           date,
   statusDate     		DATE,
   attentionDate    	DATE,
   province             VARCHAR2(30),
   city                 VARCHAR2(60),
   district             VARCHAR2(60),
   usedName				VARCHAR2(60),
   isEmphasis           NUMBER(1)                      default 0,
   constraint pk_ReligionBelief primary key (id),
   constraint fkReligionBelief foreign key (orgId)
      references organizations (id)
);
comment on table religionBelief is
'民族宗教';

comment on column religionBelief.orgId is
'所属网格';

comment on column religionBelief.orgInternalCode is
'所属网格编号';

comment on column religionBelief.name is
'姓名';

comment on column religionBelief.fullPinyin is
'全拼';

comment on column religionBelief.simplePinyin is
'简拼';

comment on column religionBelief.gender is
'性别';

comment on column religionBelief.idCardNo is
'身份证号码';

comment on column religionBelief.nativePlace is
'籍贯';

comment on column religionBelief.politicsStatus is
'政治面貌';

comment on column religionBelief.jobPost is
'工作单位或就读学校及职务';

comment on column religionBelief.familyAddress is
'户籍地址';

comment on column religionBelief.familyPhone is
'联系电话';

comment on column religionBelief.birthDate is
'出生日期';

comment on column religionBelief.nation is
'民族';

comment on column religionBelief.religiousPlaces is
'宗教场所';

comment on column religionBelief.faith is
'宗教信仰';

comment on column religionBelief.postType is
'教职人员类别';

comment on column religionBelief.schooling is
'文化程度';

comment on column religionBelief.highRisk is
'是否高危';

comment on column religionBelief.mobileNumber is
'手机号码';

comment on column religionBelief.faithCause is
'信教原因';

comment on column religionBelief.address is
'居住地址';

comment on column religionBelief.remarkMessage is
'备注';

comment on column religionBelief.createUser is
'创建用户';

comment on column religionBelief.updateUser is
'更新用户';

comment on column religionBelief.createDate is
'创建时间';

comment on column religionBelief.updateDate is
'更新时间';

comment on column religionBelief.statusDate is
'解除关注时间';

comment on column religionBelief.attentionDate is
'关注日期';

comment on column religionBelief.province is
'省';

comment on column religionBelief.city is
'市';

comment on column religionBelief.district is
'区县';

comment on column religionbelief.usedName is
'曾用名';

comment on column religionbelief.isEmphasis is
'是否关注';

create sequence s_adm_Institution
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;

create table administrativeInstitution(
       id                             NUMBER(10)        not null,
       orgId                          NUMBER(10)        not null,
       orgInternalCode                VARCHAR2(32)      not null,
       unitName                       VARCHAR2(150)     not null,
       unitIntroduction               VARCHAR2(600),
       unitNature                     NUMBER(10),
       unitCode                       VARCHAR2(90),
       legalPersonCertificate         VARCHAR2(90),
       legalPerson                    VARCHAR2(60),
       employeeAmount                 NUMBER(10),
       primaryEmployeeAmount          NUMBER(10),
       intermediateEmployeeAmount     NUMBER(10),
       advancedEmployeeAmount         NUMBER(10),
       partyMemberAmount              NUMBER(10),
       registeredCapital              NUMBER(9,2),
       hiddenCases                    VARCHAR2(300),
       hiddenRectification            VARCHAR2(300),
       telephone                      VARCHAR2(15),
       unitTelephone                  VARCHAR2(15),
       unitAddress                    VARCHAR2(150),
       unitArea                       NUMBER(9,1),
       safeProduction                 NUMBER(1),
       fireSafety                     NUMBER(1),
       remark                         VARCHAR2(600),
       fullPinyin                     VARCHAR2(128),
       simplePinyin                   VARCHAR2(32),
       createUser                     VARCHAR2(32)					not null,
       updateUser                     VARCHAR2(32),
       createDate                     DATE                 not null,
       updateDate                     DATE,
       isEmphasis					  NUMBER(1)            default 0,
       constraint pkadm_Institution primary key (id),
       constraint fkadm_InstitutionOrg foreign key (orgId)
         references organizations (id)
);
comment on table administrativeInstitution is
'行政事业单位';
comment on column administrativeInstitution.id is
'主键';
comment on column administrativeInstitution.orgId is
'所属责任区ID';
comment on column administrativeInstitution.orgInternalCode is
'所属责任区编号';
comment on column administrativeInstitution.unitName is
'单位名称';
comment on column administrativeInstitution.unitIntroduction is
'单位简介';
comment on column administrativeInstitution.unitNature is
'单位性质';
comment on column administrativeInstitution.unitCode is
'机构代码';
comment on column administrativeInstitution.legalPersonCertificate is
'事业单位法人证书 ';
comment on column administrativeInstitution.legalPerson is
'法人';
comment on column administrativeInstitution.employeeAmount is
'职工人数';
comment on column administrativeInstitution.primaryEmployeeAmount is
'初级职工人数 ';
comment on column administrativeInstitution.intermediateEmployeeAmount is
'中级职工人数';
comment on column administrativeInstitution.advancedEmployeeAmount is
'高级职工人数';
comment on column administrativeInstitution.partyMemberAmount is
'党员人数';
comment on column administrativeInstitution.registeredCapital is
'注册资金 ';
comment on column administrativeInstitution.hiddenCases is
'隐患情况';
comment on column administrativeInstitution.hiddenRectification is
'隐患整改情况';
comment on column administrativeInstitution.telephone is
'联系电话';
comment on column administrativeInstitution.unitTelephone is
'单位电话';
comment on column administrativeInstitution.unitAddress is
'单位地址';
comment on column administrativeInstitution.unitArea is
'单位面积';
comment on column administrativeInstitution.safeProduction is
'是否安全生产重点';
comment on column administrativeInstitution.fireSafety is
'是否消防安全重点';
comment on column administrativeInstitution.remark is
'备注';
comment on column administrativeInstitution.createUser is
'创建用户';
comment on column administrativeInstitution.updateUser is
'修改用户';
comment on column administrativeInstitution.createDate is
'创建日期';
comment on column administrativeInstitution.updateDate is
'修改时间';
comment on column administrativeInstitution.isEmphasis is
'是否关注';

 
 


/*===================领导班子信息=====================*/
create table leaderTeams(
id	NUMBER(10)   not null,
name	VARCHAR2(60)  not null,
gender	NUMBER(10),
duty	VARCHAR2(64),
introduction	CLOB,
orgCode	VARCHAR2(30),
orgId	NUMBER(10),
imageUrl	VARCHAR2(128),
sort	NUMBER(10),
createUser	VARCHAR2(60) not null,
updateUser	VARCHAR2(60),
createDate	DATE not null,
updateDate	DATE

);
alter table leaderTeams add constraint PKleaderTeams primary key (ID);
create sequence s_leaderTeams increment by 1 start with 1 maxvalue 9999999999 minvalue 1 cache 20;
comment on column leaderTeams.id is 'id';
comment on column leaderTeams.name is '姓名';
comment on column leaderTeams.gender is '性别(0男，1女，2未知)';
comment on column leaderTeams.duty is '职位';
comment on column leaderTeams.introduction is '介绍';
comment on column leaderTeams.orgCode is '组织编码';
comment on column leaderTeams.orgId is '组织id';
comment on column leaderTeams.imageUrl is '图片地址';
comment on column leaderTeams.sort is '排序值';

/*===================版本信息=====================*/
create table versions(
id	NUMBER(10)   not null,
versionId VARCHAR2(30) not null,
versionContent VARCHAR2(4000) not null,
constraint pkVersions primary key (id)
);
create sequence s_versions increment by 1 start with 1 maxvalue 9999999999 minvalue 1 cache 20;
comment on column versions.id is '主键';
comment on column versions.versionId is '版本号';
comment on column versions.versionContent is '版本更新内容';
/*===================用户己读版本信息=====================*/
create table userReadedVersionInfo(
userId NUMBER(10) not null,
readedVersionId VARCHAR2(30) not null
);
comment on column userReadedVersionInfo.userid is '用户id';
comment on column userReadedVersionInfo.readedVersionId is '用户己读版本号';
 create sequence s_enterprisesTemp
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
/*==============================================================*/
/* Table: enterprisesTemp                                           */
/*==============================================================*/
create table enterprisesTemp  (
   id                   NUMBER(10)                      ,
   orgId                NUMBER(10)                      ,
   employeeAmount       NUMBER(10),
   partyMemberAmount    NUMBER(10),
   industry             NUMBER(10),
   type                 NUMBER(10)                     null,
   isRiskEnterprise     NUMBER(1)                      default 0,
   area                 NUMBER(15,5),
   registeredCapital    NUMBER(15,5),
   name                 VARCHAR2(150)                   not null,
   businessLicense      VARCHAR2(60),
   legalPerson          VARCHAR2(60)                    ,
   hiddenCases          VARCHAR2(300),
   hiddenRectification  VARCHAR2(300),
   remark               VARCHAR2(600),
   createUser           VARCHAR2(32),
   updateUser           VARCHAR2(32),
   fullPinyin           VARCHAR2(30),
   simplePinyin         VARCHAR2(10),
   orgInternalCode      VARCHAR2(32)                    ,
   telephone            VARCHAR2(15),
   enterpriseTelephone  VARCHAR2(15),
   mobileNumber         VARCHAR2(11),
   fax                  VARCHAR2(15),
   imgUrl               VARCHAR2(300),
   address              VARCHAR2(150)                   ,
   createDate           DATE                            not null,
   updateDate           DATE,
   keyType				VARCHAR2(32),
   isEmphasis           NUMBER(1)                      default 0,
   isEmphasisReason     VARCHAR2(300),
   isEmphasisDate       DATE,
   attentionExtent      NUMBER(10),
   repeatState            NUMBER(1)                     not null,
   claimState             NUMBER(1),
   claimDate              Date,
   claimUserName          VARCHAR2(4000),
   claimUserId            NUMBER(10),
   claimOrgId             NUMBER(10),
   importDepartmentId     NUMBER(10)                     not null,
   oldOrgId				  NUMBER(10),
   inId					  NUMBER(10),
   constraint pkEnterprisesTemp primary key (id),
   constraint fkEnterprisesTempOrg foreign key (orgId)
         references organizations (id)
);

comment on table enterprisesTemp is
'重点场所公共表';

comment on column enterprisesTemp.orgId is
'所属网格';

comment on column enterprisesTemp.employeeAmount is
'员工数量';

comment on column enterprisesTemp.partyMemberAmount is
'党员数量';

comment on column enterprisesTemp.industry is
'所属行业';

comment on column enterprisesTemp.type is
'类型';

comment on column enterprisesTemp.isRiskEnterprise is
'是否危化企业（0为‘否’，1为''是''）';

comment on column enterprisesTemp.area is
'面积（单位为‘平方米’）';

comment on column enterprisesTemp.registeredCapital is
'注册资金（单位为‘万’）';

comment on column enterprisesTemp.name is
'企业名称';

comment on column enterprisesTemp.businessLicense is
'工商执照号码';

comment on column enterprisesTemp.legalPerson is
'法人代表';

comment on column enterprisesTemp.hiddenCases is
'隐患情况';

comment on column enterprisesTemp.hiddenRectification is
'隐患整改情况';

comment on column enterprisesTemp.remark is
'备注';

comment on column enterprisesTemp.createUser is
'创建用户';

comment on column enterprisesTemp.updateUser is
'修改用户';

comment on column enterprisesTemp.fullPinyin is
'全拼';

comment on column enterprisesTemp.simplePinyin is
'简拼';

comment on column enterprisesTemp.orgInternalCode is
'所属责任区编号';

comment on column enterprisesTemp.telephone is
'法人电话';

comment on column enterprisesTemp.enterpriseTelephone is
'企业电话';

comment on column enterprisesTemp.mobileNumber is
'法人手机号码';

comment on column enterprisesTemp.fax is
'传真';

comment on column enterprisesTemp.address is
'地址';

comment on column enterprisesTemp.createDate is
'创建日期';

comment on column enterprisesTemp.updateDate is
'修改时间';

comment on column enterprisesTemp.isEmphasis is
'是否关注';
comment on column enterprisesTemp.repeatState is
'是否重复';

comment on column enterprisesTemp.claimState is
'认领状态';

comment on column enterprisesTemp.claimDate is
'认领日期';

comment on column enterprisesTemp.claimUserName is
'认领人用户名';

comment on column enterprisesTemp.claimUserId is
'认领人Id';

comment on column enterprisesTemp.claimOrgId is
'认领人网格';

comment on column enterprisesTemp.importDepartmentId is
'导入部门Id';

comment on column enterprisesTemp.oldOrgId is
'刚导入时的所属网格Id';
comment on column enterprisesTemp.inId is
'认领时插入到对应库中的id';
comment on column enterprisesTemp.attentionExtent is
'关注程度：1.一般；2.中等；3.严重';

/*==============================================================*/
/* Table: RELATEPERSONS                                         */
/*==============================================================*/
create table RELATEPERSONS
(
  WORKSHEETID NUMBER(10) not null,
  PERSONID    NUMBER(10) not null,
  PERSONNAME  VARCHAR2(60) not null,
  PERSONTYPE  VARCHAR2(45) not null,
  orgId     NUMBER(10),
  cardNoOrName    VARCHAR2(150),
  constraint FKRELATEPERSONSESISSUE foreign key (WORKSHEETID) references ISSUES (ID)
);
-- Add comments to the columns 
comment on column RELATEPERSONS.WORKSHEETID
  is '涉及人员';
comment on column RELATEPERSONS.PERSONID
  is '涉及人员Id';
comment on column RELATEPERSONS.PERSONNAME
  is '涉及人员姓名';
comment on column RELATEPERSONS.PERSONTYPE
  is '涉及人员类型';
comment on column RELATEPERSONS.orgId
  is '目标重复数据的orgId';
comment on column RELATEPERSONS.cardNoOrName
  is '身份证号码或者场所名';
/*==============================================================*/
/* Table: RELATEPLACES                                          */
/*==============================================================*/
create table RELATEPLACES
(
  WORKSHEETID NUMBER(10) not null,
  PLACEID     NUMBER(10) not null,
  PLACENAME   VARCHAR2(90) not null,
  PLACETYPE   VARCHAR2(45) not null,
  orgId     NUMBER(10),
  cardNoOrName    VARCHAR2(150),
  constraint FKRELATEPLACESESISSUE foreign key (WORKSHEETID) references ISSUES (ID)
);
-- Add comments to the table 
comment on table RELATEPLACES
  is '涉及场所';
-- Add comments to the columns 
comment on column RELATEPLACES.WORKSHEETID
  is '涉及场所';
comment on column RELATEPLACES.PLACEID
  is '涉及场所Id';
comment on column RELATEPLACES.PLACENAME
  is '涉及场所名称';
comment on column RELATEPLACES.orgId
  is '目标重复数据的orgId';
comment on column RELATEPLACES.cardNoOrName
  is '身份证号码或者场所名';
/*==============================================================*/
/* Table: PRIMARYORGANIZATIONS                                  */
/*==============================================================*/
create table PRIMARYORGANIZATIONS  (
   ID                   NUMBER(10)                      not null,
   ORGID                NUMBER(10)                      not null,
   NAME                 VARCHAR2(100)                    not null,
   DETAILNAME           VARCHAR2(60),
   TEAMCLASS            NUMBER(10)                      not null,
   TEAMTYPE             NUMBER(10),
   ORGINTERNALCODE      VARCHAR2(32)                    not null,
   CREATEUSER           VARCHAR2(32)                    not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                            not null,
   UPDATEDATE           DATE,
   isSynchronize  		NUMBER(2) default 0,
   seq  				NUMBER(10),
   REMARK               VARCHAR2(600),
   DEPARTMENTTYPE		NUMBER(10),
   guidanceDepartment  varchar2(100),
   mainFunction  varchar2(600),
   constraint PKPRIMARYORGANIZATIONS primary key (ID)
);

comment on table PRIMARYORGANIZATIONS is
'组织表';

comment on column PRIMARYORGANIZATIONS.ID is
'组织id';

comment on column PRIMARYORGANIZATIONS.ORGID is
'网格ID';

comment on column PRIMARYORGANIZATIONS.NAME is
'组织名称';

comment on column PRIMARYORGANIZATIONS.DETAILNAME is
'详细名称';

comment on column PRIMARYORGANIZATIONS.TEAMCLASS is
'组织类型(大类)';

comment on column PRIMARYORGANIZATIONS.TEAMTYPE is
'组织类型(小类)';

comment on column PRIMARYORGANIZATIONS.ORGINTERNALCODE is
'辖区内部编码';

comment on column PRIMARYORGANIZATIONS.CREATEUSER is
'创建用户';

comment on column PRIMARYORGANIZATIONS.UPDATEUSER is
'修改用户';

comment on column PRIMARYORGANIZATIONS.CREATEDATE is
'创建日期';

comment on column PRIMARYORGANIZATIONS.UPDATEDATE is
'修改日期';
comment on column primaryOrganizations.isSynchronize
  is '数据来源(0、录入，1、同步)'; 
comment on column primaryOrganizations.seq
  is '排序字段'; 
comment on column PRIMARYORGANIZATIONS.REMARK is
'备注';
comment on column primaryOrganizations.DEPARTMENTTYPE is 
'党委部门(子类)'; 
comment on column primaryorganizations.guidanceDepartment  is 
'业务指导部门';
comment on column primaryorganizations.mainFunction  is 
'主要功能';


/*==============================================================*/
/* Table: PRIMARYORGMEMBERS                                     */
/*==============================================================*/
create table PRIMARYORGMEMBERS  (
   ID                   NUMBER(10)                      not null,
   PRIMARYORGID       NUMBER(10)                      not null,
   ORGID                NUMBER(10)                      not null,
   NAME                 VARCHAR2(32)                    not null,
   GENDER               NUMBER(10)                     default 3 not null,
   BIRTHDAY             DATE,
   DUTYID               NUMBER(10),
   idcardNo				varchar2(18),
   POSITION             VARCHAR2(32),
   MOBILE               VARCHAR2(20),
   TELEPHONE            VARCHAR2(20),
   CREATEUSER           VARCHAR2(32)                    not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                            not null,
   UPDATEDATE           DATE,
   YEAR                 NUMBER(10),
   ISHAVEJOB            NUMBER(1)                      default 0,
   seq  				NUMBER(10),
   REMARK               VARCHAR2(600),
   isFourLevelPlatform NUMBER(1),
   constraint PKPRIMARYORGMEMBERS primary key (ID)
);

comment on table PRIMARYORGMEMBERS is
'组织成员表';

comment on column PRIMARYORGMEMBERS.ID is
'组织成员ID';

comment on column PRIMARYORGMEMBERS.PRIMARYORGID is
'所属组织ID';

comment on column PRIMARYORGMEMBERS.ORGID is
'网格ID';

comment on column PRIMARYORGMEMBERS.NAME is
'成员姓名';

comment on column PRIMARYORGMEMBERS.GENDER is
'性别';

comment on column PRIMARYORGMEMBERS.BIRTHDAY is
'出生年月';

comment on column PRIMARYORGMEMBERS.DUTYID is
'职务ID';

comment on column PRIMARYORGMEMBERS.Idcardno is 
'身份证号码';

comment on column PRIMARYORGMEMBERS.POSITION is
'职位';

comment on column PRIMARYORGMEMBERS.MOBILE is
'手机号';

comment on column PRIMARYORGMEMBERS.TELEPHONE is
'电话号';

comment on column PRIMARYORGMEMBERS.CREATEUSER is
'创建用户';

comment on column PRIMARYORGMEMBERS.UPDATEUSER is
'修改用户';

comment on column PRIMARYORGMEMBERS.CREATEDATE is
'创建日期';

comment on column PRIMARYORGMEMBERS.UPDATEDATE is
'修改日期';

comment on column PRIMARYORGMEMBERS.YEAR is
'出生年';

comment on column PRIMARYORGMEMBERS.ISHAVEJOB is
'曾经任职0.在职；1.卸任';

comment on column PrimaryOrgMembers.seq
  is '排序字段'; 

comment on column PRIMARYORGMEMBERS.REMARK is
'备注';
comment on column PRIMARYORGMEMBERS.isFourLevelPlatform is
'是否是四级平台';

      
/*==============================================================*/
/* Table: otherAttentionPersonnels  其他人员                                     */
/*==============================================================*/
create table OTHERATTENTIONPERSONNELS 
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   FERRETOUTDATE        DATE,
   DRUGFRISTDATE        DATE,
   ATTENTIONREASON      VARCHAR2(300),
   WORKCONDITION        VARCHAR2(300),
   MEREMARK             VARCHAR2(900),
   OLDCURRENTADDRESS    VARCHAR2(150),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PK_OTHERATTENTIONPERSONNELS primary key (ID)
);

comment on table OTHERATTENTIONPERSONNELS is
'其他人员信息';

comment on column OTHERATTENTIONPERSONNELS.ID is
'人员id';

comment on column OTHERATTENTIONPERSONNELS.ORGID is
'所属网格';

comment on column OTHERATTENTIONPERSONNELS.ORGINTERNALCODE is
'所属责任区编号';

comment on column OTHERATTENTIONPERSONNELS.FERRETOUTDATE is
'查获日期';

comment on column OTHERATTENTIONPERSONNELS.ATTENTIONREASON is
'关注原因';

comment on column OTHERATTENTIONPERSONNELS.WORKCONDITION is
'工作情况';

comment on column OTHERATTENTIONPERSONNELS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';

comment on column OTHERATTENTIONPERSONNELS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';

comment on column OTHERATTENTIONPERSONNELS.ISEMPHASIS is
'是否关注';

comment on column OTHERATTENTIONPERSONNELS.CREATEUSER is
'创建用户';

comment on column OTHERATTENTIONPERSONNELS.CREATEDATE is
'创建日期';

comment on column OTHERATTENTIONPERSONNELS.UPDATEUSER is
'修改用户';

comment on column OTHERATTENTIONPERSONNELS.UPDATEDATE is
'修改时间';

/*==============================================================*/
/* index: index_otp_orgcodeIsemphasis                        */
/*==============================================================*/
create index index_otp_orgcodeIsemphasis on OTHERATTENTIONPERSONNELS (ORGINTERNALCODE, ISEMPHASIS);
      

create table daily_attachfiles(
  ID                 NUMBER(10) not null,
  dailyid            NUMBER(10),
  dailydirectoryType number(10),
  FILENAME           VARCHAR2(150) not null,
  FILEACTUALURL      VARCHAR2(250) not null,
  FILESIZE           NUMBER(10),
  CREATEUSER         VARCHAR2(32) not null,
  UPDATEUSER         VARCHAR2(32),
  CREATEDATE         DATE not null,
  UPDATEDATE         DATE
);

 
create table SecurityPropaganda(
  id number(10) not null,
  orgid number(10) not null,
  orginternalcode varchar2(32) not null,
  dailydirectoryid number(10) not null,
  content clob,
  createuser varchar2(32) not null,
  createdate date not null,
  updateuser varchar2(32),
  updatedate date,
  constraint pkSecurityPropaganda primary key (id),
  constraint fkSecurityPropaganda foreign key (orgId)
         references organizations (id)
);
comment on table SecurityPropaganda is
'平安综治宣传表';

comment on column SecurityPropaganda.id is
'平安综治宣传表id';

comment on column SecurityPropaganda.dailydirectoryid is
'台帐目录id';

comment on column SecurityPropaganda.orgid is
'所属责任区id';

comment on column SecurityPropaganda.orginternalcode is
'所属责任区内置编码';

comment on column SecurityPropaganda.content is
'宣传情况';

comment on column SecurityPropaganda.createuser is
'创建人';

comment on column SecurityPropaganda.createdate is
'创建时间';

comment on column SecurityPropaganda.updateuser is
'修改人';

comment on column SecurityPropaganda.updatedate is
'修改时间';
 
create table societySecurity(
  id number(10) not null,
  orgid number(10) not null,
  orginternalcode varchar2(32) not null,
  dailydirectoryid number(10) not null,
  content clob,
  createuser varchar2(32) not null,
  createdate date not null,
  updateuser varchar2(32),
  updatedate date,
  constraint pkSocietySecurity primary key (id),
  constraint fkSocietySecurity foreign key (orgId)
         references organizations (id)
);
comment on table societySecurity is
'社会治安防控体系建设表';

comment on column societySecurity.id is
'社会治安防控体系建设表id';

comment on column societySecurity.dailydirectoryid is
'台帐目录id';

comment on column societySecurity.orgid is
'所属责任区id';

comment on column societySecurity.orginternalcode is
'所属责任区内置编码';

comment on column societySecurity.content is
'宣传情况';

comment on column societySecurity.createuser is
'创建人';

comment on column societySecurity.createdate is
'创建时间';

comment on column societySecurity.updateuser is
'修改人';

comment on column societySecurity.updatedate is
'修改时间';

 
create table seriesSecurity(
  id number(10) not null,
  orgid number(10) not null,
  orginternalcode varchar2(32) not null,
  dailydirectoryid number(10) not null,
  activityDate date,
  name varchar2(120),
  content clob,
  createuser varchar2(32) not null,
  createdate date not null,
  updateuser varchar2(32),
  updatedate date,
  constraint pkSeriesSecurity primary key (id),
  constraint fkSeriesSecurity foreign key (orgId)
         references organizations (id)
);
comment on table seriesSecurity is
'系列平安创建表';

comment on column seriesSecurity.id is
'系列平安创建表id';

comment on column seriesSecurity.dailydirectoryid is
'台帐目录id';

comment on column seriesSecurity.orgid is
'所属责任区id';

comment on column seriesSecurity.orginternalcode is
'所属责任区内置编码';

comment on column seriesSecurity.content is
'宣传情况';

comment on column seriesSecurity.createuser is
'创建人';

comment on column seriesSecurity.createdate is
'创建时间';

comment on column seriesSecurity.updateuser is
'修改人';

comment on column seriesSecurity.updatedate is
'修改时间';

 
create table serviceManagement(
  id number(10) not null,
  dailydirectoryid number(10) not null,
  orgid number(10) not null,
  orginternalcode varchar2(32) not null,
  forcesForm varchar2(400),
  formulateCriterion clob,
  work clob,
  facility varchar2(400),
  createuser varchar2(32) not null,
  createdate date not null,
  updateuser varchar2(32),
  updatedate date
);
comment on table serviceManagement is
'社会服务管理中心建设表';

comment on column serviceManagement.id is
'社会服务管理中心建设表id';

comment on column serviceManagement.dailydirectoryid is
'台帐目录id';

comment on column serviceManagement.orgid is
'所属责任区id';

comment on column serviceManagement.orginternalcode is
'所属责任区内置编码';

comment on column serviceManagement.forcesForm is
'力量组成';

comment on column serviceManagement.formulateCriterion is
'制定规定';

comment on column serviceManagement.work is
'内容';

comment on column serviceManagement.facility is
'硬件设施';

comment on column serviceManagement.createuser is
'创建人';

comment on column serviceManagement.createdate is
'创建时间';

comment on column serviceManagement.updateuser is
'修改人';

comment on column serviceManagement.updatedate is
'修改时间';

 
create table gridManagementNormal(
  id number(10) not null,
  orgid number(10) not null,
  orginternalcode varchar2(32) not null,
  dailydirectoryid number(10) not null,
  activityDate date,
  work clob,
  content clob,
  createuser varchar2(32) not null,
  createdate date not null,
  updateuser varchar2(32),
  updatedate date,
  expiredEntering      NUMBER(1),
  constraint pkgridManagementNormal primary key (id),
  constraint fkgridManagementNormal foreign key (orgId)
         references organizations (id)
);
comment on table gridManagementNormal is
'平时开展工作情况(网格化管理、组团式服务)表';

comment on column gridManagementNormal.id is
'平时开展工作情况(网格化管理、组团式服务)表id';

comment on column gridManagementNormal.dailydirectoryid is
'台帐目录id';

comment on column gridManagementNormal.orgid is
'所属责任区id';

comment on column gridManagementNormal.orginternalcode is
'所属责任区内置编码';

comment on column gridManagementNormal.work is
'工作内容';

comment on column gridManagementNormal.content is
'主要情况';

comment on column gridManagementNormal.createuser is
'创建人';

comment on column gridManagementNormal.createdate is
'创建时间';

comment on column gridManagementNormal.updateuser is
'修改人';

comment on column gridManagementNormal.updatedate is
'修改时间';   

comment on column gridManagementNormal.expiredEntering is 
'过期录入（0正常录入，1过期录入）';
-------------------海宁地图调整-----------------------------------
create table hainingvillagemap 
(
id						number(10)		not null, 
departmentNo  varchar2(32)  not null,
imgUrl				varchar2(255) null,
createUser		varchar2(30)  null,
createDate    date          null,
updateUser		varchar2(30)  null,
updateDate    date					null,
constraint PK_hainingvillagemap primary key (id),
constraint UN_hainingvillagemap unique(departmentNo)
);
comment on column hainingvillagemap.id is 
'主键';
comment on column hainingvillagemap.departmentNo is 
'部门编号';
comment on column hainingvillagemap.imgUrl is 
'图片路径';
comment on column hainingvillagemap.createUser is 
'创建人';
comment on column hainingvillagemap.createDate is 
'创建时间';
comment on column hainingvillagemap.updateUser is 
'修改人';
comment on column hainingvillagemap.updateDate is 
'修改时间';
-------------------------------------
create sequence s_hainingvillagemap
increment by 1
start with 1
minvalue 1
maxvalue 9999999999
cache 20;


/*==============================================================*/
/* s_mobileInfos                                    */
/*==============================================================*/
create sequence s_mobileInfos
increment by 1
start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
/*==============================================================*/
/* Table: mobileInfos                                  */
/*==============================================================*/
  create table mobileInfos
(
   id                                 number              not null,
   imsiNo                             varchar2(15)        not null,
   name                               varchar2(20),
   mobileNumber                       varchar2(11)        not null,
   acceptTime                         date                not null,
   effectivelyTime                    date                not null,
   orgId                              number(10)          not null,
   orgInternalCode                    varchar2(32)        not null,
   createUser                         varchar2(32)        not null,
   createDate                         date,
   constraint pkMobileInfos primary key (id),
   constraint uniqueMobileInfosImsiNo unique(imsiNo)
);
comment on table mobileInfos is
'手机相关信息';

comment on column mobileInfos.imsiNo is
'手机序列号';
comment on column mobileInfos.name is
'户主姓名';
comment on column mobileInfos.mobileNumber is
'手机号码';
comment on column mobileInfos.acceptTime is
'受理时间';
comment on column mobileInfos.effectivelyTime is
'有效时间';
comment on column mobileInfos.orgInternalCode is
'部门内部编码';
comment on column mobileInfos.orgId is
'部门编号';


/*==============================================================*/
/* Table: HOUSETRACKS                                           */
/*==============================================================*/
create table HOUSETRACKS  (
   ID                   NUMBER(10)                      not null,
   HOUSEID              NUMBER(10)                      not null,
   HOUSEADDRESS         VARCHAR2(150)                   not null,
   HOUSETYPE            VARCHAR2(32)                    not null,
   HOUSEINITTYPE        NUMBER(10)                      not null,
   HOUSEORGID           NUMBER(10)                      not null,
   HOUSEORGINTERNALCODE VARCHAR2(32)                    not null,
   OLDHOUSEORGID        NUMBER(10),
   OPERATIONTYPE        NUMBER(10)                      not null,
   OPERATIONCONTENT     VARCHAR2(300),
   OPERATIONUSERID      NUMBER(10)                      not null,
   OPERATIONORGID       NUMBER(10)                      not null,
   OPERATIONDATE        DATE                            not null,
   CREATEUSER           VARCHAR2(32)                    not null,
   CREATEDATE           DATE                            not null,
   constraint PK_HOUSETRACKS primary key (ID)
);

comment on table HOUSETRACKS is
'房屋轨迹表';

comment on column HOUSETRACKS.ID is
'轨迹id';

comment on column HOUSETRACKS.HOUSEID is
'房屋id';

comment on column HOUSETRACKS.HOUSEADDRESS is
'房屋地址';

comment on column HOUSETRACKS.HOUSETYPE is
'房屋类型';

comment on column HOUSETRACKS.HOUSEINITTYPE is
'房屋内置类型';

comment on column HOUSETRACKS.HOUSEORGID is
'房屋所在组织id';

comment on column HOUSETRACKS.HOUSEORGINTERNALCODE is
'房屋所在组织code';

comment on column HOUSETRACKS.OLDHOUSEORGID is
'房屋原组织id';

comment on column HOUSETRACKS.OPERATIONTYPE is
'操作类型';

comment on column HOUSETRACKS.OPERATIONCONTENT is
'操作内容';

comment on column HOUSETRACKS.OPERATIONUSERID is
'操作人id';

comment on column HOUSETRACKS.OPERATIONORGID is
'操作人组织id';

comment on column HOUSETRACKS.OPERATIONDATE is
'操作时间';

comment on column HOUSETRACKS.CREATEUSER is
'创建用户名';

comment on column HOUSETRACKS.CREATEDATE is
'创建日期';

/*==============================================================*/
/* Table: ORGLOCATIONTRACKS                                     */
/*==============================================================*/
create table ORGLOCATIONTRACKS  (
   ID                   NUMBER(10)                      not null,
   ORGLOCATIONID        NUMBER(10)                      not null,
   ORGLOCATIONNAME      VARCHAR2(150)                    not null,
   ORGLOCATIONTYPE      VARCHAR2(32)                    not null,
   ORGLOCATIONINITTYPE  NUMBER(10)                      not null,
   ORGLOCATIONORGID     NUMBER(10)                      not null,
   ORGLOCATIONORGINTERNALCODE VARCHAR2(32)                    not null,
   OLDORGLOCATIONORGID  NUMBER(10),
   OPERATIONTYPE        NUMBER(10)                      not null,
   OPERATIONCONTENT     VARCHAR2(300),
   OPERATIONUSERID      NUMBER(10)                      not null,
   OPERATIONORGID       NUMBER(10)                      not null,
   OPERATIONDATE        DATE                            not null,
   CREATEUSER           VARCHAR2(32)                    not null,
   CREATEDATE           DATE                            not null,
   constraint PK_ORGLOCATIONTRACKS primary key (ID)
);

comment on table ORGLOCATIONTRACKS is
'组织场所轨迹表';

comment on column ORGLOCATIONTRACKS.ID is
'轨迹id';

comment on column ORGLOCATIONTRACKS.ORGLOCATIONID is
'组织场所id';

comment on column ORGLOCATIONTRACKS.ORGLOCATIONNAME is
'组织场所名称';

comment on column ORGLOCATIONTRACKS.ORGLOCATIONTYPE is
'组织场所类型';

comment on column ORGLOCATIONTRACKS.ORGLOCATIONINITTYPE is
'组织场所内置类型';

comment on column ORGLOCATIONTRACKS.ORGLOCATIONORGID is
'组织场所所在组织id';

comment on column ORGLOCATIONTRACKS.ORGLOCATIONORGINTERNALCODE is
'组织场所所在组织code';

comment on column ORGLOCATIONTRACKS.OLDORGLOCATIONORGID is
'组织场所原组织id';

comment on column ORGLOCATIONTRACKS.OPERATIONTYPE is
'操作类型';

comment on column ORGLOCATIONTRACKS.OPERATIONCONTENT is
'操作内容';

comment on column ORGLOCATIONTRACKS.OPERATIONUSERID is
'操作人id';

comment on column ORGLOCATIONTRACKS.OPERATIONORGID is
'操作人组织id';

comment on column ORGLOCATIONTRACKS.OPERATIONDATE is
'操作时间';

comment on column ORGLOCATIONTRACKS.CREATEUSER is
'创建用户名';

comment on column ORGLOCATIONTRACKS.CREATEDATE is
'创建日期';


---事件处理绩效考核配置表---
create table issueAccessConfig(
       yellowCardScores          number(13,3),
       redCardScores             number(13,3),
       yellowCardAccepted        number(10),
       redCardAccepted           number(10),
       yellowCardHandle          number(10),
       redCardHandle             number(10),
       normalHandle              number(13,3)
);
comment on table issueAccessConfig is 
'事件处理绩效考核配置表';
comment on column issueAccessConfig.yellowCardScores is
'黄牌扣分';
comment on column issueAccessConfig.redCardScores is
'红牌扣分';
comment on column issueAccessConfig.yellowCardAccepted is
'黄牌受理期限';
comment on column issueAccessConfig.redCardAccepted is
'红牌受理期限';
comment on column issueAccessConfig.yellowCardHandle is
'黄牌处理期限';
comment on column issueAccessConfig.redCardHandle is
'红牌处理期限';
comment on column issueAccessConfig.normalHandle is
'正常处理加分';

--流量管理--
create sequence S_smsTrafficManage
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table smsTrafficManage
(
  ID                   NUMBER(10) not null,
  Traffic              NUMBER(10),
  ORGID                NUMBER(10) not null,
  ORGINTERNALCODE      VARCHAR2(32)                    not null,          
  CREATEUSER           VARCHAR2(32) not null,
  UPDATEUSER           VARCHAR2(32),
  CREATEDATE           DATE not null,
  UPDATEDATE           DATE,
  telecomTraffic	   NUMBER(10),
  mobileTraffic 	   NUMBER(10),
  chinaUnicomTraffic   NUMBER(10),
  smallUnicom 	       NUMBER(10),
  constraint PKsmsTrafficManage primary key (ID)
);

comment on table smsTrafficManage
  is '流量管理';
comment on column smsTrafficManage.ID
  is '流量管理id';
comment on column smsTrafficManage.Traffic
  is '流量额度';
comment on column smsTrafficManage.ORGID
  is '所属网格';
comment on column smsTrafficManage.orgInternalCode 
  is '所属网格编号';
comment on column smsTrafficManage.CREATEUSER
  is '创建人';
comment on column smsTrafficManage.UPDATEUSER
  is '修改人';
comment on column smsTrafficManage.CREATEDATE
  is '创建时间';
comment on column smsTrafficManage.UPDATEDATE
  is '修改时间';
comment on column smsTrafficManage.TELECOMTRAFFIC
  is '电信流量';
comment on column smsTrafficManage.MOBILETRAFFIC
  is '移动流量';
comment on column smsTrafficManage.CHINAUNICOMTRAFFIC
  is '联通流量';
comment on column smsTrafficManage.SMALLUNICOM
  is '小灵通流量';
  
  
--短信发件箱sequence--
create sequence S_smsUplink
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
--短信发件箱--
create table smsUplink(
       id                                  number(10)                      not null,
       parentId							   number(10),
       deptId							   number(10),
       messageId						   number(10),
       sender                              varchar2(60),
       senderName                          varchar2(90),
       senderOrgId                         number(10),
       senderOrgInternalCode               varchar2(32),
       receiverName                        varchar2(90),
       receiverMobile                      varchar2(11),
       receiverOrgId                       number(10),
       receiverOrgInternalCode             varchar2(32),
       status	                           number(2)					   default 1,
       content                             varchar2(600)                   not null,
       sendTime                            date                            not null,
       receiveTime                         date,
       counts							   number(10),
       mobileType						   number(1),
       smsLevel							   number(2),
       deletestatus						   number(1) 					   default 0,
       constraint pksmsUplink primary key (id),
       constraint fksmsUplink foreign key (parentId)
  		references smsuplink (id)
);
comment on table smsUplink is
'短信发件箱';
comment on column smsUplink.id is
'短信发件id';
comment on column smsUplink.deptId is
'所属部门';
comment on column smsUplink.sender is
'发送者';
comment on column smsUplink.senderName is
'发送者姓名';
comment on column smsUplink.senderOrgId is
'发送者所属网格';
comment on column smsUplink.senderOrgInternalCode is
'发送者所属网格编号';
comment on column smsUplink.receiverName is
'接收者姓名';
comment on column smsUplink.receiverMobile is
'接收者手机';
comment on column smsUplink.receiverOrgId is
'接收者所属网格';
comment on column smsUplink.receiverOrgInternalCode is
'接收者所属网格编号';
comment on column smsUplink.status is
'发送状态：1待处理，2处理中，3待发送，4发送成功，5发送失败,默认新增时为1';
comment on column smsUplink.content is
'发送内容';
comment on column smsUplink.sendTime is
'发送时间';
comment on column smsUplink.receiveTime is
'接收时间';
comment on column smsUplink.counts is
'发送总数';
comment on column smsuplink.messageid is 
'短信发送平台短信Id' ;
comment on column smsuplink.mobiletype is 
'手机类型 :1移动，2联通，3小灵通，4电信 ' ;
comment on column smsuplink.smsLevel is 
'短信优先级,优先级逐步递减：1，2，3 ' ;
comment on column smsuplink.deletestatus is 
'删除状态：默认0未删除，1已删除';

-- 短信模板s
create sequence S_smstemplate
minvalue 1
maxvalue 99999999999
start with 1
increment by 1
cache 20;

create table smstemplate
(
  ID          NUMBER(10) not null,
  CONTENT     VARCHAR2(600),
  NAME        VARCHAR(60) not null,
  KEY         VARCHAR(600) not null,
  CREATEUSER  VARCHAR2(32) not null,
  UPDATEUSER  VARCHAR2(32),
  CREATEDATE  DATE not null,
  UPDATEDATE  DATE,
  TYPE		  VARCHAR2(32)  not null,
  constraint PKsmstemplate primary key (ID)
);

comment on table smstemplate
  is '短信模板';
comment on column smstemplate.KEY
  is '短信模板key';
comment on column smstemplate.NAME
  is '模板名称';
comment on column smstemplate.CONTENT
  is '模板内容';
comment on column smstemplate.TYPE
  is '模板类型';
comment on column smstemplate.CREATEUSER
  is '创建人';
comment on column smstemplate.UPDATEUSER
  is '修改人';
comment on column smstemplate.CREATEDATE
  is '创建时间';
comment on column smstemplate.UPDATEDATE
  is '修改时间';
  
-- sms发送对象管理表sequence --
create sequence S_smsSendObject
minvalue 1
maxvalue 99999999999
start with 1
increment by 1
cache 20;
-- sms发送对象管理表 -- 
create table smsSendObject(
       id                   number(10)                      not null,
       name                 varchar2(150)                   not null,
       description          varchar2(300)                   not null,
       template             clob,
       enable				number(1)						default 0,
       createUser           varchar2(32)                    not null,
       updateUser           varchar2(32),
       createDate           DATE                            not null,
       updateDate           DATE,
       constraint pksmsSendObject primary key (id)
);
comment on table smsSendObject is
'sms发送对象管理表';
comment on column smsSendObject.id is
'发送对象id';
comment on column smsSendObject.name is
'发送对象名称';
comment on column smsSendObject.description is
'描述';
comment on column smsSendObject.template is
'模板';
comment on column smssendobject.enable is 
'发送对象是否启用';
comment on column smsSendObject.createUser is
'创建人';
comment on column smsSendObject.updateUser is
'修改人';
comment on column smsSendObject.createDate is
'创建时间';
comment on column smsSendObject.updateDate is
'修改时间';

--查询条件管理表sequence--
create sequence S_smsQueryCondition
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
--sms查询条件管理表--
create table smsQueryCondition(
       id                   number(10)                      not null,
       objectId             number(10)                      not null,
       key                  varchar2(60)                    not null,
       field                varchar2(60),
       sqlTemplate          varchar2(900)                   not null,
       description          varchar2(90),
       isNull               number(1)                       default   0,
       createUser           VARCHAR2(32)                    not null,
       updateUser           VARCHAR2(32),
       createDate           DATE                            not null,
       updateDate           DATE,
       type					VARCHAR2(30),
       constraint pksmsQueryCondition primary key (id),
       constraint fksmsQueryCondition foreign key (objectId)
         references smsSendObject (id)

);
comment on table smsQueryCondition is
'sms查询条件管理表';
comment on column smsQueryCondition.id is
'查询条件id';
comment on column smsQueryCondition.objectId is
'发送对象id';
comment on column smsQueryCondition.key is
'中间key';
comment on column smsQueryCondition.field is
'表字段';
comment on column smsQueryCondition.sqlTemplate is
'sql语句模板';
comment on column smsQueryCondition.description is
'描述';
comment on column smsQueryCondition.isNull is
'是否必填,默认否';
comment on column smsQueryCondition.createUser is
'创建人';
comment on column smsQueryCondition.updateUser is
'修改人';
comment on column smsQueryCondition.createDate is
'创建时间';
comment on column smsQueryCondition.updateDate is
'修改时间';
comment on column smsQueryCondition.type is 
'类型 ' ;

--job短信发送对象sequence--
create sequence S_smsJobSql
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
--job短信发送对象sql--
create table smsJobSql(
       id                   number(10)                      not null,
       smsuplinkId			number(10),
       smslevel             number(2)                       default 1,
       sql                  varchar2(3000)                  not null,
       content              varchar2(600),
       description          varchar2(300),
       sender               number(10)                      not null,
       sendTime	            DATE                            not null,
       constraint pksmsJobSql primary key (id)
);
comment on table smsJobSql is
'job短信发送对象sql表';
comment on column smsJobSql.id is
'记录id';
comment on column smsJobSql.smsuplinkId is
'短信发件箱Id';
comment on column smsJobSql.smslevel is
'优先级状态,默认0,优先级逐步递减：1，2，3，4，5，6';
comment on column smsJobSql.content is
'内容';
comment on column smsJobSql.description is
'描述';
comment on column smsJobSql.sql is
'查询发送对象的sql';
comment on column smsJobSql.sender is
'发送人';
comment on column smsJobSql.sendTime is
'发送时间';

--短信收件箱sequence--
create sequence S_smsDownlink
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
--短信收件箱--
create table smsDownlink(
       id                                  number(10)                      not null,
       sender                              varchar2(60),
       senderName                          varchar2(90),
       receiverName                        varchar2(90),
       receiverMobile                      varchar2(60),
       receiverOrgId                       number(10),
       receiverOrgInternalCode             varchar2(32),
       status                              number(2),
       content                             varchar2(600)                   not null,
       sendTime                            date,
       receiveTime                         date,
       isRead 							   number(1)  default 0,
       deletestatus						   number(1)  default 0,
       constraint pksmsDownlink primary key (id)
);
comment on table smsDownlink is
'短信收件箱';
comment on column smsDownlink.id is
'短信收件id';
comment on column smsDownlink.sender is
'发送者';
comment on column smsDownlink.senderName is
'发送者姓名';
comment on column smsDownlink.receiverName is
'接收者姓名';
comment on column smsDownlink.receiverMobile is
'接收者手机';
comment on column smsDownlink.receiverOrgId is
'接收者所属网格';
comment on column smsDownlink.receiverOrgInternalCode is
'接收者所属网格编号';
comment on column smsDownlink.status is
'发送状态';
comment on column smsDownlink.content is
'发送内容';
comment on column smsDownlink.sendTime is
'发送时间';
comment on column smsDownlink.receiveTime is
'接收时间';
comment on column smsDownlink.isRead is
'是否阅读 0未读 1已读';
comment on column smsdownlink.deletestatus is 
'删除状态：0未删除，1已删除。默认状态0';

--- 收件箱最大Id ---
create table smsdownlinkBigId(
       bigId          number(10)
);

commit;

--------------------------------------------------------
-------------短信发送平台系统表，建表语句开始处--------------------
--------------------------------------------------------

/*==============================================================*/
/* DBMS name:      ORACLE Version 10g                           */
/* Created on:     2010/12/03 12:14:03                          */
/*==============================================================*/

create sequence S_MOBILESHORTMESSAGE
minvalue 1
maxvalue 99999999999999999999
start with 1
increment by 1
cache 20;

create sequence S_UPMOBILEMESSAGE
minvalue 1
maxvalue 99999999999999999999
start with 1
increment by 1
cache 20;

create sequence S_SMSTABLES
minvalue 1
maxvalue 99999999999999999999
start with 1
increment by 1
cache 20;

/*==============================================================*/
/* Table: mobileshortmessage  短信发送表                                  */
/*==============================================================*/
create table MOBILESHORTMESSAGE  (
   ID                   NUMBER                          not null,
   fromId               NUMBER,
   fromSystem           VARCHAR2(50),
   serverId             VARCHAR2(20),
   message              CLOB,
   requestReport        CHAR(1) default 0,
   sender               VARCHAR2(32),
   receiver             VARCHAR2(32),
   status               NUMBER default 1,
   sentTime             DATE,
   createTime           DATE default sysdate,
   priority             NUMBER default 8,
   type                 NUMBER,
   constraint PK_MOBILESHORTMESSAGE primary key (ID)
);

-- Add comments to the table 
comment on table MOBILESHORTMESSAGE
  is '短信发送表';
-- Add comments to the columns 
comment on column MOBILESHORTMESSAGE.FROMID
  is '短信息来源的标识';
comment on column MOBILESHORTMESSAGE.FROMSYSTEM
  is '短信息来源系统';
comment on column MOBILESHORTMESSAGE.SERVERID
  is '短信息远端ID';
comment on column MOBILESHORTMESSAGE.MESSAGE
  is '消息体';
comment on column MOBILESHORTMESSAGE.REQUESTREPORT
  is '是否需要结果报告';
comment on column MOBILESHORTMESSAGE.SENDER
  is '发送人';
comment on column MOBILESHORTMESSAGE.RECEIVER
  is '接收人号码';
comment on column MOBILESHORTMESSAGE.STATUS
  is '下发状态。1：未下发到服务器,2: 系统处理中,3：下发到服务器,4：下发到终端成功,5：未成功发送到终端';
comment on column MOBILESHORTMESSAGE.SENTTIME
  is '上发时间';
comment on column MOBILESHORTMESSAGE.CREATETIME
  is '下发时间';
comment on column MOBILESHORTMESSAGE.PRIORITY
  is '短信优先级。系统消息默认为：0；优先级逐步递减：1，2，3，4，5，6';
comment on column MOBILESHORTMESSAGE.TYPE
  is '短信类型。移动 1，联通 2，小灵通 3，CDMA 4';

/*==============================================================*/
/* Table: upmobilemessage 上行短消息                                      */
/*==============================================================*/
create table UPMOBILEMESSAGE
(
  ID          NUMBER not null,
  TOID        NUMBER,
  TOSYSTEM    VARCHAR2(32),
  SERVERID    VARCHAR2(32),
  MESSAGE     CLOB,
  SENDER      VARCHAR2(32) not null,
  RECEIVER    VARCHAR2(32),
  RECEIVETIME DATE not null,
  STARTDEALTIME DATE,
  PROCESSTIME DATE,
  type  NUMBER
);

comment on table upmobilemessage is
'上行短消息';
comment on column UPMOBILEMESSAGE.TOID
  is '短信息出口';
comment on column UPMOBILEMESSAGE.TOSYSTEM
  is '短信息出口系统';
comment on column UPMOBILEMESSAGE.SERVERID
  is '短信息远端ID';
comment on column UPMOBILEMESSAGE.MESSAGE
  is '消息体';
comment on column UPMOBILEMESSAGE.SENDER
  is '发送人号码';
comment on column UPMOBILEMESSAGE.RECEIVER
  is '接收人号码';
comment on column UPMOBILEMESSAGE.RECEIVETIME
  is '上发时间';
comment on column UPMOBILEMESSAGE.STARTDEALTIME
  is '短信出列时间，用于控制超时等意外情况';
comment on column UPMOBILEMESSAGE.PROCESSTIME
  is '处理时间，表示该短信已经被具体业务系统读取处理完毕';
comment on column UPMOBILEMESSAGE.TYPE
  is '短信类型。移动 1，联通 2，小灵通 3，CDMA 4';


/*==============================================================*/
/* Table: SMSTables  根据流量来管理短信子表                                           */
/*==============================================================*/
create table SMSTables  (
   ID                   NUMBER                          not null,
   tabName              VARCHAR2(64),
   smsID_begin          NUMBER(20),
   smsID_end            NUMBER(20),
   type                 CHAR(2),
   createTime           DATE,
   status               NUMBER default 0,
   isenddeal          NUMBER default 0,
   constraint PK_SMSTABLES primary key (ID)
);

comment on table SMSTables is
'根据流量来管理短信子表';

comment on column SMSTables.type is
'1:发送表2:接收表';

comment on column SMSTables.isenddeal  is
'发送状态1:读取完毕,0:没有读取完毕';

comment on column SMSTables.status  is
'发送状态1:表已经满了,0:还没有满';

insert into SMSTABLES (ID, TABNAME, SMSID_BEGIN, SMSID_END, TYPE, CREATETIME, STATUS,ISENDDEAL)
values (-1, 'mobileshortmessage', 1, 1000000, '1 ', to_date('10-01-2011', 'dd-mm-yyyy'), 0,0);
insert into SMSTABLES (ID, TABNAME, SMSID_BEGIN, SMSID_END, TYPE, CREATETIME, STATUS,ISENDDEAL)
values (0, 'upmobilemessage', 1, 100000, '2 ', to_date('10-01-2011', 'dd-mm-yyyy'), 0,0);


create table SMSGlobalSettings (
	GlobalName			VARCHAR2(32)		not null,
	GlobalShowName		VARCHAR2(32),
	GlobalValue			VARCHAR2(64)		not null,
	Type				VARCHAR2(64),
	Describtion			VARCHAR2(2000)
);
comment on table SMSGlobalSettings is
'系统全局配置';
comment on column SMSGlobalSettings.GlobalName is
'全局参数名称';
comment on column SMSGlobalSettings.GlobalShowName is
'全局参数显示名称';
comment on column SMSGlobalSettings.GlobalValue is
'全局参数值';
comment on column SMSGlobalSettings.Type is
'数值类型,目前支持time,boolean,text';
comment on column SMSGlobalSettings.Describtion is
'描述信息';
 
insert into SMSGlobalSettings(GlobalName,GlobalShowName,GlobalValue,Type,Describtion)
values ('startSendTime','发送开始时间','00:00:00','time','发送时间，发送时间之前不在允许发送短信');
insert into SMSGlobalSettings(GlobalName,GlobalShowName,GlobalValue,Type,Describtion)
values ('endSendTime','发送结束时间','23:59:59','time','结束时间，结束时间之后不在允许发送短信');
insert into SMSGlobalSettings(GlobalName,GlobalShowName,GlobalValue,Type,Describtion)
values ('isUrgent','是否紧急发送','1','boolean','是否紧急发送，就是取消发送时间的设置，允许1或者0');
insert into SMSGlobalSettings(GlobalName,GlobalShowName,GlobalValue,Type,Describtion)
values ('user','tianque','tianque','string','用户名和密码');

create sequence S_nosendmessage
minvalue 1
maxvalue 99999999999999999999
start with 1
increment by 1
cache 20;
create table nosendmessage  (
   ID                   NUMBER         not null,
   phone                VARCHAR2(32),
   message              CLOB,
   reason               VARCHAR2(100),
   status               NUMBER default 1,
   sentTime             DATE,
   type                 NUMBER,
   constraint PK_NOSENDMESSAGE primary key (ID)
);
comment on table nosendmessage is
'发送失败表（手机黑名单表）';
comment on column nosendmessage.phone is
'电话号码';
comment on column nosendmessage.message is
'短信内容';
comment on column nosendmessage.reason is
'失败原因';
comment on column nosendmessage.reason is
'状态';
comment on column nosendmessage.sentTime is
'发送时间';

insert into SMSGlobalSettings(GlobalName,GlobalShowName,GlobalValue,Type,Describtion)
values ('emailSubject','zhoushangrid','舟山短信','string','邮件主题');
insert into SMSGlobalSettings(GlobalName,GlobalShowName,GlobalValue,Type,Describtion)
values ('emailHost','mail.hztianque.com','mail.hztianque.com','string','邮件服务器');
insert into SMSGlobalSettings(GlobalName,GlobalShowName,GlobalValue,Type,Describtion)
values ('emailFrom','buildmaster@hztianque.com','tianqueshuaige','string','邮件发送者的邮箱及密码');
insert into SMSGlobalSettings(GlobalName,GlobalShowName,GlobalValue,Type,Describtion)
values ('emailTo','',' ','string','邮件接收者的邮箱');

--------------------------------------------------------
-------------短信发送平台系统表，建表语句结束处--------------------
--------------------------------------------------------

--insert into smssendobject (ID, NAME, DESCRIPTION, TEMPLATE, ENABLE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
--values (s_smssendobject.nextval , '吸毒人员', '吸毒人员查询', '<div id="searchTemplate" class="container container_24" style="margin-top:5px;height:130px;border: 1px solid #ccc;">    <div class="grid_4 lable-right">    <label class="form-lbl">身份证号：</label>   </div>   <div class="grid_8">       <input type="text" name="{身份证}" id="idCardNo"  class="form-txt" maxlength="18"/>',
-- 1, 'admin', 'admin', to_date('10-07-2013 08:37:01', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 16:02:33', 'dd-mm-yyyy hh24:mi:ss'));
--
--update smssendobject set TEMPLATE = TEMPLATE||'</div>   <div class="grid_4 lable-right">    <label class="form-lbl">姓名：</label>   </div>   <div class="grid_8">    <input type="text" id="name" name="{姓名}" class="form-txt" />   </div>   <div class="grid_4 lable-right">             <label class="form-lbl">戒毒情况：</label>         </div>         <div class="grid_8">             <select name="{戒毒情况}" class="form-txt">                 <option value=""></option>                 <option value="482">强制戒毒</option>                 <option value="483">劳教戒毒</option>                 <option value="484">限期戒毒</option>                 <option value="485">自愿戒毒</option>                 <option value="486">社区戒毒</option>                 <option value="487">其他</option>             </select>         </div>         <div class="grid_4 lable-right">    <label class="form-lbl">性别：</label>   </div>   <div class="grid_8">'||'<select id="conditionGender" name="{性别}" class="form-txt">                 <option value=""></option>                 <option value="102">未知的性别</option>                 <option value="103">男性</option>                 <option value="104">女性</option>                 <option value="105">未说明的性别</option> </select>   </div>                  <div class=''clearLine''></div>            <div class="grid_4 lable-right">             <label class="form-lbl">吸毒原因： </label>         </div>         <div class="grid_8">             <select id="conditionDrugReason" name="{吸毒原因}" class="form-txt">                  <option value=""></option>                 <option value="469">受亲友吸毒影响</option>                 <option value="470">被人诱骗</option>'||'<option value="471">被人逼迫</option>                 <option value="472">好奇</option>                 <option value="473">为治病</option>                 <option value="474">人生受挫</option>                 <option value="475">寻求刺激</option>                 <option value="476">其他</option>             </select>         </div>            <div class="grid_4 lable-right">    <label class="form-lbl">吸毒状态：</label>   </div>   <div class="grid_8">             <select id="detoxicateCondition" name="{吸毒状态}" class="form-txt"> '||'<option value=""></option>                 <option value="488">在吸</option>                 <option value="489">停吸</option>             </select>         </div>   <div class=''clearLine''></div>    <div class="grid_4 lable-right">    <label class="form-lbl">出生日期 ：</label>   </div>   <div class="grid_3">    <input type="text" id="conditionBirthday" name="{出生日期起始时间}" readonly="readonly" class="form-txt" />   </div>   <div class="grid_2" align="center" style="">—</div>   <div class="grid_3">    <input type="text" id="endConditionBirthday" name="{出生日期结束时间}" readonly="readonly" class="form-txt" />   </div>       <div class="grid_4 lable-right"> '||'<label class="form-lbl">查获日期 ：</label>   </div>   <div class="grid_3">    <input type="text" id="conditionFerretOutDate" name="{查获日期起始时间}" readonly="readonly" class="form-txt" />   </div>   <div class="grid_2" align="center" style="">—</div>   <div class="grid_3">    <input type="text" id="endConditionFerretOutDate" name="{查获日期结束时间}" readonly="readonly" class="form-txt" />   </div>   </div> <script type="text/javascript">  $(document).ready(function(){  $(''#conditionFerretOutDate'').datePicker({   yearRange:''1930:2060'',   maxDate:''+0d''  });  $(''#endConditionFerretOutDate'').datePicker({   yearRange:''1930:2060'',   maxDate:''+0d''  });  $(''#conditionBirthday'').datePicker({   yearRange:''1930:2060'',   maxDate:''+0d''  });  $(''#endConditionBirthday'').datePicker({   yearRange:''1930:2060'',   maxDate:''+0d''  }); });  </script>'       
--where name= '吸毒人员' ;
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'table', null, 'select name as name, mobilenumber as mobile, orgid , orginternalcode from druggys where 1=1 and mobilenumber is not null', '基础sql语句', 1, 'admin', null, to_date('10-07-2013 08:39:24', 'dd-mm-yyyy hh24:mi:ss'), null, null);
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'gender', null, 'and gender={gender}', '性别', null, 'admin', null, to_date('10-07-2013 09:06:37', 'dd-mm-yyyy hh24:mi:ss'), null, null);
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'startBirthday', null, 'and birthday > to_date(''{startBirthday}'',''yyyy-mm-dd'')', '出生日期起始时间', 0, 'admin', 'admin', to_date('10-07-2013 10:58:53', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 15:32:31', 'dd-mm-yyyy hh24:mi:ss'), 'date');
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'name', null, 'and name like ''{name}%''', '姓名', 0, 'admin', 'admin', to_date('10-07-2013 13:31:04', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 17:26:49', 'dd-mm-yyyy hh24:mi:ss'), 'varchar2');
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'endBirthday', null, 'and birthday < to_date(''{endBirthday}'',''yyyy-mm-dd'')', '出生日期结束时间', 0, 'admin', 'admin', to_date('10-07-2013 15:28:02', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 15:28:13', 'dd-mm-yyyy hh24:mi:ss'), 'date');
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'idcardno', null, 'and idcardno like ''{idcardno}%''', '身份证', 0, 'admin', 'admin', to_date('10-07-2013 15:37:02', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 17:26:33', 'dd-mm-yyyy hh24:mi:ss'), 'varchar2');
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'startFerretoutdate', null, 'and ferretoutdate > to_date(''{startFerretoutdate}'',''yyyy-mm-dd'')', '查获日期起始时间', 0, 'admin', 'admin', to_date('10-07-2013 15:39:45', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 17:26:26', 'dd-mm-yyyy hh24:mi:ss'), 'date');
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'endFerretoutdate', null, 'and ferretoutdate < to_date(''{endFerretoutdate}'',''yyyy-mm-dd'')', '查获日期结束时间', 0, 'admin', 'admin', to_date('10-07-2013 15:41:33', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 17:26:22', 'dd-mm-yyyy hh24:mi:ss'), 'date');
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'drugreason', null, 'and drugreason = {drugreason}', '吸毒原因', 0, 'admin', 'admin', to_date('10-07-2013 15:44:44', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 17:26:16', 'dd-mm-yyyy hh24:mi:ss'), 'number');
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'detoxicatecondition', null, 'and detoxicatecondition = {detoxicatecondition}', '吸毒状态', 0, 'admin', 'admin', to_date('10-07-2013 15:45:35', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 17:26:10', 'dd-mm-yyyy hh24:mi:ss'), 'number');
--
--insert into smsquerycondition (ID, OBJECTID, KEY, FIELD, SQLTEMPLATE, DESCRIPTION, ISNULL, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE, TYPE)
--values (s_smsquerycondition.nextval, ( select id from smssendobject s where s.name='吸毒人员' ) , 'detoxicatecase', null, 'and detoxicatecase = {detoxicatecase}', '戒毒情况', 0, 'admin', 'admin', to_date('10-07-2013 15:46:46', 'dd-mm-yyyy hh24:mi:ss'), to_date('10-07-2013 17:26:04', 'dd-mm-yyyy hh24:mi:ss'), 'number');

commit;


--创建 通知通报与岗位对应关系表
create table publicNoticeRole(
       noticeId number(10),
       roleId number(10)
);
alter table publicNoticeRole add constraints PK_publicNoticeRole primary key (noticeId, roleId);

--创建 通知通报与用户对应关系表，用户已读通知通报存放。
create table publicNoticeUser(
       noticeId number(10),
       userId number(10),
       readTime Date default sysdate
);
alter table publicNoticeUser add constraints PK_publicNoticeUser primary key (noticeId, userId);

comment on column publicNoticeUser.readTime
  is '读取时间';
  
--创建 通知通报与组织机构对应关系表
create table publicNoticeOrganizations(
       noticeId number(10),
       orgId varchar2(30)
);
alter table publicNoticeOrganizations add constraints PK_publicNoticeOrganizations primary key (noticeId, orgId);


-- 通知通报新增落款字段
alter table PUBLICNOTICE add publicnoticeinscribe varchar2(200);
-- Add comments to the columns 
comment on column PUBLICNOTICE.publicnoticeinscribe
  is '落款';

create sequence S_excelimportlog
minvalue 1
maxvalue 99999999999999999999
start with 1
increment by 1
cache 20;
create table excelimportlog  (
   ID                   NUMBER         not null,
   uuid                VARCHAR2(36)  not null,
   createUser       VARCHAR2(32) 	,
   fileName          VARCHAR2(100),
   fileType          VARCHAR2(50),
   status               number default 1,
   importDataNum        number,
   currentDealNum       number,
   errorCountNum        number,
   importModuleName		varchar2(150) 	not null,
   organizationId		number(10) 		not null,
   orginternalcode		varchar2(150) 	not null,
   createDate           DATE                            not null,
   updateDate           DATE,
   constraint PK_EXCELIMPORTLOG primary key (ID)
);
comment on table excelimportlog is
'excel 导入日志';


CREATE SEQUENCE S_SERVICESUPERVISIONMEASURES
MINVALUE 1
MAXVALUE 99999999999999999999
START WITH 1
INCREMENT BY 1
CACHE 20;
CREATE TABLE SERVICESUPERVISIONMEASURES  (
   ID                     NUMBER  NOT NULL,
   MENTALPATIENTID        NUMBER  NOT NULL,
   UPTIME                 DATE,
   SUPERVISEPERSONNEL     VARCHAR2(60),
   SUPERVISEINFO          VARCHAR2(400),
   CONSTRAINT PK_SERVICESUPERVISIONMEASURES PRIMARY KEY (ID)
);
COMMENT ON TABLE EXCELIMPORTLOG IS
'精神病人员服务监管措施';

-- Add/modify columns 
alter table SERVICESUPERVISIONMEASURES modify uptime not null;
alter table SERVICESUPERVISIONMEASURES modify supervisepersonnel not null;
alter table SERVICESUPERVISIONMEASURES modify superviseinfo not null;
-- Add comments to the columns 
comment on column SERVICESUPERVISIONMEASURES.mentalpatientid
  is '精神病人员ID';
comment on column SERVICESUPERVISIONMEASURES.uptime
  is '时间';
comment on column SERVICESUPERVISIONMEASURES.supervisepersonnel
  is '监管人员';
comment on column SERVICESUPERVISIONMEASURES.superviseinfo
  is '监管措施';
alter table SERVICESUPERVISIONMEASURES add type varchar2(60);
comment on column SERVICESUPERVISIONMEASURES.type
  is '类型';
  create sequence s_visithistory
minvalue 1
maxvalue 99999999999999999999
start with 1
increment by 1
cache 20;
create table SuperiorVisitHistory  (
   id          NUMBER(10) not null,
  createuser  VARCHAR2(32),
  createdate  DATE,
  updatedate  DATE,
  visitdate   DATE,
  visitreason VARCHAR2(1000),
  visitstate  NUMBER(10),
  visittype   NUMBER(10),
  updateuser  VARCHAR2(32),
  visitid     NUMBER(10) not null,
   constraint PK_SuperiorVisitHistory primary key (ID)
);
comment on table SuperiorVisitHistory is
'上访历史记录表';
comment on column SuperiorVisitHistory.visitdate
  is '上访时间';
comment on column SuperiorVisitHistory.visitreason
  is '上访原因';
comment on column SuperiorVisitHistory.visitstate
  is '上访状态';
comment on column SuperiorVisitHistory.visittype
  is '上访类型';

create table visitHisTypes  (
   superiorVisitHistoryId      NUMBER(10)                      not null,
   superiorVisitType    NUMBER(10)
);

comment on table visitHisTypes is
'上访历史类型';

comment on column visitHisTypes.superiorVisitHistoryId is
'信访历史ID';

comment on column visitHisTypes.superiorVisitType is
'上访类型';

--残疾人 类别  等级 多选关联表
CREATE SEQUENCE S_HANDICAPPEDSDISABILITYTYPE
MINVALUE 1
MAXVALUE 99999999999999999999
START WITH 1
INCREMENT BY 1
CACHE 20;

-- Create table
create table HANDICAPPEDSDISABILITYTYPE
(
  id                NUMBER not null,
  handicappedsid    NUMBER not null,
  handicappedstype  NUMBER not null,
  handicappedslevel NUMBER not null
);
-- Add comments to the table 
comment on table HANDICAPPEDSDISABILITYTYPE
  is '残疾人类别等级关联表';
-- Add comments to the columns 
comment on column HANDICAPPEDSDISABILITYTYPE.id
  is '主键';
comment on column HANDICAPPEDSDISABILITYTYPE.handicappedsid
  is '残疾人ID';
comment on column HANDICAPPEDSDISABILITYTYPE.handicappedstype
  is '残疾类型';
comment on column HANDICAPPEDSDISABILITYTYPE.handicappedslevel
  is '残疾等级';
-- Create/Recreate primary, unique and foreign key constraints 
alter table HANDICAPPEDSDISABILITYTYPE
  add constraint PK_HANDICAPPEDSDISABILITYTYPE primary key (ID);
  -- Add/modify columns 
alter table HANDICAPPEDSDISABILITYTYPE add isdatamanage number(1) default 0;
-- Add comments to the columns 
comment on column HANDICAPPEDSDISABILITYTYPE.isdatamanage
  is '是否是数据认领数据 0 否 1是';
  

-- Create table  实有单位从业人员关联表
create table ACTUALCOMPANYPRACTITIONERS
(
  actualcompanyid NUMBER(10) not null,
  personid        NUMBER(10) not null,
  persontype      VARCHAR2(20) not null
);
-- Add comments to the table 
comment on table ACTUALCOMPANYPRACTITIONERS
  is '实有单位从业人员关联表';
-- Add comments to the columns 
comment on column ACTUALCOMPANYPRACTITIONERS.actualcompanyid
  is '实有单位ID';
comment on column ACTUALCOMPANYPRACTITIONERS.personid
  is '人员ID';
comment on column ACTUALCOMPANYPRACTITIONERS.persontype
  is '人员类型 户籍人口 流动人口 未落户人口';
-- Create/Recreate primary, unique and foreign key constraints 
alter table ACTUALCOMPANYPRACTITIONERS
  add constraint PK_ACTUALCOMPANYPRACTITIONERS primary key (ACTUALCOMPANYID, PERSONTYPE, PERSONID);

create sequence s_DM_builddatas_Temp
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create table DM_builddatas_Temp
(
  ID      		  	NUMBER(10) not null,
  BUILDINGID      	VARCHAR2(32),
  ORGANIZATION      NUMBER(10) not null,
  ORGINTERNALCODE   VARCHAR2(32) not null,
  BUILDINGNAME      VARCHAR2(150),
  BUILDINGADDRESS   VARCHAR2(150),
  owner          VARCHAR2(60),
  responsibleperson VARCHAR2(60),
  phone        varchar2(15),
  buildingstructures number(32),
  CENTERX           NUMBER(10),
  CENTERY           NUMBER(10),
  isLayout      NUMBER(1)  default 0,
  CREATEUSER        VARCHAR2(32) not null,
  UPDATEUSER        VARCHAR2(32),
  CREATEDATE        DATE not null,
  UPDATEDATE        DATE,
  type        number(32) ,
  centerLon      VARCHAR2(32),
  centerLat      VARCHAR2(32),
  centerLon2    VARCHAR2(32),
  centerLat2    VARCHAR2(32),
  claimState             NUMBER(10) default 0,
  claimDate              DATE,
  claimUserName          VARCHAR2(4000),
  claimUserId            NUMBER(10),
  claimOrgId             NUMBER(10),
  importDepartmentId     NUMBER(10)   not null,
  oldOrgId    NUMBER(10),
  inId      NUMBER(10),
  dispose     NUMBER(10) default 0,
  claimavailable         NUMBER(10) default 0,
  importDate              DATE,
  districtOrgId          NUMBER(10),
  isPropertyManagement   NUMBER(1),
  constraint pkDm_BuilddatasTemp primary key (id),
  constraint fkDm_BuilddatasTempOrg foreign key (ORGANIZATION)
         references organizations (id)
);
comment on table DM_builddatas_Temp
  is '数据管理_楼宇信息表';
comment on column DM_builddatas_Temp.id
  is '表ID';
comment on column DM_builddatas_Temp.BUILDINGID
  is '楼宇ID';
comment on column DM_builddatas_Temp.ORGANIZATION
  is '所属网格';
comment on column DM_builddatas_Temp.ORGINTERNALCODE
  is '所属网格编号';
comment on column DM_builddatas_Temp.BUILDINGNAME
  is '楼宇名称';
comment on column DM_builddatas_Temp.BUILDINGADDRESS
  is '楼宇地址';
comment on column DM_builddatas_Temp.owner
  is '业主';
comment on column DM_builddatas_Temp.responsibleperson
  is '负责人';
comment on column DM_builddatas_Temp.buildingstructures
  is '建筑结构';
comment on column DM_builddatas_Temp.phone
  is '联系电话';
comment on column DM_builddatas_Temp.CENTERX
  is '楼宇中心坐标X';
comment on column DM_builddatas_Temp.CENTERY
  is '楼宇中心坐标Y';
comment on column DM_builddatas_Temp.isLayout
  is '是否有楼宇布局';
comment on column DM_builddatas_Temp.CREATEUSER
  is '创建用户';
comment on column DM_builddatas_Temp.UPDATEUSER
  is '修改用户';
comment on column DM_builddatas_Temp.CREATEDATE
  is '创建日期';
comment on column DM_builddatas_Temp.UPDATEDATE
  is '修改时间';
comment on column DM_builddatas_Temp.type
  is '楼宇类型';
comment on column DM_builddatas_Temp.centerLon
  is '楼宇经度';
comment on column DM_builddatas_Temp.centerLat
  is '楼宇纬度';
  comment on column DM_builddatas_Temp.claimState is
'认领状态：0未认领；1被未认领；10已认领；11被认领';

comment on column DM_builddatas_Temp.claimDate is
'认领日期';

comment on column DM_builddatas_Temp.claimUserName is
'认领人用户名';

comment on column DM_builddatas_Temp.claimUserId is
'认领人Id';

comment on column DM_builddatas_Temp.claimOrgId is
'认领人网格';

comment on column DM_builddatas_Temp.importDepartmentId is
'导入部门Id';

comment on column DM_builddatas_Temp.oldOrgId is
'刚导入时的所属网格Id';

comment on column DM_builddatas_Temp.inId is
'认领时插入到原库中数据id';

comment on column DM_builddatas_Temp.dispose  is
'是否经过处理 0.未处理；1.处理过';

comment on column DM_builddatas_Temp.claimavailable is
'是否可认领 0.不可认领；1.可认领';  
comment on column DM_builddatas_Temp.importDate
  is '导入时间';
comment on column DM_builddatas_Temp.districtOrgId is
'导入时的到县区的组织机构';
comment on column DM_builddatas_Temp.isPropertyManagement is
'是否有物管';


-- 实有房屋添加房产证地址字段
alter table HOUSEINFO add houseaddress VARCHAR2(200);
comment on column HOUSEINFO.houseaddress
  is '房产证地址';
alter table RENTALHOUSE add houseaddress VARCHAR2(200);
comment on column RENTALHOUSE.houseaddress
  is '房产证地址';
alter table HOUSEINFO modify community VARCHAR2(200);
alter table RENTALHOUSE modify community VARCHAR2(200);

--景区交通序列
create sequence S_SCENICTRAFFIC
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
--景区交通表
create table SCENICTRAFFIC
(
  id                 NUMBER(10) not null,
  orgid              NUMBER(10) not null,
  orginternalcode    VARCHAR2(50),
  startaddress       VARCHAR2(60),
  endaddress         VARCHAR2(60),
  traffictype        NUMBER(10) not null,
  phone              VARCHAR2(32),
  trafficname        VARCHAR2(200),
  managerunit        VARCHAR2(200),
  managerpeople      VARCHAR2(30),
  managerpeoplephone VARCHAR2(32),
  aroundscenic       VARCHAR2(900),
  firstbustime       VARCHAR2(20),
  lastbustime        VARCHAR2(20),
  remark             VARCHAR2(900),
  imgurl             VARCHAR2(300),
  fullpinyin         VARCHAR2(30),
  simplepinyin       VARCHAR2(10),
  createuser         VARCHAR2(32) not null,
  updateuser         VARCHAR2(32),
  createdate         DATE not null,
  updatedate         DATE,
  sourcesstate       NUMBER(1) default 1,
  logoutreason       VARCHAR2(150),
  isemphasis         NUMBER(1) default 0,
  logouttime         DATE
);
comment on table SCENICTRAFFIC
  is '景区交通';
comment on column SCENICTRAFFIC.id
  is '主键ID';
comment on column SCENICTRAFFIC.orgid
  is '组织ID';
comment on column SCENICTRAFFIC.orginternalcode
  is '组织层级';
comment on column SCENICTRAFFIC.startaddress
  is '起点名称';
comment on column SCENICTRAFFIC.endaddress
  is '终点名称';
comment on column SCENICTRAFFIC.traffictype
  is '交通类型';
comment on column SCENICTRAFFIC.phone
  is '联系电话';
comment on column SCENICTRAFFIC.trafficname
  is '交通线路名称';
comment on column SCENICTRAFFIC.managerunit
  is '负责单位';
comment on column SCENICTRAFFIC.managerpeople
  is '负责人';
comment on column SCENICTRAFFIC.managerpeoplephone
  is '负责人电话';
comment on column SCENICTRAFFIC.aroundscenic
  is '周边景点';
comment on column SCENICTRAFFIC.firstbustime
  is '最早班车时间';
comment on column SCENICTRAFFIC.lastbustime
  is '最晚班车时间';
comment on column SCENICTRAFFIC.remark
  is '备注';
comment on column SCENICTRAFFIC.imgurl
  is '图片路径';
comment on column SCENICTRAFFIC.fullpinyin
  is '全拼音';
comment on column SCENICTRAFFIC.simplepinyin
  is '简拼音';
comment on column SCENICTRAFFIC.createuser
  is '创建人';
comment on column SCENICTRAFFIC.updateuser
  is '修改人';
comment on column SCENICTRAFFIC.createdate
  is '创建时间';
comment on column SCENICTRAFFIC.updatedate
  is '修改时间';
comment on column SCENICTRAFFIC.sourcesstate
  is '数据来源';
comment on column SCENICTRAFFIC.logoutreason
  is '取消关注原因';
comment on column SCENICTRAFFIC.isemphasis
  is '是否关注';
comment on column SCENICTRAFFIC.logouttime
  is '取消关注时间';
alter table SCENICTRAFFIC
  add primary key (ID);
alter table SCENICTRAFFIC
  add constraint FKSCENICTRAFFIC foreign key (ORGID)
  references ORGANIZATIONS (ID);


-- Create sequence
create sequence S_SCENICSPOTS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
-- Create table
create table SCENICSPOTS
(
  ID                       NUMBER(10) not null,
  ORGID                    NUMBER(10) not null,
  ORGINTERNALCODE          VARCHAR2(32) not null,
  NAME                     VARCHAR2(90) not null,
  ADDRESS                  VARCHAR2(150),
  GRADE                    VARCHAR2(60),
  TELEPHONE                VARCHAR2(15),
  PERSONLIABLE             VARCHAR2(60),
  PERSONLIABLETELEPHONE    VARCHAR2(15),
  INTRODUCTION             VARCHAR2(900),
  REMARK                   VARCHAR2(600),
  IMGURL                   VARCHAR2(300),
  FULLPINYIN               VARCHAR2(30),
  SIMPLEPINYIN             VARCHAR2(10),
  CREATEUSER               VARCHAR2(32) not null,
  UPDATEUSER               VARCHAR2(32),
  CREATEDATE               DATE not null,
  UPDATEDATE               DATE,
  ISEMPHASIS               NUMBER(1) default 0,
  ISEMPHASISREASON         VARCHAR2(300),
  ISEMPHASISDATE           DATE,
  ATTENTIONEXTENT          NUMBER(10),
  SOURCESSTATE             NUMBER(1) default 1
);
-- Add comments to the table 
comment on table SCENICSPOTS
  is '旅游景点';
-- Add comments to the columns 
comment on column SCENICSPOTS.ID
  is '编号';
comment on column SCENICSPOTS.ORGID
  is '所属网格';
comment on column SCENICSPOTS.ORGINTERNALCODE
  is '所属网格编号';
comment on column SCENICSPOTS.NAME
  is '景点名称';
comment on column SCENICSPOTS.ADDRESS
  is '景点地址';
comment on column SCENICSPOTS.GRADE
  is '景点等级';
comment on column SCENICSPOTS.TELEPHONE
  is '景点电话';
comment on column SCENICSPOTS.PERSONLIABLE
  is '景点负责人';
comment on column SCENICSPOTS.PERSONLIABLETELEPHONE
  is '景点负责人电话';
comment on column SCENICSPOTS.INTRODUCTION
  is '景点介绍';
comment on column SCENICSPOTS.REMARK
  is '备注';
comment on column SCENICSPOTS.IMGURL
  is '图片URL';
comment on column SCENICSPOTS.FULLPINYIN
  is '全拼';
comment on column SCENICSPOTS.SIMPLEPINYIN
  is '简拼';
comment on column SCENICSPOTS.CREATEUSER
  is '创建人';
comment on column SCENICSPOTS.UPDATEUSER
  is '修改人';
comment on column SCENICSPOTS.CREATEDATE
  is '创建时间';
comment on column SCENICSPOTS.UPDATEDATE
  is '修改时间';
comment on column SCENICSPOTS.ISEMPHASIS
  is '是否关注';
comment on column SCENICSPOTS.ISEMPHASISREASON
  is '取消关注原因';
comment on column SCENICSPOTS.ISEMPHASISDATE
  is '取消关注时间';
comment on column SCENICSPOTS.ATTENTIONEXTENT
  is '关注程度：1.一般；2.中等；3.严重';
comment on column SCENICSPOTS.SOURCESSTATE
  is '数据来源：1.录入；2.认领；3.已核实';
-- Create/Recreate primary, unique and foreign key constraints 
alter table SCENICSPOTS
  add constraint PKSCENICSPOTS primary key (ID);
alter table SCENICSPOTS
  add constraint FKSCENICSPOTSORG foreign key (ORGID)
  references ORGANIZATIONS (ID);

  create sequence s_scenicEquipment
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

 create table scenicEquipment (
  id                   NUMBER(10)                      not null,
  orgId                NUMBER(10)                      not null,
  orgInternalCode      VARCHAR2(32)                    not null,
  equipName           VARCHAR2(150)           not null,
  equipAddress         VARCHAR2(150)          ,
  equipType            NUMBER(10),
  manager              VARCHAR2(60),
  managerMobile         VARCHAR2(15) ,
  aroundScenic         VARCHAR2(900)  , 
  mobile               VARCHAR2(15) ,
  remark            VARCHAR2(900),
  imgUrl               VARCHAR2(300),
  fullPinyin           VARCHAR2(30),
    simplePinyin         VARCHAR2(10),
    createUser           VARCHAR2(32)                    not null,
    updateUser           VARCHAR2(32),
    createDate           DATE                            not null,
    updateDate           DATE,
    sourcesstate NUMBER(1)  default 1 ,
    logoutreason	VARCHAR2(150)	,
isemphasis          NUMBER(1) default 0,
logouttime	DATE	,
  constraint       pkScenicEquipment primary key(id),
  constraint       fkScenicEquipment foreign key(orgId)
    references organizations(id)
);
comment on table scenicEquipment is
'景区配套设施信息';
comment on column scenicEquipment.id is
'设施Id';
comment on column scenicEquipment.orgId is
'所属网格';
comment on column scenicEquipment.orgInternalCode is
'所属责任区编号';
comment on column scenicEquipment.equipName is
'名称';
comment on column scenicEquipment.equipAddress is
'地址';
comment on column scenicEquipment.manager is
'负责人';
comment on column scenicEquipment.mobile is
'联系电话';
comment on column scenicEquipment.aroundScenic is
'周边景点';
comment on column scenicEquipment.managerMobile is
'负责人联系电话';
comment on column scenicEquipment.remark is
'备注';



-- 新建表 旅游景点 投诉表扬
-- Create sequence
create sequence S_praiseScenicSpot
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

-- Create table
create table praiseScenicSpot
(
  ID                       NUMBER(10) not null,
  scenicSpotId             NUMBER(10) not null,
  feedbackType             NUMBER(10),
  feedbackTime             DATE,
  feedbackPerson           VARCHAR2(30),
  feedbackPersonTelephone  VARCHAR2(20),
  introduction             VARCHAR2(900),
  FULLPINYIN               VARCHAR2(30),
  SIMPLEPINYIN             VARCHAR2(10),
  CREATEUSER               VARCHAR2(32),
  UPDATEUSER               VARCHAR2(32),
  CREATEDATE               DATE,
  UPDATEDATE               DATE
);
-- Add comments to the table 
comment on table praiseScenicSpot
  is '旅游景点投诉表扬';
-- Add comments to the columns 
comment on column praiseScenicSpot.ID
  is '编号';
comment on column praiseScenicSpot.scenicSpotId
  is '投诉景点编号';
comment on column praiseScenicSpot.feedbackType
  is '反馈类型';
comment on column praiseScenicSpot.feedbackTime
  is '反馈时间';
comment on column praiseScenicSpot.feedbackPerson
  is '反馈人';
comment on column praiseScenicSpot.feedbackPersonTelephone
  is '反馈人电话';
comment on column praiseScenicSpot.introduction
  is '情况描述';
comment on column praiseScenicSpot.FULLPINYIN
  is '全拼';
comment on column praiseScenicSpot.SIMPLEPINYIN
  is '简拼';
comment on column praiseScenicSpot.CREATEUSER
  is '创建人';
comment on column praiseScenicSpot.UPDATEUSER
  is '修改人';
comment on column praiseScenicSpot.CREATEDATE
  is '创建时间';
comment on column praiseScenicSpot.UPDATEDATE
  is '修改时间';
-- Create/Recreate primary, unique and foreign key constraints 
alter table praiseScenicSpot
  add constraint pkpraiseScenicSpot primary key (ID);
alter table praiseScenicSpot
  add constraint fkpraiseScenicSpotOrg foreign key (scenicSpotId)
  references scenicspots (ID);
  
  ----行政部门绩效考核
create sequence s_administrativeStandard
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;


create table administrativeStandard(
   id                   NUMBER(10)                      not null,
   useLevel		NUMBER(10)                      ,
   orgInternalId	NUMBER(10)                     	,
   yellowLimitAccept    NUMBER(10),
   yellowLimitHandle	NUMBER(10),
   yellowLimitVerify	NUMBER(10),
   redLimitAccept	NUMBER(10),
   redLimitHandle	NUMBER(10),
   redLimitVerify	NUMBER(10),
   remark            	VARCHAR2(600), 
   createorg number(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   issuedomainid number(10),
   issuetypeid number(10),
   constraint pkadministrativeStandard primary key (id)
);
comment on table administrativeStandard is
'行政部门时限标准表';
comment on column administrativeStandard.id is
'主键';
comment on column administrativeStandard.useLevel is
'应用层级';
comment on column administrativeStandard.orgInternalId is
'应用层级内置编码';
comment on column administrativeStandard.yellowLimitAccept is
'黄牌受理时限';
comment on column administrativeStandard.yellowLimitHandle is
'黄牌办理时限';
comment on column administrativeStandard.redLimitAccept is
'红牌受理时限';
comment on column administrativeStandard.redLimitHandle is
'红牌办理时限';
comment on column administrativeStandard.remark is
'备注';
comment on column administrativestandard.createorg is
'制定部门id';
comment on column administrativeStandard.createUser is
'创建用户';
comment on column administrativeStandard.updateUser is
'修改用户';
comment on column administrativeStandard.createDate is
'创建日期';
comment on column administrativeStandard.updateDate is
'修改时间';
comment on column administrativestandard.issuedomainid is
'事件类型';
comment on column administrativestandard.issuetypeid is
'事件子类';
comment on column ADMINISTRATIVESTANDARD.YELLOWLIMITVERIFY
  is '黄牌验证时限';
comment on column ADMINISTRATIVESTANDARD.REDLIMITVERIFY
  is '红牌验证时限';

insert into administrativeStandard (ID, yellowLimitAccept, yellowLimitHandle, redLimitAccept, redLimitHandle,remark ,createUser,createDate)
values (s_administrativeStandard.Nextval, 1, 1, 2, 2,'该时限标准为默认时限标准', 'admin',sysdate);
commit;


create sequence s_issueStandardForFunOrg
minvalue 1
maxvalue 999999999999999
start with 1
increment by 1;

create table issueStandardForFunOrg(
   id                   NUMBER(10)                      not null,
   userLevel		NUMBER(10)                       ,
   orgId    NUMBER(10)                      ,
   yellowLimitAccept    NUMBER(10),
   yellowLimitHandle  NUMBER(10),
   yellowLimitVerify  NUMBER(10),
   redLimitAccept  NUMBER(10),
   redLimitHandle  NUMBER(10),
   redLimitVerify  NUMBER(10),
   remark              VARCHAR2(600), 
   itemname        number(10),
   createUser           VARCHAR2(32)                    not null,
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   constraint pkissueStandardForFunOrg primary key (id),
   constraint ORGID_ITEMNAME_UNIQUE unique (ORGID, ITEMNAME)
);
comment on table issueStandardForFunOrg is
'职能部门时限标准表';
comment on column issueStandardForFunOrg.id is
'主键';
comment on column issueStandardForFunOrg.userLevel is
'当前用户所处层级';
comment on column issueStandardForFunOrg.orgId is
'职能部门id';
comment on column issueStandardForFunOrg.yellowLimitAccept is
'黄牌受理时限';
comment on column issueStandardForFunOrg.yellowLimitHandle is
'黄牌办理时限';
comment on column issueStandardForFunOrg.redLimitAccept is
'红牌受理时限';
comment on column issueStandardForFunOrg.redLimitHandle is
'红牌办理时限';
comment on column issueStandardForFunOrg.itemname is
'项目名称';
comment on column issueStandardForFunOrg.remark is
'备注';
comment on column issueStandardForFunOrg.createUser is
'创建用户';
comment on column issueStandardForFunOrg.updateUser is
'修改用户';
comment on column issueStandardForFunOrg.createDate is
'创建日期';
comment on column issueStandardForFunOrg.updateDate is
'修改时间';
comment on column ISSUESTANDARDFORFUNORG.YELLOWLIMITVERIFY
  is '黄牌验证时限';
comment on column ISSUESTANDARDFORFUNORG.REDLIMITVERIFY
  is '红牌验证时限';

alter table issuesteps add itemtype number(10);
comment on column issuesteps.itemtype is
'项目类型';

insert into issueStandardForFunOrg (ID, YELLOWLIMITACCEPT, YELLOWLIMITHANDLE, REDLIMITACCEPT, REDLIMITHANDLE, CREATEUSER, CREATEDATE,remark)
values (s_issueStandardForFunOrg.Nextval, 1, 5, 2, 10, 'admin', sysdate,'该时限标准为默认时限标准');

--事件类型越级规则设置--

create sequence S_ISSUE_SKIPRULE
minvalue 1
maxvalue 99999999999
start with 1
increment by 1
cache 20;

create table ISSUE_SKIPRULE
(
  ID                NUMBER(10) not null,
  ORG_ID             NUMBER(10) not null,
  ORG_INTERNAL_CODE   VARCHAR2(32),
  ISSUE_TYPE_ID       NUMBER(10) not null,
  ISSUE_TYPE_DOMAIN_ID NUMBER(10) not null,
  ISSUE_URGENT_LEVEL  NUMBER(10) not null,
  SUBMIT_LEVEL       NUMBER(10) not null,
  CC_ORG_IDS          VARCHAR2(512),
  MESSAGE_FLAG       VARCHAR2(1) default 0,
  CREATEUSER        VARCHAR2(32) not null,
  UPDATEUSER        VARCHAR2(32),
  CREATEDATE        DATE not null,
  UPDATEDATE        DATE,
  STATUS	NUMBER(2) default 1 not null,
  constraint PK_ISSUESKIPRULE primary key (ID),
  constraint UQ_ISSUESKIPRULE unique (ORG_ID, ISSUE_TYPE_DOMAIN_ID, ISSUE_TYPE_ID, ISSUE_URGENT_LEVEL)
);
comment on table ISSUE_SKIPRULE
  is '事件类型越级规则设置';

comment on column ISSUE_SKIPRULE.ORG_ID
  is '所属网格';
comment on column ISSUE_SKIPRULE.ORG_INTERNAL_CODE
  is '所属网格编号';
comment on column ISSUE_SKIPRULE.ISSUE_TYPE_ID
  is '事件所属类型(小类)id';
comment on column ISSUE_SKIPRULE.ISSUE_TYPE_DOMAIN_ID
  is '事件所属类型(大类)id';
comment on column ISSUE_SKIPRULE.ISSUE_URGENT_LEVEL
  is '审核流程(重大紧急等级)';
comment on column ISSUE_SKIPRULE.SUBMIT_LEVEL
  is '上报层级';
comment on column ISSUE_SKIPRULE.CC_ORG_IDS
  is '抄送单位id数组';
comment on column ISSUE_SKIPRULE.MESSAGE_FLAG
  is '是否短信提醒(0否1是)';
comment on column ISSUE_SKIPRULE.STATUS
  is '是否启用 1:是   0:否';


--短信提醒人表--

create sequence S_ISSUE_MESSAGE_REMIND
minvalue 1
maxvalue 99999999999
start with 1
increment by 1
cache 20;

create table ISSUE_MESSAGE_REMIND
(
  ID                NUMBER(10) not null,
  CONTACTS_NAME     VARCHAR2(64) not null,
  CONTACTS_MOBILE   VARCHAR2(11) not null,
  ISSUE_SKIPRULE_ID NUMBER(10) not null,
  CREATEUSER        VARCHAR2(32) not null,
  UPDATEUSER        VARCHAR2(32),
  CREATEDATE        DATE not null,
  UPDATEDATE        DATE,
  constraint PK_ISSUE_MESSAGE_REMIND primary key (ID)
);
comment on table ISSUE_MESSAGE_REMIND
  is '事件类型越级短信提醒';
comment on column ISSUE_MESSAGE_REMIND.CONTACTS_NAME
  is '联系人姓名';
comment on column ISSUE_MESSAGE_REMIND.CONTACTS_MOBILE
  is '联系手机';
comment on column ISSUE_MESSAGE_REMIND.ISSUE_SKIPRULE_ID
  is '事件类型越级规则ID';

commit;

create sequence S_issueRelatedPeople
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table issueRelatedPeople  (
   ID                   NUMBER(10)         not null,
   name                 VARCHAR2(60),
   telephone            VARCHAR2(15),
   fixPhone				VARCHAR2(15),
   issueId              NUMBER(10)         not null,
   constraint PK_issueRelatedPeople primary key (ID)
);
comment on table issueRelatedPeople is
'事件相关人员表';
comment on column issueRelatedPeople.name is
'相关人员姓名';
comment on column issueRelatedPeople.telephone is
'联系电话';
comment on column issueRelatedPeople.fixPhone is
'固话';
comment on column issueRelatedPeople.issueId is
'事件ID';


CREATE SEQUENCE S_ISSUEAPPLYDELAY
INCREMENT BY 1
START WITH 1
MAXVALUE 9999999999
MINVALUE 1
CACHE 20;

-- Create table 延期申请表
create table ISSUEAPPLYDELAY
(
  id                 NUMBER(10) not null,
  stepid             NUMBER(10) not null,
  delayinfo          VARCHAR2(1000) not null,
  delaydate          DATE,
  delayworkday       NUMBER not null,
  auditorg           NUMBER(10) not null,
  auditstate         NUMBER(2),
  permitdelaydate    DATE,
  permitdelayworkday NUMBER,
  auditinfo          VARCHAR2(1000),
  applyDate         DATE not null,
  applyUser         NUMBER(10) not null,
  auditdate          DATE,
  audituser          NUMBER(10),
  constraint pkIssueApplyDelay primary key (ID)
);
-- Add comments to the table 
comment on table ISSUEAPPLYDELAY
  is '延期申请';
-- Add comments to the columns 
comment on column ISSUEAPPLYDELAY.stepid
  is '流程节点id';
comment on column ISSUEAPPLYDELAY.delayinfo
  is '延期原因';
comment on column ISSUEAPPLYDELAY.delaydate
  is '延期时间';
comment on column ISSUEAPPLYDELAY.delayworkday
  is '延期工作日';
comment on column ISSUEAPPLYDELAY.auditorg
  is '审核组织';
comment on column ISSUEAPPLYDELAY.auditstate
  is '审核状态 0 同意 1 不同意';
comment on column ISSUEAPPLYDELAY.permitdelaydate
  is '允许延期时间';
comment on column ISSUEAPPLYDELAY.permitdelayworkday
  is '允许延期工作日';
comment on column ISSUEAPPLYDELAY.auditinfo
  is '审核意见（备注）';
comment on column ISSUEAPPLYDELAY.applyDate
  is '申请时间';
comment on column ISSUEAPPLYDELAY.applyUser
  is '申请人';
comment on column ISSUEAPPLYDELAY.auditdate
  is '审核时间';
comment on column ISSUEAPPLYDELAY.audituser
  is '审核人';
  
CREATE SEQUENCE S_IntegratedIndicator
INCREMENT BY 1
START WITH 1
MAXVALUE 9999999999
MINVALUE 1
CACHE 20;
  
create table IntegratedIndicator (
 id number (10),
 year varchar2(4),
 month varchar2(2),
 orgid number(10) not null,
 parentorgid number(10) not null,
 orgtype number(10) not null,
 scord number(10,3) default 0.000,
 grade number(1) default 0,
 coefficient number(1) default 0,
 issueSum number(10) default 0,
 dealissueSum number(10) default 0,
 createuser varchar2(60),
 createdate date,
 constraint pkIntegratedIndicator primary key (ID)
);
-- Add comments to the table 
comment on table IntegratedIndicator
  is '事件绩效综合指标表';
-- Add comments to the columns 
comment on column IntegratedIndicator.year
  is '统计的年份';
comment on column IntegratedIndicator.month
  is '统计的月份';
comment on column IntegratedIndicator.orgid
  is '统计的组织机构id';  
comment on column IntegratedIndicator.parentorgid
  is '统计的组织机构父id';
comment on column IntegratedIndicator.orgtype
  is '组织机构类型';
comment on column IntegratedIndicator.scord
  is '分数';
comment on column IntegratedIndicator.grade
  is '扣分档次';  
comment on column IntegratedIndicator.coefficient
  is '扣分系数';  
comment on column IntegratedIndicator.issueSum
  is '事件接件数量';
comment on column IntegratedIndicator.dealissueSum
  is '事件处理数量';
comment on column IntegratedIndicator.createuser
  is '创建人';
comment on column IntegratedIndicator.createdate
  is '创建时间';
  
  
CREATE SEQUENCE s_issuehandleStat
INCREMENT BY 1
START WITH 1
MAXVALUE 9999999999
MINVALUE 1
CACHE 20;

create table issuehandleStat(
  id number(10) not null,
  year number(4) not null,
  month number(2) not null,
  parentorgid number(10) not null,
  orgid number(10) not null,
  orginternalcode varchar2(32) not null,
  funorgtype number(10),
  orglevel number(10) not null,
  addissuesum number(10),
  submitIssueSum number(10),
  assignIssueSum number(10),
  doingissuesum number(10),
  doneissuesum number(10),
  issuesum number(10),
  completionrate varchar2(32) default '0.0%',
  extendeddoingsum number(10),
  extendeddonesum number(10),
  extendedrate varchar2(32) default '0.0%',
  createdate date,
  createuser varchar2(60),
  constraint pkissuehandleStat primary key (ID)
);
comment on table issuehandleStat is
'各区域办理情况统计';
comment on column issuehandleStat.year is
'统计的年';
comment on column issuehandleStat.month is
'统计的月';
comment on column issuehandleStat.parentorgid is
'父组织机构id';
comment on column issuehandleStat.orgid is
'组织机构id';
comment on column issuehandleStat.orginternalcode is
'组织机构内置编码';
comment on column issuehandleStat.funorgtype is
'职能部门类型';
comment on column issuehandleStat.orgLevel is
'组织机构层级';
comment on column issuehandleStat.addissuesum is
'新增事件数';
comment on column issuehandleStat.submitIssueSum is
'上报事件数';
comment on column issuehandleStat.assignIssueSum is
'上级交办事件数';
comment on column issuehandleStat.doingissuesum is
'在办事件数';
comment on column issuehandleStat.doneissuesum is
'已办事件数';
comment on column issuehandleStat.issuesum is
'事件总数';
comment on column issuehandleStat.completionrate is
'事件办结率';
comment on column issuehandleStat.extendeddoingsum is
'超期在办数';
comment on column issuehandleStat.extendeddonesum is
'超期办结数';
comment on column issuehandleStat.extendedrate is
'超期办结率';

create index idx_year_month_handle on issuehandleStat (
   year ASC,
   month ASC
);

CREATE SEQUENCE s_issueClassificationStat
INCREMENT BY 1
START WITH 1
MAXVALUE 9999999999
MINVALUE 1
CACHE 20;

create table issueClassificationStat(
  id number(10) not null,
  year number(4) not null,
  month number(2) not null,
  parentorgid number(10) not null,
  orgid number(10) not null,
  orginternalcode varchar2(32) not null,
  funorgtype number(10),
  orglevel number(10) not null,
  contradictionSum number(10),
  resolveTheContradictionSum number(10),
  securityPrecautionSum number(10),
  specialPopulationSum number(10),
  socialConditionSum number(10),
  policiesAndLawSum number(10),
  emergencieSum number(10),
  otherManageSum number(10),
  createdate date,
  createuser varchar2(60),
  constraint pkissueClassificationStat primary key (ID)
);
comment on table issueClassificationStat is
'各区域办理情况统计';
comment on column issueClassificationStat.year is
'统计的年';
comment on column issueClassificationStat.month is
'统计的月';
comment on column issueClassificationStat.parentorgid is
'父组织机构id';
comment on column issueClassificationStat.orgid is
'组织机构id';
comment on column issueClassificationStat.orginternalcode is
'组织机构内置编码';
comment on column issueClassificationStat.funorgtype is
'职能部门类型';
comment on column issueClassificationStat.orgLevel is
'组织机构层级';
comment on column issueClassificationStat.specialPopulationSum is
'特殊人群服务管理报告';
comment on column issueClassificationStat.contradictionSum is
'民生服务';
comment on column issueClassificationStat.resolveTheContradictionSum is
'矛盾化解';
comment on column issueClassificationStat.specialPopulationSum is
'治安防控';
comment on column issueClassificationStat.socialConditionSum is
'社情民意收集';
comment on column issueClassificationStat.policiesAndLawSum is
'政策法律宣传';
comment on column issueClassificationStat.emergencieSum is
'突发事件报告';
comment on column issueClassificationStat.otherManageSum is
'其它';

create index idx_year_month_Classification on issueClassificationStat (
   year ASC,
   month ASC
);

CREATE SEQUENCE s_issueStepStat
INCREMENT BY 1
START WITH 1
MAXVALUE 9999999999
MINVALUE 1
CACHE 20;

create table issueStepStat(
  id number(10) not null,
  year number(4) not null,
  month number(2) not null,
  parentorgid number(10) not null,
  orgid number(10) not null,
  orginternalcode varchar2(32) not null,
  resolveGeneralSum number(10),
  resolveSkipSum number(10),
  securityGeneralSum number(10),
  securitySkipSum number(10),
  emergencieGeneralSum number(10),
  emergencieSkipSum number(10),
  otherManageGeneralSum number(10),
  otherManageSkipSum number(10),
  createdate date,
  createuser varchar2(60),
  constraint pkissueStepStat primary key (ID)
);
comment on table issueStepStat is
'各区域办理情况统计';
comment on column issueStepStat.year is
'统计的年';
comment on column issueStepStat.month is
'统计的月';
comment on column issueStepStat.parentorgid is
'父组织机构id';
comment on column issueStepStat.orgid is
'组织机构id';
comment on column issueStepStat.orginternalcode is
'组织机构内置编码';
comment on column issueStepStat.resolveGeneralSum is
'矛盾化解-普通流程';
comment on column issueStepStat.resolveSkipSum is
'矛盾化解-越级流程';
comment on column issueStepStat.securityGeneralSum is
'治安防控-普通流程';
comment on column issueStepStat.securitySkipSum is
'治安防控-越级流程';
comment on column issueStepStat.emergencieGeneralSum is
'突发事件报告-普通流程';
comment on column issueStepStat.emergencieSkipSum is
'突发事件报告-越级流程';
comment on column issueStepStat.otherManageGeneralSum is
'其它-普通流程';
comment on column issueStepStat.otherManageSkipSum is
'其它-越级流程';

create index idx_year_month_step on issueStepStat (
   year ASC,
   month ASC
);

CREATE SEQUENCE S_IssueAnalysis
INCREMENT BY 1
START WITH 1
MAXVALUE 9999999999
MINVALUE 1
CACHE 20;
  
create table IssueAnalysis (
 id number (10),
 year varchar2(4),
 month varchar2(2),
 orgid number(10) not null,
 orgCode VARCHAR2(32) not null,
 issueTypeId number(10) ,
 issueTypeDomainId number(10),
 issueSum number(10) default 0,
 createuser varchar2(60),
 createdate date,
 constraint pkIssueAnalysis primary key (ID)
);
comment on table IssueAnalysis
  is '事件研判分析表';
comment on column IssueAnalysis.year
  is '统计的年份';
comment on column IssueAnalysis.month
  is '统计的月份';
comment on column IssueAnalysis.orgid
  is '统计的组织机构id';  
comment on column IssueAnalysis.orgCode
  is '统计的组织机构编码';
comment on column IssueAnalysis.issueTypeId
  is '事件小类ID';
comment on column IssueAnalysis.issueTypeDomainId
  is '事件大类ID';
comment on column IssueAnalysis.issueSum
  is '数量';  
comment on column IssueAnalysis.createuser
  is '创建人';
comment on column IssueAnalysis.createdate
  is '创建时间';
  
  create index idx_year_month_IssueAnalysis on IssueAnalysis (
   year ASC,
   month ASC
);
  
  
/*==============================================================*/
/* Sequence: s_peopleAspirations   民生诉求序列	                */
/*==============================================================*/
create sequence s_peopleAspirations
 increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
 /*==============================================================*/
/* Table: peopleAspirations   民生诉求表	                        */
/*==============================================================*/
 create table peopleAspirations(
 	id					NUMBER(10)                      not null,
 	orgId				NUMBER(10)                      not null,
 	orgInternalCode 	VARCHAR2(32)                    not null,
 	serialNumber		VARCHAR2(30)                    not null,
 	name				VARCHAR2(60)					not null,
 	idCardNo			VARCHAR2(60)					not null,
 	mobileNumber        VARCHAR2(15),
 	gender              NUMBER(10),
 	birthDay            DATE,
 	permanentAddress	VARCHAR2(150),
 	responseGroupNo		NUMBER(10),
 	isPartyMember		NUMBER(1)                     	default 0,
 	position			NUMBER(10),
 	appealHumanType		NUMBER(10),
 	appealContent		CLOB							not null,
 	itemCategory		NUMBER(10)						not null,
 	itemCategorySub		NUMBER(10)						not null,
 	serverContractor 	VARCHAR2(60),
 	serverTelephone		VARCHAR2(30),
 	serverJob			VARCHAR2(60),
 	serverUnit			VARCHAR2(150),
 	createUser          VARCHAR2(60) 					not null,
	updateUser          VARCHAR2(60),
	createDate          DATE         					not null,
	updateDate          DATE,
	createTableType		NUMBER(10),
	occurOrgId			NUMBER(10)						not null,
	occurOrgInternalCode VARCHAR2(32)                   not null,
	gridNo				VARCHAR2(60),
	bookingUnit 		VARCHAR2(60),
	registrant			VARCHAR2(32)                    not null,
	registrationTime	DATE,
	constraint pkPeopleAspirations primary key (ID)
 );
 -- Add comments to the table 
comment on table peopleAspirations
  is '民生诉求表';
-- Add comments to the columns 
comment on column peopleAspirations.id
  is '民生诉求id'; 
comment on column peopleAspirations.orgId
  is '所属网格'; 
comment on column peopleAspirations.orgInternalCode
  is '所属网格编号'; 
comment on column peopleAspirations.serialNumber
  is '编号';
comment on column peopleAspirations.name
  is '姓名';
comment on column peopleAspirations.idCardNo
  is '身份证';   
comment on column peopleAspirations.mobileNumber
  is '联系电话';     
comment on column peopleAspirations.gender
  is '性别';  
comment on column peopleAspirations.birthDay
  is '出生年月'; 
comment on column peopleAspirations.permanentAddress
  is '常住地址';   
comment on column peopleAspirations.responseGroupNo
  is '反应群体人数';     
comment on column peopleAspirations.isPartyMember
  is '是否党员，0否 1是';
comment on column peopleAspirations.position
  is '职业或身份'; 
comment on column peopleAspirations.appealHumanType
  is '诉求人类别'; 
comment on column peopleAspirations.appealContent
  is '主要愿望或诉求';  
comment on column peopleAspirations.itemCategory
  is '项目类别(大类)';    
comment on column peopleAspirations.itemCategorySub
  is '项目类别(子类)';
comment on column peopleAspirations.serverContractor
  is '服务联系人';
comment on column peopleAspirations.serverTelephone
  is '服务联系电话';  
comment on column peopleAspirations.serverJob
  is '服务职务';  
comment on column peopleAspirations.serverUnit
  is '服务联系人单位'; 
comment on column peopleAspirations.createUser
  is '创建人';
comment on column peopleAspirations.updateUser
  is '修改人';
comment on column peopleAspirations.createDate
  is '创建时间';
comment on column peopleAspirations.updateDate
  is '修改时间';
comment on column peopleAspirations.createTableType
  is '建表类型';
comment on column peopleAspirations.occurOrgId
  is '发生网格id';  
comment on column peopleAspirations.occurOrgInternalCode
  is '发生网格编号';
comment on column peopleAspirations.gridNo
  is '网格号'; 
comment on column peopleAspirations.bookingUnit
  is '登记单位'; 
comment on column peopleAspirations.registrant
  is '登记人'; 
comment on column peopleAspirations.registrationTime
  is '登记时间'; 

---三本台账民生诉求台账索引
create index idx_peopleaspirations_orgid on peopleaspirations(orgid);  
/*==============================================================*/
/* Sequence: s_peopleAspirations   困难群众台账                 */
/*==============================================================*/
create sequence s_poorPeoples
 increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
 /*==============================================================*/
/* Table: peopleAspirations   困难群众台账表                     */
/*===============================================================*/
 create table poorPeoples(
   id                   NUMBER(10) not null,
  orgid                NUMBER(10) not null,
  orginternalcode      VARCHAR2(32) not null,
  serialnumber         VARCHAR2(30) not null,
  name                 VARCHAR2(60) not null,
  idcardno             VARCHAR2(60) not null,
  mobilenumber         VARCHAR2(15),
  gender               NUMBER(10),
  birthday             DATE,
  permanentaddress     VARCHAR2(150),
  ispartymember        NUMBER(1) default 0,
  position             NUMBER(10),
  schooling            NUMBER(10),
  insurancetype        NUMBER(10),
  membernum            NUMBER(10),
  lastyearmemberincome NUMBER(8,2),
  poorbiginfo          NUMBER(10),
  poorinfo             NUMBER(10),
  helpinfo             VARCHAR2(150) not null,
  yearhelpinfo         VARCHAR2(600),
  servercontractor     VARCHAR2(60),
  servertelephone      VARCHAR2(30),
  serverjob            VARCHAR2(60),
  serverunit           VARCHAR2(150),
  createuser           VARCHAR2(60) not null,
  updateuser           VARCHAR2(60),
  createdate           DATE not null,
  updatedate           DATE,
  occurOrgId NUMBER(10) not null,
  occurOrgInternalCode VARCHAR2(32) not null,
  gridNo VARCHAR2(60),
  bookingUnit VARCHAR2(60),
  registrant VARCHAR2(32) not null,
  registrationTime DATE,
  CREATETABLETYPE  NUMBER(10),
  constraint pkpoorPeoples primary key (ID)
);
-- Add comments to the table 
comment on table POORPEOPLES
  is '困难群众台账';
-- Add comments to the columns 
comment on column POORPEOPLES.id
  is '主键ID';
comment on column POORPEOPLES.orgid
  is '组织机构ID';
comment on column POORPEOPLES.orginternalcode
  is '组织机构CODE';
comment on column POORPEOPLES.serialnumber
  is '编号';
comment on column POORPEOPLES.name
  is '姓名';
comment on column POORPEOPLES.idcardno
  is '身份证号码';
comment on column POORPEOPLES.mobilenumber
  is '联系电话';
comment on column POORPEOPLES.gender
  is '性别';
comment on column POORPEOPLES.birthday
  is '出生年月';
comment on column POORPEOPLES.permanentaddress
  is '常驻地址';
comment on column POORPEOPLES.ispartymember
  is '是否党员 0否  1是';
comment on column POORPEOPLES.position
  is '职业或身份';
comment on column POORPEOPLES.schooling
  is '学历';
comment on column POORPEOPLES.insurancetype
  is '纳入保险';
comment on column POORPEOPLES.membernum
  is '家庭人口';
comment on column POORPEOPLES.lastyearmemberincome
  is '上年度人均收入';
comment on column POORPEOPLES.poorbiginfo
  is '困难原因大类';
comment on column POORPEOPLES.poorinfo
  is '困难原因小类';
comment on column POORPEOPLES.helpinfo
  is '帮扶需求';
comment on column POORPEOPLES.yearhelpinfo
  is '年度帮扶项目';
comment on column POORPEOPLES.servercontractor
  is '服务联系人';
comment on column POORPEOPLES.servertelephone
  is '联系电话';
comment on column POORPEOPLES.serverjob
  is '职务';
comment on column POORPEOPLES.serverunit
  is '服务联系人单位';
comment on column POORPEOPLES.createuser
  is '创建用户';
comment on column POORPEOPLES.updateuser
  is '修改用户';
comment on column POORPEOPLES.createdate
  is '创建时间';
comment on column POORPEOPLES.updatedate
  is '修改时间';
comment on column poorPeoples.occurOrgId
  is '发生网格id';
comment on column poorPeoples.occurOrgInternalCode
  is '发生网格编号';
comment on column poorPeoples.gridNo
  is '网格号';  
comment on column poorPeoples.bookingUnit
  is '登记单位'; 
comment on column poorPeoples.registrant
  is '登记人'; 
comment on column poorPeoples.registrationTime
  is '登记时间'; 

---三本台账困难群众台账索引         
create index idx_poorpeoples_orgid on poorpeoples(orgid);

create sequence S_ACCOUNTLOGS_XICHANG
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
  
-- Create table  台账日志
create table ACCOUNTLOGS_XICHANG
(
  id                  NUMBER(10) not null,
  accountid           NUMBER(10) not null,
  accounttype       VARCHAR2(100),
  logdate             DATE,
  dealdate              DATE,
  dealuser            VARCHAR2(60),
  dealorgid         NUMBER(10) not null,
  dealorgcode     VARCHAR2(32),
  content             VARCHAR2(4000),
  site                VARCHAR2(120),
  opinion             VARCHAR2(1200),
  isfinish            NUMBER(1) default 0,
  finishdate          DATE,
  finishtype   NUMBER(10),
  finishcontent       VARCHAR2(2000),
  reportto            NUMBER(10),
  CREATEUSER       VARCHAR2(60) not null,
  UPDATEUSER       VARCHAR2(60),
  CREATEDATE       DATE not null,
  UPDATEDATE       DATE,
  isSysOperate		NUMBER(1) default 0
);
-- Add comments to the table 
comment on table ACCOUNTLOGS_XICHANG
  is '台账日志表';
-- Add comments to the columns 
comment on column ACCOUNTLOGS_XICHANG.id
  is '主键ID';
comment on column ACCOUNTLOGS_XICHANG.accountid
  is '台账ID';
comment on column ACCOUNTLOGS_XICHANG.logdate
  is '日志时间';
comment on column ACCOUNTLOGS_XICHANG.dealdate
  is '处理时间';
comment on column ACCOUNTLOGS_XICHANG.accounttype
  is '台账类型';
comment on column ACCOUNTLOGS_XICHANG.dealuser
  is '处理人';
comment on column ACCOUNTLOGS_XICHANG.dealorgid
  is '处理部门';
comment on column ACCOUNTLOGS_XICHANG.dealorgcode
  is '处理部门内置编码';
comment on column ACCOUNTLOGS_XICHANG.content
  is '工作内容';
comment on column ACCOUNTLOGS_XICHANG.site
  is '地点';
comment on column ACCOUNTLOGS_XICHANG.opinion
  is '当事人意见';
comment on column ACCOUNTLOGS_XICHANG.isfinish
  is '是否办结 0 否 1 是';
comment on column ACCOUNTLOGS_XICHANG.finishdate
  is '办结时间';
comment on column ACCOUNTLOGS_XICHANG.finishtype
  is '办结方式';
comment on column ACCOUNTLOGS_XICHANG.finishcontent
  is '办结结果';
comment on column ACCOUNTLOGS_XICHANG.reportto
  is '呈报单位';
comment on column ACCOUNTLOGS_XICHANG.createuser
  is '创建用户';
comment on column ACCOUNTLOGS_XICHANG.updateuser
  is '修改用户';
comment on column ACCOUNTLOGS_XICHANG.createdate
  is '创建时间';
comment on column ACCOUNTLOGS_XICHANG.updatedate
  is '修改时间';
 comment on column ACCOUNTLOGS_XICHANG.isSysOperate
  is '是否系统级别的日志 0 否 1 是';
-- Create/Recreate primary, unique and foreign key constraints 
alter table ACCOUNTLOGS_XICHANG
  add primary key (ID);

create sequence S_STEADYWORKS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table STEADYWORKS
(
  ID               NUMBER(10) not null,
  ORGID            NUMBER(10) not null,
  ORGINTERNALCODE  VARCHAR2(32) not null,
  OCCURORGID            NUMBER(10) not null,
  OCCURORGINTERNALCODE  VARCHAR2(32) not null,
  gridno  VARCHAR2(200),
  SERIALNUMBER     VARCHAR2(30) not null,
  involvingSteadyNum  NUMBER(10),
  involvingSteadyType  NUMBER(10),
  involvingSteadyInfo    VARCHAR2(200) not null,
  previousSteadyInfo     VARCHAR2(1000),
  previousResolveInfo  VARCHAR2(1000),
  steadyUnit VARCHAR2(200),
  steadyUser  VARCHAR2(30),
  resolveUnit        VARCHAR2(200),
  resolveUser       VARCHAR2(30),
  aspirationType       VARCHAR2(1000),
  steadyInfo       VARCHAR2(1000),
  warningType       NUMBER(1),
  bookingUnit varchar2(200),
  registrant varchar2(30),
  registrationTime DATE,
  CREATETABLETYPE  NUMBER(10),
  SERVERCONTRACTOR VARCHAR2(60),
  SERVERTELEPHONE  VARCHAR2(30),
  SERVERJOB        VARCHAR2(60),
  SERVERUNIT       VARCHAR2(150),
  CREATEUSER       VARCHAR2(60) not null,
  UPDATEUSER       VARCHAR2(60),
  CREATEDATE       DATE not null,
  UPDATEDATE       DATE,
  constraint PKSTEADYWORKS primary key (ID)
);
-- Add comments to the table 
comment on table STEADYWORKS
  is '稳定工作台账表';
-- Add comments to the columns 
comment on column STEADYWORKS.ID
  is '稳定工作台账id';
comment on column STEADYWORKS.ORGID
  is '所属网格';
comment on column STEADYWORKS.ORGINTERNALCODE
  is '所属网格编号';
comment on column STEADYWORKS.OCCURORGID
  is '发生网格';
comment on column STEADYWORKS.OCCURORGINTERNALCODE
  is '发生网格编号';
comment on column STEADYWORKS.gridno
  is '网格号';
comment on column STEADYWORKS.SERIALNUMBER
  is '编号';
comment on column STEADYWORKS.involvingSteadyNum
  is '涉稳群体人数';
comment on column STEADYWORKS.involvingSteadyType
  is '涉稳人群类别';
comment on column STEADYWORKS.involvingSteadyInfo
  is '涉稳事项';
comment on column STEADYWORKS.previousSteadyInfo
  is '历次涉稳情况';
comment on column STEADYWORKS.previousResolveInfo
  is '历次化解情况';
comment on column STEADYWORKS.steadyUnit
  is '稳控责任单位';
comment on column STEADYWORKS.steadyUser
  is '稳控责任人';
comment on column STEADYWORKS.resolveUnit
  is '化解责任部门';
comment on column STEADYWORKS.resolveUser
  is '化解责任人';
comment on column STEADYWORKS.aspirationType
  is '诉求类别';
comment on column STEADYWORKS.steadyInfo
  is '涉稳人员或群体稳定现状';
comment on column STEADYWORKS.warningType
  is '预警级别';
comment on column STEADYWORKS.SERVERCONTRACTOR
  is '服务联系人';
comment on column STEADYWORKS.SERVERTELEPHONE
  is '服务联系电话';
comment on column STEADYWORKS.SERVERJOB
  is '服务职务';
comment on column STEADYWORKS.SERVERUNIT
  is '服务联系人单位';
comment on column STEADYWORKS.bookingUnit
  is '登记单位';
comment on column STEADYWORKS.registrant
  is '登记人';
comment on column STEADYWORKS.registrationTime
  is '登记时间';
comment on column STEADYWORKS.CREATEUSER
  is '创建人';
comment on column STEADYWORKS.UPDATEUSER
  is '修改人';
comment on column STEADYWORKS.CREATEDATE
  is '创建时间';
comment on column STEADYWORKS.UPDATEDATE
  is '修改时间';
comment on column STEADYWORKS.CREATETABLETYPE
  is '建表类型';

---三本台账稳定工作台账索引        
create index idx_steadyworks_orgid on steadyworks(orgid);

create sequence S_STEADYWORK_peopleinfo
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table STEADYWORK_peopleinfo
(
  ID               NUMBER(10) not null,
  steadyworkid     NUMBER(10) not null,
  NAME             VARCHAR2(60),
  IDCARDNO         VARCHAR2(60),
  MOBILENUMBER     VARCHAR2(15),
  GENDER           NUMBER(10),
  BIRTHDAY         DATE,
  PERMANENTADDRESS VARCHAR2(150),
  ISPARTYMEMBER    NUMBER(1) default 0,
  POSITION         NUMBER(10),
  constraint PKpeopleinfoS primary key (ID)
);
-- Add comments to the table 
comment on table STEADYWORK_peopleinfo
  is '稳定工作台账人员表';
-- Add comments to the columns 
comment on column STEADYWORK_peopleinfo.ID
  is '稳定工作台账人员表id';
comment on column STEADYWORK_peopleinfo.NAME
  is '姓名';
comment on column STEADYWORK_peopleinfo.IDCARDNO
  is '身份证';
comment on column STEADYWORK_peopleinfo.MOBILENUMBER
  is '联系电话';
comment on column STEADYWORK_peopleinfo.GENDER
  is '性别';
comment on column STEADYWORK_peopleinfo.BIRTHDAY
  is '出生年月';
comment on column STEADYWORK_peopleinfo.PERMANENTADDRESS
  is '常住地址';
comment on column STEADYWORK_peopleinfo.ISPARTYMEMBER
  is '是否党员，0否 1是';
comment on column STEADYWORK_peopleinfo.POSITION
  is '职业或身份';


--困难群众台账 家庭成员表
create sequence S_poorpeopleMembers
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table POORPEOPLEMEMBERS
(
  id                   NUMBER(10) not null,
  name                 VARCHAR2(20) not null,
  gender               NUMBER(10),
  birthday             DATE,
  politicalbackground  NUMBER(10),
  schooling            NUMBER(10),
  nation               NUMBER(10),
  career               VARCHAR2(150),
  healthstate          NUMBER(10),
  relationshipwithhead NUMBER(10) not null,
  insurancetype        NUMBER(10) not null,
  createuser           VARCHAR2(32) not null,
  updateuser           VARCHAR2(32),
  createdate           DATE not null,
  updatedate           DATE,
  accountid            NUMBER(10) not null
);
comment on table POORPEOPLEMEMBERS
  is '困难群众台账 家庭成员表';
comment on column POORPEOPLEMEMBERS.id
  is '主键ID';
comment on column POORPEOPLEMEMBERS.name
  is '姓名';
comment on column POORPEOPLEMEMBERS.gender
  is '性别';
comment on column POORPEOPLEMEMBERS.birthday
  is '生日';
comment on column POORPEOPLEMEMBERS.politicalbackground
  is '政治面貌';
comment on column POORPEOPLEMEMBERS.schooling
  is '学历';
comment on column POORPEOPLEMEMBERS.nation
  is '民族';
comment on column POORPEOPLEMEMBERS.career
  is '职业';
comment on column POORPEOPLEMEMBERS.healthstate
  is '健康状况';
comment on column POORPEOPLEMEMBERS.relationshipwithhead
  is '与户主关系';
comment on column POORPEOPLEMEMBERS.insurancetype
  is '纳入低保（五保）情况';
comment on column POORPEOPLEMEMBERS.createuser
  is '创建用户';
comment on column POORPEOPLEMEMBERS.updateuser
  is '修改用户';
comment on column POORPEOPLEMEMBERS.createdate
  is '创建时间';
comment on column POORPEOPLEMEMBERS.updatedate
  is '修改时间';
comment on column POORPEOPLEMEMBERS.accountid
  is '台账ID';
alter table POORPEOPLEMEMBERS
  add primary key (ID);

  
  /*==============================================================*/
/* Sequence: s_peopleAspirations   台账报表序列	                */
/*==============================================================*/
create sequence s_accountReports
 increment by 1
 start with 1
 minvalue 1
 cache 20
 maxvalue 9999999999;
 
/*==============================================================*/
/* Table: peopleAspirations   台账报表表	                        */
/*==============================================================*/
 create table accountReports(
 	id					NUMBER(10)                      not null,
 	orgId				NUMBER(10)                      not null,
 	orgInternalCode 	VARCHAR2(32)                    not null,
 	reportYear			VARCHAR2(4),
 	reportMonth			VARCHAR2(2),
 	content				CLOB,
 	accountType			VARCHAR2(100),
 	reportType			NUMBER(10),
 	createUser          VARCHAR2(60) 					not null,
	updateUser          VARCHAR2(60),
	createDate          DATE         					not null,
	updateDate          DATE,
 	constraint ACCOUNTREPORTS primary key (ID)
 );
 
  -- Add comments to the table 
comment on table accountReports
  is '台账报表表';
-- Add comments to the columns 
comment on column accountReports.id
  is '台账报表id'; 
comment on column accountReports.orgId
  is '所属网格'; 
comment on column accountReports.orgInternalCode
  is '所属网格编号'; 
comment on column accountReports.reportYear
  is '统计的年份'; 
comment on column accountReports.reportMonth
  is '统计的月份'; 
comment on column accountReports.content
  is '报表明细及内容描述'; 
comment on column accountReports.accountType
  is '台账类型'; 
comment on column accountReports.reportType
  is '报表类型'; 
comment on column accountReports.createUser
  is '创建用户';
comment on column accountReports.updateUser 
  is '修改用户';
comment on column accountReports.createDate 
  is '创建日期';
comment on column accountReports.updateDate 
  is '修改时间';
 
 /*==============================================================*/
/* Table: peopleAspirations   台账报表--时间索引                             		 */
/*==============================================================*/ 
create index idx_year_month_accountReports on accountReports (
   reportYear ASC,
   reportMonth ASC
);

  -- Create sequence
create sequence S_supervisionAdministration
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table supervisionAdministration(
       id                   number(10)                      not null,
       orgId                number(10)                      not null,
       orgCode              varchar2(32)                    not null,
       content              clob,
       createUser           varchar2(32)                    not null,
       updateUser           varchar2(32),
       createDate           DATE                            not null,
       updateDate           DATE,
       constraint pkSupervisionAdministration primary key (id)
);
comment on table supervisionAdministration is
'日常监督管理表';
comment on column supervisionAdministration.id is
'ID';
comment on column supervisionAdministration.orgId is
'组织机构ID';
comment on column supervisionAdministration.orgCode is
'组织机构Code';
comment on column supervisionAdministration.content is
'内容';
comment on column supervisionAdministration.createUser is
'创建人';
comment on column supervisionAdministration.updateUser is
'修改人';
comment on column supervisionAdministration.createDate is
'创建时间';
comment on column supervisionAdministration.updateDate is
'修改时间';

create sequence S_peace_high_village
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table peace_high_village
(
  id number(10) primary key,
  orgid number(10) not null,
  orginternalcode varchar2(32) not null,
  year number(10) not null,
  January number(1) default 1 not null,
  February number(1) default 1 not null, 
  March number(1) default 1 not null, 
  April number(1) default 1 not null, 
  May  number(1) default 1 not null,
  June  number(1) default 1 not null,
  July  number(1) default 1 not null,
  August  number(1) default 1 not null,
  September number(1) default 1 not null,
  October  number(1) default 1 not null,
  November  number(1) default 1 not null,
  December  number(1) default 1 not null,
  createdate date,
  createuser varchar2(32),
  updatedate date,
  updateuser varchar2(32)
);
comment on table peace_high_village is
'村级以上平安联创表';
comment on column peace_high_village.id is
'id';
comment on column peace_high_village.orgid is
'组织机构id';
comment on column peace_high_village.orginternalcode is
'组织机构内置编码';
comment on column peace_high_village.year is
'年份';

create sequence S_PEACE_VILLAGE
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table PEACE_VILLAGE
(
  ID                      NUMBER(10) not null,
  ORG_ID                  NUMBER(10) not null,
  ORG_INTERNAL_CODE       VARCHAR2(32),
  YEAR                    NUMBER(10) not null,
  MONTH                   NUMBER(10) not null,
  NO_CRIMINAL             NUMBER(1) default 1 not null,
  NO_DRUGS                NUMBER(1) default 1 not null,
  NO_ACCIDENT             NUMBER(1) default 1 not null,
  NO_GROUP_EVENTS         NUMBER(1) default 1 not null,
  NO_DIRTY                NUMBER(1) default 1 not null,
  HAS_ORGANIZATION        NUMBER(1) default 1 not null,
  HAS_MEASURES            NUMBER(1) default 1 not null,
  HAS_LEGAL_ADVOCACY      NUMBER(1) default 1 not null,
  HAS_SOCIAL_FORCES       NUMBER(1) default 1 not null,
  HAS_CULTURAL_ACTIVITIES NUMBER(1) default 1 not null,
  CREATEUSER              VARCHAR2(32) not null,
  UPDATEUSER              VARCHAR2(32),
  CREATEDATE              DATE not null,
  UPDATEDATE              DATE,
  constraint PEACE_VILLAGE_PK primary key (ID),
  constraint PEACE_VILLAGE_UN unique (ORG_ID, YEAR, MONTH)
);

comment on table PEACE_VILLAGE
  is '村社区平安三联创';
comment on column PEACE_VILLAGE.ORG_ID
  is '所属网格';
comment on column PEACE_VILLAGE.ORG_INTERNAL_CODE
  is '所属网格编号';
comment on column PEACE_VILLAGE.YEAR
  is '年';
comment on column PEACE_VILLAGE.MONTH
  is '月';
comment on column PEACE_VILLAGE.NO_CRIMINAL
  is '无刑事案件';
comment on column PEACE_VILLAGE.NO_DRUGS
  is '无毒品';
comment on column PEACE_VILLAGE.NO_ACCIDENT
  is '无安全事故';
comment on column PEACE_VILLAGE.NO_GROUP_EVENTS
  is '无群体性事件';
comment on column PEACE_VILLAGE.NO_DIRTY
  is '无脏乱差';
comment on column PEACE_VILLAGE.HAS_ORGANIZATION
  is '有自治组织';
comment on column PEACE_VILLAGE.HAS_MEASURES
  is '有三防措施';
comment on column PEACE_VILLAGE.HAS_LEGAL_ADVOCACY
  is '有法制宣传';
comment on column PEACE_VILLAGE.HAS_SOCIAL_FORCES
  is '有社会力量参与';
comment on column PEACE_VILLAGE.HAS_CULTURAL_ACTIVITIES
  is '有群众文化活动';
------我的台账的反馈评论表
create sequence S_EVALUATEFEEDBACKS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
  
create table EVALUATEFEEDBACKS  (
	   id          		  	  NUMBER(10)       				  not null,
       orgId                  NUMBER(10)                      not null,
       orgInternalCode        VARCHAR2(32)                    not null,
       accountType            VARCHAR2(120)                   not null,
       accountId              NUMBER(10)                      not null,
       feedbacksType          NUMBER(10),
       feedbacksOpinion       NUMBER(10),
       evaluateUser           VARCHAR2(60),
       createUser             VARCHAR2(60) 					   not null,
	   updateUser             VARCHAR2(60),
	   createDate             DATE         					   not null,
	   updateDate             DATE,
	   remark				 VARCHAR2(600),
	   constraint PKevaluateFeedbacks primary key (ID)
       );

comment on table EVALUATEFEEDBACKS
  is '我的台账的反馈评论表 ';
comment on column EVALUATEFEEDBACKS.id
  is '主键ID';
comment on column EVALUATEFEEDBACKS.accountType
  is '评论的类型（我的台账的的种类）';
comment on column EVALUATEFEEDBACKS.accountId
  is '关联的台账的ID';
comment on column EVALUATEFEEDBACKS.feedbacksType
  is '反馈方式';
comment on column EVALUATEFEEDBACKS.feedbacksOpinion
  is '反馈意见';
comment on column EVALUATEFEEDBACKS.evaluateUser
  is '反馈用户';
comment on column EVALUATEFEEDBACKS.createuser
  is '创建用户';
comment on column EVALUATEFEEDBACKS.updateuser
  is '修改用户';
comment on column EVALUATEFEEDBACKS.createdate
  is '创建时间';
comment on column EVALUATEFEEDBACKS.updatedate
  is '修改时间';
  
  
  
create sequence S_ACCOUNTSTEPS_XICHANG
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
  
--  三本台账处理步骤表
create table accountSteps_xichang
(
  id                  NUMBER(10) not null,
  accountid           NUMBER(10) not null,
  accounttype         VARCHAR2(100),
  targetOrgid         NUMBER(10) not null,
  targetOrgcode       VARCHAR2(32),
  isFinish            NUMBER(1) default 0,
  CREATEUSER          VARCHAR2(60) not null,
  UPDATEUSER          VARCHAR2(60),
  CREATEDATE          DATE not null,
  UPDATEDATE          DATE,
  finishType		  NUMBER(10),
  reportToTownEnd	  NUMBER(10),
  reportToCityEnd	  NUMBER(10),
  reportToFunctionEnd	NUMBER(10),
  REALORCIRCULATION	   NUMBER(10),
  constraint PKaccountSteps_xichang primary key (ID)
);
-- Add comments to the table 
comment on table accountSteps_xichang
  is '三本台账处理步骤表';
-- Add comments to the columns 
comment on column accountSteps_xichang.id
  is '主键ID';
comment on column accountSteps_xichang.accountid
  is '台账ID';
comment on column accountSteps_xichang.accounttype
  is '台账类型';
comment on column accountSteps_xichang.targetOrgid
  is '目标处理部门';
comment on column accountSteps_xichang.targetOrgcode
  is '目标处理部门内置编码';
comment on column accountSteps_xichang.isFinish
  is '是否已办';
comment on column accountSteps_xichang.createuser
  is '创建用户';
comment on column accountSteps_xichang.updateuser
  is '修改用户';
comment on column accountSteps_xichang.createdate
  is '创建时间';
comment on column accountSteps_xichang.updatedate
  is '修改时间';
  comment on column accountSteps_xichang.finishType
  is '办结类型';
  comment on column accountSteps_xichang.reportToTownEnd
  is '呈报乡镇';
  comment on column accountSteps_xichang.reportToCityEnd
  is '呈报市';
  comment on column accountSteps_xichang.reportToFunctionEnd
  is '流程职能部门';
  comment on column accountSteps_xichang.REALORCIRCULATION
  is '区分办结和流转办结';
  
---三本台账步骤表索引                  
create index idx_accountsteps_xc_accountid on accountsteps_xichang(accountid);
create index idx_accountsteps_xc_targetid on accountsteps_xichang(targetorgid);
  
create sequence s_partyResource
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

 create table partyResource (
  id                   NUMBER(10)                      not null,
  orgId                NUMBER(10)                      not null,
  orgInternalCode      VARCHAR2(32)                    not null,
  name                 VARCHAR2(150)           not null,
  address              VARCHAR2(150)          ,
  manager              VARCHAR2(60),
  telephone            VARCHAR2(15) ,
  remark               VARCHAR2(900),
  createUser           VARCHAR2(32)                    not null,
  updateUser           VARCHAR2(32),
  createDate           DATE                            not null,
  updateDate           DATE,
  constraint       pkPartyResource primary key(id)
);
comment on table partyResource is
'区域内主要党组织资源';
comment on column partyResource.id is
'ID';
comment on column partyResource.orgId is
'所属网格';
comment on column partyResource.orgInternalCode is
'所属责任区编号';
comment on column partyResource.name is
'组织名称';
comment on column partyResource.address is
'地点';
comment on column partyResource.manager is
'负责人';
comment on column partyResource.telephone is
'联系电话';
comment on column partyResource.remark is
'备注';
  
/*==============================================================*/
/* sequence: DISTRICT_BASICCASE 社区基本情况序列                              		*/
/*==============================================================*/
create sequence s_DISTRICT_BASICCASE
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;

/*==============================================================*/
/* Table: DISTRICT_BASICCASE 社区基本情况表                              			*/
/*==============================================================*/ 
create table DISTRICT_BASICCASE  (
	id			 			NUMBER(10)                      not null,
	orgId           		NUMBER(10)                      not null,
	orgInternalCode      	VARCHAR2(32)                    not null,
	partyOrgsAndMembersCase		CLOB,
	administrativeCases			CLOB,
	streetPartySituation		CLOB,
	systemConstruction			CLOB,
	regionalPartySituation		CLOB,
	volunteersSituation			CLOB,
	doubleRegistrationSituation	CLOB,
	imgUrl               	VARCHAR2(50),
	createUser           	VARCHAR2(32)                    not null,
    updateUser           	VARCHAR2(32),
	createDate           	DATE                            not null,
   	updateDate          	DATE,
   	constraint PKDISTRICT_BASICCASE primary key (ID)
);
-- Add comments to the table 
comment on table DISTRICT_BASICCASE
  is '社区基本情况表';
-- Add comments to the columns 
comment on column DISTRICT_BASICCASE.ID
  is '社区基本情况id';
comment on column DISTRICT_BASICCASE.orgId
  is '所属网格';
comment on column DISTRICT_BASICCASE.orgInternalCode
  is '所属网格编号';
comment on column DISTRICT_BASICCASE.partyOrgsAndMembersCase
  is '全区党组织及党员情况';
comment on column DISTRICT_BASICCASE.administrativeCases
  is '机关党建情况';  
comment on column DISTRICT_BASICCASE.streetPartySituation
  is '街道党建情况'; 
comment on column DISTRICT_BASICCASE.systemConstruction
  is '系统党建情况';  
comment on column DISTRICT_BASICCASE.regionalPartySituation
  is '区域党建情况';   
comment on column DISTRICT_BASICCASE.volunteersSituation
  is '志愿者情况';   
comment on column DISTRICT_BASICCASE.doubleRegistrationSituation
  is '双报到情况'; 
comment on column DISTRICT_BASICCASE.imgUrl
  is '社区基本情况图片地址';   
comment on column DISTRICT_BASICCASE.CREATEUSER
  is '创建人';
comment on column DISTRICT_BASICCASE.UPDATEUSER
  is '修改人';
comment on column DISTRICT_BASICCASE.CREATEDATE
  is '创建时间';
comment on column DISTRICT_BASICCASE.UPDATEDATE
  is '修改时间';
  
/*==============================================================*/
/* sequence: BASIC_CASE 基本情况序列                              		*/
/*==============================================================*/
create sequence s_BASICCASE
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
/*==============================================================*/
/* sequence: BASIC_CASE 基本情况序列                              					*/
/*==============================================================*/
 create table BASIC_CASE  (
	id			 			NUMBER(10)                      not null,
	orgId           		NUMBER(10)                      not null,
	orgInternalCode      	VARCHAR2(32)                    not null,
	baseCase				CLOB,
	imgUrl               	VARCHAR2(50),
	baseInfoType            VARCHAR2(32),
	createUser           	VARCHAR2(32)                    not null,
    updateUser           	VARCHAR2(32),
	createDate           	DATE                            not null,
   	updateDate          	DATE,
   	constraint PKBASIC_CASE primary key (ID)
);
-- Add comments to the table 
comment on table BASIC_CASE
  is '基本情况表';
-- Add comments to the columns 
comment on column BASIC_CASE.ID
  is '基本情况id';
comment on column BASIC_CASE.orgId
  is '所属网格';
comment on column BASIC_CASE.orgInternalCode
  is '所属网格编号';
comment on column BASIC_CASE.baseCase
  is '基本情况';
comment on column BASIC_CASE.imgUrl
  is '基本情况图片地址';   
comment on column BASIC_CASE.baseInfoType
  is '基本信息类型';
comment on column BASIC_CASE.CREATEUSER
  is '创建人';
comment on column BASIC_CASE.UPDATEUSER
  is '修改人';
comment on column BASIC_CASE.CREATEDATE
  is '创建时间';
comment on column BASIC_CASE.UPDATEDATE
  is '修改时间';
  
  
/*==============================================================*/
/* sequence: PARTYWORK_MEMBERS 党工委成员序列                              					*/
/*==============================================================*/ 
create sequence s_PARTYWORK_MEMBERS
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
 /*==============================================================*/
/* Table: PARTYWORK_MEMBERS 党工委成员表                              				*/
/*==============================================================*/
create table PARTYWORK_MEMBERS(
	id				NUMBER(10)   	not null,
	orgId			NUMBER(10),
	orgCode			VARCHAR2(30),
	name			VARCHAR2(60)  	not null,
	gender			NUMBER(10)		not null,
	duty			VARCHAR2(64)	not null,
	introduction	CLOB			not null,
	imageUrl		VARCHAR2(128),
	sort			NUMBER(10),
	baseInfoType    VARCHAR2(32),
	createUser		VARCHAR2(60) 	not null,
	updateUser		VARCHAR2(60),
	createDate		DATE 			not null,
	updateDate		DATE,
   	constraint PKPARTYWORK_MEMBERS primary key (ID)
);

-- Add comments to the table 
comment on table PARTYWORK_MEMBERS
  is '党工委成员表';
-- Add comments to the columns 
comment on column PARTYWORK_MEMBERS.ID
  is '党工委成员id';
comment on column PARTYWORK_MEMBERS.orgId
  is '所属网格';
comment on column PARTYWORK_MEMBERS.orgCode
  is '所属网格编号';
comment on column PARTYWORK_MEMBERS.name
  is '姓名';
comment on column PARTYWORK_MEMBERS.gender
  is '性别(0男，1女，2未知)';   
comment on column PARTYWORK_MEMBERS.duty
  is '职位';
comment on column PARTYWORK_MEMBERS.introduction
  is '介绍'; 
comment on column PARTYWORK_MEMBERS.imageUrl
  is '图片地址';
comment on column PARTYWORK_MEMBERS.sort
  is '排序值'; 
comment on column PARTYWORK_MEMBERS.baseInfoType
  is '基本信息类型';
comment on column PARTYWORK_MEMBERS.CREATEUSER
  is '创建人';
comment on column PARTYWORK_MEMBERS.UPDATEUSER
  is '修改人';
comment on column PARTYWORK_MEMBERS.CREATEDATE
  is '创建时间';
comment on column PARTYWORK_MEMBERS.UPDATEDATE
  is '修改时间';
  
  
--四川党建成员表
create sequence S_party_members
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table party_members
(
  id number(10) primary key,
  idCardNo varchar2(60),
  name VARCHAR2(60),
  gender number(10),
  nation number(10),
  birthday date,
  schooling number(10),
  degree varchar2(60),
  specialPosition varchar2(100),
  telephone VARCHAR2(80),
  mobileNumber VARCHAR2(50),
  province VARCHAR2(30),
  city VARCHAR2(30),
  district VARCHAR2(30),
  nativePlaceAddress VARCHAR2(150),
  belongOrg number(10),
  partyPosition number(10),
  joinPartyDate date,
  career varchar2(300),
  endDate date,
  rewardAndPunishment varchar2(1000),
  accedingSituation varchar2(1000),
  joinPartyBranchDate date,
  democracy varchar2(1000),
  isHandicap number(10),
  isOld number(10),
  isOversea number(10),
  reportOrganization number(10),
  IMGURL VARCHAR2(300),
  createdate date not null,
  createuser VARCHAR2(32) not null,
  updatedate date,
  updateuser VARCHAR2(32)
);
comment on table party_members                      is '四川党建成员表';
comment on column party_members.id                  is '四川党建成员表id';
comment on column party_members.idCardNo            is '身份证号码';
comment on column party_members.name                is '姓名';
comment on column party_members.gender              is '性别';
comment on column party_members.nation              is '民族';
comment on column party_members.birthday            is '出生日期';
comment on column party_members.schooling           is '学历';
comment on column party_members.degree              is '学位';
comment on column party_members.specialPosition     is '专业技术职务';
comment on column party_members.telephone           is '联系电话';
comment on column party_members.mobileNumber        is '联系手机';
comment on column party_members.province            is '省';
comment on column party_members.city                is '市';
comment on column party_members.district            is '县';
comment on column party_members.nativePlaceAddress  is '现居地址';
comment on column party_members.belongOrg           is '所属部门';
comment on column party_members.partyPosition       is '党内职务';
comment on column party_members.joinPartyDate       is '入党日期';
comment on column party_members.career              is '单位、职务或职业';
comment on column party_members.endDate             is '党费交纳至';
comment on column party_members.rewardAndPunishment is '奖惩情况';
comment on column party_members.accedingSituation   is '参加组织生活情况';
comment on column party_members.joinPartyBranchDate is '进入当前党支部日期';
comment on column party_members.democracy           is '民主评议情况';
comment on column party_members.isHandicap          is '是否困难党员';
comment on column party_members.isOld               is '是否建国前老党员';
comment on column party_members.isOversea           is '是否出国出境';
comment on column party_members.reportOrganization  is '双报到至指定组织机构';
comment on column party_members.IMGURL              is '图片链接地址';
comment on column party_members.createDate          is '创建时间';
comment on column party_members.createUser          is '创建人';
comment on column party_members.updateDate          is '修改时间';
comment on column party_members.updateUser          is '修改人';
--成员组织关联表
create sequence S_member_associate_partyorg
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table member_associate_partyorg
(
  id number(10) primary key,
  orgId number(10),
  orgInternalCode varchar2(32),
  memberId number(10),
  partyOrgType number(10),
  logOut number(1) default 0,
  partyOrg varchar2(200),
  createDate date not null,
  createUser varchar2(32) not null,
  updateDate date,
  updateUser varchar2(32)
);
comment on table member_associate_partyorg is '成员组织关联表';
comment on column member_associate_partyorg.id is '成员组织关联表id';
comment on column member_associate_partyorg.orgId is '组织机构id';
comment on column member_associate_partyorg.orgInternalCode is '组织机构内置编码';
comment on column member_associate_partyorg.memberId is '成员表id';
comment on column member_associate_partyorg.partyOrgType is '党组织类别';
comment on column member_associate_partyorg.logOut is '是否注销';
comment on column member_associate_partyorg.partyOrg is '所在党支部';
comment on column member_associate_partyorg.createDate is '创建时间';
comment on column member_associate_partyorg.createUser is '创建人';
comment on column member_associate_partyorg.updateDate is '修改时间';
comment on column member_associate_partyorg.updateUser is '修改人';  

create sequence S_TOWNPARTYORG
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
  
--  街道社区党组织表
create table town_party_org
(
  id                  NUMBER(10) not null,
  orgId               NUMBER(10) not null,
  orgInternalCode     VARCHAR2(32),
  name                VARCHAR2(60) not null,
  type                NUMBER(10) not null,
  foundDate           DATE,
  secretary           VARCHAR2(60),
  idCardNo            VARCHAR2(18),
  telephone           VARCHAR2(20),
  mobileNumber        VARCHAR2(20),
  address             VARCHAR2(90),
  CREATEUSER          VARCHAR2(60) not null,
  UPDATEUSER          VARCHAR2(60),
  CREATEDATE          DATE not null,
  UPDATEDATE          DATE,
  constraint town_party_org primary key (ID)
);
-- Add comments to the table 
comment on table town_party_org
  is '街道社区党组织表';
-- Add comments to the columns 
comment on column town_party_org.id
  is '主键ID';
comment on column town_party_org.name
  is '党组织名称';
comment on column town_party_org.type
  is '党组织类型';
comment on column town_party_org.foundDate
  is '成立时间';
comment on column town_party_org.secretary
  is '党支部书记';
comment on column town_party_org.idCardNo
  is '身份证号码';
comment on column town_party_org.mobileNumber 
  is '联系手机';
comment on column town_party_org.telephone
  is '联系电话';
comment on column town_party_org.address
  is '党组织地址';

create sequence S_NEWPARTYORG
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
  
--  两新组织党组织表
create table new_party_org
(
  id                  NUMBER(10) not null,
  orgId               NUMBER(10) not null,
  orgInternalCode     VARCHAR2(32),
  name                VARCHAR2(60) not null,
  type                NUMBER(10) not null,
  address             VARCHAR2(90),
  remark              VARCHAR2(600),
  CREATEUSER          VARCHAR2(60) not null,
  UPDATEUSER          VARCHAR2(60),
  CREATEDATE          DATE not null,
  UPDATEDATE          DATE,
  constraint new_party_org primary key (ID)
);
-- Add comments to the table 
comment on table new_party_org
  is '两新组织党组织表';
-- Add comments to the columns 
comment on column new_party_org.id
  is '主键ID';
comment on column new_party_org.name
  is '组织名称';
comment on column new_party_org.type
  is '党组织类别';
comment on column new_party_org.address
  is '地址';
comment on column new_party_org.remark
  is '备注';
  
create sequence S_PARTYORGMEMBER
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
  
--  党组织支部成员表
create table party_org_member
(
  id                  NUMBER(10) not null,
  orgId               NUMBER(10) not null,
  orgInternalCode     VARCHAR2(32),
  partyOrgId          NUMBER(10),
  name                VARCHAR2(60) not null,
  telephone           VARCHAR2(20),
  mobileNumber        VARCHAR2(20),
  CREATEUSER          VARCHAR2(60) not null,
  UPDATEUSER          VARCHAR2(60),
  CREATEDATE          DATE not null,
  UPDATEDATE          DATE,
  constraint party_org_member primary key (ID)
);
-- Add comments to the table 
comment on table party_org_member
  is '党组织支部成员表';
-- Add comments to the columns 
comment on column party_org_member.id
  is '主键ID';
comment on column party_org_member.partyOrgId
  is '党组织表id';
comment on column party_org_member.name
  is '姓名';
comment on column party_org_member.mobileNumber 
  is '联系手机';
comment on column party_org_member.telephone
  is '联系电话';
  
create sequence S_activityRecords
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20; 

create sequence S_activityRecordsAttachFiles
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20; 

create table activityRecords(
  ID                      NUMBER(10) not null,
  ORGID                   NUMBER(10) not null,
  ORGINTERNALCODE         VARCHAR2(50),
  ORGANIZATIONID      	  NUMBER(10) not null,
  ORGANIZATIONTYPE	  	  VARCHAR2(50),
  ACTIVITYDATE			  DATE,
  ACTIVITYPLACE			  VARCHAR2(600),
  ACTIVITYTHEME			  VARCHAR2(300),
  ORGANIZER				  VARCHAR2(500),
  PARTICIPANT			  VARCHAR2(500),
  DETAILS				  CLOB,
  ISATTACHMENT    		  NUMBER(2) default 0,
  CREATEUSER              VARCHAR2(30) not null,
  UPDATEUSER              VARCHAR2(30),
  CREATEDATE              DATE not null,
  UPDATEDATE              DATE,
  constraint pkactivityRecords primary key (ID)
);
comment on table activityRecords
  is '组织活动';
comment on column activityRecords.ID
  is '组织活动ID';
comment on column activityRecords.ORGID
  is '所属网格';
comment on column activityRecords.ORGINTERNALCODE
  is '部门内部编号';
comment on column activityRecords.ORGANIZATIONID
  is '组织id';
comment on column activityRecords.ORGANIZATIONTYPE
  is '组织类型';
comment on column activityRecords.ACTIVITYDATE
  is '活动时间';
comment on column activityRecords.ACTIVITYPLACE
  is '活动地点';
comment on column activityRecords.ACTIVITYTHEME
  is '活动主题';
comment on column activityRecords.ORGANIZER
  is '组织者';
comment on column activityRecords.PARTICIPANT
  is '参与者';
comment on column activityRecords.DETAILS
  is '活动内容';
comment on column activityRecords.ISATTACHMENT
  is '是否有附件';
comment on column activityRecords.CREATEUSER
  is '创建用户';
comment on column activityRecords.UPDATEUSER
  is '修改用户';
comment on column activityRecords.CREATEDATE
  is '创建时间';
comment on column activityRecords.UPDATEDATE
  is '修改时间';

create table activityRecordsAttachFiles(
  ID                      NUMBER(10) not null,
  activityRecordId	  	  NUMBER(10) not null,
  fileName			  	  VARCHAR2(300) not null,
  FILEACTUALURL 		  VARCHAR2(300) not null,
  CREATEUSER              VARCHAR2(30) not null,
  UPDATEUSER              VARCHAR2(30),
  CREATEDATE              DATE not null,
  UPDATEDATE              DATE,
  constraint pkactivityRecordsAttachFiles primary key (ID),
  constraint fkactivityRecords foreign key (activityRecordId)
         references activityRecords (id)
);

-- Add comments to the table 
comment on table activityRecordsAttachFiles
  is '组织活动附件表';
-- Add comments to the columns 
comment on column activityRecordsAttachFiles.ID
  is '组织活动ID';
comment on column activityRecordsAttachFiles.activityRecordId
  is '组织活动ID';
comment on column activityRecordsAttachFiles.FILENAME
  is '组织活动附件名';
comment on column activityRecordsAttachFiles.FILEACTUALURL
  is '组织活动附件路径';
comment on column activityRecordsAttachFiles.CREATEUSER
  is '创建用户';
comment on column activityRecordsAttachFiles.UPDATEUSER
  is '修改用户';
comment on column activityRecordsAttachFiles.CREATEDATE
  is '创建时间';
comment on column activityRecordsAttachFiles.UPDATEDATE
  is '修改时间';
  
 /*==============================================================*/
/* sequence: CASEIMAGEUPLOAD 图片上传序列                              				*/
/*==============================================================*/   
create sequence s_CASEIMAGEUPLOAD
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
  /*==============================================================*/
/* Table: CASEIMAGEUPLOAD 图片上传表                              					*/
/*==============================================================*/
create table CASEIMAGEUPLOAD(
	id						NUMBER(10)   	not null,
	orgId           		NUMBER(10)      not null,
	orgInternalCode      	VARCHAR2(32)    not null,
	imgUrl               	VARCHAR2(128),
	baseInfoType            VARCHAR2(32),
	createUser				VARCHAR2(60) 	not null,
	updateUser				VARCHAR2(60),
	createDate				DATE 			not null,
	updateDate				DATE,
   	constraint PKCASEIMAGEUPLOAD primary key (ID)
);
-- Add comments to the table 
comment on table CASEIMAGEUPLOAD
  is '基本情况图片上传表';
-- Add comments to the columns 
comment on column CASEIMAGEUPLOAD.ID
  is '图片上传id';
comment on column CASEIMAGEUPLOAD.orgId
  is '所属网格';
comment on column CASEIMAGEUPLOAD.orgInternalCode
  is '所属网格编号';
comment on column CASEIMAGEUPLOAD.imgUrl
  is '图片地址';
comment on column CASEIMAGEUPLOAD.baseInfoType
  is '基本信息类型';
comment on column CASEIMAGEUPLOAD.CREATEUSER
  is '创建人';
comment on column CASEIMAGEUPLOAD.UPDATEUSER
  is '修改人';
comment on column CASEIMAGEUPLOAD.CREATEDATE
  is '创建时间';
comment on column CASEIMAGEUPLOAD.UPDATEDATE
  is '修改时间';  
  

/*==============================================================*/
/* sequence: VOLUNTEER_TEAM 党员志愿者队伍序列                              				*/
/*==============================================================*/   
create sequence s_VOLUNTEER_TEAM
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
  /*==============================================================*/
/* Table: VOLUNTEER_TEAM 党员志愿者队伍表                              					*/
/*==============================================================*/
create table VOLUNTEER_TEAM(
	id						NUMBER(10)   	not null,
	orgId           		NUMBER(10)      not null,
	orgInternalCode      	VARCHAR2(32)    not null,
	name               	    VARCHAR2(90)    not null,
	serviceDirection        VARCHAR2(300),
	remark                  VARCHAR2(300),
	belongOrg               NUMBER(10),
	createUser				VARCHAR2(60) 	not null,
	updateUser				VARCHAR2(60),
	createDate				DATE 			not null,
	updateDate				DATE,
   	constraint PK_VOLUNTEER_TEAM primary key (ID)
);
-- Add comments to the table 
comment on table VOLUNTEER_TEAM
  is '党员志愿者队伍表';
-- Add comments to the columns 
comment on column VOLUNTEER_TEAM.ID
  is 'id';
comment on column VOLUNTEER_TEAM.orgId
  is '所属网格';
comment on column VOLUNTEER_TEAM.orgInternalCode
  is '所属网格编号';
comment on column VOLUNTEER_TEAM.name
  is '组织名称';
comment on column VOLUNTEER_TEAM.serviceDirection
  is '服务方向';
comment on column VOLUNTEER_TEAM.remark
  is '备注';
comment on column VOLUNTEER_TEAM.belongOrg
  is '所属部门';
comment on column VOLUNTEER_TEAM.CREATEUSER
  is '创建人';
comment on column VOLUNTEER_TEAM.UPDATEUSER
  is '修改人';
comment on column VOLUNTEER_TEAM.CREATEDATE
  is '创建时间';
comment on column VOLUNTEER_TEAM.UPDATEDATE
  is '修改时间';  
  
/*==============================================================*/
/* sequence: VOLUNTEER_MEMBER 党员志愿者队伍成员序列                              				*/
/*==============================================================*/   
create sequence s_VOLUNTEER_MEMBER
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
  /*==============================================================*/
/* Table: VOLUNTEER_MEMBER 党员志愿者队伍成员表                              					*/
/*==============================================================*/
create table VOLUNTEER_MEMBER(
	id						NUMBER(10)   	not null,
	orgId           		NUMBER(10)      not null,
	orgInternalCode      	VARCHAR2(32)    not null,
	teamId               	NUMBER(10)      not null,
	memberId                NUMBER(10)      not null,
	createUser				VARCHAR2(60) 	not null,
	updateUser				VARCHAR2(60),
	createDate				DATE 			not null,
	updateDate				DATE,
   	constraint PK_VOLUNTEER_MEMBER primary key (ID)
);
-- Add comments to the table 
comment on table VOLUNTEER_MEMBER
  is '党员志愿者队伍成员表';
-- Add comments to the columns 
comment on column VOLUNTEER_MEMBER.ID
  is 'id';
comment on column VOLUNTEER_MEMBER.orgId
  is '所属网格';
comment on column VOLUNTEER_MEMBER.orgInternalCode
  is '所属网格编号';
comment on column VOLUNTEER_MEMBER.teamId
  is '队伍id';
comment on column VOLUNTEER_MEMBER.memberId
  is '成员id';
comment on column VOLUNTEER_MEMBER.CREATEUSER
  is '创建人';
comment on column VOLUNTEER_MEMBER.UPDATEUSER
  is '修改人';
comment on column VOLUNTEER_MEMBER.CREATEDATE
  is '创建时间';
comment on column VOLUNTEER_MEMBER.UPDATEDATE
  is '修改时间'; 
  
  
--操作日志记录表
create table systemOperateLogs  (
   id                   NUMBER(10)                      not null,
   dataOrgId            NUMBER(10),
   dataOrgCode          VARCHAR2(32),
   dataBeforeOrgId      NUMBER(10),
   operatePerson        VARCHAR2(60),
   dataKeyword          VARCHAR2(300),
   moduleType           VARCHAR2(60),
   businessType			VARCHAR2(60),
   operateDate          DATE,
   operateType 		    NUMBER(10),
   dataBeforeOperate	clob,
   dataAfterOperate		clob,
   operateDescribe      clob,
   contrastState		NUMBER(1),
   operateSource        VARCHAR2(60),
   dataId				NUMBER(15),
   constraint pksystemOperateLogs primary key (id),
   constraint fksystemOperateLogs foreign key (dataOrgId)
         references organizations (id)
);
comment on table systemOperateLogs is
'系统操作日志';
comment on column systemOperateLogs.dataOrgId is
'数据所属网格';
comment on column systemOperateLogs.dataOrgCode is
'数据所属网格编号';
comment on column systemOperateLogs.dataBeforeOrgId is
'数据操作前所属网格';
comment on column systemOperateLogs.operatePerson is
'操作人';
comment on column systemOperateLogs.dataKeyword is
'数据关键字';
comment on column systemOperateLogs.moduleType is
'模块类型';
comment on column systemOperateLogs.businessType is
'业务类型';
comment on column systemOperateLogs.operateDate is
'操作时间';
comment on column systemOperateLogs.operateType is
'操作类型';
comment on column systemOperateLogs.dataBeforeOperate is
'操作前数据';
comment on column systemOperateLogs.dataAfterOperate is
'操作后数据';
comment on column systemOperateLogs.operateDescribe is
'具体操作内容';
comment on column systemOperateLogs.contrastState is
'数据操作前后对比状态';
comment on column systemOperateLogs.operateSource is
'数据操作源（在哪个模块被操作）';
comment on column systemOperateLogs.dataId is
'数据id';

/*==============================================================*/
/* index: indexSOperateLogsDataKeyword                                 */
/*==============================================================*/
create index indexSOperateLogsDataKeyword on systemOperateLogs (dataKeyword);

--  区域党委成员表
create table regionalPartyMembers
(
  id                  NUMBER(10) not null,
  orgId               NUMBER(10) not null,
  orgInternalCode     VARCHAR2(32),
  name				  VARCHAR2(60)  	not null,
  gender			  NUMBER(10)		not null,
  partyOrgDuty		  NUMBER(10),
  unit				  VARCHAR2(180),
  unitDuty			  VARCHAR2(180),
  telephone           VARCHAR2(20),
  mobileNumber        VARCHAR2(20),
  CREATEUSER          VARCHAR2(60) not null,
  UPDATEUSER          VARCHAR2(60),
  CREATEDATE          DATE not null,
  UPDATEDATE          DATE,
  constraint PKREGIONALPARTYMEMBERS primary key (id)
);

-- Add comments to the table 
comment on table regionalPartyMembers
  is '区域党委成员表';
-- Add comments to the columns 
comment on column regionalPartyMembers.ID
  is '区域党委成员表id';
comment on column regionalPartyMembers.orgId
  is '所属网格';
comment on column regionalPartyMembers.orgInternalCode
  is '所属网格编号';
comment on column regionalPartyMembers.name
  is '姓名';
comment on column regionalPartyMembers.gender
  is '性别(0男，1女，2未知)';   
comment on column regionalPartyMembers.partyOrgDuty
  is '区域党委职务';
comment on column regionalPartyMembers.unit
  is '所属单位'; 
comment on column regionalPartyMembers.unitDuty
  is '所属单位职务';
comment on column regionalPartyMembers.mobileNumber
  is '联系手机';  
comment on column regionalPartyMembers.telephone
  is '固定电话';  
comment on column regionalPartyMembers.CREATEUSER
  is '创建人';
comment on column regionalPartyMembers.UPDATEUSER
  is '修改人';
comment on column regionalPartyMembers.CREATEDATE
  is '创建时间';
comment on column regionalPartyMembers.UPDATEDATE
  is '修改时间';

------区域联建情况表  
create table regionalBuildInfos(
  ID                      NUMBER(10) not null,
  ORGID                   NUMBER(10) not null,
  ORGINTERNALCODE         VARCHAR2(50),
  SERVICEITEM			  VARCHAR2(200),
  ADVANCEMENTINFO		  CLOB,
  ISATTACHMENT    		  NUMBER(2) default 0,
  CREATEUSER              VARCHAR2(30) not null,
  UPDATEUSER              VARCHAR2(30),
  CREATEDATE              DATE not null,
  UPDATEDATE              DATE,
  constraint pkregionalBuildInfos primary key (ID)
);
comment on table regionalBuildInfos
  is '区域联建情况表';
comment on column regionalBuildInfos.ID
  is '区域联建情况表ID';
comment on column regionalBuildInfos.ORGID
  is '所属网格';
comment on column regionalBuildInfos.ORGINTERNALCODE
  is '部门内部编号';
comment on column regionalBuildInfos.SERVICEITEM
  is '服务项目名称';
comment on column regionalBuildInfos.ADVANCEMENTINFO
  is '推进情况';
comment on column regionalBuildInfos.ISATTACHMENT
  is '是否有附件';
comment on column regionalBuildInfos.CREATEUSER
  is '创建用户';
comment on column regionalBuildInfos.UPDATEUSER
  is '修改用户';
comment on column regionalBuildInfos.CREATEDATE
  is '创建时间';
comment on column regionalBuildInfos.UPDATEDATE
  is '修改时间';

-------区域联建情况附件表
create table regionalBuildInfoAttachFiles(
  ID                      NUMBER(10) not null,
  REGIONALBUILDINFOID	  NUMBER(10) not null,
  FILENAME			  	  VARCHAR2(300) not null,
  FILEACTUALURL 		  VARCHAR2(300) not null,
  CREATEUSER              VARCHAR2(30) not null,
  UPDATEUSER              VARCHAR2(30),
  CREATEDATE              DATE not null,
  UPDATEDATE              DATE,
  constraint pkregionalBuildInfoAttachFiles primary key (ID),
  constraint fkregionalBuildInfos foreign key (regionalBuildInfoId)
         references regionalBuildInfos (id)
);

-- Add comments to the table 
comment on table regionalBuildInfoAttachFiles
  is '区域联建情况附件表';
-- Add comments to the columns 
comment on column regionalBuildInfoAttachFiles.ID
  is '区域联建情况附件ID';
comment on column regionalBuildInfoAttachFiles.regionalBuildInfoId
  is '区域联建情况ID';
comment on column regionalBuildInfoAttachFiles.FILENAME
  is '区域联建情况附件名';
comment on column regionalBuildInfoAttachFiles.FILEACTUALURL
  is '区域联建情况附件路径';
comment on column regionalBuildInfoAttachFiles.CREATEUSER
  is '创建用户';
comment on column regionalBuildInfoAttachFiles.UPDATEUSER
  is '修改用户';
comment on column regionalBuildInfoAttachFiles.CREATEDATE
  is '创建时间';
comment on column regionalBuildInfoAttachFiles.UPDATEDATE
  is '修改时间';
  
  
---------区域联建情况认领表
create table claimRegionalBuildInfos(
  ID                      NUMBER(10) not null,
  regionalBuildInfoId	  NUMBER(10) not null,
  claimDepartment 		  VARCHAR2(200) not null,
  claimDate			  	  DATE not null,
  CREATEUSER              VARCHAR2(30) not null,
  UPDATEUSER              VARCHAR2(30),
  CREATEDATE              DATE not null,
  UPDATEDATE              DATE,
  constraint pkclaimRegionalBuildInfos primary key (ID),
  constraint fkclaimRegionalBuildInfos foreign key (regionalBuildInfoId)
         references regionalBuildInfos (id)
);

-- Add comments to the table 
comment on table claimRegionalBuildInfos
  is '区域联建情况认领表';
-- Add comments to the columns 
comment on column claimRegionalBuildInfos.ID
  is '区域联建情况认领ID';
comment on column claimRegionalBuildInfos.regionalBuildInfoId
  is '区域联建情况ID';
comment on column claimRegionalBuildInfos.claimDepartment
  is '认领单位';
comment on column claimRegionalBuildInfos.claimDate
  is '认领时间';
comment on column claimRegionalBuildInfos.CREATEUSER
  is '创建用户';
comment on column claimRegionalBuildInfos.UPDATEUSER
  is '修改用户';
comment on column claimRegionalBuildInfos.CREATEDATE
  is '创建时间';
comment on column claimRegionalBuildInfos.UPDATEDATE
  is '修改时间';
  
  create sequence S_organsParty
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
  
create table organs_Party
(
  id                  NUMBER(10) not null,
  orgId               NUMBER(10) not null,
  orgInternalCode     VARCHAR2(32) not null,
  department          NUMBER(10) not null,
  name                VARCHAR2(90) not null,
  type                NUMBER(10) not null,
  contact             VARCHAR2(60),
  telephone           VARCHAR2(20),
  superior            NUMBER(10),
  remark              VARCHAR2(600),
  CREATEUSER          VARCHAR2(60) not null,
  UPDATEUSER          VARCHAR2(60),
  CREATEDATE          DATE not null,
  UPDATEDATE          DATE,
  constraint pk_organs_Party primary key (ID)
);
comment on table organs_Party
  is '机关党组织表';
comment on column organs_Party.id
  is '主键ID';
comment on column organs_Party.department
  is '所属部门';
comment on column organs_Party.name
  is '党组织名称';
comment on column organs_Party.type
  is '党组织类型';
comment on column organs_Party.contact
  is '联系人';
 comment on column organs_Party.telephone
  is '联系电话';
comment on column organs_Party.superior
  is '上级党组织';
comment on column organs_Party.remark
  is '备注';

   /*==============================================================*/
/* sequence: skynet 天网序列                              				*/
/*==============================================================*/   
create sequence s_skynet
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
  /*==============================================================*/
/* Table: skynet 天网表                              					*/
/*==============================================================*/
 create table skynet(
 	id						NUMBER(10)   	not null,
	orgId           		NUMBER(10)      not null,
	orgInternalCode      	VARCHAR2(32)    not null,
	code					VARCHAR2(60)    not null,
	address              	VARCHAR2(90),
	centerLon				VARCHAR2(32),
  	centerLat				VARCHAR2(32),
  	centerLon2				VARCHAR2(32),
  	centerLat2				VARCHAR2(32),
  	isEmphasis           	NUMBER(1)        default 0,
    logOutTime           	DATE,
    logOutReason         	VARCHAR2(300),
	createUser				VARCHAR2(60) 	not null,
	updateUser				VARCHAR2(60),
	createDate				DATE 			not null,
	updateDate				DATE,
	type					VARCHAR2(32),
   	constraint PKSKYNET primary key (ID)
 	
 );
 -- Add comments to the table 
comment on table skynet
  is '天网表';
-- Add comments to the columns 
comment on column skynet.ID
  is '天网id';
comment on column skynet.orgId
  is '所属网格';
comment on column skynet.orgInternalCode
  is '所属网格编号';
comment on column skynet.code
  is '编号';  
comment on column skynet.address
  is '地址';  
comment on column skynet.centerLon
  is '2.5维经度';
comment on column skynet.centerLat
  is '2.5维纬度';
comment on column skynet.centerLon2
  is '2维经度';
comment on column skynet.centerLat2
  is '2维纬度';
comment on column skynet.isEmphasis 
  is '是否注销';
comment on column skynet.logOutTime 
  is '注销时间';
comment on column skynet.logOutReason 
  is '注销原因';
comment on column skynet.CREATEUSER
  is '创建人';
comment on column skynet.UPDATEUSER
  is '修改人';
comment on column skynet.CREATEDATE
  is '创建时间';
comment on column skynet.UPDATEDATE
  is '修改时间'; 
comment on column skynet.type
  is '公安类型'; 
  

 /*==============================================================*/
/* sequence: bayonet 卡口序列                              				*/
/*==============================================================*/   
create sequence s_bayonet
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
  /*==============================================================*/
/* Table: bayonet 卡口表                              					*/
/*==============================================================*/
 create table bayonet(
 	id						NUMBER(10)   	not null,
	orgId           		NUMBER(10)      not null,
	orgInternalCode      	VARCHAR2(32)    not null,
	code					VARCHAR2(60)    not null,
	address              	VARCHAR2(90),
	centerLon				VARCHAR2(32),
  	centerLat				VARCHAR2(32),
  	centerLon2				VARCHAR2(32),
  	centerLat2				VARCHAR2(32),
  	isEmphasis           	NUMBER(1)        default 0,
    logOutTime           	DATE,
    logOutReason         	VARCHAR2(300),
	createUser				VARCHAR2(60) 	not null,
	updateUser				VARCHAR2(60),
	createDate				DATE 			not null,
	updateDate				DATE,
	type					VARCHAR2(32),
   	constraint PKBAYONET primary key (ID)
 	
 );
 -- Add comments to the table 
comment on table bayonet
  is '卡口表';
-- Add comments to the columns 
comment on column bayonet.ID
  is '卡口id';
comment on column bayonet.orgId
  is '所属网格';
comment on column bayonet.orgInternalCode
  is '所属网格编号';
comment on column bayonet.code
  is '编号';  
comment on column bayonet.address
  is '地址';  
comment on column bayonet.centerLon
  is '2.5维经度';
comment on column bayonet.centerLat
  is '2.5维纬度';
comment on column bayonet.centerLon2
  is '2维经度';
comment on column bayonet.centerLat2
  is '2维纬度';
comment on column bayonet.CREATEUSER
  is '创建人';
comment on column bayonet.isEmphasis 
  is '是否注销';
comment on column bayonet.logOutTime 
  is '注销时间';
comment on column bayonet.logOutReason 
  is '注销原因';
comment on column bayonet.UPDATEUSER
  is '修改人';
comment on column bayonet.CREATEDATE
  is '创建时间';
comment on column bayonet.UPDATEDATE
  is '修改时间'; 
comment on column bayonet.type
  is '公安类型'; 
    
  
 /*==============================================================*/
/* sequence: snapshotSystem 抓拍系统序列                              				*/
/*==============================================================*/   
create sequence s_snapshotSystem
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
  /*==============================================================*/
/* Table: snapshotSystem 抓拍系统表                              					*/
/*==============================================================*/
 create table snapshotSystem(
 	id						NUMBER(10)   	not null,
	orgId           		NUMBER(10)      not null,
	orgInternalCode      	VARCHAR2(32)    not null,
	code					VARCHAR2(60)    not null,
	address              	VARCHAR2(90),
	centerLon				VARCHAR2(32),
  	centerLat				VARCHAR2(32),
  	centerLon2				VARCHAR2(32),
  	centerLat2				VARCHAR2(32),
  	isEmphasis           	NUMBER(1)        default 0,
    logOutTime           	DATE,
    logOutReason         	VARCHAR2(300),
	createUser				VARCHAR2(60) 	not null,
	updateUser				VARCHAR2(60),
	createDate				DATE 			not null,
	updateDate				DATE,
	type					VARCHAR2(32),
   	constraint PKSNAPSHOTSYSTEM primary key (ID)
 	
 );
 -- Add comments to the table 
comment on table snapshotSystem
  is '抓拍系统表';
-- Add comments to the columns 
comment on column snapshotSystem.ID
  is '抓拍系统id';
comment on column snapshotSystem.orgId
  is '所属网格';
comment on column snapshotSystem.orgInternalCode
  is '所属网格编号';
comment on column snapshotSystem.code
  is '编号';  
comment on column snapshotSystem.address
  is '地址';  
comment on column snapshotSystem.centerLon
  is '2.5维经度';
comment on column snapshotSystem.centerLat
  is '2.5维纬度';
comment on column snapshotSystem.centerLon2
  is '2维经度';
comment on column snapshotSystem.centerLat2
  is '2维纬度';
comment on column snapshotSystem.isEmphasis 
  is '是否注销';
comment on column snapshotSystem.logOutTime 
  is '注销时间';
comment on column snapshotSystem.logOutReason 
  is '注销原因';
comment on column snapshotSystem.CREATEUSER
  is '创建人';
comment on column snapshotSystem.UPDATEUSER
  is '修改人';
comment on column snapshotSystem.CREATEDATE
  is '创建时间';
comment on column snapshotSystem.UPDATEDATE
  is '修改时间'; 
comment on column snapshotSystem.type
  is '公安类型';  
  
  
  create sequence S_parameterConfig
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table parameterConfig
(
  id                    NUMBER(10) not null,
  handleScore           NUMBER(13,3),
  transferredScore      NUMBER(13,3),
  circulationScore      NUMBER(13,3),
  constraint PK_parameterConfig primary key (ID)
);

comment on table parameterConfig
  is '三本台账扣分表';
comment on column parameterConfig.handleScore
  is '办理扣分';
comment on column parameterConfig.transferredScore
  is '办结扣分';
comment on column parameterConfig.circulationScore
  is '流转扣分';
  
  insert into parameterConfig (ID, handleScore, transferredScore, circulationScore)
values (S_parameterConfig.Nextval, 1, 2, 3);
commit;

create sequence S_parameterTimeLimit 
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table parameterTimeLimit 
(
  id                    NUMBER(10) not null,
  departmentLevel       NUMBER(10),
  useLevel              NUMBER(10),
  orgType               NUMBER(10),
  handleLimit           NUMBER(10),
  transferredLimit      NUMBER(10),
  circulationLimit      NUMBER(10),
  createUser			VARCHAR2(60) 	not null,
  updateUser			VARCHAR2(60),
  createDate			DATE 			not null,
  updateDate			DATE,
  constraint PK_parameterTimeLimit primary key (ID)
);

comment on table parameterTimeLimit
  is '三本台账时限标准表';
comment on column parameterTimeLimit.departmentLevel
  is '部门';
 comment on column parameterTimeLimit.useLevel
  is '应用层级';
comment on column parameterTimeLimit.orgType
  is '部门类型';
comment on column parameterTimeLimit.handleLimit
  is '办理时限';
 comment on column parameterTimeLimit.transferredLimit
  is '办结时限';
comment on column parameterTimeLimit.circulationLimit
  is '流转时限';
  
 insert into parameterTimeLimit (ID, departmentLevel, useLevel, orgType, handleLimit,transferredLimit ,circulationLimit,createUser,createDate)
values (S_parameterTimeLimit.Nextval, null,null,null,1, 2, 3,  'admin',sysdate);
commit;

  
  --四川党建成员报名详情表
create sequence S_party_members_enroll
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

/*==============================================================*/
/* Table: party_members_enroll 党员报到详情表           */
/*==============================================================*/
create table party_members_enroll
(
  id number(10) primary key,
  orgId number(10),
  orgInternalCode varchar2(32),
  memberId number(10),
  regActivitiesType VARCHAR2(60),
  voluntaryPostId number(10),
  isEnroll number(10),
  isTurnOut number(10),
  logoutStatus  NUMBER(10) default 0,
  createdate date not null,
  createuser VARCHAR2(32) not null,
  updatedate date,
  updateuser VARCHAR2(32)
);
comment on table party_members_enroll                      is '四川党建成员报名详情表';
comment on column party_members_enroll.id                  is '四川党建成员报名详情表id';
comment on column party_members_enroll.orgId               is '组织机构id';
comment on column party_members_enroll.orgInternalCode     is '组织机构内置编码';
comment on column party_members_enroll.memberId            is '党员ID';
comment on column party_members_enroll.regActivitiesType   is '类型';
comment on column party_members_enroll.voluntaryPostId     is '志愿者岗位';
comment on column party_members_enroll.isEnroll            is '是否报到【0、已报到 1、未报到】';
comment on column party_members_enroll.isTurnOut           is '是否转出【0是】';
comment on column party_members_enroll.logoutStatus        is '是否注销';
comment on column party_members_enroll.createDate          is '创建时间';
comment on column party_members_enroll.createUser          is '创建人';
comment on column party_members_enroll.updateDate          is '修改时间';
comment on column party_members_enroll.updateUser          is '修改人';


  
/*==============================================================*/
/* sequence: partyOrg_Report 党组织报到序列                           				*/
/*==============================================================*/   
create sequence s_partyOrg_Report
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
/*==============================================================*/
/* Table: partyOrg_Report 党组织报到表                              					*/
/*==============================================================*/
create table partyOrg_Report(
  id                  		NUMBER(10) not null,
  orgId               		NUMBER(10) not null,
  orgInternalCode     		VARCHAR2(32),
  name                		VARCHAR2(60) not null,
  partyOrgType        		NUMBER(10) not null,
  address             		VARCHAR2(300),
  contractor		  		VARCHAR2(60),
  telephone			  		VARCHAR2(30),
  remark              		VARCHAR2(600),
  isEmphasis           		NUMBER(1)        default 0,
  logOutTime           		DATE,
  logOutReason         		VARCHAR2(300),
  type 						VARCHAR2(60),
  CREATEUSER          		VARCHAR2(60) not null,
  UPDATEUSER          		VARCHAR2(60),
  CREATEDATE          		DATE not null,
  UPDATEDATE          		DATE,
  constraint partyOrg_Report primary key (ID)
  
);

 -- Add comments to the table 
comment on table partyOrg_Report
  is '党组织报到表';
-- Add comments to the columns 
comment on column partyOrg_Report.ID
  is '党组织报到id';
comment on column partyOrg_Report.orgId
  is '所属网格';
comment on column partyOrg_Report.orgInternalCode
  is '所属网格编号';
comment on column partyOrg_Report.name
  is '单位名称';
comment on column partyOrg_Report.partyOrgType
  is '党组织类别';
comment on column partyOrg_Report.address
  is '地址';
comment on column partyOrg_Report.contractor
  is '联系人';
comment on column partyOrg_Report.telephone
  is '联系电话';
comment on column partyOrg_Report.remark
  is '备注'; 
comment on column partyOrg_Report.isEmphasis 
  is '是否注销';
comment on column partyOrg_Report.logOutTime 
  is '注销时间';
comment on column partyOrg_Report.logOutReason 
  is '注销原因'; 
comment on column partyOrg_Report.type 
  is '类型'; 
comment on column partyOrg_Report.CREATEUSER
  is '创建人';
comment on column partyOrg_Report.UPDATEUSER
  is '修改人';
comment on column partyOrg_Report.CREATEDATE
  is '创建时间';
comment on column partyOrg_Report.UPDATEDATE
  is '修改时间'; 
  
/*==============================================================*/
/* sequence: serviceProject 服务项目序列                           				*/
/*==============================================================*/   
create sequence s_serviceProject
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
/*==============================================================*/
/* Table: serviceProject 服务项目表                              					*/
/*==============================================================*/
create table serviceProject(
  id                  		NUMBER(10) not null,
  orgId               		NUMBER(10) not null,
  orgInternalCode     		VARCHAR2(32),
  projectName               VARCHAR2(60) not null,
  claimPlans        		NUMBER(10),
  projectContent            CLOB,
  contractor		  		VARCHAR2(60),
  telephone			  		VARCHAR2(30),
  remark              		VARCHAR2(600),
  CREATEUSER          		VARCHAR2(60) not null,
  UPDATEUSER          		VARCHAR2(60),
  CREATEDATE          		DATE not null,
  UPDATEDATE          		DATE,
  constraint serviceProject primary key (ID)
);  
 -- Add comments to the table 
comment on table serviceProject
  is '服务项目表';
-- Add comments to the columns 
comment on column serviceProject.ID
  is '服务项目id';
comment on column serviceProject.orgId
  is '所属网格';
comment on column serviceProject.orgInternalCode
  is '所属网格编号';
comment on column serviceProject.projectName
  is '项目名称';
comment on column serviceProject.claimPlans
  is '拟认领数';
comment on column serviceProject.projectContent
  is '项目内容';
comment on column serviceProject.contractor
  is '联系人';
comment on column serviceProject.telephone
  is '联系电话';
comment on column serviceProject.remark
  is '备注';
comment on column serviceProject.CREATEUSER
  is '创建人';
comment on column serviceProject.UPDATEUSER
  is '修改人';
comment on column serviceProject.CREATEDATE
  is '创建时间';
comment on column serviceProject.UPDATEDATE
  is '修改时间'; 
  
  
/*==============================================================*/
/* sequence: volunteerJobs 志愿者岗位序列                           				*/
/*==============================================================*/   
create sequence s_volunteerJobs
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
 
/*==============================================================*/
/* Table: volunteerJobs 志愿者岗位表                              					*/
/*==============================================================*/
create table volunteerJobs(
  id                  		NUMBER(10) not null,
  orgId               		NUMBER(10) not null,
  orgInternalCode     		VARCHAR2(32),
  name               		VARCHAR2(60) not null,
  claimPlans        		NUMBER(10),
  content            		CLOB,
  contractor		  		VARCHAR2(60),
  telephone			  		VARCHAR2(30),
  remark              		VARCHAR2(600),
  CREATEUSER          		VARCHAR2(60) not null,
  UPDATEUSER          		VARCHAR2(60),
  CREATEDATE          		DATE not null,
  UPDATEDATE          		DATE,
  constraint volunteerJobs primary key (ID)
);  
 -- Add comments to the table 
comment on table volunteerJobs
  is '志愿者岗位表';
-- Add comments to the columns 
comment on column volunteerJobs.ID
  is '志愿者岗位id';
comment on column volunteerJobs.orgId
  is '所属网格';
comment on column volunteerJobs.orgInternalCode
  is '所属网格编号';
comment on column volunteerJobs.name
  is '志愿者岗位';
comment on column volunteerJobs.claimPlans
  is '拟认领数';
comment on column volunteerJobs.content
  is '专长要求';
comment on column volunteerJobs.contractor
  is '联系人';
comment on column volunteerJobs.telephone
  is '联系电话';
comment on column volunteerJobs.remark
  is '备注';
comment on column volunteerJobs.CREATEUSER
  is '创建人';
comment on column volunteerJobs.UPDATEUSER
  is '修改人';
comment on column volunteerJobs.CREATEDATE
  is '创建时间';
comment on column volunteerJobs.UPDATEDATE
  is '修改时间';
  
  

/*==============================================================*/
/* Table: reportHasProject 党组织报到和服务项目关联表                                   			*/
/*==============================================================*/
create table reportHasProject  (
   reportId           NUMBER(10)                      not null,
   projectId          NUMBER(10)                      not null,
   constraint fkReportHasProject foreign key (projectId)
   references serviceProject (id)
);
comment on table reportHasProject
  is '党组织报到和服务项目关联表      ';
comment on column reportHasProject.reportId
  is '党组织报到id';
comment on column reportHasProject.projectId
  is '服务项目id';

/*==============================================================*/
/* Table: memberHasVolunteerJobs 党员报到和志愿者岗位关联表           */
/*==============================================================*/
create table memberHasVolunteerJobs  (
   memberId           		NUMBER(10)                      not null,
   volunteerJobsId          NUMBER(10)                      not null,
   constraint fkMemberHasVolunteerJobs foreign key (volunteerJobsId)
   references volunteerJobs (id)
);
comment on table memberHasVolunteerJobs
  is '党员报到和志愿者岗位关联表      ';
comment on column memberHasVolunteerJobs.memberId
  is '党员报到id';
comment on column memberHasVolunteerJobs.volunteerJobsId
  is '志愿者岗位id';

----------时限考核成绩
-- Create sequence
create sequence S_statisticsAccountTimeouts
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

---------时限考核成绩表
create table statisticsAccountTimeouts (
 id 				number (10),
 orgid 				number(10) not null,
 orginternalcode 		varchar2(32) not null,
 parentorgid 			number(10) not null,
 orgtype 			number(10) not null,
 year 				varchar2(4),
 month 				varchar2(2),
 doing 				number(10,2) default 0.00,
 done 				number(10,2)  default 0.00,
 transfer 			number(10,2)  default 0.00,
 createuser 			varchar2(60),
 createdate 			date,
 constraint pkstatisticsAccountTimeouts primary key (ID)
);
-- Add comments to the table 
comment on table statisticsAccountTimeouts
  is '时限考核成绩表';
-- Add comments to the columns 
comment on column statisticsAccountTimeouts.orgid
  is '统计的组织机构id';  
comment on column statisticsAccountTimeouts.orginternalcode
  is '统计的组织机构orginternalcode'; 
comment on column statisticsAccountTimeouts.parentorgid
  is '统计的组织机构父id';
comment on column statisticsAccountTimeouts.orgtype
  is '组织机构类型';
comment on column statisticsAccountTimeouts.year
  is '统计的年份';
comment on column statisticsAccountTimeouts.month
  is '统计的月份';
comment on column statisticsAccountTimeouts.doing
  is '办理扣分';
comment on column statisticsAccountTimeouts.done
  is '办结扣分';  
comment on column statisticsAccountTimeouts.transfer
  is '流转扣分';  
comment on column statisticsAccountTimeouts.createuser
  is '创建人';
comment on column statisticsAccountTimeouts.createdate
  is '创建时间';

--系统党建表结构
create sequence s_system_party
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table system_party
(
  id                  NUMBER(10) not null,
  orgId               NUMBER(10) not null,
  orgInternalCode     VARCHAR2(32) not null,
  partyName           VARCHAR2(90) not null,
  partyOrgType        NUMBER(10) not null,
  contact             VARCHAR2(60),
  telephone           VARCHAR2(20),
  mobile              VARCHAR2(20),
  remark              VARCHAR2(600),
  CREATEUSER          VARCHAR2(60) not null,
  UPDATEUSER          VARCHAR2(60),
  CREATEDATE          DATE not null,
  UPDATEDATE          DATE,
  constraint pk_system_party primary key (ID)
);
comment on table system_party
  is '系统党建表';
comment on column system_party.id
  is '主键ID';
comment on column system_party.partyName
  is '党组织名称';
comment on column system_party.partyOrgType
  is '党组织类型';
comment on column system_party.contact
  is '联系人';
 comment on column system_party.telephone
  is '联系电话';
comment on column system_party.mobile
  is '联系手机';
comment on column system_party.remark
  is '备注';
  
create sequence s_mobileupdates
increment by 1
start with 1
minvalue 1
maxvalue 9999999999
cache 20;

create table MOBILEUPDATE
(
  ID          NUMBER(10) not null,
  VERSION     VARCHAR2(20) not null,
  LEVELS      VARCHAR2(20),
  BUILD       VARCHAR2(20),
  URL         VARCHAR2(256) not null,
  INFORMATION CLOB not null,
  USERNAME    VARCHAR2(50) not null,
  CATEGORY    VARCHAR2(50) ,
  ORGID       NUMBER(10),
  DEPARTMENTNO VARCHAR2(32),
  CREATEUSER  varchar(30)  null,
  CREATEDATE  date  null,
  UPDATEUSER  varchar(30)  null,
  UPDATEDATE  DATE  null
);
comment on column MOBILEUPDATE.VERSION
  is '版本号';
comment on column MOBILEUPDATE.LEVELS
  is '更新等级';
comment on column MOBILEUPDATE.BUILD
  is '编译号';
comment on column MOBILEUPDATE.UPDATEDATE
  is '更新日期';
  comment on column MOBILEUPDATE.CREATEUSER
  is '创建人';
  comment on column MOBILEUPDATE.CREATEDATE
  is '创建日期';
  comment on column MOBILEUPDATE.UPDATEUSER
  is '更新人';
comment on column MOBILEUPDATE.URL
  is '更新请求路径';
comment on column MOBILEUPDATE.INFORMATION
  is '更新说明';
comment on column MOBILEUPDATE.USERNAME
  is '记录最后更新移动终端版本信息的用户名';
comment on column MOBILEUPDATE.CATEGORY
  is 'phone还是pad';
comment on column MOBILEUPDATE.ORGID 
is '组织机构id';
comment on column MOBILEUPDATE.DEPARTMENTNO
is '部门编号';
  

create table PERMANENTADDRESS
(
  addressno varchar2(60) unique,
  addressname       varchar2(60),
  parentid      varchar2(60),
  addressLevel  varchar2(5)
);
comment on column PERMANENTADDRESS.addressno is '地区编号';
comment on column PERMANENTADDRESS.addressname is '地区名称';
comment on column PERMANENTADDRESS.parentid is '上级ID';
comment on column PERMANENTADDRESS.addressLevel is '地区级别:1、省级   2、市级  3、区县级';
  
  /*==============================================================*/
/* sequence: fourLevelPlatform 四级平台序列                           				*/
/*==============================================================*/
create sequence S_FOURLEVELPLATFORM
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

/*==============================================================*/
/* Table: fourLevelPlatform 四级平台表                              					*/
/*==============================================================*/
 create table fourLevelPlatform(
 	 id                   	NUMBER(10)                      not null,
   	 orgId                	NUMBER(10)                      not null,
   	 orgInternalCode      	VARCHAR2(32)                    not null,
   	 name                 	VARCHAR2(100)                   not null,
   	 teamType			  	NUMBER(10)						not null,
   	 seq  				  	NUMBER(10),
   	 remark					VARCHAR2(600),
   	 CREATEUSER           	VARCHAR2(32)                    not null,
     UPDATEUSER           	VARCHAR2(32),
     CREATEDATE           	DATE                            not null,
     UPDATEDATE          	DATE,
   	 constraint PKFOURLEVELPLATFORM primary key (ID)
 );
 
 -- Add comments to the table 
comment on table fourLevelPlatform
  is '四级平台表';
-- Add comments to the columns 
comment on column fourLevelPlatform.ID
  is '四级平台id';
comment on column fourLevelPlatform.orgId
  is '所属网格';
comment on column fourLevelPlatform.orgInternalCode
  is '所属网格编号';
comment on column fourLevelPlatform.name
  is '平台名称';
comment on column fourLevelPlatform.teamType
  is '组织类型';  
comment on column fourLevelPlatform.seq
  is '排序';
comment on column fourLevelPlatform.remark
  is '备注'; 
comment on column fourLevelPlatform.CREATEUSER
  is '创建人';
comment on column fourLevelPlatform.UPDATEUSER
  is '修改人';
comment on column fourLevelPlatform.CREATEDATE
  is '创建时间';
comment on column fourLevelPlatform.UPDATEDATE
  is '修改时间';
  

create sequence S_PERMANENTADDRESSLOG
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table PERMANENTADDRESSLOG (
 id          number(10)          not null primary key,
 province    VARCHAR2(60),
 city        VARCHAR2(60),
 district    VARCHAR2(60),
 addslevel   number(1),
 addressNo   VARCHAR2(60),
 changedName VARCHAR2(60),
 optionType  number(1),
 jobState    number(1)		     default 0,
 CREATEUSER  VARCHAR2(32)        not null,
 UPDATEUSER  VARCHAR2(32),
 CREATEDATE  DATE                not null,
 UPDATEDATE  DATE
);

comment on table PERMANENTADDRESSLOG
 is '省市县变更Job';
comment on column PERMANENTADDRESSLOG.Id
 is 'ID';
comment on column PERMANENTADDRESSLOG.Province
 is '原省';
comment on column PERMANENTADDRESSLOG.City
 is '原市';
comment on column PERMANENTADDRESSLOG.District
 is '原县';
comment on column PERMANENTADDRESSLOG.Addslevel
 is '变更地址层级';
comment on column PERMANENTADDRESSLOG.Addressno
 is '变更地址的编号';
comment on column PERMANENTADDRESSLOG.Changedname
 is '变更名称';
comment on column PERMANENTADDRESSLOG.Optiontype
 is '操作类型 1 as 新增 2 as 修改 3 as 删除';
comment on column PERMANENTADDRESSLOG.Jobstate
 is 'Job处理类型 0 as 初始化,新增  1 as 修改,删除  2 as 已处理';


create sequence S_PRIMARYMEMBERS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

/*==============================================================*/
/* Table: primarymembers                                     */
/*==============================================================*/
create table PRIMARYMEMBERS  (
   ID                   NUMBER(10)                      not null,
   ORGID                NUMBER(10)                      not null,
   ORGCODE				VARCHAR2(32)                    not null,
   NAME                 VARCHAR2(32)                    not null,
   GENDER               NUMBER(10)                      not null,
   BIRTHDAY             DATE,
   DUTYID               NUMBER(10),
   IDCARDNO				VARCHAR2(18),
   POSITION             VARCHAR2(32),
   MOBILE               VARCHAR2(20),
   TELEPHONE            VARCHAR2(20),
   CREATEUSER           VARCHAR2(32)                    not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                            not null,
   UPDATEDATE           DATE,
   ISHAVEJOB            NUMBER(1)                       default 0,
   SEQ  				NUMBER(10),
   REMARK               VARCHAR2(600),
   ORGNAME              VARCHAR2(60)                    not null,
   NATION               NUMBER(10),
   POLITICALBACKGROUND  NUMBER(10),
   SCHOOLING            NUMBER(10),
   DEPARTMENTPARTYLEVEL NUMBER(10),
   constraint PKPRIMARYMEMBERS primary key (ID)
);

comment on table PRIMARYMEMBERS is
'成员库表';

comment on column PRIMARYMEMBERS.ID is
'成员库成员ID';

comment on column PRIMARYMEMBERS.ORGID is
'网格ID';

comment on column PRIMARYMEMBERS.ORGCODE is
'区域编码';

comment on column PRIMARYMEMBERS.NAME is
'成员姓名';

comment on column PRIMARYMEMBERS.GENDER is
'性别';

comment on column PRIMARYMEMBERS.BIRTHDAY is
'出生年月';

comment on column PRIMARYMEMBERS.DUTYID is
'职务ID';

comment on column PRIMARYMEMBERS.IDCARDNO is 
'身份证号码';

comment on column PRIMARYMEMBERS.POSITION is
'职位';

comment on column PRIMARYMEMBERS.MOBILE is
'手机号';

comment on column PRIMARYMEMBERS.TELEPHONE is
'电话号';

comment on column PRIMARYMEMBERS.CREATEUSER is
'创建用户';

comment on column PRIMARYMEMBERS.UPDATEUSER is
'修改用户';

comment on column PRIMARYMEMBERS.CREATEDATE is
'创建日期';

comment on column PRIMARYMEMBERS.UPDATEDATE is
'修改日期';

comment on column PRIMARYMEMBERS.ISHAVEJOB is
'曾经任职0.在职；1.卸任';

comment on column PRIMARYMEMBERS.SEQ
  is '排序字段'; 

comment on column PRIMARYMEMBERS.REMARK is
'备注';

comment on column PRIMARYMEMBERS.ORGNAME is '所属区域';

comment on column PRIMARYMEMBERS.NATION is '民族';

comment on column PRIMARYMEMBERS.POLITICALBACKGROUND is '政治面貌';

comment on column PRIMARYMEMBERS.SCHOOLING is '文化程度';

comment on column PRIMARYMEMBERS.DEPARTMENTPARTYLEVEL is '部门党委等级';

create sequence S_PRIMARYMEMBERSORGTYPE
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
/*==============================================================*/
/* Table: primarymembersOrgType                                    */
/*==============================================================*/
create table PRIMARYMEMBERSORGTYPE  (
   	ID                   NUMBER(10)                      not null,
   	PRIMARYMEMBERSID     NUMBER(10)                      not null,
   	PRIMARYORGID         NUMBER(10)                      not null,
   	ISFOURLEVELPLATFORM  NUMBER(1),
   	SEQ 				 NUMBER(10),
	constraint PRIMARYMEMBERSORGTYPE primary key (ID)
);
comment on table PRIMARYMEMBERSORGTYPE is
'成员库组织类型表';

comment on column PRIMARYMEMBERSORGTYPE.ID is
'成员库组织类型ID';

comment on column PRIMARYMEMBERSORGTYPE.PRIMARYMEMBERSID is
'成员库成员ID';

comment on column PRIMARYMEMBERSORGTYPE.PRIMARYORGID is
'所属组织ID';

comment on column PRIMARYMEMBERSORGTYPE.ISFOURLEVELPLATFORM is
'是否是四级平台';

comment on column PRIMARYMEMBERSORGTYPE.SEQ is
'排序字段';

CREATE sequence S_earlyWarning
INCREMENT BY 1
START WITH 1
MAXVALUE 9999999999
MINVALUE 1
CACHE 20;

 /*==============================================================*/
/* Table: earlyWarnming   预警时间表	                                        */
/*==============================================================*/
 create table EARLYWARNING(
id          number(10)          not null,
name		VARCHAR2(32)        not null unique,
remindTime	number(2)			not null,
describe 	VARCHAR2(600),
CREATEUSER  VARCHAR2(32)        not null,
UPDATEUSER  VARCHAR2(32),
CREATEDATE  DATE                not null,
UPDATEDATE  DATE,
constraint PKEARLYWARNING primary key (ID)
 );
 comment on table EARLYWARNING
 is '预警提醒时间表';
 comment on column EARLYWARNING.ID
 is '编号';
 comment on column EARLYWARNING.NAME
 is '名称';
 comment on column EARLYWARNING.REMINDTIME
 is '提前几天提醒';
 comment on column EARLYWARNING.DESCRIBE
 is '对当前提醒的描述';
 


insert into EARLYWARNING (ID, NAME, REMINDTIME, DESCRIBE, CREATEUSER, CREATEDATE)
values (S_earlyWarning.Nextval,'rectifyEndDateRemind',2, '矫正人员矫正日期到期预警提前天数', 'admin', sysdate);
 
insert into EARLYWARNING (ID, NAME, REMINDTIME, DESCRIBE, CREATEUSER, CREATEDATE)
values (S_earlyWarning.Nextval,'expectedDatedueRemind',0, '流动人口到期日期预警提前天数', 'admin', sysdate);

----导入日志过期时间
insert into EARLYWARNING (ID, NAME, REMINDTIME, DESCRIBE, CREATEUSER, CREATEDATE)
values (S_earlyWarning.Nextval,'excelImportLogClean',30, '导入日志过期天数', 'admin', sysdate);
insert into EARLYWARNING (ID, NAME, REMINDTIME, DESCRIBE, CREATEUSER, CREATEDATE)
values (S_earlyWarning.Nextval,'platformMessageIndividual',30, '平台消息个人删除天数', 'admin', sysdate);
 
insert into EARLYWARNING (ID, NAME, REMINDTIME, DESCRIBE, CREATEUSER, CREATEDATE)
values (S_earlyWarning.Nextval,'platformMessageDepartment',30, '平台消息部门以及系统消息删除天数', 'admin', sysdate);

commit;

-- Create 创建单位场所基础表主键索引
create sequence s_COMPANYPLACEBASE
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;
commit;
-- Create 创建单位场所基础表
create table COMPANYPLACEBASE
(
  ID               		NUMBER(10) not null,
  ORG            		NUMBER(10) not null,
  ORGINTERNALCODE 		NVARCHAR2(150) not null,
  NAME             		NVARCHAR2(150),
  ATTENTIONEXTENT  		NUMBER(10),
  ADDRESS          		NVARCHAR2(150),
  ISEMPHASIS  			NUMBER(10) default 0,
  ISEMPHASISDATE   		DATE,
  ISEMPHASISREASON 		VARCHAR2(300),
  centerLon          	VARCHAR2(32),
  centerLat		  		VARCHAR2(32),
  centerLon2			VARCHAR2(32),
  centerLat2			VARCHAR2(32),
  featureId		  		VARCHAR2(32),
  buildDataId		  	NUMBER(10),
  SOURCESSTATE     		NUMBER(10),
  PCORMOBILE			NUMBER(10),
  IMGURL           		VARCHAR2(300),
  CREATEUSER       		VARCHAR2(60) not null,
  UPDATEUSER       		VARCHAR2(60),
  CREATEDATE       		DATE not null,
  UPDATEDATE       		DATE,
  constraint PKCOMPANYPLACEBASE primary key (ID)
);
commit;
comment on table COMPANYPLACEBASE
  is '单位场所基础表';
comment on column COMPANYPLACEBASE.ID
  is '主键';
comment on column COMPANYPLACEBASE.ORG
  is '所属网格';
comment on column COMPANYPLACEBASE.ORGINTERNALCODE
  is '内置编码';
comment on column COMPANYPLACEBASE.NAME
  is '名称';
comment on column COMPANYPLACEBASE.ATTENTIONEXTENT
  is '关注度：一般；中等；严重（字典项）';
comment on column COMPANYPLACEBASE.ADDRESS
  is '地址';
comment on column COMPANYPLACEBASE.ISEMPHASIS
  is '是否关注';
comment on column COMPANYPLACEBASE.ISEMPHASISDATE
  is '关注日期';
comment on column COMPANYPLACEBASE.ISEMPHASISREASON
  is '关注原因';
comment on column COMPANYPLACEBASE.centerLon
  is '经度(三维)';
comment on column COMPANYPLACEBASE.centerLat
  is '纬度(三维)';
comment on column COMPANYPLACEBASE.centerLon2
  is '经度(二维)';
comment on column COMPANYPLACEBASE.centerLat2
  is '纬度(二维)';
comment on column COMPANYPLACEBASE.featureId
  is '热点ID';
comment on column COMPANYPLACEBASE.buildDataId
  is '楼宇id';
comment on column COMPANYPLACEBASE.SOURCESSTATE
  is '数据来源(认领，录入)';
comment on column COMPANYPLACEBASE.PCORMOBILE
  is '数据来源(手机，pc)'; 
comment on column COMPANYPLACEBASE.IMGURL
  is '图片路径';  
commit;
----------------------------------------------------------------
-- Create 创建单位场所主键索引
create sequence s_COMPANYPLACE
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;
commit;
-- create 创建单位场所表
  create table COMPANYPLACE
(
  ID               	 	NUMBER(10) not null,		
  BASEID           		NUMBER(10),			
  TYPE              	NUMBER(10),			
  CLASSIFICATION     	NUMBER(10),			
  CLASSIFICATIONEN 	 	NVARCHAR2(150),		
  CATEGORY           	NUMBER(10),			
  USERNAME           	NVARCHAR2(150),			
  MOBILENUMBER       	NVARCHAR2(50),			
  TELEPHONE          	NVARCHAR2(80),			
  FAXNUMBER          	NVARCHAR2(150),			
  AREA               	NVARCHAR2(300),			
  COVEREDAREA        	NUMBER(15,5),			
  REMARKS            	NVARCHAR2(900),			
  HASLICENSE         	NUMBER(10) default 0 ,			
  BUSINESSLICENSENO  	NVARCHAR2(150),			
  ORGCODE            	NVARCHAR2(150),			
  CLOAKROOM          	NVARCHAR2(150),			
  SCALETYPE          	NUMBER(10),			
  PARTYCOUNTNUMBER   	NUMBER(10),			
  networkCardNo 	 	NUMBER(10),		
  REGISTEREDCAPITAL  	NUMBER(15,5),			
  registeredCapitalNo   NUMBER(15,5),			
  BEGINTIME          	DATE,			
  ENDTIME            	DATE,			
  BUSINESSAREA       	NUMBER(15,5),			
  DIGVOLUME          	NUMBER(15,5),			
  FILLVOLUME         	NUMBER(15,5),			
  EMAIL              	NVARCHAR2(150),			
  HOSPITALNATURE     	NUMBER(10),			
  GENERALSTORAGE     	NVARCHAR2(150),			
  GENERALTYPE        	NVARCHAR2(150),			
  FAXNNO             	NVARCHAR2(80),			
  NOWIP              	NVARCHAR2(180),			
  COUNTNO            	NUMBER(10),			
  GENERALMANAGE      	NVARCHAR2(150),			
  GENERALMENTE       	NVARCHAR2(150),			
  FIREAUDITOPINIONNO 	NVARCHAR2(150),			
  INTERNETBARNO      	NVARCHAR2(60),			
  LEGALVICEPRINCIPAL 	NVARCHAR2(60),			
  SCHOOLNATURE       	NUMBER(10),			
  SCHOOLNAMEEN       	NVARCHAR2(200),			
  SCHOOLWEBSITE      	NVARCHAR2(200),			
  ECONOMICNATURE     	NUMBER(10),			
  MANAGEMENTLEVEL    	NUMBER(10),			
  FIRELEVEL          	NUMBER(10),			
  CREATEUSER         	VARCHAR2(60) not null,			
  UPDATEUSER         	VARCHAR2(60),			
  CREATEDATE         	DATE not null,			
  UPDATEDATE         	DATE,			
  constraint PKCOMPANYPLACE primary key (ID)
);
commit;
-- Add comments to the columns 
comment on column COMPANYPLACE.BASEID
  is '基础单位场所ID';
comment on column COMPANYPLACE.TYPE
  is '类型一级(单位，场所)字典项';
comment on column COMPANYPLACE.CLASSIFICATION
  is '分类二级 字典项';
comment on column COMPANYPLACE.CLASSIFICATIONEN
  is '类型(单位、场所)二级 英文 字典项';
comment on column COMPANYPLACE.CATEGORY
  is '类别三级字典项';
comment on column COMPANYPLACE.USERNAME
  is '负责人（校长，法人等）';
comment on column COMPANYPLACE.MOBILENUMBER
  is '联系手机';
comment on column COMPANYPLACE.TELEPHONE
  is '联系电话';
comment on column COMPANYPLACE.FAXNUMBER
  is '传真号码';
comment on column COMPANYPLACE.AREA
  is '通用字段：所在区域（主管单位，通道口、施工单位、周边情况、所属单位、副本许可范围、经营范围、所在派出所、主管单位）';
comment on column COMPANYPLACE.COVEREDAREA
  is '面积（占地面积，施工面积）';
comment on column COMPANYPLACE.REMARKS
  is '备注';
comment on column COMPANYPLACE.HASLICENSE
  is '是否有证照（0：无，1：有）';
comment on column COMPANYPLACE.BUSINESSLICENSENO
  is '营业执照号码';
comment on column COMPANYPLACE.ORGCODE
  is '组织机构码';
comment on column COMPANYPLACE.CLOAKROOM
  is '小件寄存处';
comment on column COMPANYPLACE.SCALETYPE
  is '规模类型（规上，规下 字典项）';
comment on column COMPANYPLACE.PARTYCOUNTNUMBER
  is '通用字段（党员数，临时上网卡数）';
comment on column COMPANYPLACE.networkCardNo
  is '临时上网卡数';
comment on column COMPANYPLACE.REGISTEREDCAPITAL
  is '注册资金';
comment on column COMPANYPLACE.registeredCapitalNo
  is '注册资本'; 
comment on column COMPANYPLACE.BEGINTIME
  is '开始时间（施工，注册）';
comment on column COMPANYPLACE.ENDTIME
  is '结束时间（施工，注册）';
comment on column COMPANYPLACE.BUSINESSAREA
  is '营业面积（平方米 ）';
comment on column COMPANYPLACE.DIGVOLUME
  is '施工挖方量（立方米）';
comment on column COMPANYPLACE.FILLVOLUME
  is '施工填方量（立方米）';
comment on column COMPANYPLACE.EMAIL
  is '电子邮件';
comment on column COMPANYPLACE.HOSPITALNATURE
  is '医院性质（公立，私立，合资，外资，其他 字典项）';
comment on column COMPANYPLACE.GENERALSTORAGE
  is '通用字段（存储设备，注册地址，接入方式）';
comment on column COMPANYPLACE.GENERALTYPE
  is '通用字段（货物类别，宽带接入方式）';
comment on column COMPANYPLACE.FAXNNO
  is '传真号码2（）';
comment on column COMPANYPLACE.NOWIP
  is '现在使用IP';
comment on column COMPANYPLACE.COUNTNO
  is '通用字段（电脑台数，从业人数）';
comment on column COMPANYPLACE.GENERALMANAGE
  is '通用字段（网络文化经营许可证号，主管部门）';
comment on column COMPANYPLACE.GENERALMENTE
  is '通用字段（网络安全审核意见书号，管理部门）';
comment on column COMPANYPLACE.FIREAUDITOPINIONNO
  is '消防审核意见书号';
comment on column COMPANYPLACE.INTERNETBARNO
  is '网吧编号';
comment on column COMPANYPLACE.LEGALVICEPRINCIPAL
  is '法制副校长';
comment on column COMPANYPLACE.SCHOOLNATURE
  is '学校性质（0公办，1民办，2其他 字典项）';
comment on column COMPANYPLACE.SCHOOLNAMEEN
  is '学校英文名称';
comment on column COMPANYPLACE.SCHOOLWEBSITE
  is '学校网址';
comment on column COMPANYPLACE.ECONOMICNATURE
  is '经济性质（0：非公司企业法人，1：）[字典？]';
comment on column COMPANYPLACE.MANAGEMENTLEVEL
  is '管理等级（0：A，1：B，2：C）';
comment on column COMPANYPLACE.FIRELEVEL
  is '消防等级（1：一级…………）';
commit;
 ------------------------------------------------------
--创建单位场所业务表索引
create sequence s_COMPANYPLACEBUSINESS
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;
commit;
-- Create 创建单位场所业务表
create table COMPANYPLACEBUSINESS
(
  ID                   NUMBER(10),
  COMPANYPLACEID	   NUMBER(10),
  ISKEYTYPE            NUMBER(10),
  HIDDANGERINFO        NVARCHAR2(300),
  CORRECTIONINFO       NVARCHAR2(300),
  LISTEDCORRECTION     NUMBER(10),
  LISTEDLEVE           NUMBER(10),
  CORRECTIONBEIGINDATE DATE,
  CORRECTIONENDDATE    DATE,
  EFFECTASSESSMENT     NUMBER(10),
  POLLUTIONTYPE        NUMBER(10),
  POLLUTIONINFO        NVARCHAR2(300),
  CREATEUSER           VARCHAR2(60) not null,
  UPDATEUSER           VARCHAR2(60),
  CREATEDATE           DATE not null,
  UPDATEDATE           DATE ,
 constraint PKCOMPANYPLACEBUSINESS primary key (ID)
);
commit;
-- Add comments to the table 
comment on table COMPANYPLACEBUSINESS
  is '单位场所业务表';
-- Add comments to the columns 
comment on column COMPANYPLACEBUSINESS.ID
  is '业务ID';
COMMENT ON COLUMN companyplacebusiness.companyplaceid IS '单位场所表（companyplace）ID';
comment on column COMPANYPLACEBUSINESS.ISKEYTYPE
  is '是否安全生产重点（是否消防安全重点、是否治安重点、是否染污源）';
comment on column COMPANYPLACEBUSINESS.HIDDANGERINFO
  is '隐患情况';
comment on column COMPANYPLACEBUSINESS.CORRECTIONINFO
  is '隐患整改情况';
comment on column COMPANYPLACEBUSINESS.LISTEDCORRECTION
  is '挂牌整治（单选   0：省，1：市，2：县）';
comment on column COMPANYPLACEBUSINESS.LISTEDLEVE
  is '挂牌等级（下拉   0：黄牌，1：红牌）';
comment on column COMPANYPLACEBUSINESS.CORRECTIONBEIGINDATE
  is '整改开始时间';
comment on column COMPANYPLACEBUSINESS.CORRECTIONENDDATE
  is '整改结束时间';
comment on column COMPANYPLACEBUSINESS.EFFECTASSESSMENT
  is '效果评估（下拉：0：好，1：较好，2：差，3：较差）';
comment on column COMPANYPLACEBUSINESS.POLLUTIONTYPE
  is '污染类型（下拉：字典项）';
comment on column COMPANYPLACEBUSINESS.POLLUTIONINFO
  is '污染情况';
commit;
create index IDX_BUSSINESS_COMPANYPLACEID on companyplacebusiness (companyplaceid);
----单位场所基础表组织机构id索引
create index idx_companyplacebase_org on companyplacebase(org);
-----单位场所表baseid索引
create index idx_companyplace_baseid on companyplace(baseid);
-----单位场所表英文标识索引
create index idx_classificationen on companyplace(classificationen);
-----单位场所规模企业标识索引
create index idx_companyplace_scaletype on companyplace(scaletype);
-----单位场所业务类型索引
create index idx_iskeytype on companyplacebusiness(iskeytype);
------------------------------------------------------------
-- Create 单位场所信息与业务关联表
create table COMPANYPLACEBUSINESSRELATION
(
  BASEID        NUMBER(10),
  BUSINESSID    NUMBER(10)
);
commit;
-- Add comments to the columns 
comment on column COMPANYPLACEBUSINESSRELATION.BASEID
  is '基础信息ID';
comment on column COMPANYPLACEBUSINESSRELATION.BUSINESSID
  is '业务表ID';
commit;
 ------------------------------------------------------
--创建单位场所业务表索引
create sequence s_COMPANYPLACEANNEX
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;
commit;
-- Create 创建附件表
create table COMPANYPLACEANNEX
(
  ID            number(10),
  BUSINESSID    NUMBER(10),
  FILENAME 		NVARCHAR2(150),
  ANNEXADDRESS  NVARCHAR2(500),
  CREATEUSER    VARCHAR2(60) not null,
  UPDATEUSER    VARCHAR2(60),
  CREATEDATE    DATE not null,
  UPDATEDATE    DATE,
  constraint PKCOMPANYPLACEANNEX primary key (ID)
);
commit;
-- Add comments to the table 
comment on table COMPANYPLACEANNEX
  is '单位场所附件表';
-- Add comments to the columns 
comment on column COMPANYPLACEANNEX.BUSINESSID
  is '业务信息ID';
comment on column COMPANYPLACEANNEX.ANNEXADDRESS
  is '附件地址';
commit;


/*==============================================================*/
/* 四肢队伍表                                 */
/*==============================================================*/
create table FOURTEAMS  (
   ID                   NUMBER(10)                      not null,
   ORGID                NUMBER(10),
   ORGCODE				VARCHAR2(32),
   NAMES                VARCHAR2(100)                    not null,
   FULLPINYIN           VARCHAR2(30)                    not null,
   SIMPLEPINYIN         VARCHAR2(10)                    not null,
   INDEXID              NUMBER(10),
   PARENTTEAMID			NUMBER(10),
   SUBTEAMNUMBER        NUMBER(10)          default 0,
   MEMBERNUMBER         NUMBER(10)  default 0,
   TEAMTYPE        VARCHAR2(32),
   COMMENTS        VARCHAR2(300),
   DEPARTEMENTID    NUMBER(10),
   DEPARTEMENTNAME VARCHAR2(100),
   CREATEUSER           VARCHAR2(32)                    not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                            not null,
   UPDATEDATE           DATE,
   COMPETENTDEPARTMENT  NUMBER(10),
   SERVICEAREA       VARCHAR2(300),
   constraint PKFOURTEAMS primary key (ID)
);

comment on table FOURTEAMS is
'四支队伍表';

comment on column FOURTEAMS.ID is
'父队伍号';

comment on column FOURTEAMS.ORGID is
'网格ID';

comment on column FOURTEAMS.ORGCODE is
'所属网格编号';

comment on column FOURTEAMS.NAMES is
'队伍名';

comment on column FOURTEAMS.FULLPINYIN is
'队伍名全拼';

comment on column FOURTEAMS.SIMPLEPINYIN is
'队伍名简拼';

comment on column FOURTEAMS.INDEXID is
'排序号';

comment on column FOURTEAMS.SUBTEAMNUMBER is
'子队伍数';

comment on column FOURTEAMS.MEMBERNUMBER is
'成员数';

comment on column FOURTEAMS.TEAMTYPE is
'队伍类型';

comment on column FOURTEAMS.COMMENTS is
'备注';

create sequence S_FOURTEAMS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

 /*==============================================================*/
/* 队伍成员表                                    */
/*==============================================================*/
create table FOURTEAMMEMBERS  (
   ID                   NUMBER(10)                      not null,
   ORGID                NUMBER(10),
   ORGCODE        VARCHAR2(32),
   SERVICENAME    VARCHAR2(90)        					not null,
   NAMES                 VARCHAR2(32)                    not null,
   FULLPINYIN           VARCHAR2(30)                    not null,
   SIMPLEPINYIN         VARCHAR2(10)                    not null,
   TEAMID        NUMBER(10)                      not null,
   DUTY              VARCHAR2(100),
   GENDER               NUMBER(10)                      default 3 not null,
   BIRTHDAY             DATE,
   MOBILE               VARCHAR2(20),
   TELEPHONE            VARCHAR2(20),
   SPECIALTY            VARCHAR2(60),
   ORGADMINNAME         VARCHAR2(20),
   POLITICS             NUMBER(10),
   ORGADMINTELEPHONE    VARCHAR2(20),
   COMMENTS        VARCHAR2(300),
   CREATEUSER           VARCHAR2(32)                    not null,
   UPDATEUSER           VARCHAR2(32),
   CREATEDATE           DATE                            not null,
   UPDATEDATE           DATE,
   MEMBERDEPARTEMENT	VARCHAR2(300),
   constraint PKFOURTEAMMEMBERS primary key (ID)
);

comment on table FOURTEAMMEMBERS is
'四支队伍成员表';

comment on column FOURTEAMMEMBERS.ORGID is
'网格ID';

comment on column FOURTEAMMEMBERS.ORGCODE is
'所属网格编号';

comment on column FOURTEAMMEMBERS.NAMES is
'成员名';

comment on column FOURTEAMMEMBERS.FULLPINYIN is
'成员名全拼';

comment on column FOURTEAMMEMBERS.SIMPLEPINYIN is
'成员名简拼';

comment on column FOURTEAMMEMBERS.TEAMID is
'队伍号';

comment on column FOURTEAMMEMBERS.DUTY is
'职务';

comment on column FOURTEAMMEMBERS.GENDER is
'性别';

comment on column FOURTEAMMEMBERS.BIRTHDAY is
'出生年月';

comment on column FOURTEAMMEMBERS.MOBILE is
'手机号';

comment on column FOURTEAMMEMBERS.TELEPHONE is
'电话号';

comment on column FOURTEAMMEMBERS.SPECIALTY is
'特长';

comment on column FOURTEAMMEMBERS.ORGADMINNAME is
'网格管理员名';

comment on column FOURTEAMMEMBERS.POLITICS is
'政治面貌';

comment on column FOURTEAMMEMBERS.ORGADMINTELEPHONE is
'网格管理员电话号';

comment on column FOURTEAMMEMBERS.COMMENTS is
'备注';

create sequence S_FOURTEAMMEMBERS
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;


insert into FOURTEAMS(ID,ORGID,ORGCODE,NAMES,FULLPINYIN,SIMPLEPINYIN,INDEXID,PARENTTEAMID,SUBTEAMNUMBER,MEMBERNUMBER,TEAMTYPE,COMMENTS,CREATEUSER,UPDATEUSER,
CREATEDATE,UPDATEDATE)values(S_FOURTEAMS.NEXTVAL,1,'.','基层便民专业化服务队','jicengbianminzhuanyehuafuwudui','jcbmzyhfwd',1,0,0,0,'convenienceServiceTeam',
'基层便民专业化服务队','admin',null,SYSDATE,null);
   
   
   
insert into FOURTEAMS(ID,ORGID,ORGCODE,NAMES,FULLPINYIN,SIMPLEPINYIN,INDEXID,PARENTTEAMID,SUBTEAMNUMBER,MEMBERNUMBER,TEAMTYPE,COMMENTS,CREATEUSER,UPDATEUSER,
   CREATEDATE,UPDATEDATE)values(S_FOURTEAMS.NEXTVAL,1,'.','网格员服务队','cunwanggeyuanfuwudui','cwgyfwd',2,0,0,0,'gridServiceTeam', '网格员服务队', 'admin',
   null,SYSDATE,null);
   
   insert into FOURTEAMS(ID,ORGID, ORGCODE, NAMES,FULLPINYIN,SIMPLEPINYIN,INDEXID,PARENTTEAMID,SUBTEAMNUMBER,MEMBERNUMBER,TEAMTYPE,COMMENTS,CREATEUSER,UPDATEUSER,
   CREATEDATE, UPDATEDATE)values(S_FOURTEAMS.NEXTVAL, 1,'.','党员先锋服务队','dangyuanxianfengfuwudui', 'dyxffwd', 3, 0, 0, 0, 'partyMemberPioneerServiceTeam',
   '党员先锋服务队', 'admin', null, SYSDATE, null);


   insert into FOURTEAMS(ID, ORGID, ORGCODE, NAMES, FULLPINYIN, SIMPLEPINYIN, INDEXID, PARENTTEAMID, SUBTEAMNUMBER, MEMBERNUMBER, TEAMTYPE, COMMENTS, CREATEUSER,
   UPDATEUSER, CREATEDATE, UPDATEDATE)values
  (S_FOURTEAMS.NEXTVAL, 1,  '.', '社会志愿者服务队', 'shehuizhiyuanzhefuwudui', 'shzyzfwd', 4, 0, 0, 0, 'communityVolunteerServiceTeam', '社会志愿者服务队',
   'admin', null, SYSDATE, null);
   
   commit;

-- Create sequence
create sequence s_fourTeamsOrg
increment by 1
start with 9
maxvalue 9999999999
minvalue 1
cache 20;
commit;


--创建四支队伍组织机构的表
-- Create table
create table fourTeamsOrg
(
  id                  number(10),
  organization        NUMBER(10),
  ORGINTERNALCODE 		NVARCHAR2(150),
  parentid       number(10),
  leve           number(5),
  levesort       number(5),
  teamTitle      varchar2(60),
  username       varchar2(60),
  Position       varchar2(60),
  phonenumber    varchar2(60),
  headimage      varchar2(300),
  CREATEUSER     VARCHAR2(32),
  UPDATEUSER     VARCHAR2(32),
  CREATEDATE     DATE not null,
  UPDATEDATE     DATE,
  constraint PKfourTeamsOrg primary key (ID)
);
commit ;
-- Add comments to the table 
comment on table fourTeamsOrg
  is '四支队伍组织机构';
-- Add comments to the columns 
comment on column fourTeamsOrg.id
  is '主键ID';
comment on column fourTeamsOrg.organization
  is '组织机构';
comment on column fourTeamsOrg.ORGINTERNALCODE
  is '组织机构内置代码';
comment on column fourTeamsOrg.parentid
  is '父节点';
comment on column fourTeamsOrg.leve
  is '层级(1，2，3)';
comment on column fourTeamsOrg.leveSort
  is '排序';
comment on column fourTeamsOrg.teamTitle
  is '队伍标题';
comment on column fourTeamsOrg.username
  is '成员姓名';
comment on column fourTeamsOrg.Position
  is '职务';
comment on column fourTeamsOrg.phonenumber
  is '电话';
comment on column fourTeamsOrg.headimage
  is '图像';
commit ;
--添加默认数据
insert into Fourteamsorg (ID, PARENTID, LEVE, LEVESORT, TEAMTITLE, USERNAME, POSITION, PHONENUMBER, HEADIMAGE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
values (1, null, 1, 1, '', '', '', '', '', '', '', sysdate, null);

insert into Fourteamsorg (ID, PARENTID, LEVE, LEVESORT, TEAMTITLE, USERNAME, POSITION, PHONENUMBER, HEADIMAGE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
values (2, 1, 2, 1, '', '', '', '', '', '', '',sysdate, null);

insert into Fourteamsorg (ID, PARENTID, LEVE, LEVESORT, TEAMTITLE, USERNAME, POSITION, PHONENUMBER, HEADIMAGE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
values (3, 1, 2, 2, '', '', '', '', '', '', '', sysdate, null);

insert into Fourteamsorg (ID, PARENTID, LEVE, LEVESORT, TEAMTITLE, USERNAME, POSITION, PHONENUMBER, HEADIMAGE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
values (4, 1, 2, 3, '', '', '', '', '', '', '',sysdate, null);

insert into Fourteamsorg (ID, PARENTID, LEVE, LEVESORT, TEAMTITLE, USERNAME, POSITION, PHONENUMBER, HEADIMAGE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
values (5, 1, 2, 4, '', '', '', '', '', '', '',sysdate, null);

insert into Fourteamsorg (ID, PARENTID, LEVE, LEVESORT, TEAMTITLE, USERNAME, POSITION, PHONENUMBER, HEADIMAGE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
values (6, 2, 3, 1, '', '', '', '', '', '', '', sysdate, null);

insert into Fourteamsorg (ID, PARENTID, LEVE, LEVESORT, TEAMTITLE, USERNAME, POSITION, PHONENUMBER, HEADIMAGE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
values (7, 3, 3, 2, '', '', '', '', '', '', '', sysdate, null);

insert into Fourteamsorg (ID, PARENTID, LEVE, LEVESORT, TEAMTITLE, USERNAME, POSITION, PHONENUMBER, HEADIMAGE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
values (8, 4, 3, 3, '', '', '', '', '', '', '', sysdate, null);

insert into Fourteamsorg (ID, PARENTID, LEVE, LEVESORT, TEAMTITLE, USERNAME, POSITION, PHONENUMBER, HEADIMAGE, CREATEUSER, UPDATEUSER, CREATEDATE, UPDATEDATE)
values (9, 5, 3, 4, '', '', '', '', '', '', '', sysdate, null);

commit;

--临时附件存放表序列
create sequence S_SYS_ATTACHMENT
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--临时附件存放表
create table SYS_ATTACHMENT
(
  ID                    NUMBER not null,
  FILE_NAME             VARCHAR2(100),
  FILE_PATH             VARCHAR2(512),
  TARGET_TYPE           VARCHAR2(30),
  TARGET_ID             NUMBER,
  FILE_TYPE             VARCHAR2(30),
  REAL_NAME             VARCHAR2(100),
  CREATE_USER           VARCHAR2(32),
  UPDATE_USER           VARCHAR2(32),
  UPDATE_DATE           DATE,
  CREATE_DATE           DATE
);
-- Add comments to the columns 
comment on column SYS_ATTACHMENT.FILE_NAME
  is '实际保存文件名';
comment on column SYS_ATTACHMENT.FILE_PATH
  is '实际保存路径';
comment on column SYS_ATTACHMENT.TARGET_TYPE
  is '附件所属模块';
  comment on column SYS_ATTACHMENT.TARGET_ID
  is '目标类型，附件关联的目标ID';
comment on column SYS_ATTACHMENT.FILE_TYPE
  is '文件类型 .doc,.txt,avi...';
comment on column SYS_ATTACHMENT.REAL_NAME
  is '原文件名';
comment on column SYS_ATTACHMENT.CREATE_USER
  is '创建用户';
comment on column SYS_ATTACHMENT.UPDATE_USER
  is '更新用户名';
comment on column SYS_ATTACHMENT.UPDATE_DATE
  is '更新用户';
comment on column SYS_ATTACHMENT.CREATE_DATE
  is '创建日期';
  
commit ;


--四级平台添加管理部门字段 只针对县级
ALTER TABLE fourLevelPlatform ADD (supervisorydepartment   VARCHAR2(90));

----事件对接Joint
---- Create sequence 事件表
create sequence s_issueJoints
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
-- Create sequence 日志表
create sequence S_issueJointLogs
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
---- Create sequence步骤表
create sequence s_issueJointSteps
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20;
-- Create sequence修改身份证日志表
create sequence s_updateIdcardNoLogs
increment by 1
start with 1
 maxvalue 9999999999
 minvalue 1
 cache 20; 
 
 ---- Create table 事件表
create table issueJoints
(
  id                    number(10) not null,
  serialnumber          varchar2(30) not null,
  subject               varchar2(150) not null,
  maincharacters		varchar2(60) not null,
  mobile				varchar2(60),
  telephone				varchar2(60),
  occurorg              number(10) not null,
  occurorginternalcode  varchar2(32) not null,
  createorg             number(10) not null,
  createorginternalcode varchar2(32) not null,
  lastorg               number(10),
  lastorginternalcode   varchar2(32),
  issuekind             number(10),
  issueJointType		number(10),
  issueJointTypeSub		number(10),
  relatepeoplecount     number(10),
  lastusername          varchar2(60),
  occurlocation         varchar2(150),
  status                varchar2(60),
  occurdate             date not null,
  hours                 varchar2(5),
  minute                varchar2(5),
  issuecontent          clob,
  importantplace        number(1),
  createuser            varchar2(32) not null,
  updateuser            varchar2(32),
  createdate            date not null,
  updatedate            date,
  feedbackTime			date,
  lastDealTime			date,
  dealUserName			varchar2(60),
  dealMobile			varchar2(60),
  dealContent			clob,
  impDate				date not null,
  constraint pkissueJoints primary key (id),
  constraint fkissueJointsOrg foreign key (occurOrg) references organizations (id)
);
-- add comments to the table 
comment on table issuejoints
  is '事件表';
-- add comments to the columns 
comment on column issuejoints.id
  is '事件id';
comment on column issuejoints.serialnumber
  is '事件的服务单号';
comment on column issuejoints.subject
  is '主题';
comment on column issuejoints.maincharacters
  is '主要当事人';
comment on column issuejoints.mobile
  is '主要当事人手机';
comment on column issuejoints.telephone
  is '主要当事人电话';
comment on column issuejoints.occurorg
  is '事件发生网格id';
comment on column issuejoints.occurorginternalcode
  is '发生网格内置编码';
comment on column issuejoints.createorg
  is '创建网格id';
comment on column issuejoints.createorginternalcode
  is '创建网格内置编码';
comment on column issuejoints.lastorg
  is '最后操作网格id';
comment on column issuejoints.lastorginternalcode
  is '最后操作网格内置编码';
comment on column issuejoints.issuekind
  is '事件性质';
comment on column issuejoints.issueJointType
  is '事件类别（大类）';
comment on column issuejoints.issueJointTypeSub
  is '事件类别（子类）';
comment on column issuejoints.relatepeoplecount
  is '涉及人数';
comment on column issuejoints.lastusername
  is '最后操作用户名称';
comment on column issuejoints.occurlocation
  is '发生地';  
comment on column issuejoints.status
  is '状态';
comment on column issuejoints.occurdate
  is '发生时间';
comment on column issuejoints.hours
  is '小时';
comment on column issuejoints.minute
  is '分钟';
comment on column issuejoints.issuecontent
  is '事件简述';  
comment on column issuejoints.importantplace
  is '是否重点场所';
comment on column issuejoints.feedbackTime
  is '冗余字段反馈时间';
comment on column issuejoints.lastDealTime
  is '冗余字段最后处理时间';
comment on column issuejoints.dealContent
  is '冗余字段处理意见';
comment on column issuejoints.dealUserName
  is '冗余字段处理用户名称';
comment on column issuejoints.dealMobile
  is '冗余字段处理人电话';
comment on column issuejoints.impDate
  is '冗余字段导入时间';

  
--- Create table 日志表
create table issueJointLogs
(
  id                   number(10) not null,
  issueid              number(10) not null,
  dealorgid            number(10) not null,
  dealtype             number(4),
  dealorginternalcode  varchar2(32),
  dealusername         varchar2(60) not null,
  mobile               varchar2(15),
  dealdescription      varchar2(600),
  createuser           varchar2(60) not null,
  updateuser           varchar2(60),
  dealtime             date not null,
  createdate           date not null,
  updatedate           date,
  content              clob,
  stepid               number(10),
  constraint PKissueJointLogs primary key (ID)
);
--- add comments to the table 
comment on table issuejointlogs
  is '事件处理日志表';
--- add comments to the columns 
comment on column issuejointlogs.issueid
  is '服务办事编号';
comment on column issuejointlogs.dealorgid
  is '处理部门编号';
comment on column issuejointlogs.dealtype
  is '处理类型';
comment on column issuejointlogs.dealorginternalcode
  is '处理部门内部编号';
comment on column issuejointlogs.dealusername
  is '处理用户';
comment on column issuejointlogs.mobile
  is '处理人手机';
comment on column issuejointlogs.dealdescription
  is '处理描述';
comment on column issuejointlogs.createuser
  is '创建人';
comment on column issuejointlogs.updateuser
  is '修改人';
comment on column issuejointlogs.dealtime
  is '处理时间';
comment on column issuejointlogs.createdate
  is '创建时间';
comment on column issuejointlogs.updatedate
  is '修改时间';
comment on column issuejointlogs.content
  is '内容';
comment on column issuejointlogs.stepid
  is '处理步骤id';
-----index
create index indexissuejointlogsissueid on issuejointlogs (issueid);

-- Create table 步骤表
create table issueJointSteps
(
  id                 number(10) not null,
  source             number(10) not null,
  sourceinternalcode varchar2(32) not null,
  target             number(10) not null,
  targetinternalcode varchar2(32) not null,
  entrydate          date,
  enddate            date,
  lastdealdate       date,
  statecode          number(10) not null,
  issue              number(10) not null,
  createuser         varchar2(32) not null,
  updateuser         varchar2(32),
  createdate         date not null,
  updatedate         date,
  constraint PKissueJointSteps primary key (ID)
);
-- add comments to the table 
comment on table issuejointsteps
  is '事件处理步骤表';
-- add comments to the columns 
comment on column issuejointsteps.id
  is '处理步骤id';
comment on column issuejointsteps.source
  is '该步骤来源部门id';
comment on column issuejointsteps.sourceinternalcode
  is '该步骤来源部门orgcode';
comment on column issuejointsteps.target
  is '该步骤的目标处理部门';
comment on column issuejointsteps.entrydate
  is '进入该处理部门的时间';
comment on column issuejointsteps.enddate
  is '该步骤的结束时间';
comment on column issuejointsteps.lastdealdate
  is '该步骤上一次处理的时间';
comment on column issuejointsteps.statecode
  is '该步骤状态码';
comment on column issuejointsteps.issue
  is '该步骤所属事件的id';
-- Create table 修改身份证日志表
create table updateIdcardNoLogs
(
  id                 number(10) not null,
  dataOrgId          number(10) not null,
  dataInternalcode 	 varchar2(32) not null,
  dataId			 number(10) not null,
  dataType			 varchar2(60) not null,
  dataBeforeOperate  varchar2(60) not null,
  dataAfterOperate	 varchar2(60) not null,
  operateUser        varchar2(60) not null,
  operateDate		 date not null,
  createuser         varchar2(32) not null,
  updateuser         varchar2(32),
  createdate         date not null,
  updatedate         date,
  constraint PKupdateIdcardNoLogs primary key (ID)
);
-- add comments to the table 
comment on table updateIdcardNoLogs
  is '修改身份证日志表';
-- add comments to the columns 
comment on column updateIdcardNoLogs.id
  is '修改身份证日志id';
comment on column updateIdcardNoLogs.dataOrgId
  is '被修改的数据的组织机构id';
comment on column updateIdcardNoLogs.dataInternalcode
  is '被修改的数据的组织机构组织机构编码';
comment on column updateIdcardNoLogs.dataId
  is '被修改的数据的id';
comment on column updateIdcardNoLogs.dataType
  is '被修改的数据的类型';
comment on column updateIdcardNoLogs.dataBeforeOperate
  is '被修改前身份证号码';
comment on column updateIdcardNoLogs.dataAfterOperate
  is '被修改后身份证号码';
comment on column updateIdcardNoLogs.operateUser
  is '修改身份证号码的用户';
comment on column updateIdcardNoLogs.operateDate
  is '修改身份证号码的时间';

    
----删除实有人口重复数据记录
-- Create sequence 删除实口记录
create sequence s_poepleDuplicateRemovalLogs
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--- Create table 删除实口记录证日志表
create table poepleDuplicateRemovalLogs
(
  id                 number(10) not null,
  dataOrgId          number(10),
  dataInternalcode 	 varchar2(32), 
  dataId			 number(10) not null,
  idcardNo  		 varchar2(60) not null,
  name				 varchar2(60),
  dataType			 varchar2(60) not null,
  baseInfoId			 number(10) not null,
  actualId			 number(10),
  actualType		 varchar2(32),
  populationType	 varchar2(32),
  operateType		 varchar2(32) not null,
  operateDate		 date not null,
  baseInfo			 clob,
  constraint PKpoepleDuplicateRemovalLogs primary key (ID)
);
-- add comments to the table 
comment on table poepleDuplicateRemovalLogs
  is '删除实口记录证日志表';
-- add comments to the columns 
comment on column poepleDuplicateRemovalLogs.id
  is '删除实口记录证日志id';
comment on column poepleDuplicateRemovalLogs.dataOrgId
  is '数据的所在组织机构id';
comment on column poepleDuplicateRemovalLogs.dataInternalcode
  is '数据的所在组织机构编码';
comment on column poepleDuplicateRemovalLogs.dataId
  is '数据的id';
comment on column poepleDuplicateRemovalLogs.idcardNo
  is '数据身份证号码';
comment on column poepleDuplicateRemovalLogs.name
  is '数据的姓名';
comment on column poepleDuplicateRemovalLogs.dataType
  is '数据的类型(对应的表名称)';
comment on column poepleDuplicateRemovalLogs.baseInfoId
  is '数据所对应的baseid';
comment on column poepleDuplicateRemovalLogs.actualId
  is '数据所对应的实口id户籍、流动（针对业务人员）';
comment on column poepleDuplicateRemovalLogs.actualType
  is '数据所对应的实口类型';
comment on column poepleDuplicateRemovalLogs.populationType
  is '数据所对应的业务人员类型';
comment on column poepleDuplicateRemovalLogs.operateType
  is '数据所对应的的操作类型（update,reader,delete,error）';
comment on column poepleDuplicateRemovalLogs.operateDate
  is '修改身份证号码的时间';
comment on column poepleDuplicateRemovalLogs.baseInfo
  is '对应删除baseinfo操作的备份记录的json记录';
commit;
---单位场所研判分析历史记录表
create sequence s_statisticCompanyPlaceHistory
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;
commit;
--创建组织机构历史数据表序列
create sequence S_PRIMARYORGANIZATIONSTYPE
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;




--实有人口FXJ模块序列和表
--F人员表序列
create sequence S_FPERSONNEL
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--F人员表
create table FPERSONNELS
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   FERRETOUTDATE        DATE,
   BUSINESSREMARK       VARCHAR2(300),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PK_FPERSONNELS primary key (ID)
);

comment on table FPERSONNELS is
'F人员信息';
comment on column FPERSONNELS.ID is
'人员id';
comment on column FPERSONNELS.ORGID is
'所属网格';
comment on column FPERSONNELS.ORGINTERNALCODE is
'所属责任区编号';
comment on column FPERSONNELS.FERRETOUTDATE is
'查获日期';
comment on column FPERSONNELS.BUSINESSREMARK is
'业务备注';
comment on column FPERSONNELS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';
comment on column FPERSONNELS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';
comment on column FPERSONNELS.ISEMPHASIS is
'是否关注';
comment on column FPERSONNELS.CREATEUSER is
'创建用户';
comment on column FPERSONNELS.CREATEDATE is
'创建日期';
comment on column FPERSONNELS.UPDATEUSER is
'修改用户';
comment on column FPERSONNELS.UPDATEDATE is
'修改时间';

/*==============================================================*/
/* index: index_fp_orgcodeIsemphasis                           */
/*==============================================================*/

create index index_fp_orgcodeIsemphasis on FPERSONNELS (ORGINTERNALCODE, ISEMPHASIS);
create index IDX_F_BASEINFOID on FPERSONNELS (BASEINFOID);
create index IDX_F_ADSID on FPERSONNELS (ADDRESSINFOID);

--Q人员表序列
create sequence S_QPERSONNEL
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--Q人员表
create table QPERSONNELS
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   FERRETOUTDATE        DATE,
   BUSINESSREMARK       VARCHAR2(300),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PK_QPERSONNELS primary key (ID)
);

comment on table QPERSONNELS is
'Q人员信息';
comment on column QPERSONNELS.ID is
'人员id';
comment on column QPERSONNELS.ORGID is
'所属网格';
comment on column QPERSONNELS.ORGINTERNALCODE is
'所属责任区编号';
comment on column QPERSONNELS.FERRETOUTDATE is
'查获日期';
comment on column QPERSONNELS.BUSINESSREMARK is
'业务备注';
comment on column QPERSONNELS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';
comment on column QPERSONNELS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';
comment on column QPERSONNELS.ISEMPHASIS is
'是否关注';
comment on column QPERSONNELS.CREATEUSER is
'创建用户';
comment on column QPERSONNELS.CREATEDATE is
'创建日期';
comment on column QPERSONNELS.UPDATEUSER is
'修改用户';
comment on column QPERSONNELS.UPDATEDATE is
'修改时间';
/*==============================================================*/
/* index: index_qp_orgcodeIsemphasis                           */
/*==============================================================*/

create index index_qp_orgcodeIsemphasis on QPERSONNELS (ORGINTERNALCODE, ISEMPHASIS);
create index IDX_Q_BASEINFOID on QPERSONNELS (BASEINFOID);
create index IDX_Q_ADSID on QPERSONNELS (ADDRESSINFOID);

--M人员表序列
create sequence S_MPERSONNEL
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--M人员表
create table MPERSONNELS
(
   ID                   NUMBER(10)           not null,
   BASEINFOID           NUMBER(10),
   ADDRESSINFOID        NUMBER(10),
   ORGID                NUMBER(10)           not null,
   ORGINTERNALCODE      VARCHAR2(32)         not null,
   FERRETOUTDATE        DATE,
   BUSINESSREMARK       VARCHAR2(300),
   SOURCESSTATE         NUMBER(1)            default 1,
   ATTENTIONEXTENT      NUMBER(10),
   ISEMPHASIS           NUMBER(1)            default 0,
   ISEMPHASISREASON     VARCHAR2(300),
   ISEMPHASISDATE       DATE,
   CREATEUSER           VARCHAR2(32)         not null,
   CREATEDATE           DATE                 not null,
   UPDATEUSER           VARCHAR2(32),
   UPDATEDATE           DATE,
   constraint PK_MPERSONNELS primary key (ID)
);

comment on table MPERSONNELS is
'M人员信息';
comment on column MPERSONNELS.ID is
'人员id';
comment on column MPERSONNELS.ORGID is
'所属网格';
comment on column MPERSONNELS.ORGINTERNALCODE is
'所属责任区编号';
comment on column MPERSONNELS.FERRETOUTDATE is
'查获日期';
comment on column MPERSONNELS.BUSINESSREMARK is
'业务备注';
comment on column MPERSONNELS.SOURCESSTATE is
'数据来源：1.录入；2.认领；3.已核实';
comment on column MPERSONNELS.ATTENTIONEXTENT is
'关注程度：1.一般；2.中等；3.严重';
comment on column MPERSONNELS.ISEMPHASIS is
'是否关注';
comment on column MPERSONNELS.CREATEUSER is
'创建用户';
comment on column MPERSONNELS.CREATEDATE is
'创建日期';
comment on column MPERSONNELS.UPDATEUSER is
'修改用户';
comment on column MPERSONNELS.UPDATEDATE is
'修改时间';

/*==============================================================*/
/* index: index_mp_orgcodeIsemphasis                           */
/*==============================================================*/
create index index_mp_orgcodeIsemphasis on MPERSONNELS (ORGINTERNALCODE, ISEMPHASIS);
create index IDX_M_BASEINFOID on MPERSONNELS (BASEINFOID);
create index IDX_M_ADSID on MPERSONNELS (ADDRESSINFOID);


--用户签到序列
create sequence S_USERSIGN
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--用户签到表
create table USERSIGN
(
   ID               NUMBER(10)  not null,
   USERID           NUMBER(10)  not null,
   CREATEDATE       DATE        not null,
   constraint PK_USERSIGN primary key (ID)
);

comment on table USERSIGN is
'用户签到表';
comment on column USERSIGN.ID is
'签到表id';
comment on column USERSIGN.USERID is
'签到用户的id';
comment on column USERSIGN.CREATEDATE is
'签到日期';

-----事件已办结表
create table completedIssue(
	publicltycass  number(10),
	issueId  number(10),
	topState  number(10),
	delayState  number(10),
	serialNumber  varchar(30),
	subject  varchar(150),
	status  number(10),
	occurDate  date,
	currentOrg  number(10),
	occurOrg  number(10),
	createOrg  number(10),
	targetOrg  number(10),
	dealTime  date,
	sourcePerson  varchar(60),
	sourceKind  number(10),
	sourceMobile  varchar(11),
	urgent  number(10),
	stepId  number(10),
	superviseLevel  number(10),
	lastOrg  number(10),
	createUser  varchar(50),
	dealState  number(10),
	evaluateTime  date,
	evaluateType  number(10),
	evaluateContent  varchar(600),
	hours  varchar(10),
	minute  varchar(10),
	topDate date,
	porgId  number(10),
	torgId  number(10),
	createOrginternalCode  varchar(32),
	crateOrgFunctionalType number(10),
	createOrgLevel number(10),
	moveMark number(1) default 0,
	issueKind    		 NUMBER(10),
	occurLocation        VARCHAR2(150),
	relatePeopleCount    NUMBER(10)
);

-- 创建登录情况的序列
create sequence S_LOGINMANGE
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

--领导视图缓存建表以及序列增量脚本
-- Create table
create table LEADERVIEWCACHE
(
  CACHEKEY       VARCHAR2(90),
  CACHETYPE       NUMBER(4),
  INVALIDATETIME NUMBER(30) not null,
  CACHEVALUE     CLOB,
  CREATEUSER     VARCHAR2(32),
  UPDATEUSER     VARCHAR2(32),
  CREATEDATE     DATE,
  UPDATEDATE     DATE
);
-- Add comments to the table 
comment on table LEADERVIEWCACHE
  is '领导视图缓存文件表';
-- Add comments to the columns 
comment on column LEADERVIEWCACHE.INVALIDATETIME
  is '失效时间';
comment on column LEADERVIEWCACHE.CACHEKEY
  is 'key值';
comment on column LEADERVIEWCACHE.CACHEVALUE
  is '缓存数据';
comment on column LEADERVIEWCACHE.CACHETYPE
  is '缓存类型';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LEADERVIEWCACHE
  add constraint PK_LEADERVIEWCACHE primary key (CACHEKEY);

-- 岗位权限修改日志表
create table ROLEUPDATELOGS
(
  ID             NUMBER(10) not null,
  POSITIONID     NUMBER(10),
  POSITIONNAME   VARCHAR2(60),
  PERMISSIONID   NUMBER(10),
  PERMISSIONNAME VARCHAR2(100),
  OPERATETYPE    NUMBER(1),
  OPERATEDATE    DATE,
  CREATEDATE     DATE,
  CREATEUSER     VARCHAR2(100)
);
 
alter table ROLEUPDATELOGS
  add constraint PK_ROLEUPDATELOG primary key (ID);
  
comment on table ROLEUPDATELOGS
  is '岗位权限修改日志表';
comment on column ROLEUPDATELOGS.POSITIONID
  is '岗位ID';
comment on column ROLEUPDATELOGS.POSITIONNAME
  is '岗位中文名称';
comment on column ROLEUPDATELOGS.PERMISSIONID
  is '权限ID';
comment on column ROLEUPDATELOGS.PERMISSIONNAME
  is '权限中文名称';
comment on column ROLEUPDATELOGS.OPERATETYPE
  is '操作类别 0：删除 1：新增';
comment on column ROLEUPDATELOGS.OPERATEDATE
  is '操作时间';
  
create table allorganizations  (
   id                   NUMBER(10)                      not null,
   parentFunOrgId       NUMBER(10),
   parentId             NUMBER(10),
   orgType              NUMBER(10)                      not null,
   orgLevel             NUMBER(10),
   subCount             NUMBER(10)                     default 0 not null,
   seq                  NUMBER(10)                     default 0 not null,
   maxCode              NUMBER(10)                     default 0 not null,
   subCountFun          NUMBER(10)                     default 0 not null,
   departmentNo         VARCHAR2(32),
   orgName              VARCHAR2(60)                    not null,
   contactWay           VARCHAR2(15),
   orgInternalCode      VARCHAR2(32)                    not null,
   simplePinyin         VARCHAR2(10)                    not null,
   fullpinyin           VARCHAR2(30)                    not null,
   remark               VARCHAR2(600),
   createUser           VARCHAR2(32)                    not null,
   buildingId      		VARCHAR2(30),
   centerX 				NUMBER(10),
   centerY 				NUMBER(10),
   updateUser           VARCHAR2(32),
   updateDate           DATE,
   createDate           DATE                            not null,
   functionalOrgType              NUMBER(10),
   changeType           NUMBER(1)                       default 0 not null,
   changeDate           DATE,
   constraint pkallorganizations primary key (id)
);

comment on column allorganizations.parentFunOrgId is
'所属职能部门';

comment on column allorganizations.orgType is
'部门类型';

comment on column allorganizations.orgLevel is
'组织机构层级';

comment on column allorganizations.subCount is
'子部门数';

comment on column allorganizations.seq is
'序号';

comment on column allorganizations.maxCode is
'分配子部门最大编码';

comment on column allorganizations.subCountFun is
'子职能部门数';

comment on column allorganizations.departmentNo is
'部门编号';

comment on column allorganizations.orgName is
'部门名称';

comment on column allorganizations.contactWay is
'部门联系方式';

comment on column allorganizations.orgInternalCode is
'部门内置类型码';

comment on column allorganizations.simplePinyin is
'部门名称简拼';

comment on column allorganizations.fullpinyin is
'部门名称全拼';

comment on column allorganizations.remark is
'备注';

comment on column allorganizations.createUser is
'创建用户';

comment on column allorganizations.updateUser is
'更新用户名';

comment on column allorganizations.updateDate is
'更新用户';

comment on column allorganizations.createDate is
'创建日期';

comment on column allorganizations.changeType is
'变更类型 0：未变更 1：迁移2：删除';

comment on column allorganizations.changeDate is
'变更日期';



create sequence s_issueJointTemps
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
cache 20;

create table issueJointTemps
(
  id            	varchar2(90) not null,
  issueId        number(10),
  serialnumber          varchar2(30) not null,
  subject               varchar2(150) not null,
  maincharacters    varchar2(60) not null,
  mobile        varchar2(60),
  telephone        varchar2(60),
  occurorg              number(10) not null,
  occurorginternalcode  varchar2(32) not null,
  createorg             number(10) not null,
  createorginternalcode varchar2(32) not null,
  issuekind             number(10),
  issueJointType    number(10),
  issueJointTypeSub    number(10),
  relatepeoplecount     number(10),
  occurlocation         varchar2(150),
  occurdate             date not null,
  hours                 varchar2(5),
  minute                varchar2(5),
  issuecontent          clob,
  importantplace        number(1),
  feedbackTime    date,
  ATTACHFILENAME  varchar2(300),
  State                  number(2),
  createuser            varchar2(32) not null,
  updateuser            varchar2(32),
  createdate            date not null,
  updatedate            date,
  lastDealTime    date,
  STATUS    number(10),
  STATUScode    VARCHAR2(300),
  LASTUSERNAME    varchar2(60),
  LASTORGINTERNALCODE  varchar2(60),
  LASTORG    number(10),
  attachFileName_uuid    VARCHAR2(150),
  data_source    VARCHAR2(32),
  constraint pkissueJointTemps primary key (id)
);
-- add comments to the table 
comment on table issueJointTemps
  is '对接事件临时表';
-- add comments to the columns 
comment on column issueJointTemps.id
  is '事件id';
  comment on column issueJointTemps.issueId
  is '事件issueId';
comment on column issueJointTemps.serialnumber
  is '事件的服务单号';
comment on column issueJointTemps.subject
  is '主题';
comment on column issueJointTemps.maincharacters
  is '主要当事人';
comment on column issueJointTemps.mobile
  is '主要当事人手机';
comment on column issueJointTemps.telephone
  is '主要当事人电话';
comment on column issueJointTemps.occurorg
  is '事件发生网格id';
comment on column issueJointTemps.occurorginternalcode
  is '发生网格内置编码';
comment on column issueJointTemps.createorg
  is '创建网格id';
comment on column issueJointTemps.createorginternalcode
  is '创建网格内置编码';
comment on column issueJointTemps.issuekind
  is '事件性质';
comment on column issueJointTemps.issueJointType
  is '事件类别（大类）';
comment on column issueJointTemps.issueJointTypeSub
  is '事件类别（子类）';
comment on column issueJointTemps.relatepeoplecount
  is '涉及人数';
comment on column issueJointTemps.occurlocation
  is '发生地';  
comment on column issueJointTemps.occurdate
  is '发生时间';
comment on column issueJointTemps.hours
  is '小时';
comment on column issueJointTemps.minute
  is '分钟';
comment on column issueJointTemps.issuecontent
  is '事件简述';  
comment on column issueJointTemps.importantplace
  is '是否重点场所';
comment on column issueJointTemps.ATTACHFILENAME
  is '附件名称'; 
comment on column issueJointTemps.State
  is '数据处理状态（默认0为刚刚进入社管的状态）';
comment on column issueJointTemps.lastDealTime
  is '冗余字段最后处理时间';  
comment on column issueJointTemps.STATUS
  is '状态（事件的状态）冗余';  
comment on column issueJointTemps.LASTUSERNAME
  is '最后操作用户名称（冗余）';  
comment on column issueJointTemps.LASTORGINTERNALCODE
  is '最后操作网格内置编码(冗余)';  
comment on column issueJointTemps.LASTORG
  is '最后操作网格id(冗余)';  
comment on column issueJointTemps.attachFileName_uuid
  is '附件的uuid'; 
comment on column issueJointTemps.STATUScode
  is '开放给事件所在状态';
comment on column issueJointTemps.data_source
  is '数据来源（用于区分是青阳还是攀枝花）';