package com.spring.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.booking.entity.Reviews;
import com.spring.booking.entity.identity.ReviewsIdentity;
import com.spring.booking.hold_data.IStar;
import com.spring.booking.system.common.query.reviews.ReviewsQuery;

/**
 * ReviewsRepository
 */
public interface ReviewsRepository extends JpaRepository<Reviews, ReviewsIdentity> {

    /**
     * Get all Star of Hotels identity
     *
     * @return List of start by hotel identity
     */
    @Query(value = ReviewsQuery.GET_STAR,nativeQuery = true)
    List<IStar> getAllStar();
}
