DROP TABLE `POI_TYPE`;
DROP TABLE `POI_TYPE_TAG`;
CREATE TABLE `POI_TYPE_TAG` (`ID` INTEGER PRIMARY KEY AUTOINCREMENT, `POI_TYPE_ID` BIGINT NOT NULL, `KEY` VARCHAR NOT NULL, `VALUE` VARCHAR, `ORDINAL` INTEGER NOT NULL, `MANDATORY` SMALLINT NOT NULL, `POSSIBLE_VALUES` VARCHAR, `TAG_TYPE` VARCHAR, `SHOW` SMALLINT);