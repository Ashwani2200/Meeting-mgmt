create index IX_7C1DCBDF on meeting_Asset (assetModel[$COLUMN_LENGTH:75$]);
create index IX_69642AD1 on meeting_Asset (name[$COLUMN_LENGTH:75$]);
create index IX_BD142C8F on meeting_Asset (roomAssigned);
create index IX_C6A7169B on meeting_Asset (serialNo[$COLUMN_LENGTH:75$]);
create index IX_FB8A5206 on meeting_Asset (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E16BA208 on meeting_Asset (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_44D8F4B4 on meeting_Employee (email[$COLUMN_LENGTH:75$]);
create index IX_D721F957 on meeting_Employee (name[$COLUMN_LENGTH:75$]);
create index IX_B6C7EAA7 on meeting_Employee (phoneNo[$COLUMN_LENGTH:75$]);
create index IX_FD98878C on meeting_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_FE75810E on meeting_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A3CCF312 on meeting_Meeting (createdBy[$COLUMN_LENGTH:75$]);
create index IX_2441204F on meeting_Meeting (hostedBy[$COLUMN_LENGTH:75$]);
create index IX_A4312346 on meeting_Meeting (location[$COLUMN_LENGTH:75$]);
create index IX_1E6F964B on meeting_Meeting (title[$COLUMN_LENGTH:75$]);
create index IX_CCD1D6D1 on meeting_Meeting (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_ABD3DD93 on meeting_Meeting (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_81633773 on meeting_Room (capacity[$COLUMN_LENGTH:75$]);
create index IX_5D7BD7F8 on meeting_Room (floorNo[$COLUMN_LENGTH:75$]);
create index IX_5F106FF5 on meeting_Room (roomNo[$COLUMN_LENGTH:75$]);
create index IX_1228BB39 on meeting_Room (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_62E8BBFB on meeting_Room (uuid_[$COLUMN_LENGTH:75$], groupId);