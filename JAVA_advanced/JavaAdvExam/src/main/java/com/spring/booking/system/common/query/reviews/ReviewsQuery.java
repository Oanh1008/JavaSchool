package com.spring.booking.system.common.query.reviews;

public class ReviewsQuery {

    private ReviewsQuery() {
    }

    public static final String GET_STAR =
            "SELECT h.id,temp.star\n" +
            "FROM HOTELS as h\n" +
            "JOIN (\n" +
            "\t\tSELECT r.hotel_id AS hotelId, AVG(r.rate) AS star, count(r.user_id) as numReviews\n" +
            "\t\tFROM REVIEWS AS r\n" +
            "\t\tGROUP BY r.hotel_id\n" +
            "\t\tORDER BY star DESC, numReviews DESC) as temp\n" +
            "WHERE id = temp.hotelId\n";
}
