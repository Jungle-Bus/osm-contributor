ALTER TABLE POI ADD COLUMN OLD SMALLINT;
ALTER TABLE POI ADD COLUMN OLD_POI_ID BIGINT;
ALTER TABLE POI_NODE_REF RENAME to POI_NODE_REF2;
CREATE TABLE POI_NODE_REF (ID INTEGER PRIMARY KEY AUTOINCREMENT , LONGITUDE DOUBLE PRECISION NOT NULL , OLD SMALLINT, OLD_POI_ID BIGINT, LATITUDE DOUBLE PRECISION NOT NULL , NODE_BACKEND_ID VARCHAR NOT NULL , ORDINAL INTEGER NOT NULL , POI_ID BIGINT, UPDATED SMALLINT NOT NULL );
INSERT INTO POI_NODE_REF(ID, LONGITUDE, LATITUDE, NODE_BACKEND_ID, ORDINAL, POI_ID, UPDATED) SELECT ID, LONGITUDE, LATITUDE, NODE_BACKEND_ID, ORDINAL, POI_ID, UPDATED FROM POI_NODE_REF2
DROP TABLE POI_NODE_REF2;
