package com.viktor.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReviewResponse {

    @SerializedName("docs")
    private List<Review> reviews;

    public ReviewResponse(List<Review> reviewList) {
        this.reviews = reviewList;
    }

    public List<Review> getReviewList() {
        return reviews;
    }

    @Override
    public String toString() {
        return "ReviewResponse{" +
                "reviewList=" + reviews +
                '}';
    }
}
