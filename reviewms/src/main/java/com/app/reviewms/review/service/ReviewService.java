package com.app.reviewms.review.service;

import com.app.reviewms.review.entity.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    Boolean addReview(Long companyId,Review review);

    Review getReview(Long reviewId);

    Boolean updateReview(Long reviewId,Review review);


    Boolean deleteReview( Long reviewID);
}
