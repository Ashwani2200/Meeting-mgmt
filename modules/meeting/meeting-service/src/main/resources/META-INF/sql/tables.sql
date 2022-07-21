create table meeting_Asset (
	uuid_ VARCHAR(75) null,
	assetId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	assetModel VARCHAR(75) null,
	purchaseDate VARCHAR(75) null,
	serialNo VARCHAR(75) null,
	status BOOLEAN,
	roomAssigned BOOLEAN
);

create table meeting_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	email VARCHAR(75) null,
	phoneNo VARCHAR(75) null,
	city VARCHAR(75) null
);

create table meeting_Meeting (
	uuid_ VARCHAR(75) null,
	meetingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	dateAndTime VARCHAR(75) null,
	location VARCHAR(75) null,
	agenda VARCHAR(75) null,
	description VARCHAR(75) null,
	createdBy VARCHAR(75) null,
	hostedBy VARCHAR(75) null,
	meetingType VARCHAR(75) null,
	meetingLink VARCHAR(75) null,
	meetingRoom VARCHAR(75) null,
	assetsName VARCHAR(75) null,
	internalGuest VARCHAR(75) null,
	externalGuest VARCHAR(75) null
);