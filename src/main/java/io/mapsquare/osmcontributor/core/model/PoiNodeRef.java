/**
 * Copyright (C) 2015 eBusiness Information
 *
 * This file is part of OSM Contributor.
 *
 * OSM Contributor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OSM Contributor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OSM Contributor.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.mapsquare.osmcontributor.core.model;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = PoiNodeRef.TABLE_NAME)
public class PoiNodeRef {
    public static final String TABLE_NAME = "POI_NODE_REF";
    public static final String ID = "ID";
    public static final String NODE_BACKEND_ID = "NODE_BACKEND_ID";
    public static final String ORDINAL = "ORDINAL";
    public static final String POI_ID = "POI_ID";
    public static final String LONGITUDE = "LONGITUDE";
    public static final String LATITUDE = "LATITUDE";
    public static final String UPDATED = "UPDATED";

    @DatabaseField(columnName = ID, generatedId = true, canBeNull = false)
    private Long id;

    @DatabaseField(columnName = LONGITUDE, canBeNull = false)
    private Double longitude;

    @DatabaseField(columnName = LATITUDE, canBeNull = false)
    private Double latitude;

    @DatabaseField(columnName = NODE_BACKEND_ID, canBeNull = false)
    private String nodeBackendId;

    @DatabaseField(columnName = ORDINAL, canBeNull = false)
    private Integer ordinal;

    @DatabaseField(columnName = POI_ID, foreign = true, canBeNull = false)
    private Poi poi;

    @DatabaseField(columnName = UPDATED, canBeNull = false)
    private Boolean updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeBackendId() {
        return nodeBackendId;
    }

    public void setNodeBackendId(String nodeBackendId) {
        this.nodeBackendId = nodeBackendId;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public Poi getPoi() {
        return poi;
    }

    public void setPoi(Poi poi) {
        this.poi = poi;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Boolean getUpdated() {
        return updated;
    }

    public void setUpdated(Boolean updated) {
        this.updated = updated;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PoiNodeRef that = (PoiNodeRef) o;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "PoiNodeRef{" +
                "id=" + id +
                ", nodeBackendId='" + nodeBackendId + '\'' +
                ", ordinal=" + ordinal +
                ", poi=" + (poi == null ? null : poi.getId()) +
                '}';
    }
}
