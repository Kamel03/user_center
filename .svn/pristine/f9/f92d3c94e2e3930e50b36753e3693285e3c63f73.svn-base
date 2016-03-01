
create sequence s_layers
increment by 1
start with 1
maxvalue 9999999999
minvalue 1
cache 20;

create table layers(
	id					number(10)		not null,
	name				varchar2(32),
	orgId		    	NUMBER(10) 		not null,
	orgInternalCode 	varchar2(15) 	not null,
	minX				number(20),
	minY				number(20),
	maxX				number(20),
	maxY				number(20),
	remark				varchar2(400),
	centerX             varchar2(20),
  	centerY             varchar2(20),
  	points              CLOB,
  	zoom				number(2),
  	createUser      	varchar2(20) 	not null,
  	createDate      	date 			not null,
  	updateUser      	varchar2(20),
  	updateDate      	date,
  	constraint pkLayers primary key (id)
);
comment on table layers
  is '划分热区表';
comment on column layers.name
  is '图层名称，对应地图服务名称';
comment on column layers.orgId
  is '所属网格ID';
comment on column layers.orgInternalCode
  is '所属网格CODE';
comment on column layers.minX
  is '边界值，最小X坐标';
comment on column layers.minY
  is '边界值，最小Y坐标';
comment on column layers.maxX
  is '边界值，最大X坐标';
comment on column layers.maxY
  is '边界值，最大Y坐标';
comment on column layers.remark
  is '备注';
comment on column layers.centerX
  is '中心点X坐标'; 
comment on column layers.centerY
  is '中心点Y坐标';
comment on column layers.points
  is '点';
comment on column layers.zoom
  is '缩放级别';
comment on column layers.CREATEUSER
  is '创建用户';
comment on column layers.UPDATEUSER
  is '修改用户';
comment on column layers.CREATEDATE
  is '创建日期';
comment on column layers.UPDATEDATE
  is '修改时间';
  
----创建systemLog15年1月份表的索引
create table systemLogs_2015_1  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_1_loglevel on Systemlogs_2015_1 (loglevel);
create index idx_syslog_2015_1_modulename on Systemlogs_2015_1 (modulename);
create index idx_syslog_2015_1_operatetime on Systemlogs_2015_1 (operatetime);
create index idx_syslog_2015_1_orgcode on Systemlogs_2015_1 (orginternalcode);
create index idx_syslog_2015_1_username on Systemlogs_2015_1 (username);

create table systemLogs_2015_2  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_2_loglevel on Systemlogs_2015_2 (loglevel);
create index idx_syslog_2015_2_modulename on Systemlogs_2015_2 (modulename);
create index idx_syslog_2015_2_operatetime on Systemlogs_2015_2 (operatetime);
create index idx_syslog_2015_2_orgcode on Systemlogs_2015_2 (orginternalcode);
create index idx_syslog_2015_2_username on Systemlogs_2015_2 (username);

create table systemLogs_2015_3  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_3_loglevel on Systemlogs_2015_3 (loglevel);
create index idx_syslog_2015_3_modulename on Systemlogs_2015_3 (modulename);
create index idx_syslog_2015_3_operatetime on Systemlogs_2015_3 (operatetime);
create index idx_syslog_2015_3_orgcode on Systemlogs_2015_3 (orginternalcode);
create index idx_syslog_2015_3_username on Systemlogs_2015_3 (username);

create table systemLogs_2015_4  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_4_loglevel on Systemlogs_2015_4 (loglevel);
create index idx_syslog_2015_4_modulename on Systemlogs_2015_4 (modulename);
create index idx_syslog_2015_4_operatetime on Systemlogs_2015_4 (operatetime);
create index idx_syslog_2015_4_orgcode on Systemlogs_2015_4 (orginternalcode);
create index idx_syslog_2015_4_username on Systemlogs_2015_4 (username);

create table systemLogs_2015_5  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_5_loglevel on Systemlogs_2015_5 (loglevel);
create index idx_syslog_2015_5_modulename on Systemlogs_2015_5 (modulename);
create index idx_syslog_2015_5_operatetime on Systemlogs_2015_5 (operatetime);
create index idx_syslog_2015_5_orgcode on Systemlogs_2015_5 (orginternalcode);
create index idx_syslog_2015_5_username on Systemlogs_2015_5 (username);

create table systemLogs_2015_6  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_6_loglevel on Systemlogs_2015_6 (loglevel);
create index idx_syslog_2015_6_modulename on Systemlogs_2015_6 (modulename);
create index idx_syslog_2015_6_operatetime on Systemlogs_2015_6 (operatetime);
create index idx_syslog_2015_6_orgcode on Systemlogs_2015_6 (orginternalcode);
create index idx_syslog_2015_6_username on Systemlogs_2015_6 (username);

create table systemLogs_2015_7  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_7_loglevel on Systemlogs_2015_7 (loglevel);
create index idx_syslog_2015_7_modulename on Systemlogs_2015_7 (modulename);
create index idx_syslog_2015_7_operatetime on Systemlogs_2015_7 (operatetime);
create index idx_syslog_2015_7_orgcode on Systemlogs_2015_7 (orginternalcode);
create index idx_syslog_2015_7_username on Systemlogs_2015_7 (username);

create table systemLogs_2015_8  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_8_loglevel on Systemlogs_2015_8 (loglevel);
create index idx_syslog_2015_8_modulename on Systemlogs_2015_8 (modulename);
create index idx_syslog_2015_8_operatetime on Systemlogs_2015_8 (operatetime);
create index idx_syslog_2015_8_orgcode on Systemlogs_2015_8 (orginternalcode);
create index idx_syslog_2015_8_username on Systemlogs_2015_8 (username);

create table systemLogs_2015_9  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_9_loglevel on Systemlogs_2015_9 (loglevel);
create index idx_syslog_2015_9_modulename on Systemlogs_2015_9 (modulename);
create index idx_syslog_2015_9_operatetime on Systemlogs_2015_9 (operatetime);
create index idx_syslog_2015_9_orgcode on Systemlogs_2015_9 (orginternalcode);
create index idx_syslog_2015_9_username on Systemlogs_2015_9 (username);

create table systemLogs_2015_10  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_10_loglevel on Systemlogs_2015_10 (loglevel);
create index idx_syslog_2015_10_modulename on Systemlogs_2015_10 (modulename);
create index idx_syslog_2015_10_operatetime on Systemlogs_2015_10 (operatetime);
create index idx_syslog_2015_10_orgcode on Systemlogs_2015_10 (orginternalcode);
create index idx_syslog_2015_10_username on Systemlogs_2015_10 (username);

create table systemLogs_2015_11  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_11_loglevel on Systemlogs_2015_11 (loglevel);
create index idx_syslog_2015_11_modulename on Systemlogs_2015_11 (modulename);
create index idx_syslog_2015_11_operatetime on Systemlogs_2015_11 (operatetime);
create index idx_syslog_2015_11_orgcode on Systemlogs_2015_11 (orginternalcode);
create index idx_syslog_2015_11_username on Systemlogs_2015_11 (username);

create table systemLogs_2015_12  (
   id                   NUMBER(10)                      not null primary key,
   orgId                NUMBER(10),
   operationContent     clob,
   logLevel             NUMBER(10),
   operation            VARCHAR2(500),
   moduleName           VARCHAR2(200),
   username VARCHAR2(60),
   clientIp             VARCHAR2(32),
   orgInternalCode      VARCHAR2(32),
   operateTime          DATE                            not null,
   operationType     NUMBER(10),
   beforekey       varchar2(150),
   afterkey       varchar2(150),
   beforename       varchar2(150),
   aftername       varchar2(150)
);

create index idx_syslog_2015_12_loglevel on Systemlogs_2015_12 (loglevel);
create index idx_syslog_2015_12_modulename on Systemlogs_2015_12 (modulename);
create index idx_syslog_2015_12_operatetime on Systemlogs_2015_12 (operatetime);
create index idx_syslog_2015_12_orgcode on Systemlogs_2015_12 (orginternalcode);
create index idx_syslog_2015_12_username on Systemlogs_2015_12 (username);
