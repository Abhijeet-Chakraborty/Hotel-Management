package com.abs.hotel_management.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@Builder
public class Room {
    private final Integer roomId;
    @NonNull
    private final Short roomNumber;
    @NonNull
    private final RoomType roomType;
    @NonNull
    private final RoomStatus roomStatus;
    private final String roomDescription;

    @NonNull
    private final Short capacity;
    @NonNull
    private final Short floorNumber;
    private final String roomSize;
    @NonNull
    private final Double basePrice;
    private final Byte discount;
    @NonNull
    private final LocalDateTime availability;
    private final String amenities;
    @NonNull
    private final HouseKeepingStatus houseKeepingStatus;
    private final String imageUrl;
    private final LocalDateTime createdDate;
    private final LocalDateTime updatedDate;
    private final String createdBy;
    private final String updatedBy;
}
